package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new zzd();
    @Deprecated
    private final Bundle zza;
    private final List zzb;
    private final Map zzc;

    /* loaded from: classes2.dex */
    public static class BlockstoreData extends AbstractSafeParcelable {
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new zza();
        private final byte[] zza;
        private final String zzb;

        /* JADX INFO: Access modifiers changed from: package-private */
        public BlockstoreData(byte[] bArr, String str) {
            this.zza = bArr;
            this.zzb = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof BlockstoreData) {
                if (this == obj) {
                    return true;
                }
                return Arrays.equals(this.zza, ((BlockstoreData) obj).zza);
            }
            return false;
        }

        public byte[] getBytes() {
            return this.zza;
        }

        public int hashCode() {
            return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeByteArray(parcel, 1, getBytes(), false);
            SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public final String zza() {
            return this.zzb;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RetrieveBytesResponse(Bundle bundle, List list) {
        this.zza = bundle;
        this.zzb = list;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            hashMap.put(blockstoreData.zza(), blockstoreData);
        }
        this.zzc = hashMap;
    }

    public Map<String, BlockstoreData> getBlockstoreDataMap() {
        return Collections.unmodifiableMap(this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
