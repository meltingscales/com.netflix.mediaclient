package com.netflix.mediaclient.ui.offline;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C8632dsu;
import o.InterfaceC7306cti;

/* loaded from: classes4.dex */
public final class OfflineActivityApiImpl implements InterfaceC7306cti {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface OfflineActivityModule {
        @Binds
        InterfaceC7306cti b(OfflineActivityApiImpl offlineActivityApiImpl);
    }

    @Override // o.InterfaceC7306cti
    public Intent d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return OfflineActivityV2.b.d(activity);
    }

    @Override // o.InterfaceC7306cti
    public Intent b(Context context) {
        C8632dsu.c((Object) context, "");
        return OfflineActivityV2.b.e(context);
    }

    @Override // o.InterfaceC7306cti
    public boolean a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return activity instanceof OfflineActivityV2;
    }
}
