package androidx.collection;

import o.C8564dqg;
import o.C8627dsp;
import o.C8632dsu;
import o.dpL;

/* loaded from: classes.dex */
public final class MutableScatterSet<E> extends ScatterSet<E> {
    private int growthLimit;

    public MutableScatterSet() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableScatterSet(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableScatterSet(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    private final void initializeStorage(int i) {
        int max = i > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i)) : 0;
        this._capacity = max;
        initializeMetadata(max);
        this.elements = new Object[max];
    }

    private final void initializeMetadata(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            C8564dqg.e(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.metadata = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final boolean add(E e) {
        int size = getSize();
        this.elements[findAbsoluteInsertIndex(e)] = e;
        return getSize() != size;
    }

    public final void plusAssign(E e) {
        this.elements[findAbsoluteInsertIndex(e)] = e;
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            C8564dqg.e(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        C8564dqg.d(this.elements, null, 0, this._capacity);
        initializeGrowth();
    }

    private final void adjustStorage() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare(dpL.b(dpL.b(this._size) * 32) ^ Long.MIN_VALUE, dpL.b(dpL.b(this._capacity) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
                return;
            }
        }
        resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
    }

    private final void resizeStorage(int i) {
        int i2;
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i3 = this._capacity;
        initializeStorage(i);
        Object[] objArr2 = this.elements;
        int i4 = 0;
        while (i4 < i3) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i5 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                long j = i5 & 127;
                long[] jArr2 = this.metadata;
                int i6 = findFirstAvailableSlot >> 3;
                int i7 = (findFirstAvailableSlot & 7) << 3;
                i2 = i4;
                jArr2[i6] = (jArr2[i6] & (~(255 << i7))) | (j << i7);
                int i8 = this._capacity;
                int i9 = ((findFirstAvailableSlot - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr2[i10] = ((~(255 << i11)) & jArr2[i10]) | (j << i11);
                objArr2[findFirstAvailableSlot] = obj;
            } else {
                i2 = i4;
            }
            i4 = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 == 0) goto Lb
            int r3 = r18.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            int r4 = r0._capacity
            int r5 = r3 >>> 7
            r5 = r5 & r4
            r6 = 0
        L19:
            long[] r7 = r0.metadata
            int r8 = r5 >> 3
            r9 = r5 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r15 = 63
            long r13 = r13 >> r15
            long r7 = r7 & r13
            long r9 = r10 >>> r9
            long r7 = r7 | r9
            r9 = r3 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r9
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            r15 = r3
            long r2 = ~r9
            long r9 = r9 - r13
            long r2 = r2 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r9
        L48:
            r13 = 0
            int r16 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r16 == 0) goto L67
            int r13 = java.lang.Long.numberOfTrailingZeros(r2)
            int r13 = r13 >> 3
            int r13 = r13 + r5
            r13 = r13 & r4
            java.lang.Object[] r14 = r0.elements
            r14 = r14[r13]
            boolean r14 = o.C8632dsu.c(r14, r1)
            if (r14 == 0) goto L61
            goto L73
        L61:
            r13 = 1
            long r13 = r2 - r13
            long r2 = r2 & r13
            goto L48
        L67:
            long r2 = ~r7
            r16 = 6
            long r2 = r2 << r16
            long r2 = r2 & r7
            long r2 = r2 & r9
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 == 0) goto L7e
            r13 = -1
        L73:
            if (r13 < 0) goto L77
            r2 = r12
            goto L78
        L77:
            r2 = 0
        L78:
            if (r2 == 0) goto L7d
            r0.removeElementAt(r13)
        L7d:
            return r2
        L7e:
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r4
            r3 = r15
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.remove(java.lang.Object):boolean");
    }

    public final void removeElementAt(int i) {
        this._size--;
        long[] jArr = this.metadata;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this._capacity;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        this.elements[i] = null;
    }

    private final int findAbsoluteInsertIndex(E e) {
        int hashCode = (e != null ? e.hashCode() : 0) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (C8632dsu.c(this.elements[numberOfTrailingZeros], e)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    findFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = findFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                jArr2[i11] = ((~(255 << i12)) & j5) | (j2 << i12);
                int i13 = this._capacity;
                int i14 = ((findFirstAvailableSlot - 7) & i13) + (i13 & 7);
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                jArr2[i15] = ((~(255 << i16)) & jArr2[i15]) | (j2 << i16);
                return findFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    private final int findFirstAvailableSlot(int i) {
        int i2 = this._capacity;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }
}
