package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8821dzu;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class StateFlowImpl$collect$1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    final /* synthetic */ C8821dzu<T> f;
    public int g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(C8821dzu<T> c8821dzu, InterfaceC8585dra<? super StateFlowImpl$collect$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.f = c8821dzu;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
