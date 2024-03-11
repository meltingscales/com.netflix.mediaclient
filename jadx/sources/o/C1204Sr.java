package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import o.C9834xU;

/* renamed from: o.Sr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1204Sr extends AppCompatTextView {
    private static final boolean a = false;
    public static final d c = new d(null);
    public static final int d = 0;
    private final boolean b;
    private final int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1204Sr(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1204Sr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C1204Sr(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C9834xU.b.y : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204Sr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.e = getResources().getInteger(C9834xU.f.a);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9834xU.n.Z, i, 0);
        try {
            this.b = obtainStyledAttributes.getBoolean(C9834xU.n.ae, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o.Sr$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("NetflixTextView");
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(C8310dhv.d(charSequence), bufferType);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i, float f) {
        if (i == 2) {
            super.setTextSize(i, f + this.e);
        } else {
            super.setTextSize(i, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r3, int r4) {
        /*
            r2 = this;
            r2.b()
            boolean r0 = r2.b
            if (r0 == 0) goto L2a
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L2a
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r0 = r0.getClipChildren()
            if (r0 != 0) goto L2a
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r0 = r0.height
            r1 = -2
            if (r0 != r1) goto L2a
            r0 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L2b
        L2a:
            r0 = 0
        L2b:
            if (r0 == 0) goto L31
            int r4 = r0.intValue()
        L31:
            super.onMeasure(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1204Sr.onMeasure(int, int):void");
    }

    private final void b() {
        int dimensionPixelOffset;
        if (getLineCount() <= 1 || (dimensionPixelOffset = getResources().getDimensionPixelOffset(C9834xU.a.B)) == 0 || getLineSpacingMultiplier() >= 1.1f || getLineSpacingExtra() >= dimensionPixelOffset * 2) {
            return;
        }
        setLineSpacing(dimensionPixelOffset, 1.1f);
        if (a) {
            setBackgroundColor(-16711681);
        }
    }
}
