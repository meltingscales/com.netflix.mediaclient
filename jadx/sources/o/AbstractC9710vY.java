package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import o.C9795wi;

/* renamed from: o.vY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9710vY extends AbstractC9944zY<AbstractC9791we> {
    public static final c b = new c(null);
    private final float[] a;
    private final float[] c;
    private final float[] d;
    private final float[] e;
    private final float[] f;
    private final View g;
    private final float[] h;
    private final float[] i;
    private final Resources j;
    private final C8174dfR k;
    private final float[] l;
    private final float[] m;
    private final float[] n;

    /* renamed from: o  reason: collision with root package name */
    private final float[] f13903o;

    public final float[] j_() {
        return this.a;
    }

    public final float[] k_() {
        return this.d;
    }

    public final float[] l_() {
        return this.i;
    }

    public final float[] m_() {
        return this.e;
    }

    public final float[] n() {
        return this.h;
    }

    public final float[] n_() {
        return this.c;
    }

    public final View o_() {
        return this.g;
    }

    public final C8174dfR p() {
        return this.k;
    }

    public final float[] p_() {
        return this.f;
    }

    public final float[] q() {
        return this.n;
    }

    public final float[] q_() {
        return this.f13903o;
    }

    public final float[] r_() {
        return this.m;
    }

    public final float[] s() {
        return this.l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9710vY(View view) {
        super(view);
        float b2;
        float b3;
        float b4;
        float b5;
        C8632dsu.c((Object) view, "");
        this.g = view;
        C1332Xp c1332Xp = C1332Xp.b;
        Resources resources = ((Context) C1332Xp.b(Context.class)).getResources();
        this.j = resources;
        this.n = new float[]{resources.getDimension(C9795wi.c.p), resources.getDimension(C9795wi.c.q)};
        this.f13903o = new float[]{resources.getDimension(C9795wi.c.l), resources.getDimension(C9795wi.c.k)};
        C8632dsu.a(resources, "");
        b2 = C9789wc.b(resources, C9795wi.c.r);
        C8632dsu.a(resources, "");
        b3 = C9789wc.b(resources, C9795wi.c.t);
        this.l = new float[]{b2, b3};
        C8632dsu.a(resources, "");
        b4 = C9789wc.b(resources, C9795wi.c.n);
        C8632dsu.a(resources, "");
        b5 = C9789wc.b(resources, C9795wi.c.f13905o);
        this.m = new float[]{b4, b5};
        this.f = new float[]{0.0f, 180.0f};
        this.a = new float[]{0.0f, 1.0f};
        this.h = new float[]{1.0f, 2.0f};
        this.e = new float[]{0.0f, 0.0f};
        this.c = new float[]{resources.getDimension(C9795wi.c.d), resources.getDimension(C9795wi.c.h)};
        this.d = new float[]{resources.getDimension(C9795wi.c.c), resources.getDimension(C9795wi.c.e)};
        this.i = new float[]{(int) TypedValue.applyDimension(1, 200, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), 0.0f};
        this.k = new C8174dfR();
    }

    /* renamed from: o.vY$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    public final float e(float[] fArr, float f) {
        C8632dsu.c((Object) fArr, "");
        float f2 = fArr[0];
        return f2 + (f * (fArr[1] - f2));
    }

    public final float a(float[] fArr, float f) {
        C8632dsu.c((Object) fArr, "");
        float f2 = fArr[0];
        return f2 + (f * f * f * (fArr[1] - f2));
    }

    public final float c(float[] fArr, float f) {
        C8632dsu.c((Object) fArr, "");
        float f2 = fArr[0];
        return f2 + (f * f * f * f * (fArr[1] - f2));
    }

    public final void c(float f, View... viewArr) {
        C8632dsu.c((Object) viewArr, "");
        float f2 = f <= 0.1f ? 1.0f - (f * 10) : f >= 0.9f ? 10 * (f - 0.9f) : 0.0f;
        for (View view : viewArr) {
            if (view != null) {
                view.setAlpha(f2);
            }
        }
    }
}
