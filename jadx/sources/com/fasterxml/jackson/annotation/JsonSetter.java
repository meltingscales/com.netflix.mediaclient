package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonSetter {
    Nulls a() default Nulls.DEFAULT;

    Nulls b() default Nulls.DEFAULT;

    String e() default "";

    /* loaded from: classes5.dex */
    public static class Value implements Serializable {
        protected static final Value d;
        private static final long serialVersionUID = 1;
        private final Nulls a;
        private final Nulls c;

        public static Value b() {
            return d;
        }

        static {
            Nulls nulls = Nulls.DEFAULT;
            d = new Value(nulls, nulls);
        }

        protected Value(Nulls nulls, Nulls nulls2) {
            this.a = nulls;
            this.c = nulls2;
        }

        protected Object readResolve() {
            return b(this.a, this.c) ? d : this;
        }

        public static Value a(JsonSetter jsonSetter) {
            return jsonSetter == null ? d : d(jsonSetter.b(), jsonSetter.a());
        }

        public static Value d(Nulls nulls, Nulls nulls2) {
            if (nulls == null) {
                nulls = Nulls.DEFAULT;
            }
            if (nulls2 == null) {
                nulls2 = Nulls.DEFAULT;
            }
            return b(nulls, nulls2) ? d : new Value(nulls, nulls2);
        }

        public Nulls a() {
            Nulls nulls = this.a;
            if (nulls == Nulls.DEFAULT) {
                return null;
            }
            return nulls;
        }

        public Nulls c() {
            Nulls nulls = this.c;
            if (nulls == Nulls.DEFAULT) {
                return null;
            }
            return nulls;
        }

        public String toString() {
            return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", this.a, this.c);
        }

        public int hashCode() {
            return this.a.ordinal() + (this.c.ordinal() << 2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                return value.a == this.a && value.c == this.c;
            }
            return false;
        }

        private static boolean b(Nulls nulls, Nulls nulls2) {
            Nulls nulls3 = Nulls.DEFAULT;
            return nulls == nulls3 && nulls2 == nulls3;
        }
    }
}
