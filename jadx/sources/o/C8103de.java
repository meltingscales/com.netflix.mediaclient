package o;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* renamed from: o.de  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8103de {
    private final PointF a;
    private final PointF b;
    private final PointF d;

    public PointF c() {
        return this.b;
    }

    public PointF d() {
        return this.a;
    }

    public PointF e() {
        return this.d;
    }

    public C8103de() {
        this.d = new PointF();
        this.b = new PointF();
        this.a = new PointF();
    }

    public C8103de(PointF pointF, PointF pointF2, PointF pointF3) {
        this.d = pointF;
        this.b = pointF2;
        this.a = pointF3;
    }

    public void e(float f, float f2) {
        this.d.set(f, f2);
    }

    public void a(float f, float f2) {
        this.b.set(f, f2);
    }

    public void d(float f, float f2) {
        this.a.set(f, f2);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.a.x), Float.valueOf(this.a.y), Float.valueOf(this.d.x), Float.valueOf(this.d.y), Float.valueOf(this.b.x), Float.valueOf(this.b.y));
    }
}
