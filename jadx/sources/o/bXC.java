package o;

import com.netflix.clcs.client.InterstitialClient;
import com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class bXC implements Factory<InterstitialClient> {
    private final InterstitialsImpl.InterstitialClientModule c;
    private final Provider<aCG> d;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public InterstitialClient get() {
        return e(this.c, this.d.get());
    }

    public static InterstitialClient e(InterstitialsImpl.InterstitialClientModule interstitialClientModule, aCG acg) {
        return (InterstitialClient) Preconditions.checkNotNullFromProvides(interstitialClientModule.c(acg));
    }
}
