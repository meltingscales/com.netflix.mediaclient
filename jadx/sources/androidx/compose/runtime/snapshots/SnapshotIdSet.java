package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.Iterator;
import o.C8564dqg;
import o.C8572dqo;
import o.C8627dsp;
import o.dsK;
import o.dtQ;
import o.dtV;

/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Integer>, dsK {
    public static final Companion Companion = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    private SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = i;
        this.belowBound = iArr;
    }

    public final boolean get(int i) {
        int i2 = i - this.lowerBound;
        if (i2 >= 0 && i2 < 64) {
            return ((1 << i2) & this.lowerSet) != 0;
        } else if (i2 >= 64 && i2 < 128) {
            return ((1 << (i2 - 64)) & this.upperSet) != 0;
        } else if (i2 > 0) {
            return false;
        } else {
            int[] iArr = this.belowBound;
            return iArr != null && SnapshotIdSetKt.binarySearch(iArr, i) >= 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
        r2 = o.C8576dqs.m(r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.snapshots.SnapshotIdSet set(int r20) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.set(int):androidx.compose.runtime.snapshots.SnapshotIdSet");
    }

    public final SnapshotIdSet clear(int i) {
        int[] iArr;
        int binarySearch;
        int i2 = this.lowerBound;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.lowerSet;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.upperSet, j2 & (~j), i2, this.belowBound);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.upperSet;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(j4 & (~j3), this.lowerSet, i2, this.belowBound);
            }
        } else if (i3 < 0 && (iArr = this.belowBound) != null && (binarySearch = SnapshotIdSetKt.binarySearch(iArr, i)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[i4];
            if (binarySearch > 0) {
                C8564dqg.c(iArr, iArr2, 0, 0, binarySearch);
            }
            if (binarySearch < i4) {
                C8564dqg.c(iArr, iArr2, binarySearch, binarySearch + 1, length);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i = snapshotIdSet.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2) {
            int[] iArr = snapshotIdSet.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet((~snapshotIdSet.upperSet) & this.upperSet, this.lowerSet & (~snapshotIdSet.lowerSet), i2, iArr2);
            }
        }
        Iterator<Integer> it = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.clear(it.next().intValue());
        }
        return snapshotIdSet3;
    }

    public final SnapshotIdSet or(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i = snapshotIdSet.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2) {
            int[] iArr = snapshotIdSet.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j = this.upperSet;
                return new SnapshotIdSet(snapshotIdSet.upperSet | j, this.lowerSet | snapshotIdSet.lowerSet, i2, iArr2);
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                snapshotIdSet = snapshotIdSet.set(it.next().intValue());
            }
            return snapshotIdSet;
        }
        Iterator<Integer> it2 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it2.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.set(it2.next().intValue());
        }
        return snapshotIdSet3;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        dtQ e;
        e = dtV.e(new SnapshotIdSet$iterator$1(this, null));
        return e.iterator();
    }

    public final int lowest(int i) {
        int lowestBitOf;
        int lowestBitOf2;
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.lowerSet;
        if (j != 0) {
            int i2 = this.lowerBound;
            lowestBitOf2 = SnapshotIdSetKt.lowestBitOf(j);
            return i2 + lowestBitOf2;
        }
        long j2 = this.upperSet;
        if (j2 != 0) {
            lowestBitOf = SnapshotIdSetKt.lowestBitOf(j2);
            return this.lowerBound + 64 + lowestBitOf;
        }
        return i;
    }

    public String toString() {
        int d;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        d = C8572dqo.d(this, 10);
        ArrayList arrayList = new ArrayList(d);
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }
}
