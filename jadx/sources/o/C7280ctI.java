package o;

import com.netflix.mediaclient.ui.offline.OfflineFragmentV2;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.ctI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7280ctI implements MembersInjector<OfflineFragmentV2> {
    private final Provider<InterfaceC7221csC> a;
    private final Provider<InterfaceC1573aGh> e;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(OfflineFragmentV2 offlineFragmentV2) {
        C1092Oj.e(offlineFragmentV2, this.e);
        b(offlineFragmentV2, this.a.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.offline.OfflineFragmentV2.downloadsFeatures")
    public static void b(OfflineFragmentV2 offlineFragmentV2, InterfaceC7221csC interfaceC7221csC) {
        offlineFragmentV2.downloadsFeatures = interfaceC7221csC;
    }
}
