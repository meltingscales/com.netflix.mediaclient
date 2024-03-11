package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public interface ColumnScope {
    Modifier align(Modifier modifier, Alignment.Horizontal horizontal);

    Modifier weight(Modifier modifier, float f, boolean z);

    static /* synthetic */ Modifier weight$default(ColumnScope columnScope, Modifier modifier, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return columnScope.weight(modifier, f, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }
}
