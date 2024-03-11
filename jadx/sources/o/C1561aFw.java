package o;

import android.content.Context;
import com.netflix.mediaclient.hendrixconfig.impl.CoreSingletonConfigModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.impl.ConfigInternal", "dagger.hilt.android.qualifiers.ApplicationContext", "com.netflix.common.di.App"})
/* renamed from: o.aFw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1561aFw implements Factory<C1555aFq> {
    private final Provider<Set<InterfaceC1544aFf>> a;
    private final Provider<Set<InterfaceC1543aFe>> b;
    private final Provider<Context> c;
    private final Provider<dwU> d;
    private final CoreSingletonConfigModule e;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public C1555aFq get() {
        return c(this.e, this.c.get(), this.d.get(), this.a.get(), this.b.get());
    }

    public static C1555aFq c(CoreSingletonConfigModule coreSingletonConfigModule, Context context, dwU dwu, Set<InterfaceC1544aFf> set, Set<InterfaceC1543aFe> set2) {
        return (C1555aFq) Preconditions.checkNotNullFromProvides(coreSingletonConfigModule.e(context, dwu, set, set2));
    }
}
