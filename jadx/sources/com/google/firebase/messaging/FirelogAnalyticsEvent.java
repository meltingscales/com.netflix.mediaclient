package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.netflix.mediaclient.service.pushnotification.Payload;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class FirelogAnalyticsEvent {
    private final String zza;
    private final Intent zzb;

    /* loaded from: classes5.dex */
    static final class zza implements ObjectEncoder<FirelogAnalyticsEvent> {
        @Override // com.google.firebase.encoders.ObjectEncoder
        public final /* synthetic */ void encode(Object obj, Object obj2) {
            FirelogAnalyticsEvent firelogAnalyticsEvent = (FirelogAnalyticsEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            Intent zza = firelogAnalyticsEvent.zza();
            objectEncoderContext.add("ttl", zzo.zzf(zza));
            objectEncoderContext.add("event", firelogAnalyticsEvent.zzb());
            objectEncoderContext.add("instanceId", zzo.zzc());
            objectEncoderContext.add("priority", zzo.zzm(zza));
            objectEncoderContext.add("packageName", zzo.zzb());
            objectEncoderContext.add("sdkPlatform", "ANDROID");
            objectEncoderContext.add(Payload.PARAM_RENO_MESSAGE_TYPE, zzo.zzk(zza));
            String zzj = zzo.zzj(zza);
            if (zzj != null) {
                objectEncoderContext.add("messageId", zzj);
            }
            String zzl = zzo.zzl(zza);
            if (zzl != null) {
                objectEncoderContext.add("topic", zzl);
            }
            String zzg = zzo.zzg(zza);
            if (zzg != null) {
                objectEncoderContext.add("collapseKey", zzg);
            }
            if (zzo.zzi(zza) != null) {
                objectEncoderContext.add("analyticsLabel", zzo.zzi(zza));
            }
            if (zzo.zzh(zza) != null) {
                objectEncoderContext.add("composerLabel", zzo.zzh(zza));
            }
            String zzd = zzo.zzd();
            if (zzd != null) {
                objectEncoderContext.add("projectNumber", zzd);
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class zzb implements ObjectEncoder<zzc> {
        @Override // com.google.firebase.encoders.ObjectEncoder
        public final /* synthetic */ void encode(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).add("messaging_client_event", ((zzc) obj).zza());
        }
    }

    /* loaded from: classes5.dex */
    static final class zzc {
        private final FirelogAnalyticsEvent zza;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzc(FirelogAnalyticsEvent firelogAnalyticsEvent) {
            this.zza = (FirelogAnalyticsEvent) Preconditions.checkNotNull(firelogAnalyticsEvent);
        }

        final FirelogAnalyticsEvent zza() {
            return this.zza;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirelogAnalyticsEvent(String str, Intent intent) {
        this.zza = Preconditions.checkNotEmpty(str, "evenType must be non-null");
        this.zzb = (Intent) Preconditions.checkNotNull(intent, "intent must be non-null");
    }

    final Intent zza() {
        return this.zzb;
    }

    final String zzb() {
        return this.zza;
    }
}
