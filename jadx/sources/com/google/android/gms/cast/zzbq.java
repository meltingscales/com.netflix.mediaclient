package com.google.android.gms.cast;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzaf;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbq extends zzaf {
    final /* synthetic */ zzbr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbq(zzbr zzbrVar) {
        this.zza = zzbrVar;
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzb(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        this.zza.zzp = applicationMetadata;
        this.zza.zzq = str;
        zzbr.zzC(this.zza, new com.google.android.gms.cast.internal.zzq(new Status(0), applicationMetadata, str, str2, z));
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzc(int i) {
        this.zza.zzT(i);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzd(final int i) {
        Cast.Listener listener;
        zzbr.zzE(this.zza, i);
        zzbr zzbrVar = this.zza;
        listener = zzbrVar.zzx;
        if (listener != null) {
            zzbr.zzn(zzbrVar).post(new Runnable() { // from class: com.google.android.gms.cast.zzbj
                @Override // java.lang.Runnable
                public final void run() {
                    Cast.Listener listener2;
                    zzbq zzbqVar = zzbq.this;
                    int i2 = i;
                    listener2 = zzbqVar.zza.zzx;
                    listener2.onApplicationDisconnected(i2);
                }
            });
        }
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zze(int i) {
        zzbr.zzE(this.zza, i);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzf(final com.google.android.gms.cast.internal.zza zzaVar) {
        zzbr.zzn(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbn
            @Override // java.lang.Runnable
            public final void run() {
                zzbq zzbqVar = zzbq.this;
                zzbr.zzy(zzbqVar.zza, zzaVar);
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzg(int i) {
        zzbr.zzE(this.zza, i);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzh(String str, byte[] bArr) {
        Logger logger;
        logger = zzbr.zzg;
        logger.d("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzi(final int i) {
        zzbr.zzn(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbk
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                List<zzq> list2;
                List list3;
                List<zzq> list4;
                zzbq zzbqVar = zzbq.this;
                int i2 = i;
                if (i2 == 0) {
                    zzbqVar.zza.zzz = 2;
                    zzbqVar.zza.zzk = true;
                    zzbqVar.zza.zzl = true;
                    list3 = zzbqVar.zza.zzy;
                    synchronized (list3) {
                        list4 = zzbqVar.zza.zzy;
                        for (zzq zzqVar : list4) {
                            zzqVar.zza();
                        }
                    }
                    return;
                }
                zzbqVar.zza.zzz = 1;
                list = zzbqVar.zza.zzy;
                synchronized (list) {
                    list2 = zzbqVar.zza.zzy;
                    for (zzq zzqVar2 : list2) {
                        zzqVar2.zzb(i2);
                    }
                }
                zzbqVar.zza.zzR();
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzj(final zzy zzyVar) {
        zzbr.zzn(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbo
            @Override // java.lang.Runnable
            public final void run() {
                zzbq zzbqVar = zzbq.this;
                zzbr.zzz(zzbqVar.zza, zzyVar);
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzk(final int i) {
        zzbr.zzn(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbl
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                List<zzq> list2;
                zzbq zzbqVar = zzbq.this;
                int i2 = i;
                zzbr.zzx(zzbqVar.zza);
                zzbqVar.zza.zzz = 1;
                list = zzbqVar.zza.zzy;
                synchronized (list) {
                    list2 = zzbqVar.zza.zzy;
                    for (zzq zzqVar : list2) {
                        zzqVar.zzd(i2);
                    }
                }
                zzbqVar.zza.zzR();
                zzbr zzbrVar = zzbqVar.zza;
                zzbrVar.zzP(zzbrVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzl(String str, long j) {
        zzbr.zzD(this.zza, j, 0);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzm(String str, long j, int i) {
        zzbr.zzD(this.zza, j, i);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzn(String str, double d, boolean z) {
        Logger logger;
        logger = zzbr.zzg;
        logger.d("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzo(final int i) {
        zzbr.zzn(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbm
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                List<zzq> list2;
                zzbq zzbqVar = zzbq.this;
                int i2 = i;
                zzbqVar.zza.zzz = 3;
                list = zzbqVar.zza.zzy;
                synchronized (list) {
                    list2 = zzbqVar.zza.zzy;
                    for (zzq zzqVar : list2) {
                        zzqVar.zzc(i2);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void zzp(final String str, final String str2) {
        Logger logger;
        logger = zzbr.zzg;
        logger.d("Receive (type=text, ns=%s) %s", str, str2);
        zzbr.zzn(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbp
            @Override // java.lang.Runnable
            public final void run() {
                Cast.MessageReceivedCallback messageReceivedCallback;
                Logger logger2;
                CastDevice castDevice;
                zzbq zzbqVar = zzbq.this;
                String str3 = str;
                String str4 = str2;
                synchronized (zzbqVar.zza.zze) {
                    messageReceivedCallback = (Cast.MessageReceivedCallback) zzbqVar.zza.zze.get(str3);
                }
                if (messageReceivedCallback != null) {
                    castDevice = zzbqVar.zza.zzw;
                    messageReceivedCallback.onMessageReceived(castDevice, str3, str4);
                    return;
                }
                logger2 = zzbr.zzg;
                logger2.d("Discarded message for unknown namespace '%s'", str3);
            }
        });
    }
}
