package o;

/* renamed from: o.dBg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7677dBg extends C7683dBm {
    public static final C7677dBg b = new C7677dBg();

    @Override // o.dwQ
    public String toString() {
        return "Dispatchers.Default";
    }

    private C7677dBg() {
        super(C7687dBq.a, C7687dBq.b, C7687dBq.d, C7687dBq.e);
    }

    @Override // o.dwQ
    public dwQ limitedParallelism(int i) {
        C7661dAr.b(i);
        return i >= C7687dBq.a ? this : super.limitedParallelism(i);
    }

    @Override // o.C7683dBm, o.AbstractC8766dxt, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
}
