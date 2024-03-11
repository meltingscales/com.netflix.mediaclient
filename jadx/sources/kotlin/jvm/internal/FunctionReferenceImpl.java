package kotlin.jvm.internal;

import o.InterfaceC8622dsk;
import o.InterfaceC8660dtv;
import o.InterfaceC8661dtw;

/* loaded from: classes5.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, InterfaceC8661dtw interfaceC8661dtw, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((InterfaceC8622dsk) interfaceC8661dtw).d(), str, str2, !(interfaceC8661dtw instanceof InterfaceC8660dtv) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
