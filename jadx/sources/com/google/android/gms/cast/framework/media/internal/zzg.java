package com.google.android.gms.cast.framework.media.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzg extends com.google.android.gms.internal.cast.zza implements zzi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zzi
    public final Bitmap zze(Uri uri) {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzd(zza, uri);
        Parcel zzb = zzb(1, zza);
        Bitmap bitmap = (Bitmap) com.google.android.gms.internal.cast.zzc.zza(zzb, Bitmap.CREATOR);
        zzb.recycle();
        return bitmap;
    }
}
