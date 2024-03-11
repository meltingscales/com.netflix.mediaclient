package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import o.C9834xU;

/* renamed from: o.Rp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1176Rp extends LinearLayout {
    private int b;
    private final List<View> c;
    private int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1176Rp(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1176Rp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C1176Rp(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176Rp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.c = new ArrayList();
        setOrientation(0);
        setGravity(17);
    }

    public static /* synthetic */ void setup$default(C1176Rp c1176Rp, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = C9834xU.j.g;
        }
        if ((i5 & 4) != 0) {
            i3 = C9834xU.a.k;
        }
        if ((i5 & 8) != 0) {
            i4 = C9834xU.a.l;
        }
        c1176Rp.setup(i, i2, i3, i4);
    }

    public final void setup(int i, int i2, int i3, int i4) {
        if (i == 0 || i == this.b) {
            return;
        }
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(i3);
        int dimensionPixelOffset2 = getContext().getResources().getDimensionPixelOffset(i4);
        this.b = i;
        removeAllViews();
        this.c.clear();
        LayoutInflater from = LayoutInflater.from(getContext());
        int i5 = this.b;
        for (int i6 = 0; i6 < i5; i6++) {
            View inflate = from.inflate(C9834xU.i.m, (ViewGroup) this, false);
            ImageView imageView = (ImageView) inflate.findViewById(C9834xU.g.p);
            imageView.setImageResource(i2);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            C8632dsu.d(layoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = dimensionPixelOffset;
            marginLayoutParams.height = dimensionPixelOffset;
            marginLayoutParams.setMarginStart(dimensionPixelOffset2);
            marginLayoutParams.setMarginEnd(dimensionPixelOffset2);
            if (i6 == this.e) {
                imageView.setSelected(true);
            }
            List<View> list = this.c;
            C8632dsu.d(imageView);
            list.add(imageView);
            addView(inflate);
        }
    }

    public final void c(int i) {
        this.c.get(this.e).setSelected(false);
        this.c.get(i).setSelected(true);
        this.e = i;
    }
}
