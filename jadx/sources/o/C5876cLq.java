package o;

import com.netflix.mediaclient.ui.profilelock.impl.VerifyPinDialog;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cLq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5876cLq implements MembersInjector<VerifyPinDialog> {
    private final Provider<TW> a;
    private final Provider<cKA> c;
    private final Provider<dwQ> d;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(VerifyPinDialog verifyPinDialog) {
        C5866cLg.e(verifyPinDialog, this.c.get());
        C5866cLg.b(verifyPinDialog, this.d.get());
        a(verifyPinDialog, this.a.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profilelock.impl.VerifyPinDialog.autoLoginUrlOpener")
    public static void a(VerifyPinDialog verifyPinDialog, TW tw) {
        verifyPinDialog.autoLoginUrlOpener = tw;
    }
}
