package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class zzw extends GmsClient {
    private static final Logger zze = new Logger("CastClientImpl");
    private static final Object zzf = new Object();
    private static final Object zzg = new Object();
    private Bundle zzA;
    private final Map zzB;
    private BaseImplementation.ResultHolder zzC;
    private BaseImplementation.ResultHolder zzD;
    private ApplicationMetadata zzh;
    private final CastDevice zzi;
    private final Cast.Listener zzj;
    private final Map zzk;
    private final long zzl;
    private final Bundle zzm;
    private zzv zzn;
    private String zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private double zzt;
    private com.google.android.gms.cast.zzar zzu;
    private int zzv;
    private int zzw;
    private final AtomicLong zzx;
    private String zzy;
    private String zzz;

    public zzw(Context context, Looper looper, ClientSettings clientSettings, CastDevice castDevice, long j, Cast.Listener listener, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 10, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzi = castDevice;
        this.zzj = listener;
        this.zzl = j;
        this.zzm = bundle;
        this.zzk = new HashMap();
        this.zzx = new AtomicLong(0L);
        this.zzB = new HashMap();
        zzY();
        zzp();
    }

    public static /* bridge */ /* synthetic */ Map zzA(zzw zzwVar) {
        return zzwVar.zzk;
    }

    public static /* synthetic */ void zzH(zzw zzwVar, zza zzaVar) {
        boolean z;
        String zza = zzaVar.zza();
        if (CastUtils.zzh(zza, zzwVar.zzo)) {
            z = false;
        } else {
            zzwVar.zzo = zza;
            z = true;
        }
        zze.d("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(zzwVar.zzq));
        Cast.Listener listener = zzwVar.zzj;
        if (listener != null && (z || zzwVar.zzq)) {
            listener.onApplicationStatusChanged();
        }
        zzwVar.zzq = false;
    }

    public static /* synthetic */ void zzI(zzw zzwVar, zzy zzyVar) {
        boolean z;
        boolean z2;
        ApplicationMetadata zze2 = zzyVar.zze();
        if (!CastUtils.zzh(zze2, zzwVar.zzh)) {
            zzwVar.zzh = zze2;
            zzwVar.zzj.onApplicationMetadataChanged(zze2);
        }
        double zzb = zzyVar.zzb();
        boolean z3 = true;
        if (Double.isNaN(zzb) || Math.abs(zzb - zzwVar.zzt) <= 1.0E-7d) {
            z = false;
        } else {
            zzwVar.zzt = zzb;
            z = true;
        }
        boolean zzg2 = zzyVar.zzg();
        if (zzg2 != zzwVar.zzp) {
            zzwVar.zzp = zzg2;
            z = true;
        }
        Double.isNaN(zzyVar.zza());
        Logger logger = zze;
        logger.d("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(zzwVar.zzr));
        Cast.Listener listener = zzwVar.zzj;
        if (listener != null && (z || zzwVar.zzr)) {
            listener.onVolumeChanged();
        }
        int zzc = zzyVar.zzc();
        if (zzc != zzwVar.zzv) {
            zzwVar.zzv = zzc;
            z2 = true;
        } else {
            z2 = false;
        }
        logger.d("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(zzwVar.zzr));
        Cast.Listener listener2 = zzwVar.zzj;
        if (listener2 != null && (z2 || zzwVar.zzr)) {
            listener2.onActiveInputStateChanged(zzwVar.zzv);
        }
        int zzd = zzyVar.zzd();
        if (zzd != zzwVar.zzw) {
            zzwVar.zzw = zzd;
        } else {
            z3 = false;
        }
        logger.d("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(zzwVar.zzr));
        Cast.Listener listener3 = zzwVar.zzj;
        if (listener3 != null && (z3 || zzwVar.zzr)) {
            listener3.onStandbyStateChanged(zzwVar.zzw);
        }
        if (!CastUtils.zzh(zzwVar.zzu, zzyVar.zzf())) {
            zzwVar.zzu = zzyVar.zzf();
        }
        zzwVar.zzr = false;
    }

    public final void zzY() {
        this.zzs = false;
        this.zzv = -1;
        this.zzw = -1;
        this.zzh = null;
        this.zzo = null;
        this.zzt = 0.0d;
        zzp();
        this.zzp = false;
        this.zzu = null;
    }

    private final void zzZ() {
        zze.d("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.zzk) {
            this.zzk.clear();
        }
    }

    public final void zzaa(long j, int i) {
        BaseImplementation.ResultHolder resultHolder;
        synchronized (this.zzB) {
            resultHolder = (BaseImplementation.ResultHolder) this.zzB.remove(Long.valueOf(j));
        }
        if (resultHolder != null) {
            resultHolder.setResult(new Status(i));
        }
    }

    public final void zzab(int i) {
        synchronized (zzg) {
            BaseImplementation.ResultHolder resultHolder = this.zzD;
            if (resultHolder != null) {
                resultHolder.setResult(new Status(i));
                this.zzD = null;
            }
        }
    }

    public static /* bridge */ /* synthetic */ Cast.Listener zzu(zzw zzwVar) {
        return zzwVar.zzj;
    }

    public static /* bridge */ /* synthetic */ CastDevice zzv(zzw zzwVar) {
        return zzwVar.zzi;
    }

    public static /* bridge */ /* synthetic */ Logger zzw() {
        return zze;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof zzae ? (zzae) queryLocalInterface : new zzae(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        Logger logger = zze;
        logger.d("disconnect(); ServiceListener=%s, isConnected=%b", this.zzn, Boolean.valueOf(isConnected()));
        zzv zzvVar = this.zzn;
        this.zzn = null;
        if (zzvVar == null || zzvVar.zzq() == null) {
            logger.d("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        zzZ();
        try {
            try {
                ((zzae) getService()).zzf();
            } catch (RemoteException | IllegalStateException e) {
                zze.d(e, "Error while disconnecting the controller interface", new Object[0]);
            }
        } finally {
            super.disconnect();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getConnectionHint() {
        Bundle bundle = this.zzA;
        if (bundle != null) {
            this.zzA = null;
            return bundle;
        }
        return super.getConnectionHint();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        zze.d("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.zzy, this.zzz);
        this.zzi.putInBundle(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.zzl);
        Bundle bundle2 = this.zzm;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.zzn = new zzv(this);
        bundle.putParcelable("listener", new BinderWrapper(this.zzn));
        String str = this.zzy;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.zzz;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        zzZ();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        zze.d("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.zzs = true;
            this.zzq = true;
            this.zzr = true;
        } else {
            this.zzs = false;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.zzA = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.onPostInitHandler(i, iBinder, bundle, i2);
    }

    public final void zzR(int i) {
        synchronized (zzf) {
            BaseImplementation.ResultHolder resultHolder = this.zzC;
            if (resultHolder != null) {
                resultHolder.setResult(new zzq(new Status(i), null, null, null, false));
                this.zzC = null;
            }
        }
    }

    @VisibleForTesting
    final double zzp() {
        Preconditions.checkNotNull(this.zzi, "device should not be null");
        if (this.zzi.hasCapability(2048)) {
            return 0.02d;
        }
        return (!this.zzi.hasCapability(4) || this.zzi.hasCapability(1) || "Chromecast Audio".equals(this.zzi.getModelName())) ? 0.05d : 0.02d;
    }
}
