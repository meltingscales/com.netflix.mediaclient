package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DraggableKt$draggable$2 extends SuspendLambda implements InterfaceC8612dsa<dwU, Float, InterfaceC8585dra<? super dpR>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DraggableKt$draggable$2(InterfaceC8585dra<? super DraggableKt$draggable$2> interfaceC8585dra) {
        super(3, interfaceC8585dra);
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Object invoke(dwU dwu, Float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke(dwu, f.floatValue(), interfaceC8585dra);
    }

    public final Object invoke(dwU dwu, float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return new DraggableKt$draggable$2(interfaceC8585dra).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
