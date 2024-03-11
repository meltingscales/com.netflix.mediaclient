package o;

import com.netflix.hawkins.consumer.tokens.Token;

/* renamed from: o.bDp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3593bDp {
    private final float a;
    private final float c;
    private final Token.Typography d;
    private final float e;

    public /* synthetic */ C3593bDp(Token.Typography typography, float f, float f2, float f3, C8627dsp c8627dsp) {
        this(typography, f, f2, f3);
    }

    public final Token.Typography b() {
        return this.d;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.a;
    }

    public final float e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3593bDp) {
            C3593bDp c3593bDp = (C3593bDp) obj;
            return C8632dsu.c(this.d, c3593bDp.d) && androidx.compose.ui.unit.Dp.m2494equalsimpl0(this.e, c3593bDp.e) && androidx.compose.ui.unit.Dp.m2494equalsimpl0(this.c, c3593bDp.c) && androidx.compose.ui.unit.Dp.m2494equalsimpl0(this.a, c3593bDp.a);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.d.hashCode() * 31) + androidx.compose.ui.unit.Dp.m2495hashCodeimpl(this.e)) * 31) + androidx.compose.ui.unit.Dp.m2495hashCodeimpl(this.c)) * 31) + androidx.compose.ui.unit.Dp.m2495hashCodeimpl(this.a);
    }

    public String toString() {
        Token.Typography typography = this.d;
        String m2496toStringimpl = androidx.compose.ui.unit.Dp.m2496toStringimpl(this.e);
        String m2496toStringimpl2 = androidx.compose.ui.unit.Dp.m2496toStringimpl(this.c);
        String m2496toStringimpl3 = androidx.compose.ui.unit.Dp.m2496toStringimpl(this.a);
        return "FeatureEducationUiData(titleTypography=" + typography + ", titleVerticalPadding=" + m2496toStringimpl + ", horizontalPadding=" + m2496toStringimpl2 + ", listItemVerticalPadding=" + m2496toStringimpl3 + ")";
    }

    private C3593bDp(Token.Typography typography, float f, float f2, float f3) {
        C8632dsu.c((Object) typography, "");
        this.d = typography;
        this.e = f;
        this.c = f2;
        this.a = f3;
    }
}
