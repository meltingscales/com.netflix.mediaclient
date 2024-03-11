package o;

import android.content.Context;
import com.netflix.mediaclient.hendrixconfig.impl.CoreProfileConfigModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;
import javax.inject.Provider;

@ScopeMetadata("com.netflix.mediaclient.hilt.ProfileScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.impl.ConfigInternal", "dagger.hilt.android.qualifiers.ApplicationContext", "com.netflix.common.di.App"})
/* renamed from: o.aFx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1562aFx implements Factory<C1555aFq> {
    private final Provider<dwU> a;
    private final Provider<C1567aGb> b;
    private final Provider<Context> c;
    private final Provider<Set<InterfaceC1543aFe>> d;
    private final Provider<Set<InterfaceC1544aFf>> e;
    private final CoreProfileConfigModule i;

    @Override // javax.inject.Provider
    /* renamed from: d */
    public C1555aFq get() {
        return b(this.i, this.c.get(), this.b.get(), this.a.get(), this.e.get(), this.d.get());
    }

    public static C1555aFq b(CoreProfileConfigModule coreProfileConfigModule, Context context, C1567aGb c1567aGb, dwU dwu, Set<InterfaceC1544aFf> set, Set<InterfaceC1543aFe> set2) {
        return (C1555aFq) Preconditions.checkNotNullFromProvides(coreProfileConfigModule.a(context, c1567aGb, dwu, set, set2));
    }
}
