package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import o.drM;

/* loaded from: classes.dex */
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {
    public abstract IntervalList<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    /* loaded from: classes.dex */
    public interface Interval {
        default drM<Integer, Object> getKey() {
            return null;
        }

        default drM<Integer, Object> getType() {
            return new drM() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$type$1
                public final Void invoke(int i) {
                    return null;
                }

                @Override // o.drM
                public /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            };
        }
    }

    public final Object getKey(int i) {
        Object invoke;
        IntervalList.Interval<Interval> interval = getIntervals().get(i);
        int startIndex = interval.getStartIndex();
        drM<Integer, Object> key = interval.getValue().getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i - startIndex))) == null) ? Lazy_androidKt.getDefaultLazyLayoutKey(i) : invoke;
    }

    public final Object getContentType(int i) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i);
        return interval.getValue().getType().invoke(Integer.valueOf(i - interval.getStartIndex()));
    }
}
