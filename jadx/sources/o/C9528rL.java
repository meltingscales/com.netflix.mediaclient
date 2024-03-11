package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: o.rL  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9528rL extends AbstractC9453pq<Object> implements InterfaceC9562rt {
    protected final AbstractC9544rb c;
    protected final AbstractC9453pq<Object> e;

    public AbstractC9544rb a() {
        return this.c;
    }

    @Override // o.AbstractC9453pq
    public Class<Object> c() {
        return Object.class;
    }

    public C9528rL(AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq) {
        this.c = abstractC9544rb;
        this.e = abstractC9453pq;
    }

    @Override // o.AbstractC9453pq
    public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        this.e.c(obj, jsonGenerator, abstractC9459pw, this.c);
    }

    @Override // o.AbstractC9453pq
    public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        this.e.c(obj, jsonGenerator, abstractC9459pw, abstractC9544rb);
    }

    @Override // o.InterfaceC9562rt
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        AbstractC9453pq<?> abstractC9453pq = this.e;
        if (abstractC9453pq instanceof InterfaceC9562rt) {
            abstractC9453pq = abstractC9459pw.a(abstractC9453pq, beanProperty);
        }
        return abstractC9453pq == this.e ? this : new C9528rL(this.c, abstractC9453pq);
    }
}
