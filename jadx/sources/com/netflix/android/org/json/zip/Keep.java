package com.netflix.android.org.json.zip;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class Keep implements None, PostMortem {
    protected int capacity;
    protected int length;
    protected int power;
    protected long[] uses;

    public abstract Object value(int i);

    public Keep(int i) {
        int i2 = JSONzip.twos[i];
        this.capacity = i2;
        this.length = 0;
        this.power = 0;
        this.uses = new long[i2];
    }

    public static long age(long j) {
        if (j >= 32) {
            return 16L;
        }
        return j / 2;
    }

    public int bitsize() {
        while (true) {
            int[] iArr = JSONzip.twos;
            int i = this.power;
            if (iArr[i] >= this.length) {
                return i;
            }
            this.power = i + 1;
        }
    }

    public void tick(int i) {
        long[] jArr = this.uses;
        jArr[i] = jArr[i] + 1;
    }
}
