package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzae;
import com.google.android.gms.cast.internal.zzag;
import com.google.android.gms.cast.internal.zzai;
import com.google.android.gms.cast.internal.zzx;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzcv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@SuppressLint({"UseSparseArrays"})
/* loaded from: classes2.dex */
public final class zzbr extends GoogleApi implements zzr {
    public static final /* synthetic */ int zzf = 0;
    private static final Logger zzg = new Logger("CastClient");
    private static final Api.AbstractClientBuilder zzh;
    private static final Api zzi;
    final zzbq zza;
    TaskCompletionSource zzb;
    TaskCompletionSource zzc;
    final Map zzd;
    final Map zze;
    private Handler zzj;
    private boolean zzk;
    private boolean zzl;
    private final AtomicLong zzm;
    private final Object zzn;
    private final Object zzo;
    private ApplicationMetadata zzp;
    private String zzq;
    private double zzr;
    private boolean zzs;
    private int zzt;
    private int zzu;
    private zzar zzv;
    private final CastDevice zzw;
    private final Cast.Listener zzx;
    private final List zzy;
    private int zzz;

    static {
        zzbh zzbhVar = new zzbh();
        zzh = zzbhVar;
        zzi = new Api("Cast.API_CXLESS", zzbhVar, zzai.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbr(Context context, Cast.CastOptions castOptions) {
        super(context, zzi, castOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zza = new zzbq(this);
        this.zzn = new Object();
        this.zzo = new Object();
        this.zzy = Collections.synchronizedList(new ArrayList());
        Preconditions.checkNotNull(context, "context cannot be null");
        Preconditions.checkNotNull(castOptions, "CastOptions cannot be null");
        this.zzx = castOptions.zzb;
        this.zzw = castOptions.zza;
        this.zzd = new HashMap();
        this.zze = new HashMap();
        this.zzm = new AtomicLong(0L);
        this.zzz = 1;
        zzm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzC(zzbr zzbrVar, Cast.ApplicationConnectionResult applicationConnectionResult) {
        synchronized (zzbrVar.zzn) {
            TaskCompletionSource taskCompletionSource = zzbrVar.zzb;
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(applicationConnectionResult);
            }
            zzbrVar.zzb = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzD(zzbr zzbrVar, long j, int i) {
        TaskCompletionSource taskCompletionSource;
        synchronized (zzbrVar.zzd) {
            Map map = zzbrVar.zzd;
            Long valueOf = Long.valueOf(j);
            taskCompletionSource = (TaskCompletionSource) map.get(valueOf);
            zzbrVar.zzd.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(zzO(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzE(zzbr zzbrVar, int i) {
        synchronized (zzbrVar.zzo) {
            TaskCompletionSource taskCompletionSource = zzbrVar.zzc;
            if (taskCompletionSource == null) {
                return;
            }
            if (i != 0) {
                taskCompletionSource.setException(zzO(i));
            } else {
                taskCompletionSource.setResult(new Status(0));
            }
            zzbrVar.zzc = null;
        }
    }

    private static ApiException zzO(int i) {
        return ApiExceptionUtil.fromStatus(new Status(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Task zzP(zzag zzagVar) {
        return doUnregisterEventListener((ListenerHolder.ListenerKey) Preconditions.checkNotNull(registerListener(zzagVar, "castDeviceControllerListenerKey").getListenerKey(), "Key must not be null"), 8415);
    }

    private final void zzQ() {
        Preconditions.checkState(this.zzz == 2, "Not connected to device");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzR() {
        zzg.d("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.zze) {
            this.zze.clear();
        }
    }

    private final void zzS(TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzn) {
            if (this.zzb != null) {
                zzT(2477);
            }
            this.zzb = taskCompletionSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT(int i) {
        synchronized (this.zzn) {
            TaskCompletionSource taskCompletionSource = this.zzb;
            if (taskCompletionSource != null) {
                taskCompletionSource.setException(zzO(i));
            }
            this.zzb = null;
        }
    }

    private final void zzU() {
        Preconditions.checkState(this.zzz != 1, "Not active connection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Handler zzn(zzbr zzbrVar) {
        if (zzbrVar.zzj == null) {
            zzbrVar.zzj = new zzcv(zzbrVar.getLooper());
        }
        return zzbrVar.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzx(zzbr zzbrVar) {
        zzbrVar.zzt = -1;
        zzbrVar.zzu = -1;
        zzbrVar.zzp = null;
        zzbrVar.zzq = null;
        zzbrVar.zzr = 0.0d;
        zzbrVar.zzm();
        zzbrVar.zzs = false;
        zzbrVar.zzv = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzy(zzbr zzbrVar, com.google.android.gms.cast.internal.zza zzaVar) {
        boolean z;
        String zza = zzaVar.zza();
        if (CastUtils.zzh(zza, zzbrVar.zzq)) {
            z = false;
        } else {
            zzbrVar.zzq = zza;
            z = true;
        }
        zzg.d("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(zzbrVar.zzl));
        Cast.Listener listener = zzbrVar.zzx;
        if (listener != null && (z || zzbrVar.zzl)) {
            listener.onApplicationStatusChanged();
        }
        zzbrVar.zzl = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzz(zzbr zzbrVar, zzy zzyVar) {
        boolean z;
        boolean z2;
        ApplicationMetadata zze = zzyVar.zze();
        if (!CastUtils.zzh(zze, zzbrVar.zzp)) {
            zzbrVar.zzp = zze;
            zzbrVar.zzx.onApplicationMetadataChanged(zze);
        }
        double zzb = zzyVar.zzb();
        boolean z3 = true;
        if (Double.isNaN(zzb) || Math.abs(zzb - zzbrVar.zzr) <= 1.0E-7d) {
            z = false;
        } else {
            zzbrVar.zzr = zzb;
            z = true;
        }
        boolean zzg2 = zzyVar.zzg();
        if (zzg2 != zzbrVar.zzs) {
            zzbrVar.zzs = zzg2;
            z = true;
        }
        Logger logger = zzg;
        logger.d("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(zzbrVar.zzk));
        Cast.Listener listener = zzbrVar.zzx;
        if (listener != null && (z || zzbrVar.zzk)) {
            listener.onVolumeChanged();
        }
        Double.isNaN(zzyVar.zza());
        int zzc = zzyVar.zzc();
        if (zzc != zzbrVar.zzt) {
            zzbrVar.zzt = zzc;
            z2 = true;
        } else {
            z2 = false;
        }
        logger.d("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(zzbrVar.zzk));
        Cast.Listener listener2 = zzbrVar.zzx;
        if (listener2 != null && (z2 || zzbrVar.zzk)) {
            listener2.onActiveInputStateChanged(zzbrVar.zzt);
        }
        int zzd = zzyVar.zzd();
        if (zzd != zzbrVar.zzu) {
            zzbrVar.zzu = zzd;
        } else {
            z3 = false;
        }
        logger.d("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(zzbrVar.zzk));
        Cast.Listener listener3 = zzbrVar.zzx;
        if (listener3 != null && (z3 || zzbrVar.zzk)) {
            listener3.onStandbyStateChanged(zzbrVar.zzu);
        }
        if (!CastUtils.zzh(zzbrVar.zzv, zzyVar.zzf())) {
            zzbrVar.zzv = zzyVar.zzf();
        }
        zzbrVar.zzk = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzF(String str, String str2, zzbs zzbsVar, zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        zzQ();
        ((zzae) zzxVar.getService()).zzh(str, str2, null);
        zzS(taskCompletionSource);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(String str, LaunchOptions launchOptions, zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        zzQ();
        ((zzae) zzxVar.getService()).zzi(str, launchOptions);
        zzS(taskCompletionSource);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzH(Cast.MessageReceivedCallback messageReceivedCallback, String str, zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        zzU();
        if (messageReceivedCallback != null) {
            ((zzae) zzxVar.getService()).zzs(str);
        }
        taskCompletionSource.setResult(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzI(String str, String str2, String str3, zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        long incrementAndGet = this.zzm.incrementAndGet();
        zzQ();
        try {
            this.zzd.put(Long.valueOf(incrementAndGet), taskCompletionSource);
            ((zzae) zzxVar.getService()).zzn(str2, str3, incrementAndGet);
        } catch (RemoteException e) {
            this.zzd.remove(Long.valueOf(incrementAndGet));
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(String str, Cast.MessageReceivedCallback messageReceivedCallback, zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        zzU();
        ((zzae) zzxVar.getService()).zzs(str);
        if (messageReceivedCallback != null) {
            ((zzae) zzxVar.getService()).zzl(str);
        }
        taskCompletionSource.setResult(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzK(boolean z, zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        ((zzae) zzxVar.getService()).zzo(z, this.zzr, this.zzs);
        taskCompletionSource.setResult(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzM(String str, zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        zzQ();
        ((zzae) zzxVar.getService()).zzq(str);
        synchronized (this.zzo) {
            if (this.zzc != null) {
                taskCompletionSource.setException(zzO(2001));
            } else {
                this.zzc = taskCompletionSource;
            }
        }
    }

    @Override // com.google.android.gms.cast.zzr
    public final Task zze() {
        ListenerHolder registerListener = registerListener(this.zza, "castDeviceControllerListenerKey");
        RegistrationMethods.Builder builder = RegistrationMethods.builder();
        RemoteCall remoteCall = new RemoteCall() { // from class: com.google.android.gms.cast.zzaz
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzx zzxVar = (zzx) obj;
                ((zzae) zzxVar.getService()).zzk(zzbr.this.zza);
                ((zzae) zzxVar.getService()).zze();
                ((TaskCompletionSource) obj2).setResult(null);
            }
        };
        return doRegisterEventListener(builder.withHolder(registerListener).register(remoteCall).unregister(new RemoteCall() { // from class: com.google.android.gms.cast.zzaw
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzbr.zzf;
                ((zzae) ((zzx) obj).getService()).zzr();
                ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
            }
        }).setFeatures(zzat.zzb).setMethodKey(8428).build());
    }

    @Override // com.google.android.gms.cast.zzr
    public final Task zzf() {
        Task doWrite = doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzax
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzbr.zzf;
                ((zzae) ((zzx) obj).getService()).zzf();
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(8403).build());
        zzR();
        zzP(this.zza);
        return doWrite;
    }

    @Override // com.google.android.gms.cast.zzr
    public final Task zzg(final String str) {
        final Cast.MessageReceivedCallback messageReceivedCallback;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized (this.zze) {
            messageReceivedCallback = (Cast.MessageReceivedCallback) this.zze.remove(str);
        }
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzbb
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzbr.this.zzH(messageReceivedCallback, str, (zzx) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(8414).build());
    }

    @Override // com.google.android.gms.cast.zzr
    public final Task zzh(final String str, final String str2) {
        CastUtils.throwIfInvalidNamespace(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str2.length() > 524288) {
            zzg.w("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        return doWrite(TaskApiCall.builder().run(new RemoteCall(null, str, str2) { // from class: com.google.android.gms.cast.zzbg
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzc;

            {
                this.zzb = str;
                this.zzc = str2;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzbr.this.zzI(null, this.zzb, this.zzc, (zzx) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(8405).build());
    }

    @Override // com.google.android.gms.cast.zzr
    public final Task zzi(final String str, final Cast.MessageReceivedCallback messageReceivedCallback) {
        CastUtils.throwIfInvalidNamespace(str);
        if (messageReceivedCallback != null) {
            synchronized (this.zze) {
                this.zze.put(str, messageReceivedCallback);
            }
        }
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzbd
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzbr.this.zzJ(str, messageReceivedCallback, (zzx) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(8413).build());
    }

    @Override // com.google.android.gms.cast.zzr
    public final void zzk(zzq zzqVar) {
        Preconditions.checkNotNull(zzqVar);
        this.zzy.add(zzqVar);
    }

    @Override // com.google.android.gms.cast.zzr
    public final boolean zzl() {
        zzQ();
        return this.zzs;
    }

    @RequiresNonNull({"device"})
    final double zzm() {
        if (this.zzw.hasCapability(2048)) {
            return 0.02d;
        }
        return (!this.zzw.hasCapability(4) || this.zzw.hasCapability(1) || "Chromecast Audio".equals(this.zzw.getModelName())) ? 0.05d : 0.02d;
    }
}
