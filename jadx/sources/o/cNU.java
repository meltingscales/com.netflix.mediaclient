package o;

import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;
import o.cWS;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class cNU implements MembersInjector<ProfileSelectionActivity> {
    private final Provider<UiLatencyMarker> a;
    private final Provider<Optional<DebugMenuItems>> b;
    private final Provider<InterfaceC7249cse> c;
    private final Provider<InterfaceC1270Vf> d;
    private final Provider<LoginApi> e;
    private final Provider<InterfaceC6675chl> f;
    private final Provider<cNT> g;
    private final Provider<InterfaceC7303ctf> h;
    private final Provider<InterfaceC5844cKl> i;
    private final Provider<InterfaceC1643aIx> j;
    private final Provider<cWS.d> k;
    private final Provider<ServiceManager> l;
    private final Provider<InterfaceC7345cuU> m;
    private final Provider<InterfaceC5285bvq> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC1573aGh> f13684o;
    private final Provider<InterfaceC8098ddv> r;
    private final Provider<cWC> s;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(ProfileSelectionActivity profileSelectionActivity) {
        C1634aIo.d(profileSelectionActivity, this.l.get());
        C1634aIo.a(profileSelectionActivity, this.j.get());
        C1057Nb.d(profileSelectionActivity, this.c.get());
        C1057Nb.c(profileSelectionActivity, DoubleCheck.lazy(this.e));
        C1057Nb.c(profileSelectionActivity, this.f.get());
        C1057Nb.c(profileSelectionActivity, this.r.get());
        C1057Nb.c(profileSelectionActivity, this.m.get());
        C1057Nb.a(profileSelectionActivity, this.b.get());
        C1057Nb.a(profileSelectionActivity, this.n.get());
        C1057Nb.b(profileSelectionActivity, this.i.get());
        C1057Nb.d(profileSelectionActivity, DoubleCheck.lazy(this.g));
        C1057Nb.e(profileSelectionActivity, this.h.get());
        b(profileSelectionActivity, this.f13684o.get());
        c(profileSelectionActivity, this.a.get());
        a(profileSelectionActivity, this.k.get());
        e(profileSelectionActivity, this.s.get());
        c(profileSelectionActivity, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.uiLatencyTracker")
    public static void b(ProfileSelectionActivity profileSelectionActivity, InterfaceC1573aGh interfaceC1573aGh) {
        profileSelectionActivity.uiLatencyTracker = interfaceC1573aGh;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.latencyMarker")
    public static void c(ProfileSelectionActivity profileSelectionActivity, UiLatencyMarker uiLatencyMarker) {
        profileSelectionActivity.latencyMarker = uiLatencyMarker;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.umaControllerFactory")
    public static void a(ProfileSelectionActivity profileSelectionActivity, cWS.d dVar) {
        profileSelectionActivity.umaControllerFactory = dVar;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.uma")
    public static void e(ProfileSelectionActivity profileSelectionActivity, cWC cwc) {
        profileSelectionActivity.uma = cwc;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity.clock")
    public static void c(ProfileSelectionActivity profileSelectionActivity, InterfaceC1270Vf interfaceC1270Vf) {
        profileSelectionActivity.clock = interfaceC1270Vf;
    }
}
