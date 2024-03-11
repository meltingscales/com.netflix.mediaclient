package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.sql.Date;
import java.text.DateFormat;
import o.AbstractC9459pw;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class SqlDateSerializer extends DateTimeSerializerBase<Date> {
    public SqlDateSerializer() {
        this(null, null);
    }

    protected SqlDateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* renamed from: b */
    public SqlDateSerializer a(Boolean bool, DateFormat dateFormat) {
        return new SqlDateSerializer(bool, dateFormat);
    }

    protected long d(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: b */
    public void e(Date date, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (b(abstractC9459pw)) {
            jsonGenerator.b(d(date));
        } else if (this.d == null) {
            jsonGenerator.i(date.toString());
        } else {
            d(date, jsonGenerator, abstractC9459pw);
        }
    }
}
