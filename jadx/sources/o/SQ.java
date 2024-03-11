package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class SQ extends View {
    private int c;
    private int d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SQ(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        setFitsSystemWindows(true);
    }

    public /* synthetic */ SQ(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C8632dsu.c((Object) windowInsets, "");
        this.d = windowInsets.getSystemWindowInsetTop();
        a();
        return windowInsets;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.c, View.MeasureSpec.getMode(i2)));
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        a();
    }

    private final void a() {
        int i = this.c;
        int i2 = (getWindowSystemUiVisibility() & 4096) == 4096 ? 0 : this.d;
        this.c = i2;
        if (i != i2) {
            requestLayout();
        }
    }
}
