package com.netflix.mediaclient.hendrixconfig.api;

import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface OptionalHendrixConfigHash {
    @BindsOptionalOf
    String e();
}
