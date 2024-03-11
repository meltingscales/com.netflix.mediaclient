package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.text.DateFormat;
import java.util.Calendar;
import o.AbstractC9459pw;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class CalendarSerializer extends DateTimeSerializerBase<Calendar> {
    public static final CalendarSerializer b = new CalendarSerializer();

    public CalendarSerializer() {
        this(null, null);
    }

    public CalendarSerializer(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* renamed from: e */
    public CalendarSerializer a(Boolean bool, DateFormat dateFormat) {
        return new CalendarSerializer(bool, dateFormat);
    }

    protected long e(Calendar calendar) {
        if (calendar == null) {
            return 0L;
        }
        return calendar.getTimeInMillis();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: c */
    public void e(Calendar calendar, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (b(abstractC9459pw)) {
            jsonGenerator.b(e(calendar));
        } else {
            d(calendar.getTime(), jsonGenerator, abstractC9459pw);
        }
    }
}
