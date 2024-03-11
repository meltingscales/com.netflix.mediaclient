package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.dP  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7880dP {
    private boolean c;
    private PointF d;
    private final List<C8103de> e;

    public PointF a() {
        return this.d;
    }

    public void c(boolean z) {
        this.c = z;
    }

    public List<C8103de> d() {
        return this.e;
    }

    public boolean e() {
        return this.c;
    }

    public C7880dP(PointF pointF, boolean z, List<C8103de> list) {
        this.d = pointF;
        this.c = z;
        this.e = new ArrayList(list);
    }

    public C7880dP() {
        this.e = new ArrayList();
    }

    public void e(float f, float f2) {
        if (this.d == null) {
            this.d = new PointF();
        }
        this.d.set(f, f2);
    }

    public void e(C7880dP c7880dP, C7880dP c7880dP2, float f) {
        if (this.d == null) {
            this.d = new PointF();
        }
        this.c = c7880dP.e() || c7880dP2.e();
        if (c7880dP.d().size() != c7880dP2.d().size()) {
            C8909fc.b("Curves must have the same number of control points. Shape 1: " + c7880dP.d().size() + "\tShape 2: " + c7880dP2.d().size());
        }
        int min = Math.min(c7880dP.d().size(), c7880dP2.d().size());
        if (this.e.size() < min) {
            for (int size = this.e.size(); size < min; size++) {
                this.e.add(new C8103de());
            }
        } else if (this.e.size() > min) {
            for (int size2 = this.e.size() - 1; size2 >= min; size2--) {
                List<C8103de> list = this.e;
                list.remove(list.size() - 1);
            }
        }
        PointF a = c7880dP.a();
        PointF a2 = c7880dP2.a();
        e(C8853eZ.b(a.x, a2.x, f), C8853eZ.b(a.y, a2.y, f));
        for (int size3 = this.e.size() - 1; size3 >= 0; size3--) {
            C8103de c8103de = c7880dP.d().get(size3);
            C8103de c8103de2 = c7880dP2.d().get(size3);
            PointF e = c8103de.e();
            PointF c = c8103de.c();
            PointF d = c8103de.d();
            PointF e2 = c8103de2.e();
            PointF c2 = c8103de2.c();
            PointF d2 = c8103de2.d();
            this.e.get(size3).e(C8853eZ.b(e.x, e2.x, f), C8853eZ.b(e.y, e2.y, f));
            this.e.get(size3).a(C8853eZ.b(c.x, c2.x, f), C8853eZ.b(c.y, c2.y, f));
            this.e.get(size3).d(C8853eZ.b(d.x, d2.x, f), C8853eZ.b(d.y, d2.y, f));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.e.size() + "closed=" + this.c + '}';
    }
}
