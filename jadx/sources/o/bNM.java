package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.games.api.GamesAssetFetcher_ActivityComponent_HiltModule;
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
public final class bNM implements Factory<bNL> {
    private final Provider<Activity> b;
    private final GamesAssetFetcher_ActivityComponent_HiltModule e;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public bNL get() {
        return c(this.e, this.b.get());
    }

    public static bNL c(GamesAssetFetcher_ActivityComponent_HiltModule gamesAssetFetcher_ActivityComponent_HiltModule, Activity activity) {
        return (bNL) Preconditions.checkNotNullFromProvides(gamesAssetFetcher_ActivityComponent_HiltModule.c(activity));
    }
}
