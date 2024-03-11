package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.zzga;
import com.google.android.gms.measurement.internal.zzia;
import com.google.android.gms.measurement.internal.zzw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final zzga zzb;
    private final zzx zzc;
    private final boolean zzd;
    private String zze;
    private long zzf;
    private final Object zzg;
    private ExecutorService zzh;

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zza == null) {
                    if (zzx.zzb(context)) {
                        zza = new FirebaseAnalytics(zzx.zza(context));
                    } else {
                        zza = new FirebaseAnalytics(zzga.zza(context, (zzv) null));
                    }
                }
            }
        }
        return zza;
    }

    public final void logEvent(String str, Bundle bundle) {
        if (this.zzd) {
            this.zzc.zza(str, bundle);
        } else {
            this.zzb.zzh().zza("app", str, bundle, true);
        }
    }

    public final void setUserProperty(String str, String str2) {
        if (this.zzd) {
            this.zzc.zza(str, str2);
        } else {
            this.zzb.zzh().zza("app", str, (Object) str2, false);
        }
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.zzd) {
            this.zzc.zza(activity, str, str2);
        } else if (!zzw.zza()) {
            this.zzb.zzr().zzi().zza("setCurrentScreen must be called from the main thread");
        } else {
            this.zzb.zzv().zza(activity, str, str2);
        }
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        if (this.zzd) {
            this.zzc.zza(z);
        } else {
            this.zzb.zzh().zza(z);
        }
    }

    public final void setUserId(String str) {
        if (this.zzd) {
            this.zzc.zza(str);
        } else {
            this.zzb.zzh().zza("app", "_id", (Object) str, true);
        }
    }

    @Deprecated
    public final void setMinimumSessionDuration(long j) {
        if (this.zzd) {
            this.zzc.zza(j);
        } else {
            this.zzb.zzh().zza(j);
        }
    }

    public final void setSessionTimeoutDuration(long j) {
        if (this.zzd) {
            this.zzc.zzb(j);
        } else {
            this.zzb.zzh().zzb(j);
        }
    }

    private final ExecutorService zza() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.zzh == null) {
                this.zzh = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.zzh;
        }
        return executorService;
    }

    public final Task<String> getAppInstanceId() {
        try {
            String zzb = zzb();
            if (zzb != null) {
                return Tasks.forResult(zzb);
            }
            return Tasks.call(zza(), new zzb(this));
        } catch (Exception e) {
            if (this.zzd) {
                this.zzc.zza(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            } else {
                this.zzb.zzr().zzi().zza("Failed to schedule task for getAppInstanceId");
            }
            return Tasks.forException(e);
        }
    }

    private FirebaseAnalytics(zzga zzgaVar) {
        Preconditions.checkNotNull(zzgaVar);
        this.zzb = zzgaVar;
        this.zzc = null;
        this.zzd = false;
        this.zzg = new Object();
    }

    private FirebaseAnalytics(zzx zzxVar) {
        Preconditions.checkNotNull(zzxVar);
        this.zzb = null;
        this.zzc = zzxVar;
        this.zzd = true;
        this.zzg = new Object();
    }

    public final void resetAnalyticsData() {
        zza((String) null);
        if (this.zzd) {
            this.zzc.zzb();
        } else {
            this.zzb.zzh().zzd(this.zzb.zzm().currentTimeMillis());
        }
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.getInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str) {
        synchronized (this.zzg) {
            this.zze = str;
            if (this.zzd) {
                this.zzf = DefaultClock.getInstance().elapsedRealtime();
            } else {
                this.zzf = this.zzb.zzm().elapsedRealtime();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzb() {
        long elapsedRealtime;
        synchronized (this.zzg) {
            if (this.zzd) {
                elapsedRealtime = DefaultClock.getInstance().elapsedRealtime();
            } else {
                elapsedRealtime = this.zzb.zzm().elapsedRealtime();
            }
            if (Math.abs(elapsedRealtime - this.zzf) < 1000) {
                return this.zze;
            }
            return null;
        }
    }

    @Keep
    public static zzia getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzx zza2;
        if (zzx.zzb(context) && (zza2 = zzx.zza(context, (String) null, (String) null, (String) null, bundle)) != null) {
            return new zza(zza2);
        }
        return null;
    }
}
