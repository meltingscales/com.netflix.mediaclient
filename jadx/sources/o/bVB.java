package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C4022bTi;

/* loaded from: classes4.dex */
public abstract class bVB extends AbstractC3336ax<e> {
    private CharSequence b;
    private View.OnClickListener c;
    private Integer d;
    private Integer g;
    private int h;
    private boolean i;
    private CharSequence j;

    public final void C_(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final void D_(CharSequence charSequence) {
        this.j = charSequence;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C4022bTi.a.A;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final void e(Integer num) {
        this.d = num;
    }

    public final Integer i() {
        return this.d;
    }

    public final int k() {
        return this.h;
    }

    public final CharSequence l() {
        return this.b;
    }

    public final View.OnClickListener m() {
        return this.c;
    }

    public final void m_(Integer num) {
        this.g = num;
    }

    public final CharSequence n() {
        return this.j;
    }

    public final Integer o() {
        return this.g;
    }

    public boolean q() {
        return this.i;
    }

    public bVB() {
        C1332Xp c1332Xp = C1332Xp.b;
        this.h = (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.d().setText(this.j);
        eVar.d().setFocusable(true);
        C1204Sr d = eVar.d();
        Integer num = this.g;
        d.setCompoundDrawablesRelativeWithIntrinsicBounds(num != null ? num.intValue() : 0, 0, 0, 0);
        eVar.d().setCompoundDrawablePadding(this.h);
        if (this.b == null) {
            C1204Sr d2 = eVar.d();
            View.OnClickListener onClickListener = this.c;
            d2.setOnClickListener(onClickListener);
            d2.setClickable(onClickListener != null);
        }
        Integer num2 = this.d;
        int intValue = num2 != null ? num2.intValue() : 0;
        eVar.a().setVisibility((this.b == null && intValue == 0) ? 8 : 0);
        C1203Sq a = eVar.a();
        CharSequence charSequence = this.b;
        if (charSequence == null) {
            charSequence = this.j;
        }
        a.setContentDescription(charSequence);
        eVar.a().setText(this.b);
        C1203Sq a2 = eVar.a();
        View.OnClickListener onClickListener2 = this.c;
        a2.setOnClickListener(onClickListener2);
        a2.setClickable(onClickListener2 != null);
        eVar.a().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, intValue, 0);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.d().setText((CharSequence) null);
        eVar.d().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        eVar.d().setCompoundDrawablePadding(0);
        C1204Sr d = eVar.d();
        d.setOnClickListener(null);
        d.setClickable(false);
        eVar.a().setVisibility(8);
        C1203Sq a = eVar.a();
        a.setOnClickListener(null);
        a.setClickable(false);
        eVar.a().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        super.b((bVB) eVar);
    }

    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(e.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "cta", "getCta()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        private final dsZ b = bIF.d(this, C4022bTi.e.j, false, 2, null);
        private final dsZ c = bIF.d(this, C4022bTi.e.g, false, 2, null);

        public final C1204Sr d() {
            return (C1204Sr) this.b.getValue(this, d[0]);
        }

        public final C1203Sq a() {
            return (C1203Sq) this.c.getValue(this, d[1]);
        }
    }
}
