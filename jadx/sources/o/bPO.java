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
@QualifierMetadata
/* loaded from: classes4.dex */
public final class bPO implements Factory<bLU> {
    private final Provider<C1619aI> a;
    private final Provider<dwU> b;
    private final Provider<Fragment> d;
    private final GdpFragmentModule e;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public bLU get() {
        return d(this.e, this.d.get(), this.b.get(), this.a.get());
    }

    public static bLU d(GdpFragmentModule gdpFragmentModule, Fragment fragment, dwU dwu, C1619aI c1619aI) {
        return (bLU) Preconditions.checkNotNullFromProvides(gdpFragmentModule.d(fragment, dwu, c1619aI));
    }
}
