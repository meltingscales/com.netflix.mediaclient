package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class RO extends View {
    private int b;
    private int d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RO(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        setFitsSystemWindows(true);
    }

    public /* synthetic */ RO(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C8632dsu.c((Object) windowInsets, "");
        this.b = windowInsets.getSystemWindowInsetBottom();
        b();
        return windowInsets;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.d, View.MeasureSpec.getMode(i2)));
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        b();
    }

    private final void b() {
        int i = this.d;
        int i2 = (getWindowSystemUiVisibility() & 4096) == 4096 ? 0 : this.b;
        this.d = i2;
        if (i != i2) {
            requestLayout();
        }
    }
}
