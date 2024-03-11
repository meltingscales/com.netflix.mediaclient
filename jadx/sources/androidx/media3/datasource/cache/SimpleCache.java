package androidx.media3.datasource.cache;

import android.os.ConditionVariable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.database.DatabaseProvider;
import androidx.media3.datasource.cache.Cache;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class SimpleCache implements Cache {
    private static final HashSet<File> lockedCacheDirs = new HashSet<>();
    private final File cacheDir;
    private final CachedContentIndex contentIndex;
    private final CacheEvictor evictor;
    private final CacheFileMetadataIndex fileIndex;
    private Cache.CacheException initializationException;
    private final HashMap<String, ArrayList<Cache.Listener>> listeners;
    private final Random random;
    private boolean released;
    private long totalSpace;
    private final boolean touchCacheSpans;
    private long uid;

    @Deprecated
    public SimpleCache(File file, CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, null, null, false, true);
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, DatabaseProvider databaseProvider, byte[] bArr, boolean z, boolean z2) {
        this(file, cacheEvictor, new CachedContentIndex(databaseProvider, file, bArr, z, z2), (databaseProvider == null || z2) ? null : new CacheFileMetadataIndex(databaseProvider));
    }

    SimpleCache(File file, CacheEvictor cacheEvictor, CachedContentIndex cachedContentIndex, CacheFileMetadataIndex cacheFileMetadataIndex) {
        if (!lockFolder(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.cacheDir = file;
        this.evictor = cacheEvictor;
        this.contentIndex = cachedContentIndex;
        this.fileIndex = cacheFileMetadataIndex;
        this.listeners = new HashMap<>();
        this.random = new Random();
        this.touchCacheSpans = cacheEvictor.requiresCacheSpanTouches();
        this.uid = -1L;
        final ConditionVariable conditionVariable = new ConditionVariable();
        new Thread("ExoPlayer:SimpleCacheInit") { // from class: androidx.media3.datasource.cache.SimpleCache.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                synchronized (SimpleCache.this) {
                    conditionVariable.open();
                    SimpleCache.this.initialize();
                    SimpleCache.this.evictor.onCacheInitialized();
                }
            }
        }.start();
        conditionVariable.block();
    }

    public void checkInitialization() {
        synchronized (this) {
            Cache.CacheException cacheException = this.initializationException;
            if (cacheException != null) {
                throw cacheException;
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public NavigableSet<CacheSpan> getCachedSpans(String str) {
        TreeSet treeSet;
        synchronized (this) {
            Assertions.checkState(!this.released);
            CachedContent cachedContent = this.contentIndex.get(str);
            if (cachedContent != null && !cachedContent.isEmpty()) {
                treeSet = new TreeSet((Collection) cachedContent.getSpans());
            }
            treeSet = new TreeSet();
        }
        return treeSet;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public Set<String> getKeys() {
        HashSet hashSet;
        synchronized (this) {
            Assertions.checkState(!this.released);
            hashSet = new HashSet(this.contentIndex.getKeys());
        }
        return hashSet;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public long getCacheSpace() {
        long j;
        synchronized (this) {
            Assertions.checkState(!this.released);
            j = this.totalSpace;
        }
        return j;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public CacheSpan startReadWrite(String str, long j, long j2) {
        CacheSpan startReadWriteNonBlocking;
        synchronized (this) {
            Assertions.checkState(!this.released);
            checkInitialization();
            while (true) {
                startReadWriteNonBlocking = startReadWriteNonBlocking(str, j, j2);
                if (startReadWriteNonBlocking == null) {
                    wait();
                }
            }
        }
        return startReadWriteNonBlocking;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public CacheSpan startReadWriteNonBlocking(String str, long j, long j2) {
        synchronized (this) {
            Assertions.checkState(!this.released);
            checkInitialization();
            SimpleCacheSpan span = getSpan(str, j, j2);
            if (span.isCached) {
                return touchSpan(str, span);
            } else if (this.contentIndex.getOrAdd(str).lockRange(j, span.length)) {
                return span;
            } else {
                return null;
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public File startFile(String str, long j, long j2) {
        File cacheFile;
        synchronized (this) {
            Assertions.checkState(!this.released);
            checkInitialization();
            CachedContent cachedContent = this.contentIndex.get(str);
            Assertions.checkNotNull(cachedContent);
            Assertions.checkState(cachedContent.isFullyLocked(j, j2));
            if (!this.cacheDir.exists()) {
                createCacheDirectories(this.cacheDir);
                removeStaleSpans();
            }
            this.evictor.onStartFile(this, str, j, j2);
            File file = new File(this.cacheDir, Integer.toString(this.random.nextInt(10)));
            if (!file.exists()) {
                createCacheDirectories(file);
            }
            cacheFile = SimpleCacheSpan.getCacheFile(file, cachedContent.id, j, System.currentTimeMillis());
        }
        return cacheFile;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void commitFile(File file, long j) {
        synchronized (this) {
            boolean z = true;
            Assertions.checkState(!this.released);
            if (file.exists()) {
                if (j == 0) {
                    file.delete();
                    return;
                }
                SimpleCacheSpan simpleCacheSpan = (SimpleCacheSpan) Assertions.checkNotNull(SimpleCacheSpan.createCacheEntry(file, j, this.contentIndex));
                CachedContent cachedContent = (CachedContent) Assertions.checkNotNull(this.contentIndex.get(simpleCacheSpan.key));
                Assertions.checkState(cachedContent.isFullyLocked(simpleCacheSpan.position, simpleCacheSpan.length));
                long contentLength = ContentMetadata.getContentLength(cachedContent.getMetadata());
                if (contentLength != -1) {
                    if (simpleCacheSpan.position + simpleCacheSpan.length > contentLength) {
                        z = false;
                    }
                    Assertions.checkState(z);
                }
                if (this.fileIndex != null) {
                    try {
                        this.fileIndex.set(file.getName(), simpleCacheSpan.length, simpleCacheSpan.lastTouchTimestamp);
                    } catch (IOException e) {
                        throw new Cache.CacheException(e);
                    }
                }
                addSpan(simpleCacheSpan);
                try {
                    this.contentIndex.store();
                    notifyAll();
                } catch (IOException e2) {
                    throw new Cache.CacheException(e2);
                }
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void releaseHoleSpan(CacheSpan cacheSpan) {
        synchronized (this) {
            Assertions.checkState(!this.released);
            CachedContent cachedContent = (CachedContent) Assertions.checkNotNull(this.contentIndex.get(cacheSpan.key));
            cachedContent.unlockRange(cacheSpan.position);
            this.contentIndex.maybeRemove(cachedContent.key);
            notifyAll();
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void removeSpan(CacheSpan cacheSpan) {
        synchronized (this) {
            Assertions.checkState(!this.released);
            removeSpanInternal(cacheSpan);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) {
        synchronized (this) {
            Assertions.checkState(!this.released);
            checkInitialization();
            this.contentIndex.applyContentMetadataMutations(str, contentMetadataMutations);
            try {
                this.contentIndex.store();
            } catch (IOException e) {
                throw new Cache.CacheException(e);
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public ContentMetadata getContentMetadata(String str) {
        ContentMetadata contentMetadata;
        synchronized (this) {
            Assertions.checkState(!this.released);
            contentMetadata = this.contentIndex.getContentMetadata(str);
        }
        return contentMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize() {
        if (!this.cacheDir.exists()) {
            try {
                createCacheDirectories(this.cacheDir);
            } catch (Cache.CacheException e) {
                this.initializationException = e;
                return;
            }
        }
        File[] listFiles = this.cacheDir.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.cacheDir;
            Log.e("SimpleCache", str);
            this.initializationException = new Cache.CacheException(str);
            return;
        }
        long loadUid = loadUid(listFiles);
        this.uid = loadUid;
        if (loadUid == -1) {
            try {
                this.uid = createUid(this.cacheDir);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.cacheDir;
                Log.e("SimpleCache", str2, e2);
                this.initializationException = new Cache.CacheException(str2, e2);
                return;
            }
        }
        try {
            this.contentIndex.initialize(this.uid);
            CacheFileMetadataIndex cacheFileMetadataIndex = this.fileIndex;
            if (cacheFileMetadataIndex != null) {
                cacheFileMetadataIndex.initialize(this.uid);
                Map<String, CacheFileMetadata> all = this.fileIndex.getAll();
                loadDirectory(this.cacheDir, true, listFiles, all);
                this.fileIndex.removeAll(all.keySet());
            } else {
                loadDirectory(this.cacheDir, true, listFiles, null);
            }
            this.contentIndex.removeEmpty();
            try {
                this.contentIndex.store();
            } catch (IOException e3) {
                Log.e("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + this.cacheDir;
            Log.e("SimpleCache", str3, e4);
            this.initializationException = new Cache.CacheException(str3, e4);
        }
    }

    private void loadDirectory(File file, boolean z, File[] fileArr, Map<String, CacheFileMetadata> map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                loadDirectory(file2, false, file2.listFiles(), map);
            } else if (!z || (!CachedContentIndex.isIndexFile(name) && !name.endsWith(".uid"))) {
                CacheFileMetadata remove = map != null ? map.remove(name) : null;
                if (remove != null) {
                    j = remove.length;
                    j2 = remove.lastTouchTimestamp;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                SimpleCacheSpan createCacheEntry = SimpleCacheSpan.createCacheEntry(file2, j, j2, this.contentIndex);
                if (createCacheEntry != null) {
                    addSpan(createCacheEntry);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private SimpleCacheSpan touchSpan(String str, SimpleCacheSpan simpleCacheSpan) {
        boolean z;
        if (this.touchCacheSpans) {
            String name = ((File) Assertions.checkNotNull(simpleCacheSpan.file)).getName();
            long j = simpleCacheSpan.length;
            long currentTimeMillis = System.currentTimeMillis();
            CacheFileMetadataIndex cacheFileMetadataIndex = this.fileIndex;
            if (cacheFileMetadataIndex != null) {
                try {
                    cacheFileMetadataIndex.set(name, j, currentTimeMillis);
                } catch (IOException unused) {
                    Log.w("SimpleCache", "Failed to update index with new touch timestamp.");
                }
                z = false;
            } else {
                z = true;
            }
            SimpleCacheSpan lastTouchTimestamp = ((CachedContent) Assertions.checkNotNull(this.contentIndex.get(str))).setLastTouchTimestamp(simpleCacheSpan, currentTimeMillis, z);
            notifySpanTouched(simpleCacheSpan, lastTouchTimestamp);
            return lastTouchTimestamp;
        }
        return simpleCacheSpan;
    }

    private SimpleCacheSpan getSpan(String str, long j, long j2) {
        SimpleCacheSpan span;
        CachedContent cachedContent = this.contentIndex.get(str);
        if (cachedContent == null) {
            return SimpleCacheSpan.createHole(str, j, j2);
        }
        while (true) {
            span = cachedContent.getSpan(j, j2);
            if (!span.isCached || ((File) Assertions.checkNotNull(span.file)).length() == span.length) {
                break;
            }
            removeStaleSpans();
        }
        return span;
    }

    private void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.contentIndex.getOrAdd(simpleCacheSpan.key).addSpan(simpleCacheSpan);
        this.totalSpace += simpleCacheSpan.length;
        notifySpanAdded(simpleCacheSpan);
    }

    private void removeSpanInternal(CacheSpan cacheSpan) {
        CachedContent cachedContent = this.contentIndex.get(cacheSpan.key);
        if (cachedContent == null || !cachedContent.removeSpan(cacheSpan)) {
            return;
        }
        this.totalSpace -= cacheSpan.length;
        if (this.fileIndex != null) {
            String name = ((File) Assertions.checkNotNull(cacheSpan.file)).getName();
            try {
                this.fileIndex.remove(name);
            } catch (IOException unused) {
                Log.w("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.contentIndex.maybeRemove(cachedContent.key);
        notifySpanRemoved(cacheSpan);
    }

    private void removeStaleSpans() {
        ArrayList arrayList = new ArrayList();
        for (CachedContent cachedContent : this.contentIndex.getAll()) {
            Iterator<SimpleCacheSpan> it = cachedContent.getSpans().iterator();
            while (it.hasNext()) {
                SimpleCacheSpan next = it.next();
                if (((File) Assertions.checkNotNull(next.file)).length() != next.length) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            removeSpanInternal((CacheSpan) arrayList.get(i));
        }
    }

    private void notifySpanRemoved(CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(cacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanRemoved(this, cacheSpan);
            }
        }
        this.evictor.onSpanRemoved(this, cacheSpan);
    }

    private void notifySpanAdded(SimpleCacheSpan simpleCacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanAdded(this, simpleCacheSpan);
            }
        }
        this.evictor.onSpanAdded(this, simpleCacheSpan);
    }

    private void notifySpanTouched(SimpleCacheSpan simpleCacheSpan, CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanTouched(this, simpleCacheSpan, cacheSpan);
            }
        }
        this.evictor.onSpanTouched(this, simpleCacheSpan, cacheSpan);
    }

    private static long loadUid(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return parseUid(name);
                } catch (NumberFormatException unused) {
                    Log.e("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static long createUid(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        String l = Long.toString(abs, 16);
        File file2 = new File(file, l + ".uid");
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private static long parseUid(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private static void createCacheDirectories(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        Log.e("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    private static boolean lockFolder(File file) {
        boolean add;
        synchronized (SimpleCache.class) {
            add = lockedCacheDirs.add(file.getAbsoluteFile());
        }
        return add;
    }
}
