package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzal extends com.google.android.gms.internal.cast.zza implements zzan {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // com.google.android.gms.cast.framework.zzan
    public final int zze() {
        Parcel zzb = zzb(17, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzan
    public final int zzf() {
        Parcel zzb = zzb(18, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzan
    public final IObjectWrapper zzg() {
        Parcel zzb = zzb(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.cast.framework.zzan
    public final void zzj(int i) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzan
    public final void zzk(int i) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzan
    public final void zzl(int i) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzan
    public final boolean zzp() {
        Parcel zzb = zzb(5, zza());
        boolean zzg = com.google.android.gms.internal.cast.zzc.zzg(zzb);
        zzb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.cast.framework.zzan
    public final boolean zzt() {
        Parcel zzb = zzb(9, zza());
        boolean zzg = com.google.android.gms.internal.cast.zzc.zzg(zzb);
        zzb.recycle();
        return zzg;
    }
}
