package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aP  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1808aP extends RecyclerView.Adapter<C1511aE> {
    private AbstractC3073as<?> d;
    private ViewParent e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onBindViewHolder(C1511aE c1511aE, int i) {
        C8632dsu.c((Object) c1511aE, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    public final C1511aE e(ViewParent viewParent, AbstractC3073as<?> abstractC3073as, ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewParent, "");
        C8632dsu.c((Object) abstractC3073as, "");
        C8632dsu.c((Object) viewGroup, "");
        this.d = abstractC3073as;
        this.e = viewParent;
        C1511aE createViewHolder = createViewHolder(viewGroup, i);
        C8632dsu.a(createViewHolder, "");
        C1511aE c1511aE = createViewHolder;
        this.d = null;
        this.e = null;
        return c1511aE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public C1511aE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        ViewParent viewParent = this.e;
        AbstractC3073as<?> abstractC3073as = this.d;
        C8632dsu.d(abstractC3073as);
        View d = abstractC3073as.d(viewGroup);
        AbstractC3073as<?> abstractC3073as2 = this.d;
        C8632dsu.d(abstractC3073as2);
        return new C1511aE(viewParent, d, abstractC3073as2.f());
    }
}
