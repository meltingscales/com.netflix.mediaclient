package com.google.android.gms.tflite.internal;

import android.content.Context;
import com.google.android.gms.internal.tflite_java.zze;
import com.google.android.gms.internal.tflite_java.zzj;
import com.google.android.gms.tflite.dynamite.TfLiteDynamite;

/* loaded from: classes5.dex */
public class TfLiteJavaInitializerBase extends zze {
    public TfLiteJavaInitializerBase(Context context) {
        super(context, TfLiteDynamite.createDefaultExecutor(), zzj.CUSTOMER_3P_JAVA_API);
    }

    @Override // com.google.android.gms.internal.tflite_java.zze
    public native void initializeNative(Object obj);
}
