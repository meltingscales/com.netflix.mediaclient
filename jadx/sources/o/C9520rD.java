package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;

/* renamed from: o.rD  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9520rD {
    public final boolean a;
    public final InterfaceC9327nW b;
    public final JavaType c;
    public final AbstractC9453pq<Object> d;
    public final ObjectIdGenerator<?> e;

    protected C9520rD(JavaType javaType, InterfaceC9327nW interfaceC9327nW, ObjectIdGenerator<?> objectIdGenerator, AbstractC9453pq<?> abstractC9453pq, boolean z) {
        this.c = javaType;
        this.b = interfaceC9327nW;
        this.e = objectIdGenerator;
        this.d = abstractC9453pq;
        this.a = z;
    }

    public static C9520rD a(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, boolean z) {
        String c = propertyName == null ? null : propertyName.c();
        return new C9520rD(javaType, c != null ? new SerializedString(c) : null, objectIdGenerator, null, z);
    }

    public C9520rD b(AbstractC9453pq<?> abstractC9453pq) {
        return new C9520rD(this.c, this.b, this.e, abstractC9453pq, this.a);
    }

    public C9520rD a(boolean z) {
        return z == this.a ? this : new C9520rD(this.c, this.b, this.e, this.d, z);
    }
}
