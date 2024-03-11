package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: o.re  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9547re extends C9551ri {
    protected final String a;

    @Override // o.AbstractC9560rr, o.AbstractC9544rb
    public String d() {
        return this.a;
    }

    public C9547re(InterfaceC9545rc interfaceC9545rc, BeanProperty beanProperty, String str) {
        super(interfaceC9545rc, beanProperty);
        this.a = str;
    }

    @Override // o.C9551ri, o.AbstractC9544rb
    /* renamed from: d */
    public C9547re b(BeanProperty beanProperty) {
        return this.e == beanProperty ? this : new C9547re(this.b, beanProperty, this.a);
    }

    @Override // o.C9551ri, o.AbstractC9544rb
    public JsonTypeInfo.As a() {
        return JsonTypeInfo.As.PROPERTY;
    }
}
