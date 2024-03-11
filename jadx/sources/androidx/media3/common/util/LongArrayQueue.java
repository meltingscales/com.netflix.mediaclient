package androidx.media3.common.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class LongArrayQueue {
    private long[] data;
    private int headIndex;
    private int size;
    private int tailIndex;
    private int wrapAroundMask;

    public void clear() {
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public LongArrayQueue() {
        this(16);
    }

    public LongArrayQueue(int i) {
        Assertions.checkArgument(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
        this.data = new long[i];
        this.wrapAroundMask = i - 1;
    }

    public long remove() {
        int i = this.size;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.data;
        int i2 = this.headIndex;
        long j = jArr[i2];
        this.headIndex = this.wrapAroundMask & (i2 + 1);
        this.size = i - 1;
        return j;
    }

    public long element() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        return this.data[this.headIndex];
    }
}
