package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DraggableKt$draggable$5 extends SuspendLambda implements InterfaceC8612dsa<dwU, Velocity, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8612dsa<dwU, Float, InterfaceC8585dra<? super dpR>, Object> $onDragStopped;
    final /* synthetic */ Orientation $orientation;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableKt$draggable$5(InterfaceC8612dsa<? super dwU, ? super Float, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, Orientation orientation, InterfaceC8585dra<? super DraggableKt$draggable$5> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.$onDragStopped = interfaceC8612dsa;
        this.$orientation = orientation;
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Object invoke(dwU dwu, Velocity velocity, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return m185invokeLuvzFrg(dwu, velocity.m2593unboximpl(), interfaceC8585dra);
    }

    /* renamed from: invoke-LuvzFrg  reason: not valid java name */
    public final Object m185invokeLuvzFrg(dwU dwu, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        DraggableKt$draggable$5 draggableKt$draggable$5 = new DraggableKt$draggable$5(this.$onDragStopped, this.$orientation, interfaceC8585dra);
        draggableKt$draggable$5.L$0 = dwu;
        draggableKt$draggable$5.J$0 = j;
        return draggableKt$draggable$5.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        float m182toFloatsFctU;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            long j = this.J$0;
            InterfaceC8612dsa<dwU, Float, InterfaceC8585dra<? super dpR>, Object> interfaceC8612dsa = this.$onDragStopped;
            m182toFloatsFctU = DraggableKt.m182toFloatsFctU(j, this.$orientation);
            Float e2 = C8589dre.e(m182toFloatsFctU);
            this.label = 1;
            if (interfaceC8612dsa.invoke((dwU) this.L$0, e2, this) == e) {
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
