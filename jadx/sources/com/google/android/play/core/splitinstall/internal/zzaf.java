package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzaf {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzu zzc;
    private boolean zzh;
    private final Intent zzi;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final com.google.android.play.core.splitinstall.zzak zzo;
    private final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.splitinstall.internal.zzx
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzaf.zzj(zzaf.this);
        }
    };
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "SplitInstallService";
    private final WeakReference zzj = new WeakReference(null);

    public zzaf(Context context, zzu zzuVar, String str, Intent intent, com.google.android.play.core.splitinstall.zzak zzakVar, zzaa zzaaVar) {
        this.zzb = context;
        this.zzc = zzuVar;
        this.zzi = intent;
        this.zzo = zzakVar;
    }

    public static /* synthetic */ void zzj(zzaf zzafVar) {
        zzafVar.zzc.zzd("reportBinderDeath", new Object[0]);
        zzaa zzaaVar = (zzaa) zzafVar.zzj.get();
        if (zzaaVar == null) {
            zzafVar.zzc.zzd("%s : Binder has died.", zzafVar.zzd);
            for (zzv zzvVar : zzafVar.zze) {
                zzvVar.zzb(zzafVar.zzv());
            }
            zzafVar.zze.clear();
        } else {
            zzafVar.zzc.zzd("calling onBinderDied", new Object[0]);
            zzaaVar.zza();
        }
        synchronized (zzafVar.zzg) {
            zzafVar.zzw();
        }
    }

    public static /* synthetic */ void zzn(zzaf zzafVar, final TaskCompletionSource taskCompletionSource) {
        zzafVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.splitinstall.internal.zzw
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzaf.this.zzt(taskCompletionSource, task);
            }
        });
    }

    public static /* synthetic */ void zzq(zzaf zzafVar) {
        zzafVar.zzc.zzd("linkToDeath", new Object[0]);
        try {
            zzafVar.zzn.asBinder().linkToDeath(zzafVar.zzk, 0);
        } catch (RemoteException e) {
            zzafVar.zzc.zzc(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* synthetic */ void zzr(zzaf zzafVar) {
        zzafVar.zzc.zzd("unlinkToDeath", new Object[0]);
        zzafVar.zzn.asBinder().unlinkToDeath(zzafVar.zzk, 0);
    }

    public final void zzw() {
        for (TaskCompletionSource taskCompletionSource : this.zzf) {
            taskCompletionSource.trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        zzc().post(new zzy(this, zzvVar.zza(), taskCompletionSource, zzvVar));
    }

    public final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu(TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
        zzc().post(new zzz(this));
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    public static /* synthetic */ void zzp(zzaf zzafVar, zzv zzvVar) {
        if (zzafVar.zzn != null || zzafVar.zzh) {
            if (zzafVar.zzh) {
                zzafVar.zzc.zzd("Waiting to bind to the service.", new Object[0]);
                zzafVar.zze.add(zzvVar);
                return;
            }
            zzvVar.run();
            return;
        }
        zzafVar.zzc.zzd("Initiate binding to the service.", new Object[0]);
        zzafVar.zze.add(zzvVar);
        zzae zzaeVar = new zzae(zzafVar, null);
        zzafVar.zzm = zzaeVar;
        zzafVar.zzh = true;
        if (zzafVar.zzb.bindService(zzafVar.zzi, zzaeVar, 1)) {
            return;
        }
        zzafVar.zzc.zzd("Failed to bind to the service.", new Object[0]);
        zzafVar.zzh = false;
        for (zzv zzvVar2 : zzafVar.zze) {
            zzvVar2.zzb(new zzag());
        }
        zzafVar.zze.clear();
    }
}
