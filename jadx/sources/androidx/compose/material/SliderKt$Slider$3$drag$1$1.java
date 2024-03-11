package androidx.compose.material;

import androidx.compose.runtime.State;
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
final class SliderKt$Slider$3$drag$1$1 extends SuspendLambda implements InterfaceC8612dsa<dwU, Float, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ State<drM<Float, dpR>> $gestureEndAction;
    /* synthetic */ float F$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3$drag$1$1(State<? extends drM<? super Float, dpR>> state, InterfaceC8585dra<? super SliderKt$Slider$3$drag$1$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.$gestureEndAction = state;
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Object invoke(dwU dwu, Float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke(dwu, f.floatValue(), interfaceC8585dra);
    }

    public final Object invoke(dwU dwu, float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        SliderKt$Slider$3$drag$1$1 sliderKt$Slider$3$drag$1$1 = new SliderKt$Slider$3$drag$1$1(this.$gestureEndAction, interfaceC8585dra);
        sliderKt$Slider$3$drag$1$1.F$0 = f;
        return sliderKt$Slider$3$drag$1$1.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            this.$gestureEndAction.getValue().invoke(C8589dre.e(this.F$0));
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
