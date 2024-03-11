package dagger.hilt.android.internal.modules;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.qualifiers.ActivityContext;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
abstract class ActivityModule {
    @Binds
    @ActivityContext
    abstract Context provideContext(Activity activity);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    @Reusable
    public static FragmentActivity provideFragmentActivity(Activity activity) {
        try {
            return (FragmentActivity) activity;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e);
        }
    }

    private ActivityModule() {
    }
}
