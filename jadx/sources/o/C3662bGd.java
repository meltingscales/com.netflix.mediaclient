package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.detailspage.api.DetailsPageRepository_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bGd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3662bGd implements Factory<InterfaceC3663bGe> {
    private final DetailsPageRepository_ActivityComponent_HiltModule c;
    private final Provider<Activity> d;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public InterfaceC3663bGe get() {
        return d(this.c, this.d.get());
    }

    public static InterfaceC3663bGe d(DetailsPageRepository_ActivityComponent_HiltModule detailsPageRepository_ActivityComponent_HiltModule, Activity activity) {
        return (InterfaceC3663bGe) Preconditions.checkNotNullFromProvides(detailsPageRepository_ActivityComponent_HiltModule.c(activity));
    }
}
