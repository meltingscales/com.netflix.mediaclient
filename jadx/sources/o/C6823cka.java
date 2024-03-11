package o;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiDataModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiMoneyballData"})
/* renamed from: o.cka  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6823cka implements Factory<MoneyballDataSource> {
    private final MhuEbiDataModule e;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public MoneyballDataSource get() {
        return d(this.e);
    }

    public static MoneyballDataSource d(MhuEbiDataModule mhuEbiDataModule) {
        return (MoneyballDataSource) Preconditions.checkNotNullFromProvides(mhuEbiDataModule.b());
    }
}
