package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes3.dex */
public abstract class KC extends FrameLayout {
    public static final int c = ComposeView.$stable;
    private final ComposeView a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KC(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final ComposeView e() {
        return this.a;
    }

    public /* synthetic */ KC(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        addView(composeView, new FrameLayout.LayoutParams(-1, -2));
        this.a = composeView;
    }
}
