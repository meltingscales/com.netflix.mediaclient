package o;

import com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.ced  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6508ced implements MembersInjector<ContinueWatchingMenuDialogFragment> {
    private final Provider<InterfaceC1573aGh> b;
    private final Provider<InterfaceC7303ctf> e;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(ContinueWatchingMenuDialogFragment continueWatchingMenuDialogFragment) {
        C1095Om.d(continueWatchingMenuDialogFragment, DoubleCheck.lazy(this.b));
        b(continueWatchingMenuDialogFragment, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment.offlineApi")
    public static void b(ContinueWatchingMenuDialogFragment continueWatchingMenuDialogFragment, InterfaceC7303ctf interfaceC7303ctf) {
        continueWatchingMenuDialogFragment.offlineApi = interfaceC7303ctf;
    }
}
