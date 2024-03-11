package o;

import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaEmailPasswordFragment;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cbK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6330cbK implements MembersInjector<RecaptchaEmailPasswordFragment> {
    private final Provider<RecaptchaV3Manager.c> b;
    private final Provider<LoginApi> c;
    private final Provider<C6283caQ> d;
    private final Provider<InterfaceC1573aGh> e;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(RecaptchaEmailPasswordFragment recaptchaEmailPasswordFragment) {
        C1092Oj.e(recaptchaEmailPasswordFragment, this.e);
        C6308cap.e(recaptchaEmailPasswordFragment, this.c.get());
        C6308cap.b(recaptchaEmailPasswordFragment, this.d.get());
        b(recaptchaEmailPasswordFragment, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaEmailPasswordFragment.recaptchaV3ManagerFactory")
    public static void b(RecaptchaEmailPasswordFragment recaptchaEmailPasswordFragment, RecaptchaV3Manager.c cVar) {
        recaptchaEmailPasswordFragment.recaptchaV3ManagerFactory = cVar;
    }
}
