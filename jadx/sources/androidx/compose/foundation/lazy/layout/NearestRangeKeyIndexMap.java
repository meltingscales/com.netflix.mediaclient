package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import o.C8563dqf;
import o.C8654dtp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {
    private final Object[] keys;
    private final int keysStartIndex;
    private final ObjectIntMap<Object> map;

    public NearestRangeKeyIndexMap(C8654dtp c8654dtp, LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        IntervalList<?> intervals = lazyLayoutIntervalContent.getIntervals();
        final int d = c8654dtp.d();
        if (d < 0) {
            throw new IllegalStateException("negative nearestRange.first".toString());
        }
        final int min = Math.min(c8654dtp.e(), intervals.getSize() - 1);
        if (min < d) {
            this.map = ObjectIntMapKt.emptyObjectIntMap();
            this.keys = new Object[0];
            this.keysStartIndex = 0;
            return;
        }
        int i = (min - d) + 1;
        this.keys = new Object[i];
        this.keysStartIndex = d;
        final MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(i);
        intervals.forEach(d, min, new drM<IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval>, dpR>() { // from class: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval> interval) {
                invoke2(interval);
                return dpR.c;
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
                if (r3 == null) goto L12;
             */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2(androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval> r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = r7.getValue()
                    androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval) r0
                    o.drM r0 = r0.getKey()
                    int r1 = r1
                    int r2 = r7.getStartIndex()
                    int r1 = java.lang.Math.max(r1, r2)
                    int r2 = r2
                    int r3 = r7.getStartIndex()
                    int r4 = r7.getSize()
                    int r3 = r3 + r4
                    int r3 = r3 + (-1)
                    int r2 = java.lang.Math.min(r2, r3)
                    if (r1 > r2) goto L57
                L27:
                    if (r0 == 0) goto L39
                    int r3 = r7.getStartIndex()
                    int r3 = r1 - r3
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.Object r3 = r0.invoke(r3)
                    if (r3 != 0) goto L3d
                L39:
                    java.lang.Object r3 = androidx.compose.foundation.lazy.layout.Lazy_androidKt.getDefaultLazyLayoutKey(r1)
                L3d:
                    androidx.collection.MutableObjectIntMap<java.lang.Object> r4 = r3
                    r4.set(r3, r1)
                    androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r4 = r4
                    java.lang.Object[] r4 = androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.access$getKeys$p(r4)
                    androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r5 = r4
                    int r5 = androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.access$getKeysStartIndex$p(r5)
                    int r5 = r1 - r5
                    r4[r5] = r3
                    if (r1 == r2) goto L57
                    int r1 = r1 + 1
                    goto L27
                L57:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1.invoke2(androidx.compose.foundation.lazy.layout.IntervalList$Interval):void");
            }
        });
        this.map = mutableObjectIntMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public Object getKey(int i) {
        int w;
        Object[] objArr = this.keys;
        int i2 = i - this.keysStartIndex;
        if (i2 >= 0) {
            w = C8563dqf.w(objArr);
            if (i2 <= w) {
                return objArr[i2];
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(Object obj) {
        ObjectIntMap<Object> objectIntMap = this.map;
        int findKeyIndex = objectIntMap.findKeyIndex(obj);
        if (findKeyIndex >= 0) {
            return objectIntMap.values[findKeyIndex];
        }
        return -1;
    }
}
