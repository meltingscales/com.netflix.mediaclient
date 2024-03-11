package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dyR;
import o.dyS;

/* loaded from: classes5.dex */
public final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {
    public int a;
    public Object d;
    public /* synthetic */ Object e;

    public FlowKt__CollectionKt$toCollection$1(InterfaceC8585dra<? super FlowKt__CollectionKt$toCollection$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.a |= Integer.MIN_VALUE;
        return dyR.a((dyS) null, (Collection) null, this);
    }
}
