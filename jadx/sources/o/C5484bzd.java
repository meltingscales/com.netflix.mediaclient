package o;

import com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.CfourSurveyModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bzd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5484bzd implements Factory<InterfaceC5425byX> {
    private final CfourSurveyModule b;
    private final Provider<C5424byW> c;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public InterfaceC5425byX get() {
        return e(this.b, this.c.get());
    }

    public static InterfaceC5425byX e(CfourSurveyModule cfourSurveyModule, C5424byW c5424byW) {
        return (InterfaceC5425byX) Preconditions.checkNotNullFromProvides(cfourSurveyModule.d(c5424byW));
    }
}
