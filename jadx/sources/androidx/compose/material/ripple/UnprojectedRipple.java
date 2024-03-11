package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.netflix.model.leafs.ArtworkColors;
import o.C8627dsp;
import o.C8657dts;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class UnprojectedRipple extends RippleDrawable {
    public static final Companion Companion = new Companion(null);
    private final boolean bounded;
    private boolean projected;
    private Color rippleColor;
    private Integer rippleRadius;

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    public UnprojectedRipple(boolean z) {
        super(ColorStateList.valueOf(ArtworkColors.DEFAULT_BACKGROUND_COLOR), null, z ? new ColorDrawable(-1) : null);
        this.bounded = z;
    }

    /* renamed from: setColor-DxMtmZc  reason: not valid java name */
    public final void m715setColorDxMtmZc(long j, float f) {
        long m714calculateRippleColor5vOe2sY = m714calculateRippleColor5vOe2sY(j, f);
        Color color = this.rippleColor;
        if (color != null && Color.m1294equalsimpl0(color.m1302unboximpl(), m714calculateRippleColor5vOe2sY)) {
            return;
        }
        this.rippleColor = Color.m1284boximpl(m714calculateRippleColor5vOe2sY);
        setColor(ColorStateList.valueOf(ColorKt.m1317toArgb8_81llA(m714calculateRippleColor5vOe2sY)));
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.projected = false;
        return dirtyBounds;
    }

    public final void trySetRadius(int i) {
        Integer num = this.rippleRadius;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.rippleRadius = Integer.valueOf(i);
        MRadiusHelper.INSTANCE.setRadius(this, i);
    }

    /* renamed from: calculateRippleColor-5vOe2sY  reason: not valid java name */
    private final long m714calculateRippleColor5vOe2sY(long j, float f) {
        float h;
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        h = C8657dts.h(f, 1.0f);
        return Color.m1292copywmQWz5c$default(j, h, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* loaded from: classes.dex */
    static final class MRadiusHelper {
        public static final MRadiusHelper INSTANCE = new MRadiusHelper();

        private MRadiusHelper() {
        }

        public final void setRadius(RippleDrawable rippleDrawable, int i) {
            rippleDrawable.setRadius(i);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
