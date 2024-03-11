package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new zzs();
    String zza;
    private String zzb;
    private InetAddress zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private List zzh;
    private int zzi;
    private int zzj;
    private String zzk;
    private final String zzl;
    private int zzm;
    private final String zzn;
    private byte[] zzo;
    private final String zzp;
    private final boolean zzq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, List list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z) {
        this.zzb = zzc(str);
        String zzc = zzc(str2);
        this.zza = zzc;
        if (!TextUtils.isEmpty(zzc)) {
            try {
                this.zzc = InetAddress.getByName(this.zza);
            } catch (UnknownHostException e) {
                String str10 = this.zza;
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(str10).length() + 48 + String.valueOf(message).length());
                sb.append("Unable to convert host address (");
                sb.append(str10);
                sb.append(") to ipaddress: ");
                sb.append(message);
                Log.i("CastDevice", sb.toString());
            }
        }
        this.zzd = zzc(str3);
        this.zze = zzc(str4);
        this.zzf = zzc(str5);
        this.zzg = i;
        this.zzh = list != null ? list : new ArrayList();
        this.zzi = i2;
        this.zzj = i3;
        this.zzk = zzc(str6);
        this.zzl = str7;
        this.zzm = i4;
        this.zzn = str8;
        this.zzo = bArr;
        this.zzp = str9;
        this.zzq = z;
    }

    public static CastDevice getFromBundle(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    private static String zzc(String str) {
        return str == null ? "" : str;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CastDevice) {
            CastDevice castDevice = (CastDevice) obj;
            String str = this.zzb;
            return str == null ? castDevice.zzb == null : CastUtils.zzh(str, castDevice.zzb) && CastUtils.zzh(this.zzc, castDevice.zzc) && CastUtils.zzh(this.zze, castDevice.zze) && CastUtils.zzh(this.zzd, castDevice.zzd) && CastUtils.zzh(this.zzf, castDevice.zzf) && this.zzg == castDevice.zzg && CastUtils.zzh(this.zzh, castDevice.zzh) && this.zzi == castDevice.zzi && this.zzj == castDevice.zzj && CastUtils.zzh(this.zzk, castDevice.zzk) && CastUtils.zzh(Integer.valueOf(this.zzm), Integer.valueOf(castDevice.zzm)) && CastUtils.zzh(this.zzn, castDevice.zzn) && CastUtils.zzh(this.zzl, castDevice.zzl) && CastUtils.zzh(this.zzf, castDevice.getDeviceVersion()) && this.zzg == castDevice.getServicePort() && (((bArr = this.zzo) == null && castDevice.zzo == null) || Arrays.equals(bArr, castDevice.zzo)) && CastUtils.zzh(this.zzp, castDevice.zzp) && this.zzq == castDevice.zzq;
        }
        return false;
    }

    public String getDeviceId() {
        return this.zzb.startsWith("__cast_nearby__") ? this.zzb.substring(16) : this.zzb;
    }

    public String getDeviceVersion() {
        return this.zzf;
    }

    public String getFriendlyName() {
        return this.zzd;
    }

    public List<WebImage> getIcons() {
        return Collections.unmodifiableList(this.zzh);
    }

    public InetAddress getInetAddress() {
        return this.zzc;
    }

    public String getModelName() {
        return this.zze;
    }

    public int getServicePort() {
        return this.zzg;
    }

    public boolean hasCapability(int i) {
        return (this.zzi & i) == i;
    }

    public int hashCode() {
        String str = this.zzb;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public void putInBundle(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }

    public String toString() {
        return String.format("\"%s\" (%s)", this.zzd, this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zza, false);
        SafeParcelWriter.writeString(parcel, 4, getFriendlyName(), false);
        SafeParcelWriter.writeString(parcel, 5, getModelName(), false);
        SafeParcelWriter.writeString(parcel, 6, getDeviceVersion(), false);
        SafeParcelWriter.writeInt(parcel, 7, getServicePort());
        SafeParcelWriter.writeTypedList(parcel, 8, getIcons(), false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeInt(parcel, 10, this.zzj);
        SafeParcelWriter.writeString(parcel, 11, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        SafeParcelWriter.writeByteArray(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzp, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzq);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzi;
    }

    public final String zzb() {
        return this.zzl;
    }
}
