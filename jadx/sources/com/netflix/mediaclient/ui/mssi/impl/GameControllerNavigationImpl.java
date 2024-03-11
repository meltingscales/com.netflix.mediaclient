package com.netflix.mediaclient.ui.mssi.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.netflix.cl.model.secondscreen.ConnectionSource;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC6704ciN;

/* loaded from: classes4.dex */
public final class GameControllerNavigationImpl implements InterfaceC6704ciN {
    public static final e e = new e(null);

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface GameControllerNavigationModule {
        @Binds
        InterfaceC6704ciN c(GameControllerNavigationImpl gameControllerNavigationImpl);
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("GameControllerNavigationImpl");
        }
    }

    @Override // o.InterfaceC6704ciN
    public Intent d(Context context, String str, ConnectionSource connectionSource) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) connectionSource, "");
        return GameControllerActivity.d.c(context, str, connectionSource);
    }

    @Override // o.InterfaceC6704ciN
    public Intent c(Context context, String str, ConnectionSource connectionSource) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) connectionSource, "");
        String str2 = "https://app.netflix.com/connection/" + str + "?connectionSource=" + connectionSource.ordinal();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str2));
        return intent;
    }

    @Override // o.InterfaceC6704ciN
    public Intent b(Context context, Map<String, String> map) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) map, "");
        return GameControllerActivity.d.a(context, map);
    }
}
