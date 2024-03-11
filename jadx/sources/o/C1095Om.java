package o;

import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.Om  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1095Om implements MembersInjector<NetflixDialogFrag> {
    private final Provider<InterfaceC1573aGh> e;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(NetflixDialogFrag netflixDialogFrag) {
        d(netflixDialogFrag, DoubleCheck.lazy(this.e));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.fragment.NetflixDialogFrag.uiLatencyTracker")
    public static void d(NetflixDialogFrag netflixDialogFrag, Lazy<InterfaceC1573aGh> lazy) {
        netflixDialogFrag.uiLatencyTracker = lazy;
    }
}
