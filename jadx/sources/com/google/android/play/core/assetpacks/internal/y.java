package com.google.android.play.core.assetpacks.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y implements ServiceConnection {
    final /* synthetic */ z a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ y(z zVar, x xVar) {
        this.a = zVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        z.f(this.a).d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        z zVar = this.a;
        zVar.c().post(new v(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        z.f(this.a).d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        z zVar = this.a;
        zVar.c().post(new w(this));
    }
}
