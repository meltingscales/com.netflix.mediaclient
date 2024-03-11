package o;

import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpFragmentModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class bPN implements Factory<dwU> {
    private final GdpFragmentModule a;
    private final Provider<Fragment> b;

    @Override // javax.inject.Provider
    /* renamed from: d */
    public dwU get() {
        return e(this.a, this.b.get());
    }

    public static dwU e(GdpFragmentModule gdpFragmentModule, Fragment fragment) {
        return (dwU) Preconditions.checkNotNullFromProvides(gdpFragmentModule.b(fragment));
    }
}
