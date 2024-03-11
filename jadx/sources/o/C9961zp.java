package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import o.C9834xU;

/* renamed from: o.zp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9961zp extends LinearLayout {
    public C9961zp(Context context) {
        super(context);
        e();
    }

    public C9961zp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public C9961zp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    private final void e() {
        View.inflate(getContext(), C9834xU.i.f13917o, this);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /* renamed from: d */
    public String getAccessibilityClassName() {
        return Button.class.getName();
    }
}
