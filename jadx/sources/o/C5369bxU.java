package o;

import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.WeakHashMap;

/* renamed from: o.bxU  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5369bxU implements InterfaceC5436byi {
    public static final d c = new d(null);
    private final b a;
    private WeakHashMap<View, Float> b;
    private final ProgressBar d;
    private final ViewPager2.PageTransformer e;
    private final Interpolator f;
    private final Interpolator g;
    private final ViewPager2 h;
    private final C5443byp i;
    private final animation.InterpolatorC5439byl j;
    private final C5435byh n;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(float f) {
        float f2 = -f;
        float f3 = 1;
        return f3 - (f2 >= 0.0f ? (f2 - 0.0f) / (f3 - 0.0f) : 0.0f);
    }

    public C5369bxU(ViewPager2 viewPager2, ProgressBar progressBar) {
        C8632dsu.c((Object) viewPager2, "");
        C8632dsu.c((Object) progressBar, "");
        this.h = viewPager2;
        this.d = progressBar;
        this.n = new C5435byh(viewPager2, 600L);
        this.i = new C5443byp();
        this.b = new WeakHashMap<>();
        this.f = new Interpolator() { // from class: o.bxT
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float d2;
                d2 = C5369bxU.d(f);
                return d2;
            }
        };
        this.g = new Interpolator() { // from class: o.bxV
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float c2;
                c2 = C5369bxU.c(f);
                return c2;
            }
        };
        this.j = new animation.InterpolatorC5439byl(50L, 533L, 600L, null, 8, null);
        b bVar = new b();
        this.a = bVar;
        ViewPager2.PageTransformer pageTransformer = new ViewPager2.PageTransformer() { // from class: o.bxX
            @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
            public final void transformPage(View view, float f) {
                C5369bxU.b(C5369bxU.this, view, f);
            }
        };
        this.e = pageTransformer;
        viewPager2.registerOnPageChangeCallback(bVar);
        viewPager2.setPageTransformer(pageTransformer);
    }

    /* renamed from: o.bxU$d */
    /* loaded from: classes6.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PageTransitionManager");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f) {
        C5443byp c5443byp = new C5443byp();
        float f2 = 1;
        float f3 = f2 - f;
        if (f3 < 0.5f) {
            return 0.0f;
        }
        return c5443byp.getInterpolation((f3 - 0.5f) / (f2 - 0.5f));
    }

    /* renamed from: o.bxU$b */
    /* loaded from: classes6.dex */
    public static final class b extends ViewPager2.OnPageChangeCallback {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            C5369bxU.this.d.setProgress((int) (((i / C5369bxU.this.b()) + (C5369bxU.this.j.getInterpolation(f) / C5369bxU.this.b())) * C5369bxU.this.d.getMax()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5369bxU c5369bxU, View view, float f) {
        C8632dsu.c((Object) c5369bxU, "");
        C8632dsu.c((Object) view, "");
        c5369bxU.e(view, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b() {
        RecyclerView.Adapter adapter = this.h.getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    private final void e(View view, float f) {
        float h;
        C5448byu e = C5448byu.e(view);
        C8632dsu.a(e, "");
        Float f2 = this.b.get(view);
        if (f2 == null) {
            f2 = Float.valueOf(0.0f);
        }
        C8632dsu.d(f2);
        float floatValue = f2.floatValue();
        if (f < -1.0f) {
            e.b.setTranslationX(0.0f);
            e.b.setAlpha(1.0f);
        } else if (f < 0.0f) {
            if (floatValue < f) {
                view.setTranslationX(0.0f);
                e.c.setTranslationX(0.0f);
                e.b.setTranslationX(0.0f);
                e.b.setAlpha(this.g.getInterpolation(f));
            } else {
                h = C8657dts.h((-((view.getWidth() * f) / 6.0f)) + ((1 + f) * view.getWidth() * 0.5f), view.getWidth() * (-f));
                view.setTranslationX(h);
                e.c.setTranslationX(0.0f);
                e.b.setTranslationX(0.0f);
                e.b.setAlpha(this.g.getInterpolation(f));
            }
        } else if (f <= 1.0f) {
            float interpolation = this.i.getInterpolation(f);
            view.setTranslationX((view.getWidth() / 3) * interpolation);
            float f3 = -interpolation;
            e.c.setTranslationX((view.getWidth() / 2) * f3);
            e.b.setTranslationX(f3 * (view.getWidth() / 3));
            e.b.setAlpha(this.f.getInterpolation(f));
        } else {
            e.b.setTranslationX(0.0f);
            e.b.setAlpha(1.0f);
        }
        this.b.put(view, Float.valueOf(f));
    }

    @Override // o.InterfaceC5436byi
    public boolean e(boolean z) {
        return this.n.a(z);
    }
}
