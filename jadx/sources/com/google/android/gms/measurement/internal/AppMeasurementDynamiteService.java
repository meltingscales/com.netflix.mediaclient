package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

@DynamiteApi
/* loaded from: classes5.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzl {
    @VisibleForTesting
    zzga zza = null;
    private Map<Integer, zzgz> zzb = new ArrayMap();

    /* loaded from: classes5.dex */
    final class zza implements zzha {
        private com.google.android.gms.internal.measurement.zzs zza;

        zza(com.google.android.gms.internal.measurement.zzs zzsVar) {
            this.zza = zzsVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzha
        public final void interceptEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.zza.zza(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.zza.zzr().zzi().zza("Event interceptor threw exception", e);
            }
        }
    }

    /* loaded from: classes5.dex */
    final class zzb implements zzgz {
        private com.google.android.gms.internal.measurement.zzs zza;

        zzb(com.google.android.gms.internal.measurement.zzs zzsVar) {
            this.zza = zzsVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzgz
        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.zza.zza(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.zza.zzr().zzi().zza("Event listener threw exception", e);
            }
        }
    }

    private final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzv zzvVar, long j) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzga zzgaVar = this.zza;
        if (zzgaVar == null) {
            this.zza = zzga.zza(context, zzvVar);
        } else {
            zzgaVar.zzr().zzi().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zza();
        this.zza.zzh().zza(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) {
        zza();
        this.zza.zzh().zza(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setUserId(String str, long j) {
        zza();
        this.zza.zzh().zza(null, "_id", str, true, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) {
        zza();
        this.zza.zzv().zza((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setMeasurementEnabled(boolean z, long j) {
        zza();
        this.zza.zzh().zza(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void resetAnalyticsData(long j) {
        zza();
        this.zza.zzh().zzd(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setMinimumSessionDuration(long j) {
        zza();
        this.zza.zzh().zza(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setSessionTimeoutDuration(long j) {
        zza();
        this.zza.zzh().zzb(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzn zznVar) {
        zza();
        this.zza.zzh();
        Preconditions.checkNotEmpty(str);
        this.zza.zzi().zza(zznVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzn zznVar) {
        zza();
        zza(zznVar, this.zza.zzh().zzaj());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzn zznVar) {
        zza();
        zza(zznVar, this.zza.zzh().zzak());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzn zznVar) {
        zza();
        zza(zznVar, this.zza.zzh().zzah());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzn zznVar) {
        zza();
        this.zza.zzq().zza(new zzi(this, zznVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzn zznVar) {
        zza();
        zza(zznVar, this.zza.zzh().zzal());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void generateEventId(com.google.android.gms.internal.measurement.zzn zznVar) {
        zza();
        this.zza.zzi().zza(zznVar, this.zza.zzi().zzg());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void beginAdUnitExposure(String str, long j) {
        zza();
        this.zza.zzz().zza(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void endAdUnitExposure(String str, long j) {
        zza();
        this.zza.zzz().zzb(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void initForTests(Map map) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzn zznVar, long j) {
        zza();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzq().zza(new zzh(this, zznVar, new zzan(str2, new zzam(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) {
        zza();
        zzhy zzhyVar = this.zza.zzh().zza;
        if (zzhyVar != null) {
            this.zza.zzh().zzab();
            zzhyVar.onActivityStarted((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) {
        zza();
        zzhy zzhyVar = this.zza.zzh().zza;
        if (zzhyVar != null) {
            this.zza.zzh().zzab();
            zzhyVar.onActivityStopped((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) {
        zza();
        zzhy zzhyVar = this.zza.zzh().zza;
        if (zzhyVar != null) {
            this.zza.zzh().zzab();
            zzhyVar.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) {
        zza();
        zzhy zzhyVar = this.zza.zzh().zza;
        if (zzhyVar != null) {
            this.zza.zzh().zzab();
            zzhyVar.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) {
        zza();
        zzhy zzhyVar = this.zza.zzh().zza;
        if (zzhyVar != null) {
            this.zza.zzh().zzab();
            zzhyVar.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) {
        zza();
        zzhy zzhyVar = this.zza.zzh().zza;
        if (zzhyVar != null) {
            this.zza.zzh().zzab();
            zzhyVar.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzn zznVar, long j) {
        zza();
        zzhy zzhyVar = this.zza.zzh().zza;
        Bundle bundle = new Bundle();
        if (zzhyVar != null) {
            this.zza.zzh().zzab();
            zzhyVar.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zznVar.zza(bundle);
        } catch (RemoteException e) {
            this.zza.zzr().zzi().zza("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzn zznVar, long j) {
        zza();
        zznVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzn zznVar) {
        zza();
        this.zza.zzq().zza(new zzk(this, zznVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        zza();
        this.zza.zzr().zza(i, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzs zzsVar) {
        zza();
        zzhb zzh = this.zza.zzh();
        zza zzaVar = new zza(zzsVar);
        zzh.zzb();
        zzh.zzw();
        zzh.zzq().zza(new zzhj(zzh, zzaVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzs zzsVar) {
        zza();
        zzgz zzgzVar = this.zzb.get(Integer.valueOf(zzsVar.zza()));
        if (zzgzVar == null) {
            zzgzVar = new zzb(zzsVar);
            this.zzb.put(Integer.valueOf(zzsVar.zza()), zzgzVar);
        }
        this.zza.zzh().zza(zzgzVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzs zzsVar) {
        zza();
        zzgz remove = this.zzb.remove(Integer.valueOf(zzsVar.zza()));
        if (remove == null) {
            remove = new zzb(zzsVar);
        }
        this.zza.zzh().zzb(remove);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzt zztVar) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setConditionalUserProperty(Bundle bundle, long j) {
        zza();
        if (bundle == null) {
            this.zza.zzr().zzf().zza("Conditional user property must not be null");
        } else {
            this.zza.zzh().zza(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zza();
        this.zza.zzh().zzc(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzn zznVar) {
        zza();
        this.zza.zzq().zza(new zzj(this, zznVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getTestFlag(com.google.android.gms.internal.measurement.zzn zznVar, int i) {
        zza();
        if (i == 0) {
            this.zza.zzi().zza(zznVar, this.zza.zzh().zzad());
        } else if (i == 1) {
            this.zza.zzi().zza(zznVar, this.zza.zzh().zzae().longValue());
        } else if (i != 2) {
            if (i == 3) {
                this.zza.zzi().zza(zznVar, this.zza.zzh().zzaf().intValue());
            } else if (i != 4) {
            } else {
                this.zza.zzi().zza(zznVar, this.zza.zzh().zzac().booleanValue());
            }
        } else {
            zzkm zzi = this.zza.zzi();
            double doubleValue = this.zza.zzh().zzag().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zznVar.zza(bundle);
            } catch (RemoteException e) {
                zzi.zzx.zzr().zzi().zza("Error returning double value to wrapper", e);
            }
        }
    }

    private final void zza(com.google.android.gms.internal.measurement.zzn zznVar, String str) {
        this.zza.zzi().zza(zznVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setDataCollectionEnabled(boolean z) {
        zza();
        this.zza.zzh().zzb(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzn zznVar) {
        zza();
        this.zza.zzq().zza(new zzl(this, zznVar));
    }
}
