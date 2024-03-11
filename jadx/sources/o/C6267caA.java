package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.LoginActivity;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.caA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6267caA implements MembersInjector<LoginActivity> {
    private final Provider<Optional<DebugMenuItems>> a;
    private final Provider<InterfaceC7249cse> b;
    private final Provider<InterfaceC6675chl> c;
    private final Provider<LoginApi> d;
    private final Provider<InterfaceC6282caP> e;
    private final Provider<cNT> f;
    private final Provider<InterfaceC7303ctf> g;
    private final Provider<InterfaceC1643aIx> h;
    private final Provider<cNT> i;
    private final Provider<InterfaceC5844cKl> j;
    private final Provider<InterfaceC8098ddv> k;
    private final Provider<ServiceManager> l;
    private final Provider<InterfaceC7345cuU> m;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC5285bvq> f13713o;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(LoginActivity loginActivity) {
        C1634aIo.d(loginActivity, this.l.get());
        C1634aIo.a(loginActivity, this.h.get());
        C1057Nb.d(loginActivity, this.b.get());
        C1057Nb.c(loginActivity, DoubleCheck.lazy(this.d));
        C1057Nb.c(loginActivity, this.c.get());
        C1057Nb.c(loginActivity, this.k.get());
        C1057Nb.c(loginActivity, this.m.get());
        C1057Nb.a(loginActivity, this.a.get());
        C1057Nb.a(loginActivity, this.f13713o.get());
        C1057Nb.b(loginActivity, this.j.get());
        C1057Nb.d(loginActivity, DoubleCheck.lazy(this.i));
        C1057Nb.e(loginActivity, this.g.get());
        e(loginActivity, this.f.get());
        e(loginActivity, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.login.LoginActivity.profileSelectionLauncher")
    public static void e(LoginActivity loginActivity, cNT cnt) {
        loginActivity.profileSelectionLauncher = cnt;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.login.LoginActivity.oauth2LoginDelegate")
    public static void e(LoginActivity loginActivity, InterfaceC6282caP interfaceC6282caP) {
        loginActivity.oauth2LoginDelegate = interfaceC6282caP;
    }
}
