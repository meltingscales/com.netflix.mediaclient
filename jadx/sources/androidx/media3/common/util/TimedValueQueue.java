package androidx.media3.common.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class TimedValueQueue<V> {
    private int first;
    private int size;
    private long[] timestamps;
    private V[] values;

    public TimedValueQueue() {
        this(10);
    }

    public TimedValueQueue(int i) {
        this.timestamps = new long[i];
        this.values = (V[]) newArray(i);
    }

    public void add(long j, V v) {
        synchronized (this) {
            clearBufferOnTimeDiscontinuity(j);
            doubleCapacityIfFull();
            addUnchecked(j, v);
        }
    }

    public void clear() {
        synchronized (this) {
            this.first = 0;
            this.size = 0;
            Arrays.fill(this.values, (Object) null);
        }
    }

    public int size() {
        int i;
        synchronized (this) {
            i = this.size;
        }
        return i;
    }

    public V pollFirst() {
        V popFirst;
        synchronized (this) {
            popFirst = this.size == 0 ? null : popFirst();
        }
        return popFirst;
    }

    public V pollFloor(long j) {
        V poll;
        synchronized (this) {
            poll = poll(j, true);
        }
        return poll;
    }

    public V poll(long j) {
        V poll;
        synchronized (this) {
            poll = poll(j, false);
        }
        return poll;
    }

    private V poll(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.size > 0) {
            long j3 = j - this.timestamps[this.first];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = popFirst();
            j2 = j3;
        }
        return v;
    }

    private V popFirst() {
        Assertions.checkState(this.size > 0);
        V[] vArr = this.values;
        int i = this.first;
        V v = vArr[i];
        vArr[i] = null;
        this.first = (i + 1) % vArr.length;
        this.size--;
        return v;
    }

    private void clearBufferOnTimeDiscontinuity(long j) {
        int i = this.size;
        if (i > 0) {
            int i2 = this.first;
            if (j <= this.timestamps[((i2 + i) - 1) % this.values.length]) {
                clear();
            }
        }
    }

    private void doubleCapacityIfFull() {
        int length = this.values.length;
        if (this.size < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) newArray(i);
        int i2 = this.first;
        int i3 = length - i2;
        System.arraycopy(this.timestamps, i2, jArr, 0, i3);
        System.arraycopy(this.values, this.first, vArr, 0, i3);
        int i4 = this.first;
        if (i4 > 0) {
            System.arraycopy(this.timestamps, 0, jArr, i3, i4);
            System.arraycopy(this.values, 0, vArr, i3, this.first);
        }
        this.timestamps = jArr;
        this.values = vArr;
        this.first = 0;
    }

    private void addUnchecked(long j, V v) {
        int i = this.first;
        int i2 = this.size;
        V[] vArr = this.values;
        int length = (i + i2) % vArr.length;
        this.timestamps[length] = j;
        vArr[length] = v;
        this.size = i2 + 1;
    }

    private static <V> V[] newArray(int i) {
        return (V[]) new Object[i];
    }
}
