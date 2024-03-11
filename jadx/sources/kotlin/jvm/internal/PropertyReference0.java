package kotlin.jvm.internal;

import o.InterfaceC8656dtr;
import o.dsA;
import o.dtD;

/* loaded from: classes.dex */
public abstract class PropertyReference0 extends PropertyReference implements dtD {
    public PropertyReference0() {
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected InterfaceC8656dtr computeReflected() {
        return dsA.a(this);
    }

    @Override // o.drO
    public Object invoke() {
        return get();
    }

    @Override // o.dtD
    public dtD.b getGetter() {
        return ((dtD) getReflected()).getGetter();
    }
}
