package o;

import com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.api.HendrixConfig", "com.netflix.mediaclient.hendrixconfig.impl.ConfigInternal"})
/* loaded from: classes3.dex */
public final class aFI implements Factory<dEB> {
    private final HendrixSingletonConfigModule b;
    private final Provider<dEB> d;
    private final Provider<C1555aFq> e;

    @Override // javax.inject.Provider
    /* renamed from: d */
    public dEB get() {
        return c(this.b, this.e.get(), this.d);
    }

    public static dEB c(HendrixSingletonConfigModule hendrixSingletonConfigModule, C1555aFq c1555aFq, Provider<dEB> provider) {
        return (dEB) Preconditions.checkNotNullFromProvides(hendrixSingletonConfigModule.e(c1555aFq, provider));
    }
}
