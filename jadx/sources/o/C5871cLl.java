package o;

import com.netflix.mediaclient.ui.profilelock.impl.ValidatePasswordDialog;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"com.netflix.common.di.Main"})
/* renamed from: o.cLl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5871cLl implements MembersInjector<ValidatePasswordDialog> {
    private final Provider<cKA> a;
    private final Provider<TW> d;
    private final Provider<dwQ> e;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(ValidatePasswordDialog validatePasswordDialog) {
        d(validatePasswordDialog, this.a.get());
        a(validatePasswordDialog, this.d.get());
        a(validatePasswordDialog, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profilelock.impl.ValidatePasswordDialog.profileLockRepository")
    public static void d(ValidatePasswordDialog validatePasswordDialog, cKA cka) {
        validatePasswordDialog.profileLockRepository = cka;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profilelock.impl.ValidatePasswordDialog.autoLoginUrlOpener")
    public static void a(ValidatePasswordDialog validatePasswordDialog, TW tw) {
        validatePasswordDialog.autoLoginUrlOpener = tw;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profilelock.impl.ValidatePasswordDialog.uiDispatcher")
    public static void a(ValidatePasswordDialog validatePasswordDialog, dwQ dwq) {
        validatePasswordDialog.uiDispatcher = dwq;
    }
}
