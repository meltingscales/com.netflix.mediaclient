package kotlinx.serialization.json.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC8550dpt;
import o.InterfaceC8585dra;
import o.dEI;
import o.dFF;
import o.dpR;

/* loaded from: classes5.dex */
public final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    public Object a;
    public Object b;
    public int c;
    public Object d;
    public Object e;
    final /* synthetic */ dFF g;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(dFF dff, InterfaceC8585dra<? super JsonTreeReader$readObject$2> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.g = dff;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        this.j = obj;
        this.c |= Integer.MIN_VALUE;
        a = this.g.a((AbstractC8550dpt<dpR, dEI>) null, this);
        return a;
    }
}
