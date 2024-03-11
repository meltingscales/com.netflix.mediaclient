package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: o.rr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9560rr extends AbstractC9544rb {
    protected final InterfaceC9545rc b;
    protected final BeanProperty e;

    @Override // o.AbstractC9544rb
    public String d() {
        return null;
    }

    protected void d(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9560rr(InterfaceC9545rc interfaceC9545rc, BeanProperty beanProperty) {
        this.b = interfaceC9545rc;
        this.e = beanProperty;
    }

    @Override // o.AbstractC9544rb
    public WritableTypeId b(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
        e(writableTypeId);
        return jsonGenerator.c(writableTypeId);
    }

    @Override // o.AbstractC9544rb
    public WritableTypeId c(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
        return jsonGenerator.b(writableTypeId);
    }

    protected void e(WritableTypeId writableTypeId) {
        String b;
        if (writableTypeId.e == null) {
            Object obj = writableTypeId.b;
            Class<?> cls = writableTypeId.c;
            if (cls == null) {
                b = a(obj);
            } else {
                b = b(obj, cls);
            }
            writableTypeId.e = b;
        }
    }

    protected String a(Object obj) {
        String c = this.b.c(obj);
        if (c == null) {
            d(obj);
        }
        return c;
    }

    protected String b(Object obj, Class<?> cls) {
        String e = this.b.e(obj, cls);
        if (e == null) {
            d(obj);
        }
        return e;
    }
}
