package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.rowconfig.layoutmanager.RowConfigLayoutManager;
import o.aLX;

/* renamed from: o.aMd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1731aMd extends RecyclerView.ItemDecoration {
    public static final d a = new d(null);

    /* renamed from: o.aMd$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("HomeUniformSpacingDecoration");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        C8632dsu.c((Object) rect, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) state, "");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            C8632dsu.a(layoutManager, "");
            RowConfigLayoutManager rowConfigLayoutManager = (RowConfigLayoutManager) C9726vo.d(layoutManager, RowConfigLayoutManager.class);
            C1729aMb d2 = d(view);
            if (!c(view) || d2 == null) {
                return;
            }
            if (rowConfigLayoutManager.getOrientation() == 0) {
                rect.set(d2.i(), d2.i(), d2.i(), d2.i());
                return;
            }
            int i = d2.i() * 2;
            int position = rowConfigLayoutManager.getPosition(view);
            GridLayoutManager.SpanSizeLookup spanSizeLookup = rowConfigLayoutManager.getSpanSizeLookup();
            int spanCount = rowConfigLayoutManager.getSpanCount();
            int spanIndex = spanSizeLookup.getSpanIndex(position, spanCount);
            boolean z = spanIndex == 0;
            boolean z2 = spanIndex + spanSizeLookup.getSpanSize(position) == spanCount;
            int i2 = z ? i : i / 2;
            int i3 = i / 2;
            if (!z2) {
                i = i3;
            }
            rect.set(i2, i3, i, i3);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final boolean c(View view) {
        Object tag = view.getTag(aLX.a.e);
        Boolean bool = Boolean.TRUE;
        return C8632dsu.c(tag, bool) || C8632dsu.c(view.getTag(aLX.a.a), bool);
    }

    private final C1729aMb d(View view) {
        Object tag = view.getTag(aLX.a.d);
        C1729aMb c1729aMb = null;
        C1729aMb c1729aMb2 = tag instanceof C1729aMb ? (C1729aMb) tag : null;
        if (c1729aMb2 == null) {
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                C8632dsu.a(parent, "");
                c1729aMb = d((View) C9726vo.d(parent, View.class));
            }
            return c1729aMb;
        }
        return c1729aMb2;
    }
}
