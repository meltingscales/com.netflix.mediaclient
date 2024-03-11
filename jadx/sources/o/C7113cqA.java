package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsActivity;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cqA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7113cqA implements MembersInjector<MultiTitleNotificationsActivity> {
    private final Provider<InterfaceC6675chl> a;
    private final Provider<InterfaceC7303ctf> b;
    private final Provider<LoginApi> c;
    private final Provider<Optional<DebugMenuItems>> d;
    private final Provider<InterfaceC7249cse> e;
    private final Provider<InterfaceC1643aIx> f;
    private final Provider<ServiceManager> g;
    private final Provider<InterfaceC5844cKl> h;
    private final Provider<cNT> i;
    private final Provider<InterfaceC6068cSu> j;
    private final Provider<InterfaceC8098ddv> l;
    private final Provider<InterfaceC5285bvq> m;
    private final Provider<InterfaceC7345cuU> n;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(MultiTitleNotificationsActivity multiTitleNotificationsActivity) {
        C1634aIo.d(multiTitleNotificationsActivity, this.g.get());
        C1634aIo.a(multiTitleNotificationsActivity, this.f.get());
        C1057Nb.d(multiTitleNotificationsActivity, this.e.get());
        C1057Nb.c(multiTitleNotificationsActivity, DoubleCheck.lazy(this.c));
        C1057Nb.c(multiTitleNotificationsActivity, this.a.get());
        C1057Nb.c(multiTitleNotificationsActivity, this.l.get());
        C1057Nb.c(multiTitleNotificationsActivity, this.n.get());
        C1057Nb.a(multiTitleNotificationsActivity, this.d.get());
        C1057Nb.a(multiTitleNotificationsActivity, this.m.get());
        C1057Nb.b(multiTitleNotificationsActivity, this.h.get());
        C1057Nb.d(multiTitleNotificationsActivity, DoubleCheck.lazy(this.i));
        C1057Nb.e(multiTitleNotificationsActivity, this.b.get());
        b(multiTitleNotificationsActivity, this.j.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsActivity.search")
    public static void b(MultiTitleNotificationsActivity multiTitleNotificationsActivity, InterfaceC6068cSu interfaceC6068cSu) {
        multiTitleNotificationsActivity.search = interfaceC6068cSu;
    }
}
