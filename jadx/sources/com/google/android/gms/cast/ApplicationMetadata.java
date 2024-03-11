package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new zzd();
    String zza;
    String zzb;
    List zzc;
    String zzd;
    Uri zze;
    String zzf;
    private String zzg;

    private ApplicationMetadata() {
        this.zzc = new ArrayList();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ApplicationMetadata) {
            ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
            return CastUtils.zzh(this.zza, applicationMetadata.zza) && CastUtils.zzh(this.zzb, applicationMetadata.zzb) && CastUtils.zzh(this.zzc, applicationMetadata.zzc) && CastUtils.zzh(this.zzd, applicationMetadata.zzd) && CastUtils.zzh(this.zze, applicationMetadata.zze) && CastUtils.zzh(this.zzf, applicationMetadata.zzf) && CastUtils.zzh(this.zzg, applicationMetadata.zzg);
        }
        return false;
    }

    public String getApplicationId() {
        return this.zza;
    }

    public String getIconUrl() {
        return this.zzf;
    }

    @Deprecated
    public List<WebImage> getImages() {
        return null;
    }

    public String getName() {
        return this.zzb;
    }

    public String getSenderAppIdentifier() {
        return this.zzd;
    }

    public List<String> getSupportedNamespaces() {
        return Collections.unmodifiableList(this.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    public String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        List list = this.zzc;
        int size = list == null ? 0 : list.size();
        String str3 = this.zzd;
        String valueOf = String.valueOf(this.zze);
        String str4 = this.zzf;
        String str5 = this.zzg;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 118 + String.valueOf(str2).length() + String.valueOf(str3).length() + valueOf.length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("applicationId: ");
        sb.append(str);
        sb.append(", name: ");
        sb.append(str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        sb.append(", senderAppLaunchUrl: ");
        sb.append(valueOf);
        sb.append(", iconUrl: ");
        sb.append(str4);
        sb.append(", type: ");
        sb.append(str5);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getApplicationId(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getImages(), false);
        SafeParcelWriter.writeStringList(parcel, 5, getSupportedNamespaces(), false);
        SafeParcelWriter.writeString(parcel, 6, getSenderAppIdentifier(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zze, i, false);
        SafeParcelWriter.writeString(parcel, 8, getIconUrl(), false);
        SafeParcelWriter.writeString(parcel, 9, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ApplicationMetadata(String str, String str2, List list, List list2, String str3, Uri uri, String str4, String str5) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = list2;
        this.zzd = str3;
        this.zze = uri;
        this.zzf = str4;
        this.zzg = str5;
    }
}
