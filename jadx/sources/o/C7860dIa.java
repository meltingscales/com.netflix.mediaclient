package o;

import java.io.Closeable;
import java.util.zip.Inflater;

/* renamed from: o.dIa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7860dIa implements Closeable {
    private final C7872dIo b;
    private final dIu c;
    private final boolean d;
    private final Inflater e;

    public C7860dIa(boolean z) {
        this.d = z;
        C7872dIo c7872dIo = new C7872dIo();
        this.b = c7872dIo;
        Inflater inflater = new Inflater(true);
        this.e = inflater;
        this.c = new dIu((dIJ) c7872dIo, inflater);
    }

    public final void d(C7872dIo c7872dIo) {
        C8632dsu.d(c7872dIo, "");
        if (this.b.D() != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.d) {
            this.e.reset();
        }
        this.b.b(c7872dIo);
        this.b.h(65535);
        long bytesRead = this.e.getBytesRead();
        long D = this.b.D();
        do {
            this.c.d(c7872dIo, Long.MAX_VALUE);
        } while (this.e.getBytesRead() < bytesRead + D);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }
}
