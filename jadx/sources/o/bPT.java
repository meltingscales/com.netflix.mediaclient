package o;

import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpFragmentModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.FragmentScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.ui.games.impl.gdp.TrailerAutoPlay"})
/* loaded from: classes4.dex */
public final class bPT implements Factory<bLW> {
    private final Provider<C1619aI> a;
    private final Provider<Fragment> b;
    private final Provider<dwU> c;
    private final GdpFragmentModule e;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public bLW get() {
        return e(this.e, this.c.get(), this.a.get(), this.b.get());
    }

    public static bLW e(GdpFragmentModule gdpFragmentModule, dwU dwu, C1619aI c1619aI, Fragment fragment) {
        return (bLW) Preconditions.checkNotNullFromProvides(gdpFragmentModule.d(dwu, c1619aI, fragment));
    }
}
