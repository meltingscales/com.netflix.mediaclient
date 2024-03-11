package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzaa implements SplitInstallManager {
    private final zzbc zza;
    private final zzx zzb;
    private final zzs zzc;
    private final zzbe zzd;
    private final Handler zze = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(zzbc zzbcVar, zzx zzxVar, zzs zzsVar, zzbe zzbeVar) {
        this.zza = zzbcVar;
        this.zzb = zzxVar;
        this.zzc = zzsVar;
        this.zzd = zzbeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List zze(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        return this.zza.zzd(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        Set<String> zzd = this.zzc.zzd();
        return zzd == null ? Collections.emptySet() : zzd;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        return this.zzc.zzc();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            this.zzb.zzb(splitInstallStateUpdatedListener);
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) {
        return startConfirmationDialogForResult(splitInstallSessionState, new zzz(this, activity), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r2.containsAll(r3) != false) goto L15;
     */
    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest r6) {
        /*
            r5 = this;
            com.google.android.play.core.splitinstall.internal.zzn r0 = new com.google.android.play.core.splitinstall.internal.zzn
            r0.<init>()
            r1 = 1
            r0.zzb(r1)
            java.util.List r1 = r6.getLanguages()
            r1.isEmpty()
            java.util.List r1 = r6.getLanguages()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L1b
            goto L46
        L1b:
            com.google.android.play.core.splitinstall.zzs r2 = r5.zzc
            java.util.Set r2 = r2.zzd()
            if (r2 == 0) goto L46
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r1.next()
            java.util.Locale r4 = (java.util.Locale) r4
            java.lang.String r4 = r4.getLanguage()
            r3.add(r4)
            goto L2c
        L40:
            boolean r1 = r2.containsAll(r3)
            if (r1 == 0) goto L7b
        L46:
            java.util.List r1 = r6.getModuleNames()
            com.google.android.play.core.splitinstall.zzs r2 = r5.zzc
            java.util.Set r2 = r2.zzc()
            boolean r1 = r2.containsAll(r1)
            if (r1 == 0) goto L7b
            java.util.List r1 = r6.getModuleNames()
            com.google.android.play.core.splitinstall.zzbe r2 = r5.zzd
            java.util.Set r2 = r2.zza()
            boolean r1 = java.util.Collections.disjoint(r1, r2)
            if (r1 != 0) goto L67
            goto L7b
        L67:
            android.os.Handler r0 = r5.zze
            com.google.android.play.core.splitinstall.zzy r1 = new com.google.android.play.core.splitinstall.zzy
            r1.<init>(r5, r6)
            r0.post(r1)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.tasks.Task r6 = com.google.android.gms.tasks.Tasks.forResult(r6)
            return r6
        L7b:
            com.google.android.play.core.splitinstall.zzbe r1 = r5.zzd
            java.util.List r2 = r6.getModuleNames()
            r1.zzd(r2)
            com.google.android.play.core.splitinstall.zzbc r1 = r5.zza
            java.util.List r2 = r6.getModuleNames()
            java.util.List r6 = r6.getLanguages()
            java.util.List r6 = zze(r6)
            com.google.android.gms.tasks.Task r6 = r1.zzj(r2, r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.zzaa.startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest):com.google.android.gms.tasks.Task");
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return this.zza.zze(zze(list));
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int i) {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        intentSenderForResultStarter.startIntentSenderForResult(splitInstallSessionState.resolutionIntent().getIntentSender(), i, null, 0, 0, 0, null);
        return true;
    }
}
