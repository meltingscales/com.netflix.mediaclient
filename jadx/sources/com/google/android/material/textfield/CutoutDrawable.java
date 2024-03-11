package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class CutoutDrawable extends MaterialShapeDrawable {
    protected final RectF cutoutBounds;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CutoutDrawable create(ShapeAppearanceModel shapeAppearanceModel) {
        return new ImplApi18(shapeAppearanceModel);
    }

    private CutoutDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        super(shapeAppearanceModel == null ? new ShapeAppearanceModel() : shapeAppearanceModel);
        this.cutoutBounds = new RectF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasCutout() {
        return !this.cutoutBounds.isEmpty();
    }

    void setCutout(float f, float f2, float f3, float f4) {
        RectF rectF = this.cutoutBounds;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCutout(RectF rectF) {
        setCutout(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeCutout() {
        setCutout(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(18)
    /* loaded from: classes2.dex */
    public static class ImplApi18 extends CutoutDrawable {
        ImplApi18(ShapeAppearanceModel shapeAppearanceModel) {
            super(shapeAppearanceModel);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public void drawStrokeShape(Canvas canvas) {
            if (this.cutoutBounds.isEmpty()) {
                super.drawStrokeShape(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.cutoutBounds);
            } else {
                canvas.clipRect(this.cutoutBounds, Region.Op.DIFFERENCE);
            }
            super.drawStrokeShape(canvas);
            canvas.restore();
        }
    }
}
