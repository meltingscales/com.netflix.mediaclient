package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: o.csM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7231csM extends C1181Ru {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7231csM(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7231csM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C7231csM(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7231csM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    public final void d(View.OnClickListener onClickListener) {
        setButtonClickListener(onClickListener);
    }

    public final void setMessage(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        setMessageText(charSequence);
    }

    public final void setButton(CharSequence charSequence) {
        setButtonText(charSequence);
    }

    public final void setIcon(int i) {
        setIconDrawable(i);
    }
}
