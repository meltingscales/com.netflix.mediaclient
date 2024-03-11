package dagger.hilt.android.internal.modules;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ApplicationContextModule_ProvideApplicationFactory implements Factory<Application> {
    private final ApplicationContextModule module;

    public ApplicationContextModule_ProvideApplicationFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    @Override // javax.inject.Provider
    public Application get() {
        return provideApplication(this.module);
    }

    public static ApplicationContextModule_ProvideApplicationFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideApplicationFactory(applicationContextModule);
    }

    public static Application provideApplication(ApplicationContextModule applicationContextModule) {
        return (Application) Preconditions.checkNotNullFromProvides(applicationContextModule.provideApplication());
    }
}
