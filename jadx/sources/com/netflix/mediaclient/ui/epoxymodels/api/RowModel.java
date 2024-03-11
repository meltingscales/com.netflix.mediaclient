package com.netflix.mediaclient.ui.epoxymodels.api;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.SimpleEpoxyController;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC3073as;
import o.AbstractC3179au;
import o.AbstractC3336ax;
import o.C1045Mp;
import o.C1596aHd;
import o.C1729aMb;
import o.C3796bKz;
import o.C8141del;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.C9834xU;
import o.C9906yn;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3825bMa;
import o.bIF;
import o.bIG;
import o.bKH;
import o.dpR;
import o.dqE;
import o.drX;
import o.dsA;
import o.dsZ;
import o.dtC;

/* loaded from: classes4.dex */
public abstract class RowModel extends AbstractC3336ax<b> {
    public static final a c = new a(null);
    public static final int d = 8;
    private C1729aMb b;
    private InterfaceC3825bMa.a f;
    private drX<? super AbstractC3179au, ? super Integer, dpR> g;
    private int h;
    private boolean i;
    private List<? extends AbstractC3073as<?>> j;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.b;
    }

    public final void b(C1729aMb c1729aMb) {
        this.b = c1729aMb;
    }

    public final void d(int i) {
        this.h = i;
    }

    public final void d(List<? extends AbstractC3073as<?>> list) {
        C8632dsu.c((Object) list, "");
        this.j = list;
    }

    public final void d(InterfaceC3825bMa.a aVar) {
        this.f = aVar;
    }

    public final void d(drX<? super AbstractC3179au, ? super Integer, dpR> drx) {
        this.g = drx;
    }

    public final void e(boolean z) {
        this.i = z;
    }

    @Override // o.AbstractC3073as
    public boolean f() {
        return true;
    }

    public final C1729aMb i() {
        return this.b;
    }

    public final boolean k() {
        return this.i;
    }

    public final InterfaceC3825bMa.a l() {
        return this.f;
    }

    public final drX<AbstractC3179au, Integer, dpR> m() {
        return this.g;
    }

    public final List<AbstractC3073as<?>> n() {
        return this.j;
    }

    public final int o() {
        return this.h;
    }

    public RowModel() {
        List<? extends AbstractC3073as<?>> i;
        i = C8569dql.i();
        this.j = i;
        this.h = -1;
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("RowModel");
        }
    }

    private final C1729aMb r() {
        C1729aMb c1729aMb = this.b;
        if (c1729aMb != null) {
            return c1729aMb;
        }
        throw new IllegalArgumentException("config is required".toString());
    }

    @Override // o.AbstractC3073as
    public int Z_() {
        int p = (r().p() - 500) + (Y_() != a() ? -Y_() : 0);
        c.getLogTag();
        return this.i ? Math.abs(p) : p;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        if (!C8632dsu.c(r(), bVar.e())) {
            bKH.b(bVar, r());
            bVar.e(r());
        }
        bVar.b().setTag(C9834xU.g.H, Integer.valueOf(this.h));
        bVar.b().setModels(this.j);
        bVar.e(this.g);
        e(bVar.b());
    }

    /* loaded from: classes4.dex */
    public static final class c extends View.AccessibilityDelegate {
        final /* synthetic */ EpoxyRecyclerView e;

        c(EpoxyRecyclerView epoxyRecyclerView) {
            this.e = epoxyRecyclerView;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            int childAdapterPosition;
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) accessibilityEvent, "");
            if (accessibilityEvent.getEventType() == 32768 && (childAdapterPosition = this.e.getChildAdapterPosition(view)) != -1) {
                this.e.smoothScrollToPosition(childAdapterPosition);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    private final void e(EpoxyRecyclerView epoxyRecyclerView) {
        if (r().o() > 1) {
            epoxyRecyclerView.setAccessibilityDelegate(new c(epoxyRecyclerView));
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.b().ah_();
        bVar.b().setTag(C9834xU.g.H, null);
        bVar.e((drX<? super AbstractC3179au, ? super Integer, dpR>) null);
    }

    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        private C9906yn a;
        private C1729aMb d;
        private drX<? super AbstractC3179au, ? super Integer, dpR> f;
        private PagerSnapHelper j;
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(b.class, "recyclerView", "getRecyclerView()Lcom/airbnb/epoxy/EpoxyRecyclerView;", 0))};
        public static final int b = 8;
        private final dsZ g = bIF.d(this, C3796bKz.a.k, false, 2, null);
        private final a c = new a();

        public final PagerSnapHelper a() {
            return this.j;
        }

        public final C9906yn c() {
            return this.a;
        }

        public final drX<AbstractC3179au, Integer, dpR> d() {
            return this.f;
        }

        public final C1729aMb e() {
            return this.d;
        }

        public final void e(PagerSnapHelper pagerSnapHelper) {
            this.j = pagerSnapHelper;
        }

        public final void e(C1729aMb c1729aMb) {
            this.d = c1729aMb;
        }

        public final void e(drX<? super AbstractC3179au, ? super Integer, dpR> drx) {
            this.f = drx;
        }

        public final void e(C9906yn c9906yn) {
            this.a = c9906yn;
        }

        public final EpoxyRecyclerView b() {
            return (EpoxyRecyclerView) this.g.getValue(this, e[0]);
        }

        /* loaded from: classes4.dex */
        public static final class a extends RecyclerView.OnScrollListener {
            a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                C8632dsu.c((Object) recyclerView, "");
                drX<AbstractC3179au, Integer, dpR> d = b.this.d();
                if (d != null) {
                    d.invoke(b.this, Integer.valueOf(i));
                }
            }
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            b().addOnScrollListener(this.c);
            b().setController(new RowEpoxyController());
        }
    }

    /* loaded from: classes4.dex */
    public static final class RowEpoxyController extends SimpleEpoxyController {
        public static final int $stable = 8;
        private boolean exceptionSwallowedReported;

        public RowEpoxyController() {
            setFilterDuplicates(true);
        }

        @Override // o.AbstractC2914ap
        public void onExceptionSwallowed(RuntimeException runtimeException) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) runtimeException, "");
            if (C8141del.a()) {
                throw runtimeException;
            }
            if (this.exceptionSwallowedReported) {
                return;
            }
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            aVar.a("epoxy.swallowed:" + runtimeException);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-32864 - item epoxy issue", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            this.exceptionSwallowedReported = true;
        }
    }
}
