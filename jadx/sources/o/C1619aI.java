package o;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C8938gE;

/* renamed from: o.aI  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1619aI {
    private RecyclerView b;
    private RecyclerView.Adapter<?> e;
    private Integer j;
    private boolean n;
    public static final c c = new c(null);
    private static final int a = C8938gE.d.c;
    private final RecyclerView.ItemAnimator.ItemAnimatorFinishedListener d = new RecyclerView.ItemAnimator.ItemAnimatorFinishedListener() { // from class: o.aH
        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
        public final void onAnimationsFinished() {
            C1619aI.f(C1619aI.this);
        }
    };

    /* renamed from: o  reason: collision with root package name */
    private final SparseArray<C1646aJ> f13424o = new SparseArray<>();
    private final List<C1646aJ> m = new ArrayList();
    private final b f = new b();
    private final e i = new e();
    private final Map<RecyclerView, C1619aI> g = new HashMap();
    private boolean h = true;

    public final void a(boolean z) {
        this.h = z;
    }

    public final void b(Integer num) {
        this.j = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C1619aI c1619aI) {
        C8632dsu.c((Object) c1619aI, "");
        c1619aI.e("ItemAnimatorFinishedListener.onAnimationsFinished", false);
    }

    public void d(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        this.b = recyclerView;
        recyclerView.addOnScrollListener(this.f);
        recyclerView.addOnLayoutChangeListener(this.f);
        recyclerView.addOnChildAttachStateChangeListener(this.f);
        c.e(recyclerView, this);
    }

    public void c(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        recyclerView.removeOnScrollListener(this.f);
        recyclerView.removeOnLayoutChangeListener(this.f);
        recyclerView.removeOnChildAttachStateChangeListener(this.f);
        c.e(recyclerView, null);
        this.b = null;
    }

    public final void b() {
        a(this, "requestVisibilityCheck", false, 2, null);
    }

    static /* synthetic */ void a(C1619aI c1619aI, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processChangeEvent");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        c1619aI.e(str, z);
    }

    private final void e(String str, boolean z) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (z && itemAnimator != null) {
            if (itemAnimator.isRunning(this.d)) {
                d(null, str);
                return;
            }
            return;
        }
        d(null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(View view, String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return;
        }
        a();
        if (view != null) {
            c(view, true, str);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null && childAt != view) {
                c(childAt, false, str);
            }
        }
    }

    private final void a() {
        RecyclerView.Adapter<?> adapter;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null || C8632dsu.c(this.e, adapter)) {
            return;
        }
        RecyclerView.Adapter<?> adapter2 = this.e;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.i);
        }
        adapter.registerAdapterDataObserver(this.i);
        this.e = adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(View view, boolean z, String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.ViewHolder childViewHolder = (view.getParent() == null || view.getParent() == recyclerView) ? recyclerView.getChildViewHolder(view) : null;
        if (childViewHolder instanceof C1511aE) {
            C1511aE c1511aE = (C1511aE) childViewHolder;
            AbstractC3179au b2 = c1511aE.b();
            c(recyclerView, view, z, str, c1511aE);
            if (b2 instanceof C2077aZ) {
                a(recyclerView, (C2077aZ) b2, z, str);
            }
        }
    }

    private final void a(RecyclerView recyclerView, C2077aZ c2077aZ, boolean z, String str) {
        Iterator<C1511aE> it = c2077aZ.d().iterator();
        while (it.hasNext()) {
            C1511aE next = it.next();
            View view = next.itemView;
            if (view instanceof RecyclerView) {
                if (z) {
                    C8632dsu.d(view);
                    b((RecyclerView) view);
                } else {
                    C8632dsu.d(view);
                    e((RecyclerView) view);
                }
            }
            View view2 = next.itemView;
            C8632dsu.a(view2, "");
            C8632dsu.a(next, "");
            c(recyclerView, view2, z, str, next);
        }
    }

    private final void c(RecyclerView recyclerView, View view, boolean z, String str, C1511aE c1511aE) {
        C1619aI c1619aI;
        if (d(recyclerView, c1511aE, z, str) && (view instanceof RecyclerView) && (c1619aI = this.g.get(view)) != null) {
            a(c1619aI, "parent", false, 2, null);
        }
    }

    private final boolean d(RecyclerView recyclerView, C1511aE c1511aE, boolean z, String str) {
        View view = c1511aE.itemView;
        C8632dsu.a(view, "");
        int identityHashCode = System.identityHashCode(view);
        C1646aJ c1646aJ = this.f13424o.get(identityHashCode);
        if (c1646aJ == null) {
            c1646aJ = new C1646aJ(Integer.valueOf(c1511aE.getAdapterPosition()));
            this.f13424o.put(identityHashCode, c1646aJ);
            this.m.add(c1646aJ);
        } else if (c1511aE.getAdapterPosition() != -1) {
            C1646aJ c1646aJ2 = c1646aJ;
            if (c1646aJ2.b() != c1511aE.getAdapterPosition()) {
                c1646aJ2.a(c1511aE.getAdapterPosition());
            }
        }
        C1646aJ c1646aJ3 = c1646aJ;
        if (c1646aJ3.a(view, recyclerView, z)) {
            c1646aJ3.b(c1511aE, z);
            Integer num = this.j;
            if (num != null) {
                c1646aJ3.b(c1511aE, z, num.intValue());
            }
            c1646aJ3.a(c1511aE, z);
            c1646aJ3.c(c1511aE, z);
            return c1646aJ3.e(c1511aE, this.h);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(RecyclerView recyclerView) {
        C1619aI e2 = c.e(recyclerView);
        if (e2 == null) {
            e2 = new C1619aI();
            e2.j = this.j;
            e2.d(recyclerView);
        }
        this.g.put(recyclerView, e2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(RecyclerView recyclerView) {
        this.g.remove(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aI$b */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.OnScrollListener implements View.OnLayoutChangeListener, RecyclerView.OnChildAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C8632dsu.c((Object) view, "");
            C1619aI.a(C1619aI.this, "onLayoutChange", false, 2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C8632dsu.c((Object) recyclerView, "");
            C1619aI.a(C1619aI.this, "onScrolled", false, 2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            C8632dsu.c((Object) view, "");
            if (view instanceof RecyclerView) {
                C1619aI.this.e((RecyclerView) view);
            }
            C1619aI.this.c(view, false, "onChildViewAttachedToWindow");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
            C8632dsu.c((Object) view, "");
            if (view instanceof RecyclerView) {
                C1619aI.this.b((RecyclerView) view);
            }
            if (C1619aI.this.n) {
                C1619aI.this.d(view, "onChildViewDetachedFromWindow");
                C1619aI.this.n = false;
                return;
            }
            C1619aI.this.c(view, true, "onChildViewDetachedFromWindow");
        }
    }

    /* renamed from: o.aI$e */
    /* loaded from: classes2.dex */
    public final class e extends RecyclerView.AdapterDataObserver {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (a(C1619aI.this.b)) {
                return;
            }
            C1619aI.this.f13424o.clear();
            C1619aI.this.m.clear();
            C1619aI.this.n = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            if (a(C1619aI.this.b)) {
                return;
            }
            for (C1646aJ c1646aJ : C1619aI.this.m) {
                if (c1646aJ.b() >= i) {
                    C1619aI.this.n = true;
                    c1646aJ.e(i2);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            if (a(C1619aI.this.b)) {
                return;
            }
            for (C1646aJ c1646aJ : C1619aI.this.m) {
                if (c1646aJ.b() >= i) {
                    C1619aI.this.n = true;
                    c1646aJ.e(-i2);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            if (a(C1619aI.this.b)) {
                return;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                b(i + i4, i2 + i4);
            }
        }

        private final void b(int i, int i2) {
            if (a(C1619aI.this.b)) {
                return;
            }
            for (C1646aJ c1646aJ : C1619aI.this.m) {
                int b = c1646aJ.b();
                if (b == i) {
                    c1646aJ.e(i2 - i);
                    C1619aI.this.n = true;
                } else if (i < i2) {
                    if (i + 1 <= b && b <= i2) {
                        c1646aJ.e(-1);
                        C1619aI.this.n = true;
                    }
                } else if (i > i2 && i2 <= b && b < i) {
                    c1646aJ.e(1);
                    C1619aI.this.n = true;
                }
            }
        }

        private final boolean a(RecyclerView recyclerView) {
            return recyclerView == null || !(recyclerView.getAdapter() instanceof Z);
        }
    }

    /* renamed from: o.aI$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C1619aI e(RecyclerView recyclerView) {
            return (C1619aI) recyclerView.getTag(C1619aI.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(RecyclerView recyclerView, C1619aI c1619aI) {
            recyclerView.setTag(C1619aI.a, c1619aI);
        }
    }
}
