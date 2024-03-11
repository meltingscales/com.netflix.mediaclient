package com.google.android.gms.tflite.client;

import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.dynamite.NativeInitializationHandle;

/* loaded from: classes5.dex */
public interface TfLiteClient extends OptionalModuleApi {
    public static final TfLiteInitializationOptions DEFAULT_TFLITE_INITIALIZATION_OPTIONS = TfLiteInitializationOptions.builder().build();

    Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle(TfLiteInitializationOptions tfLiteInitializationOptions);
}
