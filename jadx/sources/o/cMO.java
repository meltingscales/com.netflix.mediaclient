package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.profiles.MyNetflixWatchHistoryRepository_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class cMO implements Factory<cMK> {
    private final Provider<Activity> c;
    private final MyNetflixWatchHistoryRepository_ActivityComponent_HiltModule d;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public cMK get() {
        return b(this.d, this.c.get());
    }

    public static cMK b(MyNetflixWatchHistoryRepository_ActivityComponent_HiltModule myNetflixWatchHistoryRepository_ActivityComponent_HiltModule, Activity activity) {
        return (cMK) Preconditions.checkNotNullFromProvides(myNetflixWatchHistoryRepository_ActivityComponent_HiltModule.e(activity));
    }
}
