package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes.dex */
final class SdkStubsFallbackFrameClock$withFrameNanos$2<R> extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super R>, Object> {
    final /* synthetic */ drM<Long, R> $onFrame;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(drM<? super Long, ? extends R> drm, InterfaceC8585dra<? super SdkStubsFallbackFrameClock$withFrameNanos$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$onFrame = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.$onFrame, interfaceC8585dra);
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(dwU dwu, Object obj) {
        return invoke(dwu, (InterfaceC8585dra) ((InterfaceC8585dra) obj));
    }

    public final Object invoke(dwU dwu, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            this.label = 1;
            if (C8749dxc.b(16L, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return this.$onFrame.invoke(C8589dre.b(System.nanoTime()));
    }
}
