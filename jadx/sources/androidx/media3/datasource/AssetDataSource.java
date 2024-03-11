package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import o.C9571sB;

/* loaded from: classes2.dex */
public final class AssetDataSource extends BaseDataSource {
    private static int d = 0;
    private static int e = 1;
    private final AssetManager assetManager;
    private long bytesRemaining;
    private InputStream inputStream;
    private boolean opened;
    private Uri uri;

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.uri;
    }

    /* loaded from: classes2.dex */
    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th, int i) {
            super(th, i);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.assetManager = context.getAssets();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        int i = 2 % 2;
        int i2 = d + 35;
        e = i2 % 128;
        int i3 = i2 % 2;
        try {
            Uri uri = dataSpec.uri;
            this.uri = uri;
            String str = (String) Assertions.checkNotNull(uri.getPath());
            try {
                if (((Boolean) String.class.getMethod("startsWith", String.class).invoke(str, "/android_asset/")).booleanValue()) {
                    try {
                        str = (String) String.class.getMethod("substring", Integer.TYPE).invoke(str, 15);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    try {
                        if (((Boolean) String.class.getMethod("startsWith", String.class).invoke(str, "/")).booleanValue()) {
                            int i4 = e + 85;
                            d = i4 % 128;
                            int i5 = i4 % 2;
                            try {
                                str = (String) String.class.getMethod("substring", Integer.TYPE).invoke(str, 1);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
                transferInitializing(dataSpec);
                try {
                    Object[] objArr = {this.assetManager, str};
                    Object obj = C9571sB.s.get(-59237389);
                    if (obj == null) {
                        obj = ((Class) C9571sB.a(4, 0, (char) 0)).getMethod("a", AssetManager.class, String.class);
                        C9571sB.s.put(-59237389, obj);
                    }
                    Object obj2 = null;
                    InputStream inputStream = (InputStream) ((Method) obj).invoke(null, objArr);
                    this.inputStream = inputStream;
                    if (inputStream.skip(dataSpec.position) >= dataSpec.position) {
                        long j = dataSpec.length;
                        if (j != -1) {
                            this.bytesRemaining = j;
                        } else {
                            long available = this.inputStream.available();
                            this.bytesRemaining = available;
                            if (available == 2147483647L) {
                                int i6 = d + 33;
                                e = i6 % 128;
                                if (i6 % 2 == 0) {
                                    this.bytesRemaining = -1L;
                                    obj2.hashCode();
                                    throw null;
                                }
                                this.bytesRemaining = -1L;
                            }
                        }
                        this.opened = true;
                        transferStarted(dataSpec);
                        return this.bytesRemaining;
                    }
                    throw new AssetDataSourceException(null, 2008);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            } catch (Throwable th5) {
                Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        } catch (AssetDataSourceException e2) {
            throw e2;
        } catch (IOException e3) {
            throw new AssetDataSourceException(e3, e3 instanceof FileNotFoundException ? 2005 : 2000);
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
            } catch (IOException e2) {
                throw new AssetDataSourceException(e2, 2000);
            }
        }
        int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
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
            } catch (IOException e2) {
                throw new AssetDataSourceException(e2, 2000);
            }
        } finally {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }
}
