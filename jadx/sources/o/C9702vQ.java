package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C9834xU;

/* renamed from: o.vQ */
/* loaded from: classes.dex */
public final class C9702vQ {
    private static final Map<String, ViewOutlineProvider> c = new LinkedHashMap();

    public static final boolean c(View view) {
        C8632dsu.c((Object) view, "");
        return (view.getWindowSystemUiVisibility() & 4096) == 4096;
    }

    public static final void a(View view, float f) {
        C8632dsu.c((Object) view, "");
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public static final void e(final View view) {
        C8632dsu.c((Object) view, "");
        if (view.isInLayout()) {
            view.post(new Runnable() { // from class: o.vS
                @Override // java.lang.Runnable
                public final void run() {
                    C9702vQ.j(view);
                }
            });
        } else {
            view.requestLayout();
        }
    }

    public static final void j(View view) {
        C8632dsu.c((Object) view, "");
        view.requestLayout();
    }

    public static final void c(View view, int i) {
        C8632dsu.c((Object) view, "");
        C9870yD.d(view, i, i, i, i);
    }

    public static final void c(CompoundButton compoundButton, ColorStateList colorStateList) {
        C8632dsu.c((Object) compoundButton, "");
        compoundButton.setCompoundDrawableTintList(colorStateList);
    }

    static /* synthetic */ String a(Integer num, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        return e(num, z, z2, z3);
    }

    private static final String e(Integer num, boolean z, boolean z2, boolean z3) {
        return num + "|" + z + "|" + z2 + "|" + z3;
    }

    public static /* synthetic */ void d(View view, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = view.getResources().getDimensionPixelSize(C9834xU.a.s);
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        a(view, i, z, z2);
    }

    public static final void a(View view, int i, boolean z, boolean z2) {
        C8632dsu.c((Object) view, "");
        ViewOutlineProvider c2 = c(i, z, z2);
        if (c2 != null) {
            view.setClipToOutline(true);
        } else {
            c2 = null;
        }
        view.setOutlineProvider(c2);
    }

    public static final void c(View view, C9686vA c9686vA) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) c9686vA, "");
        a(view, c9686vA.a(), c9686vA.e(), c9686vA.b());
    }

    public static final void a(View view) {
        C8632dsu.c((Object) view, "");
        ViewOutlineProvider a2 = a();
        view.setClipToOutline(true);
        view.setOutlineProvider(a2);
    }

    private static final ViewOutlineProvider c(int i, boolean z, boolean z2) {
        if (i > 0) {
            String a2 = a(Integer.valueOf(i), z, z2, false, 8, null);
            Map<String, ViewOutlineProvider> map = c;
            ViewOutlineProvider viewOutlineProvider = map.get(a2);
            if (viewOutlineProvider == null) {
                a aVar = new a(z, i, z2);
                map.put(a2, aVar);
                return aVar;
            }
            return viewOutlineProvider;
        }
        return null;
    }

    /* renamed from: o.vQ$a */
    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        private final Rect e = new Rect();

        a(boolean z, int i, boolean z2) {
            this.b = z;
            this.a = i;
            this.c = z2;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) outline, "");
            int measuredHeight = view.getMeasuredHeight() - view.getPaddingBottom();
            this.e.top = this.b ? view.getPaddingTop() - this.a : view.getPaddingTop();
            this.e.left = view.getPaddingLeft();
            this.e.right = view.getMeasuredWidth() - view.getPaddingRight();
            Rect rect = this.e;
            if (this.c) {
                measuredHeight += this.a;
            }
            rect.bottom = measuredHeight;
            outline.setRoundRect(rect, this.a);
        }
    }

    private static final ViewOutlineProvider a() {
        String a2 = a(null, false, false, true, 7, null);
        Map<String, ViewOutlineProvider> map = c;
        ViewOutlineProvider viewOutlineProvider = map.get(a2);
        if (viewOutlineProvider == null) {
            d dVar = new d();
            map.put(a2, dVar);
            return dVar;
        }
        return viewOutlineProvider;
    }

    /* renamed from: o.vQ$d */
    /* loaded from: classes.dex */
    public static final class d extends ViewOutlineProvider {
        private final Rect a = new Rect();

        d() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) outline, "");
            this.a.top = view.getPaddingTop();
            this.a.left = view.getPaddingLeft();
            this.a.right = view.getMeasuredWidth() - view.getPaddingRight();
            this.a.bottom = view.getMeasuredHeight() - view.getPaddingBottom();
            Rect rect = this.a;
            outline.setRoundRect(rect, (rect.height() + this.a.height()) / 4.0f);
        }
    }

    public static final void d(View view, boolean z, int i, int i2) {
        C8632dsu.c((Object) view, "");
        Context context = view.getContext();
        if (z) {
            i = i2;
        }
        view.setBackgroundColor(ContextCompat.getColor(context, i));
    }

    public static final dpR d(View view) {
        C8632dsu.c((Object) view, "");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
            return dpR.c;
        }
        return null;
    }

    public static final void e(final View view, final drO<dpR> dro) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) dro, "");
        view.measure(-1, -2);
        final int measuredHeight = view.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        ValueAnimator duration = ValueAnimator.ofInt(0, measuredHeight).setDuration(300L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.vP
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9702vQ.c(view, measuredHeight, dro, valueAnimator);
            }
        });
        duration.start();
    }

    public static final void c(View view, int i, drO dro, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C8632dsu.d(animatedValue);
        layoutParams.height = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
        if (C8632dsu.c(animatedValue, Integer.valueOf(i))) {
            view.getLayoutParams().height = -2;
            dro.invoke();
        }
    }

    public static final void d(final View view, final drO<dpR> dro) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) dro, "");
        ValueAnimator duration = ValueAnimator.ofInt(view.getMeasuredHeight(), 0).setDuration(300L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.vT
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9702vQ.d(view, dro, valueAnimator);
            }
        });
        duration.start();
    }

    public static final void d(View view, drO dro, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C8632dsu.d(animatedValue);
        layoutParams.height = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
        if (C8632dsu.c(animatedValue, (Object) 0)) {
            view.setVisibility(8);
            dro.invoke();
        }
    }
}
