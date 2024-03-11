package o;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.bJv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3765bJv extends AbstractC3795bKy {
    private CharSequence h;
    private View.OnClickListener i;

    public final void e(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public final CharSequence l() {
        return this.h;
    }

    public final View.OnClickListener o() {
        return this.i;
    }

    public final void v_(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // o.AbstractC3795bKy, o.C3126at, o.AbstractC3336ax
    /* renamed from: d */
    public void e(C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        c2077aZ.b().setContentDescription(this.h);
        ViewGroup b = c2077aZ.b();
        View.OnClickListener onClickListener = this.i;
        b.setOnClickListener(onClickListener);
        b.setClickable(onClickListener != null);
        super.e(c2077aZ);
    }

    @Override // o.AbstractC3795bKy, o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        c2077aZ.b().setContentDescription(null);
        ViewGroup b = c2077aZ.b();
        b.setOnClickListener(null);
        b.setClickable(false);
        super.e(c2077aZ);
    }
}
