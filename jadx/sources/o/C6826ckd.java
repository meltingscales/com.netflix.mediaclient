package o;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiEntryPointModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiMoneyballData"})
/* renamed from: o.ckd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6826ckd implements Factory<InterfaceC6829ckg> {
    private final Provider<MoneyballDataComponent.Builder> b;
    private final Provider<MoneyballDataSource> d;
    private final MhuEbiEntryPointModule e;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public InterfaceC6829ckg get() {
        return e(this.e, this.b, this.d.get());
    }

    public static InterfaceC6829ckg e(MhuEbiEntryPointModule mhuEbiEntryPointModule, Provider<MoneyballDataComponent.Builder> provider, MoneyballDataSource moneyballDataSource) {
        return (InterfaceC6829ckg) Preconditions.checkNotNullFromProvides(mhuEbiEntryPointModule.a(provider, moneyballDataSource));
    }
}
