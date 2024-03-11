package o;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.zq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9962zq extends LinearSnapHelper {
    private RecyclerView c;
    private final InterfaceC9960zo d;
    public static final d e = new d(null);
    public static final int a = 8;

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        C8632dsu.c((Object) layoutManager, "");
        C8632dsu.c((Object) view, "");
        return new int[2];
    }

    /* renamed from: o.zq$d */
    /* loaded from: classes2.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("SectionSnapHelper");
        }
    }

    public C9962zq(InterfaceC9960zo interfaceC9960zo) {
        C8632dsu.c((Object) interfaceC9960zo, "");
        this.d = interfaceC9960zo;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) {
        if (this.c == recyclerView) {
            return;
        }
        this.c = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.SnapHelper, androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i, int i2) {
        int b;
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || recyclerView.getAdapter() == null) {
                return false;
            }
            if ((i2 > recyclerView.getMinFlingVelocity() || i > recyclerView.getMinFlingVelocity()) && (b = b(linearLayoutManager, i, i2)) != -1) {
                return c(linearLayoutManager, b);
            }
            return false;
        }
        return false;
    }

    private final int b(LinearLayoutManager linearLayoutManager, int i, int i2) {
        int findFirstVisibleItemPosition;
        Integer sectionIndexForModelPos;
        int intValue;
        int i3;
        int a2 = a(linearLayoutManager, i, i2);
        if (a2 != -1 && (findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) != -1 && (sectionIndexForModelPos = this.d.getSectionIndexForModelPos(findFirstVisibleItemPosition)) != null) {
            int intValue2 = sectionIndexForModelPos.intValue();
            Integer sectionIndexForModelPos2 = this.d.getSectionIndexForModelPos(a2);
            if (sectionIndexForModelPos2 != null && intValue2 != (intValue = sectionIndexForModelPos2.intValue()) && (i3 = intValue2 + 1) <= intValue) {
                while (true) {
                    Integer firstTargetItemForSection = this.d.getFirstTargetItemForSection(i3);
                    if (firstTargetItemForSection != null && firstTargetItemForSection.intValue() - findFirstVisibleItemPosition >= 3) {
                        return firstTargetItemForSection.intValue();
                    }
                    if (i3 == intValue) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return -1;
    }

    private final int a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        return findTargetSnapPosition(layoutManager, i, i2);
    }

    private final boolean c(RecyclerView.LayoutManager layoutManager, int i) {
        RecyclerView.SmoothScroller d2;
        if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (d2 = d()) != null) {
            d2.setTargetPosition(i);
            layoutManager.startSmoothScroll(d2);
            return true;
        }
        return false;
    }

    /* renamed from: o.zq$c */
    /* loaded from: classes2.dex */
    public static final class c extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }

        c(Context context) {
            super(context);
        }
    }

    private final RecyclerView.SmoothScroller d() {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            return new c(recyclerView.getContext());
        }
        return null;
    }
}
