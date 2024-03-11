package o;

import com.netflix.mediaclient.android.fragment.NetflixFrag;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.Oj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1092Oj implements MembersInjector<NetflixFrag> {
    private final Provider<InterfaceC1573aGh> e;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(NetflixFrag netflixFrag) {
        e(netflixFrag, this.e);
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.fragment.NetflixFrag.uiLatencyTrackerProvider")
    public static void e(NetflixFrag netflixFrag, Provider<InterfaceC1573aGh> provider) {
        netflixFrag.uiLatencyTrackerProvider = provider;
    }
}
