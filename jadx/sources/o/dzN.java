package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;

/* loaded from: classes5.dex */
public final class dzN<T, R> extends dzL<T, R> {
    private final InterfaceC8612dsa<dyQ<? super R>, T, InterfaceC8585dra<? super dpR>, Object> e;

    public static final /* synthetic */ InterfaceC8612dsa b(dzN dzn) {
        return dzn.e;
    }

    public /* synthetic */ dzN(InterfaceC8612dsa interfaceC8612dsa, dyS dys, dqZ dqz, int i, BufferOverflow bufferOverflow, int i2, C8627dsp c8627dsp) {
        this(interfaceC8612dsa, dys, (i2 & 4) != 0 ? EmptyCoroutineContext.e : dqz, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dzN(InterfaceC8612dsa<? super dyQ<? super R>, ? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, dyS<? extends T> dys, dqZ dqz, int i, BufferOverflow bufferOverflow) {
        super(dys, dqz, i, bufferOverflow);
        this.e = interfaceC8612dsa;
    }

    @Override // o.dzH
    protected dzH<R> d(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return new dzN(this.e, this.a, dqz, i, bufferOverflow);
    }

    @Override // o.dzL
    public Object e(dyQ<? super R> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = dwY.b(new ChannelFlowTransformLatest$flowCollect$3(this, dyq, null), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }
}
