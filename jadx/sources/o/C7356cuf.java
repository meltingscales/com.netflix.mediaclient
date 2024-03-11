package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.offline.OfflineTab_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cuf  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7356cuf implements Factory<C7296ctY> {
    private final OfflineTab_ActivityComponent_HiltModule b;
    private final Provider<Activity> e;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public C7296ctY get() {
        return c(this.b, this.e.get());
    }

    public static C7296ctY c(OfflineTab_ActivityComponent_HiltModule offlineTab_ActivityComponent_HiltModule, Activity activity) {
        return (C7296ctY) Preconditions.checkNotNullFromProvides(offlineTab_ActivityComponent_HiltModule.b(activity));
    }
}
