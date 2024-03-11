package o;

import com.netflix.mediaclient.ui.games.impl.gdp.GdpFragmentModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.hilt.android.scopes.FragmentScoped")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class bPU implements Factory<C1619aI> {
    private final GdpFragmentModule b;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public C1619aI get() {
        return b(this.b);
    }

    public static C1619aI b(GdpFragmentModule gdpFragmentModule) {
        return (C1619aI) Preconditions.checkNotNullFromProvides(gdpFragmentModule.a());
    }
}
