package kotlin.jvm.internal;

import o.InterfaceC8622dsk;
import o.InterfaceC8660dtv;
import o.InterfaceC8661dtw;

/* loaded from: classes5.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(InterfaceC8661dtw interfaceC8661dtw, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((InterfaceC8622dsk) interfaceC8661dtw).d(), str, str2, !(interfaceC8661dtw instanceof InterfaceC8660dtv) ? 1 : 0);
    }

    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // o.dtE
    public Object get(Object obj) {
        return getGetter().call(obj);
    }
}
