package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import o.C3796bKz;

/* renamed from: o.bLf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3803bLf extends AbstractC3336ax<c> {
    private Integer b;
    private CharSequence c;
    private Integer f;
    private Integer h;
    private Integer i;
    private Integer j;
    private CharSequence m;
    private View.OnClickListener n;
    private boolean g = true;
    private boolean d = true;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.C;
    }

    public final void b(boolean z) {
        this.g = z;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public final void d(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final CharSequence i() {
        return this.c;
    }

    public final void i_(Integer num) {
        this.h = num;
    }

    public final void j_(Integer num) {
        this.i = num;
    }

    public final boolean k() {
        return this.d;
    }

    public final Integer l() {
        return this.b;
    }

    public final Integer m() {
        return this.h;
    }

    public final Integer n() {
        return this.f;
    }

    public final Integer o() {
        return this.j;
    }

    public final boolean p() {
        return this.g;
    }

    public final CharSequence q() {
        return this.m;
    }

    public final void q_(Integer num) {
        this.f = num;
    }

    public final Integer r() {
        return this.i;
    }

    public final View.OnClickListener s() {
        return this.n;
    }

    public final void y_(CharSequence charSequence) {
        this.m = charSequence;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        boolean z = this.d;
        CharSequence charSequence = this.m;
        CharSequence charSequence2 = this.c;
        if (charSequence2 == null) {
            charSequence2 = charSequence;
        }
        cVar.c(z, charSequence, charSequence2, this.j);
        C1203Sq c2 = cVar.c();
        Integer num = this.h;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = this.i;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = this.f;
        int intValue3 = num3 != null ? num3.intValue() : 0;
        Integer num4 = this.b;
        c2.setCompoundDrawablesRelativeWithIntrinsicBounds(intValue, intValue2, intValue3, num4 != null ? num4.intValue() : 0);
        cVar.c().setEnabled(this.g);
        C1203Sq c3 = cVar.c();
        View.OnClickListener onClickListener = this.n;
        c3.setOnClickListener(onClickListener);
        c3.setClickable(onClickListener != null);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        C1203Sq c2 = cVar.c();
        c2.setOnClickListener(null);
        c2.setClickable(false);
        super.b((AbstractC3803bLf) cVar);
    }

    /* renamed from: o.bLf$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        private C1203Sq c;
        private int d;

        public final C1203Sq c() {
            C1203Sq c1203Sq = this.c;
            if (c1203Sq != null) {
                return c1203Sq;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            C1203Sq c1203Sq = (C1203Sq) view.findViewById(C3796bKz.a.c);
            if (c1203Sq == null) {
                c1203Sq = (C1203Sq) view;
            }
            this.c = c1203Sq;
            this.d = c().getCompoundDrawablePadding();
        }

        public final void c(boolean z, CharSequence charSequence, CharSequence charSequence2, Integer num) {
            if (z && charSequence != null && charSequence.length() != 0) {
                c().setCompoundDrawablePadding(num != null ? num.intValue() : this.d);
                c().setText(charSequence);
            } else {
                C1203Sq c = c();
                C1332Xp c1332Xp = C1332Xp.b;
                c.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 0, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
                c().setText((CharSequence) null);
            }
            c().setContentDescription(charSequence2);
        }
    }
}
