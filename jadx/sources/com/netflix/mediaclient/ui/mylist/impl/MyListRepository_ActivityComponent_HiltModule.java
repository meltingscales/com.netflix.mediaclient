package com.netflix.mediaclient.ui.mylist.impl;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.InterfaceC6957cnB;
import o.InterfaceC7005cnx;

@OriginatingElement(topLevelClass = InterfaceC7005cnx.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public class MyListRepository_ActivityComponent_HiltModule {
    @Provides
    public InterfaceC7005cnx b(Activity activity) {
        return ((InterfaceC6957cnB) C1642aIw.b((NetflixActivityBase) activity, InterfaceC6957cnB.class)).G();
    }
}
