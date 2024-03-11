package com.netflix.mediaclient.ui.profiles;

import android.content.Context;
import android.content.Intent;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import o.AbstractApplicationC1040Mh;
import o.C1596aHd;
import o.C1641aIv;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5282bvn;
import o.InterfaceC5283bvo;
import o.cMP;
import o.cNT;
import o.dqE;

/* loaded from: classes4.dex */
public final class ProfileSelectionLauncherImpl implements cNT {
    public static final d d = new d(null);

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ProfileModule {
        @Binds
        cNT e(ProfileSelectionLauncherImpl profileSelectionLauncherImpl);
    }

    public static final boolean a(Intent intent) {
        return d.c(intent);
    }

    public static final String b(Intent intent) {
        return d.a(intent);
    }

    public static final boolean c(Intent intent) {
        return d.b(intent);
    }

    public static final String e(Intent intent) {
        return d.d(intent);
    }

    public static final void g(Intent intent) {
        d.f(intent);
    }

    public static final String h(Intent intent) {
        return d.h(intent);
    }

    public static final boolean i(Intent intent) {
        return d.e(intent);
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final String a(Intent intent) {
            C8632dsu.c((Object) intent, "");
            return intent.getStringExtra("extra_destination");
        }

        public final boolean e(Intent intent) {
            C8632dsu.c((Object) intent, "");
            return intent.getBooleanExtra("extra_edit_mode", false);
        }

        public final String d(Intent intent) {
            C8632dsu.c((Object) intent, "");
            return intent.getStringExtra("extra_select_profile_guid");
        }

        public final boolean b(Intent intent) {
            C8632dsu.c((Object) intent, "");
            return intent.getBooleanExtra("app_was_restarted", false);
        }

        public final boolean c(Intent intent) {
            C8632dsu.c((Object) intent, "");
            return intent.getBooleanExtra("extra_app_was_cold_started", false);
        }

        public final String h(Intent intent) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) intent, "");
            String stringExtra = intent.getStringExtra("extra_navigation_source");
            if (stringExtra == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("SPY-31873 - navigation source missing", null, null, true, k, false, false, 96, null);
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
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                return "UNKNOWN";
            }
            return stringExtra;
        }

        public final void f(Intent intent) {
            C8632dsu.c((Object) intent, "");
            intent.putExtra("extra_profiles_gate_passed", true);
        }
    }

    @Override // o.cNT
    public Intent b(NetflixActivityBase netflixActivityBase, AppView appView) {
        C8632dsu.c((Object) netflixActivityBase, "");
        C8632dsu.c((Object) appView, "");
        Intent putExtra = d(netflixActivityBase, appView, false, null).putExtra("app_was_restarted", true).putExtra("extra_app_was_cold_started", true);
        C8632dsu.a(putExtra, "");
        return putExtra;
    }

    @Override // o.cNT
    public Intent c(NetflixActivityBase netflixActivityBase, AppView appView) {
        C8632dsu.c((Object) netflixActivityBase, "");
        C8632dsu.c((Object) appView, "");
        Intent putExtra = d(netflixActivityBase, appView, false, null).putExtra("app_was_restarted", true);
        C8632dsu.a(putExtra, "");
        return putExtra;
    }

    @Override // o.cNT
    public Intent d(NetflixActivityBase netflixActivityBase, AppView appView) {
        C8632dsu.c((Object) netflixActivityBase, "");
        return d(netflixActivityBase, appView, false, null);
    }

    @Override // o.cNT
    public Intent c(NetflixActivityBase netflixActivityBase, AppView appView, boolean z) {
        C8632dsu.c((Object) netflixActivityBase, "");
        return d(netflixActivityBase, appView, z, null);
    }

    @Override // o.cNT
    public Intent e(NetflixActivityBase netflixActivityBase, AppView appView, boolean z, String str) {
        C8632dsu.c((Object) netflixActivityBase, "");
        return d(netflixActivityBase, appView, z, str);
    }

    private final Intent d(Context context, AppView appView, boolean z, String str) {
        if (appView == null) {
            appView = AppView.UNKNOWN;
        }
        Intent putExtra = new Intent(context, c()).addFlags(131072).putExtra("extra_navigation_source", appView.name());
        C8632dsu.a(putExtra, "");
        if (z) {
            putExtra.putExtra("extra_edit_mode", true);
        }
        if (str != null) {
            putExtra.putExtra("extra_select_profile_guid", str);
        }
        return putExtra;
    }

    @Override // o.cNT
    public boolean c(Intent intent, NetflixActivityBase netflixActivityBase, AppView appView) {
        UserAgent k;
        InterfaceC5283bvo j;
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) netflixActivityBase, "");
        C8632dsu.c((Object) appView, "");
        if (intent.getBooleanExtra("extra_profiles_gate_passed", false) || (k = AbstractApplicationC1040Mh.getInstance().i().k()) == null || (j = k.j()) == null || !j.isProfileLocked()) {
            return false;
        }
        NetflixApplication.getInstance().c(intent);
        netflixActivityBase.startActivity(d(netflixActivityBase, appView, false, null));
        return true;
    }

    private final Class<?> c() {
        return NetflixApplication.getInstance().M() ? cMP.class : ProfileSelectionActivity.class;
    }

    @Override // o.cNT
    public Intent c(NetflixActivityBase netflixActivityBase, AppView appView, AppView appView2) {
        C8632dsu.c((Object) netflixActivityBase, "");
        C8632dsu.c((Object) appView, "");
        Intent putExtra = d(netflixActivityBase, appView2, false, null).putExtra("extra_destination", appView.name());
        C8632dsu.a(putExtra, "");
        return putExtra;
    }

    @Override // o.cNT
    public void d(Intent intent) {
        C8632dsu.c((Object) intent, "");
        intent.addFlags(268435456).putExtra("app_was_restarted", true);
    }

    @Override // o.cNT
    public void e(Context context, InterfaceC5282bvn interfaceC5282bvn) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC5282bvn, "");
        Intent d2 = d(context, AppView.UNKNOWN, false, null);
        d(d2);
        C1641aIv.c(context, interfaceC5282bvn, d2);
    }

    @Override // o.cNT
    public void c(Context context, InterfaceC5282bvn interfaceC5282bvn) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC5282bvn, "");
        Intent d2 = d(context, AppView.UNKNOWN, false, null);
        d(d2);
        C1641aIv.c(context, interfaceC5282bvn, d2);
    }
}
