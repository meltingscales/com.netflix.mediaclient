package o;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: o.cPq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5983cPq extends C4457beq {
    private float a;

    public final void setTextSizeMultiple(float f) {
        this.a = f;
    }

    public C5983cPq(Context context) {
        super(context);
        this.a = 1.0f;
    }

    public C5983cPq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1.0f;
    }

    @Override // androidx.media3.ui.SubtitleView
    public void setFractionalTextSize(float f) {
        super.setFractionalTextSize(f * this.a);
    }
}
