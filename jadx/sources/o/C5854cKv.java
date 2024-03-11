package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.profile.impl.MyNetflixTab_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cKv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5854cKv implements Factory<C5845cKm> {
    private final Provider<Activity> c;
    private final MyNetflixTab_ActivityComponent_HiltModule e;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public C5845cKm get() {
        return b(this.e, this.c.get());
    }

    public static C5845cKm b(MyNetflixTab_ActivityComponent_HiltModule myNetflixTab_ActivityComponent_HiltModule, Activity activity) {
        return (C5845cKm) Preconditions.checkNotNullFromProvides(myNetflixTab_ActivityComponent_HiltModule.d(activity));
    }
}
