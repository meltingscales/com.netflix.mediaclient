package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class t extends p {
    final /* synthetic */ z a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(z zVar) {
        this.a = zVar;
    }

    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        o oVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        o oVar2;
        obj = this.a.g;
        synchronized (obj) {
            atomicInteger = this.a.l;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.a.l;
                if (atomicInteger2.decrementAndGet() > 0) {
                    oVar2 = this.a.c;
                    oVar2.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            z zVar = this.a;
            iInterface = zVar.n;
            if (iInterface != null) {
                oVar = zVar.c;
                oVar.d("Unbind from service.", new Object[0]);
                z zVar2 = this.a;
                context = zVar2.b;
                serviceConnection = zVar2.m;
                context.unbindService(serviceConnection);
                this.a.h = false;
                this.a.n = null;
                this.a.m = null;
            }
            this.a.w();
        }
    }
}
