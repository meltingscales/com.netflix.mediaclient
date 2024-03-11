package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class DeleteBytesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeleteBytesRequest> CREATOR = new zzb();
    private final List zza;
    private final boolean zzb;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private List zza = new ArrayList();
        private boolean zzb = false;

        public DeleteBytesRequest build() {
            return new DeleteBytesRequest(this.zza, this.zzb);
        }

        public Builder setKeys(List<String> list) {
            Preconditions.checkNotNull(list, "Keys cannot be set to null");
            this.zza = list;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeleteBytesRequest(List list, boolean z) {
        if (z) {
            Preconditions.checkState(list == null || list.isEmpty(), "deleteAll was set to true but other constraint(s) was also provided: keys");
        }
        this.zzb = z;
        this.zza = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Preconditions.checkNotEmpty(str, "Element in keys cannot be null or empty");
                this.zza.add(str);
            }
        }
    }

    public boolean getDeleteAll() {
        return this.zzb;
    }

    public List<String> getKeys() {
        return Collections.unmodifiableList(this.zza);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, getKeys(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, getDeleteAll());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
