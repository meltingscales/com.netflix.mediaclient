package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.details.DetailsPagePrefetcher_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bFv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3653bFv implements Factory<InterfaceC3645bFn> {
    private final Provider<Activity> b;
    private final DetailsPagePrefetcher_ActivityComponent_HiltModule d;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public InterfaceC3645bFn get() {
        return d(this.d, this.b.get());
    }

    public static InterfaceC3645bFn d(DetailsPagePrefetcher_ActivityComponent_HiltModule detailsPagePrefetcher_ActivityComponent_HiltModule, Activity activity) {
        return (InterfaceC3645bFn) Preconditions.checkNotNullFromProvides(detailsPagePrefetcher_ActivityComponent_HiltModule.a(activity));
    }
}
