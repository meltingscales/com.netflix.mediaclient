package o;

/* renamed from: o.oO  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9372oO extends AbstractC9379oV {
    private byte[] am;

    public C9372oO(C9389of c9389of, int i, C9377oT c9377oT) {
        super(c9389of, i, c9377oT);
        this.am = AbstractC9384oa.Q;
    }

    @Override // o.AbstractC9379oV
    protected byte as() {
        byte[] bArr = this.am;
        int i = this.n;
        this.n = i + 1;
        return bArr[i];
    }

    @Override // o.AbstractC9379oV
    protected int aB() {
        byte[] bArr = this.am;
        int i = this.n;
        this.n = i + 1;
        return bArr[i] & 255;
    }

    @Override // o.AbstractC9379oV
    protected byte f(int i) {
        return this.am[i];
    }
}
