package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zacz extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ zada zaa;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        zada zadaVar;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i);
            return;
        }
        PendingResult pendingResult = (PendingResult) message.obj;
        obj = this.zaa.zae;
        synchronized (obj) {
            zadaVar = this.zaa.zab;
            zada zadaVar2 = (zada) Preconditions.checkNotNull(zadaVar);
            if (pendingResult == null) {
                zadaVar2.zaj(new Status(13, "Transform returned null"));
            } else if (pendingResult instanceof zacp) {
                zadaVar2.zaj(((zacp) pendingResult).zaa());
            } else {
                zadaVar2.zai(pendingResult);
            }
        }
    }
}