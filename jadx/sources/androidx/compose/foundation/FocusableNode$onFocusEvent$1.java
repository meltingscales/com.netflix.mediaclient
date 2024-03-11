package androidx.compose.foundation;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
final class FocusableNode$onFocusEvent$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int label;
    final /* synthetic */ FocusableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$onFocusEvent$1(FocusableNode focusableNode, InterfaceC8585dra<? super FocusableNode$onFocusEvent$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = focusableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new FocusableNode$onFocusEvent$1(this.this$0, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FocusableNode$onFocusEvent$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        BringIntoViewRequester bringIntoViewRequester;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            bringIntoViewRequester = this.this$0.bringIntoViewRequester;
            this.label = 1;
            if (BringIntoViewRequester.bringIntoView$default(bringIntoViewRequester, null, this, 1, null) == e) {
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
