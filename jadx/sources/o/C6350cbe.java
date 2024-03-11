package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.login.OneTimePassCodeFlowModuleAb54131;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cbe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6350cbe implements Factory<C6283caQ> {
    private final Provider<RecaptchaV3Manager.c> a;
    private final OneTimePassCodeFlowModuleAb54131 c;
    private final Provider<Activity> d;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public C6283caQ get() {
        return c(this.c, this.d.get(), this.a.get());
    }

    public static C6283caQ c(OneTimePassCodeFlowModuleAb54131 oneTimePassCodeFlowModuleAb54131, Activity activity, RecaptchaV3Manager.c cVar) {
        return (C6283caQ) Preconditions.checkNotNullFromProvides(oneTimePassCodeFlowModuleAb54131.b(activity, cVar));
    }
}
