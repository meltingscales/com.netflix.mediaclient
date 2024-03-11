package androidx.room;

import java.util.concurrent.atomic.AtomicInteger;
import o.C8627dsp;
import o.dqY;
import o.dqZ;
import o.drX;

/* loaded from: classes5.dex */
public final class TransactionElement implements dqZ.b {
    public static final Key Key = new Key(null);
    private final AtomicInteger referenceCount = new AtomicInteger(0);
    private final dqY transactionDispatcher;

    @Override // o.dqZ.b
    public dqZ.d<TransactionElement> getKey() {
        return Key;
    }

    public final dqY getTransactionDispatcher$room_ktx_release() {
        return this.transactionDispatcher;
    }

    public TransactionElement(dqY dqy) {
        this.transactionDispatcher = dqy;
    }

    @Override // o.dqZ
    public <R> R fold(R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
        return (R) dqZ.b.e.d(this, r, drx);
    }

    @Override // o.dqZ.b, o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        return (E) dqZ.b.e.b(this, dVar);
    }

    @Override // o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        return dqZ.b.e.a(this, dVar);
    }

    @Override // o.dqZ
    public dqZ plus(dqZ dqz) {
        return dqZ.b.e.d(this, dqz);
    }

    /* loaded from: classes5.dex */
    public static final class Key implements dqZ.d<TransactionElement> {
        public /* synthetic */ Key(C8627dsp c8627dsp) {
            this();
        }

        private Key() {
        }
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    public final void release() {
        if (this.referenceCount.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }
}
