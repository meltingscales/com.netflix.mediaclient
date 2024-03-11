package androidx.compose.foundation;

import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AbstractClickablePointerInputNode$pointerInputNode$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickablePointerInputNode$pointerInputNode$1(AbstractClickablePointerInputNode abstractClickablePointerInputNode, InterfaceC8585dra<? super AbstractClickablePointerInputNode$pointerInputNode$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = abstractClickablePointerInputNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        AbstractClickablePointerInputNode$pointerInputNode$1 abstractClickablePointerInputNode$pointerInputNode$1 = new AbstractClickablePointerInputNode$pointerInputNode$1(this.this$0, interfaceC8585dra);
        abstractClickablePointerInputNode$pointerInputNode$1.L$0 = obj;
        return abstractClickablePointerInputNode$pointerInputNode$1;
    }

    @Override // o.drX
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AbstractClickablePointerInputNode$pointerInputNode$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            AbstractClickablePointerInputNode abstractClickablePointerInputNode = this.this$0;
            this.label = 1;
            if (abstractClickablePointerInputNode.pointerInput((PointerInputScope) this.L$0, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
