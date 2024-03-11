package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.cast.zzdn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class CastOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CastOptions> CREATOR = new zzf();
    private String zza;
    private final List zzb;
    private boolean zzc;
    private LaunchOptions zzd;
    private final boolean zze;
    private final CastMediaOptions zzf;
    private final boolean zzg;
    private final double zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private List zzl;

    @VisibleForTesting
    /* loaded from: classes5.dex */
    public static final class Builder {
        private String zza;
        private boolean zzc;
        private List zzb = new ArrayList();
        private LaunchOptions zzd = new LaunchOptions();
        private boolean zze = true;
        private zzdn zzf = null;
        private boolean zzg = true;
        private double zzh = 0.05000000074505806d;
        private List zzi = new ArrayList();

        public Builder setCastMediaOptions(CastMediaOptions castMediaOptions) {
            this.zzf = zzdn.zzb(castMediaOptions);
            return this;
        }

        public Builder setEnableReconnectionService(boolean z) {
            this.zzg = z;
            return this;
        }

        public Builder setReceiverApplicationId(String str) {
            this.zza = str;
            return this;
        }

        public CastOptions build() {
            Object build;
            zzdn zzdnVar = this.zzf;
            if (zzdnVar == null) {
                build = new CastMediaOptions.Builder().build();
            } else {
                build = zzdnVar.zza();
            }
            return new CastOptions(this.zza, this.zzb, this.zzc, this.zzd, this.zze, (CastMediaOptions) build, this.zzg, this.zzh, false, false, false, this.zzi);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CastOptions(String str, List list, boolean z, LaunchOptions launchOptions, boolean z2, CastMediaOptions castMediaOptions, boolean z3, double d, boolean z4, boolean z5, boolean z6, List list2) {
        this.zza = true == TextUtils.isEmpty(str) ? "" : str;
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        this.zzb = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.zzc = z;
        this.zzd = launchOptions == null ? new LaunchOptions() : launchOptions;
        this.zze = z2;
        this.zzf = castMediaOptions;
        this.zzg = z3;
        this.zzh = d;
        this.zzi = z4;
        this.zzj = z5;
        this.zzk = z6;
        this.zzl = list2;
    }

    public CastMediaOptions getCastMediaOptions() {
        return this.zzf;
    }

    public boolean getEnableReconnectionService() {
        return this.zzg;
    }

    public LaunchOptions getLaunchOptions() {
        return this.zzd;
    }

    public String getReceiverApplicationId() {
        return this.zza;
    }

    public boolean getResumeSavedSession() {
        return this.zze;
    }

    public boolean getStopReceiverApplicationWhenEndingSession() {
        return this.zzc;
    }

    public List<String> getSupportedNamespaces() {
        return Collections.unmodifiableList(this.zzb);
    }

    public double getVolumeDeltaBeforeIceCreamSandwich() {
        return this.zzh;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getReceiverApplicationId(), false);
        SafeParcelWriter.writeStringList(parcel, 3, getSupportedNamespaces(), false);
        SafeParcelWriter.writeBoolean(parcel, 4, getStopReceiverApplicationWhenEndingSession());
        SafeParcelWriter.writeParcelable(parcel, 5, getLaunchOptions(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 6, getResumeSavedSession());
        SafeParcelWriter.writeParcelable(parcel, 7, getCastMediaOptions(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 8, getEnableReconnectionService());
        SafeParcelWriter.writeDouble(parcel, 9, getVolumeDeltaBeforeIceCreamSandwich());
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeStringList(parcel, 13, Collections.unmodifiableList(this.zzl), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final List zza() {
        return Collections.unmodifiableList(this.zzl);
    }

    public final boolean zzd() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzk;
    }
}
