package o;

import com.netflix.mediaclient.ui.launch.NetflixComLaunchActivity;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bZc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4178bZc implements MembersInjector<NetflixComLaunchActivity> {
    private final Provider<InterfaceC7084cpY> b;
    private final Provider<bXD> c;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(NetflixComLaunchActivity netflixComLaunchActivity) {
        a(netflixComLaunchActivity, this.b.get());
        b(netflixComLaunchActivity, this.c.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.NetflixComLaunchActivity.notificationsUi")
    public static void a(NetflixComLaunchActivity netflixComLaunchActivity, InterfaceC7084cpY interfaceC7084cpY) {
        netflixComLaunchActivity.notificationsUi = interfaceC7084cpY;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.NetflixComLaunchActivity.interstitials")
    public static void b(NetflixComLaunchActivity netflixComLaunchActivity, bXD bxd) {
        netflixComLaunchActivity.interstitials = bxd;
    }
}
