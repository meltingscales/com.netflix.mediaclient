package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.home.MoreTabActivity;
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
/* renamed from: o.bSk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3997bSk implements MembersInjector<MoreTabActivity> {
    private final Provider<InterfaceC7303ctf> a;
    private final Provider<InterfaceC6675chl> b;
    private final Provider<Optional<DebugMenuItems>> c;
    private final Provider<LoginApi> d;
    private final Provider<InterfaceC7249cse> e;
    private final Provider<InterfaceC6068cSu> f;
    private final Provider<InterfaceC1643aIx> g;
    private final Provider<cNT> h;
    private final Provider<InterfaceC5844cKl> i;
    private final Provider<ServiceManager> j;
    private final Provider<InterfaceC5285bvq> l;
    private final Provider<InterfaceC7345cuU> m;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC8098ddv> f13538o;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(MoreTabActivity moreTabActivity) {
        C1634aIo.d(moreTabActivity, this.j.get());
        C1634aIo.a(moreTabActivity, this.g.get());
        C1057Nb.d(moreTabActivity, this.e.get());
        C1057Nb.c(moreTabActivity, DoubleCheck.lazy(this.d));
        C1057Nb.c(moreTabActivity, this.b.get());
        C1057Nb.c(moreTabActivity, this.f13538o.get());
        C1057Nb.c(moreTabActivity, this.m.get());
        C1057Nb.a(moreTabActivity, this.c.get());
        C1057Nb.a(moreTabActivity, this.l.get());
        C1057Nb.b(moreTabActivity, this.i.get());
        C1057Nb.d(moreTabActivity, DoubleCheck.lazy(this.h));
        C1057Nb.e(moreTabActivity, this.a.get());
        c(moreTabActivity, this.f.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.MoreTabActivity.search")
    public static void c(MoreTabActivity moreTabActivity, InterfaceC6068cSu interfaceC6068cSu) {
        moreTabActivity.search = interfaceC6068cSu;
    }
}
