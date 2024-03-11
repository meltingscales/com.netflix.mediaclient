package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o.C9834xU;

/* renamed from: o.Ry  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C1185Ry extends ViewGroup {
    private int a;
    private int c;
    private int e;

    public C1185Ry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9834xU.n.w);
        try {
            this.c = obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.u, 0);
            this.a = obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.A, 0);
            this.e = obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.D, this.e);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = (View.MeasureSpec.getSize(i) - getPaddingRight()) - getPaddingLeft();
        int mode = View.MeasureSpec.getMode(i);
        int layoutDirection = getLayoutDirection();
        boolean z = mode != 0;
        int i4 = this.e;
        if (i4 > 0) {
            size = Math.min(size, i4);
        }
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                e eVar = (e) childAt.getLayoutParams();
                int i9 = this.c;
                i6 = eVar.d;
                if (i6 < 0) {
                    i6 = i9;
                }
                if (!z || childAt.getMeasuredWidth() + paddingLeft <= size) {
                    i3 = 1;
                } else {
                    paddingTop += i7 + this.a;
                    i5 = Math.max(i5, paddingLeft - i6);
                    paddingLeft = getPaddingLeft();
                    i3 = 1;
                    i7 = 0;
                }
                if (layoutDirection == i3) {
                    eVar.e = (size - paddingLeft) - childAt.getMeasuredWidth();
                } else {
                    eVar.e = paddingLeft;
                }
                eVar.a = paddingTop;
                paddingLeft += childAt.getMeasuredWidth() + i6;
                i7 = Math.max(i7, childAt.getMeasuredHeight());
            }
        }
        int max = Math.max(i5, paddingLeft - i6) + getPaddingRight();
        int paddingBottom = getPaddingBottom();
        if (layoutDirection == 1 && getLayoutParams().width == -2 && size != max) {
            for (int i10 = 0; i10 < childCount; i10++) {
                ((e) getChildAt(i10).getLayoutParams()).e -= size - max;
            }
        }
        setMeasuredDimension(View.resolveSize(max, i), View.resolveSize(paddingTop + i7 + paddingBottom, i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            int i6 = eVar.e;
            childAt.layout(i6, eVar.a, childAt.getMeasuredWidth() + i6, eVar.a + childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: d */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: c */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams.width, layoutParams.height);
    }

    /* renamed from: o.Ry$e */
    /* loaded from: classes6.dex */
    public static class e extends ViewGroup.LayoutParams {
        int a;
        int d;
        int e;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.d = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9834xU.n.y);
            try {
                this.d = obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.v, -1);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public e(int i, int i2) {
            super(i, i2);
            this.d = -1;
        }
    }
}
