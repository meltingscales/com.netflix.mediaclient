package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: o.ceV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6500ceV extends AbstractC3336ax<c> {
    private CharSequence b;
    public View.OnClickListener c;
    private CharSequence d;
    private CharSequence f;

    public final void E_(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final void F_(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void G_(CharSequence charSequence) {
        this.f = charSequence;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.y;
    }

    public final CharSequence i() {
        return this.b;
    }

    public final CharSequence n() {
        return this.f;
    }

    public final CharSequence o() {
        return this.d;
    }

    public final View.OnClickListener m() {
        View.OnClickListener onClickListener = this.c;
        if (onClickListener != null) {
            return onClickListener;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.e((AbstractC6500ceV) cVar);
        cVar.d().setText(this.b);
        cVar.c().setOnClickListener(m());
        cVar.e().setText(this.d);
        cVar.e().setVisibility(cVar.e().length() > 0 ? 0 : 8);
        cVar.a().setText(this.f);
        cVar.a().setVisibility(cVar.a().length() <= 0 ? 8 : 0);
    }

    /* renamed from: o.ceV$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(c.class, "castDeviceNameText", "getCastDeviceNameText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "castMainText", "getCastMainText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "castDetailsText", "getCastDetailsText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "castDisconnectButton", "getCastDisconnectButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        public static final int e = 8;
        private final dsZ a = bIF.d(this, com.netflix.mediaclient.ui.R.g.al, false, 2, null);
        private final dsZ g = bIF.d(this, com.netflix.mediaclient.ui.R.g.ai, false, 2, null);
        private final dsZ d = bIF.d(this, com.netflix.mediaclient.ui.R.g.ak, false, 2, null);
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.aj, false, 2, null);

        public final C1204Sr d() {
            return (C1204Sr) this.a.getValue(this, c[0]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.g.getValue(this, c[1]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.d.getValue(this, c[2]);
        }

        public final C1203Sq c() {
            return (C1203Sq) this.b.getValue(this, c[3]);
        }
    }
}
