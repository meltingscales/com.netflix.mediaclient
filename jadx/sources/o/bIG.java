package o;

import android.view.View;

/* loaded from: classes4.dex */
public abstract class bIG extends AbstractC3179au {
    public View i;

    public void a(View view) {
        C8632dsu.c((Object) view, "");
    }

    public final void b(View view) {
        C8632dsu.c((Object) view, "");
        this.i = view;
    }

    public final View r() {
        View view = this.i;
        if (view != null) {
            return view;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3179au
    public final void e(View view) {
        C8632dsu.c((Object) view, "");
        b(view);
        a(view);
    }
}
