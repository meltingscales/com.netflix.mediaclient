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
public final class aFP implements Factory<String> {
    private final Provider<C1555aFq> a;
    private final HendrixSingletonConfigModule c;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public String get() {
        return d(this.c, this.a.get());
    }

    public static String d(HendrixSingletonConfigModule hendrixSingletonConfigModule, C1555aFq c1555aFq) {
        return (String) Preconditions.checkNotNullFromProvides(hendrixSingletonConfigModule.v(c1555aFq));
    }
}
