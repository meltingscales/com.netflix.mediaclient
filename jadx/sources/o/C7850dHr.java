package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C7843dHk;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.dHr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7850dHr implements Closeable {
    public static final a b = new a(null);
    private static final Logger d;
    private final boolean a;
    private final c c;
    private final C7843dHk.b e;
    private final InterfaceC7871dIn g;

    /* renamed from: o.dHr$d */
    /* loaded from: classes5.dex */
    public interface d {
        void a(int i, long j);

        void b(int i, int i2, int i3, boolean z);

        void b(int i, ErrorCode errorCode);

        void b(int i, ErrorCode errorCode, ByteString byteString);

        void b(boolean z, int i, InterfaceC7871dIn interfaceC7871dIn, int i2);

        void c();

        void c(boolean z, int i, int i2);

        void d(int i, int i2, List<C7845dHm> list);

        void e(boolean z, int i, int i2, List<C7845dHm> list);

        void e(boolean z, C7852dHt c7852dHt);
    }

    public C7850dHr(InterfaceC7871dIn interfaceC7871dIn, boolean z) {
        C8632dsu.d(interfaceC7871dIn, "");
        this.g = interfaceC7871dIn;
        this.a = z;
        c cVar = new c(interfaceC7871dIn);
        this.c = cVar;
        this.e = new C7843dHk.b(cVar, 4096, 0, 4, null);
    }

    public final void d(d dVar) {
        C8632dsu.d(dVar, "");
        if (this.a) {
            if (!c(true, dVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC7871dIn interfaceC7871dIn = this.g;
        ByteString byteString = C7846dHn.e;
        ByteString c2 = interfaceC7871dIn.c(byteString.k());
        Logger logger = d;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(dGB.a("<< CONNECTION " + c2.j(), new Object[0]));
        }
        if (!C8632dsu.c(byteString, c2)) {
            throw new IOException("Expected a connection header but was " + c2.m());
        }
    }

    public final boolean c(boolean z, d dVar) {
        C8632dsu.d(dVar, "");
        try {
            this.g.g(9L);
            int c2 = dGB.c(this.g);
            if (c2 > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + c2);
            }
            int b2 = dGB.b(this.g.l(), (int) PrivateKeyType.INVALID);
            if (z && b2 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + b2);
            }
            int b3 = dGB.b(this.g.l(), (int) PrivateKeyType.INVALID);
            int p = this.g.p() & Integer.MAX_VALUE;
            Logger logger = d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C7846dHn.c.d(true, p, c2, b2, b3));
            }
            switch (b2) {
                case 0:
                    e(dVar, c2, b3, p);
                    return true;
                case 1:
                    c(dVar, c2, b3, p);
                    return true;
                case 2:
                    a(dVar, c2, b3, p);
                    return true;
                case 3:
                    j(dVar, c2, b3, p);
                    return true;
                case 4:
                    f(dVar, c2, b3, p);
                    return true;
                case 5:
                    h(dVar, c2, b3, p);
                    return true;
                case 6:
                    d(dVar, c2, b3, p);
                    return true;
                case 7:
                    b(dVar, c2, b3, p);
                    return true;
                case 8:
                    g(dVar, c2, b3, p);
                    return true;
                default:
                    this.g.h(c2);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    private final void c(d dVar, int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        int b2 = (i2 & 8) != 0 ? dGB.b(this.g.l(), (int) PrivateKeyType.INVALID) : 0;
        if ((i2 & 32) != 0) {
            a(dVar, i3);
            i -= 5;
        }
        dVar.e(z, i3, -1, b(b.c(i, i2, b2), b2, i2, i3));
    }

    private final List<C7845dHm> b(int i, int i2, int i3, int i4) {
        this.c.c(i);
        c cVar = this.c;
        cVar.a(cVar.b());
        this.c.d(i2);
        this.c.b(i3);
        this.c.e(i4);
        this.e.e();
        return this.e.c();
    }

    private final void e(d dVar, int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int b2 = (i2 & 8) != 0 ? dGB.b(this.g.l(), (int) PrivateKeyType.INVALID) : 0;
        dVar.b(z, i3, this.g, b.c(i, i2, b2));
        this.g.h(b2);
    }

    private final void a(d dVar, int i, int i2, int i3) {
        if (i == 5) {
            if (i3 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            a(dVar, i3);
            return;
        }
        throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
    }

    private final void a(d dVar, int i) {
        int p = this.g.p();
        dVar.b(i, p & Integer.MAX_VALUE, dGB.b(this.g.l(), (int) PrivateKeyType.INVALID) + 1, (((int) 2147483648L) & p) != 0);
    }

    private final void j(d dVar, int i, int i2, int i3) {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        } else if (i3 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        } else {
            int p = this.g.p();
            ErrorCode e = ErrorCode.b.e(p);
            if (e == null) {
                throw new IOException("TYPE_RST_STREAM unexpected error code: " + p);
            }
            dVar.b(i3, e);
        }
    }

    private final void f(d dVar, int i, int i2, int i3) {
        C8654dtp g;
        C8646dth d2;
        int p;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i2 & 1) != 0) {
            if (i != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            dVar.c();
        } else if (i % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i);
        } else {
            C7852dHt c7852dHt = new C7852dHt();
            g = C8657dts.g(0, i);
            d2 = C8657dts.d(g, 6);
            int d3 = d2.d();
            int e = d2.e();
            int a2 = d2.a();
            if (a2 < 0 ? d3 >= e : d3 <= e) {
                while (true) {
                    int c2 = dGB.c(this.g.x(), 65535);
                    p = this.g.p();
                    if (c2 != 2) {
                        if (c2 == 3) {
                            c2 = 4;
                        } else if (c2 != 4) {
                            if (c2 == 5 && (p < 16384 || p > 16777215)) {
                                break;
                            }
                        } else if (p < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        } else {
                            c2 = 7;
                        }
                    } else if (p != 0 && p != 1) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    c7852dHt.d(c2, p);
                    if (d3 == e) {
                        break;
                    }
                    d3 += a2;
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + p);
            }
            dVar.e(false, c7852dHt);
        }
    }

    private final void h(d dVar, int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int b2 = (i2 & 8) != 0 ? dGB.b(this.g.l(), (int) PrivateKeyType.INVALID) : 0;
        dVar.d(i3, Integer.MAX_VALUE & this.g.p(), b(b.c(i - 4, i2, b2), b2, i2, i3));
    }

    private final void d(d dVar, int i, int i2, int i3) {
        if (i != 8) {
            throw new IOException("TYPE_PING length != 8: " + i);
        } else if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        } else {
            dVar.c((i2 & 1) != 0, this.g.p(), this.g.p());
        }
    }

    private final void b(d dVar, int i, int i2, int i3) {
        if (i < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i);
        } else if (i3 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        } else {
            int p = this.g.p();
            int p2 = this.g.p();
            int i4 = i - 8;
            ErrorCode e = ErrorCode.b.e(p2);
            if (e == null) {
                throw new IOException("TYPE_GOAWAY unexpected error code: " + p2);
            }
            ByteString byteString = ByteString.e;
            if (i4 > 0) {
                byteString = this.g.c(i4);
            }
            dVar.b(p, e, byteString);
        }
    }

    private final void g(d dVar, int i, int i2, int i3) {
        if (i != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
        }
        long a2 = dGB.a(this.g.p(), 2147483647L);
        if (a2 == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        dVar.a(i3, a2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.g.close();
    }

    /* renamed from: o.dHr$c */
    /* loaded from: classes5.dex */
    public static final class c implements dIJ {
        private int a;
        private int b;
        private final InterfaceC7871dIn c;
        private int d;
        private int e;
        private int h;

        public final void a(int i) {
            this.b = i;
        }

        public final int b() {
            return this.e;
        }

        public final void b(int i) {
            this.a = i;
        }

        public final void c(int i) {
            this.e = i;
        }

        @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final void d(int i) {
            this.d = i;
        }

        public final void e(int i) {
            this.h = i;
        }

        public c(InterfaceC7871dIn interfaceC7871dIn) {
            C8632dsu.d(interfaceC7871dIn, "");
            this.c = interfaceC7871dIn;
        }

        @Override // o.dIJ
        public long b(C7872dIo c7872dIo, long j) {
            C8632dsu.d(c7872dIo, "");
            while (true) {
                int i = this.e;
                if (i == 0) {
                    this.c.h(this.d);
                    this.d = 0;
                    if ((this.a & 4) != 0) {
                        return -1L;
                    }
                    a();
                } else {
                    long b = this.c.b(c7872dIo, Math.min(j, i));
                    if (b == -1) {
                        return -1L;
                    }
                    this.e -= (int) b;
                    return b;
                }
            }
        }

        @Override // o.dIJ
        public dIK e() {
            return this.c.e();
        }

        private final void a() {
            int i = this.h;
            int c = dGB.c(this.c);
            this.e = c;
            this.b = c;
            int b = dGB.b(this.c.l(), (int) PrivateKeyType.INVALID);
            this.a = dGB.b(this.c.l(), (int) PrivateKeyType.INVALID);
            a aVar = C7850dHr.b;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(C7846dHn.c.d(true, this.h, this.b, b, this.a));
            }
            int p = this.c.p() & Integer.MAX_VALUE;
            this.h = p;
            if (b == 9) {
                if (p != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
                return;
            }
            throw new IOException(b + " != TYPE_CONTINUATION");
        }
    }

    /* renamed from: o.dHr$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public final Logger a() {
            return C7850dHr.d;
        }

        public final int c(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    static {
        Logger logger = Logger.getLogger(C7846dHn.class.getName());
        C8632dsu.b(logger, "");
        d = logger;
    }
}
