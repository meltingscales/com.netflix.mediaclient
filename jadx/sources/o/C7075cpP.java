package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.notifications.NotificationsActivity;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cpP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7075cpP implements MembersInjector<NotificationsActivity> {
    private final Provider<InterfaceC7303ctf> a;
    private final Provider<LoginApi> b;
    private final Provider<InterfaceC6675chl> c;
    private final Provider<Optional<DebugMenuItems>> d;
    private final Provider<InterfaceC7249cse> e;
    private final Provider<ServiceManager> f;
    private final Provider<InterfaceC1643aIx> g;
    private final Provider<cNT> h;
    private final Provider<InterfaceC6068cSu> i;
    private final Provider<InterfaceC5844cKl> j;
    private final Provider<InterfaceC7345cuU> k;
    private final Provider<InterfaceC5285bvq> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC8098ddv> f13761o;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(NotificationsActivity notificationsActivity) {
        C1634aIo.d(notificationsActivity, this.f.get());
        C1634aIo.a(notificationsActivity, this.g.get());
        C1057Nb.d(notificationsActivity, this.e.get());
        C1057Nb.c(notificationsActivity, DoubleCheck.lazy(this.b));
        C1057Nb.c(notificationsActivity, this.c.get());
        C1057Nb.c(notificationsActivity, this.f13761o.get());
        C1057Nb.c(notificationsActivity, this.k.get());
        C1057Nb.a(notificationsActivity, this.d.get());
        C1057Nb.a(notificationsActivity, this.n.get());
        C1057Nb.b(notificationsActivity, this.j.get());
        C1057Nb.d(notificationsActivity, DoubleCheck.lazy(this.h));
        C1057Nb.e(notificationsActivity, this.a.get());
        b(notificationsActivity, this.i.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.notifications.NotificationsActivity.search")
    public static void b(NotificationsActivity notificationsActivity, InterfaceC6068cSu interfaceC6068cSu) {
        notificationsActivity.search = interfaceC6068cSu;
    }
}
