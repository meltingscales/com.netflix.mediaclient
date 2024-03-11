package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public interface VisibilityChecker<T extends VisibilityChecker<T>> {
    T a(JsonAutoDetect.Visibility visibility);

    boolean a(AnnotatedMethod annotatedMethod);

    T b(JsonAutoDetect.Visibility visibility);

    T b(JsonAutoDetect jsonAutoDetect);

    T c(JsonAutoDetect.Visibility visibility);

    T c(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility);

    boolean c(AnnotatedMethod annotatedMethod);

    T d(JsonAutoDetect.Visibility visibility);

    boolean d(AnnotatedField annotatedField);

    boolean d(AnnotatedMember annotatedMember);

    boolean d(AnnotatedMethod annotatedMethod);

    T e(JsonAutoDetect.Value value);

    T e(JsonAutoDetect.Visibility visibility);

    /* loaded from: classes5.dex */
    public static class Std implements VisibilityChecker<Std>, Serializable {
        protected static final Std a;
        private static final long serialVersionUID = 1;
        protected final JsonAutoDetect.Visibility b;
        protected final JsonAutoDetect.Visibility c;
        protected final JsonAutoDetect.Visibility d;
        protected final JsonAutoDetect.Visibility e;
        protected final JsonAutoDetect.Visibility f;

        public static Std b() {
            return a;
        }

        static {
            JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.PUBLIC_ONLY;
            JsonAutoDetect.Visibility visibility2 = JsonAutoDetect.Visibility.ANY;
            a = new Std(visibility, visibility, visibility2, visibility2, visibility);
        }

        public Std(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2, JsonAutoDetect.Visibility visibility3, JsonAutoDetect.Visibility visibility4, JsonAutoDetect.Visibility visibility5) {
            this.d = visibility;
            this.b = visibility2;
            this.f = visibility3;
            this.c = visibility4;
            this.e = visibility5;
        }

        public Std(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                Std std = a;
                this.d = std.d;
                this.b = std.b;
                this.f = std.f;
                this.c = std.c;
                visibility = std.e;
            } else {
                this.d = visibility;
                this.b = visibility;
                this.f = visibility;
                this.c = visibility;
            }
            this.e = visibility;
        }

        public static Std b(JsonAutoDetect.Value value) {
            return a.e(value);
        }

        protected Std e(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2, JsonAutoDetect.Visibility visibility3, JsonAutoDetect.Visibility visibility4, JsonAutoDetect.Visibility visibility5) {
            return (visibility == this.d && visibility2 == this.b && visibility3 == this.f && visibility4 == this.c && visibility5 == this.e) ? this : new Std(visibility, visibility2, visibility3, visibility4, visibility5);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* renamed from: d */
        public Std b(JsonAutoDetect jsonAutoDetect) {
            return jsonAutoDetect != null ? e(c(this.d, jsonAutoDetect.e()), c(this.b, jsonAutoDetect.b()), c(this.f, jsonAutoDetect.d()), c(this.c, jsonAutoDetect.a()), c(this.e, jsonAutoDetect.c())) : this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* renamed from: a */
        public Std e(JsonAutoDetect.Value value) {
            return value != null ? e(c(this.d, value.b()), c(this.b, value.a()), c(this.f, value.e()), c(this.c, value.d()), c(this.e, value.c())) : this;
        }

        private JsonAutoDetect.Visibility c(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2) {
            return visibility2 == JsonAutoDetect.Visibility.DEFAULT ? visibility : visibility2;
        }

        public Std h(JsonAutoDetect.Visibility visibility) {
            return visibility == JsonAutoDetect.Visibility.DEFAULT ? a : new Std(visibility);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* renamed from: b */
        public Std c(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
            switch (AnonymousClass3.d[propertyAccessor.ordinal()]) {
                case 1:
                    return e(visibility);
                case 2:
                    return a(visibility);
                case 3:
                    return d(visibility);
                case 4:
                    return c(visibility);
                case 5:
                    return b(visibility);
                case 6:
                    return h(visibility);
                default:
                    return this;
            }
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* renamed from: f */
        public Std e(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = a.d;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this.d == visibility2 ? this : new Std(visibility2, this.b, this.f, this.c, this.e);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* renamed from: g */
        public Std b(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = a.b;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this.b == visibility2 ? this : new Std(this.d, visibility2, this.f, this.c, this.e);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* renamed from: m */
        public Std a(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = a.f;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this.f == visibility2 ? this : new Std(this.d, this.b, visibility2, this.c, this.e);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* renamed from: j */
        public Std d(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = a.c;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this.c == visibility2 ? this : new Std(this.d, this.b, this.f, visibility2, this.e);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* renamed from: i */
        public Std c(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = a.e;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this.e == visibility2 ? this : new Std(this.d, this.b, this.f, this.c, visibility2);
        }

        public boolean c(Member member) {
            return this.c.d(member);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean d(AnnotatedMember annotatedMember) {
            return c(annotatedMember.h());
        }

        public boolean d(Field field) {
            return this.e.d(field);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean d(AnnotatedField annotatedField) {
            return d(annotatedField.b());
        }

        public boolean c(Method method) {
            return this.d.d(method);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean c(AnnotatedMethod annotatedMethod) {
            return c(annotatedMethod.b());
        }

        public boolean a(Method method) {
            return this.b.d(method);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean a(AnnotatedMethod annotatedMethod) {
            return a(annotatedMethod.b());
        }

        public boolean b(Method method) {
            return this.f.d(method);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean d(AnnotatedMethod annotatedMethod) {
            return b(annotatedMethod.b());
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", this.d, this.b, this.f, this.c, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fasterxml.jackson.databind.introspect.VisibilityChecker$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[PropertyAccessor.values().length];
            d = iArr;
            try {
                iArr[PropertyAccessor.GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[PropertyAccessor.SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[PropertyAccessor.CREATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[PropertyAccessor.FIELD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[PropertyAccessor.IS_GETTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[PropertyAccessor.ALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
