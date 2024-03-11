package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonInclude {

    /* loaded from: classes5.dex */
    public enum Include {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        CUSTOM,
        USE_DEFAULTS
    }

    Class<?> a() default Void.class;

    Include b() default Include.ALWAYS;

    Include c() default Include.ALWAYS;

    Class<?> e() default Void.class;

    /* loaded from: classes5.dex */
    public static class Value implements Serializable {
        protected static final Value e;
        private static final long serialVersionUID = 1;
        protected final Class<?> a;
        protected final Include b;
        protected final Include c;
        protected final Class<?> d;

        public static Value a() {
            return e;
        }

        public Class<?> b() {
            return this.d;
        }

        public Include c() {
            return this.c;
        }

        public Include d() {
            return this.b;
        }

        public Class<?> e() {
            return this.a;
        }

        static {
            Include include = Include.USE_DEFAULTS;
            e = new Value(include, include, null, null);
        }

        protected Value(Include include, Include include2, Class<?> cls, Class<?> cls2) {
            this.b = include == null ? Include.USE_DEFAULTS : include;
            this.c = include2 == null ? Include.USE_DEFAULTS : include2;
            this.d = cls == Void.class ? null : cls;
            this.a = cls2 == Void.class ? null : cls2;
        }

        public static Value d(Value value, Value value2) {
            return value == null ? value2 : value.b(value2);
        }

        public static Value c(Value... valueArr) {
            Value value = null;
            for (Value value2 : valueArr) {
                if (value2 != null) {
                    if (value != null) {
                        value2 = value.b(value2);
                    }
                    value = value2;
                }
            }
            return value;
        }

        protected Object readResolve() {
            Include include = this.b;
            Include include2 = Include.USE_DEFAULTS;
            return (include == include2 && this.c == include2 && this.d == null && this.a == null) ? e : this;
        }

        public Value b(Value value) {
            if (value != null && value != e) {
                Include include = value.b;
                Include include2 = value.c;
                Class<?> cls = value.d;
                Class<?> cls2 = value.a;
                Include include3 = this.b;
                boolean z = true;
                boolean z2 = (include == include3 || include == Include.USE_DEFAULTS) ? false : true;
                Include include4 = this.c;
                boolean z3 = (include2 == include4 || include2 == Include.USE_DEFAULTS) ? false : true;
                Class<?> cls3 = this.d;
                if (cls == cls3 && cls2 == cls3) {
                    z = false;
                }
                if (z2) {
                    if (z3) {
                        return new Value(include, include2, cls, cls2);
                    }
                    return new Value(include, include4, cls, cls2);
                } else if (z3) {
                    return new Value(include3, include2, cls, cls2);
                } else {
                    if (z) {
                        return new Value(include3, include4, cls, cls2);
                    }
                }
            }
            return this;
        }

        public static Value d(Include include, Include include2) {
            Include include3 = Include.USE_DEFAULTS;
            return ((include == include3 || include == null) && (include2 == include3 || include2 == null)) ? e : new Value(include, include2, null, null);
        }

        public static Value a(Include include, Include include2, Class<?> cls, Class<?> cls2) {
            if (cls == Void.class) {
                cls = null;
            }
            if (cls2 == Void.class) {
                cls2 = null;
            }
            Include include3 = Include.USE_DEFAULTS;
            return ((include == include3 || include == null) && (include2 == include3 || include2 == null) && cls == null && cls2 == null) ? e : new Value(include, include2, cls, cls2);
        }

        public static Value c(JsonInclude jsonInclude) {
            if (jsonInclude == null) {
                return e;
            }
            Include c = jsonInclude.c();
            Include b = jsonInclude.b();
            Include include = Include.USE_DEFAULTS;
            if (c == include && b == include) {
                return e;
            }
            Class<?> a = jsonInclude.a();
            if (a == Void.class) {
                a = null;
            }
            Class<?> e2 = jsonInclude.e();
            return new Value(c, b, a, e2 != Void.class ? e2 : null);
        }

        public Value d(Include include) {
            return include == this.b ? this : new Value(include, this.c, this.d, this.a);
        }

        public Value a(Class<?> cls) {
            Include include;
            if (cls == null || cls == Void.class) {
                include = Include.USE_DEFAULTS;
                cls = null;
            } else {
                include = Include.CUSTOM;
            }
            return a(this.b, include, this.d, cls);
        }

        public Value b(Include include) {
            return include == this.c ? this : new Value(this.b, include, this.d, this.a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(80);
            sb.append("JsonInclude.Value(value=");
            sb.append(this.b);
            sb.append(",content=");
            sb.append(this.c);
            if (this.d != null) {
                sb.append(",valueFilter=");
                sb.append(this.d.getName());
                sb.append(".class");
            }
            if (this.a != null) {
                sb.append(",contentFilter=");
                sb.append(this.a.getName());
                sb.append(".class");
            }
            sb.append(')');
            return sb.toString();
        }

        public int hashCode() {
            return (this.b.hashCode() << 2) + this.c.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                return value.b == this.b && value.c == this.c && value.d == this.d && value.a == this.a;
            }
            return false;
        }
    }
}
