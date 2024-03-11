package com.airbnb.epoxy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import java.util.List;
import o.AbstractC3073as;
import o.C8938gE;

/* loaded from: classes2.dex */
public class Carousel extends EpoxyRecyclerView {
    private static e a = new e() { // from class: com.airbnb.epoxy.Carousel.3
        @Override // com.airbnb.epoxy.Carousel.e
        public SnapHelper e(Context context) {
            return new LinearSnapHelper();
        }
    };
    private static int b = 8;
    private float d;

    /* loaded from: classes2.dex */
    public static abstract class e {
        public abstract SnapHelper e(Context context);
    }

    public static void setDefaultGlobalSnapHelperFactory(e eVar) {
        a = eVar;
    }

    public static void setDefaultItemSpacingDp(int i) {
        b = i;
    }

    protected int a() {
        return b;
    }

    protected e c() {
        return a;
    }

    public Carousel(Context context) {
        super(context);
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    public void b() {
        super.b();
        int a2 = a();
        if (a2 >= 0) {
            setItemSpacingDp(a2);
            if (getPaddingLeft() == 0 && getPaddingRight() == 0 && getPaddingTop() == 0 && getPaddingBottom() == 0) {
                setPaddingDp(a2);
            }
        }
        e c = c();
        if (c != null) {
            c.e(getContext()).attachToRecyclerView(this);
        }
        setRemoveAdapterWhenDetachedFromWindow(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setHasFixedSize(boolean z) {
        super.setHasFixedSize(z);
    }

    public void setNumViewsToShowOnScreen(float f) {
        this.d = f;
        setInitialPrefetchItemCount((int) Math.ceil(f));
    }

    public void setInitialPrefetchItemCount(int i) {
        if (i < 0) {
            throw new IllegalStateException("numItemsToPrefetch must be greater than 0");
        }
        if (i == 0) {
            i = 2;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).setInitialPrefetchItemCount(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onChildAttachedToWindow(View view) {
        if (this.d > 0.0f) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.setTag(C8938gE.d.b, Integer.valueOf(layoutParams.width));
            int a2 = h().a();
            int i = a2 > 0 ? (int) (a2 * this.d) : 0;
            boolean canScrollHorizontally = getLayoutManager().canScrollHorizontally();
            int d = (int) ((d(canScrollHorizontally) - i) / this.d);
            if (canScrollHorizontally) {
                layoutParams.width = d;
            } else {
                layoutParams.height = d;
            }
        }
    }

    private int d(boolean z) {
        int b2;
        int paddingTop;
        int i = 0;
        if (z) {
            b2 = a(this);
            paddingTop = getPaddingLeft();
            if (getClipToPadding()) {
                i = getPaddingRight();
            }
        } else {
            b2 = b(this);
            paddingTop = getPaddingTop();
            if (getClipToPadding()) {
                i = getPaddingBottom();
            }
        }
        return (b2 - paddingTop) - i;
    }

    private static int a(View view) {
        if (view.getWidth() > 0) {
            return view.getWidth();
        }
        if (view.getMeasuredWidth() > 0) {
            return view.getMeasuredWidth();
        }
        return view.getContext().getResources().getDisplayMetrics().widthPixels;
    }

    private static int b(View view) {
        if (view.getHeight() > 0) {
            return view.getHeight();
        }
        if (view.getMeasuredHeight() > 0) {
            return view.getMeasuredHeight();
        }
        return view.getContext().getResources().getDisplayMetrics().heightPixels;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onChildDetachedFromWindow(View view) {
        Object tag = view.getTag(C8938gE.d.b);
        if (tag instanceof Integer) {
            view.getLayoutParams().width = ((Integer) tag).intValue();
            view.setTag(C8938gE.d.b, null);
        }
    }

    public void setPaddingRes(int i) {
        int d = d(i);
        setPadding(d, d, d, d);
        setItemSpacingPx(d);
    }

    public void setPaddingDp(int i) {
        if (i == -1) {
            i = a();
        }
        int c = c(i);
        setPadding(c, c, c, c);
        setItemSpacingPx(c);
    }

    public void setPadding(Padding padding) {
        if (padding == null) {
            setPaddingDp(0);
            return;
        }
        Padding.PaddingType paddingType = padding.b;
        if (paddingType == Padding.PaddingType.PX) {
            setPadding(padding.a, padding.g, padding.c, padding.d);
            setItemSpacingPx(padding.e);
        } else if (paddingType == Padding.PaddingType.DP) {
            setPadding(c(padding.a), c(padding.g), c(padding.c), c(padding.d));
            setItemSpacingPx(c(padding.e));
        } else if (paddingType == Padding.PaddingType.RESOURCE) {
            setPadding(d(padding.a), d(padding.g), d(padding.c), d(padding.d));
            setItemSpacingPx(d(padding.e));
        }
    }

    /* loaded from: classes2.dex */
    public static class Padding {
        public final int a;
        public final PaddingType b;
        public final int c;
        public final int d;
        public final int e;
        public final int g;

        /* loaded from: classes2.dex */
        enum PaddingType {
            PX,
            DP,
            RESOURCE
        }

        public int hashCode() {
            return (((((((this.a * 31) + this.g) * 31) + this.c) * 31) + this.d) * 31) + this.e;
        }

        public static Padding a(int i, int i2, int i3, int i4, int i5) {
            return new Padding(i, i2, i3, i4, i5, PaddingType.DP);
        }

        private Padding(int i, int i2, int i3, int i4, int i5, PaddingType paddingType) {
            this.a = i;
            this.g = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.b = paddingType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Padding padding = (Padding) obj;
            return this.a == padding.a && this.g == padding.g && this.c == padding.c && this.d == padding.d && this.e == padding.e;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    public void setModels(List<? extends AbstractC3073as<?>> list) {
        super.setModels(list);
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    public void ah_() {
        super.ah_();
    }
}
