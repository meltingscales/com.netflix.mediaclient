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
public final class aFK implements Factory<dEB> {
    private final HendrixSingletonConfigModule c;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public dEB get() {
        return a(this.c);
    }

    public static dEB a(HendrixSingletonConfigModule hendrixSingletonConfigModule) {
        return (dEB) Preconditions.checkNotNullFromProvides(hendrixSingletonConfigModule.b());
    }
}
