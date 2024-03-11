package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public abstract class AlignmentLineProvider {
    public /* synthetic */ AlignmentLineProvider(C8627dsp c8627dsp) {
        this();
    }

    public abstract int calculateAlignmentLinePosition(Placeable placeable);

    private AlignmentLineProvider() {
    }

    /* loaded from: classes.dex */
    public static final class Value extends AlignmentLineProvider {
        private final AlignmentLine alignmentLine;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && C8632dsu.c(this.alignmentLine, ((Value) obj).alignmentLine);
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }

        public Value(AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            return placeable.get(this.alignmentLine);
        }
    }
}
