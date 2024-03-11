package o;

import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class cXX implements MembersInjector<UserMessageAreaView> {
    private final Provider<LoginApi> a;
    private final Provider<InterfaceC5844cKl> b;
    private final Provider<InterfaceC6761cjR> c;
    private final Provider<cNT> d;
    private final Provider<CollectPhone> e;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(UserMessageAreaView userMessageAreaView) {
        c(userMessageAreaView, this.b.get());
        a(userMessageAreaView, this.d.get());
        d(userMessageAreaView, this.e.get());
        c(userMessageAreaView, this.a.get());
        b(userMessageAreaView, DoubleCheck.lazy(this.c));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.ums.UserMessageAreaView.profileApi")
    public static void c(UserMessageAreaView userMessageAreaView, InterfaceC5844cKl interfaceC5844cKl) {
        userMessageAreaView.profileApi = interfaceC5844cKl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.ums.UserMessageAreaView.profileSelectionLauncher")
    public static void a(UserMessageAreaView userMessageAreaView, cNT cnt) {
        userMessageAreaView.profileSelectionLauncher = cnt;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.ums.UserMessageAreaView.collectPhone")
    public static void d(UserMessageAreaView userMessageAreaView, CollectPhone collectPhone) {
        userMessageAreaView.collectPhone = collectPhone;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.ums.UserMessageAreaView.loginApi")
    public static void c(UserMessageAreaView userMessageAreaView, LoginApi loginApi) {
        userMessageAreaView.loginApi = loginApi;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.ums.UserMessageAreaView.mhuEbiApiLazy")
    public static void b(UserMessageAreaView userMessageAreaView, Lazy<InterfaceC6761cjR> lazy) {
        userMessageAreaView.mhuEbiApiLazy = lazy;
    }
}
