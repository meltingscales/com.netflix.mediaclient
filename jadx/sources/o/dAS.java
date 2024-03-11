package o;

/* loaded from: classes5.dex */
public final class dAS {
    private final dxX<Object>[] b;
    private int c;
    private final Object[] d;
    public final dqZ e;

    public dAS(dqZ dqz, int i) {
        this.e = dqz;
        this.d = new Object[i];
        this.b = new dxX[i];
    }

    public final void b(dxX<?> dxx, Object obj) {
        Object[] objArr = this.d;
        int i = this.c;
        objArr[i] = obj;
        dxX<Object>[] dxxArr = this.b;
        this.c = i + 1;
        C8632dsu.d(dxx);
        dxxArr[i] = dxx;
    }

    public final void b(dqZ dqz) {
        int length = this.b.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            dxX<Object> dxx = this.b[length];
            C8632dsu.d(dxx);
            dxx.b(dqz, this.d[length]);
            if (i < 0) {
                return;
            }
            length = i;
        }
    }
}
