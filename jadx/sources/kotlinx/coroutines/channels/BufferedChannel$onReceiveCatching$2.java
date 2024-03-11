package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C8793dyt;
import o.InterfaceC8612dsa;

/* loaded from: classes5.dex */
public final /* synthetic */ class BufferedChannel$onReceiveCatching$2 extends FunctionReferenceImpl implements InterfaceC8612dsa<C8793dyt<?>, Object, Object, Object> {
    public static final BufferedChannel$onReceiveCatching$2 d = new BufferedChannel$onReceiveCatching$2();

    BufferedChannel$onReceiveCatching$2() {
        super(3, C8793dyt.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: e */
    public final Object invoke(C8793dyt<?> c8793dyt, Object obj, Object obj2) {
        Object e;
        e = c8793dyt.e(obj, obj2);
        return e;
    }
}
