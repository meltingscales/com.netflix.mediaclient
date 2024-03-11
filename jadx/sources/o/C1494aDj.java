package o;

import android.content.Context;

/* renamed from: o.aDj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1494aDj extends AbstractC9054iO {
    private final C9120jb a;

    public C1494aDj(Context context, String str) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        this.a = new C9120jb(context, str, null, false, 12, null);
    }

    @Override // o.AbstractC9054iO
    public AbstractC9055iP b() {
        return new C1490aDf(this.a.b());
    }
}
