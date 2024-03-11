package o;

import o.C6863clN;

/* renamed from: o.clV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6871clV extends AbstractC3336ax<C6946cmr> {
    private String c = "";
    private String b = "";

    public final void V_(String str) {
        C8632dsu.c((Object) str, "");
        this.c = str;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C6863clN.a.b;
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        this.b = str;
    }

    public final String i() {
        return this.b;
    }

    public final String k() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void e(C6946cmr c6946cmr) {
        C8632dsu.c((Object) c6946cmr, "");
        c6946cmr.e().setText(C1333Xq.d(com.netflix.mediaclient.ui.R.o.ab).d("price", this.c).d("duration", this.b).c());
    }
}
