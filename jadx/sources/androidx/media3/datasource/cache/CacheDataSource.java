package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSink;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.PlaceholderDataSource;
import androidx.media3.datasource.PriorityDataSource;
import androidx.media3.datasource.TeeDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.datasource.cache.Cache;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class CacheDataSource implements DataSource {
    private Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final Cache cache;
    private final CacheKeyFactory cacheKeyFactory;
    private final DataSource cacheReadDataSource;
    private final DataSource cacheWriteDataSource;
    private long checkCachePosition;
    private DataSource currentDataSource;
    private long currentDataSourceBytesRead;
    private DataSpec currentDataSpec;
    private CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;
    private final EventListener eventListener;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    private long readPosition;
    private DataSpec requestDataSpec;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final DataSource upstreamDataSource;

    /* loaded from: classes2.dex */
    public interface EventListener {
        void onCacheIgnored(int i);

        void onCachedBytesRead(long j, long j2);
    }

    private boolean isBypassingCache() {
        return this.currentDataSource == this.upstreamDataSource;
    }

    private boolean isReadingFromCache() {
        return this.currentDataSource == this.cacheReadDataSource;
    }

    private boolean isWritingToCache() {
        return this.currentDataSource == this.cacheWriteDataSource;
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.actualUri;
    }

    public CacheDataSource(Cache cache, DataSource dataSource) {
        this(cache, dataSource, 0);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, int i) {
        this(cache, dataSource, new FileDataSource(), new CacheDataSink(cache, 5242880L), i, null);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i, EventListener eventListener) {
        this(cache, dataSource, dataSource2, dataSink, i, eventListener, null);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i, EventListener eventListener, CacheKeyFactory cacheKeyFactory) {
        this(cache, dataSource, dataSource2, dataSink, cacheKeyFactory, i, null, 0, eventListener);
    }

    private CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, CacheKeyFactory cacheKeyFactory, int i, PriorityTaskManager priorityTaskManager, int i2, EventListener eventListener) {
        this.cache = cache;
        this.cacheReadDataSource = dataSource2;
        this.cacheKeyFactory = cacheKeyFactory == null ? CacheKeyFactory.DEFAULT : cacheKeyFactory;
        this.blockOnCache = (i & 1) != 0;
        this.ignoreCacheOnError = (i & 2) != 0;
        this.ignoreCacheForUnsetLengthRequests = (i & 4) != 0;
        if (dataSource != null) {
            dataSource = priorityTaskManager != null ? new PriorityDataSource(dataSource, priorityTaskManager, i2) : dataSource;
            this.upstreamDataSource = dataSource;
            this.cacheWriteDataSource = dataSink != null ? new TeeDataSource(dataSource, dataSink) : null;
        } else {
            this.upstreamDataSource = PlaceholderDataSource.INSTANCE;
            this.cacheWriteDataSource = null;
        }
        this.eventListener = eventListener;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.cacheReadDataSource.addTransferListener(transferListener);
        this.upstreamDataSource.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        try {
            String buildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
            DataSpec build = dataSpec.buildUpon().setKey(buildCacheKey).build();
            this.requestDataSpec = build;
            this.actualUri = getRedirectedUriOrDefault(this.cache, buildCacheKey, build.uri);
            this.readPosition = dataSpec.position;
            int shouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(dataSpec);
            boolean z = shouldIgnoreCacheForRequest != -1;
            this.currentRequestIgnoresCache = z;
            if (z) {
                notifyCacheIgnored(shouldIgnoreCacheForRequest);
            }
            if (this.currentRequestIgnoresCache) {
                this.bytesRemaining = -1L;
            } else {
                long contentLength = ContentMetadata.getContentLength(this.cache.getContentMetadata(buildCacheKey));
                this.bytesRemaining = contentLength;
                if (contentLength != -1) {
                    long j = contentLength - dataSpec.position;
                    this.bytesRemaining = j;
                    if (j < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long j2 = dataSpec.length;
            if (j2 != -1) {
                long j3 = this.bytesRemaining;
                if (j3 != -1) {
                    j2 = Math.min(j3, j2);
                }
                this.bytesRemaining = j2;
            }
            long j4 = this.bytesRemaining;
            if (j4 > 0 || j4 == -1) {
                openNextSource(build, false);
            }
            long j5 = dataSpec.length;
            return j5 != -1 ? j5 : this.bytesRemaining;
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        DataSpec dataSpec = (DataSpec) Assertions.checkNotNull(this.requestDataSpec);
        DataSpec dataSpec2 = (DataSpec) Assertions.checkNotNull(this.currentDataSpec);
        try {
            if (this.readPosition >= this.checkCachePosition) {
                openNextSource(dataSpec, true);
            }
            int read = ((DataSource) Assertions.checkNotNull(this.currentDataSource)).read(bArr, i, i2);
            if (read != -1) {
                if (isReadingFromCache()) {
                    this.totalCachedBytesRead += read;
                }
                long j = read;
                this.readPosition += j;
                this.currentDataSourceBytesRead += j;
                long j2 = this.bytesRemaining;
                if (j2 != -1) {
                    this.bytesRemaining = j2 - j;
                }
            } else {
                if (isReadingFromUpstream()) {
                    long j3 = dataSpec2.length;
                    if (j3 == -1 || this.currentDataSourceBytesRead < j3) {
                        setNoBytesRemainingAndMaybeStoreLength((String) Util.castNonNull(dataSpec.key));
                    }
                }
                long j4 = this.bytesRemaining;
                if (j4 <= 0) {
                    if (j4 == -1) {
                    }
                }
                closeCurrentSource();
                openNextSource(dataSpec, false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        if (isReadingFromUpstream()) {
            return this.upstreamDataSource.getResponseHeaders();
        }
        return Collections.emptyMap();
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.requestDataSpec = null;
        this.actualUri = null;
        this.readPosition = 0L;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    private void openNextSource(DataSpec dataSpec, boolean z) {
        CacheSpan startReadWrite;
        long j;
        DataSpec build;
        DataSource dataSource;
        String str = (String) Util.castNonNull(dataSpec.key);
        if (this.currentRequestIgnoresCache) {
            startReadWrite = null;
        } else if (this.blockOnCache) {
            try {
                startReadWrite = this.cache.startReadWrite(str, this.readPosition, this.bytesRemaining);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            startReadWrite = this.cache.startReadWriteNonBlocking(str, this.readPosition, this.bytesRemaining);
        }
        if (startReadWrite == null) {
            dataSource = this.upstreamDataSource;
            build = dataSpec.buildUpon().setPosition(this.readPosition).setLength(this.bytesRemaining).build();
        } else if (startReadWrite.isCached) {
            Uri fromFile = Uri.fromFile((File) Util.castNonNull(startReadWrite.file));
            long j2 = startReadWrite.position;
            long j3 = this.readPosition - j2;
            long j4 = startReadWrite.length - j3;
            long j5 = this.bytesRemaining;
            if (j5 != -1) {
                j4 = Math.min(j4, j5);
            }
            build = dataSpec.buildUpon().setUri(fromFile).setUriPositionOffset(j2).setPosition(j3).setLength(j4).build();
            dataSource = this.cacheReadDataSource;
        } else {
            if (startReadWrite.isOpenEnded()) {
                j = this.bytesRemaining;
            } else {
                j = startReadWrite.length;
                long j6 = this.bytesRemaining;
                if (j6 != -1) {
                    j = Math.min(j, j6);
                }
            }
            build = dataSpec.buildUpon().setPosition(this.readPosition).setLength(j).build();
            dataSource = this.cacheWriteDataSource;
            if (dataSource == null) {
                dataSource = this.upstreamDataSource;
                this.cache.releaseHoleSpan(startReadWrite);
                startReadWrite = null;
            }
        }
        this.checkCachePosition = (this.currentRequestIgnoresCache || dataSource != this.upstreamDataSource) ? Long.MAX_VALUE : this.readPosition + 104857600;
        if (z) {
            Assertions.checkState(isBypassingCache());
            if (dataSource == this.upstreamDataSource) {
                return;
            }
            try {
                closeCurrentSource();
            } catch (Throwable th) {
                if (((CacheSpan) Util.castNonNull(startReadWrite)).isHoleSpan()) {
                    this.cache.releaseHoleSpan(startReadWrite);
                }
                throw th;
            }
        }
        if (startReadWrite != null && startReadWrite.isHoleSpan()) {
            this.currentHoleSpan = startReadWrite;
        }
        this.currentDataSource = dataSource;
        this.currentDataSpec = build;
        this.currentDataSourceBytesRead = 0L;
        long open = dataSource.open(build);
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        if (build.length == -1 && open != -1) {
            this.bytesRemaining = open;
            ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition + open);
        }
        if (isReadingFromUpstream()) {
            Uri uri = dataSource.getUri();
            this.actualUri = uri;
            ContentMetadataMutations.setRedirectedUri(contentMetadataMutations, dataSpec.uri.equals(uri) ^ true ? this.actualUri : null);
        }
        Object obj = build.customData;
        if (obj instanceof CustomCacheMetadata) {
            for (Map.Entry<String, String> entry : ((CustomCacheMetadata) obj).getCacheMetadata().entrySet()) {
                contentMetadataMutations.set(entry.getKey(), entry.getValue());
            }
        }
        if (isWritingToCache()) {
            this.cache.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    private void setNoBytesRemainingAndMaybeStoreLength(String str) {
        this.bytesRemaining = 0L;
        if (isWritingToCache()) {
            ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
            ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition);
            this.cache.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    private static Uri getRedirectedUriOrDefault(Cache cache, String str, Uri uri) {
        Uri redirectedUri = ContentMetadata.getRedirectedUri(cache.getContentMetadata(str));
        return redirectedUri != null ? redirectedUri : uri;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.datasource.cache.CacheSpan, androidx.media3.datasource.DataSpec, androidx.media3.datasource.DataSource] */
    private void closeCurrentSource() {
        DataSource dataSource = this.currentDataSource;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.currentDataSpec = null;
            this.currentDataSource = null;
            CacheSpan cacheSpan = this.currentHoleSpan;
            if (cacheSpan != null) {
                this.cache.releaseHoleSpan(cacheSpan);
                this.currentHoleSpan = null;
            }
        }
    }

    private void handleBeforeThrow(Throwable th) {
        if (isReadingFromCache() || (th instanceof Cache.CacheException)) {
            this.seenCacheError = true;
        }
    }

    private int shouldIgnoreCacheForRequest(DataSpec dataSpec) {
        if (this.ignoreCacheOnError && this.seenCacheError) {
            return 0;
        }
        return (this.ignoreCacheForUnsetLengthRequests && dataSpec.length == -1) ? 1 : -1;
    }

    private void notifyCacheIgnored(int i) {
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.onCacheIgnored(i);
        }
    }

    private void notifyBytesRead() {
        EventListener eventListener = this.eventListener;
        if (eventListener == null || this.totalCachedBytesRead <= 0) {
            return;
        }
        eventListener.onCachedBytesRead(this.cache.getCacheSpace(), this.totalCachedBytesRead);
        this.totalCachedBytesRead = 0L;
    }
}
