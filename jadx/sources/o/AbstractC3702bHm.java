package o;

import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.util.AccessibilityUtils;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;

/* renamed from: o.bHm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3702bHm extends AbstractC3336ax<e> {
    private View.OnClickListener b;
    private CharSequence c;
    private Integer d;
    private int f;
    private CharSequence h;
    private int i;
    private Integer j;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.h;
    }

    public final void b(Integer num) {
        this.d = num;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public final void e_(Integer num) {
        this.j = num;
    }

    public final CharSequence i() {
        return this.c;
    }

    public final int k() {
        return this.i;
    }

    public final void k_(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final Integer l() {
        return this.j;
    }

    public final void l_(CharSequence charSequence) {
        this.h = charSequence;
    }

    public final Integer m() {
        return this.d;
    }

    public final int n() {
        return this.f;
    }

    public final View.OnClickListener o() {
        return this.b;
    }

    public final CharSequence r() {
        return this.h;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.c().setText(this.h);
        Integer num = this.d;
        if (num != null) {
            int intValue = num.intValue();
            C1204Sr c = eVar.c();
            ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                marginLayoutParams.topMargin = marginLayoutParams.topMargin;
                marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(intValue);
                marginLayoutParams.setMarginEnd(intValue);
                c.requestLayout();
            }
        }
        C1204Sr c2 = eVar.c();
        c2.setPadding(c2.getPaddingLeft(), this.i, c2.getPaddingRight(), this.f);
        Integer num2 = this.j;
        if (num2 != null) {
            eVar.c().setMaxLines(num2.intValue());
        }
        C1204Sr c3 = eVar.c();
        View.OnClickListener onClickListener = this.b;
        c3.setOnClickListener(onClickListener);
        c3.setClickable(onClickListener != null);
        AccessibilityUtils.e(eVar.c(), null, null, this.c, 3, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.c().setMaxLines(Integer.MAX_VALUE);
        C1204Sr c = eVar.c();
        ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
            marginLayoutParams.topMargin = marginLayoutParams.topMargin;
            marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
            marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            c.requestLayout();
        }
    }

    /* renamed from: o.bHm$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(e.class, "textView", "getTextView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ b = bIF.d(this, C3670bGh.a.q, false, 2, null);

        public final C1204Sr c() {
            return (C1204Sr) this.b.getValue(this, a[0]);
        }
    }
}
