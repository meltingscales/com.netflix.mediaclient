package o;

import android.content.Context;
import android.util.AttributeSet;
import androidx.media3.ui.AspectRatioFrameLayout;

/* renamed from: o.aKm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1686aKm extends AspectRatioFrameLayout {
    private float a;
    private Float c;
    private float d;

    public final Float b() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686aKm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        this.a = 1.0f;
        this.d = 1.0f;
    }

    @Override // androidx.media3.ui.AspectRatioFrameLayout
    public int getCroppedViewWidth() {
        return (int) (super.getCroppedViewWidth() * this.a);
    }

    @Override // androidx.media3.ui.AspectRatioFrameLayout
    public int getCroppedViewHeight() {
        return (int) (super.getCroppedViewHeight() * this.d);
    }

    public final void setCropRatio(float f, float f2) {
        this.a = f;
        this.d = f2;
        requestLayout();
    }

    @Override // androidx.media3.ui.AspectRatioFrameLayout
    public void setAspectRatio(float f) {
        super.setAspectRatio(f);
        this.c = Float.valueOf(f);
    }
}
