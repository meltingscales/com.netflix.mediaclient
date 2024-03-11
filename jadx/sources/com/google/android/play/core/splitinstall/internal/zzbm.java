package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbm extends zzk implements zzbo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzd(String str, List list, Bundle bundle, zzbq zzbqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        zzm.zzc(zza, bundle);
        zza.writeStrongBinder(zzbqVar);
        zzb(8, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zze(String str, List list, Bundle bundle, zzbq zzbqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        zzm.zzc(zza, bundle);
        zza.writeStrongBinder(zzbqVar);
        zzb(13, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzj(String str, List list, Bundle bundle, zzbq zzbqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        zzm.zzc(zza, bundle);
        zza.writeStrongBinder(zzbqVar);
        zzb(2, zza);
    }
}
