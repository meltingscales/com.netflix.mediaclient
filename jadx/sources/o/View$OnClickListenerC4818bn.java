package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import o.AbstractC3073as;
import o.C8632dsu;
import o.C8670due;
import o.View$OnClickListenerC4818bn;
import o.dtQ;
import o.dtY;

/* renamed from: o.bn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class View$OnClickListenerC4818bn<T extends AbstractC3073as<?>, V> implements View.OnClickListener, View.OnLongClickListener {
    private final InterfaceC4361bd<T, V> a;
    private final InterfaceC4308bc<T, V> d;

    public View$OnClickListenerC4818bn(InterfaceC4308bc<T, V> interfaceC4308bc) {
        if (interfaceC4308bc == null) {
            throw new IllegalArgumentException("Click listener cannot be null".toString());
        }
        this.d = interfaceC4308bc;
        this.a = null;
    }

    public View$OnClickListenerC4818bn(InterfaceC4361bd<T, V> interfaceC4361bd) {
        if (interfaceC4361bd == null) {
            throw new IllegalArgumentException("Click listener cannot be null".toString());
        }
        this.a = interfaceC4361bd;
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dpR dpr;
        C8632dsu.c((Object) view, "");
        d e2 = e(view);
        if (e2 == null) {
            return;
        }
        InterfaceC4308bc<T, V> interfaceC4308bc = this.d;
        if (interfaceC4308bc != 0) {
            AbstractC3073as<?> b = e2.b();
            C8632dsu.d(b);
            interfaceC4308bc.c(b, e2.d(), view, e2.a());
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            throw new IllegalStateException("Original click listener is null".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        C8632dsu.c((Object) view, "");
        d e2 = e(view);
        if (e2 == null) {
            return false;
        }
        InterfaceC4361bd<T, V> interfaceC4361bd = this.a;
        if (interfaceC4361bd != 0) {
            AbstractC3073as<?> b = e2.b();
            C8632dsu.d(b);
            return interfaceC4361bd.e(b, e2.d(), view, e2.a());
        }
        throw new IllegalStateException("Original long click listener is null".toString());
    }

    private final d e(View view) {
        boolean c;
        C1511aE a2 = C1916aT.a(view);
        if (a2 == null) {
            throw new IllegalStateException("Could not find RecyclerView holder for clicked view".toString());
        }
        int adapterPosition = a2.getAdapterPosition();
        Object obj = null;
        if (adapterPosition == -1) {
            return null;
        }
        Object c2 = a2.c();
        C8632dsu.a(c2, "");
        if (c2 instanceof C2077aZ) {
            Iterator<T> it = ((C2077aZ) c2).d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                View view2 = ((C1511aE) next).itemView;
                C8632dsu.a(view2, "");
                c = C8670due.c(d(view2), view);
                if (c) {
                    obj = next;
                    break;
                }
            }
            C1511aE c1511aE = (C1511aE) obj;
            if (c1511aE != null) {
                a2 = c1511aE;
            }
        }
        AbstractC3073as<?> a3 = a2.a();
        C8632dsu.a(a3, "");
        Object c3 = a2.c();
        C8632dsu.a(c3, "");
        return new d(a3, adapterPosition, c3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bn$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final int b;
        private final AbstractC3073as<?> c;
        private final Object e;

        public final int a() {
            return this.b;
        }

        public final AbstractC3073as<?> b() {
            return this.c;
        }

        public final Object d() {
            return this.e;
        }

        public d(AbstractC3073as<?> abstractC3073as, int i, Object obj) {
            C8632dsu.c((Object) abstractC3073as, "");
            C8632dsu.c(obj, "");
            this.c = abstractC3073as;
            this.b = i;
            this.e = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dtQ<View> d(View view) {
        dtQ<View> b;
        dtQ n;
        dtQ<View> e2;
        if (view instanceof ViewGroup) {
            n = C8670due.n(a((ViewGroup) view), new drM<View, dtQ<? extends View>>(this) { // from class: com.airbnb.epoxy.WrappedEpoxyModelClickListener$allViewsInHierarchy$1
                final /* synthetic */ View$OnClickListenerC4818bn<T, V> c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.c = this;
                }

                @Override // o.drM
                /* renamed from: c */
                public final dtQ<View> invoke(View view2) {
                    dtQ b2;
                    dtQ<View> e3;
                    C8632dsu.c((Object) view2, "");
                    b2 = dtY.b(view2);
                    e3 = C8670due.e(b2, view2 instanceof ViewGroup ? this.c.d(view2) : dtY.d());
                    return e3;
                }
            });
            e2 = C8670due.e(n, view);
            return e2;
        }
        b = dtY.b(view);
        return b;
    }

    /* renamed from: o.bn$a */
    /* loaded from: classes2.dex */
    public static final class a implements dtQ<View> {
        final /* synthetic */ ViewGroup b;
        final /* synthetic */ View$OnClickListenerC4818bn<T, V> c;

        a(View$OnClickListenerC4818bn<T, V> view$OnClickListenerC4818bn, ViewGroup viewGroup) {
            this.c = view$OnClickListenerC4818bn;
            this.b = viewGroup;
        }

        @Override // o.dtQ
        public Iterator<View> iterator() {
            return this.c.d(this.b);
        }
    }

    public final dtQ<View> a(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new a(this, viewGroup);
    }

    /* renamed from: o.bn$e */
    /* loaded from: classes2.dex */
    public static final class e implements Iterator<View>, dsJ {
        private int a;
        final /* synthetic */ ViewGroup e;

        e(ViewGroup viewGroup) {
            this.e = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < this.e.getChildCount();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.e;
            int i = this.a;
            this.a = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.e;
            int i = this.a - 1;
            this.a = i;
            viewGroup.removeViewAt(i);
        }
    }

    public final Iterator<View> d(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new e(viewGroup);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof View$OnClickListenerC4818bn) {
            InterfaceC4308bc<T, V> interfaceC4308bc = this.d;
            if (interfaceC4308bc == null ? ((View$OnClickListenerC4818bn) obj).d == null : C8632dsu.c(interfaceC4308bc, ((View$OnClickListenerC4818bn) obj).d)) {
                InterfaceC4361bd<T, V> interfaceC4361bd = this.a;
                if (interfaceC4361bd != null) {
                    return C8632dsu.c(interfaceC4361bd, ((View$OnClickListenerC4818bn) obj).a);
                }
                return ((View$OnClickListenerC4818bn) obj).a == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        InterfaceC4308bc<T, V> interfaceC4308bc = this.d;
        int hashCode = interfaceC4308bc != null ? interfaceC4308bc.hashCode() : 0;
        InterfaceC4361bd<T, V> interfaceC4361bd = this.a;
        return (hashCode * 31) + (interfaceC4361bd != null ? interfaceC4361bd.hashCode() : 0);
    }
}
