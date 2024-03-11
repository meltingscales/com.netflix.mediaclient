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
public final class bPL implements Factory<C9935zP> {
    private final GdpFragmentModule a;
    private final Provider<Fragment> d;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public C9935zP get() {
        return e(this.a, this.d.get());
    }

    public static C9935zP e(GdpFragmentModule gdpFragmentModule, Fragment fragment) {
        return (C9935zP) Preconditions.checkNotNullFromProvides(gdpFragmentModule.a(fragment));
    }
}
