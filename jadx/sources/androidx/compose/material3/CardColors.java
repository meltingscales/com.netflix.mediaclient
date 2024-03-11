package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class CardColors {
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ CardColors(long j, long j2, long j3, long j4, C8627dsp c8627dsp) {
        this(j, j2, j3, j4);
    }

    /* renamed from: containerColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m728containerColorvNxB06k$material3_release(boolean z) {
        return z ? this.containerColor : this.disabledContainerColor;
    }

    /* renamed from: contentColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m729contentColorvNxB06k$material3_release(boolean z) {
        return z ? this.contentColor : this.disabledContentColor;
    }

    private CardColors(long j, long j2, long j3, long j4) {
        this.containerColor = j;
        this.contentColor = j2;
        this.disabledContainerColor = j3;
        this.disabledContentColor = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CardColors)) {
            return false;
        }
        CardColors cardColors = (CardColors) obj;
        return Color.m1294equalsimpl0(this.containerColor, cardColors.containerColor) && Color.m1294equalsimpl0(this.contentColor, cardColors.contentColor) && Color.m1294equalsimpl0(this.disabledContainerColor, cardColors.disabledContainerColor) && Color.m1294equalsimpl0(this.disabledContentColor, cardColors.disabledContentColor);
    }

    public int hashCode() {
        int m1300hashCodeimpl = Color.m1300hashCodeimpl(this.containerColor);
        int m1300hashCodeimpl2 = Color.m1300hashCodeimpl(this.contentColor);
        return (((((m1300hashCodeimpl * 31) + m1300hashCodeimpl2) * 31) + Color.m1300hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m1300hashCodeimpl(this.disabledContentColor);
    }

    /* renamed from: copy-jRlVdoo  reason: not valid java name */
    public final CardColors m730copyjRlVdoo(long j, long j2, long j3, long j4) {
        Color.Companion companion = Color.Companion;
        return new CardColors(j != companion.m1309getUnspecified0d7_KjU() ? j : this.containerColor, j2 != companion.m1309getUnspecified0d7_KjU() ? j2 : this.contentColor, j3 != companion.m1309getUnspecified0d7_KjU() ? j3 : this.disabledContainerColor, j4 != companion.m1309getUnspecified0d7_KjU() ? j4 : this.disabledContentColor, null);
    }
}
