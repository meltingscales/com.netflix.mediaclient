package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dyD;

/* loaded from: classes5.dex */
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {
    public Object a;
    public int b;
    public Object c;
    public /* synthetic */ Object e;

    public ProduceKt$awaitClose$1(InterfaceC8585dra<? super ProduceKt$awaitClose$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        return dyD.d(null, null, this);
    }
}
