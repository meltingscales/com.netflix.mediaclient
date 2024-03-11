package o;

import com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cbq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6362cbq implements MembersInjector<OneTimePasscodeChoiceFragmentAb54131> {
    private final Provider<C6283caQ> b;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(OneTimePasscodeChoiceFragmentAb54131 oneTimePasscodeChoiceFragmentAb54131) {
        e(oneTimePasscodeChoiceFragmentAb54131, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131.loginOtpDelegate")
    public static void e(OneTimePasscodeChoiceFragmentAb54131 oneTimePasscodeChoiceFragmentAb54131, C6283caQ c6283caQ) {
        oneTimePasscodeChoiceFragmentAb54131.loginOtpDelegate = c6283caQ;
    }
}
