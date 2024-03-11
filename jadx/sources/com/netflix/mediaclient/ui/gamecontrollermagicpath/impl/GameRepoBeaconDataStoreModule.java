package com.netflix.mediaclient.ui.gamecontrollermagicpath.impl;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Named;
import o.C8627dsp;
import o.C8632dsu;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes4.dex */
public final class GameRepoBeaconDataStoreModule {
    public static final a d = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    @Provides
    @Named("GameControllerSharedPreferences")
    public final SharedPreferences e(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.netflix.android.gamecontrollermagicpath", 0);
        C8632dsu.a(sharedPreferences, "");
        return sharedPreferences;
    }
}
