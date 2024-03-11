package o;

import com.netflix.mediaclient.ui.mdx.CastSheetDialogFrag;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cfc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6560cfc implements MembersInjector<CastSheetDialogFrag> {
    private final Provider<InterfaceC1573aGh> a;
    private final Provider<bZN> d;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(CastSheetDialogFrag castSheetDialogFrag) {
        C1095Om.d(castSheetDialogFrag, DoubleCheck.lazy(this.a));
        c(castSheetDialogFrag, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.mdx.CastSheetDialogFrag.localDiscoveryConsentUi")
    public static void c(CastSheetDialogFrag castSheetDialogFrag, bZN bzn) {
        castSheetDialogFrag.localDiscoveryConsentUi = bzn;
    }
}
