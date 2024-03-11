package o;

import android.app.Activity;

/* renamed from: o.cAn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5522cAn implements InterfaceC5523cAo {
    private final Activity a;

    public C5522cAn(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.a = activity;
    }

    @Override // o.InterfaceC5523cAo
    public InterfaceC7613czX c(C9935zP c9935zP, boolean z) {
        C8632dsu.c((Object) c9935zP, "");
        return new C5512cAd(this.a, c9935zP, z);
    }
}
