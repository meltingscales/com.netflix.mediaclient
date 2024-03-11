package o;

import android.graphics.drawable.GradientDrawable;

/* renamed from: o.yc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9895yc extends GradientDrawable {
    private int[] d;

    public C9895yc() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9895yc(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        C8632dsu.c((Object) orientation, "");
        this.d = iArr;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setColors(int[] iArr) {
        super.setColors(iArr);
        this.d = iArr;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setColors(int[] iArr, float[] fArr) {
        super.setColors(iArr, fArr);
        this.d = iArr;
    }

    public final int[] b() {
        return getColors();
    }
}
