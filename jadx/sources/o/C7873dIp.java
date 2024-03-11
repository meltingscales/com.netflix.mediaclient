package o;

import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: o.dIp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7873dIp implements dIH {
    private final Deflater b;
    private final dIq d;
    private boolean e;

    public C7873dIp(dIq diq, Deflater deflater) {
        C8632dsu.c((Object) diq, "");
        C8632dsu.c((Object) deflater, "");
        this.d = diq;
        this.b = deflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7873dIp(dIH dih, Deflater deflater) {
        this(dIw.b(dih), deflater);
        C8632dsu.c((Object) dih, "");
        C8632dsu.c((Object) deflater, "");
    }

    @Override // o.dIH
    public void a(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        C7868dIi.a(c7872dIo.D(), 0L, j);
        while (j > 0) {
            dIE die = c7872dIo.c;
            C8632dsu.d(die);
            int min = (int) Math.min(j, die.d - die.g);
            this.b.setInput(die.e, die.g, min);
            a(false);
            long j2 = min;
            c7872dIo.f(c7872dIo.D() - j2);
            int i = die.g + min;
            die.g = i;
            if (i == die.d) {
                c7872dIo.c = die.e();
                dIC.e(die);
            }
            j -= j2;
        }
    }

    @IgnoreJRERequirement
    private final void a(boolean z) {
        dIE b;
        int deflate;
        C7872dIo o2 = this.d.o();
        while (true) {
            b = o2.b(1);
            if (z) {
                Deflater deflater = this.b;
                byte[] bArr = b.e;
                int i = b.d;
                deflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.b;
                byte[] bArr2 = b.e;
                int i2 = b.d;
                deflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (deflate > 0) {
                b.d += deflate;
                o2.f(o2.D() + deflate);
                this.d.j();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (b.g == b.d) {
            o2.c = b.e();
            dIC.e(b);
        }
    }

    @Override // o.dIH, java.io.Flushable
    public void flush() {
        a(true);
        this.d.flush();
    }

    public final void c() {
        this.b.finish();
        a(false);
    }

    @Override // o.dIH, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.e) {
            return;
        }
        try {
            c();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.d.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // o.dIH
    public dIK e() {
        return this.d.e();
    }

    public String toString() {
        return "DeflaterSink(" + this.d + ')';
    }
}
