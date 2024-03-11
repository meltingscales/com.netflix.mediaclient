package org.tensorflow.lite;

import java.nio.ByteBuffer;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* loaded from: classes6.dex */
public interface InterpreterFactoryApi {
    InterpreterApi create(ByteBuffer byteBuffer, InterpreterApi.Options options);

    NnApiDelegate.PrivateInterface createNnApiDelegateImpl(NnApiDelegate.Options options);
}
