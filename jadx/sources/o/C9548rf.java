package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: o.rf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9548rf extends C9547re {
    public C9548rf(InterfaceC9545rc interfaceC9545rc, BeanProperty beanProperty, String str) {
        super(interfaceC9545rc, beanProperty, str);
    }

    @Override // o.C9547re
    /* renamed from: e */
    public C9548rf d(BeanProperty beanProperty) {
        return this.e == beanProperty ? this : new C9548rf(this.b, beanProperty, this.a);
    }

    @Override // o.C9547re, o.C9551ri, o.AbstractC9544rb
    public JsonTypeInfo.As a() {
        return JsonTypeInfo.As.EXISTING_PROPERTY;
    }
}
