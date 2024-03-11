package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M  reason: not valid java name */
    public static final long m2252updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m2153getLengthimpl;
        int m2155getMinimpl = TextRange.m2155getMinimpl(j);
        int m2154getMaximpl = TextRange.m2154getMaximpl(j);
        if (TextRange.m2159intersects5zctL8(j2, j)) {
            if (TextRange.m2147contains5zctL8(j2, j)) {
                m2155getMinimpl = TextRange.m2155getMinimpl(j2);
                m2154getMaximpl = m2155getMinimpl;
            } else {
                if (TextRange.m2147contains5zctL8(j, j2)) {
                    m2153getLengthimpl = TextRange.m2153getLengthimpl(j2);
                } else if (TextRange.m2148containsimpl(j2, m2155getMinimpl)) {
                    m2155getMinimpl = TextRange.m2155getMinimpl(j2);
                    m2153getLengthimpl = TextRange.m2153getLengthimpl(j2);
                } else {
                    m2154getMaximpl = TextRange.m2155getMinimpl(j2);
                }
                m2154getMaximpl -= m2153getLengthimpl;
            }
        } else if (m2154getMaximpl > TextRange.m2155getMinimpl(j2)) {
            m2155getMinimpl -= TextRange.m2153getLengthimpl(j2);
            m2153getLengthimpl = TextRange.m2153getLengthimpl(j2);
            m2154getMaximpl -= m2153getLengthimpl;
        }
        return TextRangeKt.TextRange(m2155getMinimpl, m2154getMaximpl);
    }
}
