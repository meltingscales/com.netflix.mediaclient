package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes5.dex */
final class ae extends com.google.android.play.core.assetpacks.internal.p {
    final /* synthetic */ Map a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ aw c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(aw awVar, TaskCompletionSource taskCompletionSource, Map map, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.c = awVar;
        this.a = map;
        this.b = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.assetpacks.internal.f, android.os.IInterface] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        com.google.android.play.core.assetpacks.internal.o oVar;
        com.google.android.play.core.assetpacks.internal.z zVar;
        String str;
        try {
            zVar = this.c.f;
            ?? e = zVar.e();
            str = this.c.c;
            e.e(str, aw.n(this.a), new ao(this.c, this.b));
        } catch (RemoteException e2) {
            oVar = aw.a;
            oVar.c(e2, "syncPacks", new Object[0]);
            this.b.trySetException(new RuntimeException(e2));
        }
    }
}
