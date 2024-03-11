package o;

import android.graphics.PointF;
import java.util.List;

/* renamed from: o.dy  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8773dy implements InterfaceC7643dA<PointF, PointF> {
    private final C8557dq a;
    private final C8557dq b;

    public C8773dy(C8557dq c8557dq, C8557dq c8557dq2) {
        this.b = c8557dq;
        this.a = c8557dq2;
    }

    @Override // o.InterfaceC7643dA
    public List<C8910fd<PointF>> c() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // o.InterfaceC7643dA
    public boolean a() {
        return this.b.a() && this.a.a();
    }

    @Override // o.InterfaceC7643dA
    public AbstractC5913cN<PointF, PointF> b() {
        return new C7944db(this.b.b(), this.a.b());
    }
}
