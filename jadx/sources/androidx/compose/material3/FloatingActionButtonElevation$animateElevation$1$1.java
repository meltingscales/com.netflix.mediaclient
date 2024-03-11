package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FloatingActionButtonElevation$animateElevation$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    int label;
    final /* synthetic */ FloatingActionButtonElevation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$1$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, FloatingActionButtonElevation floatingActionButtonElevation, InterfaceC8585dra<? super FloatingActionButtonElevation$animateElevation$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$animatable = floatingActionButtonElevationAnimatable;
        this.this$0 = floatingActionButtonElevation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new FloatingActionButtonElevation$animateElevation$1$1(this.$animatable, this.this$0, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FloatingActionButtonElevation$animateElevation$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        float f;
        float f2;
        float f3;
        float f4;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            f = this.this$0.defaultElevation;
            f2 = this.this$0.pressedElevation;
            f3 = this.this$0.hoveredElevation;
            f4 = this.this$0.focusedElevation;
            this.label = 1;
            if (floatingActionButtonElevationAnimatable.m789updateElevationlDy3nrA(f, f2, f3, f4, this) == e) {
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
