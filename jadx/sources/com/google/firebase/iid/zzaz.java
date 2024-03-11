package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final class zzaz extends Binder {
    private final zzbb zza;

    public zzaz(zzbb zzbbVar) {
        this.zza = zzbbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(final zzbd zzbdVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
        }
        this.zza.zza(zzbdVar.zza).addOnCompleteListener(zza.zza(), new OnCompleteListener(zzbdVar) { // from class: com.google.firebase.iid.zzay
            private final zzbd zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbdVar;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zza();
            }
        });
    }
}
