package com.google.android.datatransport.cct.a;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes5.dex */
public final class zzp implements ObjectEncoder<zze> {
    @Override // com.google.firebase.encoders.ObjectEncoder
    public void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add("logRequest", ((zze) obj).zza());
    }
}
