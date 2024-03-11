package o;

import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
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
public final class bPI implements Factory<AppView> {
    private final GdpFragmentModule a;
    private final Provider<Fragment> d;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public AppView get() {
        return d(this.a, this.d.get());
    }

    public static AppView d(GdpFragmentModule gdpFragmentModule, Fragment fragment) {
        return (AppView) Preconditions.checkNotNullFromProvides(gdpFragmentModule.d(fragment));
    }
}
