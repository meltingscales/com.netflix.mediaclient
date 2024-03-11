package kotlin.jvm.internal;

import o.InterfaceC8656dtr;
import o.dsA;
import o.dtE;

/* loaded from: classes.dex */
public abstract class PropertyReference1 extends PropertyReference implements dtE {
    public PropertyReference1() {
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected InterfaceC8656dtr computeReflected() {
        return dsA.c(this);
    }

    @Override // o.drM
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.dtE
    public dtE.c getGetter() {
        return ((dtE) getReflected()).getGetter();
    }
}
