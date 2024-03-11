package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1;

/* loaded from: classes5.dex */
public final class dzK<T> extends dzH<T> {
    private final Iterable<dyS<T>> a;

    public /* synthetic */ dzK(Iterable iterable, dqZ dqz, int i, BufferOverflow bufferOverflow, int i2, C8627dsp c8627dsp) {
        this(iterable, (i2 & 2) != 0 ? EmptyCoroutineContext.e : dqz, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dzK(Iterable<? extends dyS<? extends T>> iterable, dqZ dqz, int i, BufferOverflow bufferOverflow) {
        super(dqz, i, bufferOverflow);
        this.a = iterable;
    }

    @Override // o.dzH
    protected dzH<T> d(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return new dzK(this.a, dqz, i, bufferOverflow);
    }

    @Override // o.dzH
    public dyJ<T> c(dwU dwu) {
        return dyD.a(dwu, this.b, this.c, a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dzH
    public Object a(dyK<? super T> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        dzZ dzz = new dzZ(dyk);
        for (dyS<T> dys : this.a) {
            C8737dwr.c(dyk, null, null, new ChannelLimitedFlowMerge$collectTo$2$1(dys, dzz, null), 3, null);
        }
        return dpR.c;
    }
}
