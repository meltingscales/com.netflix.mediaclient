package o;

import com.netflix.mediaclient.ui.login.LoginErrorDialogFrag;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.caK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6277caK implements MembersInjector<LoginErrorDialogFrag> {
    private final Provider<InterfaceC1573aGh> c;
    private final Provider<C6283caQ> e;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(LoginErrorDialogFrag loginErrorDialogFrag) {
        C1095Om.d(loginErrorDialogFrag, DoubleCheck.lazy(this.c));
        b(loginErrorDialogFrag, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.login.LoginErrorDialogFrag.oneTimePassCodeFlowDelegateAB54131")
    public static void b(LoginErrorDialogFrag loginErrorDialogFrag, C6283caQ c6283caQ) {
        loginErrorDialogFrag.oneTimePassCodeFlowDelegateAB54131 = c6283caQ;
    }
}
