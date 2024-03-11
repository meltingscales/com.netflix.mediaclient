package o;

import com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class PV implements MembersInjector<ShareSheetFragment> {
    private final Provider<InterfaceC1570aGe> b;
    private final Provider<InterfaceC1573aGh> d;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(ShareSheetFragment shareSheetFragment) {
        C1095Om.d(shareSheetFragment, DoubleCheck.lazy(this.d));
        d(shareSheetFragment, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment.imageLoaderCompose")
    public static void d(ShareSheetFragment shareSheetFragment, InterfaceC1570aGe interfaceC1570aGe) {
        shareSheetFragment.imageLoaderCompose = interfaceC1570aGe;
    }
}
