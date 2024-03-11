package o;

import com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bQg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3939bQg implements MembersInjector<InstallInterstitialFragment> {
    private final Provider<bNL> b;
    private final Provider<InterfaceC1573aGh> c;
    private final Provider<bNS> d;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(InstallInterstitialFragment installInterstitialFragment) {
        C1095Om.d(installInterstitialFragment, DoubleCheck.lazy(this.c));
        e(installInterstitialFragment, this.d.get());
        b(installInterstitialFragment, DoubleCheck.lazy(this.b));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment.gamesInstallationAndLaunch")
    public static void e(InstallInterstitialFragment installInterstitialFragment, bNS bns) {
        installInterstitialFragment.gamesInstallationAndLaunch = bns;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment.gamesAssetFetcher")
    public static void b(InstallInterstitialFragment installInterstitialFragment, Lazy<bNL> lazy) {
        installInterstitialFragment.gamesAssetFetcher = lazy;
    }
}
