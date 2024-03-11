package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bFk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3642bFk implements MembersInjector<DetailsActivity> {
    private final Provider<InterfaceC7249cse> a;
    private final Provider<InterfaceC6675chl> b;
    private final Provider<Optional<DebugMenuItems>> c;
    private final Provider<LoginApi> d;
    private final Provider<InterfaceC7303ctf> e;
    private final Provider<InterfaceC1643aIx> f;
    private final Provider<C3651bFt> g;
    private final Provider<cNT> h;
    private final Provider<ServiceManager> i;
    private final Provider<InterfaceC5844cKl> j;
    private final Provider<InterfaceC7345cuU> l;
    private final Provider<InterfaceC5285bvq> m;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC8098ddv> f13502o;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(DetailsActivity detailsActivity) {
        C1634aIo.d(detailsActivity, this.i.get());
        C1634aIo.a(detailsActivity, this.f.get());
        C1057Nb.d(detailsActivity, this.a.get());
        C1057Nb.c(detailsActivity, DoubleCheck.lazy(this.d));
        C1057Nb.c(detailsActivity, this.b.get());
        C1057Nb.c(detailsActivity, this.f13502o.get());
        C1057Nb.c(detailsActivity, this.l.get());
        C1057Nb.a(detailsActivity, this.c.get());
        C1057Nb.a(detailsActivity, this.m.get());
        C1057Nb.b(detailsActivity, this.j.get());
        C1057Nb.d(detailsActivity, DoubleCheck.lazy(this.h));
        C1057Nb.e(detailsActivity, this.e.get());
        b(detailsActivity, DoubleCheck.lazy(this.g));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.details.DetailsActivity.remindMeDeeplinkHandler")
    public static void b(DetailsActivity detailsActivity, Lazy<C3651bFt> lazy) {
        detailsActivity.remindMeDeeplinkHandler = lazy;
    }
}
