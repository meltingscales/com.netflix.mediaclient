package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;
import o.C8543dpm;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonFormat {

    /* loaded from: classes5.dex */
    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    /* loaded from: classes5.dex */
    public enum Shape {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        public boolean a() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }
    }

    String a() default "";

    Shape b() default Shape.ANY;

    String c() default "##default";

    String d() default "##default";

    OptBoolean e() default OptBoolean.DEFAULT;

    Feature[] f() default {};

    Feature[] g() default {};

    /* loaded from: classes5.dex */
    public static class b {
        private static final b d = new b(0, 0);
        private final int a;
        private final int b;

        public static b d() {
            return d;
        }

        public int hashCode() {
            return this.a + this.b;
        }

        private b(int i, int i2) {
            this.b = i;
            this.a = i2;
        }

        public static b e(JsonFormat jsonFormat) {
            return d(jsonFormat.g(), jsonFormat.f());
        }

        public static b d(Feature[] featureArr, Feature[] featureArr2) {
            int i = 0;
            for (Feature feature : featureArr) {
                i |= 1 << feature.ordinal();
            }
            int i2 = 0;
            for (Feature feature2 : featureArr2) {
                i2 |= 1 << feature2.ordinal();
            }
            return new b(i, i2);
        }

        public b b(b bVar) {
            if (bVar == null) {
                return this;
            }
            int i = bVar.a;
            int i2 = bVar.b;
            if (i == 0 && i2 == 0) {
                return this;
            }
            int i3 = this.b;
            if (i3 == 0 && this.a == 0) {
                return bVar;
            }
            int i4 = ((~i) & i3) | i2;
            int i5 = this.a;
            int i6 = i | ((~i2) & i5);
            return (i4 == i3 && i6 == i5) ? this : new b(i4, i6);
        }

        public Boolean c(Feature feature) {
            int ordinal = 1 << feature.ordinal();
            if ((this.a & ordinal) != 0) {
                return Boolean.FALSE;
            }
            if ((ordinal & this.b) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public String toString() {
            if (this == d) {
                return "EMPTY";
            }
            return String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.b), Integer.valueOf(this.a));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                b bVar = (b) obj;
                return bVar.b == this.b && bVar.a == this.a;
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public static class Value implements Serializable {
        private static final Value a = new Value();
        private static final long serialVersionUID = 1;
        private final Boolean b;
        private final Locale c;
        private final b d;
        private final String e;
        private final Shape f;
        private final String g;
        private transient TimeZone i;

        public static final Value d() {
            return a;
        }

        public Shape a() {
            return this.f;
        }

        public Locale b() {
            return this.c;
        }

        public Boolean c() {
            return this.b;
        }

        public String e() {
            return this.e;
        }

        public boolean f() {
            return this.c != null;
        }

        public boolean i() {
            return this.b != null;
        }

        public Value() {
            this("", Shape.ANY, "", "", b.d(), null);
        }

        public Value(JsonFormat jsonFormat) {
            this(jsonFormat.a(), jsonFormat.b(), jsonFormat.d(), jsonFormat.c(), b.e(jsonFormat), jsonFormat.e().e());
        }

        public Value(String str, Shape shape, String str2, String str3, b bVar, Boolean bool) {
            this(str, shape, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, bVar, bool);
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, b bVar, Boolean bool) {
            this.e = str;
            this.f = shape == null ? Shape.ANY : shape;
            this.c = locale;
            this.i = timeZone;
            this.g = str2;
            this.d = bVar == null ? b.d() : bVar;
            this.b = bool;
        }

        public static Value c(Value value, Value value2) {
            return value == null ? value2 : value.c(value2);
        }

        public final Value c(Value value) {
            Value value2;
            b b;
            String str;
            TimeZone timeZone;
            if (value == null || value == (value2 = a) || value == this) {
                return this;
            }
            if (this == value2) {
                return value;
            }
            String str2 = value.e;
            if (str2 == null || str2.isEmpty()) {
                str2 = this.e;
            }
            String str3 = str2;
            Shape shape = value.f;
            if (shape == Shape.ANY) {
                shape = this.f;
            }
            Shape shape2 = shape;
            Locale locale = value.c;
            if (locale == null) {
                locale = this.c;
            }
            Locale locale2 = locale;
            b bVar = this.d;
            if (bVar == null) {
                b = value.d;
            } else {
                b = bVar.b(value.d);
            }
            b bVar2 = b;
            Boolean bool = value.b;
            if (bool == null) {
                bool = this.b;
            }
            Boolean bool2 = bool;
            String str4 = value.g;
            if (str4 == null || str4.isEmpty()) {
                str = this.g;
                timeZone = this.i;
            } else {
                timeZone = value.i;
                str = str4;
            }
            return new Value(str3, shape2, locale2, str, timeZone, bVar2, bool2);
        }

        public static Value b(boolean z) {
            return new Value(null, null, null, null, null, b.d(), Boolean.valueOf(z));
        }

        public Value d(Boolean bool) {
            return bool == this.b ? this : new Value(this.e, this.f, this.c, this.g, this.i, this.d, bool);
        }

        public TimeZone h() {
            TimeZone timeZone = this.i;
            if (timeZone == null) {
                String str = this.g;
                if (str == null) {
                    return null;
                }
                TimeZone c = C8543dpm.c(str);
                this.i = c;
                return c;
            }
            return timeZone;
        }

        public boolean g() {
            return this.f != Shape.ANY;
        }

        public boolean j() {
            String str = this.e;
            return str != null && str.length() > 0;
        }

        public boolean o() {
            String str;
            return (this.i == null && ((str = this.g) == null || str.isEmpty())) ? false : true;
        }

        public Boolean d(Feature feature) {
            return this.d.c(feature);
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this.e, this.f, this.b, this.c, this.g, this.d);
        }

        public int hashCode() {
            String str = this.g;
            int hashCode = str == null ? 1 : str.hashCode();
            String str2 = this.e;
            if (str2 != null) {
                hashCode ^= str2.hashCode();
            }
            int hashCode2 = hashCode + this.f.hashCode();
            Boolean bool = this.b;
            if (bool != null) {
                hashCode2 ^= bool.hashCode();
            }
            Locale locale = this.c;
            if (locale != null) {
                hashCode2 += locale.hashCode();
            }
            return hashCode2 ^ this.d.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                if (this.f == value.f && this.d.equals(value.d)) {
                    return d(this.b, value.b) && d(this.g, value.g) && d(this.e, value.e) && d(this.i, value.i) && d(this.c, value.c);
                }
                return false;
            }
            return false;
        }

        private static <T> boolean d(T t, T t2) {
            if (t == null) {
                return t2 == null;
            } else if (t2 == null) {
                return false;
            } else {
                return t.equals(t2);
            }
        }
    }
}
