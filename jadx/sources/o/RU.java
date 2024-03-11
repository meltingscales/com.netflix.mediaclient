package o;

import com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"com.netflix.common.di.Main"})
/* loaded from: classes3.dex */
public final class RU implements MembersInjector<NetflixActionBarInterstitials> {
    private final Provider<dwQ> d;
    private final Provider<bXD> e;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(NetflixActionBarInterstitials netflixActionBarInterstitials) {
        c(netflixActionBarInterstitials, this.e.get());
        e(netflixActionBarInterstitials, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials.interstitials")
    public static void c(NetflixActionBarInterstitials netflixActionBarInterstitials, bXD bxd) {
        netflixActionBarInterstitials.interstitials = bxd;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials.mainDispatcher")
    public static void e(NetflixActionBarInterstitials netflixActionBarInterstitials, dwQ dwq) {
        netflixActionBarInterstitials.mainDispatcher = dwq;
    }
}
