package com.fasterxml.jackson.databind.ser.std;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.InterfaceC9478qO;
import o.InterfaceC9562rt;

/* loaded from: classes5.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements InterfaceC9562rt {
    protected final AtomicReference<DateFormat> a;
    protected final Boolean c;
    protected final DateFormat d;

    public abstract DateTimeSerializerBase<T> a(Boolean bool, DateFormat dateFormat);

    @Override // o.AbstractC9453pq
    public boolean c(AbstractC9459pw abstractC9459pw, T t) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this.c = bool;
        this.d = dateFormat;
        this.a = dateFormat == null ? null : new AtomicReference<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC9562rt
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        SimpleDateFormat simpleDateFormat;
        Locale n;
        JsonFormat.Value c = c(abstractC9459pw, beanProperty, (Class<?>) c());
        if (c == null) {
            return this;
        }
        JsonFormat.Shape a = c.a();
        if (a.a()) {
            return a(Boolean.TRUE, null);
        }
        if (c.j()) {
            if (c.f()) {
                n = c.b();
            } else {
                n = abstractC9459pw.n();
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(c.e(), n);
            simpleDateFormat2.setTimeZone(c.o() ? c.h() : abstractC9459pw.l());
            return a(Boolean.FALSE, simpleDateFormat2);
        }
        boolean f = c.f();
        boolean o2 = c.o();
        boolean z = a == JsonFormat.Shape.STRING;
        if (f || o2 || z) {
            DateFormat m = abstractC9459pw.c().m();
            if (m instanceof StdDateFormat) {
                StdDateFormat stdDateFormat = (StdDateFormat) m;
                if (c.f()) {
                    stdDateFormat = stdDateFormat.b(c.b());
                }
                if (c.o()) {
                    stdDateFormat = stdDateFormat.a(c.h());
                }
                return a(Boolean.FALSE, stdDateFormat);
            }
            if (!(m instanceof SimpleDateFormat)) {
                abstractC9459pw.c(c(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", m.getClass().getName()));
            }
            SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat) m;
            if (f) {
                simpleDateFormat = new SimpleDateFormat(simpleDateFormat3.toPattern(), c.b());
            } else {
                simpleDateFormat = (SimpleDateFormat) simpleDateFormat3.clone();
            }
            TimeZone h = c.h();
            if (h != null && !h.equals(simpleDateFormat.getTimeZone())) {
                simpleDateFormat.setTimeZone(h);
            }
            return a(Boolean.FALSE, simpleDateFormat);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return d(b(abstractC9459pw) ? "number" : "string", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        a(interfaceC9478qO, javaType, b(interfaceC9478qO.c()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(AbstractC9459pw abstractC9459pw) {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.d == null) {
            if (abstractC9459pw != null) {
                return abstractC9459pw.d(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            }
            throw new IllegalArgumentException("Null SerializerProvider passed for " + c().getName());
        }
        return false;
    }

    protected void a(InterfaceC9478qO interfaceC9478qO, JavaType javaType, boolean z) {
        if (z) {
            a(interfaceC9478qO, javaType, JsonParser.NumberType.LONG, JsonValueFormat.UTC_MILLISEC);
        } else {
            e(interfaceC9478qO, javaType, JsonValueFormat.DATE_TIME);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(Date date, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (this.d == null) {
            abstractC9459pw.a(date, jsonGenerator);
            return;
        }
        DateFormat andSet = this.a.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) this.d.clone();
        }
        jsonGenerator.i(andSet.format(date));
        MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.a, null, andSet);
    }
}
