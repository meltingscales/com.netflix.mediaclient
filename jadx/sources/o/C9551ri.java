package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: o.ri  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9551ri extends AbstractC9560rr {
    public C9551ri(InterfaceC9545rc interfaceC9545rc, BeanProperty beanProperty) {
        super(interfaceC9545rc, beanProperty);
    }

    @Override // o.AbstractC9544rb
    /* renamed from: a */
    public C9551ri b(BeanProperty beanProperty) {
        return this.e == beanProperty ? this : new C9551ri(this.b, beanProperty);
    }

    @Override // o.AbstractC9544rb
    public JsonTypeInfo.As a() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }
}
