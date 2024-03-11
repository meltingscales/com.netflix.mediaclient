package o;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;

/* renamed from: o.cCg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5623cCg extends MaterialCardView {
    private boolean a;
    private boolean c;
    private float e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5623cCg(Context context) {
        this(context, null, 2, null);
        C8632dsu.c((Object) context, "");
    }

    public final void setRatio(float f) {
        this.e = f;
    }

    public /* synthetic */ C5623cCg(Context context, AttributeSet attributeSet, int i, C8627dsp c8627dsp) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5623cCg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        this.e = 1.0f;
    }

    public final void setSupportsStrokes(boolean z) {
        int e;
        if (z) {
            e = dsT.e(4 * this.e);
            setStrokeWidth(e);
        } else {
            setStrokeWidth(0);
        }
        this.a = z;
    }

    public final void setStrokesOnly(boolean z) {
        if (z) {
            setSupportsStrokes(true);
        }
        this.c = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.a) {
            setStrokeColor(i);
        }
        if (this.c) {
            return;
        }
        setCardBackgroundColor(i);
    }
}
