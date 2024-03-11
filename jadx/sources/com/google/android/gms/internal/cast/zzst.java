package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
public enum zzst {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzoy.zzb),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzk;

    zzst(Object obj) {
        this.zzk = obj;
    }
}
