package com.google.android.gms.tflite;

import com.google.android.gms.tflite.nnapi.NnApiDelegateImpl;
import java.nio.ByteBuffer;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.InterpreterFactoryApi;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: Access modifiers changed from: package-private */
@UsedByReflection
/* loaded from: classes5.dex */
public class InterpreterFactoryImpl implements InterpreterFactoryApi {
    private static native String nativeRuntimeVersion();

    private static native String nativeSchemaVersion();

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public final NnApiDelegate.PrivateInterface createNnApiDelegateImpl(NnApiDelegate.Options options) {
        return new NnApiDelegateImpl(options);
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public final InterpreterApi create(ByteBuffer byteBuffer, InterpreterApi.Options options) {
        return new zzd(byteBuffer, options == null ? null : new zzc(options));
    }
}
