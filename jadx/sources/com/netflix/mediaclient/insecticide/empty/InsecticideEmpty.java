package com.netflix.mediaclient.insecticide.empty;

import android.content.Context;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C8632dsu;
import o.InterfaceC1568aGc;

/* loaded from: classes3.dex */
public final class InsecticideEmpty implements InterfaceC1568aGc {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface InsecticideModule {
        @Binds
        InterfaceC1568aGc c(InsecticideEmpty insecticideEmpty);
    }

    @Override // o.InterfaceC1568aGc
    public void b(Context context, Throwable th) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) th, "");
    }
}
