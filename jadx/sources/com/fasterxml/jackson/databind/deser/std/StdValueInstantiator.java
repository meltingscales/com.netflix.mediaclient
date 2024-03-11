package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class StdValueInstantiator extends ValueInstantiator implements Serializable {
    private static final long serialVersionUID = 1;
    protected JavaType a;
    protected AnnotatedWithParams b;
    protected SettableBeanProperty[] c;
    protected AnnotatedWithParams d;
    protected SettableBeanProperty[] e;
    protected AnnotatedWithParams f;
    protected AnnotatedWithParams g;
    protected SettableBeanProperty[] h;
    protected AnnotatedWithParams i;
    protected JavaType j;
    protected AnnotatedWithParams k;
    protected AnnotatedWithParams l;
    protected AnnotatedParameter m;
    protected AnnotatedWithParams n;

    /* renamed from: o  reason: collision with root package name */
    protected final Class<?> f13107o;
    protected AnnotatedWithParams s;
    protected final String t;

    public void a(AnnotatedWithParams annotatedWithParams) {
        this.k = annotatedWithParams;
    }

    public void a(AnnotatedWithParams annotatedWithParams, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr) {
        this.d = annotatedWithParams;
        this.a = javaType;
        this.e = settableBeanPropertyArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean a() {
        return this.g != null;
    }

    public void b(AnnotatedWithParams annotatedWithParams) {
        this.g = annotatedWithParams;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean b() {
        return this.s != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public JavaType c(DeserializationConfig deserializationConfig) {
        return this.j;
    }

    public void c(AnnotatedWithParams annotatedWithParams) {
        this.f = annotatedWithParams;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean c() {
        return this.l != null;
    }

    public void d(AnnotatedWithParams annotatedWithParams) {
        this.l = annotatedWithParams;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean d() {
        return this.n != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public SettableBeanProperty[] d(DeserializationConfig deserializationConfig) {
        return this.c;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public JavaType e(DeserializationConfig deserializationConfig) {
        return this.a;
    }

    public void e(AnnotatedWithParams annotatedWithParams) {
        this.n = annotatedWithParams;
    }

    public void e(AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr, AnnotatedWithParams annotatedWithParams3, SettableBeanProperty[] settableBeanPropertyArr2) {
        this.b = annotatedWithParams;
        this.i = annotatedWithParams2;
        this.j = javaType;
        this.h = settableBeanPropertyArr;
        this.s = annotatedWithParams3;
        this.c = settableBeanPropertyArr2;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean e() {
        return this.f != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean f() {
        return this.j != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean g() {
        return this.b != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean h() {
        return this.k != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean j() {
        return this.a != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Class<?> k() {
        return this.f13107o;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams l() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams m() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams n() {
        return this.b;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedParameter o() {
        return this.m;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public String r() {
        return this.t;
    }

    public StdValueInstantiator(DeserializationConfig deserializationConfig, JavaType javaType) {
        this.t = javaType == null ? "UNKNOWN TYPE" : javaType.toString();
        this.f13107o = javaType == null ? Object.class : javaType.h();
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean i() {
        return g() || f() || j() || b() || h() || c() || d() || e() || a();
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object e(DeserializationContext deserializationContext) {
        AnnotatedWithParams annotatedWithParams = this.b;
        if (annotatedWithParams == null) {
            return super.e(deserializationContext);
        }
        try {
            return annotatedWithParams.c();
        } catch (Exception e) {
            return deserializationContext.d(this.f13107o, (Object) null, c(deserializationContext, e));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object d(DeserializationContext deserializationContext, Object[] objArr) {
        AnnotatedWithParams annotatedWithParams = this.s;
        if (annotatedWithParams == null) {
            return super.d(deserializationContext, objArr);
        }
        try {
            return annotatedWithParams.c(objArr);
        } catch (Exception e) {
            return deserializationContext.d(this.f13107o, objArr, c(deserializationContext, e));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object b(DeserializationContext deserializationContext, Object obj) {
        AnnotatedWithParams annotatedWithParams;
        AnnotatedWithParams annotatedWithParams2 = this.i;
        if (annotatedWithParams2 == null && (annotatedWithParams = this.d) != null) {
            return d(annotatedWithParams, this.e, deserializationContext, obj);
        }
        return d(annotatedWithParams2, this.h, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object e(DeserializationContext deserializationContext, Object obj) {
        AnnotatedWithParams annotatedWithParams = this.d;
        if (annotatedWithParams == null && this.i != null) {
            return b(deserializationContext, obj);
        }
        return d(annotatedWithParams, this.e, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object a(DeserializationContext deserializationContext, String str) {
        AnnotatedWithParams annotatedWithParams = this.k;
        if (annotatedWithParams == null) {
            return b(deserializationContext, str);
        }
        try {
            return annotatedWithParams.c(str);
        } catch (Throwable th) {
            return deserializationContext.d(this.k.g(), str, c(deserializationContext, th));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object d(DeserializationContext deserializationContext, int i) {
        if (this.l != null) {
            Integer valueOf = Integer.valueOf(i);
            try {
                return this.l.c(valueOf);
            } catch (Throwable th) {
                return deserializationContext.d(this.l.g(), valueOf, c(deserializationContext, th));
            }
        } else if (this.n != null) {
            Long valueOf2 = Long.valueOf(i);
            try {
                return this.n.c(valueOf2);
            } catch (Throwable th2) {
                return deserializationContext.d(this.n.g(), valueOf2, c(deserializationContext, th2));
            }
        } else {
            return super.d(deserializationContext, i);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object c(DeserializationContext deserializationContext, long j) {
        if (this.n == null) {
            return super.c(deserializationContext, j);
        }
        Long valueOf = Long.valueOf(j);
        try {
            return this.n.c(valueOf);
        } catch (Throwable th) {
            return deserializationContext.d(this.n.g(), valueOf, c(deserializationContext, th));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object a(DeserializationContext deserializationContext, double d) {
        if (this.f == null) {
            return super.a(deserializationContext, d);
        }
        Double valueOf = Double.valueOf(d);
        try {
            return this.f.c(valueOf);
        } catch (Throwable th) {
            return deserializationContext.d(this.f.g(), valueOf, c(deserializationContext, th));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object c(DeserializationContext deserializationContext, boolean z) {
        if (this.g == null) {
            return super.c(deserializationContext, z);
        }
        Boolean valueOf = Boolean.valueOf(z);
        try {
            return this.g.c(valueOf);
        } catch (Throwable th) {
            return deserializationContext.d(this.g.g(), valueOf, c(deserializationContext, th));
        }
    }

    protected JsonMappingException e(DeserializationContext deserializationContext, Throwable th) {
        if (th instanceof JsonMappingException) {
            return (JsonMappingException) th;
        }
        return deserializationContext.b(k(), th);
    }

    protected JsonMappingException c(DeserializationContext deserializationContext, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        return e(deserializationContext, th);
    }

    private Object d(AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr, DeserializationContext deserializationContext, Object obj) {
        if (annotatedWithParams == null) {
            throw new IllegalStateException("No delegate constructor for " + r());
        }
        try {
            if (settableBeanPropertyArr == null) {
                return annotatedWithParams.c(obj);
            }
            int length = settableBeanPropertyArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty == null) {
                    objArr[i] = obj;
                } else {
                    objArr[i] = deserializationContext.c(settableBeanProperty.g(), settableBeanProperty, (Object) null);
                }
            }
            return annotatedWithParams.c(objArr);
        } catch (Throwable th) {
            throw c(deserializationContext, th);
        }
    }
}
