package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JacksonInject {
    OptBoolean a() default OptBoolean.DEFAULT;

    String b() default "";

    /* loaded from: classes5.dex */
    public static class Value implements Serializable {
        protected static final Value c = new Value(null, null);
        private static final long serialVersionUID = 1;
        protected final Boolean a;
        protected final Object d;

        private static boolean d(Object obj, Boolean bool) {
            return obj == null && bool == null;
        }

        public Object a() {
            return this.d;
        }

        public boolean b() {
            return this.d != null;
        }

        protected Value(Object obj, Boolean bool) {
            this.d = obj;
            this.a = bool;
        }

        public static Value c(Object obj, Boolean bool) {
            if ("".equals(obj)) {
                obj = null;
            }
            return d(obj, bool) ? c : new Value(obj, bool);
        }

        public static Value d(JacksonInject jacksonInject) {
            return jacksonInject == null ? c : c(jacksonInject.b(), jacksonInject.a().e());
        }

        public static Value a(Object obj) {
            return c(obj, null);
        }

        public Value e(Object obj) {
            Object obj2 = this.d;
            if (obj == null) {
                if (obj2 == null) {
                    return this;
                }
            } else if (obj.equals(obj2)) {
                return this;
            }
            return new Value(obj, this.a);
        }

        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.d, this.a);
        }

        public int hashCode() {
            Object obj = this.d;
            int hashCode = obj != null ? 1 + obj.hashCode() : 1;
            Boolean bool = this.a;
            return bool != null ? hashCode + bool.hashCode() : hashCode;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                if (OptBoolean.e(this.a, value.a)) {
                    Object obj2 = this.d;
                    if (obj2 == null) {
                        return value.d == null;
                    }
                    return obj2.equals(value.d);
                }
            }
            return false;
        }
    }
}
