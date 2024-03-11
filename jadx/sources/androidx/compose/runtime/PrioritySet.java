package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C8576dqs;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class PrioritySet {
    private final List<Integer> list;

    public PrioritySet() {
        this(null, 1, null);
    }

    public PrioritySet(List<Integer> list) {
        this.list = list;
    }

    public /* synthetic */ PrioritySet(List list, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }

    public final void add(int i) {
        List<Integer> list;
        if (!this.list.isEmpty()) {
            if (this.list.get(0).intValue() == i) {
                return;
            }
            if (this.list.get(list.size() - 1).intValue() == i) {
                return;
            }
        }
        int size = this.list.size();
        this.list.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = this.list.get(i2).intValue();
            if (i <= intValue) {
                break;
            }
            this.list.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        this.list.set(size, Integer.valueOf(i));
    }

    public final boolean isNotEmpty() {
        return !this.list.isEmpty();
    }

    public final int peek() {
        Object y;
        y = C8576dqs.y(this.list);
        return ((Number) y).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int takeMax() {
        Object B;
        List<Integer> list;
        int intValue;
        if (this.list.size() > 0) {
            int intValue2 = this.list.get(0).intValue();
            while ((!this.list.isEmpty()) && this.list.get(0).intValue() == intValue2) {
                List<Integer> list2 = this.list;
                B = C8576dqs.B((List<? extends Object>) list2);
                list2.set(0, B);
                this.list.remove(list.size() - 1);
                int size = this.list.size();
                int size2 = this.list.size();
                int i = 0;
                while (i < (size2 >>> 1)) {
                    int intValue3 = this.list.get(i).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = this.list.get(i3).intValue();
                    if (i2 >= size || (intValue = this.list.get(i2).intValue()) <= intValue4) {
                        if (intValue4 > intValue3) {
                            this.list.set(i, Integer.valueOf(intValue4));
                            this.list.set(i3, Integer.valueOf(intValue3));
                            i = i3;
                        }
                    } else if (intValue > intValue3) {
                        this.list.set(i, Integer.valueOf(intValue));
                        this.list.set(i2, Integer.valueOf(intValue3));
                        i = i2;
                    }
                }
            }
            return intValue2;
        }
        ComposerKt.composeRuntimeError("Set is empty".toString());
        throw new KotlinNothingValueException();
    }
}
