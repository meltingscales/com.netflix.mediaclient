package o;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import o.C9834xU;

/* loaded from: classes4.dex */
public abstract class bKO extends AbstractC3336ax<bIG> {
    private Integer f;
    private int i;
    private int j;
    public static final e c = new e(null);
    public static final int d = 8;
    private static final int b = C9834xU.c.p;

    @Override // o.AbstractC3073as
    public int a() {
        return 0;
    }

    public final Integer i() {
        return this.f;
    }

    public final int k() {
        return this.j;
    }

    public final int m() {
        return this.i;
    }

    public bKO() {
        C1332Xp c1332Xp = C1332Xp.b;
        this.j = (int) TypedValue.applyDimension(1, 1, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        this.i = (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // o.AbstractC3073as
    public View d(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new View(viewGroup.getContext());
    }

    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
        }

        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public bIG b(ViewParent viewParent) {
        C8632dsu.c((Object) viewParent, "");
        return new c();
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(bIG big) {
        C8632dsu.c((Object) big, "");
        View r = big.r();
        ViewGroup.LayoutParams layoutParams = r.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.j;
            r.setLayoutParams(layoutParams);
            View r2 = big.r();
            int i = this.i;
            ViewGroup.LayoutParams layoutParams2 = r2.getLayoutParams();
            dpR dpr = null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                marginLayoutParams.topMargin = i;
                marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                marginLayoutParams.bottomMargin = i;
                marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
                marginLayoutParams.setMarginEnd(C9687vB.b(marginLayoutParams));
                r2.requestLayout();
            }
            Integer num = this.f;
            if (num != null) {
                big.r().setBackground(new ColorDrawable(num.intValue()));
                dpr = dpR.c;
            }
            if (dpr == null) {
                big.r().setBackgroundResource(b);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
