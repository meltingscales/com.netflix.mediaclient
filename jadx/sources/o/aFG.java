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
public final class aFG implements Factory<InterfaceC1551aFm<Boolean>> {
    private final Provider<C1555aFq> c;
    private final HendrixProfileConfigModule e;

    @Override // javax.inject.Provider
    /* renamed from: d */
    public InterfaceC1551aFm<Boolean> get() {
        return c(this.e, this.c.get());
    }

    public static InterfaceC1551aFm<Boolean> c(HendrixProfileConfigModule hendrixProfileConfigModule, C1555aFq c1555aFq) {
        return (InterfaceC1551aFm) Preconditions.checkNotNullFromProvides(hendrixProfileConfigModule.a(c1555aFq));
    }
}
