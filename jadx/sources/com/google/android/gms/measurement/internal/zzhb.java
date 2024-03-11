package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class zzhb extends zze {
    @VisibleForTesting
    protected zzhy zza;
    @VisibleForTesting
    protected boolean zzb;
    private zzha zzc;
    private final Set<zzgz> zzd;
    private boolean zze;
    private final AtomicReference<String> zzf;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzhb(zzga zzgaVar) {
        super(zzgaVar);
        this.zzd = new CopyOnWriteArraySet();
        this.zzb = true;
        this.zzf = new AtomicReference<>();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    public final void zzab() {
        if (zzn().getApplicationContext() instanceof Application) {
            ((Application) zzn().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    public final Boolean zzac() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzq().zza(atomicReference, 15000L, "boolean test flag value", new zzhd(this, atomicReference));
    }

    public final String zzad() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzq().zza(atomicReference, 15000L, "String test flag value", new zzhn(this, atomicReference));
    }

    public final Long zzae() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzq().zza(atomicReference, 15000L, "long test flag value", new zzhp(this, atomicReference));
    }

    public final Integer zzaf() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzq().zza(atomicReference, 15000L, "int test flag value", new zzhs(this, atomicReference));
    }

    public final Double zzag() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzq().zza(atomicReference, 15000L, "double test flag value", new zzhr(this, atomicReference));
    }

    public final void zza(boolean z) {
        zzw();
        zzb();
        zzq().zza(new zzhu(this, z));
    }

    public final void zzb(boolean z) {
        zzw();
        zzb();
        zzq().zza(new zzht(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(boolean z) {
        zzd();
        zzb();
        zzw();
        zzr().zzw().zza("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        zzs().zzb(z);
        zzam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzam() {
        if (zzt().zza(zzap.zzbb)) {
            zzd();
            String zza = zzs().zzn.zza();
            if (zza != null) {
                if ("unset".equals(zza)) {
                    zza("app", "_npa", (Object) null, zzm().currentTimeMillis());
                } else {
                    zza("app", "_npa", Long.valueOf("true".equals(zza) ? 1L : 0L), zzm().currentTimeMillis());
                }
            }
        }
        if (this.zzx.zzab() && this.zzb) {
            zzr().zzw().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzai();
            if (zzkt.zzb() && zzt().zza(zzap.zzcm)) {
                zzk().zza.zza();
                return;
            }
            return;
        }
        zzr().zzw().zza("Updating Scion state (FE)");
        zzh().zzac();
    }

    public final void zza(long j) {
        zzb();
        zzq().zza(new zzhw(this, j));
    }

    public final void zzb(long j) {
        zzb();
        zzq().zza(new zzhv(this, j));
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z) {
        zza(str, str2, bundle, false, true, zzm().currentTimeMillis());
    }

    public final void zza(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, zzm().currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(String str, String str2, Bundle bundle) {
        zzb();
        zzd();
        zza(str, str2, zzm().currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, String str2, long j, Bundle bundle) {
        zzb();
        zzd();
        zza(str, str2, j, bundle, true, this.zzc == null || zzkm.zze(str2), false, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.String r29, java.lang.String r30, long r31, android.os.Bundle r33, boolean r34, boolean r35, boolean r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhb.zza(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zzb();
        zzb(str == null ? "app" : str, str2, j, bundle == null ? new Bundle() : bundle, z2, !z2 || this.zzc == null || zzkm.zze(str2), !z, null);
    }

    private final void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzq().zza(new zzhg(this, str, str2, j, zzkm.zzb(bundle), z, z2, z3, str3));
    }

    public final void zza(String str, String str2, Object obj, boolean z) {
        zza(str, str2, obj, z, zzm().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z, long j) {
        int i;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z) {
            i = zzp().zzc(str2);
        } else {
            zzkm zzp = zzp();
            if (zzp.zza("user property", str2)) {
                if (!zzp.zza("user property", zzgx.zza, str2)) {
                    i = 15;
                } else if (zzp.zza("user property", 24, str2)) {
                    i = 0;
                }
            }
            i = 6;
        }
        if (i != 0) {
            zzp();
            this.zzx.zzi().zza(i, "_ev", zzkm.zza(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj != null) {
            int zzb = zzp().zzb(str2, obj);
            if (zzb != 0) {
                zzp();
                String zza = zzkm.zza(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    r0 = String.valueOf(obj).length();
                }
                this.zzx.zzi().zza(zzb, "_ev", zza, r0);
                return;
            }
            Object zzc = zzp().zzc(str2, obj);
            if (zzc != null) {
                zza(str3, str2, j, zzc);
            }
        } else {
            zza(str3, str2, j, (Object) null);
        }
    }

    private final void zza(String str, String str2, long j, Object obj) {
        zzq().zza(new zzhf(this, str, str2, obj, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, String str2, Object obj, long j) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzd();
        zzb();
        zzw();
        if (zzt().zza(zzap.zzbb) && "allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long valueOf = Long.valueOf("false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    zzs().zzn.zza(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                }
            }
            if (obj == null) {
                zzs().zzn.zza("unset");
                str2 = "_npa";
            }
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!this.zzx.zzab()) {
            zzr().zzw().zza("User property not set since app measurement is disabled");
        } else if (this.zzx.zzag()) {
            zzr().zzw().zza("Setting user property (FE)", zzo().zza(str4), obj2);
            zzh().zza(new zzkl(str4, j, obj2, str));
        }
    }

    public final List<zzkl> zzc(boolean z) {
        zzb();
        zzw();
        zzr().zzw().zza("Fetching user attributes (FE)");
        if (zzq().zzg()) {
            zzr().zzf().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (zzw.zza()) {
            zzr().zzf().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzx.zzq().zza(atomicReference, 5000L, "get user properties", new zzhi(this, atomicReference, z));
            List<zzkl> list = (List) atomicReference.get();
            if (list == null) {
                zzr().zzi().zza("Timed out waiting for get user properties");
                return Collections.emptyList();
            }
            return list;
        }
    }

    public final String zzah() {
        zzb();
        return this.zzf.get();
    }

    public final String zzc(long j) {
        if (zzq().zzg()) {
            zzr().zzf().zza("Cannot retrieve app instance id from analytics worker thread");
            return null;
        } else if (zzw.zza()) {
            zzr().zzf().zza("Cannot retrieve app instance id from main thread");
            return null;
        } else {
            long elapsedRealtime = zzm().elapsedRealtime();
            String zze = zze(120000L);
            long elapsedRealtime2 = zzm().elapsedRealtime() - elapsedRealtime;
            return (zze != null || elapsedRealtime2 >= 120000) ? zze : zze(120000 - elapsedRealtime2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str) {
        this.zzf.set(str);
    }

    private final String zze(long j) {
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            zzq().zza(new zzhh(this, atomicReference));
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzr().zzi().zza("Interrupted waiting for app instance id");
                return null;
            }
        }
        return (String) atomicReference.get();
    }

    public final void zzd(long j) {
        zza((String) null);
        zzq().zza(new zzhk(this, j));
    }

    public final void zzai() {
        zzd();
        zzb();
        zzw();
        if (this.zzx.zzag()) {
            if (zzt().zza(zzap.zzbu)) {
                zzx zzt = zzt();
                zzt.zzu();
                Boolean zzb = zzt.zzb("google_analytics_deferred_deep_link_enabled");
                if (zzb != null && zzb.booleanValue()) {
                    zzr().zzw().zza("Deferred Deep Link feature enabled.");
                    zzq().zza(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.zzhe
                        private final zzhb zza;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzhb zzhbVar = this.zza;
                            zzhbVar.zzd();
                            if (zzhbVar.zzs().zzu.zza()) {
                                zzhbVar.zzr().zzw().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long zza = zzhbVar.zzs().zzv.zza();
                            zzhbVar.zzs().zzv.zza(1 + zza);
                            if (zza >= 5) {
                                zzhbVar.zzr().zzi().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzhbVar.zzs().zzu.zza(true);
                                return;
                            }
                            zzhbVar.zzx.zzah();
                        }
                    });
                }
            }
            zzh().zzae();
            this.zzb = false;
            String zzw = zzs().zzw();
            if (TextUtils.isEmpty(zzw)) {
                return;
            }
            zzl().zzaa();
            if (zzw.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", zzw);
            zza("auto", "_ou", bundle);
        }
    }

    public final void zza(zzha zzhaVar) {
        zzha zzhaVar2;
        zzd();
        zzb();
        zzw();
        if (zzhaVar != null && zzhaVar != (zzhaVar2 = this.zzc)) {
            Preconditions.checkState(zzhaVar2 == null, "EventInterceptor already set.");
        }
        this.zzc = zzhaVar;
    }

    public final void zza(zzgz zzgzVar) {
        zzb();
        zzw();
        Preconditions.checkNotNull(zzgzVar);
        if (this.zzd.add(zzgzVar)) {
            return;
        }
        zzr().zzi().zza("OnEventListener already registered");
    }

    public final void zzb(zzgz zzgzVar) {
        zzb();
        zzw();
        Preconditions.checkNotNull(zzgzVar);
        if (this.zzd.remove(zzgzVar)) {
            return;
        }
        zzr().zzi().zza("OnEventListener had not been registered");
    }

    public final void zza(Bundle bundle) {
        zza(bundle, zzm().currentTimeMillis());
    }

    public final void zza(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        zzb();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzr().zzi().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        zzb(bundle2, j);
    }

    public final void zzb(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("app_id"));
        zza();
        zzb(new Bundle(bundle), zzm().currentTimeMillis());
    }

    private final void zzb(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        zzgw.zza(bundle, "app_id", String.class, null);
        zzgw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null);
        zzgw.zza(bundle, "name", String.class, null);
        zzgw.zza(bundle, "value", Object.class, null);
        zzgw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle.getString("name"));
        Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle.get("value"));
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (zzp().zzc(string) != 0) {
            zzr().zzf().zza("Invalid conditional user property name", zzo().zzc(string));
        } else if (zzp().zzb(string, obj) != 0) {
            zzr().zzf().zza("Invalid conditional user property value", zzo().zzc(string), obj);
        } else {
            Object zzc = zzp().zzc(string, obj);
            if (zzc == null) {
                zzr().zzf().zza("Unable to normalize conditional user property value", zzo().zzc(string), obj);
                return;
            }
            zzgw.zza(bundle, zzc);
            long j2 = bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (!TextUtils.isEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) && (j2 > 15552000000L || j2 < 1)) {
                zzr().zzf().zza("Invalid conditional user property timeout", zzo().zzc(string), Long.valueOf(j2));
                return;
            }
            long j3 = bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
            if (j3 > 15552000000L || j3 < 1) {
                zzr().zzf().zza("Invalid conditional user property time to live", zzo().zzc(string), Long.valueOf(j3));
            } else {
                zzq().zza(new zzhm(this, bundle));
            }
        }
    }

    public final void zzc(String str, String str2, Bundle bundle) {
        zzb();
        zzb((String) null, str, str2, bundle);
    }

    public final void zza(String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotEmpty(str);
        zza();
        zzb(str, str2, str3, bundle);
    }

    private final void zzb(String str, String str2, String str3, Bundle bundle) {
        long currentTimeMillis = zzm().currentTimeMillis();
        Preconditions.checkNotEmpty(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str3 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str3);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzq().zza(new zzhl(this, bundle2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(Bundle bundle) {
        zzd();
        zzw();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("name"));
        Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle.get("value"));
        if (!this.zzx.zzab()) {
            zzr().zzw().zza("Conditional property not sent since collection is disabled");
            return;
        }
        zzkl zzklVar = new zzkl(bundle.getString("name"), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get("value"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        try {
            zzan zza = zzp().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), 0L, true, false);
            zzh().zza(new zzv(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), zzklVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzp().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), 0L, true, false), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zza, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzp().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), 0L, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(Bundle bundle) {
        zzd();
        zzw();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!this.zzx.zzab()) {
            zzr().zzw().zza("Conditional property not cleared since collection is disabled");
            return;
        }
        try {
            zzh().zza(new zzv(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), new zzkl(bundle.getString("name"), 0L, null, null), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzp().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final ArrayList<Bundle> zza(String str, String str2) {
        zzb();
        return zzb((String) null, str, str2);
    }

    public final ArrayList<Bundle> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zza();
        return zzb(str, str2, str3);
    }

    @VisibleForTesting
    private final ArrayList<Bundle> zzb(String str, String str2, String str3) {
        if (zzq().zzg()) {
            zzr().zzf().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (zzw.zza()) {
            zzr().zzf().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzx.zzq().zza(atomicReference, 5000L, "get conditional user properties", new zzho(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list == null) {
                zzr().zzi().zza("Timed out waiting for get conditional user properties", str);
                return new ArrayList<>();
            }
            return zzkm.zzb(list);
        }
    }

    public final Map<String, Object> zza(String str, String str2, boolean z) {
        zzb();
        return zzb((String) null, str, str2, z);
    }

    public final Map<String, Object> zza(String str, String str2, String str3, boolean z) {
        Preconditions.checkNotEmpty(str);
        zza();
        return zzb(str, str2, str3, z);
    }

    @VisibleForTesting
    private final Map<String, Object> zzb(String str, String str2, String str3, boolean z) {
        if (zzq().zzg()) {
            zzr().zzf().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (zzw.zza()) {
            zzr().zzf().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzx.zzq().zza(atomicReference, 5000L, "get user properties", new zzhq(this, atomicReference, str, str2, str3, z));
            List<zzkl> list = (List) atomicReference.get();
            if (list == null) {
                zzr().zzi().zza("Timed out waiting for handle get user properties");
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (zzkl zzklVar : list) {
                arrayMap.put(zzklVar.zza, zzklVar.zza());
            }
            return arrayMap;
        }
    }

    public final String zzaj() {
        zzif zzac = this.zzx.zzv().zzac();
        if (zzac != null) {
            return zzac.zza;
        }
        return null;
    }

    public final String zzak() {
        zzif zzac = this.zzx.zzv().zzac();
        if (zzac != null) {
            return zzac.zzb;
        }
        return null;
    }

    public final String zzal() {
        if (this.zzx.zzo() != null) {
            return this.zzx.zzo();
        }
        try {
            return GoogleServices.getGoogleAppId();
        } catch (IllegalStateException e) {
            this.zzx.zzr().zzf().zza("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzhb zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzep zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzij zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzii zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzes zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzjo zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzah zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ Clock zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ Context zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzeu zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzkm zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzft zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzew zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzff zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzx zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzw zzu() {
        return super.zzu();
    }
}
