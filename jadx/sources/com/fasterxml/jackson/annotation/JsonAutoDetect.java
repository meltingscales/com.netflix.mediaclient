package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonAutoDetect {
    Visibility a() default Visibility.DEFAULT;

    Visibility b() default Visibility.DEFAULT;

    Visibility c() default Visibility.DEFAULT;

    Visibility d() default Visibility.DEFAULT;

    Visibility e() default Visibility.DEFAULT;

    /* loaded from: classes5.dex */
    public enum Visibility {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean d(Member member) {
            int i = AnonymousClass3.c[ordinal()];
            if (i != 1) {
                if (i == 3) {
                    return !Modifier.isPrivate(member.getModifiers());
                }
                if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                } else if (Modifier.isProtected(member.getModifiers())) {
                    return true;
                }
                return Modifier.isPublic(member.getModifiers());
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public static class Value implements Serializable {
        protected static final Value c;
        protected static final Value d;
        private static final Visibility j;
        private static final long serialVersionUID = 1;
        protected final Visibility a;
        protected final Visibility b;
        protected final Visibility e;
        protected final Visibility g;
        protected final Visibility h;

        public Visibility a() {
            return this.g;
        }

        public Visibility b() {
            return this.e;
        }

        public Visibility c() {
            return this.b;
        }

        public Visibility d() {
            return this.a;
        }

        public Visibility e() {
            return this.h;
        }

        static {
            Visibility visibility = Visibility.PUBLIC_ONLY;
            j = visibility;
            d = new Value(visibility, visibility, visibility, Visibility.ANY, visibility);
            Visibility visibility2 = Visibility.DEFAULT;
            c = new Value(visibility2, visibility2, visibility2, visibility2, visibility2);
        }

        private Value(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            this.b = visibility;
            this.e = visibility2;
            this.g = visibility3;
            this.h = visibility4;
            this.a = visibility5;
        }

        protected Object readResolve() {
            Value e = e(this.b, this.e, this.g, this.h, this.a);
            return e == null ? this : e;
        }

        public String toString() {
            return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", this.b, this.e, this.g, this.h, this.a);
        }

        public int hashCode() {
            return ((this.b.ordinal() + 1) ^ (((this.e.ordinal() * 3) - (this.g.ordinal() * 7)) + (this.h.ordinal() * 11))) ^ (this.a.ordinal() * 13);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            return obj.getClass() == getClass() && c(this, (Value) obj);
        }

        private static Value e(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            if (visibility == j) {
                Value value = d;
                if (visibility2 == value.e && visibility3 == value.g && visibility4 == value.h && visibility5 == value.a) {
                    return value;
                }
                return null;
            }
            Visibility visibility6 = Visibility.DEFAULT;
            if (visibility == visibility6 && visibility2 == visibility6 && visibility3 == visibility6 && visibility4 == visibility6 && visibility5 == visibility6) {
                return c;
            }
            return null;
        }

        private static boolean c(Value value, Value value2) {
            return value.b == value2.b && value.e == value2.e && value.g == value2.g && value.h == value2.h && value.a == value2.a;
        }
    }

    /* renamed from: com.fasterxml.jackson.annotation.JsonAutoDetect$3  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[PropertyAccessor.values().length];
            e = iArr;
            try {
                iArr[PropertyAccessor.CREATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[PropertyAccessor.FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[PropertyAccessor.GETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[PropertyAccessor.IS_GETTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[PropertyAccessor.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[PropertyAccessor.SETTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[PropertyAccessor.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[Visibility.values().length];
            c = iArr2;
            try {
                iArr2[Visibility.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[Visibility.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[Visibility.NON_PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[Visibility.PROTECTED_AND_PUBLIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[Visibility.PUBLIC_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }
}
