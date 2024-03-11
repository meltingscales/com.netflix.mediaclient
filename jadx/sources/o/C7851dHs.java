package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C7843dHk;
import okhttp3.internal.http2.ErrorCode;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.dHs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7851dHs implements Closeable {
    private final boolean a;
    private final C7872dIo c;
    private boolean e;
    private int h;
    private final C7843dHk.d i;
    private final dIq j;
    public static final e d = new e(null);
    private static final Logger b = Logger.getLogger(C7846dHn.class.getName());

    public final int b() {
        return this.h;
    }

    public C7851dHs(dIq diq, boolean z) {
        C8632dsu.d(diq, "");
        this.j = diq;
        this.a = z;
        C7872dIo c7872dIo = new C7872dIo();
        this.c = c7872dIo;
        this.h = 16384;
        this.i = new C7843dHk.d(0, false, c7872dIo, 3, null);
    }

    public final void d() {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (this.a) {
                Logger logger = b;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(dGB.a(">> CONNECTION " + C7846dHn.e.j(), new Object[0]));
                }
                this.j.b(C7846dHn.e);
                this.j.flush();
            }
        }
    }

    public final void c(C7852dHt c7852dHt) {
        synchronized (this) {
            C8632dsu.d(c7852dHt, "");
            if (this.e) {
                throw new IOException("closed");
            }
            this.h = c7852dHt.b(this.h);
            if (c7852dHt.b() != -1) {
                this.i.a(c7852dHt.b());
            }
            d(0, 0, 4, 1);
            this.j.flush();
        }
    }

    public final void b(int i, int i2, List<C7845dHm> list) {
        synchronized (this) {
            C8632dsu.d(list, "");
            if (this.e) {
                throw new IOException("closed");
            }
            this.i.c(list);
            long D = this.c.D();
            int min = (int) Math.min(this.h - 4, D);
            long j = min;
            int i3 = (D > j ? 1 : (D == j ? 0 : -1));
            d(i, min + 4, 5, i3 == 0 ? 4 : 0);
            this.j.h(i2 & Integer.MAX_VALUE);
            this.j.a(this.c, j);
            if (i3 > 0) {
                e(i, D - j);
            }
        }
    }

    public final void c() {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            this.j.flush();
        }
    }

    public final void c(int i, ErrorCode errorCode) {
        synchronized (this) {
            C8632dsu.d(errorCode, "");
            if (this.e) {
                throw new IOException("closed");
            }
            if (errorCode.c() == -1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            d(i, 4, 3, 0);
            this.j.h(errorCode.c());
            this.j.flush();
        }
    }

    public final void b(boolean z, int i, C7872dIo c7872dIo, int i2) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            e(i, z ? 1 : 0, c7872dIo, i2);
        }
    }

    public final void e(int i, int i2, C7872dIo c7872dIo, int i3) {
        d(i, i3, 0, i2);
        if (i3 > 0) {
            dIq diq = this.j;
            if (c7872dIo == null) {
                C8632dsu.e();
            }
            diq.a(c7872dIo, i3);
        }
    }

    public final void a(C7852dHt c7852dHt) {
        synchronized (this) {
            C8632dsu.d(c7852dHt, "");
            if (this.e) {
                throw new IOException("closed");
            }
            int i = 0;
            d(0, c7852dHt.e() * 6, 4, 0);
            while (i < 10) {
                if (c7852dHt.c(i)) {
                    this.j.f(i != 4 ? i != 7 ? i : 4 : 3);
                    this.j.h(c7852dHt.d(i));
                }
                i++;
            }
            this.j.flush();
        }
    }

    public final void c(boolean z, int i, int i2) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            d(0, 8, 6, z ? 1 : 0);
            this.j.h(i);
            this.j.h(i2);
            this.j.flush();
        }
    }

    public final void b(int i, ErrorCode errorCode, byte[] bArr) {
        synchronized (this) {
            C8632dsu.d(errorCode, "");
            C8632dsu.d(bArr, "");
            if (this.e) {
                throw new IOException("closed");
            }
            if (errorCode.c() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            d(0, bArr.length + 8, 7, 0);
            this.j.h(i);
            this.j.h(errorCode.c());
            if (!(bArr.length == 0)) {
                this.j.d(bArr);
            }
            this.j.flush();
        }
    }

    public final void b(int i, long j) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
            d(i, 4, 8, 0);
            this.j.h((int) j);
            this.j.flush();
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C7846dHn.c.d(false, i, i2, i3, i4));
        }
        if (i2 > this.h) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.h + ": " + i2).toString());
        } else if ((((int) 2147483648L) & i) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        } else {
            dGB.e(this.j, i2);
            this.j.c(i3 & PrivateKeyType.INVALID);
            this.j.c(i4 & PrivateKeyType.INVALID);
            this.j.h(i & Integer.MAX_VALUE);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.e = true;
            this.j.close();
        }
    }

    private final void e(int i, long j) {
        while (j > 0) {
            long min = Math.min(this.h, j);
            j -= min;
            d(i, (int) min, 9, j == 0 ? 4 : 0);
            this.j.a(this.c, min);
        }
    }

    public final void c(boolean z, int i, List<C7845dHm> list) {
        synchronized (this) {
            C8632dsu.d(list, "");
            if (this.e) {
                throw new IOException("closed");
            }
            this.i.c(list);
            long D = this.c.D();
            long min = Math.min(this.h, D);
            int i2 = (D > min ? 1 : (D == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            d(i, (int) min, 1, i3);
            this.j.a(this.c, min);
            if (i2 > 0) {
                e(i, D - min);
            }
        }
    }

    /* renamed from: o.dHs$e */
    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }
    }
}
