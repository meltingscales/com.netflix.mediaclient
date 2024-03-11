package o;

import java.nio.ByteBuffer;

/* renamed from: o.oS  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9376oS extends AbstractC9379oV {
    private ByteBuffer am;

    public C9376oS(C9389of c9389of, int i, C9377oT c9377oT) {
        super(c9389of, i, c9377oT);
        this.am = ByteBuffer.wrap(AbstractC9384oa.Q);
    }

    @Override // o.AbstractC9379oV
    protected byte as() {
        ByteBuffer byteBuffer = this.am;
        int i = this.n;
        this.n = i + 1;
        return byteBuffer.get(i);
    }

    @Override // o.AbstractC9379oV
    protected int aB() {
        ByteBuffer byteBuffer = this.am;
        int i = this.n;
        this.n = i + 1;
        return byteBuffer.get(i) & 255;
    }

    @Override // o.AbstractC9379oV
    protected byte f(int i) {
        return this.am.get(i);
    }
}
