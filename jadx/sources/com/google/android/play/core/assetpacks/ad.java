package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
final class ad extends com.google.android.play.core.assetpacks.internal.p {
    final /* synthetic */ List a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ aw c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(aw awVar, TaskCompletionSource taskCompletionSource, List list, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.c = awVar;
        this.a = list;
        this.b = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.play.core.assetpacks.internal.f, android.os.IInterface] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        com.google.android.play.core.assetpacks.internal.o oVar;
        com.google.android.play.core.assetpacks.internal.z zVar;
        String str;
        Bundle A;
        ArrayList v = aw.v(this.a);
        try {
            zVar = this.c.f;
            ?? e = zVar.e();
            str = this.c.c;
            A = aw.A();
            e.c(str, v, A, new am(this.c, this.b));
        } catch (RemoteException e2) {
            oVar = aw.a;
            oVar.c(e2, "cancelDownloads(%s)", this.a);
        }
    }
}
