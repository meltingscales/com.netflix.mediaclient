package o;

import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpFragmentModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.FragmentScoped")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class bPS implements Factory<TrackingInfoHolder> {
    private final GdpFragmentModule b;
    private final Provider<Fragment> e;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public TrackingInfoHolder get() {
        return c(this.b, this.e.get());
    }

    public static TrackingInfoHolder c(GdpFragmentModule gdpFragmentModule, Fragment fragment) {
        return (TrackingInfoHolder) Preconditions.checkNotNullFromProvides(gdpFragmentModule.e(fragment));
    }
}
