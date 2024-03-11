package dagger.hilt.android.internal.modules;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes.dex */
public final class ApplicationContextModule {
    private final Context applicationContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    @ApplicationContext
    public Context provideContext() {
        return this.applicationContext;
    }

    public ApplicationContextModule(Context context) {
        this.applicationContext = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public Application provideApplication() {
        return Contexts.getApplication(this.applicationContext);
    }
}
