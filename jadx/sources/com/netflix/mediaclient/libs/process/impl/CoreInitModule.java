package com.netflix.mediaclient.libs.process.impl;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;
import java.util.Map;
import javax.inject.Provider;
import o.C8632dsu;
import o.aGN;
import o.dwU;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class CoreInitModule {

    /* loaded from: classes3.dex */
    public static final class c implements aGN {
        final /* synthetic */ Map<String, Provider<aGN>> b;
        final /* synthetic */ dwU c;

        c(Map<String, Provider<aGN>> map, dwU dwu) {
            this.b = map;
            this.c = dwu;
        }
    }

    @Provides
    @IntoMap
    public final aGN c(dwU dwu, Map<String, Provider<aGN>> map) {
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) map, "");
        return new c(map, dwu);
    }

    /* loaded from: classes3.dex */
    public static final class a implements aGN {
        final /* synthetic */ dwU a;
        final /* synthetic */ Map<String, Provider<aGN>> b;

        a(dwU dwu, Map<String, Provider<aGN>> map) {
            this.a = dwu;
            this.b = map;
        }
    }

    @Provides
    @IntoMap
    public final aGN d(dwU dwu, Map<String, Provider<aGN>> map) {
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) map, "");
        return new a(dwu, map);
    }
}
