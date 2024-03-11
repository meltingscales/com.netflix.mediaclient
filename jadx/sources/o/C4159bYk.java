package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterDetailsActivity;
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
/* renamed from: o.bYk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4159bYk implements MembersInjector<KidsCharacterDetailsActivity> {
    private final Provider<Optional<DebugMenuItems>> a;
    private final Provider<InterfaceC7249cse> b;
    private final Provider<LoginApi> c;
    private final Provider<Optional<DebugMenuItems>> d;
    private final Provider<InterfaceC6675chl> e;
    private final Provider<cNT> f;
    private final Provider<InterfaceC1643aIx> g;
    private final Provider<C3651bFt> h;
    private final Provider<InterfaceC5844cKl> i;
    private final Provider<InterfaceC7303ctf> j;
    private final Provider<ServiceManager> k;
    private final Provider<InterfaceC5285bvq> l;
    private final Provider<InterfaceC8098ddv> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC7345cuU> f13554o;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(KidsCharacterDetailsActivity kidsCharacterDetailsActivity) {
        C1634aIo.d(kidsCharacterDetailsActivity, this.k.get());
        C1634aIo.a(kidsCharacterDetailsActivity, this.g.get());
        C1057Nb.d(kidsCharacterDetailsActivity, this.b.get());
        C1057Nb.c(kidsCharacterDetailsActivity, DoubleCheck.lazy(this.c));
        C1057Nb.c(kidsCharacterDetailsActivity, this.e.get());
        C1057Nb.c(kidsCharacterDetailsActivity, this.n.get());
        C1057Nb.c(kidsCharacterDetailsActivity, this.f13554o.get());
        C1057Nb.a(kidsCharacterDetailsActivity, this.a.get());
        C1057Nb.a(kidsCharacterDetailsActivity, this.l.get());
        C1057Nb.b(kidsCharacterDetailsActivity, this.i.get());
        C1057Nb.d(kidsCharacterDetailsActivity, DoubleCheck.lazy(this.f));
        C1057Nb.e(kidsCharacterDetailsActivity, this.j.get());
        C3642bFk.b(kidsCharacterDetailsActivity, DoubleCheck.lazy(this.h));
        d(kidsCharacterDetailsActivity, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.kids.character_details.KidsCharacterDetailsActivity.debugMenuItems")
    public static void d(KidsCharacterDetailsActivity kidsCharacterDetailsActivity, Optional<DebugMenuItems> optional) {
        kidsCharacterDetailsActivity.debugMenuItems = optional;
    }
}
