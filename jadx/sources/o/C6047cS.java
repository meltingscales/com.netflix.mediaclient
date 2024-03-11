package o;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: o.cS  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6047cS extends C8910fd<PointF> {
    private Path f;

    /* renamed from: o  reason: collision with root package name */
    private final C8910fd<PointF> f13698o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path a() {
        return this.f;
    }

    public C6047cS(C3658bG c3658bG, C8910fd<PointF> c8910fd) {
        super(c3658bG, c8910fd.j, c8910fd.d, c8910fd.a, c8910fd.i, c8910fd.h, c8910fd.g, c8910fd.e);
        this.f13698o = c8910fd;
        e();
    }

    public void e() {
        boolean z;
        T t;
        T t2;
        T t3;
        T t4 = this.d;
        if (t4 != 0 && (t3 = this.j) != 0) {
            PointF pointF = (PointF) t4;
            if (((PointF) t3).equals(pointF.x, pointF.y)) {
                z = true;
                t = this.j;
                if (t != 0 || (t2 = this.d) == 0 || z) {
                    return;
                }
                C8910fd<PointF> c8910fd = this.f13698o;
                this.f = C8914fh.c((PointF) t, (PointF) t2, c8910fd.c, c8910fd.b);
                return;
            }
        }
        z = false;
        t = this.j;
        if (t != 0) {
        }
    }
}
