package com.netflix.mediaclient.hendrixconfig.impl;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C1555aFq;
import o.C1567aGb;
import o.C1596aHd;
import o.C8632dsu;
import o.C8691duz;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.MC;
import o.MF;
import o.aFY;
import o.dqE;

@Module
@InstallIn({MC.class})
/* loaded from: classes6.dex */
public final class CoreAccountConfigModule {
    @Provides
    public final C1555aFq b(@ApplicationContext Context context, MF mf) {
        boolean g;
        Map k;
        Throwable th;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) mf, "");
        C1567aGb c1567aGb = new C1567aGb(mf.d());
        g = C8691duz.g(c1567aGb.a());
        if (g) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd("SPY-35060 - User profile has a null or blank profile GUID", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c2 = dVar2.c();
            if (c2 != null) {
                c2.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
        return (C1555aFq) EntryPoints.get(aFY.b.e(context).e(c1567aGb), C1555aFq.class);
    }
}
