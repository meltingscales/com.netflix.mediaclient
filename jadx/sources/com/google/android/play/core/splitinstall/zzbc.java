package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.splitinstall.internal.zzbr;
import com.google.android.play.core.splitinstall.internal.zzbu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzbc {
    private static final com.google.android.play.core.splitinstall.internal.zzu zzb = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallService");
    private static final Intent zzc = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    com.google.android.play.core.splitinstall.internal.zzaf zza;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbc(Context context, String str) {
        this.zzd = str;
        if (zzbu.zza(context)) {
            this.zza = new com.google.android.play.core.splitinstall.internal.zzaf(zzbr.zza(context), zzb, "SplitInstallService", zzc, zzak.zza, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle zzb(com.google.android.play.core.splitinstall.internal.zzn zznVar) {
        Bundle zzo = zzo();
        zzo.putParcelableArrayList("event_timestamps", new ArrayList<>(zznVar.zza()));
        return zzo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ArrayList zzm(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("language", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ArrayList zzn(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle zzo() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    private static Task zzp() {
        zzb.zzb("onError(%d)", -14);
        return Tasks.forException(new SplitInstallException(-14));
    }

    public final Task zzd(List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredInstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzan(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task zze(List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredLanguageInstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzao(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task zzj(Collection collection, Collection collection2, com.google.android.play.core.splitinstall.internal.zzn zznVar) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("startInstall(%s,%s)", collection, collection2);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzal(this, taskCompletionSource, collection, collection2, zznVar, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
