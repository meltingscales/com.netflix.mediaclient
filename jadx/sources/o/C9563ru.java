package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.util.Map;

/* renamed from: o.ru  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9563ru {
    protected AbstractC9453pq<Object> b;
    protected final BeanProperty c;
    protected MapSerializer d;
    protected final AnnotatedMember e;

    public C9563ru(BeanProperty beanProperty, AnnotatedMember annotatedMember, AbstractC9453pq<?> abstractC9453pq) {
        this.e = annotatedMember;
        this.c = beanProperty;
        this.b = abstractC9453pq;
        if (abstractC9453pq instanceof MapSerializer) {
            this.d = (MapSerializer) abstractC9453pq;
        }
    }

    public void a(SerializationConfig serializationConfig) {
        this.e.d(serializationConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public void b(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Object d = this.e.d(obj);
        if (d == null) {
            return;
        }
        if (!(d instanceof Map)) {
            abstractC9459pw.c(this.c.d(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", this.e.d(), d.getClass().getName()));
        }
        MapSerializer mapSerializer = this.d;
        if (mapSerializer != null) {
            mapSerializer.b((Map) d, jsonGenerator, abstractC9459pw);
        } else {
            this.b.e(d, jsonGenerator, abstractC9459pw);
        }
    }

    public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, InterfaceC9567ry interfaceC9567ry) {
        Object d = this.e.d(obj);
        if (d == null) {
            return;
        }
        if (!(d instanceof Map)) {
            abstractC9459pw.c(this.c.d(), String.format("Value returned by 'any-getter' (%s()) not java.util.Map but %s", this.e.d(), d.getClass().getName()));
        }
        MapSerializer mapSerializer = this.d;
        if (mapSerializer != null) {
            mapSerializer.b(abstractC9459pw, jsonGenerator, obj, (Map) d, interfaceC9567ry, null);
        } else {
            this.b.e(d, jsonGenerator, abstractC9459pw);
        }
    }

    public void c(AbstractC9459pw abstractC9459pw) {
        AbstractC9453pq<?> abstractC9453pq = this.b;
        if (abstractC9453pq instanceof InterfaceC9562rt) {
            AbstractC9453pq<?> d = abstractC9459pw.d(abstractC9453pq, this.c);
            this.b = d;
            if (d instanceof MapSerializer) {
                this.d = (MapSerializer) d;
            }
        }
    }
}
