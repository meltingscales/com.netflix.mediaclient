package o;

import com.netflix.mediaclient.ui.login.EmailPasswordFragment;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cap  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6308cap implements MembersInjector<EmailPasswordFragment> {
    private final Provider<InterfaceC1573aGh> a;
    private final Provider<C6283caQ> b;
    private final Provider<LoginApi> e;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(EmailPasswordFragment emailPasswordFragment) {
        C1092Oj.e(emailPasswordFragment, this.a);
        e(emailPasswordFragment, this.e.get());
        b(emailPasswordFragment, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.login.EmailPasswordFragment.loginApi")
    public static void e(EmailPasswordFragment emailPasswordFragment, LoginApi loginApi) {
        emailPasswordFragment.loginApi = loginApi;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.login.EmailPasswordFragment.loginOtpDelegate")
    public static void b(EmailPasswordFragment emailPasswordFragment, C6283caQ c6283caQ) {
        emailPasswordFragment.loginOtpDelegate = c6283caQ;
    }
}
