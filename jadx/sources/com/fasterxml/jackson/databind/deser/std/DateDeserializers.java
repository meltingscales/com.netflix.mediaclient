package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.lang.reflect.Constructor;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;
import o.AbstractC9452pp;
import o.C9537rU;
import o.InterfaceC9420pJ;
import o.InterfaceC9458pv;

/* loaded from: classes5.dex */
public class DateDeserializers {
    private static final HashSet<String> c = new HashSet<>();

    static {
        Class[] clsArr = {Calendar.class, GregorianCalendar.class, Date.class, java.util.Date.class, Timestamp.class};
        for (int i = 0; i < 5; i++) {
            c.add(clsArr[i].getName());
        }
    }

    public static AbstractC9452pp<?> c(Class<?> cls, String str) {
        if (c.contains(str)) {
            if (cls == Calendar.class) {
                return new CalendarDeserializer();
            }
            if (cls == java.util.Date.class) {
                return DateDeserializer.d;
            }
            if (cls == Date.class) {
                return new SqlDateDeserializer();
            }
            if (cls == Timestamp.class) {
                return new TimestampDeserializer();
            }
            if (cls == GregorianCalendar.class) {
                return new CalendarDeserializer(GregorianCalendar.class);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static abstract class DateBasedDeserializer<T> extends StdScalarDeserializer<T> implements InterfaceC9420pJ {
        protected final DateFormat b;
        protected final String e;

        protected abstract DateBasedDeserializer<T> e(DateFormat dateFormat, String str);

        protected DateBasedDeserializer(Class<?> cls) {
            super(cls);
            this.b = null;
            this.e = null;
        }

        protected DateBasedDeserializer(DateBasedDeserializer<T> dateBasedDeserializer, DateFormat dateFormat, String str) {
            super(dateBasedDeserializer.B);
            this.b = dateFormat;
            this.e = str;
        }

        public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            StdDateFormat stdDateFormat;
            StdDateFormat stdDateFormat2;
            JsonFormat.Value c = c(deserializationContext, beanProperty, c());
            if (c != null) {
                TimeZone h = c.h();
                Boolean c2 = c.c();
                if (c.j()) {
                    String e = c.e();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(e, c.f() ? c.b() : deserializationContext.n());
                    if (h == null) {
                        h = deserializationContext.l();
                    }
                    simpleDateFormat.setTimeZone(h);
                    if (c2 != null) {
                        simpleDateFormat.setLenient(c2.booleanValue());
                    }
                    return e(simpleDateFormat, e);
                } else if (h != null) {
                    DateFormat m = deserializationContext.c().m();
                    if (m.getClass() == StdDateFormat.class) {
                        StdDateFormat b = ((StdDateFormat) m).a(h).b(c.f() ? c.b() : deserializationContext.n());
                        stdDateFormat2 = b;
                        if (c2 != null) {
                            stdDateFormat2 = b.e(c2);
                        }
                    } else {
                        DateFormat dateFormat = (DateFormat) m.clone();
                        dateFormat.setTimeZone(h);
                        stdDateFormat2 = dateFormat;
                        if (c2 != null) {
                            dateFormat.setLenient(c2.booleanValue());
                            stdDateFormat2 = dateFormat;
                        }
                    }
                    return e(stdDateFormat2, this.e);
                } else if (c2 != null) {
                    DateFormat m2 = deserializationContext.c().m();
                    String str = this.e;
                    if (m2.getClass() == StdDateFormat.class) {
                        StdDateFormat e2 = ((StdDateFormat) m2).e(c2);
                        str = e2.d();
                        stdDateFormat = e2;
                    } else {
                        DateFormat dateFormat2 = (DateFormat) m2.clone();
                        dateFormat2.setLenient(c2.booleanValue());
                        boolean z = dateFormat2 instanceof SimpleDateFormat;
                        stdDateFormat = dateFormat2;
                        if (z) {
                            ((SimpleDateFormat) dateFormat2).toPattern();
                            stdDateFormat = dateFormat2;
                        }
                    }
                    if (str == null) {
                        str = "[unknown]";
                    }
                    return e(stdDateFormat, str);
                }
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
        public java.util.Date a_(JsonParser jsonParser, DeserializationContext deserializationContext) {
            java.util.Date parse;
            if (this.b != null && jsonParser.a(JsonToken.VALUE_STRING)) {
                String trim = jsonParser.A().trim();
                if (trim.length() == 0) {
                    return (java.util.Date) d(deserializationContext);
                }
                synchronized (this.b) {
                    try {
                        try {
                            parse = this.b.parse(trim);
                        } catch (ParseException unused) {
                            return (java.util.Date) deserializationContext.b(c(), trim, "expected format \"%s\"", this.e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parse;
            }
            return super.a_(jsonParser, deserializationContext);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class CalendarDeserializer extends DateBasedDeserializer<Calendar> {
        protected final Constructor<Calendar> a;

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, o.InterfaceC9420pJ
        public /* bridge */ /* synthetic */ AbstractC9452pp c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.c(deserializationContext, beanProperty);
        }

        public CalendarDeserializer() {
            super(Calendar.class);
            this.a = null;
        }

        public CalendarDeserializer(Class<? extends Calendar> cls) {
            super(cls);
            this.a = C9537rU.d((Class) cls, false);
        }

        public CalendarDeserializer(CalendarDeserializer calendarDeserializer, DateFormat dateFormat, String str) {
            super(calendarDeserializer, dateFormat, str);
            this.a = calendarDeserializer.a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* renamed from: b */
        public CalendarDeserializer e(DateFormat dateFormat, String str) {
            return new CalendarDeserializer(this, dateFormat, str);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public Calendar b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            java.util.Date a_ = a_(jsonParser, deserializationContext);
            if (a_ == null) {
                return null;
            }
            Constructor<Calendar> constructor = this.a;
            if (constructor == null) {
                return deserializationContext.c(a_);
            }
            try {
                Calendar newInstance = constructor.newInstance(new Object[0]);
                newInstance.setTimeInMillis(a_.getTime());
                TimeZone l = deserializationContext.l();
                if (l != null) {
                    newInstance.setTimeZone(l);
                }
                return newInstance;
            } catch (Exception e) {
                return (Calendar) deserializationContext.d(c(), a_, e);
            }
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class DateDeserializer extends DateBasedDeserializer<java.util.Date> {
        public static final DateDeserializer d = new DateDeserializer();

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, o.InterfaceC9420pJ
        public /* bridge */ /* synthetic */ AbstractC9452pp c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.c(deserializationContext, beanProperty);
        }

        public DateDeserializer() {
            super(java.util.Date.class);
        }

        public DateDeserializer(DateDeserializer dateDeserializer, DateFormat dateFormat, String str) {
            super(dateDeserializer, dateFormat, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* renamed from: b */
        public DateDeserializer e(DateFormat dateFormat, String str) {
            return new DateDeserializer(this, dateFormat, str);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: c */
        public java.util.Date b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return a_(jsonParser, deserializationContext);
        }
    }

    /* loaded from: classes5.dex */
    public static class SqlDateDeserializer extends DateBasedDeserializer<Date> {
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, o.InterfaceC9420pJ
        public /* bridge */ /* synthetic */ AbstractC9452pp c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.c(deserializationContext, beanProperty);
        }

        public SqlDateDeserializer() {
            super(Date.class);
        }

        public SqlDateDeserializer(SqlDateDeserializer sqlDateDeserializer, DateFormat dateFormat, String str) {
            super(sqlDateDeserializer, dateFormat, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* renamed from: d */
        public SqlDateDeserializer e(DateFormat dateFormat, String str) {
            return new SqlDateDeserializer(this, dateFormat, str);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public Date b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            java.util.Date a_ = a_(jsonParser, deserializationContext);
            if (a_ == null) {
                return null;
            }
            return new Date(a_.getTime());
        }
    }

    /* loaded from: classes5.dex */
    public static class TimestampDeserializer extends DateBasedDeserializer<Timestamp> {
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, o.InterfaceC9420pJ
        public /* bridge */ /* synthetic */ AbstractC9452pp c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.c(deserializationContext, beanProperty);
        }

        public TimestampDeserializer() {
            super(Timestamp.class);
        }

        public TimestampDeserializer(TimestampDeserializer timestampDeserializer, DateFormat dateFormat, String str) {
            super(timestampDeserializer, dateFormat, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* renamed from: a */
        public TimestampDeserializer e(DateFormat dateFormat, String str) {
            return new TimestampDeserializer(this, dateFormat, str);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: c */
        public Timestamp b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            java.util.Date a_ = a_(jsonParser, deserializationContext);
            if (a_ == null) {
                return null;
            }
            return new Timestamp(a_.getTime());
        }
    }
}
