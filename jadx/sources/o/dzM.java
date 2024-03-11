package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes5.dex */
public final class dzM<T> extends dzL<T, T> {
    @Override // o.dzH
    public dyS<T> e() {
        return (dyS<T>) this.a;
    }

    public /* synthetic */ dzM(dyS dys, dqZ dqz, int i, BufferOverflow bufferOverflow, int i2, C8627dsp c8627dsp) {
        this(dys, (i2 & 2) != 0 ? EmptyCoroutineContext.e : dqz, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public dzM(dyS<? extends T> dys, dqZ dqz, int i, BufferOverflow bufferOverflow) {
        super(dys, dqz, i, bufferOverflow);
    }

    @Override // o.dzH
    protected dzH<T> d(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return new dzM(this.a, dqz, i, bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dzL
    public Object e(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object collect = this.a.collect(dyq, interfaceC8585dra);
        e = C8586drb.e();
        return collect == e ? collect : dpR.c;
    }
}
