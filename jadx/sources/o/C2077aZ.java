package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import o.C8938gE;

/* renamed from: o.aZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2077aZ extends AbstractC3179au {
    public static final a d = new a(null);
    private static final C1808aP e = new C1808aP();
    private final ViewParent a;
    private C3126at b;
    private ViewGroup c;
    private List<C4924bp> f;
    private ViewGroup g;
    private final ArrayList<C1511aE> h;
    private final RecyclerView.RecycledViewPool j;

    public final ArrayList<C1511aE> d() {
        return this.h;
    }

    public C2077aZ(ViewParent viewParent) {
        C8632dsu.c((Object) viewParent, "");
        this.a = viewParent;
        this.h = new ArrayList<>(4);
        this.j = d.e(viewParent);
    }

    public final ViewGroup b() {
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            return viewGroup;
        }
        C8632dsu.d("");
        return null;
    }

    private final boolean e() {
        List<C4924bp> list = this.f;
        if (list == null) {
            C8632dsu.d("");
            list = null;
        }
        return !list.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3179au
    public void e(View view) {
        List<C4924bp> i;
        C8632dsu.c((Object) view, "");
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("The layout provided to EpoxyModelGroup must be a ViewGroup");
        }
        this.g = (ViewGroup) view;
        ViewGroup a2 = a(b());
        this.c = a2;
        ViewGroup viewGroup = null;
        if (a2 == null) {
            C8632dsu.d("");
            a2 = null;
        }
        if (a2.getChildCount() != 0) {
            ViewGroup viewGroup2 = this.c;
            if (viewGroup2 == null) {
                C8632dsu.d("");
            } else {
                viewGroup = viewGroup2;
            }
            i = e(viewGroup);
        } else {
            i = C8569dql.i();
        }
        this.f = i;
    }

    private final ViewGroup a(ViewGroup viewGroup) {
        View findViewById = viewGroup.findViewById(C8938gE.d.a);
        ViewGroup viewGroup2 = findViewById instanceof ViewGroup ? (ViewGroup) findViewById : null;
        return viewGroup2 == null ? viewGroup : viewGroup2;
    }

    private final List<C4924bp> e(ViewGroup viewGroup) {
        ArrayList<C4924bp> arrayList = new ArrayList<>(4);
        a(viewGroup, arrayList);
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No view stubs found. If viewgroup is not empty it must contain ViewStubs.");
        }
        return arrayList;
    }

    private final void a(ViewGroup viewGroup, ArrayList<C4924bp> arrayList) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, arrayList);
            } else if (childAt instanceof ViewStub) {
                arrayList.add(new C4924bp(viewGroup, (ViewStub) childAt, i));
            }
        }
    }

    public final void d(C3126at c3126at) {
        AbstractC3073as<?> abstractC3073as;
        Object f;
        ViewGroup viewGroup;
        List<AbstractC3073as<?>> list;
        Object f2;
        int size;
        int i;
        C8632dsu.c((Object) c3126at, "");
        C3126at c3126at2 = this.b;
        if (c3126at2 == c3126at) {
            return;
        }
        if (c3126at2 != null && c3126at2.b.size() > c3126at.b.size() && (size = c3126at.b.size()) <= c3126at2.b.size() - 1) {
            while (true) {
                b(i);
                if (i == size) {
                    break;
                }
                i--;
            }
        }
        this.b = c3126at;
        List<AbstractC3073as<?>> list2 = c3126at.b;
        int size2 = list2.size();
        List<C4924bp> list3 = null;
        if (e()) {
            List<C4924bp> list4 = this.f;
            if (list4 == null) {
                C8632dsu.d("");
                list4 = null;
            }
            if (list4.size() < size2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Insufficient view stubs for EpoxyModelGroup. ");
                sb.append(size2);
                sb.append(" models were provided but only ");
                List<C4924bp> list5 = this.f;
                if (list5 == null) {
                    C8632dsu.d("");
                } else {
                    list3 = list5;
                }
                sb.append(list3.size());
                sb.append(" view stubs exist.");
                throw new IllegalStateException(sb.toString());
            }
        }
        this.h.ensureCapacity(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC3073as<?> abstractC3073as2 = list2.get(i2);
            if (c3126at2 == null || (list = c3126at2.b) == null) {
                abstractC3073as = null;
            } else {
                f2 = C8576dqs.f((List<? extends Object>) list, i2);
                abstractC3073as = (AbstractC3073as) f2;
            }
            List<C4924bp> list6 = this.f;
            if (list6 == null) {
                C8632dsu.d("");
                list6 = null;
            }
            f = C8576dqs.f((List<? extends Object>) list6, i2);
            C4924bp c4924bp = (C4924bp) f;
            if ((c4924bp == null || (viewGroup = c4924bp.b()) == null) && (viewGroup = this.c) == null) {
                C8632dsu.d("");
                viewGroup = null;
            }
            if (abstractC3073as != null) {
                if (!d(abstractC3073as, abstractC3073as2)) {
                    b(i2);
                }
            }
            C8632dsu.a(abstractC3073as2, "");
            C1511aE d2 = d(viewGroup, abstractC3073as2);
            if (c4924bp == null) {
                ViewGroup viewGroup2 = this.c;
                if (viewGroup2 == null) {
                    C8632dsu.d("");
                    viewGroup2 = null;
                }
                viewGroup2.addView(d2.itemView, i2);
            } else {
                View view = d2.itemView;
                C8632dsu.a(view, "");
                c4924bp.c(view, c3126at.e(abstractC3073as2, i2));
            }
            this.h.add(i2, d2);
        }
    }

    private final boolean d(AbstractC3073as<?> abstractC3073as, AbstractC3073as<?> abstractC3073as2) {
        return C4871bo.c(abstractC3073as) == C4871bo.c(abstractC3073as2);
    }

    private final C1511aE d(ViewGroup viewGroup, AbstractC3073as<?> abstractC3073as) {
        int c = C4871bo.c(abstractC3073as);
        RecyclerView.ViewHolder recycledView = this.j.getRecycledView(c);
        C1511aE c1511aE = recycledView instanceof C1511aE ? (C1511aE) recycledView : null;
        return c1511aE == null ? e.e(this.a, abstractC3073as, viewGroup, c) : c1511aE;
    }

    public final void a() {
        if (this.b == null) {
            throw new IllegalStateException("Group is not bound");
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            b(this.h.size() - 1);
        }
        this.b = null;
    }

    private final void b(int i) {
        ViewGroup viewGroup = null;
        List<C4924bp> list = null;
        if (e()) {
            List<C4924bp> list2 = this.f;
            if (list2 == null) {
                C8632dsu.d("");
            } else {
                list = list2;
            }
            list.get(i).e();
        } else {
            ViewGroup viewGroup2 = this.c;
            if (viewGroup2 == null) {
                C8632dsu.d("");
            } else {
                viewGroup = viewGroup2;
            }
            viewGroup.removeViewAt(i);
        }
        C1511aE remove = this.h.remove(i);
        C8632dsu.a(remove, "");
        C1511aE c1511aE = remove;
        c1511aE.e();
        this.j.putRecycledView(c1511aE);
    }

    /* renamed from: o.aZ$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final RecyclerView.RecycledViewPool e(ViewParent viewParent) {
            RecyclerView.RecycledViewPool recycledViewPool = null;
            while (recycledViewPool == null) {
                if (viewParent instanceof RecyclerView) {
                    recycledViewPool = ((RecyclerView) viewParent).getRecycledViewPool();
                } else {
                    ViewParent parent = viewParent.getParent();
                    if (parent != null) {
                        recycledViewPool = e(parent);
                    } else {
                        recycledViewPool = new C1889aS();
                    }
                }
            }
            return recycledViewPool;
        }
    }
}
