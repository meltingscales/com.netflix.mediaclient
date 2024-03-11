package com.netflix.mediaclient.ui.acquisition.module;

import com.netflix.mediaclient.acquisition.SignupImpl;
import com.netflix.mediaclient.acquisition.api.SignUpDebugUtilities;
import com.netflix.mediaclient.acquisition.api.Signup;
import dagger.Binds;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface SignupModule {
    @BindsOptionalOf
    SignUpDebugUtilities a();

    @Binds
    Signup d(SignupImpl signupImpl);
}
