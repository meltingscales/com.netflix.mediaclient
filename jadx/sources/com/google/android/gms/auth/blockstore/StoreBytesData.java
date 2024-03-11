package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public class StoreBytesData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StoreBytesData> CREATOR = new zze();
    private final byte[] zza;
    private final boolean zzb;
    private final String zzc;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private byte[] zza;
        private boolean zzb;
        private String zzc = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";

        public StoreBytesData build() {
            return new StoreBytesData(this.zza, this.zzb, this.zzc);
        }

        public Builder setBytes(byte[] bArr) {
            this.zza = bArr;
            return this;
        }

        public Builder setKey(String str) {
            Preconditions.checkNotEmpty(str, "key cannot be null or empty");
            this.zzc = str;
            return this;
        }

        public Builder setShouldBackupToCloud(boolean z) {
            this.zzb = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StoreBytesData(byte[] bArr, boolean z, String str) {
        this.zza = bArr;
        this.zzb = z;
        this.zzc = str;
    }

    public byte[] getBytes() {
        return this.zza;
    }

    public String getKey() {
        return this.zzc;
    }

    public boolean shouldBackupToCloud() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, getBytes(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, shouldBackupToCloud());
        SafeParcelWriter.writeString(parcel, 3, getKey(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
