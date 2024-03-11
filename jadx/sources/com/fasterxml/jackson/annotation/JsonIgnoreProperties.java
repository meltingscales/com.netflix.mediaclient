package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonIgnoreProperties {
    boolean a() default false;

    boolean b() default false;

    String[] c() default {};

    boolean d() default false;

    /* loaded from: classes5.dex */
    public static class Value implements Serializable {
        protected static final Value d = new Value(Collections.emptySet(), false, false, false, true);
        private static final long serialVersionUID = 1;
        protected final boolean a;
        protected final boolean b;
        protected final Set<String> c;
        protected final boolean e;
        protected final boolean f;

        public static Value a() {
            return d;
        }

        public boolean e() {
            return this.b;
        }

        protected Value(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            this.c = set == null ? Collections.emptySet() : set;
            this.b = z;
            this.e = z2;
            this.a = z3;
            this.f = z4;
        }

        public static Value d(JsonIgnoreProperties jsonIgnoreProperties) {
            return jsonIgnoreProperties == null ? d : e(e(jsonIgnoreProperties.c()), jsonIgnoreProperties.d(), jsonIgnoreProperties.a(), jsonIgnoreProperties.b(), false);
        }

        public static Value e(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            return a(set, z, z2, z3, z4) ? d : new Value(set, z, z2, z3, z4);
        }

        public static Value b(Value value, Value value2) {
            return value == null ? value2 : value.a(value2);
        }

        public Value a(Value value) {
            if (value == null || value == d) {
                return this;
            }
            if (value.f) {
                if (a(this, value)) {
                    return this;
                }
                Set<String> c = c(this.c, value.c);
                boolean z = false;
                boolean z2 = this.b || value.b;
                boolean z3 = this.e || value.e;
                if (this.a || value.a) {
                    z = true;
                }
                return e(c, z2, z3, z, true);
            }
            return value;
        }

        protected Object readResolve() {
            return a(this.c, this.b, this.e, this.a, this.f) ? d : this;
        }

        public Set<String> b() {
            return this.e ? Collections.emptySet() : this.c;
        }

        public Set<String> d() {
            return this.a ? Collections.emptySet() : this.c;
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.c, Boolean.valueOf(this.b), Boolean.valueOf(this.e), Boolean.valueOf(this.a), Boolean.valueOf(this.f));
        }

        public int hashCode() {
            int size = this.c.size();
            int i = this.b ? 1 : -3;
            int i2 = this.e ? 3 : -7;
            return size + i + i2 + (this.a ? 7 : -11) + (this.f ? 11 : -13);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            return obj.getClass() == getClass() && a(this, (Value) obj);
        }

        private static boolean a(Value value, Value value2) {
            return value.b == value2.b && value.f == value2.f && value.e == value2.e && value.a == value2.a && value.c.equals(value2.c);
        }

        private static Set<String> e(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.emptySet();
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String str : strArr) {
                hashSet.add(str);
            }
            return hashSet;
        }

        private static Set<String> c(Set<String> set, Set<String> set2) {
            if (set.isEmpty()) {
                return set2;
            }
            if (set2.isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet(set.size() + set2.size());
            hashSet.addAll(set);
            hashSet.addAll(set2);
            return hashSet;
        }

        private static boolean a(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            Value value = d;
            return z == value.b && z2 == value.e && z3 == value.a && z4 == value.f && (set == null || set.size() == 0);
        }
    }
}
