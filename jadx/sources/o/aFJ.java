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
public final class aFJ implements Factory<dEB> {
    private final Provider<C1555aFq> a;
    private final HendrixSingletonConfigModule b;
    private final Provider<dEB> c;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public dEB get() {
        return c(this.b, this.a.get(), this.c);
    }

    public static dEB c(HendrixSingletonConfigModule hendrixSingletonConfigModule, C1555aFq c1555aFq, Provider<dEB> provider) {
        return (dEB) Preconditions.checkNotNullFromProvides(hendrixSingletonConfigModule.d(c1555aFq, provider));
    }
}
