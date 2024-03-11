package o;

import android.content.Context;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

/* renamed from: o.Xy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1341Xy implements InterfaceC1338Xv {
    private final Context e;

    @Inject
    public C1341Xy(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.e = context;
    }

    @Override // o.InterfaceC1338Xv
    public boolean b() {
        return C8153dex.e(this.e);
    }
}
