package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/* renamed from: o.Rx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1184Rx extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1184Rx(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1184Rx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C1184Rx(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184Rx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        setFitsSystemWindows(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C8632dsu.c((Object) windowInsets, "");
        b(windowInsets);
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        requestApplyInsets();
    }

    private final void b(WindowInsets windowInsets) {
        for (View view : C9703vR.e(this)) {
            if (view.getFitsSystemWindows()) {
                view.dispatchApplyWindowInsets(new WindowInsets(windowInsets));
            }
        }
    }
}
