package o;

import com.netflix.mediaclient.ui.pauseads.impl.PauseAdsDialogFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cwo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7471cwo implements MembersInjector<PauseAdsDialogFragment> {
    private final Provider<InterfaceC1573aGh> b;
    private final Provider<InterfaceC1570aGe> d;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(PauseAdsDialogFragment pauseAdsDialogFragment) {
        C1095Om.d(pauseAdsDialogFragment, DoubleCheck.lazy(this.b));
        a(pauseAdsDialogFragment, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.pauseads.impl.PauseAdsDialogFragment.imageLoaderCompose")
    public static void a(PauseAdsDialogFragment pauseAdsDialogFragment, InterfaceC1570aGe interfaceC1570aGe) {
        pauseAdsDialogFragment.imageLoaderCompose = interfaceC1570aGe;
    }
}
