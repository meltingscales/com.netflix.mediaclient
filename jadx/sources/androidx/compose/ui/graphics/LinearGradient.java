package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, C8627dsp c8627dsp) {
        this(list, list2, j, j2, i);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j, long j2, int i) {
        this.colors = list;
        this.stops = list2;
        this.start = j;
        this.end = j2;
        this.tileMode = i;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo1271createShaderuvyYCjk(long j) {
        return ShaderKt.m1430LinearGradientShaderVjE6UOU(OffsetKt.Offset(Offset.m1137getXimpl(this.start) == Float.POSITIVE_INFINITY ? Size.m1176getWidthimpl(j) : Offset.m1137getXimpl(this.start), Offset.m1138getYimpl(this.start) == Float.POSITIVE_INFINITY ? Size.m1174getHeightimpl(j) : Offset.m1138getYimpl(this.start)), OffsetKt.Offset(Offset.m1137getXimpl(this.end) == Float.POSITIVE_INFINITY ? Size.m1176getWidthimpl(j) : Offset.m1137getXimpl(this.end), Offset.m1138getYimpl(this.end) == Float.POSITIVE_INFINITY ? Size.m1174getHeightimpl(j) : Offset.m1138getYimpl(this.end)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinearGradient) {
            LinearGradient linearGradient = (LinearGradient) obj;
            return C8632dsu.c(this.colors, linearGradient.colors) && C8632dsu.c(this.stops, linearGradient.stops) && Offset.m1134equalsimpl0(this.start, linearGradient.start) && Offset.m1134equalsimpl0(this.end, linearGradient.end) && TileMode.m1462equalsimpl0(this.tileMode, linearGradient.tileMode);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode();
        List<Float> list = this.stops;
        int hashCode2 = list != null ? list.hashCode() : 0;
        return (((((((hashCode * 31) + hashCode2) * 31) + Offset.m1139hashCodeimpl(this.start)) * 31) + Offset.m1139hashCodeimpl(this.end)) * 31) + TileMode.m1463hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m1150isFinitek4lQ0M(this.start)) {
            str = "start=" + ((Object) Offset.m1144toStringimpl(this.start)) + ", ";
        } else {
            str = "";
        }
        if (OffsetKt.m1150isFinitek4lQ0M(this.end)) {
            str2 = "end=" + ((Object) Offset.m1144toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m1464toStringimpl(this.tileMode)) + ')';
    }
}
