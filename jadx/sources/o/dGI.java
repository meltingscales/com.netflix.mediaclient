package o;

import java.io.IOException;

/* loaded from: classes5.dex */
public class dGI extends dIm {
    private boolean b;
    private final drM<IOException, dpR> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dGI(dIH dih, drM<? super IOException, dpR> drm) {
        super(dih);
        C8632dsu.d(dih, "");
        C8632dsu.d(drm, "");
        this.c = drm;
    }

    @Override // o.dIm, o.dIH
    public void a(C7872dIo c7872dIo, long j) {
        C8632dsu.d(c7872dIo, "");
        if (this.b) {
            c7872dIo.h(j);
            return;
        }
        try {
            super.a(c7872dIo, j);
        } catch (IOException e) {
            this.b = true;
            this.c.invoke(e);
        }
    }

    @Override // o.dIm, o.dIH, java.io.Flushable
    public void flush() {
        if (this.b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.b = true;
            this.c.invoke(e);
        }
    }

    @Override // o.dIm, o.dIH, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.b = true;
            this.c.invoke(e);
        }
    }
}
