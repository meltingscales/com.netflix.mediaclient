package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: o.cT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6074cT extends AbstractC6158cW<PointF> {
    private final PathMeasure b;
    private C6047cS c;
    private final PointF h;
    private final float[] j;

    public C6074cT(List<? extends C8910fd<PointF>> list) {
        super(list);
        this.h = new PointF();
        this.j = new float[2];
        this.b = new PathMeasure();
    }

    @Override // o.AbstractC5913cN
    /* renamed from: d */
    public PointF c(C8910fd<PointF> c8910fd, float f) {
        PointF pointF;
        C6047cS c6047cS = (C6047cS) c8910fd;
        Path a = c6047cS.a();
        if (a == null) {
            return c8910fd.j;
        }
        C8912ff<A> c8912ff = this.a;
        if (c8912ff == 0 || (pointF = (PointF) c8912ff.a(c6047cS.g, c6047cS.e.floatValue(), (PointF) c6047cS.j, (PointF) c6047cS.d, a(), f, c())) == null) {
            if (this.c != c6047cS) {
                this.b.setPath(a, false);
                this.c = c6047cS;
            }
            PathMeasure pathMeasure = this.b;
            pathMeasure.getPosTan(f * pathMeasure.getLength(), this.j, null);
            PointF pointF2 = this.h;
            float[] fArr = this.j;
            pointF2.set(fArr[0], fArr[1]);
            return this.h;
        }
        return pointF;
    }
}
