package o;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

/* renamed from: o.Ri  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C1169Ri extends SZ {
    private float a;
    private boolean b;
    private boolean c;
    private float d;
    private float e;
    private float i;
    private float j;

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        this.c = true;
    }

    public void setAddEllipsis(boolean z) {
        this.b = z;
    }

    public C1169Ri(Context context) {
        super(context);
        this.c = false;
        this.e = 0.0f;
        this.d = 4.0f;
        this.j = 1.0f;
        this.a = 0.0f;
        this.b = false;
    }

    public C1169Ri(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.e = 0.0f;
        this.d = 4.0f;
        this.j = 1.0f;
        this.a = 0.0f;
        this.b = false;
    }

    public C1169Ri(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        this.e = 0.0f;
        this.d = 4.0f;
        this.j = 1.0f;
        this.a = 0.0f;
        this.b = false;
        this.i = getTextSize();
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.c = true;
        d();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.i = getTextSize();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.i = getTextSize();
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.j = f2;
        this.a = f;
    }

    public void setMaxTextSize(float f) {
        this.e = f;
        requestLayout();
        invalidate();
    }

    public void setMinTextSize(float f) {
        this.d = f;
        requestLayout();
        invalidate();
    }

    public void d() {
        float f = this.i;
        if (f > 0.0f) {
            super.setTextSize(0, f);
            this.e = this.i;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z || this.c) {
            int compoundPaddingLeft = getCompoundPaddingLeft();
            e(((i3 - i) - compoundPaddingLeft) - getCompoundPaddingRight(), ((i4 - i2) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void e(int i, int i2) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i2 <= 0 || i <= 0 || this.i == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float f = this.e;
        float min = f > 0.0f ? Math.min(this.i, f) : this.i;
        int c = c(text, paint, i, min);
        float f2 = min;
        while (c > i2) {
            float f3 = this.d;
            if (f2 <= f3) {
                break;
            }
            f2 = Math.max(f2 - 2.0f, f3);
            c = c(text, paint, i, f2);
        }
        if (this.b && f2 == this.d && c > i2) {
            StaticLayout staticLayout = new StaticLayout(text, paint, i, Layout.Alignment.ALIGN_NORMAL, this.j, this.a, false);
            if (staticLayout.getLineCount() > 0) {
                int lineForVertical = staticLayout.getLineForVertical(i2) - 1;
                if (lineForVertical < 0) {
                    setText("");
                } else {
                    int lineStart = staticLayout.getLineStart(lineForVertical);
                    int lineEnd = staticLayout.getLineEnd(lineForVertical);
                    float lineWidth = staticLayout.getLineWidth(lineForVertical);
                    float measureText = paint.measureText("...");
                    while (i < lineWidth + measureText) {
                        lineWidth = paint.measureText(text.subSequence(lineStart, lineEnd).toString());
                        lineEnd--;
                    }
                    setText(((Object) text.subSequence(0, lineEnd)) + "...");
                }
            }
        }
        paint.setTextSize(f2);
        setLineSpacing(this.a, this.j);
        this.c = false;
    }

    private int c(CharSequence charSequence, TextPaint textPaint, int i, float f) {
        textPaint.setTextSize(f);
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, this.j, this.a, true).getHeight();
    }
}
