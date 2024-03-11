package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.util.TimeZone;
import o.AbstractC9459pw;
import o.AbstractC9544rb;

/* loaded from: classes5.dex */
public class TimeZoneSerializer extends StdScalarSerializer<TimeZone> {
    public TimeZoneSerializer() {
        super(TimeZone.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: a */
    public void e(TimeZone timeZone, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.i(timeZone.getID());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.AbstractC9453pq
    public void c(TimeZone timeZone, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.b(timeZone, TimeZone.class, JsonToken.VALUE_STRING));
        e(timeZone, jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, b);
    }
}
