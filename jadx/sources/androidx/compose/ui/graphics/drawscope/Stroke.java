package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class Stroke extends DrawStyle {
    public static final Companion Companion = new Companion(null);
    private static final int DefaultCap = StrokeCap.Companion.m1448getButtKaPHkGw();
    private static final int DefaultJoin = StrokeJoin.Companion.m1458getMiterLxFBmk8();
    private final int cap;
    private final int join;
    private final float miter;
    private final PathEffect pathEffect;
    private final float width;

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect, C8627dsp c8627dsp) {
        this(f, f2, i, i2, pathEffect);
    }

    /* renamed from: getCap-KaPHkGw  reason: not valid java name */
    public final int m1566getCapKaPHkGw() {
        return this.cap;
    }

    /* renamed from: getJoin-LxFBmk8  reason: not valid java name */
    public final int m1567getJoinLxFBmk8() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? 0.0f : f, (i3 & 2) != 0 ? 4.0f : f2, (i3 & 4) != 0 ? DefaultCap : i, (i3 & 8) != 0 ? DefaultJoin : i2, (i3 & 16) != 0 ? null : pathEffect, null);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getDefaultCap-KaPHkGw  reason: not valid java name */
        public final int m1568getDefaultCapKaPHkGw() {
            return Stroke.DefaultCap;
        }
    }

    private Stroke(float f, float f2, int i, int i2, PathEffect pathEffect) {
        super(null);
        this.width = f;
        this.miter = f2;
        this.cap = i;
        this.join = i2;
        this.pathEffect = pathEffect;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Stroke) {
            Stroke stroke = (Stroke) obj;
            return this.width == stroke.width && this.miter == stroke.miter && StrokeCap.m1444equalsimpl0(this.cap, stroke.cap) && StrokeJoin.m1453equalsimpl0(this.join, stroke.join) && C8632dsu.c(this.pathEffect, stroke.pathEffect);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.width);
        int hashCode2 = Float.hashCode(this.miter);
        int m1445hashCodeimpl = StrokeCap.m1445hashCodeimpl(this.cap);
        int m1454hashCodeimpl = StrokeJoin.m1454hashCodeimpl(this.join);
        PathEffect pathEffect = this.pathEffect;
        return (((((((hashCode * 31) + hashCode2) * 31) + m1445hashCodeimpl) * 31) + m1454hashCodeimpl) * 31) + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) StrokeCap.m1446toStringimpl(this.cap)) + ", join=" + ((Object) StrokeJoin.m1455toStringimpl(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }
}
