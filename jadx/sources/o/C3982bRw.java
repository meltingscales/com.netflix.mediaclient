package o;

import android.content.Context;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

/* renamed from: o.bRw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3982bRw implements bNV {
    private final Context e;

    @Inject
    public C3982bRw(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.e = context;
    }

    @Override // o.bNV
    public int b(C1729aMb c1729aMb) {
        C8632dsu.c((Object) c1729aMb, "");
        int a = c1729aMb.a();
        int i = c1729aMb.i() * 2;
        int i2 = this.e.getResources().getDisplayMetrics().widthPixels;
        int s = c1729aMb.s();
        if (c1729aMb.l() > 0.0f) {
            int i3 = i2 - a;
            return ((((i3 - ((int) (c1729aMb.l() * ((i3 / c1729aMb.m()) - i)))) / c1729aMb.m()) - i) * s) + (c1729aMb.i() * 2 * (s - 1));
        }
        return ((i2 - (a * 2)) / c1729aMb.m()) - i;
    }
}
