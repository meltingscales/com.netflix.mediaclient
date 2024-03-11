package o;

import android.view.ViewGroup;

/* loaded from: classes4.dex */
public abstract class bGU extends bJU {
    private Integer c;
    private Integer d;
    private Integer g;
    private Integer i;

    public final void a_(Integer num) {
        this.d = num;
    }

    public final void b_(Integer num) {
        this.c = num;
    }

    public final void c_(Integer num) {
        this.g = num;
    }

    public final void d_(Integer num) {
        this.i = num;
    }

    public final Integer i() {
        return this.d;
    }

    public final Integer l() {
        return this.c;
    }

    public final Integer m() {
        return this.g;
    }

    public final Integer n() {
        return this.i;
    }

    @Override // o.bJU, o.C3126at, o.AbstractC3336ax
    /* renamed from: d */
    public void e(C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        super.e(c2077aZ);
        ViewGroup.LayoutParams layoutParams = c2077aZ.b().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            Integer num = this.g;
            marginLayoutParams.setMarginStart(num != null ? num.intValue() : 0);
        }
        if (marginLayoutParams != null) {
            Integer num2 = this.c;
            marginLayoutParams.setMarginEnd(num2 != null ? num2.intValue() : 0);
        }
        if (marginLayoutParams != null) {
            Integer num3 = this.i;
            if (num3 == null) {
                num3 = 0;
            }
            marginLayoutParams.topMargin = num3.intValue();
        }
        if (marginLayoutParams != null) {
            Integer num4 = this.d;
            if (num4 == null) {
                num4 = 0;
            }
            marginLayoutParams.bottomMargin = num4.intValue();
        }
        if (marginLayoutParams != null) {
            c2077aZ.b().setLayoutParams(marginLayoutParams);
        }
    }
}
