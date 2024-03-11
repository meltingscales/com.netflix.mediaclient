package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.home.impl.HomeTab_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bTc  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4016bTc implements Factory<bSZ> {
    private final HomeTab_ActivityComponent_HiltModule d;
    private final Provider<Activity> e;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public bSZ get() {
        return b(this.d, this.e.get());
    }

    public static bSZ b(HomeTab_ActivityComponent_HiltModule homeTab_ActivityComponent_HiltModule, Activity activity) {
        return (bSZ) Preconditions.checkNotNullFromProvides(homeTab_ActivityComponent_HiltModule.b(activity));
    }
}
