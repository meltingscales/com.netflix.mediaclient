package com.google.android.datatransport.cct.a;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes5.dex */
public final class zzz implements ObjectEncoder<zzn> {
    @Override // com.google.firebase.encoders.ObjectEncoder
    public void encode(Object obj, Object obj2) {
        zzn zznVar = (zzn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        if (zznVar.zzb() != null) {
            objectEncoderContext.add("mobileSubtype", zznVar.zzb().name());
        }
        if (zznVar.zzc() != null) {
            objectEncoderContext.add("networkType", zznVar.zzc().name());
        }
    }
}
