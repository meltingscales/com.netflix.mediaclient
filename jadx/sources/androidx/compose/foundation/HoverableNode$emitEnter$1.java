package androidx.compose.foundation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class HoverableNode$emitEnter$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HoverableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitEnter$1(HoverableNode hoverableNode, InterfaceC8585dra<? super HoverableNode$emitEnter$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.this$0 = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emitEnter(this);
    }
}
