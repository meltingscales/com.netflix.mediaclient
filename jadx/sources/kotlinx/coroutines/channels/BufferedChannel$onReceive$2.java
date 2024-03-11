package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C8793dyt;
import o.InterfaceC8612dsa;

/* loaded from: classes5.dex */
public final /* synthetic */ class BufferedChannel$onReceive$2 extends FunctionReferenceImpl implements InterfaceC8612dsa<C8793dyt<?>, Object, Object, Object> {
    public static final BufferedChannel$onReceive$2 a = new BufferedChannel$onReceive$2();

    BufferedChannel$onReceive$2() {
        super(3, C8793dyt.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: b */
    public final Object invoke(C8793dyt<?> c8793dyt, Object obj, Object obj2) {
        Object c;
        c = c8793dyt.c(obj, obj2);
        return c;
    }
}
