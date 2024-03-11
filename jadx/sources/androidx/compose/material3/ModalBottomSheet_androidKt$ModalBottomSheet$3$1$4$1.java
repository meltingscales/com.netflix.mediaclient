package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.dwU;

/* loaded from: classes.dex */
final class ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1 extends SuspendLambda implements InterfaceC8612dsa<dwU, Float, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drM<Float, dpR> $settleToDismiss;
    /* synthetic */ float F$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1(drM<? super Float, dpR> drm, InterfaceC8585dra<? super ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.$settleToDismiss = drm;
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Object invoke(dwU dwu, Float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke(dwu, f.floatValue(), interfaceC8585dra);
    }

    public final Object invoke(dwU dwu, float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1 modalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1 = new ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1(this.$settleToDismiss, interfaceC8585dra);
        modalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1.F$0 = f;
        return modalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            this.$settleToDismiss.invoke(C8589dre.e(this.F$0));
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
