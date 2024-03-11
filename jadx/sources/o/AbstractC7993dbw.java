package o;

import o.AbstractC3815bLr;

/* renamed from: o.dbw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7993dbw extends AbstractC3815bLr {
    private int d;

    public final int x() {
        return this.d;
    }

    public final void x_(int i) {
        this.d = i;
    }

    @Override // o.AbstractC3815bLr, o.AbstractC3336ax
    /* renamed from: a */
    public void e(AbstractC3815bLr.c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.e(cVar);
        cVar.e().setWidth(this.d);
    }

    @Override // o.AbstractC3073as
    public int Z_() {
        return super.Z_() * (-1);
    }
}
