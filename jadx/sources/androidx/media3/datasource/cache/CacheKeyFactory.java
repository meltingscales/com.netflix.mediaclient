package androidx.media3.datasource.cache;

import androidx.media3.datasource.DataSpec;

/* loaded from: classes2.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new CacheKeyFactory() { // from class: androidx.media3.datasource.cache.CacheKeyFactory$$ExternalSyntheticLambda0
        @Override // androidx.media3.datasource.cache.CacheKeyFactory
        public final String buildCacheKey(DataSpec dataSpec) {
            String lambda$static$0;
            lambda$static$0 = CacheKeyFactory.lambda$static$0(dataSpec);
            return lambda$static$0;
        }
    };

    String buildCacheKey(DataSpec dataSpec);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }
}
