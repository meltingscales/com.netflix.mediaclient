package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import java.util.Set;
import o.AbstractC7773dEv;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aPc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1811aPc {
    public static final C1811aPc e = new C1811aPc();

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.aPc$d */
    /* loaded from: classes3.dex */
    public interface d {
        Set<aEZ> y();
    }

    private C1811aPc() {
    }

    public static final boolean b(C1814aPf c1814aPf) {
        if (c1814aPf != null) {
            return c1814aPf.L();
        }
        return true;
    }

    public static final void a(Context context, ConfigData configData) {
        boolean g;
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) configData, "");
        String hendrixConfig = configData.getHendrixConfig();
        if (hendrixConfig != null) {
            g = C8691duz.g(hendrixConfig);
            if (g) {
                return;
            }
            AbstractC7773dEv.e eVar = AbstractC7773dEv.a;
            String hendrixConfig2 = configData.getHendrixConfig();
            C8632dsu.a(hendrixConfig2, "");
            dEP c = dEG.c(eVar.e(hendrixConfig2));
            for (aEZ aez : ((d) EntryPointAccessors.fromApplication(context, d.class)).y()) {
                try {
                    aez.d(c);
                } catch (Exception e2) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str = "onHendrixConfigurationsFetched failed for " + dsA.a(aez.getClass()).b();
                    ErrorType errorType = ErrorType.g;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd(str, e2, errorType, true, k, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd.a;
                    if (errorType2 != null) {
                        c1596aHd.e.put("errorType", errorType2.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType2.c() + " " + b);
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
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        }
    }
}
