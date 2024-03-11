package o;

import com.netflix.mediaclient.hendrixconfig.impl.CoreProfileConfigModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.impl.ConfigInternal"})
/* renamed from: o.aFu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1559aFu implements Factory<aFR> {
    private final CoreProfileConfigModule b;
    private final Provider<C1555aFq> e;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public aFR get() {
        return a(this.b, this.e.get());
    }

    public static aFR a(CoreProfileConfigModule coreProfileConfigModule, C1555aFq c1555aFq) {
        return (aFR) Preconditions.checkNotNullFromProvides(coreProfileConfigModule.c(c1555aFq));
    }
}
