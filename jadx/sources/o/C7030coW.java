package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.api.HendrixConfig"})
/* renamed from: o.coW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7030coW implements MembersInjector<NonMemberHomeActivity> {
    private final Provider<LoginApi> a;
    private final Provider<InterfaceC6675chl> b;
    private final Provider<Optional<DebugMenuItems>> c;
    private final Provider<bXD> d;
    private final Provider<InterfaceC7249cse> e;
    private final Provider<cNT> f;
    private final Provider<InterfaceC5844cKl> g;
    private final Provider<InterfaceC7303ctf> h;
    private final Provider<InterfaceC1643aIx> i;
    private final Provider<InterfaceC7020coL> j;
    private final Provider<Boolean> k;
    private final Provider<ServiceManager> l;
    private final Provider<String> m;
    private final Provider<String> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC5285bvq> f13758o;
    private final Provider<InterfaceC7345cuU> p;
    private final Provider<InterfaceC8098ddv> r;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(NonMemberHomeActivity nonMemberHomeActivity) {
        C1634aIo.d(nonMemberHomeActivity, this.l.get());
        C1634aIo.a(nonMemberHomeActivity, this.i.get());
        C1057Nb.d(nonMemberHomeActivity, this.e.get());
        C1057Nb.c(nonMemberHomeActivity, DoubleCheck.lazy(this.a));
        C1057Nb.c(nonMemberHomeActivity, this.b.get());
        C1057Nb.c(nonMemberHomeActivity, this.r.get());
        C1057Nb.c(nonMemberHomeActivity, this.p.get());
        C1057Nb.a(nonMemberHomeActivity, this.c.get());
        C1057Nb.a(nonMemberHomeActivity, this.f13758o.get());
        C1057Nb.b(nonMemberHomeActivity, this.g.get());
        C1057Nb.d(nonMemberHomeActivity, DoubleCheck.lazy(this.f));
        C1057Nb.e(nonMemberHomeActivity, this.h.get());
        e(nonMemberHomeActivity, DoubleCheck.lazy(this.d));
        e(nonMemberHomeActivity, this.j.get());
        d(nonMemberHomeActivity, this.k);
        c(nonMemberHomeActivity, this.m.get());
        d(nonMemberHomeActivity, this.n.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity.interstitials")
    public static void e(NonMemberHomeActivity nonMemberHomeActivity, Lazy<bXD> lazy) {
        nonMemberHomeActivity.interstitials = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity.nonMember")
    public static void e(NonMemberHomeActivity nonMemberHomeActivity, InterfaceC7020coL interfaceC7020coL) {
        nonMemberHomeActivity.nonMember = interfaceC7020coL;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity.signUpCopyLinkBannerEnabled")
    public static void d(NonMemberHomeActivity nonMemberHomeActivity, Provider<Boolean> provider) {
        nonMemberHomeActivity.signUpCopyLinkBannerEnabled = provider;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity.signUpCopyLinkPath")
    public static void c(NonMemberHomeActivity nonMemberHomeActivity, String str) {
        nonMemberHomeActivity.signUpCopyLinkPath = str;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity.signUpCopyLinkDisplayUrl")
    public static void d(NonMemberHomeActivity nonMemberHomeActivity, String str) {
        nonMemberHomeActivity.signUpCopyLinkDisplayUrl = str;
    }
}
