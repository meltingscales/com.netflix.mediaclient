package com.google.android.play.core.splitinstall.testing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzbs;
import com.google.android.play.core.splitinstall.internal.zzbw;
import com.google.android.play.core.splitinstall.internal.zzby;
import com.google.android.play.core.splitinstall.zzo;
import com.google.android.play.core.splitinstall.zzs;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class FakeSplitInstallManager implements SplitInstallManager {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = TimeUnit.SECONDS.toMillis(1);
    private final Handler zzc;
    private final Context zzd;
    private final zzs zze;
    private final zzby zzf;
    private final zzbs zzg;
    private final com.google.android.play.core.splitinstall.internal.zzt zzh;
    private final com.google.android.play.core.splitinstall.internal.zzt zzi;
    private final Executor zzj;
    private final com.google.android.play.core.splitinstall.zzg zzk;
    private final File zzl;
    private final AtomicReference zzm;
    private final Set zzn;
    private final Set zzo;
    private final AtomicBoolean zzp;
    private final zzj zzq;

    private final Task zzk(final int i) {
        zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzp
            @Override // com.google.android.play.core.splitinstall.testing.zzr
            public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
                int i2 = i;
                int i3 = FakeSplitInstallManager.zza;
                if (splitInstallSessionState == null) {
                    return null;
                }
                return SplitInstallSessionState.create(splitInstallSessionState.sessionId(), 6, i2, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.languages());
            }
        });
        return Tasks.forException(new SplitInstallException(i));
    }

    private final com.google.android.play.core.splitinstall.zzk zzl() {
        try {
            com.google.android.play.core.splitinstall.zzk zza2 = this.zze.zza(this.zzd.getPackageManager().getPackageInfo(this.zzd.getPackageName(), 128).applicationInfo.metaData);
            if (zza2 != null) {
                return zza2;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("App is not found in PackageManager", e);
        }
    }

    private final SplitInstallSessionState zzm() {
        return (SplitInstallSessionState) this.zzm.get();
    }

    private final SplitInstallSessionState zzn(zzr zzrVar) {
        synchronized (this) {
            SplitInstallSessionState zzm = zzm();
            SplitInstallSessionState zza2 = zzrVar.zza(zzm);
            AtomicReference atomicReference = this.zzm;
            while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, zzm, zza2)) {
                if (atomicReference.get() != zzm) {
                    return null;
                }
            }
            return zza2;
        }
    }

    private static String zzo(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(List list, List list2, List list3, long j, boolean z) {
        this.zzk.zza().zzd(list, new zzq(this, list2, list3, j, z, list));
    }

    private final void zzq(final SplitInstallSessionState splitInstallSessionState) {
        this.zzc.post(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzf
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplitInstallManager.this.zzg(splitInstallSessionState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzr(List list, List list2, long j) {
        this.zzn.addAll(list);
        this.zzo.addAll(list2);
        Long valueOf = Long.valueOf(j);
        zzs(5, 0, valueOf, valueOf, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzs(final int i, final int i2, final Long l, final Long l2, final List list, final Integer num, final List list2) {
        SplitInstallSessionState zzn = zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzg
            @Override // com.google.android.play.core.splitinstall.testing.zzr
            public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
                long longValue;
                Integer num2 = num;
                int i3 = i;
                int i4 = i2;
                Long l3 = l;
                Long l4 = l2;
                List<String> list3 = list;
                List<String> list4 = list2;
                int i5 = FakeSplitInstallManager.zza;
                SplitInstallSessionState create = splitInstallSessionState == null ? SplitInstallSessionState.create(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : splitInstallSessionState;
                int sessionId = num2 == null ? create.sessionId() : num2.intValue();
                long bytesDownloaded = l3 == null ? create.bytesDownloaded() : l3.longValue();
                if (l4 == null) {
                    longValue = create.totalBytesToDownload();
                } else {
                    longValue = l4.longValue();
                }
                return SplitInstallSessionState.create(sessionId, i3, i4, bytesDownloaded, longValue, list3 == null ? create.moduleNames() : list3, list4 == null ? create.languages() : list4);
            }
        });
        if (zzn != null) {
            zzq(zzn);
            return true;
        }
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        HashSet hashSet = new HashSet();
        if (this.zze.zzd() != null) {
            hashSet.addAll(this.zze.zzd());
        }
        hashSet.addAll(this.zzo);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.zze.zzc());
        hashSet.addAll(this.zzn);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzi.zza(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0125, code lost:
        if (r0.contains(r15) == false) goto L49;
     */
    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task<java.lang.Integer> startInstall(final com.google.android.play.core.splitinstall.SplitInstallRequest r20) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest):com.google.android.gms.tasks.Task");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(final long j, final List list, final List list2, final List list3) {
        long j2 = 0;
        for (int i = 0; i < 3; i++) {
            j2 = Math.min(j, j2 + (j / 3));
            zzs(2, 0, Long.valueOf(j2), Long.valueOf(j), null, null, null);
            SystemClock.sleep(zzb);
            SplitInstallSessionState zzm = zzm();
            if (zzm.status() == 9 || zzm.status() == 7 || zzm.status() == 6) {
                return;
            }
        }
        this.zzj.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzd
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplitInstallManager.this.zzh(list, list2, list3, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(SplitInstallSessionState splitInstallSessionState) {
        this.zzh.zzc(splitInstallSessionState);
        this.zzi.zzc(splitInstallSessionState);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(List list, List list2, List list3, long j) {
        if (this.zzp.get()) {
            zzs(6, -6, null, null, null, null, null);
        } else if (this.zzk.zza() != null) {
            zzp(list, list2, list3, j, false);
        } else {
            zzr(list2, list3, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(List list, final List list2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String zza2 = zzbw.zza(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, this.zzd.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", zzo(zza2));
            intent.putExtra("split_id", zza2);
            arrayList.add(intent);
            arrayList2.add(zzo(zzbw.zza(file)));
        }
        SplitInstallSessionState zzm = zzm();
        if (zzm == null) {
            return;
        }
        final long j = zzm.totalBytesToDownload();
        this.zzj.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzi
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplitInstallManager.this.zzf(j, arrayList, arrayList2, list2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FakeSplitInstallManager(Context context, File file, zzs zzsVar, zzby zzbyVar) {
        Executor zza2 = com.google.android.play.core.splitcompat.zzd.zza();
        zzbs zzbsVar = new zzbs(context);
        zzj zzjVar = new Object() { // from class: com.google.android.play.core.splitinstall.testing.zzj
        };
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzm = new AtomicReference();
        this.zzn = Collections.synchronizedSet(new HashSet());
        this.zzo = Collections.synchronizedSet(new HashSet());
        this.zzp = new AtomicBoolean(false);
        this.zzd = context;
        this.zzl = file;
        this.zze = zzsVar;
        this.zzf = zzbyVar;
        this.zzj = zza2;
        this.zzg = zzbsVar;
        this.zzq = zzjVar;
        this.zzi = new com.google.android.play.core.splitinstall.internal.zzt();
        this.zzh = new com.google.android.play.core.splitinstall.internal.zzt();
        this.zzk = zzo.INSTANCE;
    }
}
