package o;

import android.content.Context;
import android.os.Build;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.features.api.FeatureExperience;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AdaptiveSearchPreQuery;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_BaselineUIPart1Complete;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Cdx;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_CfourSettingsScreenLinkEnabled_CfourPlan;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_CfourSettingsScreenLinkEnabled_RegularPlan;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Ddr;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_EnableBaselineAdultProfileAnimation;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Games;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_HomepageNuxKillSwitch;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_IpProbing;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_KidsBrandRealignment;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MediaResourceConstraints;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MyListActionsUsingGraphQL;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayIntegrity;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SimplifiedPlayerEpisodesListRepo;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Zuul;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.LinkedHashMap;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.XH;

/* renamed from: o.dex  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8153dex {
    public static final C8153dex d = new C8153dex();

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.dex$a */
    /* loaded from: classes5.dex */
    public interface a {
        boolean aJ();

        boolean aM();

        boolean aP();
    }

    /* renamed from: o.dex$e */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[LoMoType.values().length];
            try {
                iArr[LoMoType.ROAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            e = iArr;
        }
    }

    public static final boolean L() {
        return true;
    }

    public static final boolean M() {
        return true;
    }

    public static final boolean c() {
        return false;
    }

    private C8153dex() {
    }

    public static final boolean B() {
        return aQY.e.c() && !C8151dev.h();
    }

    public static final boolean W() {
        return p() && C8157dfA.b(AbstractApplicationC1040Mh.d(), "preference_debug_single_activity", false);
    }

    public final boolean aa() {
        return C8151dev.f();
    }

    public static final boolean A() {
        return C8171dfO.e();
    }

    public static final int e(boolean z) {
        return (!C8171dfO.e() || T()) ? z ? 21 : 11 : z ? 7 : 5;
    }

    public static final boolean d(LoMoType loMoType) {
        return C8171dfO.e() && loMoType != null && e.e[loMoType.ordinal()] == 1;
    }

    public static final int a() {
        return C8120deQ.a() ? 21 : 51;
    }

    public static final boolean b() {
        return C8171dfO.b();
    }

    public static final boolean p() {
        return C8206dfx.a();
    }

    public static final boolean g() {
        return C8151dev.h() || !Config_Ab55851_MobileNav.a.d().b();
    }

    public static final boolean o() {
        return !C8171dfO.e();
    }

    public static final boolean U() {
        return d.aa() || ConfigFastPropertyFeatureControlConfig.Companion.l();
    }

    public static final boolean Z() {
        return C1853aQr.a.e();
    }

    public static final boolean d() {
        return C8159dfC.b(AbstractApplicationC1040Mh.d());
    }

    public static final boolean e(Context context) {
        Throwable th;
        C8632dsu.c((Object) context, "");
        if (AbstractApplicationC1040Mh.getInstance().i().d() == null) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            C1596aHd c1596aHd = new C1596aHd("isAccountLiteEnabled: config is not ready", null, null, true, dqF.d(new LinkedHashMap()), false, false, 96, null);
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
        aOV d2 = AbstractApplicationC1040Mh.getInstance().i().d();
        if (d2 != null) {
            return d2.ai();
        }
        return true;
    }

    public static final boolean u() {
        return C8159dfC.b(AbstractApplicationC1040Mh.d());
    }

    public static final boolean s() {
        return u();
    }

    public static final boolean q() {
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        InterfaceC5283bvo j = k != null ? k.j() : null;
        return ((j != null ? j.getMaturityValue() : -1) < Config_FastProperty_Games.Companion.b() || j == null || j.isKidsProfile()) ? false : true;
    }

    public static final boolean y() {
        return C8159dfC.b(AbstractApplicationC1040Mh.d());
    }

    public static final boolean w() {
        return (!C8159dfC.b(AbstractApplicationC1040Mh.d()) || aQH.b.c() || aQO.c.a() || aQE.d.b() || C1867aRe.a.a()) ? false : true;
    }

    public static final boolean r() {
        return C4289bbh.d.a();
    }

    public static final boolean O() {
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k != null) {
            return C8632dsu.c(k.t(), Boolean.FALSE);
        }
        return false;
    }

    public static final boolean x() {
        C8153dex c8153dex = d;
        return c8153dex.ac() && !c8153dex.aa() && Config_FastProperty_HomepageNuxKillSwitch.Companion.c();
    }

    public final boolean ac() {
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k != null) {
            return k.w();
        }
        return false;
    }

    public static final boolean D() {
        XH.a aVar = XH.c;
        Context d2 = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d2, "");
        return aVar.d(d2).a().a();
    }

    public static final boolean h() {
        XH.a aVar = XH.c;
        Context d2 = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d2, "");
        return aVar.d(d2).d().d() == FeatureExperience.e;
    }

    public static final boolean z() {
        Config_FastProperty_IpProbing.a aVar = Config_FastProperty_IpProbing.Companion;
        if (aVar.d()) {
            return false;
        }
        return aVar.a();
    }

    public static final boolean K() {
        return Config_FastProperty_Zuul.Companion.c() && (t() || C8151dev.h() || l());
    }

    public static final boolean J() {
        return K() && (Config_FastProperty_Zuul.Companion.b() || n());
    }

    public static final boolean l() {
        return Config_FastProperty_Cdx.Companion.d() || aQM.e.d();
    }

    public static final boolean P() {
        return aQM.e.b().d();
    }

    public static final boolean n() {
        return l() && Config_FastProperty_Cdx.Companion.j();
    }

    public static final boolean I() {
        return !Config_FastProperty_PlayIntegrity.Companion.e();
    }

    public static final boolean t() {
        return Config_FastProperty_Ddr.Companion.c() && !C8151dev.h();
    }

    public static final boolean m() {
        String e2 = AbstractApplicationC1040Mh.getInstance().i().e();
        if (e2 == null || !e2.equals("US")) {
            return false;
        }
        if (h()) {
            return Config_FastProperty_CfourSettingsScreenLinkEnabled_CfourPlan.Companion.a();
        }
        return Config_FastProperty_CfourSettingsScreenLinkEnabled_RegularPlan.Companion.e();
    }

    public static final boolean C() {
        return Config_FastProperty_KidsBrandRealignment.Companion.c();
    }

    public static final boolean i() {
        return Config_FastProperty_AdaptiveSearchPreQuery.Companion.b() && !aQL.a.a();
    }

    public static final boolean e() {
        return !Config_FastProperty_MediaResourceConstraints.Companion.b();
    }

    public static final boolean k() {
        UserAgent k;
        return aQP.e.c() && (k = AbstractApplicationC1040Mh.getInstance().i().k()) != null && C8632dsu.c(k.t(), Boolean.FALSE);
    }

    public static final boolean G() {
        return f() && Build.VERSION.SDK_INT >= 25 && Config_FastProperty_EnableBaselineAdultProfileAnimation.Companion.a() && !Config_Ab55851_MobileNav.a.a();
    }

    public static final boolean e(InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        return C1866aRd.d.c().e() && !interfaceC5283bvo.isKidsProfile();
    }

    public static final boolean c(InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        return C1866aRd.d.c().a() && !interfaceC5283bvo.isKidsProfile();
    }

    public static final boolean f() {
        return Config_FastProperty_BaselineUIPart1Complete.Companion.c();
    }

    public static final boolean N() {
        return C1883aRu.d.e().d();
    }

    public static final boolean v() {
        return f() && Config_FastProperty_Games.Companion.d();
    }

    public static final boolean S() {
        return C1870aRh.a.a().a() || Config_Ab55851_MobileNav.a.d().c() || aQT.c.c().f();
    }

    public static final boolean Q() {
        Config_Ab55851_MobileNav.c cVar = Config_Ab55851_MobileNav.a;
        return cVar.d().j() || cVar.d().h();
    }

    public static final boolean R() {
        Config_Ab55851_MobileNav.c cVar = Config_Ab55851_MobileNav.a;
        return cVar.d().j() || cVar.d().h();
    }

    public static final boolean T() {
        return (!aQT.c.c().b() && Config_Ab55851_MobileNav.a.d().d() == null && C1870aRh.a.a().b() == null) ? false : true;
    }

    public static final boolean X() {
        return aQT.c.c().d() || Config_Ab55851_MobileNav.a.d().e() || C1870aRh.a.a().e();
    }

    public static final boolean E() {
        if (p()) {
            return C8157dfA.b(AbstractApplicationC1040Mh.d(), "debug_simplified_player_episodes_list_repo", true);
        }
        return Config_FastProperty_SimplifiedPlayerEpisodesListRepo.Companion.d();
    }

    public static final boolean V() {
        return aQE.d.b() || C1867aRe.a.c().e();
    }

    public static final boolean Y() {
        if (!C1867aRe.a.e()) {
            Context d2 = AbstractApplicationC1040Mh.d();
            C8632dsu.a(d2, "");
            if (!((a) EntryPointAccessors.fromApplication(d2, a.class)).aJ()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean ab() {
        return Config_FastProperty_MyListActionsUsingGraphQL.Companion.a() || C1864aRb.b.e();
    }

    public static final boolean H() {
        return C1884aRv.c.b();
    }

    public static final boolean F() {
        Context d2 = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d2, "");
        return ((a) EntryPointAccessors.fromApplication(d2, a.class)).aP();
    }

    public static final boolean j() {
        return C8151dev.h();
    }

    public static final boolean a(Context context) {
        C8632dsu.c((Object) context, "");
        return ((a) EntryPointAccessors.fromApplication(context, a.class)).aM();
    }
}
