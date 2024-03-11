package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public final class RawResourceDataSource extends BaseDataSource {
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private InputStream inputStream;
    private boolean opened;
    private final String packageName;
    private final Resources resources;
    private Uri uri;

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.uri;
    }

    /* loaded from: classes2.dex */
    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.resources = context.getResources();
        this.packageName = context.getPackageName();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        int parseInt;
        String str;
        Uri normalizeScheme = dataSpec.uri.normalizeScheme();
        this.uri = normalizeScheme;
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme()) || (TextUtils.equals("android.resource", normalizeScheme.getScheme()) && normalizeScheme.getPathSegments().size() == 1 && ((String) Assertions.checkNotNull(normalizeScheme.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) Assertions.checkNotNull(normalizeScheme.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String str2 = (String) Assertions.checkNotNull(normalizeScheme.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            String host = normalizeScheme.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(str2);
            parseInt = this.resources.getIdentifier(sb.toString(), "raw", this.packageName);
            if (parseInt == 0) {
                throw new RawResourceDataSourceException("Resource not found.", null, 2005);
            }
        } else {
            throw new RawResourceDataSourceException("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, 1004);
        }
        transferInitializing(dataSpec);
        try {
            AssetFileDescriptor openRawResourceFd = this.resources.openRawResourceFd(parseInt);
            this.assetFileDescriptor = openRawResourceFd;
            if (openRawResourceFd == null) {
                throw new RawResourceDataSourceException("Resource is compressed: " + normalizeScheme, null, 2000);
            }
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.inputStream = fileInputStream;
            int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            if (i != 0) {
                try {
                    if (dataSpec.position > length) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                } catch (RawResourceDataSourceException e) {
                    throw e;
                } catch (IOException e2) {
                    throw new RawResourceDataSourceException(null, e2, 2000);
                }
            }
            long startOffset = openRawResourceFd.getStartOffset();
            long skip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
            if (skip != dataSpec.position) {
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            if (i == 0) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.bytesRemaining = size;
                    if (size < 0) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                }
            } else {
                long j = length - skip;
                this.bytesRemaining = j;
                if (j < 0) {
                    throw new DataSourceException(2008);
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
            this.opened = true;
            transferStarted(dataSpec);
            long j4 = dataSpec.length;
            return j4 != -1 ? j4 : this.bytesRemaining;
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException(null, e3, 2005);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException(null, e, 2000);
            }
        }
        int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - read;
        }
        bytesTransferred(read);
        return read;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.uri = null;
        try {
            try {
                InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSourceException(null, e, 2000);
                    }
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                }
            } catch (Throwable th) {
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.assetFileDescriptor;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.assetFileDescriptor = null;
                        if (this.opened) {
                            this.opened = false;
                            transferEnded();
                        }
                        throw th;
                    } finally {
                        this.assetFileDescriptor = null;
                        if (this.opened) {
                            this.opened = false;
                            transferEnded();
                        }
                    }
                } catch (IOException e2) {
                    throw new RawResourceDataSourceException(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new RawResourceDataSourceException(null, e3, 2000);
        }
    }
}