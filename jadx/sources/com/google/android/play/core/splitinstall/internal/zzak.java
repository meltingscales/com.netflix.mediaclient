package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzak implements com.google.android.play.core.splitinstall.zzh {
    private final Context zza;
    private final com.google.android.play.core.splitcompat.zze zzb;
    private final zzam zzc;
    private final Executor zzd;
    private final com.google.android.play.core.splitcompat.zzs zze;

    public zzak(Context context, Executor executor, zzam zzamVar, com.google.android.play.core.splitcompat.zze zzeVar, com.google.android.play.core.splitcompat.zzs zzsVar) {
        this.zza = context;
        this.zzb = zzeVar;
        this.zzc = zzamVar;
        this.zzd = executor;
        this.zze = zzsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(zzak zzakVar, List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        Integer zze = zzakVar.zze(list);
        if (zze == null) {
            return;
        }
        if (zze.intValue() == 0) {
            zzfVar.zzc();
        } else {
            zzfVar.zzb(zze.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzc(zzak zzakVar, com.google.android.play.core.splitinstall.zzf zzfVar) {
        try {
            if (!SplitCompat.zzd(zzbr.zza(zzakVar.zza))) {
                Log.e("SplitCompat", "Emulating splits failed.");
                zzfVar.zzb(-12);
                return;
            }
            Log.i("SplitCompat", "Splits installed.");
            zzfVar.zza();
        } catch (Exception e) {
            Log.e("SplitCompat", "Error emulating splits.", e);
            zzfVar.zzb(-12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r7.exists() == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0143 A[Catch: Exception -> 0x0147, TRY_LEAVE, TryCatch #8 {Exception -> 0x0147, blocks: (B:3:0x0004, B:89:0x0143, B:5:0x0016, B:11:0x0021, B:12:0x002a, B:14:0x0031, B:48:0x00b1, B:56:0x00c1, B:55:0x00be, B:57:0x00c2, B:58:0x00c7, B:59:0x00d1, B:61:0x00d9, B:63:0x00e1, B:64:0x00ef, B:66:0x00f3, B:68:0x0104, B:80:0x012e, B:70:0x010b, B:71:0x0111, B:73:0x0118, B:76:0x0121, B:78:0x0128), top: B:94:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Integer zze(java.util.List r13) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.internal.zzak.zze(java.util.List):java.lang.Integer");
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        if (!SplitCompat.zze()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.zzd.execute(new zzaj(this, list, zzfVar));
    }
}
