package o;

import com.netflix.mediaclient.hendrixconfig.impl.CoreSingletonConfigModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.Reusable")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.impl.ConfigInternal"})
/* renamed from: o.aFv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1560aFv implements Factory<aFD> {
    private final Provider<C1555aFq> b;
    private final CoreSingletonConfigModule d;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public aFD get() {
        return a(this.d, this.b.get());
    }

    public static aFD a(CoreSingletonConfigModule coreSingletonConfigModule, C1555aFq c1555aFq) {
        return (aFD) Preconditions.checkNotNullFromProvides(coreSingletonConfigModule.e(c1555aFq));
    }
}
