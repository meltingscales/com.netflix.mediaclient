package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public abstract class cXW extends AbstractC3336ax<e> {
    public View.OnClickListener b;
    private CharSequence c = "";

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.aS;
    }

    public final void b(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        this.c = charSequence;
    }

    public final CharSequence i() {
        return this.c;
    }

    public final View.OnClickListener l() {
        View.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            return onClickListener;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void e(e eVar) {
        boolean g;
        C8632dsu.c((Object) eVar, "");
        eVar.e().setOnClickListener(l());
        C1204Sr b = eVar.b();
        g = C8691duz.g(this.c);
        b.setVisibility(g ^ true ? 0 : 8);
        eVar.b().setText(this.c);
    }

    /* loaded from: classes5.dex */
    public static final class e extends bIG {
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.eu, false, 2, null);
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.aA, false, 2, null);
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(e.class, "billingDateDisclosureTextView", "getBillingDateDisclosureTextView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "confirmButton", "getConfirmButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        public static final int a = 8;

        public final C1204Sr b() {
            return (C1204Sr) this.b.getValue(this, d[0]);
        }

        public final C1203Sq e() {
            return (C1203Sq) this.e.getValue(this, d[1]);
        }
    }
}
