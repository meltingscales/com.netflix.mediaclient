package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C1026Lt;
import o.C9834xU;

/* renamed from: o.Tt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1232Tt extends AbstractC3336ax<e> {
    private boolean b;
    private View.OnClickListener c;
    private CharSequence d;
    private boolean j;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.ar;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final void a_(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void a_(boolean z) {
        this.j = z;
    }

    public final void e(boolean z) {
        this.b = z;
    }

    public final CharSequence i() {
        return this.d;
    }

    public final View.OnClickListener m() {
        return this.c;
    }

    public final boolean n() {
        return this.b;
    }

    public final boolean o() {
        return this.j;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.c().setText(this.d);
        eVar.c().setSelected(this.b);
        if (this.b) {
            eVar.c().setTextAppearance(com.netflix.mediaclient.ui.R.l.e);
            eVar.c().setCompoundDrawablesWithIntrinsicBounds(C1026Lt.a.gd, 0, 0, 0);
            eVar.c().setPadding(0, 0, 0, 0);
        } else {
            eVar.c().setTextAppearance(com.netflix.mediaclient.ui.R.l.c);
            eVar.c().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            eVar.c().setPadding(eVar.r().getResources().getDimensionPixelSize(C9834xU.a.ak), 0, 0, 0);
        }
        C1203Sq c = eVar.c();
        View.OnClickListener onClickListener = this.c;
        c.setOnClickListener(onClickListener);
        c.setClickable(onClickListener != null);
        View a = eVar.a();
        if (a == null) {
            return;
        }
        a.setVisibility(this.j ? 0 : 8);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        C1203Sq c = eVar.c();
        c.setOnClickListener(null);
        c.setClickable(false);
    }

    /* renamed from: o.Tt$e */
    /* loaded from: classes3.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(e.class, "label", "getLabel()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0)), dsA.c(new PropertyReference1Impl(e.class, "divider", "getDivider()Landroid/view/View;", 0))};
        public static final int d = 8;
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.cP, false, 2, null);
        private final dsZ a = bIF.c(this, com.netflix.mediaclient.ui.R.g.fp);

        public final C1203Sq c() {
            return (C1203Sq) this.b.getValue(this, c[0]);
        }

        public final View a() {
            return (View) this.a.getValue(this, c[1]);
        }
    }
}
