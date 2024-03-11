package o;

import o.C6863clN;

/* renamed from: o.clR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6867clR extends AbstractC3336ax<C6946cmr> {
    private String b = "";

    @Override // o.AbstractC3073as
    public int a() {
        return C6863clN.a.e;
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        this.b = str;
    }

    public final String i() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(C6946cmr c6946cmr) {
        C8632dsu.c((Object) c6946cmr, "");
        c6946cmr.e().setText(C1333Xq.d(com.netflix.mediaclient.ui.R.o.V).d("duration", this.b).c());
    }
}
