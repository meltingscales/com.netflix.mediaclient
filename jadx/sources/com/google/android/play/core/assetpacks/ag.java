package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
final class ag extends com.google.android.play.core.assetpacks.internal.p {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ TaskCompletionSource e;
    final /* synthetic */ aw f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aw awVar, TaskCompletionSource taskCompletionSource, int i, String str, String str2, int i2, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f = awVar;
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.assetpacks.internal.f, android.os.IInterface] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        com.google.android.play.core.assetpacks.internal.o oVar;
        com.google.android.play.core.assetpacks.internal.z zVar;
        String str;
        Bundle A;
        try {
            zVar = this.f.f;
            ?? e = zVar.e();
            str = this.f.c;
            Bundle k = aw.k(this.a, this.b, this.c, this.d);
            A = aw.A();
            e.g(str, k, A, new aq(this.f, this.e));
        } catch (RemoteException e2) {
            oVar = aw.a;
            oVar.c(e2, "notifyChunkTransferred", new Object[0]);
        }
    }
}
