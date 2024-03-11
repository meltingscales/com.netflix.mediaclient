package o;

import com.netflix.mediaclient.ui.profilelock.impl.DeletePinDialog;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class cKG implements MembersInjector<DeletePinDialog> {
    private final Provider<cKA> e;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(DeletePinDialog deletePinDialog) {
        c(deletePinDialog, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profilelock.impl.DeletePinDialog.profileLockRepository")
    public static void c(DeletePinDialog deletePinDialog, cKA cka) {
        deletePinDialog.profileLockRepository = cka;
    }
}
