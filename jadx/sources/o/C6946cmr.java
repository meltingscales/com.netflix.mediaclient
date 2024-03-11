package o;

import android.view.View;

/* renamed from: o.cmr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6946cmr extends AbstractC3179au {
    public C1204Sr c;

    public final void b(C1204Sr c1204Sr) {
        C8632dsu.c((Object) c1204Sr, "");
        this.c = c1204Sr;
    }

    public final C1204Sr e() {
        C1204Sr c1204Sr = this.c;
        if (c1204Sr != null) {
            return c1204Sr;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3179au
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        b((C1204Sr) view);
    }
}
