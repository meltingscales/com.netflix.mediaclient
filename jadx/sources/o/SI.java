package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ViewFlipper;

/* loaded from: classes6.dex */
public class SI extends ViewFlipper {
    public SI(Context context) {
        super(context);
    }

    public SI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ViewFlipper, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException unused) {
            C1044Mm.e("nf-ui", "SafeViewFlipper ignoring IllegalArgumentException");
            stopFlipping();
        }
    }
}
