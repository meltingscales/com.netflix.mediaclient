package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzeq extends com.google.android.gms.internal.measurement.zza implements zzeo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zza(zzan zzanVar, zzm zzmVar) {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzanVar);
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzmVar);
        zzb(1, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zza(zzkl zzklVar, zzm zzmVar) {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzklVar);
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzmVar);
        zzb(2, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zza(zzm zzmVar) {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzmVar);
        zzb(4, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zza(zzan zzanVar, String str, String str2) {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzanVar);
        a_.writeString(str);
        a_.writeString(str2);
        zzb(5, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzb(zzm zzmVar) {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzmVar);
        zzb(6, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List<zzkl> zza(zzm zzmVar, boolean z) {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzmVar);
        com.google.android.gms.internal.measurement.zzb.zza(a_, z);
        Parcel zza = zza(7, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzkl.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final byte[] zza(zzan zzanVar, String str) {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzanVar);
        a_.writeString(str);
        Parcel zza = zza(9, a_);
        byte[] createByteArray = zza.createByteArray();
        zza.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zza(long j, String str, String str2, String str3) {
        Parcel a_ = a_();
        a_.writeLong(j);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        zzb(10, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final String zzc(zzm zzmVar) {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzmVar);
        Parcel zza = zza(11, a_);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zza(zzv zzvVar, zzm zzmVar) {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzvVar);
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzmVar);
        zzb(12, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zza(zzv zzvVar) {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzvVar);
        zzb(13, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List<zzkl> zza(String str, String str2, boolean z, zzm zzmVar) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(a_, z);
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzmVar);
        Parcel zza = zza(14, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzkl.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List<zzkl> zza(String str, String str2, String str3, boolean z) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        com.google.android.gms.internal.measurement.zzb.zza(a_, z);
        Parcel zza = zza(15, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzkl.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List<zzv> zza(String str, String str2, zzm zzmVar) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzmVar);
        Parcel zza = zza(16, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzv.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List<zzv> zza(String str, String str2, String str3) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        Parcel zza = zza(17, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzv.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzd(zzm zzmVar) {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzmVar);
        zzb(18, a_);
    }
}
