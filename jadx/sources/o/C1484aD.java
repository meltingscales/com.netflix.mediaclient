package o;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.C8938gE;

/* renamed from: o.aD  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1484aD {
    public static final b b = new b(null);
    private static final int d = C8938gE.d.c;
    private e a;
    private View e;
    private Integer h;
    private final SparseArray<C1646aJ> j = new SparseArray<>();
    private boolean i = true;
    private final Map<RecyclerView, C1619aI> c = new HashMap();

    public final void e(Integer num) {
        this.h = num;
    }

    public final void b(View view) {
        C8632dsu.c((Object) view, "");
        if (this.e != view) {
            c();
        }
        this.e = view;
        this.a = new e(this, view);
        d(view, false, "attach");
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        if (recyclerView != null) {
            c(recyclerView);
        }
    }

    public final void c() {
        View view = this.e;
        if (view != null) {
            d(view, true, "detach");
            RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
            if (recyclerView != null) {
                e(recyclerView);
            }
        }
        this.e = null;
        e eVar = this.a;
        if (eVar != null) {
            eVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(View view, boolean z, String str) {
        C1511aE e2 = C4757bl.e(view);
        if (e2 != null) {
            AbstractC3179au b2 = e2.b();
            e(view, z, str, e2);
            if (b2 instanceof C2077aZ) {
                a((C2077aZ) b2, z, str);
            }
        }
    }

    private final void a(C2077aZ c2077aZ, boolean z, String str) {
        Iterator<C1511aE> it = c2077aZ.d().iterator();
        while (it.hasNext()) {
            C1511aE next = it.next();
            View view = next.itemView;
            RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
            if (recyclerView != null) {
                if (z) {
                    e(recyclerView);
                } else {
                    c(recyclerView);
                }
            }
            View view2 = next.itemView;
            C8632dsu.a(view2, "");
            C8632dsu.a(next, "");
            e(view2, z, str, next);
        }
    }

    private final void e(View view, boolean z, String str, C1511aE c1511aE) {
        C1619aI c1619aI;
        if (d(c1511aE, z, str) && (view instanceof RecyclerView) && (c1619aI = this.c.get(view)) != null) {
            c1619aI.b();
        }
    }

    private final void c(RecyclerView recyclerView) {
        C1619aI c = b.c(recyclerView);
        if (c == null) {
            c = new C1619aI();
            c.b(this.h);
            c.d(recyclerView);
        }
        this.c.put(recyclerView, c);
    }

    private final void e(RecyclerView recyclerView) {
        this.c.remove(recyclerView);
    }

    private final boolean d(C1511aE c1511aE, boolean z, String str) {
        View view = c1511aE.itemView;
        C8632dsu.a(view, "");
        int identityHashCode = System.identityHashCode(view);
        C1646aJ c1646aJ = this.j.get(identityHashCode);
        if (c1646aJ == null) {
            c1646aJ = new C1646aJ(null, 1, null);
            this.j.put(identityHashCode, c1646aJ);
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && c1646aJ.a(view, viewGroup, z)) {
            c1646aJ.b(c1511aE, z);
            Integer num = this.h;
            if (num != null) {
                C8632dsu.d(num);
                c1646aJ.b(c1511aE, z, num.intValue());
            }
            c1646aJ.a(c1511aE, z);
            c1646aJ.c(c1511aE, z);
            return c1646aJ.e(c1511aE, this.i);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aD$e */
    /* loaded from: classes2.dex */
    public final class e implements ViewTreeObserver.OnGlobalLayoutListener {
        private final View d;
        final /* synthetic */ C1484aD e;

        public e(C1484aD c1484aD, View view) {
            C8632dsu.c((Object) view, "");
            this.e = c1484aD;
            this.d = view;
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public final void e() {
            this.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C1484aD c1484aD = this.e;
            View view = this.d;
            c1484aD.d(view, !(view.getVisibility() == 0), "onGlobalLayout");
        }
    }

    /* renamed from: o.aD$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C1619aI c(RecyclerView recyclerView) {
            return (C1619aI) recyclerView.getTag(C1484aD.d);
        }
    }
}
