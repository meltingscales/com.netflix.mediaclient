package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes5.dex */
public final class StartedWhileSubscribed$command$2 extends SuspendLambda implements drX<SharingCommand, InterfaceC8585dra<? super Boolean>, Object> {
    /* synthetic */ Object a;
    int b;

    public StartedWhileSubscribed$command$2(InterfaceC8585dra<? super StartedWhileSubscribed$command$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(interfaceC8585dra);
        startedWhileSubscribed$command$2.a = obj;
        return startedWhileSubscribed$command$2;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(SharingCommand sharingCommand, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        return ((StartedWhileSubscribed$command$2) create(sharingCommand, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            return C8589dre.e(((SharingCommand) this.a) != SharingCommand.START);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
