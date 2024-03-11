package com.google.firebase.encoders.json;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;

/* loaded from: classes5.dex */
final /* synthetic */ class JsonDataEncoderBuilder$$Lambda$4 implements ValueEncoder {
    private static final JsonDataEncoderBuilder$$Lambda$4 instance = new JsonDataEncoderBuilder$$Lambda$4();

    private JsonDataEncoderBuilder$$Lambda$4() {
    }

    public static ValueEncoder lambdaFactory$() {
        return instance;
    }

    @Override // com.google.firebase.encoders.ValueEncoder
    public void encode(Object obj, Object obj2) {
        ((ValueEncoderContext) obj2).add(((Boolean) obj).booleanValue());
    }
}
