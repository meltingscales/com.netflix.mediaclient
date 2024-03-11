package dagger.hilt.android.internal.modules;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes5.dex */
public final class ApplicationContextModule_ProvideContextFactory implements Factory<Context> {
    private final ApplicationContextModule module;

    public ApplicationContextModule_ProvideContextFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideContext(this.module);
    }

    public static ApplicationContextModule_ProvideContextFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideContextFactory(applicationContextModule);
    }

    public static Context provideContext(ApplicationContextModule applicationContextModule) {
        return (Context) Preconditions.checkNotNullFromProvides(applicationContextModule.provideContext());
    }
}
