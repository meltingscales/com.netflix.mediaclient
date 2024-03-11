package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;
import java.util.List;
import o.AbstractC9900yh;
import o.AbstractC9900yh.c;
import o.C9834xU;

/* renamed from: o.yh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9900yh<T extends c> extends RecyclerView.Adapter<T> implements InterfaceC1732aMe {
    private final Context a;
    private LinearLayoutManager b;
    private C1729aMb c;
    public final LayoutInflater d;
    private final RecyclerView.OnScrollListener e = new RecyclerView.OnScrollListener() { // from class: o.yh.5
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            AbstractC9900yh.this.e(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            AbstractC9900yh.this.b(recyclerView, i, i2);
        }
    };
    private final int h;
    private RecyclerView j;

    public Context a() {
        return this.a;
    }

    public void a(Context context) {
    }

    public RecyclerView b() {
        return this.j;
    }

    protected void b(RecyclerView recyclerView, int i, int i2) {
    }

    public abstract void b(T t, int i);

    public boolean c() {
        return false;
    }

    @Override // o.InterfaceC1732aMe
    public C1729aMb d() {
        return this.c;
    }

    public void d(Context context) {
    }

    public void d(View view) {
    }

    public void d(RecyclerView recyclerView, RecyclerView recyclerView2, int i) {
    }

    public int e() {
        return this.h;
    }

    public void e(Context context) {
    }

    public void e(RecyclerView recyclerView, int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        d((AbstractC9900yh<T>) ((c) viewHolder), i, (List<Object>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return d((AbstractC9900yh<T>) ((c) viewHolder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        e((AbstractC9900yh<T>) ((c) viewHolder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        b((AbstractC9900yh<T>) ((c) viewHolder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        c((AbstractC9900yh<T>) ((c) viewHolder));
    }

    public AbstractC9900yh(Context context, C1729aMb c1729aMb, int i) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.c = c1729aMb;
        this.h = i;
    }

    public void b(C1729aMb c1729aMb) {
        if (this.c != c1729aMb) {
            this.c = c1729aMb;
            notifyDataSetChanged();
        }
    }

    public void c(T t) {
        t.d();
        super.onViewRecycled(t);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final void onBindViewHolder(T t, int i) {
        b(t, i);
        t.c(d());
        t.d(i);
    }

    public boolean d(T t) {
        t.c();
        return super.onFailedToRecycleView(t);
    }

    public void e(T t) {
        ViewGroup a = a((AbstractC9900yh<T>) t);
        if (a != null) {
            t.c(a);
        }
        t.c(d());
        t.a();
        super.onViewAttachedToWindow(t);
    }

    public void b(T t) {
        t.b();
        super.onViewDetachedFromWindow(t);
    }

    public final void d(T t, int i, List<Object> list) {
        onBindViewHolder(t, i);
    }

    public void c(Context context) {
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
            this.j = null;
        }
    }

    public void e(RecyclerView recyclerView, BaseVerticalRecyclerViewAdapter.d dVar) {
        this.b = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.j = recyclerView;
        recyclerView.addOnScrollListener(this.e);
    }

    public void c(RecyclerView recyclerView, BaseVerticalRecyclerViewAdapter.d dVar) {
        this.b = null;
        this.j = null;
        recyclerView.removeOnScrollListener(this.e);
    }

    protected ViewGroup a(T t) {
        return (ViewGroup) t.itemView.getParent();
    }

    /* renamed from: o.yh$c */
    /* loaded from: classes2.dex */
    public static abstract class c extends RecyclerView.ViewHolder {
        public final InterfaceC1732aMe a;
        public final View b;
        private C1729aMb c;
        private int d;
        protected final C9963zr e;
        private ViewGroup f;
        private final Runnable g;
        private final View.OnLayoutChangeListener j;

        protected int d(int i, C1729aMb c1729aMb) {
            return i;
        }

        protected boolean e() {
            return true;
        }

        public c(ViewGroup viewGroup, View view, final InterfaceC1732aMe interfaceC1732aMe, int i) {
            super(c(view));
            this.d = 0;
            this.c = null;
            View view2 = this.itemView;
            this.e = view2 instanceof C9963zr ? (C9963zr) view2 : null;
            this.b = view2.findViewById(i);
            this.a = interfaceC1732aMe;
            this.g = new Runnable() { // from class: o.yi
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC9900yh.c.this.a(interfaceC1732aMe);
                }
            };
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: o.yg
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    AbstractC9900yh.c.this.a(view3, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            };
            this.j = onLayoutChangeListener;
            this.f = viewGroup;
            if (f()) {
                return;
            }
            viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(InterfaceC1732aMe interfaceC1732aMe) {
            c(interfaceC1732aMe.d());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z = (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) ? false : true;
            if (!e() || z) {
                this.itemView.post(this.g);
            }
        }

        private boolean f() {
            return this.a.d().u();
        }

        public void c(ViewGroup viewGroup) {
            if (viewGroup != this.f) {
                if (!f()) {
                    this.f.removeOnLayoutChangeListener(this.j);
                    viewGroup.addOnLayoutChangeListener(this.j);
                }
                this.f = viewGroup;
            }
        }

        private static View c(View view) {
            if (C1337Xu.e(view.getContext(), C9834xU.g.q)) {
                C9963zr c9963zr = new C9963zr(view.getContext());
                c9963zr.addView(view, new FrameLayout.LayoutParams(-1, -1));
                return c9963zr;
            }
            return view;
        }

        protected void c(C1729aMb c1729aMb) {
            if (f()) {
                return;
            }
            C9963zr c9963zr = this.e;
            if (c9963zr != null) {
                c9963zr.a();
            }
            if ((this.f.getMeasuredWidth() == this.d && c1729aMb == this.c) || this.f.getMeasuredWidth() == 0) {
                return;
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
            if (layoutParams == null) {
                View view = this.itemView;
                RecyclerView.LayoutParams layoutParams2 = new RecyclerView.LayoutParams(0, 0);
                view.setLayoutParams(layoutParams2);
                layoutParams = layoutParams2;
            }
            b(c1729aMb, layoutParams);
            if (c(c1729aMb, layoutParams)) {
                C1044Mm.a("BaseRowAdapter", "[pos=%d] Layout cover view to %dx%d", Integer.valueOf(getAdapterPosition()), Integer.valueOf(((ViewGroup.MarginLayoutParams) layoutParams).width), Integer.valueOf(((ViewGroup.MarginLayoutParams) layoutParams).height));
                layoutParams.setMargins(c1729aMb.i(), c1729aMb.i(), c1729aMb.i(), c1729aMb.i());
                this.itemView.requestLayout();
                this.d = this.f.getMeasuredWidth();
                this.c = c1729aMb;
            }
        }

        private void b(C1729aMb c1729aMb, RecyclerView.LayoutParams layoutParams) {
            int measuredWidth;
            if (c1729aMb.m() < 1) {
                throw new IllegalStateException("config.getnumberOfItemsPerPage need a positive integer");
            }
            int i = c1729aMb.i() * 2;
            if (c1729aMb.l() > 0.0f) {
                measuredWidth = (int) (((this.f.getMeasuredWidth() - c1729aMb.a()) / (c1729aMb.m() + c1729aMb.l())) - i);
            } else {
                measuredWidth = ((this.f.getMeasuredWidth() - (c1729aMb.a() * 2)) / c1729aMb.m()) - i;
            }
            if (measuredWidth > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = d(measuredWidth, c1729aMb);
            }
        }

        private boolean c(C1729aMb c1729aMb, RecyclerView.LayoutParams layoutParams) {
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                return false;
            }
            if (c1729aMb.d() > 0.0f) {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) (d(layoutParams, c1729aMb) / c1729aMb.d());
                if (c1729aMb.j() > 0 && ((ViewGroup.MarginLayoutParams) layoutParams).height > c1729aMb.j()) {
                    int c = c1729aMb.c();
                    if (c == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = c1729aMb.j();
                    } else if (c == 1) {
                        C1044Mm.a("BaseRowAdapter", "[pos=%d] Item height too large, request re-layout with one additional item", Integer.valueOf(getAdapterPosition()));
                        c(c1729aMb.v());
                        return false;
                    }
                }
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
            }
            return true;
        }

        protected int d(ViewGroup.LayoutParams layoutParams, C1729aMb c1729aMb) {
            return layoutParams.width;
        }

        public void a() {
            C9963zr c9963zr = this.e;
            if (c9963zr != null) {
                c9963zr.d();
            }
        }

        public void b() {
            C9963zr c9963zr = this.e;
            if (c9963zr != null) {
                c9963zr.j();
            }
        }

        public void d() {
            C9963zr c9963zr = this.e;
            if (c9963zr != null) {
                c9963zr.h();
            }
        }

        final void d(int i) {
            C9963zr c9963zr = this.e;
            if (c9963zr != null) {
                c9963zr.e(i);
            }
        }

        public void c() {
            C9963zr c9963zr = this.e;
            if (c9963zr != null) {
                c9963zr.c();
            }
        }
    }
}
