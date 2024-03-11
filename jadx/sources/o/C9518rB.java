package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* renamed from: o.rB  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9518rB {
    private static final Object i = Boolean.FALSE;
    protected final JsonInclude.Value a;
    protected Object b;
    protected final SerializationConfig c;
    protected final AnnotationIntrospector d;
    protected final AbstractC9445pi e;
    protected final boolean f;

    public C9518rB(SerializationConfig serializationConfig, AbstractC9445pi abstractC9445pi) {
        this.c = serializationConfig;
        this.e = abstractC9445pi;
        JsonInclude.Value d = JsonInclude.Value.d(abstractC9445pi.b(JsonInclude.Value.a()), serializationConfig.a(abstractC9445pi.o(), JsonInclude.Value.a()));
        this.a = JsonInclude.Value.d(serializationConfig.u(), d);
        this.f = d.d() == JsonInclude.Include.NON_DEFAULT;
        this.d = serializationConfig.h();
    }

    public BeanPropertyWriter d(AbstractC9459pw abstractC9459pw, AbstractC9465qB abstractC9465qB, JavaType javaType, AbstractC9453pq<?> abstractC9453pq, AbstractC9544rb abstractC9544rb, AbstractC9544rb abstractC9544rb2, AnnotatedMember annotatedMember, boolean z) {
        JavaType javaType2;
        Object e;
        Object e2;
        Object obj;
        boolean z2;
        try {
            JavaType c = c(annotatedMember, z, javaType);
            if (abstractC9544rb2 != null) {
                if (c == null) {
                    c = javaType;
                }
                if (c.j() == null) {
                    abstractC9459pw.d(this.e, abstractC9465qB, "serialization type " + c + " has no content", new Object[0]);
                }
                JavaType d = c.d(abstractC9544rb2);
                d.j();
                javaType2 = d;
            } else {
                javaType2 = c;
            }
            JavaType javaType3 = javaType2 == null ? javaType : javaType2;
            AnnotatedMember h = abstractC9465qB.h();
            if (h == null) {
                return (BeanPropertyWriter) abstractC9459pw.d(this.e, abstractC9465qB, "could not determine property type", new Object[0]);
            }
            JsonInclude.Value b = this.c.b(javaType3.h(), h.e(), this.a).b(abstractC9465qB.d());
            JsonInclude.Include d2 = b.d();
            if (d2 == JsonInclude.Include.USE_DEFAULTS) {
                d2 = JsonInclude.Include.ALWAYS;
            }
            int i2 = AnonymousClass1.b[d2.ordinal()];
            Object obj2 = null;
            boolean z3 = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    if (javaType3.d()) {
                        e = BeanPropertyWriter.a;
                    }
                    obj = obj2;
                    z2 = z3;
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        e = abstractC9459pw.e(abstractC9465qB, b.b());
                        if (e != null) {
                            r3 = abstractC9459pw.a(e);
                        }
                    } else {
                        r3 = i2 == 5;
                        if (javaType3.x() && !this.c.c(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) {
                            e = BeanPropertyWriter.a;
                        }
                        z3 = r3;
                        obj = obj2;
                        z2 = z3;
                    }
                    obj = e;
                    z2 = r3;
                } else {
                    e = BeanPropertyWriter.a;
                }
                obj = e;
                z2 = z3;
            } else {
                if (this.f && (e2 = e()) != null) {
                    if (abstractC9459pw.a(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        annotatedMember.d(this.c.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    try {
                        obj2 = annotatedMember.d(e2);
                    } catch (Exception e3) {
                        c(e3, abstractC9465qB.a(), e2);
                    }
                } else {
                    obj2 = C9531rO.a(javaType3);
                    r3 = true;
                }
                if (obj2 != null) {
                    if (obj2.getClass().isArray()) {
                        e = C9530rN.e(obj2);
                        obj = e;
                        z2 = r3;
                    }
                    z3 = r3;
                }
                obj = obj2;
                z2 = z3;
            }
            Class<?>[] i3 = abstractC9465qB.i();
            if (i3 == null) {
                i3 = this.e.a();
            }
            BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter(abstractC9465qB, annotatedMember, this.e.n(), javaType, abstractC9453pq, abstractC9544rb, javaType2, z2, obj, i3);
            Object m = this.d.m(annotatedMember);
            if (m != null) {
                beanPropertyWriter.c(abstractC9459pw.a(annotatedMember, m));
            }
            NameTransformer f = this.d.f(annotatedMember);
            return f != null ? beanPropertyWriter.e(f) : beanPropertyWriter;
        } catch (JsonMappingException e4) {
            if (abstractC9465qB == null) {
                return (BeanPropertyWriter) abstractC9459pw.c(javaType, C9537rU.d((Throwable) e4));
            }
            return (BeanPropertyWriter) abstractC9459pw.d(this.e, abstractC9465qB, C9537rU.d((Throwable) e4), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.rB$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            b = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected JavaType c(AbstractC9509qt abstractC9509qt, boolean z, JavaType javaType) {
        JavaType a = this.d.a(this.c, abstractC9509qt, javaType);
        if (a != javaType) {
            Class<?> h = a.h();
            Class<?> h2 = javaType.h();
            if (!h.isAssignableFrom(h2) && !h2.isAssignableFrom(h)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + abstractC9509qt.d() + "': class " + h.getName() + " not a super-type of (declared) class " + h2.getName());
            }
            z = true;
            javaType = a;
        }
        JsonSerialize.Typing v = this.d.v(abstractC9509qt);
        if (v == null || v == JsonSerialize.Typing.DEFAULT_TYPING) {
            if (!z) {
                return null;
            }
        } else if (v != JsonSerialize.Typing.STATIC) {
            return null;
        }
        return javaType.I();
    }

    protected Object e() {
        Object obj = this.b;
        if (obj == null) {
            obj = this.e.b(this.c.f());
            if (obj == null) {
                obj = i;
            }
            this.b = obj;
        }
        if (obj == i) {
            return null;
        }
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object c(java.lang.Exception r2, java.lang.String r3, java.lang.Object r4) {
        /*
            r1 = this;
        L0:
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto Lb
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        Lb:
            o.C9537rU.b(r2)
            o.C9537rU.h(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Failed to get property '"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = "' of default "
            r2.append(r3)
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = " instance"
            r2.append(r3)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9518rB.c(java.lang.Exception, java.lang.String, java.lang.Object):java.lang.Object");
    }
}
