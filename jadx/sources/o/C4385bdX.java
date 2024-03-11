package o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.media3.common.text.Cue;
import androidx.media3.ui.CanvasSubtitleOutput;
import androidx.media3.ui.SubtitlePainter;
import java.util.List;

/* renamed from: o.bdX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4385bdX extends CanvasSubtitleOutput {
    private ViewGroup a;
    private boolean b;
    private ViewGroup c;

    public void setHDR10ColorOverride(boolean z) {
        this.b = z;
    }

    public void setSubtitleDisplayArea(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.a = viewGroup2;
        this.c = viewGroup;
    }

    public C4385bdX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected float b(int i, float f) {
        int min;
        int top = getTop();
        int bottom = getBottom();
        int left = getLeft() + getPaddingLeft();
        int paddingTop = getPaddingTop() + top;
        int right = getRight() + getPaddingRight();
        int paddingBottom = bottom - getPaddingBottom();
        if (paddingBottom <= paddingTop || right <= left) {
            return 0.0f;
        }
        if (i == 2) {
            return f;
        }
        if (i == 0) {
            min = Math.min(paddingBottom - paddingTop, right - left);
        } else {
            min = Math.min(bottom - top, getRight() - getLeft());
        }
        return f * min;
    }

    @Override // androidx.media3.ui.CanvasSubtitleOutput, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int size;
        int i;
        int i2;
        List<Cue> list;
        int i3;
        List<Cue> list2 = this.cues;
        if (list2.isEmpty()) {
            return;
        }
        float b = b(this.textSizeType, this.textSize);
        if (b > 0.0f && (size = list2.size()) != 0) {
            int left = getLeft() + getPaddingLeft();
            int top = getTop() + getPaddingTop();
            int right = getRight() - getPaddingRight();
            int bottom = getBottom() - getPaddingBottom();
            int d = d(bottom);
            int i4 = 0;
            int i5 = d;
            while (i4 < size) {
                Cue cue = list2.get(i4);
                C4456bep c4456bep = (C4456bep) this.painters.get(i4);
                if (cue.bitmap == null) {
                    if (i5 < d) {
                        cue = c(cue).setLine((i5 - top) / (d - top), cue.lineType).setLineAnchor(2).build();
                    }
                    i = i4;
                    i2 = d;
                    list = list2;
                    i3 = bottom;
                    drawWithPainter(c4456bep, cue, this.style, b, 0.0f, this.bottomPaddingFraction, canvas, left, top, right, i2);
                    i5 = c4456bep.b();
                } else {
                    i = i4;
                    i2 = d;
                    list = list2;
                    i3 = bottom;
                    drawWithPainter(c4456bep, c(cue).setLine((i2 * cue.line) / i3, cue.lineType).build(), this.style, b, 0.0f, this.bottomPaddingFraction, canvas, left, top, right, i3);
                    i5 = i5;
                }
                i4 = i + 1;
                bottom = i3;
                d = i2;
                list2 = list;
            }
        }
    }

    private static Cue.Builder c(Cue cue) {
        Cue.Builder textAlignment = new Cue.Builder().setBitmap(cue.bitmap).setText(cue.text).setPosition(cue.position).setPositionAnchor(cue.positionAnchor).setLineAnchor(cue.lineAnchor).setSize(cue.size).setBitmapHeight(cue.bitmapHeight).setLine(cue.line, cue.lineType).setVerticalType(cue.verticalType).setTextAlignment(cue.textAlignment);
        if (cue.windowColorSet) {
            textAlignment.setWindowColor(cue.windowColor);
        } else {
            textAlignment.clearWindowColor();
        }
        return textAlignment;
    }

    private int d(int i) {
        ViewGroup viewGroup;
        return (this.a.getHeight() == 0 || (viewGroup = this.c) == null) ? i : (i * viewGroup.getHeight()) / this.a.getHeight();
    }

    @Override // androidx.media3.ui.CanvasSubtitleOutput
    public SubtitlePainter createSubtitlePainter(Context context) {
        if (this.b) {
            return new C4445bee(context);
        }
        return new C4456bep(context);
    }
}
