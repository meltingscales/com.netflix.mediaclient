package com.google.android.datatransport.cct.a;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes5.dex */
public final class zzu implements ObjectEncoder<zzi> {
    @Override // com.google.firebase.encoders.ObjectEncoder
    public void encode(Object obj, Object obj2) {
        zzi zziVar = (zzi) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add("eventTimeMs", zziVar.zza()).add("eventUptimeMs", zziVar.zzb()).add("timezoneOffsetSeconds", zziVar.zzc());
        if (zziVar.zzf() != null) {
            objectEncoderContext.add("sourceExtension", zziVar.zzf());
        }
        if (zziVar.zzg() != null) {
            objectEncoderContext.add("sourceExtensionJsonProto3", zziVar.zzg());
        }
        if (zziVar.zzd() != Integer.MIN_VALUE) {
            objectEncoderContext.add("eventCode", zziVar.zzd());
        }
        if (zziVar.zze() != null) {
            objectEncoderContext.add("networkConnectionInfo", zziVar.zze());
        }
    }
}
