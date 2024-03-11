package com.netflix.mediaclient.ui.notifications.multititle;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.util.ViewUtils;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.InvalidObjectException;
import java.util.List;
import javax.inject.Inject;
import o.AbstractC7118cqF;
import o.AbstractC7162cqx;
import o.C1044Mm;
import o.C7119cqG;
import o.C7145cqg;
import o.C8627dsp;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1078Nw;
import o.InterfaceC4208baF;
import o.InterfaceC7216cry;
import o.InterfaceC7303ctf;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class MultiTitleNotificationsFrag extends AbstractC7162cqx {
    public static final b b = new b(null);
    private InterfaceC7216cry e;
    private C7145cqg j;
    @Inject
    public InterfaceC7303ctf offlineApi;

    public boolean G() {
        return true;
    }

    @Override // o.InterfaceC1077Nv
    public final boolean isLoadingData() {
        return false;
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    protected final InterfaceC7303ctf a() {
        InterfaceC7303ctf interfaceC7303ctf = this.offlineApi;
        if (interfaceC7303ctf != null) {
            return interfaceC7303ctf;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7145cqg L() {
        C7145cqg c7145cqg = this.j;
        if (c7145cqg != null) {
            return c7145cqg;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        C1044Mm.b("MultiTitleNotifications", "Creating new multi-title notifications fragment.");
        this.j = C7145cqg.c(layoutInflater, viewGroup, false);
        FrameLayout d2 = L().d();
        C8632dsu.a(d2, "");
        return d2;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        if (G()) {
            J();
        }
    }

    public C7119cqG d(int i, int i2) {
        return new C7119cqG(i, i2);
    }

    private final void J() {
        NetflixActivity by_ = by_();
        by_.requireNetflixActionBar().c(by_.getActionBarStateBuilder().b(false).e("").f(true).h(true).i(true).c());
    }

    public void F() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(L().a.getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new d());
        int dimensionPixelOffset = requireContext().getResources().getDimensionPixelOffset(C9834xU.a.aa);
        int dimensionPixelOffset2 = requireContext().getResources().getDimensionPixelOffset(C9834xU.a.v);
        L().a.setAdapter(d(dimensionPixelOffset, dimensionPixelOffset2));
        L().a.setLayoutManager(gridLayoutManager);
        L().a.addItemDecoration(new e(dimensionPixelOffset, dimensionPixelOffset2));
        RecyclerView recyclerView = L().a;
        C8632dsu.a(recyclerView, "");
        a(recyclerView);
    }

    /* loaded from: classes4.dex */
    public static final class d extends GridLayoutManager.SpanSizeLookup {
        d() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            if (MultiTitleNotificationsFrag.this.L().a.getAdapter() != null) {
                RecyclerView.Adapter adapter = MultiTitleNotificationsFrag.this.L().a.getAdapter();
                C8632dsu.d(adapter);
                return !((C7119cqG) adapter).e(i) ? 2 : 1;
            }
            throw new InvalidObjectException("MultiTitleNotifications - span size is called even though adapter is null");
        }
    }

    public final void d(List<? extends AbstractC7118cqF> list) {
        C1044Mm.e("MultiTitleNotifications", "Received list of multi-title notification rows.");
        F();
        if (list != null && list.size() > 0) {
            e(list);
        }
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
        C8632dsu.a(netflixImmutableStatus, "");
        d(netflixImmutableStatus);
    }

    private final void e(List<? extends AbstractC7118cqF> list) {
        if (L().a.getAdapter() instanceof C7119cqG) {
            RecyclerView.Adapter adapter = L().a.getAdapter();
            C8632dsu.d(adapter);
            ((C7119cqG) adapter).a(list);
        }
        ViewUtils.a(L().e, 8);
        ViewUtils.a(L().a, 0);
    }

    protected final void a(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        I();
        InterfaceC4208baF offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(bj_());
        this.e = offlineAgentOrNull != null ? (InterfaceC7216cry) offlineAgentOrNull.e((InterfaceC4208baF) a().d(viewGroup, false)) : null;
    }

    private final void I() {
        InterfaceC4208baF offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(bj_());
        if (offlineAgentOrNull != null) {
            offlineAgentOrNull.d(this.e);
        }
        this.e = null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.j = null;
        I();
    }

    /* loaded from: classes4.dex */
    public final class e extends RecyclerView.ItemDecoration {
        private final int b;
        private final int c;

        public e(int i, int i2) {
            this.c = i;
            this.b = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            C8632dsu.c((Object) rect, "");
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) recyclerView, "");
            C8632dsu.c((Object) state, "");
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            C8632dsu.d(adapter);
            C7119cqG c7119cqG = (C7119cqG) adapter;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (c7119cqG.e(childAdapterPosition)) {
                int i = this.c / 2;
                rect.left = i;
                rect.right = i;
                rect.bottom = i;
                rect.top = i;
                if (c7119cqG.b(childAdapterPosition)) {
                    rect.left = this.b / 2;
                }
                if (c7119cqG.b(childAdapterPosition)) {
                    return;
                }
                rect.right = this.b / 2;
            }
        }
    }

    public final void e() {
        if (L().a.getAdapter() instanceof C7119cqG) {
            RecyclerView.Adapter adapter = L().a.getAdapter();
            C8632dsu.d(adapter);
            ((C7119cqG) adapter).notifyDataSetChanged();
        }
    }
}
