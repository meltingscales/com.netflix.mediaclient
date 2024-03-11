package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
final class ai extends com.google.android.play.core.assetpacks.internal.p {
    final /* synthetic */ int a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ aw c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aw awVar, TaskCompletionSource taskCompletionSource, int i, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.c = awVar;
        this.a = i;
        this.b = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.assetpacks.internal.f, android.os.IInterface] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        com.google.android.play.core.assetpacks.internal.o oVar;
        com.google.android.play.core.assetpacks.internal.z zVar;
        String str;
        Bundle B;
        Bundle A;
        try {
            zVar = this.c.f;
            ?? e = zVar.e();
            str = this.c.c;
            B = aw.B(this.a);
            A = aw.A();
            e.i(str, B, A, new as(this.c, this.b));
        } catch (RemoteException e2) {
            oVar = aw.a;
            oVar.c(e2, "notifySessionFailed", new Object[0]);
        }
    }
}
