package kotlin.jvm.internal;

import o.InterfaceC8656dtr;
import o.InterfaceC8664dtz;
import o.dsA;
import o.dtE;

/* loaded from: classes.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements InterfaceC8664dtz {
    public MutablePropertyReference1() {
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected InterfaceC8656dtr computeReflected() {
        return dsA.b(this);
    }

    @Override // o.drM
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.dtE
    public dtE.c getGetter() {
        return ((InterfaceC8664dtz) getReflected()).getGetter();
    }
}
