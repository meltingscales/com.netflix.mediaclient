package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.zzaa;
import com.google.android.gms.cast.framework.zzac;
import com.google.android.gms.cast.framework.zzad;
import com.google.android.gms.cast.framework.zzx;
import com.google.android.gms.cast.framework.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzp extends zza implements zzq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // com.google.android.gms.internal.cast.zzq
    public final zzaa zze(IObjectWrapper iObjectWrapper, CastOptions castOptions, zzs zzsVar, Map map) {
        Parcel zza = zza();
        zzc.zzf(zza, iObjectWrapper);
        zzc.zzd(zza, castOptions);
        zzc.zzf(zza, zzsVar);
        zza.writeMap(map);
        Parcel zzb = zzb(1, zza);
        zzaa zzb2 = zzz.zzb(zzb.readStrongBinder());
        zzb.recycle();
        return zzb2;
    }

    @Override // com.google.android.gms.internal.cast.zzq
    public final zzad zzf(CastOptions castOptions, IObjectWrapper iObjectWrapper, zzx zzxVar) {
        Parcel zza = zza();
        zzc.zzd(zza, castOptions);
        zzc.zzf(zza, iObjectWrapper);
        zzc.zzf(zza, zzxVar);
        Parcel zzb = zzb(3, zza);
        zzad zzb2 = zzac.zzb(zzb.readStrongBinder());
        zzb.recycle();
        return zzb2;
    }

    @Override // com.google.android.gms.internal.cast.zzq
    public final com.google.android.gms.cast.framework.zzak zzg(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zza = zza();
        zzc.zzf(zza, iObjectWrapper);
        zzc.zzf(zza, iObjectWrapper2);
        zzc.zzf(zza, iObjectWrapper3);
        Parcel zzb = zzb(5, zza);
        com.google.android.gms.cast.framework.zzak zzb2 = com.google.android.gms.cast.framework.zzaj.zzb(zzb.readStrongBinder());
        zzb.recycle();
        return zzb2;
    }

    @Override // com.google.android.gms.internal.cast.zzq
    public final com.google.android.gms.cast.framework.zzan zzh(String str, String str2, com.google.android.gms.cast.framework.zzav zzavVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zzf(zza, zzavVar);
        Parcel zzb = zzb(2, zza);
        com.google.android.gms.cast.framework.zzan zzb2 = com.google.android.gms.cast.framework.zzam.zzb(zzb.readStrongBinder());
        zzb.recycle();
        return zzb2;
    }

    @Override // com.google.android.gms.internal.cast.zzq
    public final com.google.android.gms.cast.framework.media.internal.zzi zzi(IObjectWrapper iObjectWrapper, com.google.android.gms.cast.framework.media.internal.zzk zzkVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        Parcel zza = zza();
        zzc.zzf(zza, iObjectWrapper);
        zzc.zzf(zza, zzkVar);
        zza.writeInt(i);
        zza.writeInt(i2);
        zzc.zzc(zza, false);
        zza.writeLong(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        zza.writeInt(5);
        zza.writeInt(333);
        zza.writeInt(10000);
        Parcel zzb = zzb(6, zza);
        com.google.android.gms.cast.framework.media.internal.zzi zzb2 = com.google.android.gms.cast.framework.media.internal.zzh.zzb(zzb.readStrongBinder());
        zzb.recycle();
        return zzb2;
    }
}
