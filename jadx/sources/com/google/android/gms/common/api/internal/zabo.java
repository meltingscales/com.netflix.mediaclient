package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
final class zabo implements Runnable {
    final /* synthetic */ zabp zaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zabo(zabp zabpVar) {
        this.zaa = zabpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client;
        Api.Client client2;
        zabq zabqVar = this.zaa.zaa;
        client = zabqVar.zac;
        client2 = zabqVar.zac;
        client.disconnect(client2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
