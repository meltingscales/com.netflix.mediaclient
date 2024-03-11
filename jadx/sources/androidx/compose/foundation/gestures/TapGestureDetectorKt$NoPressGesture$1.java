package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;

/* loaded from: classes.dex */
final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TapGestureDetectorKt$NoPressGesture$1(InterfaceC8585dra<? super TapGestureDetectorKt$NoPressGesture$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return m216invoked4ec7I(pressGestureScope, offset.m1146unboximpl(), interfaceC8585dra);
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final Object m216invoked4ec7I(PressGestureScope pressGestureScope, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return new TapGestureDetectorKt$NoPressGesture$1(interfaceC8585dra).invokeSuspend(dpR.c);
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
