package o;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import o.C7344cuT;
import o.C9764wZ;
import o.InterfaceC7343cuS;
import o.aQJ;

/* renamed from: o.cuQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7341cuQ implements InterfaceC7343cuS {
    public static final b d = new b(null);
    public static final int e = 8;
    private final C7344cuT a;
    private C9843xd b;
    private final Context c;
    private final InterfaceC5283bvo j;

    @Override // o.InterfaceC7343cuS
    public void b(Context context) {
        C8632dsu.c((Object) context, "");
    }

    @Override // o.InterfaceC7343cuS
    public boolean d(Context context) {
        C8632dsu.c((Object) context, "");
        return false;
    }

    public C7341cuQ(Context context, InterfaceC5283bvo interfaceC5283bvo, C7344cuT c7344cuT) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C8632dsu.c((Object) c7344cuT, "");
        this.c = context;
        this.j = interfaceC5283bvo;
        this.a = c7344cuT;
    }

    /* renamed from: o.cuQ$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("TutorialHelperImpl");
        }
    }

    @Override // o.InterfaceC7343cuS
    public boolean c(InterfaceC7343cuS.d dVar, Activity activity, ServiceManager serviceManager) {
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) serviceManager, "");
        if (NetflixActivity.isTutorialOn() && !C9851xl.d.d(this.c) && e(serviceManager)) {
            b(dVar);
            return c(activity);
        }
        return false;
    }

    @Override // o.InterfaceC7343cuS
    public boolean d(ServiceManager serviceManager, boolean z) {
        C8632dsu.c((Object) serviceManager, "");
        return C8153dex.B() && NetflixActivity.isTutorialOn() && e(serviceManager) && !C9764wZ.b.a(this.c, "USER_TUTORIAL_MY_PROFILE_DOWNLOADS_BUTTON");
    }

    @Override // o.InterfaceC7343cuS
    public boolean h() {
        if (this.j.isKidsProfile()) {
            return false;
        }
        return NetflixActivity.isTutorialOn() && this.a.e("USER_NUX_HOMEPAGE", true);
    }

    @Override // o.InterfaceC7343cuS
    public void a() {
        this.a.d("USER_NUX_HOMEPAGE", false);
        if (C8153dex.B()) {
            C9764wZ.c cVar = C9764wZ.b;
            Context context = this.c;
            C7344cuT.b bVar = C7344cuT.c;
            String profileGuid = this.j.getProfileGuid();
            C8632dsu.a(profileGuid, "");
            cVar.c(context, bVar.a("USER_TUTORIAL_MY_PROFILE_DOWNLOADS_BUTTON", profileGuid));
        }
    }

    @Override // o.InterfaceC7343cuS
    public void b(boolean z) {
        this.a.d("USER_UMA_TOOLTIP", z);
    }

    @Override // o.InterfaceC7343cuS
    public boolean g() {
        return NetflixActivity.isTutorialOn() && this.a.e("USER_AFTER_FIRST_RATING", true);
    }

    @Override // o.InterfaceC7343cuS
    public void d() {
        this.a.d("USER_AFTER_FIRST_RATING", false);
    }

    @Override // o.InterfaceC7343cuS
    public boolean f() {
        return NetflixActivity.isTutorialOn() && Config_Ab55851_MobileNav.a.d().o() && this.a.e("USER_HOME_AND_SEARCH_MOVED", true);
    }

    @Override // o.InterfaceC7343cuS
    public void b() {
        this.a.d("USER_HOME_AND_SEARCH_MOVED", false);
    }

    @Override // o.InterfaceC7343cuS
    public boolean e() {
        if (NetflixActivity.isTutorialOn()) {
            aQJ.a aVar = aQJ.e;
            if (aVar.a().e() && aVar.a().c() && this.a.e("USER_PLAYER_CREATE_USER_MARK", true)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC7343cuS
    public void c() {
        this.a.d("USER_PLAYER_CREATE_USER_MARK", false);
    }

    private final void b(InterfaceC7343cuS.d dVar) {
        if (this.b == null) {
            this.b = dVar.a(this.j);
        }
        i();
    }

    private final void i() {
        C9843xd c9843xd = this.b;
        if (c9843xd != null) {
            c9843xd.d();
        }
    }

    private final boolean c(Activity activity) {
        FrameLayout frameLayout;
        C9843xd c9843xd = this.b;
        if (c9843xd == null || (frameLayout = (FrameLayout) activity.findViewById(16908290)) == null) {
            return false;
        }
        return c9843xd.e((ViewGroup) frameLayout);
    }

    private final boolean e(ServiceManager serviceManager) {
        return serviceManager.H();
    }
}
