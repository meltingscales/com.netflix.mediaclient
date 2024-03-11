package o;

import kotlinx.coroutines.channels.BufferOverflow;

/* renamed from: o.dzs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C8819dzs<T> {
    public final dqZ a;
    public final BufferOverflow b;
    public final dyS<T> c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public C8819dzs(dyS<? extends T> dys, int i, BufferOverflow bufferOverflow, dqZ dqz) {
        this.c = dys;
        this.d = i;
        this.b = bufferOverflow;
        this.a = dqz;
    }
}
