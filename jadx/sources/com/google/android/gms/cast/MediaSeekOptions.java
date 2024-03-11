package com.google.android.gms.cast;

import com.google.android.gms.common.internal.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MediaSeekOptions {
    private final long zza;
    private final int zzb;
    private final boolean zzc;
    private final JSONObject zzd;

    /* loaded from: classes2.dex */
    public static class Builder {
        private long zza;
        private int zzb = 0;
        private boolean zzc;
        private JSONObject zzd;

        public MediaSeekOptions build() {
            return new MediaSeekOptions(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        public Builder setCustomData(JSONObject jSONObject) {
            this.zzd = jSONObject;
            return this;
        }

        public Builder setPosition(long j) {
            this.zza = j;
            return this;
        }

        public Builder setResumeState(int i) {
            this.zzb = i;
            return this;
        }
    }

    /* synthetic */ MediaSeekOptions(long j, int i, boolean z, JSONObject jSONObject, zzcj zzcjVar) {
        this.zza = j;
        this.zzb = i;
        this.zzc = z;
        this.zzd = jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaSeekOptions) {
            MediaSeekOptions mediaSeekOptions = (MediaSeekOptions) obj;
            return this.zza == mediaSeekOptions.zza && this.zzb == mediaSeekOptions.zzb && this.zzc == mediaSeekOptions.zzc && Objects.equal(this.zzd, mediaSeekOptions.zzd);
        }
        return false;
    }

    public JSONObject getCustomData() {
        return this.zzd;
    }

    public long getPosition() {
        return this.zza;
    }

    public int getResumeState() {
        return this.zzb;
    }

    public int hashCode() {
        long j = this.zza;
        int i = this.zzb;
        boolean z = this.zzc;
        return Objects.hashCode(Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z), this.zzd);
    }

    public boolean isSeekToInfinite() {
        return this.zzc;
    }
}
