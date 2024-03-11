package o;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheEvictor;
import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.datasource.cache.ContentMetadata;
import androidx.media3.datasource.cache.ContentMetadataMutations;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.datasource.cache.NoOpCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import o.C4632biF;

/* renamed from: o.biy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4677biy implements Cache {
    private static final Map<String, C4677biy> e = new HashMap();
    private File a;
    private Cache b;
    private final C4671bis c;
    private final int d;
    private final String f;
    private final Handler g;
    private final int i;
    private final Looper m;
    private final ConditionVariable j = new ConditionVariable();
    private final AtomicInteger h = new AtomicInteger();

    public int b() {
        return this.d;
    }

    public int d() {
        return this.i;
    }

    public String e() {
        return this.f;
    }

    public Looper f() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C4677biy a(Context context, String str, int i, int i2, C4671bis c4671bis) {
        C4677biy c4677biy;
        synchronized (C4677biy.class) {
            Map<String, C4677biy> map = e;
            if (!map.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread("cache" + str, 0);
                handlerThread.start();
                map.put(str, new C4677biy(context, handlerThread.getLooper(), str, i, str, new LeastRecentlyUsedCacheEvictor((long) i2), i2, c4671bis));
            }
            c4677biy = map.get(str);
        }
        return c4677biy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C4677biy c(Context context, Looper looper, int i) {
        CacheEvictor leastRecentlyUsedCacheEvictor = i > 0 ? new LeastRecentlyUsedCacheEvictor(i) : new NoOpCacheEvictor();
        return new C4677biy(context, looper, "session", 524288, "session/" + UUID.randomUUID().toString(), leastRecentlyUsedCacheEvictor, i, null);
    }

    public static void b(Context context) {
        C8106deC.e(new File(context.getCacheDir(), "session/"));
    }

    private C4677biy(Context context, Looper looper, String str, int i, String str2, final CacheEvictor cacheEvictor, int i2, C4671bis c4671bis) {
        this.f = str;
        this.d = i;
        this.i = i2;
        this.m = looper;
        Handler handler = new Handler(looper);
        this.g = handler;
        this.c = c4671bis;
        this.a = new File(context.getCacheDir(), str2);
        Runnable runnable = new Runnable() { // from class: o.biD
            @Override // java.lang.Runnable
            public final void run() {
                C4677biy.this.a(cacheEvictor);
            }
        };
        if (looper == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CacheEvictor cacheEvictor) {
        this.b = new SimpleCache(this.a, new c(cacheEvictor));
        this.j.open();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public NavigableSet<CacheSpan> getCachedSpans(String str) {
        this.j.block();
        return this.b.getCachedSpans(str);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public Set<String> getKeys() {
        this.j.block();
        return this.b.getKeys();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public long getCacheSpace() {
        this.j.block();
        return this.b.getCacheSpace();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public CacheSpan startReadWrite(String str, long j, long j2) {
        this.j.block();
        return this.b.startReadWrite(str, j, j2);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public CacheSpan startReadWriteNonBlocking(String str, long j, long j2) {
        this.j.block();
        return this.b.startReadWriteNonBlocking(str, j, j2);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public File startFile(String str, long j, long j2) {
        this.j.block();
        return this.b.startFile(str, j, j2);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void commitFile(File file, long j) {
        this.j.block();
        this.b.commitFile(file, j);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void releaseHoleSpan(CacheSpan cacheSpan) {
        this.j.block();
        this.b.releaseHoleSpan(cacheSpan);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void removeSpan(CacheSpan cacheSpan) {
        this.j.block();
        this.b.removeSpan(cacheSpan);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) {
        this.j.block();
        this.b.applyContentMetadataMutations(str, contentMetadataMutations);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public ContentMetadata getContentMetadata(String str) {
        this.j.block();
        return this.b.getContentMetadata(str);
    }

    public List<String> b(List<String> list) {
        this.j.block();
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.getKeys()) {
            Iterator<String> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C4632biF.d(str, it.next())) {
                        arrayList.add(str);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return arrayList;
    }

    public List<String> c(long j) {
        C4632biF.c a;
        this.j.block();
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.getKeys()) {
            if (C4632biF.e(str, j) && (a = C4632biF.a(str)) != null) {
                arrayList.add(a.b);
            }
        }
        return arrayList;
    }

    public void a() {
        this.j.block();
        C8106deC.e(this.a);
    }

    public int c() {
        return this.h.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.biy$c */
    /* loaded from: classes3.dex */
    public class c implements CacheEvictor {
        private CacheEvictor a;

        @Override // androidx.media3.datasource.cache.CacheEvictor
        public boolean requiresCacheSpanTouches() {
            return false;
        }

        public c(CacheEvictor cacheEvictor) {
            this.a = cacheEvictor;
        }

        @Override // androidx.media3.datasource.cache.CacheEvictor
        public void onCacheInitialized() {
            this.a.onCacheInitialized();
        }

        @Override // androidx.media3.datasource.cache.CacheEvictor
        public void onStartFile(Cache cache, String str, long j, long j2) {
            this.a.onStartFile(cache, str, j, j2);
            a();
        }

        @Override // androidx.media3.datasource.cache.Cache.Listener
        public void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
            this.a.onSpanAdded(cache, cacheSpan);
            a();
        }

        @Override // androidx.media3.datasource.cache.Cache.Listener
        public void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
            if (cacheSpan != null && cacheSpan.length > 0 && C4677biy.this.c != null) {
                C4677biy.this.c.b(cacheSpan.length);
            }
            this.a.onSpanRemoved(cache, cacheSpan);
            a();
        }

        @Override // androidx.media3.datasource.cache.Cache.Listener
        public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
            this.a.onSpanTouched(cache, cacheSpan, cacheSpan2);
        }

        private void a() {
            C4677biy.this.h.incrementAndGet();
        }
    }
}
