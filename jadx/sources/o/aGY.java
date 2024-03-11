package o;

import com.netflix.mediaclient.localdiscovery.impl.LocalDiscoveryProviderConfigModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.api.HendrixConfig"})
/* loaded from: classes3.dex */
public final class aGY implements Factory<List<String>> {
    private final Provider<dEB> b;
    private final LocalDiscoveryProviderConfigModule e;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public List<String> get() {
        return a(this.e, this.b);
    }

    public static List<String> a(LocalDiscoveryProviderConfigModule localDiscoveryProviderConfigModule, Provider<dEB> provider) {
        return (List) Preconditions.checkNotNullFromProvides(localDiscoveryProviderConfigModule.b(provider));
    }
}
