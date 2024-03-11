package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.aw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3283aw extends RecyclerView.ItemDecoration {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    private boolean b() {
        if (!this.b) {
            return this.j && !this.i;
        } else if (!this.a || this.e) {
            return this.j && !this.h;
        } else {
            return true;
        }
    }

    private boolean c() {
        if (!this.b) {
            return this.a && !this.d;
        } else if (!this.a || this.g) {
            return this.j && !this.c;
        } else {
            return true;
        }
    }

    private boolean d() {
        if (!this.b) {
            return this.j && !this.d;
        } else if (!this.a || this.c) {
            return this.j && !this.g;
        } else {
            return true;
        }
    }

    private boolean e() {
        if (!this.b) {
            return this.a && !this.i;
        } else if (!this.a || this.h) {
            return this.j && !this.e;
        } else {
            return true;
        }
    }

    public int a() {
        return this.f;
    }

    public void e(int i) {
        this.f = i;
    }

    public C3283aw() {
        this(0);
    }

    public C3283aw(int i) {
        e(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        e(recyclerView, childAdapterPosition, layoutManager);
        boolean c = c();
        boolean e = e();
        boolean d = d();
        boolean b = b();
        if (!e(layoutManager, this.a)) {
            e = c;
            c = e;
        } else if (!this.a) {
            e = c;
            c = e;
            b = d;
            d = b;
        }
        int i = this.f / 2;
        rect.right = c ? i : 0;
        rect.left = e ? i : 0;
        rect.top = d ? i : 0;
        if (!b) {
            i = 0;
        }
        rect.bottom = i;
    }

    private void e(RecyclerView recyclerView, int i, RecyclerView.LayoutManager layoutManager) {
        int itemCount = recyclerView.getAdapter().getItemCount();
        boolean z = true;
        this.d = i == 0;
        this.i = i == itemCount + (-1);
        this.a = layoutManager.canScrollHorizontally();
        this.j = layoutManager.canScrollVertically();
        boolean z2 = layoutManager instanceof GridLayoutManager;
        this.b = z2;
        if (z2) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            int spanSize = spanSizeLookup.getSpanSize(i);
            int spanCount = gridLayoutManager.getSpanCount();
            int spanIndex = spanSizeLookup.getSpanIndex(i, spanCount);
            this.c = spanIndex == 0;
            this.e = spanIndex + spanSize == spanCount;
            boolean c = c(i, spanSizeLookup, spanCount);
            this.g = c;
            if (c || !d(i, itemCount, spanSizeLookup, spanCount)) {
                z = false;
            }
            this.h = z;
        }
    }

    private static boolean e(RecyclerView.LayoutManager layoutManager, boolean z) {
        boolean z2 = (layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).getReverseLayout();
        return (z && (layoutManager.getLayoutDirection() == 1)) ? !z2 : z2;
    }

    private static boolean c(int i, GridLayoutManager.SpanSizeLookup spanSizeLookup, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 <= i; i4++) {
            i3 += spanSizeLookup.getSpanSize(i4);
            if (i3 > i2) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(int i, int i2, GridLayoutManager.SpanSizeLookup spanSizeLookup, int i3) {
        int i4 = 0;
        for (int i5 = i2 - 1; i5 >= i; i5--) {
            i4 += spanSizeLookup.getSpanSize(i5);
            if (i4 > i3) {
                return false;
            }
        }
        return true;
    }
}
