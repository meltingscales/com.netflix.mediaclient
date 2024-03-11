package o;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: o.jc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9121jc {
    private final ReentrantReadWriteLock d = new ReentrantReadWriteLock();

    public final <T> T e(drO<? extends T> dro) {
        C8632dsu.c((Object) dro, "");
        ReentrantReadWriteLock.ReadLock readLock = this.d.readLock();
        readLock.lock();
        try {
            return dro.invoke();
        } finally {
            readLock.unlock();
        }
    }

    public final <T> T d(drO<? extends T> dro) {
        C8632dsu.c((Object) dro, "");
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return dro.invoke();
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }
}
