package o;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o.C7872dIo;
import okio.ByteString;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.dIc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7862dIc implements Closeable {
    private long a;
    private final c b;
    private final boolean c;
    private final C7872dIo d;
    private boolean e;
    private final C7872dIo.d f;
    private final C7872dIo g;
    private boolean h;
    private final byte[] i;
    private boolean j;
    private boolean k;
    private final boolean l;
    private int m;
    private C7860dIa n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13812o;
    private final InterfaceC7871dIn r;

    /* renamed from: o.dIc$c */
    /* loaded from: classes5.dex */
    public interface c {
        void a(ByteString byteString);

        void b(String str);

        void c(ByteString byteString);

        void d(ByteString byteString);

        void e(int i, String str);
    }

    public C7862dIc(boolean z, InterfaceC7871dIn interfaceC7871dIn, c cVar, boolean z2, boolean z3) {
        C8632dsu.d(interfaceC7871dIn, "");
        C8632dsu.d(cVar, "");
        this.c = z;
        this.r = interfaceC7871dIn;
        this.b = cVar;
        this.l = z2;
        this.f13812o = z3;
        this.d = new C7872dIo();
        this.g = new C7872dIo();
        this.i = z ? null : new byte[4];
        this.f = z ? null : new C7872dIo.d();
    }

    public final void b() {
        d();
        if (this.j) {
            c();
        } else {
            e();
        }
    }

    private final void d() {
        if (this.e) {
            throw new IOException("closed");
        }
        long i = this.r.e().i();
        this.r.e().cD_();
        try {
            int b = dGB.b(this.r.l(), (int) PrivateKeyType.INVALID);
            this.r.e().a(i, TimeUnit.NANOSECONDS);
            int i2 = b & 15;
            this.m = i2;
            boolean z = (b & 128) != 0;
            this.h = z;
            boolean z2 = (b & 8) != 0;
            this.j = z2;
            if (z2 && !z) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z3 = (b & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z3) {
                    this.k = false;
                } else if (!this.l) {
                    throw new ProtocolException("Unexpected rsv1 flag");
                } else {
                    this.k = true;
                }
            } else if (z3) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int b2 = dGB.b(this.r.l(), (int) PrivateKeyType.INVALID);
            boolean z4 = (b2 & 128) != 0;
            boolean z5 = this.c;
            if (z4 == z5) {
                throw new ProtocolException(z5 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = b2 & 127;
            this.a = j;
            if (j == 126) {
                this.a = dGB.c(this.r.x(), 65535);
            } else if (j == 127) {
                long y = this.r.y();
                this.a = y;
                if (y < 0) {
                    throw new ProtocolException("Frame length 0x" + dGB.c(this.a) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.j && this.a > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z4) {
                InterfaceC7871dIn interfaceC7871dIn = this.r;
                byte[] bArr = this.i;
                if (bArr == null) {
                    C8632dsu.e();
                }
                interfaceC7871dIn.b(bArr);
            }
        } catch (Throwable th) {
            this.r.e().a(i, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void c() {
        short s;
        String str;
        long j = this.a;
        if (j > 0) {
            this.r.d(this.d, j);
            if (!this.c) {
                C7872dIo c7872dIo = this.d;
                C7872dIo.d dVar = this.f;
                if (dVar == null) {
                    C8632dsu.e();
                }
                c7872dIo.c(dVar);
                this.f.c(0L);
                C7864dIe c7864dIe = C7864dIe.c;
                C7872dIo.d dVar2 = this.f;
                byte[] bArr = this.i;
                if (bArr == null) {
                    C8632dsu.e();
                }
                c7864dIe.c(dVar2, bArr);
                this.f.close();
            }
        }
        switch (this.m) {
            case 8:
                long D = this.d.D();
                if (D == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (D != 0) {
                    s = this.d.x();
                    str = this.d.v();
                    String a = C7864dIe.c.a(s);
                    if (a != null) {
                        throw new ProtocolException(a);
                    }
                } else {
                    s = 1005;
                    str = "";
                }
                this.b.e(s, str);
                this.e = true;
                return;
            case 9:
                this.b.c(this.d.r());
                return;
            case 10:
                this.b.d(this.d.r());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + dGB.e(this.m));
        }
    }

    private final void e() {
        int i = this.m;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + dGB.e(i));
        }
        a();
        if (this.k) {
            C7860dIa c7860dIa = this.n;
            if (c7860dIa == null) {
                c7860dIa = new C7860dIa(this.f13812o);
                this.n = c7860dIa;
            }
            c7860dIa.d(this.g);
        }
        if (i == 1) {
            this.b.b(this.g.v());
        } else {
            this.b.a(this.g.r());
        }
    }

    private final void g() {
        while (!this.e) {
            d();
            if (!this.j) {
                return;
            }
            c();
        }
    }

    private final void a() {
        while (!this.e) {
            long j = this.a;
            if (j > 0) {
                this.r.d(this.g, j);
                if (!this.c) {
                    C7872dIo c7872dIo = this.g;
                    C7872dIo.d dVar = this.f;
                    if (dVar == null) {
                        C8632dsu.e();
                    }
                    c7872dIo.c(dVar);
                    this.f.c(this.g.D() - this.a);
                    C7864dIe c7864dIe = C7864dIe.c;
                    C7872dIo.d dVar2 = this.f;
                    byte[] bArr = this.i;
                    if (bArr == null) {
                        C8632dsu.e();
                    }
                    c7864dIe.c(dVar2, bArr);
                    this.f.close();
                }
            }
            if (this.h) {
                return;
            }
            g();
            if (this.m != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + dGB.e(this.m));
            }
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C7860dIa c7860dIa = this.n;
        if (c7860dIa != null) {
            c7860dIa.close();
        }
    }
}
