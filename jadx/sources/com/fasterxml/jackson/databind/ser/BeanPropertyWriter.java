package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9465qB;
import o.AbstractC9523rG;
import o.AbstractC9544rb;
import o.C9488qY;
import o.C9537rU;
import o.InterfaceC9327nW;
import o.InterfaceC9458pv;
import o.InterfaceC9480qQ;
import o.InterfaceC9487qX;
import o.InterfaceC9532rP;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class BeanPropertyWriter extends PropertyWriter implements Serializable {
    public static final Object a = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected transient Method b;
    protected final JavaType d;
    protected final Class<?>[] f;
    protected final transient InterfaceC9532rP g;
    protected final JavaType h;
    public transient AbstractC9523rG i;
    protected transient Field j;
    protected transient HashMap<Object, Object> k;
    protected final AnnotatedMember l;
    protected AbstractC9453pq<Object> m;
    public JavaType n;

    /* renamed from: o  reason: collision with root package name */
    public final SerializedString f13109o;
    protected final boolean p;
    public final Object q;
    public AbstractC9544rb r;
    public AbstractC9453pq<Object> t;
    protected final PropertyName w;

    public void a(JavaType javaType) {
        this.n = javaType;
    }

    public void a(AbstractC9544rb abstractC9544rb) {
        this.r = abstractC9544rb;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JavaType d() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember e() {
        return this.l;
    }

    public boolean f() {
        return this.m != null;
    }

    public Class<?>[] g() {
        return this.f;
    }

    public JavaType h() {
        return this.d;
    }

    public AbstractC9453pq<Object> i() {
        return this.t;
    }

    public AbstractC9544rb j() {
        return this.r;
    }

    public boolean m() {
        return this.t != null;
    }

    public boolean o() {
        return this.p;
    }

    public BeanPropertyWriter(AbstractC9465qB abstractC9465qB, AnnotatedMember annotatedMember, InterfaceC9532rP interfaceC9532rP, JavaType javaType, AbstractC9453pq<?> abstractC9453pq, AbstractC9544rb abstractC9544rb, JavaType javaType2, boolean z, Object obj, Class<?>[] clsArr) {
        super(abstractC9465qB);
        this.l = annotatedMember;
        this.g = interfaceC9532rP;
        this.f13109o = new SerializedString(abstractC9465qB.a());
        this.w = abstractC9465qB.w();
        this.h = javaType;
        this.t = abstractC9453pq;
        this.i = abstractC9453pq == null ? AbstractC9523rG.c() : null;
        this.r = abstractC9544rb;
        this.d = javaType2;
        if (annotatedMember instanceof AnnotatedField) {
            this.b = null;
            this.j = (Field) annotatedMember.h();
        } else {
            if (annotatedMember instanceof AnnotatedMethod) {
                this.b = (Method) annotatedMember.h();
            } else {
                this.b = null;
            }
            this.j = null;
        }
        this.p = z;
        this.q = obj;
        this.m = null;
        this.f = clsArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BeanPropertyWriter() {
        super(PropertyMetadata.c);
        this.l = null;
        this.g = null;
        this.f13109o = null;
        this.w = null;
        this.f = null;
        this.h = null;
        this.t = null;
        this.i = null;
        this.r = null;
        this.d = null;
        this.b = null;
        this.j = null;
        this.p = false;
        this.q = null;
        this.m = null;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter) {
        this(beanPropertyWriter, beanPropertyWriter.f13109o);
    }

    protected BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, PropertyName propertyName) {
        super(beanPropertyWriter);
        this.f13109o = new SerializedString(propertyName.c());
        this.w = beanPropertyWriter.w;
        this.g = beanPropertyWriter.g;
        this.h = beanPropertyWriter.h;
        this.l = beanPropertyWriter.l;
        this.b = beanPropertyWriter.b;
        this.j = beanPropertyWriter.j;
        this.t = beanPropertyWriter.t;
        this.m = beanPropertyWriter.m;
        if (beanPropertyWriter.k != null) {
            this.k = new HashMap<>(beanPropertyWriter.k);
        }
        this.d = beanPropertyWriter.d;
        this.i = beanPropertyWriter.i;
        this.p = beanPropertyWriter.p;
        this.q = beanPropertyWriter.q;
        this.f = beanPropertyWriter.f;
        this.r = beanPropertyWriter.r;
        this.n = beanPropertyWriter.n;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, SerializedString serializedString) {
        super(beanPropertyWriter);
        this.f13109o = serializedString;
        this.w = beanPropertyWriter.w;
        this.l = beanPropertyWriter.l;
        this.g = beanPropertyWriter.g;
        this.h = beanPropertyWriter.h;
        this.b = beanPropertyWriter.b;
        this.j = beanPropertyWriter.j;
        this.t = beanPropertyWriter.t;
        this.m = beanPropertyWriter.m;
        if (beanPropertyWriter.k != null) {
            this.k = new HashMap<>(beanPropertyWriter.k);
        }
        this.d = beanPropertyWriter.d;
        this.i = beanPropertyWriter.i;
        this.p = beanPropertyWriter.p;
        this.q = beanPropertyWriter.q;
        this.f = beanPropertyWriter.f;
        this.r = beanPropertyWriter.r;
        this.n = beanPropertyWriter.n;
    }

    public BeanPropertyWriter a(NameTransformer nameTransformer) {
        String c = nameTransformer.c(this.f13109o.b());
        return c.equals(this.f13109o.toString()) ? this : e(PropertyName.b(c));
    }

    protected BeanPropertyWriter e(PropertyName propertyName) {
        return new BeanPropertyWriter(this, propertyName);
    }

    public void d(AbstractC9453pq<Object> abstractC9453pq) {
        AbstractC9453pq<Object> abstractC9453pq2 = this.t;
        if (abstractC9453pq2 != null && abstractC9453pq2 != abstractC9453pq) {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", C9537rU.d(abstractC9453pq2), C9537rU.d(abstractC9453pq)));
        }
        this.t = abstractC9453pq;
    }

    public void c(AbstractC9453pq<Object> abstractC9453pq) {
        AbstractC9453pq<Object> abstractC9453pq2 = this.m;
        if (abstractC9453pq2 != null && abstractC9453pq2 != abstractC9453pq) {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", C9537rU.d(abstractC9453pq2), C9537rU.d(abstractC9453pq)));
        }
        this.m = abstractC9453pq;
    }

    public BeanPropertyWriter e(NameTransformer nameTransformer) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer);
    }

    public void b(SerializationConfig serializationConfig) {
        this.l.d(serializationConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    Object readResolve() {
        AnnotatedMember annotatedMember = this.l;
        if (annotatedMember instanceof AnnotatedField) {
            this.b = null;
            this.j = (Field) annotatedMember.h();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this.b = (Method) annotatedMember.h();
            this.j = null;
        }
        if (this.t == null) {
            this.i = AbstractC9523rG.c();
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty, o.InterfaceC9539rW
    public String a() {
        return this.f13109o.b();
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyName b() {
        return new PropertyName(this.f13109o.b());
    }

    protected void b(ObjectNode objectNode, AbstractC9454pr abstractC9454pr) {
        objectNode.c(a(), abstractC9454pr);
    }

    public boolean b(PropertyName propertyName) {
        PropertyName propertyName2 = this.w;
        if (propertyName2 != null) {
            return propertyName2.equals(propertyName);
        }
        return propertyName.e(this.f13109o.b()) && !propertyName.d();
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void d(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Object invoke;
        Method method = this.b;
        if (method == null) {
            invoke = this.j.get(obj);
        } else {
            invoke = method.invoke(obj, null);
        }
        if (invoke == null) {
            if (this.m != null) {
                jsonGenerator.d((InterfaceC9327nW) this.f13109o);
                this.m.e(null, jsonGenerator, abstractC9459pw);
                return;
            }
            return;
        }
        AbstractC9453pq<?> abstractC9453pq = this.t;
        if (abstractC9453pq == null) {
            Class<?> cls = invoke.getClass();
            AbstractC9523rG abstractC9523rG = this.i;
            AbstractC9453pq<?> c = abstractC9523rG.c(cls);
            abstractC9453pq = c == null ? e(abstractC9523rG, cls, abstractC9459pw) : c;
        }
        Object obj2 = this.q;
        if (obj2 != null) {
            if (a == obj2) {
                if (abstractC9453pq.c(abstractC9459pw, invoke)) {
                    return;
                }
            } else if (obj2.equals(invoke)) {
                return;
            }
        }
        if (invoke == obj && b(obj, jsonGenerator, abstractC9459pw, abstractC9453pq)) {
            return;
        }
        jsonGenerator.d((InterfaceC9327nW) this.f13109o);
        AbstractC9544rb abstractC9544rb = this.r;
        if (abstractC9544rb == null) {
            abstractC9453pq.e(invoke, jsonGenerator, abstractC9459pw);
        } else {
            abstractC9453pq.c(invoke, jsonGenerator, abstractC9459pw, abstractC9544rb);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (jsonGenerator.d()) {
            return;
        }
        jsonGenerator.e(this.f13109o.b());
    }

    public void b(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Object invoke;
        Method method = this.b;
        if (method == null) {
            invoke = this.j.get(obj);
        } else {
            invoke = method.invoke(obj, null);
        }
        if (invoke == null) {
            AbstractC9453pq<Object> abstractC9453pq = this.m;
            if (abstractC9453pq != null) {
                abstractC9453pq.e(null, jsonGenerator, abstractC9459pw);
                return;
            } else {
                jsonGenerator.k();
                return;
            }
        }
        AbstractC9453pq<?> abstractC9453pq2 = this.t;
        if (abstractC9453pq2 == null) {
            Class<?> cls = invoke.getClass();
            AbstractC9523rG abstractC9523rG = this.i;
            AbstractC9453pq<?> c = abstractC9523rG.c(cls);
            abstractC9453pq2 = c == null ? e(abstractC9523rG, cls, abstractC9459pw) : c;
        }
        Object obj2 = this.q;
        if (obj2 != null) {
            if (a == obj2) {
                if (abstractC9453pq2.c(abstractC9459pw, invoke)) {
                    a(obj, jsonGenerator, abstractC9459pw);
                    return;
                }
            } else if (obj2.equals(invoke)) {
                a(obj, jsonGenerator, abstractC9459pw);
                return;
            }
        }
        if (invoke == obj && b(obj, jsonGenerator, abstractC9459pw, abstractC9453pq2)) {
            return;
        }
        AbstractC9544rb abstractC9544rb = this.r;
        if (abstractC9544rb == null) {
            abstractC9453pq2.e(invoke, jsonGenerator, abstractC9459pw);
        } else {
            abstractC9453pq2.c(invoke, jsonGenerator, abstractC9459pw, abstractC9544rb);
        }
    }

    public void a(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        AbstractC9453pq<Object> abstractC9453pq = this.m;
        if (abstractC9453pq != null) {
            abstractC9453pq.e(null, jsonGenerator, abstractC9459pw);
        } else {
            jsonGenerator.k();
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public void d(InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw) {
        if (interfaceC9480qQ != null) {
            if (q()) {
                interfaceC9480qQ.b(this);
            } else {
                interfaceC9480qQ.c(this);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    @Deprecated
    public void e(ObjectNode objectNode, AbstractC9459pw abstractC9459pw) {
        AbstractC9454pr e;
        JavaType h = h();
        Type d = h == null ? d() : h.h();
        AbstractC9453pq<Object> i = i();
        if (i == null) {
            i = abstractC9459pw.d(d(), this);
        }
        boolean q = q();
        if (i instanceof InterfaceC9487qX) {
            e = ((InterfaceC9487qX) i).a(abstractC9459pw, d, !q);
        } else {
            e = C9488qY.e();
        }
        b(objectNode, e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9453pq<Object> e(AbstractC9523rG abstractC9523rG, Class<?> cls, AbstractC9459pw abstractC9459pw) {
        AbstractC9523rG.d d;
        JavaType javaType = this.n;
        if (javaType != null) {
            d = abstractC9523rG.b(abstractC9459pw.b(javaType, cls), abstractC9459pw, this);
        } else {
            d = abstractC9523rG.d(cls, abstractC9459pw, this);
        }
        AbstractC9523rG abstractC9523rG2 = d.d;
        if (abstractC9523rG != abstractC9523rG2) {
            this.i = abstractC9523rG2;
        }
        return d.c;
    }

    public final Object b(Object obj) {
        Method method = this.b;
        if (method == null) {
            return this.j.get(obj);
        }
        return method.invoke(obj, null);
    }

    public boolean b(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9453pq<?> abstractC9453pq) {
        if (abstractC9459pw.d(SerializationFeature.FAIL_ON_SELF_REFERENCES) && !abstractC9453pq.b() && (abstractC9453pq instanceof BeanSerializerBase)) {
            abstractC9459pw.c(d(), "Direct self-reference leading to cycle");
            return false;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '");
        sb.append(a());
        sb.append("' (");
        if (this.b != null) {
            sb.append("via method ");
            sb.append(this.b.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this.b.getName());
        } else if (this.j != null) {
            sb.append("field \"");
            sb.append(this.j.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this.j.getName());
        } else {
            sb.append("virtual");
        }
        if (this.t == null) {
            sb.append(", no static serializer");
        } else {
            sb.append(", static serializer of type " + this.t.getClass().getName());
        }
        sb.append(')');
        return sb.toString();
    }
}
