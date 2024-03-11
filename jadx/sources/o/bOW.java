package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.games.impl.games.GamesBottomTab_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class bOW implements Factory<bOT> {
    private final Provider<Activity> a;
    private final GamesBottomTab_ActivityComponent_HiltModule d;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public bOT get() {
        return e(this.d, this.a.get());
    }

    public static bOT e(GamesBottomTab_ActivityComponent_HiltModule gamesBottomTab_ActivityComponent_HiltModule, Activity activity) {
        return (bOT) Preconditions.checkNotNullFromProvides(gamesBottomTab_ActivityComponent_HiltModule.a(activity));
    }
}
