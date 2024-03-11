package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8797dyx;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyI;

/* loaded from: classes5.dex */
public final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C8797dyx<? extends dpR>>, Object> {
    final /* synthetic */ E a;
    final /* synthetic */ dyI<E> c;
    int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(dyI<? super E> dyi, E e, InterfaceC8585dra<? super ChannelsKt__ChannelsKt$trySendBlocking$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = dyi;
        this.a = e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.c, this.a, interfaceC8585dra);
        channelsKt__ChannelsKt$trySendBlocking$2.e = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C8797dyx<dpR>> interfaceC8585dra) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object e2;
        e = C8586drb.e();
        int i = this.d;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                dwU dwu = (dwU) this.e;
                dyI<E> dyi = this.c;
                E e3 = this.a;
                Result.c cVar = Result.e;
                this.d = 1;
                if (dyi.a(e3, this) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            e2 = Result.e(dpR.c);
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e2 = Result.e(C8556dpz.a(th));
        }
        return C8797dyx.a(Result.h(e2) ? C8797dyx.b.d(dpR.c) : C8797dyx.b.a(Result.d(e2)));
    }
}
