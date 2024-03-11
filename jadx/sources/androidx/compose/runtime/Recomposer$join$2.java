package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recomposer$join$2 extends SuspendLambda implements drX<Recomposer.State, InterfaceC8585dra<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recomposer$join$2(InterfaceC8585dra<? super Recomposer$join$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(interfaceC8585dra);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    @Override // o.drX
    public final Object invoke(Recomposer.State state, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        return ((Recomposer$join$2) create(state, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            return C8589dre.e(((Recomposer.State) this.L$0) == Recomposer.State.ShutDown);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
