package o;

/* renamed from: o.dFg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7785dFg {
    private int a;
    private final C8560dqc<char[]> d = new C8560dqc<>();

    /* JADX INFO: Access modifiers changed from: protected */
    public final char[] a(int i) {
        char[] i2;
        synchronized (this) {
            i2 = this.d.i();
            if (i2 != null) {
                this.a -= i2.length;
            } else {
                i2 = null;
            }
        }
        return i2 == null ? new char[i] : i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(char[] cArr) {
        int i;
        C8632dsu.c((Object) cArr, "");
        synchronized (this) {
            int length = this.a + cArr.length;
            i = C7779dFa.c;
            if (length < i) {
                this.a += cArr.length;
                this.d.b((C8560dqc<char[]>) cArr);
            }
            dpR dpr = dpR.c;
        }
    }
}
