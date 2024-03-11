package o;

import java.util.ArrayList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow$collect$2;
import kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1;

/* loaded from: classes5.dex */
public abstract class dzH<T> implements dzU<T> {
    public final dqZ b;
    public final int c;
    public final BufferOverflow d;

    public abstract Object a(dyK<? super T> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    protected String c() {
        return null;
    }

    @Override // o.dyS
    public Object collect(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return a(this, dyq, interfaceC8585dra);
    }

    public final int d() {
        int i = this.c;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    protected abstract dzH<T> d(dqZ dqz, int i, BufferOverflow bufferOverflow);

    public dyS<T> e() {
        return null;
    }

    public dzH(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        this.b = dqz;
        this.c = i;
        this.d = bufferOverflow;
    }

    public final drX<dyK<? super T>, InterfaceC8585dra<? super dpR>, Object> a() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    @Override // o.dzU
    public dyS<T> a(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        dqZ plus = dqz.plus(this.b);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i2 = this.c;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            bufferOverflow = this.d;
        }
        return (C8632dsu.c(plus, this.b) && i == this.c && bufferOverflow == this.d) ? this : d(plus, i, bufferOverflow);
    }

    public dyJ<T> c(dwU dwu) {
        return dyD.d(dwu, this.b, d(), this.d, CoroutineStart.ATOMIC, null, a(), 16, null);
    }

    static /* synthetic */ <T> Object a(dzH<T> dzh, dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = dwY.b(new ChannelFlow$collect$2(dyq, dzh, null), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }

    public String toString() {
        String d;
        ArrayList arrayList = new ArrayList(4);
        String c = c();
        if (c != null) {
            arrayList.add(c);
        }
        if (this.b != EmptyCoroutineContext.e) {
            arrayList.add("context=" + this.b);
        }
        if (this.c != -3) {
            arrayList.add("capacity=" + this.c);
        }
        if (this.d != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dwW.c(this));
        sb.append('[');
        d = C8576dqs.d(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(d);
        sb.append(']');
        return sb.toString();
    }
}
