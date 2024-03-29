package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzaw;
import com.google.firebase.iid.zzaz;
import com.google.firebase.iid.zzbb;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes5.dex */
public abstract class zzc extends Service {
    private final ExecutorService zza;
    private Binder zzb;
    private final Object zzc;
    private int zzd;
    private int zze;

    public zzc() {
        com.google.android.gms.internal.firebase_messaging.zzb zza = com.google.android.gms.internal.firebase_messaging.zza.zza();
        String simpleName = getClass().getSimpleName();
        this.zza = zza.zza(new NamedThreadFactory(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new String("Firebase-")), com.google.android.gms.internal.firebase_messaging.zzf.zza);
        this.zzc = new Object();
        this.zze = 0;
    }

    protected Intent zza(Intent intent) {
        return intent;
    }

    public boolean zzb(Intent intent) {
        return false;
    }

    public abstract void zzc(Intent intent);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Binder binder;
        synchronized (this) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.zzb == null) {
                this.zzb = new zzaz(new zzbb(this) { // from class: com.google.firebase.messaging.zzf
                    private final zzc zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // com.google.firebase.iid.zzbb
                    public final Task zza(Intent intent2) {
                        return this.zza.zzd(intent2);
                    }
                });
            }
            binder = this.zzb;
        }
        return binder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze */
    public final Task<Void> zzd(final Intent intent) {
        if (zzb(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.execute(new Runnable(this, intent, taskCompletionSource) { // from class: com.google.firebase.messaging.zze
            private final zzc zza;
            private final Intent zzb;
            private final TaskCompletionSource zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = intent;
                this.zzc = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzc zzcVar = this.zza;
                Intent intent2 = this.zzb;
                TaskCompletionSource taskCompletionSource2 = this.zzc;
                try {
                    zzcVar.zzc(intent2);
                } finally {
                    taskCompletionSource2.setResult(null);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.zzc) {
            this.zzd = i2;
            this.zze++;
        }
        Intent zza = zza(intent);
        if (zza == null) {
            zzf(intent);
            return 2;
        }
        Task<Void> zzd = zzd(zza);
        if (zzd.isComplete()) {
            zzf(intent);
            return 2;
        }
        zzd.addOnCompleteListener(zzh.zza, new OnCompleteListener(this, intent) { // from class: com.google.firebase.messaging.zzg
            private final zzc zza;
            private final Intent zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = intent;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zza(this.zzb, task);
            }
        });
        return 3;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.zza.shutdown();
        super.onDestroy();
    }

    private final void zzf(Intent intent) {
        if (intent != null) {
            zzaw.zza(intent);
        }
        synchronized (this.zzc) {
            int i = this.zze - 1;
            this.zze = i;
            if (i == 0) {
                stopSelfResult(this.zzd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Intent intent, Task task) {
        zzf(intent);
    }
}
