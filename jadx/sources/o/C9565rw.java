package o;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import java.util.Collections;
import java.util.List;

/* renamed from: o.rw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9565rw {
    private static final BeanPropertyWriter[] g = new BeanPropertyWriter[0];
    protected final AbstractC9445pi a;
    protected C9563ru b;
    protected BeanPropertyWriter[] c;
    protected Object d;
    protected SerializationConfig e;
    protected AnnotatedMember f;
    protected C9520rD h;
    protected List<BeanPropertyWriter> j = Collections.emptyList();

    public AbstractC9445pi a() {
        return this.a;
    }

    public void a(Object obj) {
        this.d = obj;
    }

    public C9563ru b() {
        return this.b;
    }

    public void b(List<BeanPropertyWriter> list) {
        this.j = list;
    }

    public Object c() {
        return this.d;
    }

    public void d(C9563ru c9563ru) {
        this.b = c9563ru;
    }

    public void e(SerializationConfig serializationConfig) {
        this.e = serializationConfig;
    }

    public void e(C9520rD c9520rD) {
        this.h = c9520rD;
    }

    public C9520rD h() {
        return this.h;
    }

    public List<BeanPropertyWriter> i() {
        return this.j;
    }

    public AnnotatedMember j() {
        return this.f;
    }

    public C9565rw(AbstractC9445pi abstractC9445pi) {
        this.a = abstractC9445pi;
    }

    public void b(BeanPropertyWriter[] beanPropertyWriterArr) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == this.j.size()) {
            this.c = beanPropertyWriterArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", Integer.valueOf(beanPropertyWriterArr.length), Integer.valueOf(this.j.size())));
    }

    public void b(AnnotatedMember annotatedMember) {
        if (this.f == null) {
            this.f = annotatedMember;
            return;
        }
        throw new IllegalArgumentException("Multiple type ids specified with " + this.f + " and " + annotatedMember);
    }

    public AbstractC9453pq<?> e() {
        BeanPropertyWriter[] beanPropertyWriterArr;
        List<BeanPropertyWriter> list = this.j;
        if (list != null && !list.isEmpty()) {
            List<BeanPropertyWriter> list2 = this.j;
            beanPropertyWriterArr = (BeanPropertyWriter[]) list2.toArray(new BeanPropertyWriter[list2.size()]);
            if (this.e.a(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                    beanPropertyWriter.b(this.e);
                }
            }
        } else if (this.b == null && this.h == null) {
            return null;
        } else {
            beanPropertyWriterArr = g;
        }
        BeanPropertyWriter[] beanPropertyWriterArr2 = this.c;
        if (beanPropertyWriterArr2 != null && beanPropertyWriterArr2.length != this.j.size()) {
            throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.j.size()), Integer.valueOf(this.c.length)));
        }
        C9563ru c9563ru = this.b;
        if (c9563ru != null) {
            c9563ru.a(this.e);
        }
        if (this.f != null && this.e.a(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.f.d(this.e.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new BeanSerializer(this.a.t(), this, beanPropertyWriterArr, this.c);
    }

    public BeanSerializer d() {
        return BeanSerializer.e(this.a.t(), this);
    }
}
