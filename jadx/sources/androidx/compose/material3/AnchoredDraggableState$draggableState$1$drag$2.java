package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class AnchoredDraggableState$draggableState$1$drag$2<T> extends SuspendLambda implements InterfaceC8612dsa<AnchoredDragScope, DraggableAnchors<T>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drX<DragScope, InterfaceC8585dra<? super dpR>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, drX<? super DragScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super AnchoredDraggableState$draggableState$1$drag$2> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.this$0 = anchoredDraggableState$draggableState$1;
        this.$block = drx;
    }

    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, interfaceC8585dra).invokeSuspend(dpR.c);
    }

    @Override // o.InterfaceC8612dsa
    public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke(anchoredDragScope, (DraggableAnchors) ((DraggableAnchors) obj), interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        AnchoredDraggableState$draggableState$1$dragScope$1 anchoredDraggableState$draggableState$1$dragScope$1;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            anchoredDraggableState$draggableState$1$dragScope$1 = this.this$0.dragScope;
            drX<DragScope, InterfaceC8585dra<? super dpR>, Object> drx = this.$block;
            this.label = 1;
            if (drx.invoke(anchoredDraggableState$draggableState$1$dragScope$1, this) == e) {
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
