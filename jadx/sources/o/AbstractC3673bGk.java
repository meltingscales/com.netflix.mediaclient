package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;

/* renamed from: o.bGk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3673bGk extends AbstractC3336ax<a> {
    private CharSequence b;
    private View.OnClickListener c;
    private CharSequence d;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.w;
    }

    public final void c_(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final void d(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final CharSequence i() {
        return this.d;
    }

    public final CharSequence l() {
        return this.b;
    }

    public final View.OnClickListener n() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        C1203Sq d = aVar.d();
        View.OnClickListener onClickListener = this.c;
        d.setOnClickListener(onClickListener);
        d.setClickable(onClickListener != null);
        aVar.d().setText(this.b);
        C1203Sq d2 = aVar.d();
        CharSequence charSequence = this.d;
        if (charSequence == null) {
            charSequence = this.b;
        }
        d2.setContentDescription(charSequence);
    }

    /* renamed from: o.bGk$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(a.class, "button", "getButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        private final dsZ c = bIF.d(this, C3670bGh.a.u, false, 2, null);

        public final C1203Sq d() {
            return (C1203Sq) this.c.getValue(this, e[0]);
        }
    }
}
