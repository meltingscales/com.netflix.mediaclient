package com.google.firebase.encoders.json;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.C8543dpm;

/* loaded from: classes5.dex */
public final class JsonDataEncoderBuilder {
    private static final ValueEncoder<Boolean> BOOLEAN_ENCODER;
    private static final ValueEncoder<String> STRING_ENCODER;
    private static final TimestampEncoder TIMESTAMP_ENCODER;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders = new HashMap();
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class TimestampEncoder implements ValueEncoder<Date> {
        private static final DateFormat rfc339;

        private TimestampEncoder() {
        }

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            rfc339 = simpleDateFormat;
            simpleDateFormat.setTimeZone(C8543dpm.c("UTC"));
        }

        @Override // com.google.firebase.encoders.ValueEncoder
        public void encode(Date date, ValueEncoderContext valueEncoderContext) {
            valueEncoderContext.add(rfc339.format(date));
        }
    }

    static {
        ValueEncoder<String> valueEncoder;
        ValueEncoder<Boolean> valueEncoder2;
        valueEncoder = JsonDataEncoderBuilder$$Lambda$1.instance;
        STRING_ENCODER = valueEncoder;
        valueEncoder2 = JsonDataEncoderBuilder$$Lambda$4.instance;
        BOOLEAN_ENCODER = valueEncoder2;
        TIMESTAMP_ENCODER = new TimestampEncoder();
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(String.class, STRING_ENCODER);
        registerEncoder(Boolean.class, BOOLEAN_ENCODER);
        registerEncoder(Date.class, TIMESTAMP_ENCODER);
    }

    public <T> JsonDataEncoderBuilder registerEncoder(Class<T> cls, ObjectEncoder<? super T> objectEncoder) {
        if (this.objectEncoders.containsKey(cls)) {
            throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
        }
        this.objectEncoders.put(cls, objectEncoder);
        return this;
    }

    public <T> JsonDataEncoderBuilder registerEncoder(Class<T> cls, ValueEncoder<? super T> valueEncoder) {
        if (this.valueEncoders.containsKey(cls)) {
            throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
        }
        this.valueEncoders.put(cls, valueEncoder);
        return this;
    }

    public DataEncoder build() {
        return new DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            {
                JsonDataEncoderBuilder.this = this;
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public void encode(Object obj, Writer writer) {
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, JsonDataEncoderBuilder.this.objectEncoders, JsonDataEncoderBuilder.this.valueEncoders);
                jsonValueObjectEncoderContext.add(obj);
                jsonValueObjectEncoderContext.close();
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public String encode(Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    encode(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }
}
