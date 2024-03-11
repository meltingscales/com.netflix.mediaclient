package o;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.CfourSurveyRetainedModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.CfourMoneyballData"})
/* renamed from: o.bzc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5483bzc implements Factory<MoneyballDataSource> {
    private final CfourSurveyRetainedModule c;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public MoneyballDataSource get() {
        return d(this.c);
    }

    public static MoneyballDataSource d(CfourSurveyRetainedModule cfourSurveyRetainedModule) {
        return (MoneyballDataSource) Preconditions.checkNotNullFromProvides(cfourSurveyRetainedModule.d());
    }
}
