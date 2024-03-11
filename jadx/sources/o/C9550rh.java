package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: o.rh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9550rh extends AbstractC9560rr {
    public C9550rh(InterfaceC9545rc interfaceC9545rc, BeanProperty beanProperty) {
        super(interfaceC9545rc, beanProperty);
    }

    @Override // o.AbstractC9544rb
    /* renamed from: c */
    public C9550rh b(BeanProperty beanProperty) {
        return this.e == beanProperty ? this : new C9550rh(this.b, beanProperty);
    }

    @Override // o.AbstractC9544rb
    public JsonTypeInfo.As a() {
        return JsonTypeInfo.As.WRAPPER_OBJECT;
    }
}
