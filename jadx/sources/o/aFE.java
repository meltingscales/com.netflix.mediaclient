package o;

import com.netflix.mediaclient.hendrixconfig.impl.HendrixProfileConfigModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("com.netflix.mediaclient.hilt.ProfileScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.api.HendrixConfig", "com.netflix.mediaclient.hendrixconfig.impl.ConfigInternal"})
/* loaded from: classes3.dex */
public final class aFE implements Factory<InterfaceC1551aFm<String>> {
    private final HendrixProfileConfigModule a;
    private final Provider<C1555aFq> c;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public InterfaceC1551aFm<String> get() {
        return e(this.a, this.c.get());
    }

    public static InterfaceC1551aFm<String> e(HendrixProfileConfigModule hendrixProfileConfigModule, C1555aFq c1555aFq) {
        return (InterfaceC1551aFm) Preconditions.checkNotNullFromProvides(hendrixProfileConfigModule.e(c1555aFq));
    }
}
