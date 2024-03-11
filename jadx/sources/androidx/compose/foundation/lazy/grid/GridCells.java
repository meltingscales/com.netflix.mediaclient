package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Density;
import java.util.List;

/* loaded from: classes.dex */
public interface GridCells {
    List<Integer> calculateCrossAxisCellSizes(Density density, int i, int i2);

    /* loaded from: classes.dex */
    public static final class Fixed implements GridCells {
        private final int count;

        public int hashCode() {
            return -this.count;
        }

        public Fixed(int i) {
            this.count = i;
            if (i > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided count " + i + " should be larger than zero").toString());
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i, int i2) {
            List<Integer> calculateCellsCrossAxisSizeImpl;
            calculateCellsCrossAxisSizeImpl = LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i, this.count, i2);
            return calculateCellsCrossAxisSizeImpl;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Fixed) && this.count == ((Fixed) obj).count;
        }
    }
}
