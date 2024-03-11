package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.ys  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9911ys extends RecyclerView.ItemDecoration {
    private boolean c = true;

    public final void d(boolean z) {
        this.c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        C8632dsu.c((Object) rect, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) state, "");
        if (this.c) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (c(recyclerView, view, itemCount)) {
                if (view.getHeight() == 0 && state.didStructureChange()) {
                    d(recyclerView, rect, view);
                } else {
                    rect.set(0, b(recyclerView, view, itemCount), 0, 0);
                }
            }
        }
    }

    private final void d(final RecyclerView recyclerView, Rect rect, View view) {
        rect.set(0, 5000, 0, 0);
        view.post(new Runnable() { // from class: o.yr
            @Override // java.lang.Runnable
            public final void run() {
                C9911ys.a(RecyclerView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        recyclerView.invalidateItemDecorations();
    }

    private final int b(RecyclerView recyclerView, View view, int i) {
        int height = (recyclerView.getHeight() - d(recyclerView, view, i)) - recyclerView.getPaddingTop();
        if (height < 0) {
            return 0;
        }
        return height;
    }

    private final int d(RecyclerView recyclerView, View view, int i) {
        int min = Math.min(recyclerView.getChildCount(), i);
        int i2 = 0;
        for (int i3 = 0; i3 < min - 1; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            int height = childAt.getHeight();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            C8632dsu.a(layoutParams, "");
            int a = C9687vB.a(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            C8632dsu.a(layoutParams2, "");
            i2 += height + a + C9687vB.d(layoutParams2);
        }
        int height2 = view.getHeight();
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        C8632dsu.a(layoutParams3, "");
        int a2 = C9687vB.a(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        C8632dsu.a(layoutParams4, "");
        return i2 + height2 + a2 + C9687vB.d(layoutParams4);
    }

    private final boolean c(RecyclerView recyclerView, View view, int i) {
        return i > 0 && recyclerView.getChildAdapterPosition(view) == i - 1;
    }
}
