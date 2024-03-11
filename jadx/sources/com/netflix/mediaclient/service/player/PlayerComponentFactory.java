package com.netflix.mediaclient.service.player;

import android.content.Context;
import android.os.Looper;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C4352bcr;
import o.C4390bdc;
import o.C4427beM;
import o.C4572bgz;
import o.C4619bht;
import o.InterfaceC4522bgB;
import o.InterfaceC4942bpR;
import o.aHJ;
import o.aOV;
import o.aTX;

/* loaded from: classes3.dex */
public interface PlayerComponentFactory {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface PlayerComponentFactoryModule {
        @BindsOptionalOf
        PlayerComponentFactory b();
    }

    C4352bcr a(Context context, aOV aov, UserAgent userAgent, InterfaceC4942bpR interfaceC4942bpR, IClientLogging iClientLogging, C4390bdc c4390bdc);

    C4427beM a(Looper looper, InterfaceC4522bgB interfaceC4522bgB, C4390bdc c4390bdc, boolean z, aTX atx);

    C4572bgz a(Context context, Looper looper, C4390bdc c4390bdc, boolean z);

    C4619bht e(Context context, aOV aov, aHJ ahj);
}
