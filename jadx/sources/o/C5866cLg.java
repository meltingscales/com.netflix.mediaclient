package o;

import com.netflix.mediaclient.ui.profilelock.impl.ProfileLockPinDialog;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"com.netflix.common.di.Main"})
/* renamed from: o.cLg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5866cLg implements MembersInjector<ProfileLockPinDialog> {
    private final Provider<dwQ> d;
    private final Provider<cKA> e;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(ProfileLockPinDialog profileLockPinDialog) {
        e(profileLockPinDialog, this.e.get());
        b(profileLockPinDialog, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profilelock.impl.ProfileLockPinDialog.profileLockRepository")
    public static void e(ProfileLockPinDialog profileLockPinDialog, cKA cka) {
        profileLockPinDialog.profileLockRepository = cka;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profilelock.impl.ProfileLockPinDialog.uiDispatcher")
    public static void b(ProfileLockPinDialog profileLockPinDialog, dwQ dwq) {
        profileLockPinDialog.uiDispatcher = dwq;
    }
}
