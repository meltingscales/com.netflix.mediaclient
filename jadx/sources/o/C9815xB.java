package o;

import android.util.Log;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* renamed from: o.xB  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9815xB extends InputStream {
    private static long j = -1;
    private final InputStream g;
    private static long e = (-25) / TimeUnit.SECONDS.toMillis(1);
    private static long i = 0;
    private static long h = 0;
    private static final Object a = new Object();
    public static long d = 0;
    private static long b = 0;
    public static long c = 0;

    public static long b() {
        return j;
    }

    public static InputStream d(InputStream inputStream) {
        return j == -1 ? inputStream : new C9815xB(inputStream);
    }

    private C9815xB(InputStream inputStream) {
        this.g = inputStream;
    }

    public static void a(long j2) {
        Log.i("controlledInputStream", "..............setNetworkSpeedInBitsPerSecond speed in bitsPerSecond=" + j2);
        if (j2 != -1) {
            long j3 = j2 / 8;
            j = j3;
            e = (j3 * 25) / TimeUnit.SECONDS.toMillis(1L);
            return;
        }
        Log.i("controlledInputStream", "............setNetworkSpeedInBitsPerSecond NO LIMIT");
        j = -1L;
    }

    @Override // java.io.InputStream
    public int read() {
        return this.g.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        int read = this.g.read(bArr);
        if (read >= 0 && j != -1) {
            synchronized (a) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = read;
                b += j2;
                long j3 = i + j2;
                i = j3;
                if (h == 0) {
                    h = currentTimeMillis;
                }
                if (j3 > e) {
                    Log.i("controlledInputStream", String.format("read: mBytesReadInTimeUnit=%d mBytesLimitPerTimeUnit=%d", Long.valueOf(j3), Long.valueOf(e)));
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j4 = currentTimeMillis2 - h;
                    long j5 = (i * 25) / e;
                    long j6 = j5 - j4;
                    long j7 = currentTimeMillis2 - d;
                    if (j7 > 0) {
                        long j8 = b;
                        if (j8 > 0 && (j8 * 1000) / j7 <= j) {
                            j6 = 0;
                        }
                    }
                    Log.i("controlledInputStream", String.format("read: timeAlreadyTaken=%d timeShouldHaveTaken=%d", Long.valueOf(j4), Long.valueOf(j5)));
                    try {
                        Log.i("controlledInputStream", String.format("read: ...sleeping... for=%dms", Long.valueOf(j6)));
                        if (j6 > 0) {
                            Thread.sleep(j6);
                        }
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    i = 0L;
                    h = 0L;
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                long j9 = currentTimeMillis3 - d;
                if (j9 >= 1000) {
                    c = (b * 1000) / j9;
                    d = currentTimeMillis3;
                    Log.i("controlledInputStream", "BytesReadInOneSecond=" + b + " target=" + j);
                    b = 0L;
                }
            }
            return read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        return this.g.read(bArr, i2, i3);
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        return this.g.skip(j2);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.g.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.g.close();
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        synchronized (this) {
            this.g.mark(i2);
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        synchronized (this) {
            this.g.reset();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.g.markSupported();
    }

    public String toString() {
        return this.g.toString();
    }
}
