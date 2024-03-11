package com.google.android.gms.tflite;

import java.nio.ByteBuffer;
import java.util.Map;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.Tensor;

/* loaded from: classes5.dex */
final class zzd implements InterpreterApi {
    NativeInterpreterWrapper zza;

    @Override // java.lang.AutoCloseable
    public final void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.zza;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.zza = null;
        }
    }

    protected final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final Tensor getInputTensor(int i) {
        zza();
        return this.zza.zze(i);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final int getInputTensorCount() {
        zza();
        return this.zza.zzb();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final Tensor getOutputTensor(int i) {
        zza();
        return this.zza.zzf(i);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final int getOutputTensorCount() {
        zza();
        return this.zza.zzd();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final void runForMultipleInputsOutputs(Object[] objArr, Map map) {
        zza();
        this.zza.zzj(objArr, map);
    }

    final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(ByteBuffer byteBuffer, zzc zzcVar) {
        this.zza = new NativeInterpreterWrapper(byteBuffer, zzcVar);
    }
}
