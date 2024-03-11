package o;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.CfourSurveyModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.CfourMoneyballData"})
/* renamed from: o.bza  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5481bza implements Factory<InterfaceC5427byZ> {
    private final CfourSurveyModule a;
    private final Provider<MoneyballDataComponent.Builder> d;
    private final Provider<MoneyballDataSource> e;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public InterfaceC5427byZ get() {
        return e(this.a, this.d, this.e.get());
    }

    public static InterfaceC5427byZ e(CfourSurveyModule cfourSurveyModule, Provider<MoneyballDataComponent.Builder> provider, MoneyballDataSource moneyballDataSource) {
        return (InterfaceC5427byZ) Preconditions.checkNotNullFromProvides(cfourSurveyModule.b(provider, moneyballDataSource));
    }
}
