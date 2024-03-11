package com.netflix.android.widgetry.widget.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.netflix.model.leafs.ArtworkColors;
import o.C9834xU;
import o.C9870yD;

/* loaded from: classes2.dex */
public class BadgeView extends AppCompatTextView {
    private int a;
    private Paint b;
    private final int c;
    private final int d;
    private int e;
    private RectF f;
    private RectF g;
    private DisplayType h;
    private Drawable i;
    private Paint j;
    private int k;
    private RectF l;
    private boolean m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f13125o;
    private RectF r;
    private boolean t;

    /* loaded from: classes2.dex */
    public enum DisplayType {
        TEXT,
        PROGRESS,
        DRAWABLE
    }

    public void setPaused(boolean z) {
        this.m = z;
    }

    public BadgeView(Context context) {
        super(context);
        int b = C9870yD.b(getContext(), 2);
        this.c = b;
        this.d = b + 1;
        this.h = null;
        this.t = false;
        this.b = new Paint();
        this.j = new Paint();
        this.r = new RectF();
        this.g = new RectF();
        this.l = new RectF();
        this.f = new RectF();
        this.e = ArtworkColors.DEFAULT_BACKGROUND_COLOR;
        e(null, 0);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int b = C9870yD.b(getContext(), 2);
        this.c = b;
        this.d = b + 1;
        this.h = null;
        this.t = false;
        this.b = new Paint();
        this.j = new Paint();
        this.r = new RectF();
        this.g = new RectF();
        this.l = new RectF();
        this.f = new RectF();
        this.e = ArtworkColors.DEFAULT_BACKGROUND_COLOR;
        e(attributeSet, 0);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int b = C9870yD.b(getContext(), 2);
        this.c = b;
        this.d = b + 1;
        this.h = null;
        this.t = false;
        this.b = new Paint();
        this.j = new Paint();
        this.r = new RectF();
        this.g = new RectF();
        this.l = new RectF();
        this.f = new RectF();
        this.e = ArtworkColors.DEFAULT_BACKGROUND_COLOR;
        e(attributeSet, i);
    }

    public void e(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9834xU.n.c, i, 0);
            if (obtainStyledAttributes.hasValue(C9834xU.n.e)) {
                this.e = obtainStyledAttributes.getColor(C9834xU.n.e, this.e);
            }
            obtainStyledAttributes.recycle();
        }
        this.b.setColor(-16776961);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setAntiAlias(true);
        this.j.setColor(this.e);
        this.j.setAntiAlias(true);
        this.j.setStyle(Paint.Style.STROKE);
        int b = C9870yD.b(getContext(), 1);
        this.j.setStrokeWidth(b);
        this.a = b / 2;
        int b2 = C9870yD.b(getContext(), 2);
        this.f13125o = b2;
        this.n = b2 / 2;
        setGravity(17);
        setMinLines(1);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth < measuredHeight) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.h == DisplayType.DRAWABLE) {
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        } else if (this.t) {
            float centerX = this.r.centerX();
            float centerY = this.r.centerY() * 1.25f;
            float f = this.d;
            canvas.drawArc(centerX - f, centerY - f, f + centerX, centerY + f, 0.0f, 360.0f, false, this.j);
            canvas.drawCircle(centerX, centerY, this.c, this.b);
        } else {
            if (this.r.width() > this.r.height()) {
                DisplayType displayType = this.h;
                DisplayType displayType2 = DisplayType.TEXT;
                int min = displayType == displayType2 ? 180 : Math.min(this.k, 180);
                canvas.drawArc(this.g, 90.0f, this.h != displayType2 ? Math.max(this.k - 180, 0) : 180, true, this.b);
                canvas.drawArc(this.g, 90.0f, 180.0f, false, this.j);
                canvas.drawRect(this.f, this.b);
                RectF rectF = this.f;
                float f2 = rectF.left;
                float f3 = rectF.top;
                canvas.drawLine(f2, f3, rectF.right, f3, this.j);
                RectF rectF2 = this.f;
                float f4 = rectF2.left;
                float f5 = rectF2.bottom;
                canvas.drawLine(f4, f5, rectF2.right, f5, this.j);
                canvas.drawArc(this.l, 270.0f, min, true, this.b);
                canvas.drawArc(this.l, 270.0f, 180.0f, false, this.j);
                if (this.h == DisplayType.PROGRESS) {
                    this.b.setStyle(Paint.Style.STROKE);
                    this.b.setStrokeWidth(this.f13125o);
                    RectF rectF3 = this.g;
                    float f6 = rectF3.left;
                    float f7 = this.n;
                    canvas.drawArc(f6 + f7, rectF3.top + f7, rectF3.right - f7, rectF3.bottom - f7, 90.0f, 180.0f, false, this.b);
                    RectF rectF4 = this.f;
                    float f8 = rectF4.left;
                    float f9 = this.n + rectF4.top;
                    canvas.drawLine(f8, f9, rectF4.right, f9, this.b);
                    RectF rectF5 = this.f;
                    float f10 = rectF5.left;
                    float f11 = this.n + rectF5.bottom;
                    canvas.drawLine(f10, f11, rectF5.right, f11, this.b);
                    RectF rectF6 = this.l;
                    float f12 = rectF6.left;
                    float f13 = this.n;
                    canvas.drawArc(f12 + f13, rectF6.top + f13, rectF6.right - f13, rectF6.bottom - f13, 270.0f, 180.0f, false, this.b);
                    this.b.setStyle(Paint.Style.FILL);
                }
            } else {
                canvas.drawArc(this.r, 270.0f, this.h == DisplayType.TEXT ? 360 : this.k, true, this.b);
                canvas.drawArc(this.r, 270.0f, 360.0f, false, this.j);
                if (this.h == DisplayType.PROGRESS) {
                    a(canvas);
                }
            }
            super.onDraw(canvas);
        }
    }

    private void a(Canvas canvas) {
        if (this.m) {
            Drawable drawable = getContext().getDrawable(C9834xU.j.j);
            RectF rectF = this.r;
            float f = rectF.left;
            float f2 = this.n;
            drawable.setBounds((int) (f + f2), (int) (rectF.top + f2), (int) (rectF.right - f2), (int) (rectF.bottom - f2));
            drawable.draw(canvas);
            return;
        }
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setStrokeWidth(this.f13125o);
        RectF rectF2 = this.r;
        float f3 = rectF2.left;
        float f4 = this.n;
        canvas.drawArc(f3 + f4, rectF2.top + f4, rectF2.right - f4, rectF2.bottom - f4, 270.0f, 360.0f, false, this.b);
        this.b.setStyle(Paint.Style.FILL);
    }

    public void setDisplayTypeImmediate(DisplayType displayType) {
        this.h = displayType;
        invalidate();
    }

    public void setDisplayType(DisplayType displayType) {
        this.h = displayType;
        postInvalidate();
    }

    public void setShowSmallCenterDot(boolean z) {
        this.t = z;
        postInvalidate();
    }

    public void setProgress(int i) {
        this.k = (Math.max(5, i) * 360) / 100;
    }

    public void setDrawable(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.b.setColor(i);
    }

    public void setBackgroundShadowColor(int i) {
        this.j.setColor(i);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.r;
        float f = this.a;
        rectF.set(f, f, i - i5, i2 - i5);
        RectF rectF2 = this.g;
        int i9 = this.a;
        float f2 = i9;
        float f3 = i2 - i9;
        rectF2.set(f2, f2, f3, f3);
        this.f.set(i2 / 2, this.a, i - i6, i2 - i7);
        this.l.set((i - i2) + i8, this.a, i - i8, i2 - i8);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }
}
