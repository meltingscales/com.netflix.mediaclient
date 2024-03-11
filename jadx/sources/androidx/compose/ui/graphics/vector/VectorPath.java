package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class VectorPath extends VectorNode {
    private final Brush fill;
    private final float fillAlpha;
    private final String name;
    private final List<PathNode> pathData;
    private final int pathFillType;
    private final Brush stroke;
    private final float strokeAlpha;
    private final int strokeLineCap;
    private final int strokeLineJoin;
    private final float strokeLineMiter;
    private final float strokeLineWidth;
    private final float trimPathEnd;
    private final float trimPathOffset;
    private final float trimPathStart;

    public /* synthetic */ VectorPath(String str, List list, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, C8627dsp c8627dsp) {
        this(str, list, i, brush, f, brush2, f2, f3, i2, i3, f4, f5, f6, f7);
    }

    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os  reason: not valid java name */
    public final int m1598getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw  reason: not valid java name */
    public final int m1599getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8  reason: not valid java name */
    public final int m1600getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VectorPath(String str, List<? extends PathNode> list, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i;
        this.fill = brush;
        this.fillAlpha = f;
        this.stroke = brush2;
        this.strokeAlpha = f2;
        this.strokeLineWidth = f3;
        this.strokeLineCap = i2;
        this.strokeLineJoin = i3;
        this.strokeLineMiter = f4;
        this.trimPathStart = f5;
        this.trimPathEnd = f6;
        this.trimPathOffset = f7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VectorPath.class == obj.getClass()) {
            VectorPath vectorPath = (VectorPath) obj;
            return C8632dsu.c((Object) this.name, (Object) vectorPath.name) && C8632dsu.c(this.fill, vectorPath.fill) && this.fillAlpha == vectorPath.fillAlpha && C8632dsu.c(this.stroke, vectorPath.stroke) && this.strokeAlpha == vectorPath.strokeAlpha && this.strokeLineWidth == vectorPath.strokeLineWidth && StrokeCap.m1444equalsimpl0(this.strokeLineCap, vectorPath.strokeLineCap) && StrokeJoin.m1453equalsimpl0(this.strokeLineJoin, vectorPath.strokeLineJoin) && this.strokeLineMiter == vectorPath.strokeLineMiter && this.trimPathStart == vectorPath.trimPathStart && this.trimPathEnd == vectorPath.trimPathEnd && this.trimPathOffset == vectorPath.trimPathOffset && PathFillType.m1401equalsimpl0(this.pathFillType, vectorPath.pathFillType) && C8632dsu.c(this.pathData, vectorPath.pathData);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.pathData.hashCode();
        Brush brush = this.fill;
        int hashCode3 = brush != null ? brush.hashCode() : 0;
        int hashCode4 = Float.hashCode(this.fillAlpha);
        Brush brush2 = this.stroke;
        int hashCode5 = brush2 != null ? brush2.hashCode() : 0;
        int hashCode6 = Float.hashCode(this.strokeAlpha);
        int hashCode7 = Float.hashCode(this.strokeLineWidth);
        int m1445hashCodeimpl = StrokeCap.m1445hashCodeimpl(this.strokeLineCap);
        int m1454hashCodeimpl = StrokeJoin.m1454hashCodeimpl(this.strokeLineJoin);
        int hashCode8 = Float.hashCode(this.strokeLineMiter);
        int hashCode9 = Float.hashCode(this.trimPathStart);
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + m1445hashCodeimpl) * 31) + m1454hashCodeimpl) * 31) + hashCode8) * 31) + hashCode9) * 31) + Float.hashCode(this.trimPathEnd)) * 31) + Float.hashCode(this.trimPathOffset)) * 31) + PathFillType.m1402hashCodeimpl(this.pathFillType);
    }
}
