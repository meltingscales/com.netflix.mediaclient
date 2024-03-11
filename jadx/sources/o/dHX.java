package o;

import java.io.Closeable;
import java.util.zip.Deflater;
import o.C7872dIo;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class dHX implements Closeable {
    private final boolean a;
    private final C7873dIp c;
    private final C7872dIo d;
    private final Deflater e;

    public dHX(boolean z) {
        this.a = z;
        C7872dIo c7872dIo = new C7872dIo();
        this.d = c7872dIo;
        Deflater deflater = new Deflater(-1, true);
        this.e = deflater;
        this.c = new C7873dIp((dIH) c7872dIo, deflater);
    }

    public final void c(C7872dIo c7872dIo) {
        ByteString byteString;
        C8632dsu.d(c7872dIo, "");
        if (this.d.D() != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.a) {
            this.e.reset();
        }
        this.c.a(c7872dIo, c7872dIo.D());
        this.c.flush();
        C7872dIo c7872dIo2 = this.d;
        byteString = C7861dIb.c;
        if (e(c7872dIo2, byteString)) {
            C7872dIo.d a = C7872dIo.a(this.d, null, 1, null);
            try {
                a.a(this.d.D() - 4);
                C8608drx.a(a, null);
            } finally {
            }
        } else {
            this.d.c(0);
        }
        C7872dIo c7872dIo3 = this.d;
        c7872dIo.a(c7872dIo3, c7872dIo3.D());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    private final boolean e(C7872dIo c7872dIo, ByteString byteString) {
        return c7872dIo.a(c7872dIo.D() - byteString.k(), byteString);
    }
}
