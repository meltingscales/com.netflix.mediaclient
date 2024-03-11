package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: o.Si  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1195Si extends ConstraintLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1195Si(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1195Si(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C1195Si(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1195Si(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = Button.class.getName();
        C8632dsu.a(name, "");
        return name;
    }
}
