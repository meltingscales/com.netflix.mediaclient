package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.mylist.impl.MyListActivity;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cmO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6917cmO implements MembersInjector<MyListActivity> {
    private final Provider<InterfaceC6675chl> a;
    private final Provider<LoginApi> b;
    private final Provider<InterfaceC7249cse> c;
    private final Provider<bNP> d;
    private final Provider<Optional<DebugMenuItems>> e;
    private final Provider<cNT> f;
    private final Provider<InterfaceC5844cKl> g;
    private final Provider<C6923cmU> h;
    private final Provider<InterfaceC1643aIx> i;
    private final Provider<InterfaceC7303ctf> j;
    private final Provider<InterfaceC7345cuU> k;
    private final Provider<ServiceManager> l;
    private final Provider<InterfaceC5285bvq> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC8098ddv> f13747o;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(MyListActivity myListActivity) {
        C1634aIo.d(myListActivity, this.l.get());
        C1634aIo.a(myListActivity, this.i.get());
        C1057Nb.d(myListActivity, this.c.get());
        C1057Nb.c(myListActivity, DoubleCheck.lazy(this.b));
        C1057Nb.c(myListActivity, this.a.get());
        C1057Nb.c(myListActivity, this.f13747o.get());
        C1057Nb.c(myListActivity, this.k.get());
        C1057Nb.a(myListActivity, this.e.get());
        C1057Nb.a(myListActivity, this.n.get());
        C1057Nb.b(myListActivity, this.g.get());
        C1057Nb.d(myListActivity, DoubleCheck.lazy(this.f));
        C1057Nb.e(myListActivity, this.j.get());
        c(myListActivity, this.h.get());
        e(myListActivity, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.mylist.impl.MyListActivity.myListEditMenuProvider")
    public static void c(MyListActivity myListActivity, C6923cmU c6923cmU) {
        myListActivity.myListEditMenuProvider = c6923cmU;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.mylist.impl.MyListActivity.gamesInMyList")
    public static void e(MyListActivity myListActivity, bNP bnp) {
        myListActivity.gamesInMyList = bnp;
    }
}
