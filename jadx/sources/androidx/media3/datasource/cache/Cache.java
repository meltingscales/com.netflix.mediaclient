package androidx.media3.datasource.cache;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: classes2.dex */
public interface Cache {

    /* loaded from: classes2.dex */
    public interface Listener {
        void onSpanAdded(Cache cache, CacheSpan cacheSpan);

        void onSpanRemoved(Cache cache, CacheSpan cacheSpan);

        void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2);
    }

    void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations);

    void commitFile(File file, long j);

    long getCacheSpace();

    NavigableSet<CacheSpan> getCachedSpans(String str);

    ContentMetadata getContentMetadata(String str);

    Set<String> getKeys();

    void releaseHoleSpan(CacheSpan cacheSpan);

    void removeSpan(CacheSpan cacheSpan);

    File startFile(String str, long j, long j2);

    CacheSpan startReadWrite(String str, long j, long j2);

    CacheSpan startReadWriteNonBlocking(String str, long j, long j2);

    /* loaded from: classes2.dex */
    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th) {
            super(th);
        }

        public CacheException(String str, Throwable th) {
            super(str, th);
        }
    }
}
