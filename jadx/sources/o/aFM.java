package o;

import com.netflix.mediaclient.hendrixconfig.impl.HendrixSingletonConfigModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.Reusable")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.impl.ConfigInternal"})
/* loaded from: classes3.dex */
public final class aFM implements Factory<dEB> {
    private final HendrixSingletonConfigModule a;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public dEB get() {
        return d(this.a);
    }

    public static dEB d(HendrixSingletonConfigModule hendrixSingletonConfigModule) {
        return (dEB) Preconditions.checkNotNullFromProvides(hendrixSingletonConfigModule.d());
    }
}
