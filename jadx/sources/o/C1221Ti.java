package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.netflix.mediaclient.android.widget.recyclerview.SnapOnScrollListener;

/* renamed from: o.Ti  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1221Ti {
    public static final int e(SnapHelper snapHelper, RecyclerView recyclerView) {
        View findSnapView;
        C8632dsu.c((Object) snapHelper, "");
        C8632dsu.c((Object) recyclerView, "");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (findSnapView = snapHelper.findSnapView(layoutManager)) == null) {
            return -1;
        }
        return layoutManager.getPosition(findSnapView);
    }

    public static final void e(RecyclerView recyclerView, SnapHelper snapHelper, SnapOnScrollListener.Behavior behavior, InterfaceC1225Tm interfaceC1225Tm) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) snapHelper, "");
        C8632dsu.c((Object) behavior, "");
        C8632dsu.c((Object) interfaceC1225Tm, "");
        snapHelper.attachToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new SnapOnScrollListener(snapHelper, behavior, interfaceC1225Tm));
    }
}
