package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.ctg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7304ctg implements MembersInjector<OfflineActivityV2> {
    private final Provider<Optional<DebugMenuItems>> a;
    private final Provider<InterfaceC6675chl> b;
    private final Provider<InterfaceC7303ctf> c;
    private final Provider<LoginApi> d;
    private final Provider<InterfaceC7249cse> e;
    private final Provider<InterfaceC5844cKl> f;
    private final Provider<InterfaceC1643aIx> g;
    private final Provider<ServiceManager> h;
    private final Provider<InterfaceC6068cSu> i;
    private final Provider<cNT> j;
    private final Provider<InterfaceC7345cuU> m;
    private final Provider<InterfaceC8098ddv> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC5285bvq> f13769o;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(OfflineActivityV2 offlineActivityV2) {
        C1634aIo.d(offlineActivityV2, this.h.get());
        C1634aIo.a(offlineActivityV2, this.g.get());
        C1057Nb.d(offlineActivityV2, this.e.get());
        C1057Nb.c(offlineActivityV2, DoubleCheck.lazy(this.d));
        C1057Nb.c(offlineActivityV2, this.b.get());
        C1057Nb.c(offlineActivityV2, this.n.get());
        C1057Nb.c(offlineActivityV2, this.m.get());
        C1057Nb.a(offlineActivityV2, this.a.get());
        C1057Nb.a(offlineActivityV2, this.f13769o.get());
        C1057Nb.b(offlineActivityV2, this.f.get());
        C1057Nb.d(offlineActivityV2, DoubleCheck.lazy(this.j));
        C1057Nb.e(offlineActivityV2, this.c.get());
        e(offlineActivityV2, this.i.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.offline.OfflineActivityV2.search")
    public static void e(OfflineActivityV2 offlineActivityV2, InterfaceC6068cSu interfaceC6068cSu) {
        offlineActivityV2.search = interfaceC6068cSu;
    }
}
