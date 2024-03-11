package o;

/* renamed from: o.blt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4762blt {
    public int b;
    public double d;
    public double e;

    public C4762blt(double d, double d2, int i) {
        this.d = d;
        this.e = d2;
        this.b = i;
    }

    public String toString() {
        return "Statistics{average=" + ((int) this.d) + ", variance=" + ((int) this.e) + ", count=" + this.b + '}';
    }
}
