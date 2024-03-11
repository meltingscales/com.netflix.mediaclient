package o;

import androidx.activity.OnBackPressedCallback;

/* loaded from: classes5.dex */
public final class L extends OnBackPressedCallback {
    public drO<dpR> e;

    public final void d(drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        this.e = dro;
    }

    public L(boolean z) {
        super(z);
    }

    public final drO<dpR> c() {
        drO<dpR> dro = this.e;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackPressed() {
        c().invoke();
    }
}
