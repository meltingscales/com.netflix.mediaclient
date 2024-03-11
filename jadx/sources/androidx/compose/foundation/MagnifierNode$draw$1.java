package androidx.compose.foundation;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
final class MagnifierNode$draw$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int label;
    final /* synthetic */ MagnifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$draw$1(MagnifierNode magnifierNode, InterfaceC8585dra<? super MagnifierNode$draw$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = magnifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new MagnifierNode$draw$1(this.this$0, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MagnifierNode$draw$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        PlatformMagnifier platformMagnifier;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            AnonymousClass1 anonymousClass1 = new drM<Long, dpR>() { // from class: androidx.compose.foundation.MagnifierNode$draw$1.1
                public final void invoke(long j) {
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Long l) {
                    invoke(l.longValue());
                    return dpR.c;
                }
            };
            this.label = 1;
            if (MonotonicFrameClockKt.withFrameMillis(anonymousClass1, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        platformMagnifier = this.this$0.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.updateContent();
        }
        return dpR.c;
    }
}
