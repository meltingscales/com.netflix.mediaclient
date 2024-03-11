package o;

import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpFragmentModule;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
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
public final class bPP implements Factory<MiniPlayerVideoGroupViewModel> {
    private final Provider<Fragment> a;
    private final GdpFragmentModule d;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public MiniPlayerVideoGroupViewModel get() {
        return e(this.d, this.a.get());
    }

    public static MiniPlayerVideoGroupViewModel e(GdpFragmentModule gdpFragmentModule, Fragment fragment) {
        return (MiniPlayerVideoGroupViewModel) Preconditions.checkNotNullFromProvides(gdpFragmentModule.c(fragment));
    }
}
