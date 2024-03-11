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
public final class aFN implements Factory<String> {
    private final Provider<C1555aFq> a;
    private final HendrixSingletonConfigModule b;

    @Override // javax.inject.Provider
    /* renamed from: d */
    public String get() {
        return c(this.b, this.a.get());
    }

    public static String c(HendrixSingletonConfigModule hendrixSingletonConfigModule, C1555aFq c1555aFq) {
        return (String) Preconditions.checkNotNullFromProvides(hendrixSingletonConfigModule.x(c1555aFq));
    }
}
