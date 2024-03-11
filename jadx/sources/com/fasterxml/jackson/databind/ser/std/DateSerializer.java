package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.text.DateFormat;
import java.util.Date;
import o.AbstractC9459pw;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class DateSerializer extends DateTimeSerializerBase<Date> {
    public static final DateSerializer b = new DateSerializer();

    public DateSerializer() {
        this(null, null);
    }

    public DateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* renamed from: e */
    public DateSerializer a(Boolean bool, DateFormat dateFormat) {
        return new DateSerializer(bool, dateFormat);
    }

    protected long b(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: c */
    public void e(Date date, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (b(abstractC9459pw)) {
            jsonGenerator.b(b(date));
        } else {
            d(date, jsonGenerator, abstractC9459pw);
        }
    }
}
