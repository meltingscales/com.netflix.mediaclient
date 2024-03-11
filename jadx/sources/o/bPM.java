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
@QualifierMetadata({"com.netflix.mediaclient.ui.games.impl.gdp.BillBoardAutoPlay"})
/* loaded from: classes4.dex */
public final class bPM implements Factory<bLW> {
    private final GdpFragmentModule a;
    private final Provider<C1619aI> b;
    private final Provider<Fragment> d;
    private final Provider<dwU> e;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public bLW get() {
        return e(this.a, this.e.get(), this.b.get(), this.d.get());
    }

    public static bLW e(GdpFragmentModule gdpFragmentModule, dwU dwu, C1619aI c1619aI, Fragment fragment) {
        return (bLW) Preconditions.checkNotNullFromProvides(gdpFragmentModule.a(dwu, c1619aI, fragment));
    }
}
