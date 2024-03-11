package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes3.dex */
public abstract class TB extends AbstractC3336ax<d> {
    private boolean b;
    private CharSequence c;
    private View.OnClickListener d;
    private boolean f;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.br;
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public final void b(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void b_(boolean z) {
        this.f = z;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final boolean i() {
        return this.b;
    }

    public final View.OnClickListener l() {
        return this.d;
    }

    public final boolean n() {
        return this.f;
    }

    public final CharSequence o() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        C1203Sq c = dVar.c();
        c.setText(this.c);
        c.setVisibility(this.b ? 8 : 0);
        c.setTextAppearance(this.f ? com.netflix.mediaclient.ui.R.l.f : com.netflix.mediaclient.ui.R.l.h);
        c.setSelected(this.f);
        View.OnClickListener onClickListener = this.d;
        c.setOnClickListener(onClickListener);
        c.setClickable(onClickListener != null);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        C1203Sq c = dVar.c();
        c.setOnClickListener(null);
        c.setClickable(false);
    }

    /* loaded from: classes3.dex */
    public static final class d extends bIG {
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.cP, false, 2, null);
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(d.class, "label", "getLabel()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        public static final int a = 8;

        public final C1203Sq c() {
            return (C1203Sq) this.e.getValue(this, b[0]);
        }
    }
}
