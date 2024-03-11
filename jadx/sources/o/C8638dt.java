package o;

import android.graphics.PointF;
import java.util.List;

/* renamed from: o.dt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8638dt implements InterfaceC7643dA<PointF, PointF> {
    private final List<C8910fd<PointF>> a;

    @Override // o.InterfaceC7643dA
    public List<C8910fd<PointF>> c() {
        return this.a;
    }

    public C8638dt(List<C8910fd<PointF>> list) {
        this.a = list;
    }

    @Override // o.InterfaceC7643dA
    public boolean a() {
        return this.a.size() == 1 && this.a.get(0).g();
    }

    @Override // o.InterfaceC7643dA
    public AbstractC5913cN<PointF, PointF> b() {
        if (this.a.get(0).g()) {
            return new C6239cZ(this.a);
        }
        return new C6074cT(this.a);
    }
}
