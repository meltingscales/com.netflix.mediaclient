package o;

import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.more.MoreFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.ciQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6707ciQ implements MembersInjector<MoreFragment> {
    private final Provider<InterfaceC7084cpY> a;
    private final Provider<InterfaceC6905cmC> b;
    private final Provider<LoginApi> c;
    private final Provider<InterfaceC5844cKl> d;
    private final Provider<cNT> e;
    private final Provider<InterfaceC1573aGh> f;
    private final Provider<InterfaceC7967dbW> g;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(MoreFragment moreFragment) {
        C1092Oj.e(moreFragment, this.f);
        c(moreFragment, this.d.get());
        e(moreFragment, this.e.get());
        d(moreFragment, this.a.get());
        c(moreFragment, this.c.get());
        d(moreFragment, this.g.get());
        c(moreFragment, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.more.MoreFragment.profileApi")
    public static void c(MoreFragment moreFragment, InterfaceC5844cKl interfaceC5844cKl) {
        moreFragment.profileApi = interfaceC5844cKl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.more.MoreFragment.profileSelectionLauncher")
    public static void e(MoreFragment moreFragment, cNT cnt) {
        moreFragment.profileSelectionLauncher = cnt;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.more.MoreFragment.notificationsUi")
    public static void d(MoreFragment moreFragment, InterfaceC7084cpY interfaceC7084cpY) {
        moreFragment.notificationsUi = interfaceC7084cpY;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.more.MoreFragment.loginApi")
    public static void c(MoreFragment moreFragment, LoginApi loginApi) {
        moreFragment.loginApi = loginApi;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.more.MoreFragment.userMarks")
    public static void d(MoreFragment moreFragment, InterfaceC7967dbW interfaceC7967dbW) {
        moreFragment.userMarks = interfaceC7967dbW;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.more.MoreFragment.myList")
    public static void c(MoreFragment moreFragment, InterfaceC6905cmC interfaceC6905cmC) {
        moreFragment.myList = interfaceC6905cmC;
    }
}
