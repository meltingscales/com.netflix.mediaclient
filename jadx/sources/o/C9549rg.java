package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: o.rg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9549rg extends AbstractC9560rr {
    protected final String d;

    @Override // o.AbstractC9560rr, o.AbstractC9544rb
    public String d() {
        return this.d;
    }

    public C9549rg(InterfaceC9545rc interfaceC9545rc, BeanProperty beanProperty, String str) {
        super(interfaceC9545rc, beanProperty);
        this.d = str;
    }

    @Override // o.AbstractC9544rb
    /* renamed from: d */
    public C9549rg b(BeanProperty beanProperty) {
        return this.e == beanProperty ? this : new C9549rg(this.b, beanProperty, this.d);
    }

    @Override // o.AbstractC9544rb
    public JsonTypeInfo.As a() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }
}
