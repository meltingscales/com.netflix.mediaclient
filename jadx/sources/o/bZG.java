package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.live.api.LiveStateManager_ActivityComponent_HiltModule;
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
public final class bZG implements Factory<bZI> {
    private final LiveStateManager_ActivityComponent_HiltModule a;
    private final Provider<Activity> e;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public bZI get() {
        return c(this.a, this.e.get());
    }

    public static bZI c(LiveStateManager_ActivityComponent_HiltModule liveStateManager_ActivityComponent_HiltModule, Activity activity) {
        return (bZI) Preconditions.checkNotNullFromProvides(liveStateManager_ActivityComponent_HiltModule.c(activity));
    }
}
