package com.google.android.datatransport.cct.a;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes5.dex */
public final class zzw implements ObjectEncoder<zzk> {
    @Override // com.google.firebase.encoders.ObjectEncoder
    public void encode(Object obj, Object obj2) {
        zzk zzkVar = (zzk) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add("requestTimeMs", zzkVar.zzf()).add("requestUptimeMs", zzkVar.zzg());
        if (zzkVar.zzb() != null) {
            objectEncoderContext.add("clientInfo", zzkVar.zzb());
        }
        if (zzkVar.zze() != null) {
            objectEncoderContext.add("logSourceName", zzkVar.zze());
        } else if (zzkVar.zzd() != Integer.MIN_VALUE) {
            objectEncoderContext.add("logSource", zzkVar.zzd());
        } else {
            throw new EncodingException("Log request must have either LogSourceName or LogSource");
        }
        if (zzkVar.zzc().isEmpty()) {
            return;
        }
        objectEncoderContext.add("logEvent", zzkVar.zzc());
    }
}
