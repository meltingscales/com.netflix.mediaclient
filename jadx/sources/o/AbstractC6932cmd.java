package o;

import o.C6863clN;

/* renamed from: o.cmd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6932cmd extends AbstractC3336ax<C6946cmr> {
    private String b = "";

    @Override // o.AbstractC3073as
    public int a() {
        return C6863clN.a.d;
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
        c6946cmr.e().setText(C1333Xq.d(com.netflix.mediaclient.ui.R.o.aa).d("percent", this.b).c());
    }
}
