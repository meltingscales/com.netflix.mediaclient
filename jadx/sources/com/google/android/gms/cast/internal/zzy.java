package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new zzz();
    private double zza;
    private boolean zzb;
    private int zzc;
    private ApplicationMetadata zzd;
    private int zze;
    private com.google.android.gms.cast.zzar zzf;
    private double zzg;

    public zzy() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzy) {
            zzy zzyVar = (zzy) obj;
            if (this.zza == zzyVar.zza && this.zzb == zzyVar.zzb && this.zzc == zzyVar.zzc && CastUtils.zzh(this.zzd, zzyVar.zzd) && this.zze == zzyVar.zze) {
                com.google.android.gms.cast.zzar zzarVar = this.zzf;
                if (CastUtils.zzh(zzarVar, zzarVar) && this.zzg == zzyVar.zzg) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        double d = this.zza;
        boolean z = this.zzb;
        int i = this.zzc;
        ApplicationMetadata applicationMetadata = this.zzd;
        int i2 = this.zze;
        return Objects.hashCode(Double.valueOf(d), Boolean.valueOf(z), Integer.valueOf(i), applicationMetadata, Integer.valueOf(i2), this.zzf, Double.valueOf(this.zzg));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeDouble(parcel, 8, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final double zza() {
        return this.zzg;
    }

    public final double zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zze;
    }

    public final ApplicationMetadata zze() {
        return this.zzd;
    }

    public final com.google.android.gms.cast.zzar zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(double d, boolean z, int i, ApplicationMetadata applicationMetadata, int i2, com.google.android.gms.cast.zzar zzarVar, double d2) {
        this.zza = d;
        this.zzb = z;
        this.zzc = i;
        this.zzd = applicationMetadata;
        this.zze = i2;
        this.zzf = zzarVar;
        this.zzg = d2;
    }
}
