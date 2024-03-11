package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9451po;

/* loaded from: classes5.dex */
public abstract class TypeBase extends JavaType implements InterfaceC9451po {
    private static final TypeBindings f = TypeBindings.a();
    private static final JavaType[] i = new JavaType[0];
    private static final long serialVersionUID = 1;
    protected final JavaType[] k;
    protected final TypeBindings l;
    protected final JavaType m;

    /* renamed from: o  reason: collision with root package name */
    volatile transient String f13112o;

    @Override // com.fasterxml.jackson.databind.JavaType
    public TypeBindings a() {
        return this.l;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType n() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TypeBase(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i2, Object obj, Object obj2, boolean z) {
        super(cls, i2, obj, obj2, z);
        this.l = typeBindings == null ? f : typeBindings;
        this.m = javaType;
        this.k = javaTypeArr;
    }

    @Override // o.AbstractC9380oW
    public String e() {
        String str = this.f13112o;
        return str == null ? H() : str;
    }

    protected String H() {
        return this.d.getName();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public int b() {
        return this.l.e();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType e(int i2) {
        return this.l.c(i2);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public List<JavaType> i() {
        JavaType[] javaTypeArr = this.k;
        if (javaTypeArr == null) {
            return Collections.emptyList();
        }
        int length = javaTypeArr.length;
        if (length != 0) {
            if (length == 1) {
                return Collections.singletonList(javaTypeArr[0]);
            }
            return Arrays.asList(javaTypeArr);
        }
        return Collections.emptyList();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType c(Class<?> cls) {
        JavaType c;
        JavaType[] javaTypeArr;
        if (cls == this.d) {
            return this;
        }
        if (cls.isInterface() && (javaTypeArr = this.k) != null) {
            int length = javaTypeArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                JavaType c2 = this.k[i2].c(cls);
                if (c2 != null) {
                    return c2;
                }
            }
        }
        JavaType javaType = this.m;
        if (javaType == null || (c = javaType.c(cls)) == null) {
            return null;
        }
        return c;
    }

    @Override // o.InterfaceC9451po
    public void b(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId writableTypeId = new WritableTypeId(this, JsonToken.VALUE_STRING);
        abstractC9544rb.b(jsonGenerator, writableTypeId);
        a(jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, writableTypeId);
    }

    @Override // o.InterfaceC9451po
    public void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.i(e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static StringBuilder b(Class<?> cls, StringBuilder sb, boolean z) {
        if (!cls.isPrimitive()) {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = name.charAt(i2);
                if (charAt == '.') {
                    charAt = '/';
                }
                sb.append(charAt);
            }
            if (z) {
                sb.append(';');
            }
        } else if (cls == Boolean.TYPE) {
            sb.append('Z');
        } else if (cls == Byte.TYPE) {
            sb.append('B');
        } else if (cls == Short.TYPE) {
            sb.append('S');
        } else if (cls == Character.TYPE) {
            sb.append('C');
        } else if (cls == Integer.TYPE) {
            sb.append('I');
        } else if (cls == Long.TYPE) {
            sb.append('J');
        } else if (cls == Float.TYPE) {
            sb.append('F');
        } else if (cls == Double.TYPE) {
            sb.append('D');
        } else if (cls != Void.TYPE) {
            throw new IllegalStateException("Unrecognized primitive type: " + cls.getName());
        } else {
            sb.append('V');
        }
        return sb;
    }
}
