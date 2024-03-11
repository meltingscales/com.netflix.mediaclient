package o;

import com.netflix.mediaclient.acquisition.api.sms.SMSRetriever;
import com.netflix.mediaclient.ui.login.OneTimePassCodeFragmentAb54131;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cbm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6358cbm implements MembersInjector<OneTimePassCodeFragmentAb54131> {
    private final Provider<SMSRetriever> c;
    private final Provider<C6283caQ> d;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(OneTimePassCodeFragmentAb54131 oneTimePassCodeFragmentAb54131) {
        d(oneTimePassCodeFragmentAb54131, this.c.get());
        d(oneTimePassCodeFragmentAb54131, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.login.OneTimePassCodeFragmentAb54131.smsRetriever")
    public static void d(OneTimePassCodeFragmentAb54131 oneTimePassCodeFragmentAb54131, SMSRetriever sMSRetriever) {
        oneTimePassCodeFragmentAb54131.smsRetriever = sMSRetriever;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.login.OneTimePassCodeFragmentAb54131.loginOtpDelegate")
    public static void d(OneTimePassCodeFragmentAb54131 oneTimePassCodeFragmentAb54131, C6283caQ c6283caQ) {
        oneTimePassCodeFragmentAb54131.loginOtpDelegate = c6283caQ;
    }
}
