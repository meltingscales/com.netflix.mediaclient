package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class zzbs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbs> CREATOR = new zzbt();
    private final int zza;

    public zzbs() {
        this.zza = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzbs) && this.zza == ((zzbs) obj).zza;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i = this.zza;
        return String.format("joinOptions(connectionType=%s)", i != 0 ? i != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbs(int i) {
        this.zza = i;
    }
}
