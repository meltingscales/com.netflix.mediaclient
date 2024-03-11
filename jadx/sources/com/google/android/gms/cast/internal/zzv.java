package com.google.android.gms.cast.internal;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.cast.zzcv;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
/* loaded from: classes2.dex */
final class zzv extends zzaf {
    private final AtomicReference zza;
    private final Handler zzb;

    public zzv(zzw zzwVar) {
        this.zza = new AtomicReference(zzwVar);
        this.zzb = new zzcv(zzwVar.getLooper());
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzb(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        Object obj;
        BaseImplementation.ResultHolder resultHolder;
        BaseImplementation.ResultHolder resultHolder2;
        zzw zzwVar = (zzw) this.zza.get();
        if (zzwVar == null) {
            return;
        }
        zzwVar.zzh = applicationMetadata;
        zzwVar.zzy = applicationMetadata.getApplicationId();
        zzwVar.zzz = str2;
        zzwVar.zzo = str;
        obj = zzw.zzf;
        synchronized (obj) {
            resultHolder = zzwVar.zzC;
            if (resultHolder != null) {
                resultHolder2 = zzwVar.zzC;
                resultHolder2.setResult(new zzq(new Status(0), applicationMetadata, str, str2, z));
                zzwVar.zzC = null;
            }
        }
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzc(int i) {
        zzw zzwVar = (zzw) this.zza.get();
        if (zzwVar == null) {
            return;
        }
        zzwVar.zzR(i);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzd(int i) {
        Cast.Listener listener;
        zzw zzwVar = (zzw) this.zza.get();
        if (zzwVar == null) {
            return;
        }
        zzwVar.zzy = null;
        zzwVar.zzz = null;
        zzwVar.zzab(i);
        listener = zzwVar.zzj;
        if (listener != null) {
            this.zzb.post(new zzr(this, zzwVar, i));
        }
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zze(int i) {
        zzw zzwVar = (zzw) this.zza.get();
        if (zzwVar == null) {
            return;
        }
        zzwVar.zzab(i);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzf(zza zzaVar) {
        Logger logger;
        zzw zzwVar = (zzw) this.zza.get();
        if (zzwVar == null) {
            return;
        }
        logger = zzw.zze;
        logger.d("onApplicationStatusChanged", new Object[0]);
        this.zzb.post(new zzt(this, zzwVar, zzaVar));
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzg(int i) {
        zzw zzwVar = (zzw) this.zza.get();
        if (zzwVar == null) {
            return;
        }
        zzwVar.zzab(i);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzh(String str, byte[] bArr) {
        Logger logger;
        if (((zzw) this.zza.get()) == null) {
            return;
        }
        logger = zzw.zze;
        logger.d("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzi(int i) {
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzj(zzy zzyVar) {
        Logger logger;
        zzw zzwVar = (zzw) this.zza.get();
        if (zzwVar == null) {
            return;
        }
        logger = zzw.zze;
        logger.d("onDeviceStatusChanged", new Object[0]);
        this.zzb.post(new zzs(this, zzwVar, zzyVar));
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzk(int i) {
        Logger logger;
        zzw zzq = zzq();
        if (zzq == null) {
            return;
        }
        logger = zzw.zze;
        logger.d("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
        if (i != 0) {
            zzq.triggerConnectionSuspended(2);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzl(String str, long j) {
        zzw zzwVar = (zzw) this.zza.get();
        if (zzwVar == null) {
            return;
        }
        zzwVar.zzaa(j, 0);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzm(String str, long j, int i) {
        zzw zzwVar = (zzw) this.zza.get();
        if (zzwVar == null) {
            return;
        }
        zzwVar.zzaa(j, i);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzn(String str, double d, boolean z) {
        Logger logger;
        logger = zzw.zze;
        logger.d("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzo(int i) {
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzp(String str, String str2) {
        Logger logger;
        zzw zzwVar = (zzw) this.zza.get();
        if (zzwVar == null) {
            return;
        }
        logger = zzw.zze;
        logger.d("Receive (type=text, ns=%s) %s", str, str2);
        this.zzb.post(new zzu(this, zzwVar, str, str2));
    }

    public final zzw zzq() {
        zzw zzwVar = (zzw) this.zza.getAndSet(null);
        if (zzwVar == null) {
            return null;
        }
        zzwVar.zzY();
        return zzwVar;
    }
}
