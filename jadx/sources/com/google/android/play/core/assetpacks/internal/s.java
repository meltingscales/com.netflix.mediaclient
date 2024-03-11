package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class s extends p {
    final /* synthetic */ TaskCompletionSource a;
    final /* synthetic */ p b;
    final /* synthetic */ z c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, p pVar) {
        super(taskCompletionSource);
        this.c = zVar;
        this.a = taskCompletionSource2;
        this.b = pVar;
    }

    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        Object obj;
        AtomicInteger atomicInteger;
        o oVar;
        obj = this.c.g;
        synchronized (obj) {
            z.n(this.c, this.a);
            atomicInteger = this.c.l;
            if (atomicInteger.getAndIncrement() > 0) {
                oVar = this.c.c;
                oVar.d("Already connected to the service.", new Object[0]);
            }
            z.p(this.c, this.b);
        }
    }
}
