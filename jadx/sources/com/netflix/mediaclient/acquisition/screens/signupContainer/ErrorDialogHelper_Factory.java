package com.netflix.mediaclient.acquisition.screens.signupContainer;

import android.app.Activity;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ErrorDialogHelper_Factory implements Factory<ErrorDialogHelper> {
    private final Provider<Activity> activityProvider;
    private final Provider<LoginApi> loginApiProvider;

    public ErrorDialogHelper_Factory(Provider<Activity> provider, Provider<LoginApi> provider2) {
        this.activityProvider = provider;
        this.loginApiProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ErrorDialogHelper get() {
        return newInstance(this.activityProvider.get(), this.loginApiProvider.get());
    }

    public static ErrorDialogHelper_Factory create(Provider<Activity> provider, Provider<LoginApi> provider2) {
        return new ErrorDialogHelper_Factory(provider, provider2);
    }

    public static ErrorDialogHelper newInstance(Activity activity, LoginApi loginApi) {
        return new ErrorDialogHelper(activity, loginApi);
    }
}
