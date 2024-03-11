package com.google.android.datatransport.cct.a;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes5.dex */
public final class zzb implements ObjectEncoder<zzd> {
    @Override // com.google.firebase.encoders.ObjectEncoder
    public void encode(Object obj, Object obj2) {
        zzd zzdVar = (zzd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        if (zzdVar.zzi() != Integer.MIN_VALUE) {
            objectEncoderContext.add("sdkVersion", zzdVar.zzi());
        }
        if (zzdVar.zzf() != null) {
            objectEncoderContext.add("model", zzdVar.zzf());
        }
        if (zzdVar.zzd() != null) {
            objectEncoderContext.add("hardware", zzdVar.zzd());
        }
        if (zzdVar.zzb() != null) {
            objectEncoderContext.add("device", zzdVar.zzb());
        }
        if (zzdVar.zzh() != null) {
            objectEncoderContext.add("product", zzdVar.zzh());
        }
        if (zzdVar.zzg() != null) {
            objectEncoderContext.add("osBuild", zzdVar.zzg());
        }
        if (zzdVar.zze() != null) {
            objectEncoderContext.add("manufacturer", zzdVar.zze());
        }
        if (zzdVar.zzc() != null) {
            objectEncoderContext.add("fingerprint", zzdVar.zzc());
        }
    }
}
