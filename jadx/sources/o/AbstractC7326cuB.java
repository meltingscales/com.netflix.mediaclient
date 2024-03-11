package o;

import android.view.View;

/* renamed from: o.cuB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7326cuB extends AbstractC3336ax<e> {
    public CharSequence d;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.Q;
    }

    public final CharSequence i() {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.c().setText(i());
    }

    /* renamed from: o.cuB$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3179au {
        public C1204Sr d;

        public final void a(C1204Sr c1204Sr) {
            C8632dsu.c((Object) c1204Sr, "");
            this.d = c1204Sr;
        }

        public final C1204Sr c() {
            C1204Sr c1204Sr = this.d;
            if (c1204Sr != null) {
                return c1204Sr;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.AbstractC3179au
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            a((C1204Sr) view);
        }
    }
}
