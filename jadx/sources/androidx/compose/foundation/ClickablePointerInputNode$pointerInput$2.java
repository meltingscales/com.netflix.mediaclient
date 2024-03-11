package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;

/* loaded from: classes.dex */
final class ClickablePointerInputNode$pointerInput$2 extends SuspendLambda implements InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickablePointerInputNode$pointerInput$2(ClickablePointerInputNode clickablePointerInputNode, InterfaceC8585dra<? super ClickablePointerInputNode$pointerInput$2> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.this$0 = clickablePointerInputNode;
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return m133invoked4ec7I(pressGestureScope, offset.m1146unboximpl(), interfaceC8585dra);
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final Object m133invoked4ec7I(PressGestureScope pressGestureScope, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        ClickablePointerInputNode$pointerInput$2 clickablePointerInputNode$pointerInput$2 = new ClickablePointerInputNode$pointerInput$2(this.this$0, interfaceC8585dra);
        clickablePointerInputNode$pointerInput$2.L$0 = pressGestureScope;
        clickablePointerInputNode$pointerInput$2.J$0 = j;
        return clickablePointerInputNode$pointerInput$2.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
            long j = this.J$0;
            if (this.this$0.getEnabled()) {
                ClickablePointerInputNode clickablePointerInputNode = this.this$0;
                this.label = 1;
                if (clickablePointerInputNode.m98handlePressInteractiond4ec7I(pressGestureScope, j, this) == e) {
                    return e;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
