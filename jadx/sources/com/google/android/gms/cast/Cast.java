package com.google.android.gms.cast;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.internal.zzai;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class Cast {
    public static final Api<CastOptions> API;
    public static final CastApi CastApi;
    @VisibleForTesting
    static final Api.AbstractClientBuilder zza;

    /* loaded from: classes2.dex */
    public interface ApplicationConnectionResult extends Result {
        ApplicationMetadata getApplicationMetadata();

        String getApplicationStatus();

        String getSessionId();

        boolean getWasLaunched();
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface CastApi {
    }

    /* loaded from: classes2.dex */
    public static final class CastOptions implements Api.ApiOptions.HasOptions {
        final CastDevice zza;
        final Listener zzb;
        final Bundle zzc;
        final int zzd;
        final String zze = UUID.randomUUID().toString();

        /* loaded from: classes2.dex */
        public static final class Builder {
            CastDevice zza;
            Listener zzb;
            private int zzc;
            private Bundle zzd;

            public Builder(CastDevice castDevice, Listener listener) {
                Preconditions.checkNotNull(castDevice, "CastDevice parameter cannot be null");
                Preconditions.checkNotNull(listener, "CastListener parameter cannot be null");
                this.zza = castDevice;
                this.zzb = listener;
                this.zzc = 0;
            }

            public CastOptions build() {
                return new CastOptions(this, null);
            }

            public final Builder zzc(Bundle bundle) {
                this.zzd = bundle;
                return this;
            }
        }

        /* synthetic */ CastOptions(Builder builder, zzn zznVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
            this.zzd = builder.zzc;
            this.zzc = builder.zzd;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CastOptions) {
                CastOptions castOptions = (CastOptions) obj;
                return Objects.equal(this.zza, castOptions.zza) && Objects.checkBundlesEquality(this.zzc, castOptions.zzc) && this.zzd == castOptions.zzd && Objects.equal(this.zze, castOptions.zze);
            }
            return false;
        }

        public int hashCode() {
            CastDevice castDevice = this.zza;
            Bundle bundle = this.zzc;
            int i = this.zzd;
            return Objects.hashCode(castDevice, bundle, Integer.valueOf(i), this.zze);
        }
    }

    /* loaded from: classes2.dex */
    public static class Listener {
        public void onActiveInputStateChanged(int i) {
        }

        public void onApplicationDisconnected(int i) {
        }

        public void onApplicationMetadataChanged(ApplicationMetadata applicationMetadata) {
        }

        public void onApplicationStatusChanged() {
        }

        public void onStandbyStateChanged(int i) {
        }

        public void onVolumeChanged() {
        }
    }

    /* loaded from: classes2.dex */
    public interface MessageReceivedCallback {
        void onMessageReceived(CastDevice castDevice, String str, String str2);
    }

    static {
        zze zzeVar = new zze();
        zza = zzeVar;
        API = new Api<>("Cast.API", zzeVar, zzai.zza);
        CastApi = new zzm();
    }

    public static zzr zza(Context context, CastOptions castOptions) {
        return new zzbr(context, castOptions);
    }
}
