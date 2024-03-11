package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ah extends com.google.android.play.core.assetpacks.internal.p {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aw e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(aw awVar, TaskCompletionSource taskCompletionSource, int i, String str, TaskCompletionSource taskCompletionSource2, int i2) {
        super(taskCompletionSource);
        this.e = awVar;
        this.a = i;
        this.b = str;
        this.c = taskCompletionSource2;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.assetpacks.internal.f, android.os.IInterface] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        com.google.android.play.core.assetpacks.internal.o oVar;
        com.google.android.play.core.assetpacks.internal.z zVar;
        String str;
        Bundle z;
        Bundle A;
        try {
            zVar = this.e.f;
            ?? e = zVar.e();
            str = this.e.c;
            z = aw.z(this.a, this.b);
            A = aw.A();
            e.h(str, z, A, new ar(this.e, this.c, this.a, this.b, this.d));
        } catch (RemoteException e2) {
            oVar = aw.a;
            oVar.c(e2, "notifyModuleCompleted", new Object[0]);
        }
    }
}
