package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zze extends com.google.android.gms.internal.cast.zza implements zzg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // com.google.android.gms.cast.framework.media.zzg
    public final List zzf() {
        Parcel zzb = zzb(3, zza());
        ArrayList createTypedArrayList = zzb.createTypedArrayList(NotificationAction.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.cast.framework.media.zzg
    public final int[] zzg() {
        Parcel zzb = zzb(4, zza());
        int[] createIntArray = zzb.createIntArray();
        zzb.recycle();
        return createIntArray;
    }
}
