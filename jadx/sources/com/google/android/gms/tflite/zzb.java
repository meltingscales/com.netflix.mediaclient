package com.google.android.gms.tflite;

import org.tensorflow.lite.DataType;

/* loaded from: classes5.dex */
final class zzb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(DataType dataType) {
        switch (zza.zza[dataType.ordinal()]) {
            case 1:
                return "float";
            case 2:
                return "int";
            case 3:
                return "short";
            case 4:
            case 5:
                return "byte";
            case 6:
                return "long";
            case 7:
                return "bool";
            case 8:
                return "string";
            default:
                String valueOf = String.valueOf(dataType);
                throw new IllegalArgumentException("DataType error: DataType " + valueOf + " is not supported yet");
        }
    }
}
