package kotlin.jvm.internal;

import o.InterfaceC8656dtr;
import o.dsA;
import o.dtF;
import o.dtK;

/* loaded from: classes.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements dtF {
    public MutablePropertyReference2() {
    }

    public MutablePropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected InterfaceC8656dtr computeReflected() {
        return dsA.b(this);
    }

    @Override // o.drX
    public Object invoke(Object obj, Object obj2) {
        return c(obj, obj2);
    }

    @Override // o.dtK
    public dtK.e e() {
        return ((dtF) getReflected()).e();
    }
}
