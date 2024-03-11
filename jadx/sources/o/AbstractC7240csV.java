package o;

import android.view.View;

/* renamed from: o.csV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7240csV extends AbstractC3336ax<e> {
    private View.OnClickListener b;
    public CharSequence c;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.M;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public final View.OnClickListener i() {
        return this.b;
    }

    public final CharSequence k() {
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.d().setText(k());
        eVar.d().setOnClickListener(this.b);
    }

    /* renamed from: o.csV$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3179au {
        public C1203Sq a;

        public final void a(C1203Sq c1203Sq) {
            C8632dsu.c((Object) c1203Sq, "");
            this.a = c1203Sq;
        }

        public final C1203Sq d() {
            C1203Sq c1203Sq = this.a;
            if (c1203Sq != null) {
                return c1203Sq;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.AbstractC3179au
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            View findViewById = view.findViewById(com.netflix.mediaclient.ui.R.g.bV);
            C8632dsu.a(findViewById, "");
            a((C1203Sq) findViewById);
        }
    }
}
