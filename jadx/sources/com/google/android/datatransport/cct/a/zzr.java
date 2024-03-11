package com.google.android.datatransport.cct.a;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes5.dex */
public final class zzr implements ObjectEncoder<zzg> {
    @Override // com.google.firebase.encoders.ObjectEncoder
    public void encode(Object obj, Object obj2) {
        zzg zzgVar = (zzg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        if (zzgVar.zzc() != null) {
            objectEncoderContext.add("clientType", zzgVar.zzc().name());
        }
        if (zzgVar.zzb() != null) {
            objectEncoderContext.add("androidClientInfo", zzgVar.zzb());
        }
    }
}
