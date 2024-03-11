package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
final class DraggableNode$drag$2 extends SuspendLambda implements drX<DragScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drX<AbstractDragScope, InterfaceC8585dra<? super dpR>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableNode$drag$2(DraggableNode draggableNode, drX<? super AbstractDragScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super DraggableNode$drag$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = draggableNode;
        this.$block = drx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.this$0, this.$block, interfaceC8585dra);
        draggableNode$drag$2.L$0 = obj;
        return draggableNode$drag$2;
    }

    @Override // o.drX
    public final Object invoke(DragScope dragScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DraggableNode$drag$2) create(dragScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        DraggableNode$abstractDragScope$1 draggableNode$abstractDragScope$1;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            this.this$0.setDragScope((DragScope) this.L$0);
            drX<AbstractDragScope, InterfaceC8585dra<? super dpR>, Object> drx = this.$block;
            draggableNode$abstractDragScope$1 = this.this$0.abstractDragScope;
            this.label = 1;
            if (drx.invoke(draggableNode$abstractDragScope$1, this) == e) {
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
