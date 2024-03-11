package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;
import o.aLX;

/* loaded from: classes4.dex */
public abstract class bJG extends AbstractC3336ax<a> {
    private boolean b;
    private View.OnClickListener c;
    private CharSequence d;
    private CharSequence i;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.i;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final View.OnClickListener k() {
        return this.c;
    }

    public final boolean l() {
        return this.b;
    }

    public final CharSequence o() {
        return this.d;
    }

    public final CharSequence t() {
        return this.i;
    }

    public final void w_(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void x_(CharSequence charSequence) {
        this.i = charSequence;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.c().setText(this.d);
        aVar.c().setVisibility(this.d == null ? 8 : 0);
        aVar.d().setText(this.i);
        aVar.d().setOnClickListener(this.c);
        aVar.d().setVisibility(this.c != null ? 0 : 8);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.c().setOnClickListener(null);
    }

    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(a.class, "text", "getText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "retry", "getRetry()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        public static final int d = 8;
        private final dsZ a = bIF.d(this, C3796bKz.a.w, false, 2, null);
        private final dsZ b = bIF.d(this, C3796bKz.a.r, false, 2, null);

        public final C1204Sr c() {
            return (C1204Sr) this.a.getValue(this, c[0]);
        }

        public final C1203Sq d() {
            return (C1203Sq) this.b.getValue(this, c[1]);
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            super.a(view);
            view.setTag(aLX.a.e, Boolean.TRUE);
        }
    }
}
