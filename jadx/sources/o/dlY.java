package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.profiles.ProfileControlsActivity;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class dlY implements MembersInjector<ProfileControlsActivity> {
    private final Provider<InterfaceC7249cse> a;
    private final Provider<Optional<DebugMenuItems>> b;
    private final Provider<InterfaceC6675chl> c;
    private final Provider<InterfaceC7303ctf> d;
    private final Provider<LoginApi> e;
    private final Provider<InterfaceC5844cKl> f;
    private final Provider<cKD> g;
    private final Provider<InterfaceC1643aIx> h;
    private final Provider<InterfaceC5986cPt> i;
    private final Provider<cNT> j;
    private final Provider<InterfaceC8098ddv> k;
    private final Provider<InterfaceC7345cuU> l;
    private final Provider<InterfaceC5285bvq> m;
    private final Provider<ServiceManager> n;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(ProfileControlsActivity profileControlsActivity) {
        C1634aIo.d(profileControlsActivity, this.n.get());
        C1634aIo.a(profileControlsActivity, this.h.get());
        C1057Nb.d(profileControlsActivity, this.a.get());
        C1057Nb.c(profileControlsActivity, DoubleCheck.lazy(this.e));
        C1057Nb.c(profileControlsActivity, this.c.get());
        C1057Nb.c(profileControlsActivity, this.k.get());
        C1057Nb.c(profileControlsActivity, this.l.get());
        C1057Nb.a(profileControlsActivity, this.b.get());
        C1057Nb.a(profileControlsActivity, this.m.get());
        C1057Nb.b(profileControlsActivity, this.f.get());
        C1057Nb.d(profileControlsActivity, DoubleCheck.lazy(this.j));
        C1057Nb.e(profileControlsActivity, this.d.get());
        c(profileControlsActivity, this.g.get());
        c(profileControlsActivity, this.i.get());
    }

    @InjectedFieldSignature("com.netflix.profiles.ProfileControlsActivity.profileLock")
    public static void c(ProfileControlsActivity profileControlsActivity, cKD ckd) {
        profileControlsActivity.profileLock = ckd;
    }

    @InjectedFieldSignature("com.netflix.profiles.ProfileControlsActivity.profileViewingRestrictions")
    public static void c(ProfileControlsActivity profileControlsActivity, InterfaceC5986cPt interfaceC5986cPt) {
        profileControlsActivity.profileViewingRestrictions = interfaceC5986cPt;
    }
}
