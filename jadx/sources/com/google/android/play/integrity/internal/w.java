package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w extends t {
    final /* synthetic */ TaskCompletionSource a;
    final /* synthetic */ t b;
    final /* synthetic */ ae c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.c = aeVar;
        this.a = taskCompletionSource2;
        this.b = tVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        s sVar;
        obj = this.c.g;
        synchronized (obj) {
            ae.o(this.c, this.a);
            atomicInteger = this.c.m;
            if (atomicInteger.getAndIncrement() > 0) {
                sVar = this.c.c;
                sVar.d("Already connected to the service.", new Object[0]);
            }
            ae.q(this.c, this.b);
        }
    }
}
