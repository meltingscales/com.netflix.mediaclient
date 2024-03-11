package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class VerifyCardContextModule_VerifyCardContextClickListenerFactory implements Factory<VerifyCardContextFragment.VerifyCardContextClickListener> {
    private final Provider<Activity> activityProvider;
    private final VerifyCardContextModule module;

    public VerifyCardContextModule_VerifyCardContextClickListenerFactory(VerifyCardContextModule verifyCardContextModule, Provider<Activity> provider) {
        this.module = verifyCardContextModule;
        this.activityProvider = provider;
    }

    @Override // javax.inject.Provider
    public VerifyCardContextFragment.VerifyCardContextClickListener get() {
        return verifyCardContextClickListener(this.module, this.activityProvider.get());
    }

    public static VerifyCardContextModule_VerifyCardContextClickListenerFactory create(VerifyCardContextModule verifyCardContextModule, Provider<Activity> provider) {
        return new VerifyCardContextModule_VerifyCardContextClickListenerFactory(verifyCardContextModule, provider);
    }

    public static VerifyCardContextFragment.VerifyCardContextClickListener verifyCardContextClickListener(VerifyCardContextModule verifyCardContextModule, Activity activity) {
        return (VerifyCardContextFragment.VerifyCardContextClickListener) Preconditions.checkNotNullFromProvides(verifyCardContextModule.verifyCardContextClickListener(activity));
    }
}
