package o;

/* loaded from: classes5.dex */
public abstract class dDX<Array> {
    public abstract Array a();

    public abstract void d(int i);

    public abstract int e();

    public static /* synthetic */ void d(dDX ddx, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i2 & 1) != 0) {
            i = ddx.e() + 1;
        }
        ddx.d(i);
    }
}
