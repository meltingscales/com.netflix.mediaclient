package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import o.AbstractC5068brl;
import o.C5070brn;

/* renamed from: o.brw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5079brw {

    /* renamed from: o.brw$d */
    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract d a(float f);

        public abstract d a(long j);

        public abstract d a(String str);

        public abstract d b(float f);

        public abstract d b(long j);

        public abstract d c(float f);

        public abstract d c(int i);

        public abstract d c(long j);

        public abstract d c(String str);

        public abstract d d(float f);

        public abstract d d(long j);

        public abstract AbstractC5079brw d();

        public abstract d e(float f);

        public abstract d e(long j);

        public abstract d f(float f);

        public abstract d g(float f);

        public abstract d h(float f);

        public abstract d h(long j);

        public abstract d i(float f);

        public abstract d j(float f);

        public abstract d l(float f);

        public abstract d n(float f);

        public abstract d o(float f);
    }

    public abstract long a();

    public abstract float b();

    public abstract float c();

    public abstract long d();

    public abstract float e();

    public abstract float f();

    public abstract String g();

    public abstract float h();

    public abstract long i();

    public abstract long j();

    public abstract float k();

    public abstract float l();

    public abstract float m();

    public abstract float n();

    public abstract float o();

    public abstract int p();

    public abstract String q();

    public abstract long r();

    public abstract float s();

    public abstract long t();

    public abstract float u();

    public abstract float v();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d y() {
        return new AbstractC5068brl.b();
    }

    public static TypeAdapter<AbstractC5079brw> a(Gson gson) {
        return new C5070brn.b(gson);
    }

    public String x() {
        return C8118deO.a().toJson(this, AbstractC5079brw.class);
    }

    public AbstractC5079brw c(float f, float f2, long j, long j2, long j3, long j4, long j5, long j6, float f3, float f4, float f5, float f6, float f7) {
        long j7;
        long a = a();
        long d2 = d();
        d y = y();
        if (j2 > 0) {
            float f8 = (float) d2;
            float f9 = (float) (j2 - d2);
            float f10 = (float) j2;
            y.a((float) (Math.round(((((f() * f8) + (f9 * f)) / f10) * 100.0f) + 0.005d) / 100.0d)).o((float) (Math.round(((((s() * f8) + (f9 * f4)) / f10) * 100.0f) + 0.005d) / 100.0d)).c((float) (Math.round(((((c() * f8) + (f9 * f5)) / f10) * 100.0f) + 0.005d) / 100.0d)).e((float) (Math.round(((((e() * f8) + (f9 * f7)) / f10) * 100.0f) + 0.005d) / 100.0d));
            j7 = 0;
        } else {
            j7 = 0;
        }
        if (j > j7) {
            float f11 = (float) a;
            float f12 = (float) (j - a);
            float f13 = (float) j;
            y.n((float) (Math.round(((((u() * f11) + (f12 * f2)) / f13) * 100.0f) + 0.005d) / 100.0d)).b((float) (Math.round(((((b() * f11) + (f12 * f6)) / f13) * 100.0f) + 0.005d) / 100.0d)).l((float) (Math.round(((((v() * f11) + (f12 * f3)) / f13) * 100.0f) + 0.005d) / 100.0d));
        }
        y.c(q()).a(g()).c(p()).b(j).e(j2).h(j3).a(j4).c(j5).d(j6).i(Math.min(k(), f5)).f(Math.max(l(), f5)).j(Math.min(m(), f6)).d(Math.max(h(), f6)).h(Math.min(n(), f7)).g(Math.max(o(), f7));
        return y.d();
    }
}
