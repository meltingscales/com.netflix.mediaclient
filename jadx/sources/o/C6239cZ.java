package o;

import android.graphics.PointF;
import java.util.List;

/* renamed from: o.cZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6239cZ extends AbstractC6158cW<PointF> {
    private final PointF c;

    public C6239cZ(List<C8910fd<PointF>> list) {
        super(list);
        this.c = new PointF();
    }

    @Override // o.AbstractC5913cN
    /* renamed from: e */
    public PointF c(C8910fd<PointF> c8910fd, float f) {
        return a(c8910fd, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5913cN
    /* renamed from: c */
    public PointF a(C8910fd<PointF> c8910fd, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c8910fd.j;
        if (pointF3 == null || (pointF = c8910fd.d) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        C8912ff<A> c8912ff = this.a;
        if (c8912ff == 0 || (pointF2 = (PointF) c8912ff.a(c8910fd.g, c8910fd.e.floatValue(), pointF4, pointF5, f, a(), c())) == null) {
            PointF pointF6 = this.c;
            float f4 = pointF4.x;
            float f5 = pointF5.x;
            float f6 = pointF4.y;
            pointF6.set(f4 + (f2 * (f5 - f4)), f6 + (f3 * (pointF5.y - f6)));
            return this.c;
        }
        return pointF2;
    }
}
