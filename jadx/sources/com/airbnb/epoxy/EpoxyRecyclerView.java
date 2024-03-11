package com.airbnb.epoxy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AbstractC2596aj;
import o.AbstractC2914ap;
import o.AbstractC3073as;
import o.AbstractC4765bm;
import o.C2104aa;
import o.C2163ab;
import o.C3283aw;
import o.C4520bg;
import o.C5189bu;
import o.C8566dqi;
import o.C8627dsp;
import o.C8632dsu;
import o.C8938gE;
import o.InterfaceC5136bt;
import o.InterfaceC5295bw;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes2.dex */
public class EpoxyRecyclerView extends RecyclerView {
    public static final c c = new c(null);
    private static final C2104aa d = new C2104aa();
    private boolean a;
    private int b;
    private AbstractC2914ap e;
    private RecyclerView.Adapter<?> f;
    private final Runnable g;
    private final List<C5189bu<?>> h;
    private final List<b<?, ?, ?>> i;
    private boolean j;

    /* renamed from: o  reason: collision with root package name */
    private final C3283aw f13088o;

    /* loaded from: classes5.dex */
    public interface a {
        void a(AbstractC2914ap abstractC2914ap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b<T extends AbstractC3073as<?>, U extends InterfaceC5295bw, P extends InterfaceC5136bt> {
        private final int a;
        private final drO<P> c;
        private final AbstractC4765bm<T, U, P> d;
        private final drX<Context, RuntimeException, dpR> e;

        public final AbstractC4765bm<T, U, P> a() {
            return this.d;
        }

        public final drX<Context, RuntimeException, dpR> c() {
            return this.e;
        }

        public final drO<P> d() {
            return this.c;
        }

        public final int e() {
            return this.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EpoxyRecyclerView(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EpoxyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C3283aw h() {
        return this.f13088o;
    }

    public boolean i() {
        return true;
    }

    public final void setDelayMsWhenRemovingAdapterOnDetach(int i) {
        this.b = i;
    }

    public final void setRemoveAdapterWhenDetachedFromWindow(boolean z) {
        this.j = z;
    }

    public /* synthetic */ EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.f13088o = new C3283aw();
        this.j = true;
        this.b = 2000;
        this.g = new Runnable() { // from class: o.ay
            @Override // java.lang.Runnable
            public final void run() {
                EpoxyRecyclerView.c(EpoxyRecyclerView.this);
            }
        };
        this.h = new ArrayList();
        this.i = new ArrayList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8938gE.c.X, i, 0);
            C8632dsu.a(obtainStyledAttributes, "");
            setItemSpacingPx(obtainStyledAttributes.getDimensionPixelSize(C8938gE.c.V, 0));
            obtainStyledAttributes.recycle();
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(EpoxyRecyclerView epoxyRecyclerView) {
        C8632dsu.c((Object) epoxyRecyclerView, "");
        if (epoxyRecyclerView.a) {
            epoxyRecyclerView.a = false;
            epoxyRecyclerView.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        setClipToPadding(false);
        g();
    }

    private final void g() {
        if (!i()) {
            setRecycledViewPool(j());
        } else {
            setRecycledViewPool(d.d(f(), new drO<RecyclerView.RecycledViewPool>() { // from class: com.airbnb.epoxy.EpoxyRecyclerView$initViewPool$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: a */
                public final RecyclerView.RecycledViewPool invoke() {
                    return EpoxyRecyclerView.this.j();
                }
            }).e());
        }
    }

    private final Context f() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return context;
            }
        }
        Context context2 = getContext();
        C8632dsu.a(context2, "");
        return context2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RecyclerView.RecycledViewPool j() {
        return new C4520bg();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C8632dsu.c((Object) layoutParams, "");
        boolean z = getLayoutParams() == null;
        super.setLayoutParams(layoutParams);
        if (z && getLayoutManager() == null) {
            setLayoutManager(ai_());
        }
    }

    protected RecyclerView.LayoutManager ai_() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i = layoutParams.height;
        if (i == -1 || i == 0) {
            int i2 = layoutParams.width;
            if (i2 == -1 || i2 == 0) {
                setHasFixedSize(true);
            }
            return new LinearLayoutManager(getContext());
        }
        return new LinearLayoutManager(getContext(), 0, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        n();
    }

    private final void n() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        AbstractC2914ap abstractC2914ap = this.e;
        if (!(layoutManager instanceof GridLayoutManager) || abstractC2914ap == null) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (abstractC2914ap.getSpanCount() == gridLayoutManager.getSpanCount() && gridLayoutManager.getSpanSizeLookup() == abstractC2914ap.getSpanSizeLookup()) {
            return;
        }
        abstractC2914ap.setSpanCount(gridLayoutManager.getSpanCount());
        gridLayoutManager.setSpanSizeLookup(abstractC2914ap.getSpanSizeLookup());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        n();
        super.requestLayout();
    }

    public final void setItemSpacingRes(int i) {
        setItemSpacingPx(d(i));
    }

    public final void setItemSpacingDp(int i) {
        setItemSpacingPx(c(i));
    }

    public void setItemSpacingPx(int i) {
        removeItemDecoration(this.f13088o);
        this.f13088o.e(i);
        if (i > 0) {
            addItemDecoration(this.f13088o);
        }
    }

    public void setModels(List<? extends AbstractC3073as<?>> list) {
        C8632dsu.c((Object) list, "");
        AbstractC2914ap abstractC2914ap = this.e;
        SimpleEpoxyController simpleEpoxyController = abstractC2914ap instanceof SimpleEpoxyController ? (SimpleEpoxyController) abstractC2914ap : null;
        if (simpleEpoxyController == null) {
            simpleEpoxyController = new SimpleEpoxyController();
            setController(simpleEpoxyController);
        }
        simpleEpoxyController.setModels(list);
    }

    public final void setController(AbstractC2914ap abstractC2914ap) {
        C8632dsu.c((Object) abstractC2914ap, "");
        this.e = abstractC2914ap;
        setAdapter(abstractC2914ap.getAdapter());
        n();
    }

    public final void setControllerAndBuildModels(AbstractC2914ap abstractC2914ap) {
        C8632dsu.c((Object) abstractC2914ap, "");
        abstractC2914ap.requestModelBuild();
        setController(abstractC2914ap);
    }

    /* loaded from: classes5.dex */
    static final class WithModelsController extends AbstractC2914ap {
        private drM<? super AbstractC2914ap, dpR> callback = new drM<AbstractC2914ap, dpR>() { // from class: com.airbnb.epoxy.EpoxyRecyclerView$WithModelsController$callback$1
            public final void b(AbstractC2914ap abstractC2914ap) {
                C8632dsu.c((Object) abstractC2914ap, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC2914ap abstractC2914ap) {
                b(abstractC2914ap);
                return dpR.c;
            }
        };

        public final drM<AbstractC2914ap, dpR> getCallback() {
            return this.callback;
        }

        public final void setCallback(drM<? super AbstractC2914ap, dpR> drm) {
            C8632dsu.c((Object) drm, "");
            this.callback = drm;
        }

        @Override // o.AbstractC2914ap
        public void buildModels() {
            this.callback.invoke(this);
        }
    }

    /* loaded from: classes5.dex */
    static final class ModelBuilderCallbackController extends AbstractC2914ap {
        private a callback = new c();

        public final a getCallback() {
            return this.callback;
        }

        public final void setCallback(a aVar) {
            C8632dsu.c((Object) aVar, "");
            this.callback = aVar;
        }

        /* loaded from: classes5.dex */
        public static final class c implements a {
            @Override // com.airbnb.epoxy.EpoxyRecyclerView.a
            public void a(AbstractC2914ap abstractC2914ap) {
                C8632dsu.c((Object) abstractC2914ap, "");
            }

            c() {
            }
        }

        @Override // o.AbstractC2914ap
        public void buildModels() {
            this.callback.a(this);
        }
    }

    public void ah_() {
        AbstractC2914ap abstractC2914ap = this.e;
        if (abstractC2914ap != null) {
            abstractC2914ap.cancelPendingModelBuild();
        }
        this.e = null;
        swapAdapter(null, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int c(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int d(int i) {
        return getResources().getDimensionPixelOffset(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter<?> adapter) {
        super.setAdapter(adapter);
        c();
        m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void swapAdapter(RecyclerView.Adapter<?> adapter, boolean z) {
        super.swapAdapter(adapter, z);
        c();
        m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView.Adapter<?> adapter = this.f;
        if (adapter != null) {
            swapAdapter(adapter, false);
        }
        c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<T> it = this.h.iterator();
        while (it.hasNext()) {
            ((C5189bu) it.next()).d();
        }
        if (this.j) {
            int i = this.b;
            if (i > 0) {
                this.a = true;
                postDelayed(this.g, i);
            } else {
                o();
            }
        }
        a();
    }

    private final void o() {
        RecyclerView.Adapter<?> adapter = getAdapter();
        if (adapter != null) {
            swapAdapter(null, true);
            this.f = adapter;
        }
        a();
    }

    private final void c() {
        this.f = null;
        if (this.a) {
            removeCallbacks(this.g);
            this.a = false;
        }
    }

    private final void a() {
        if (C2163ab.b(getContext())) {
            getRecycledViewPool().clear();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    private final void m() {
        C5189bu<?> c5189bu;
        List e;
        List e2;
        Iterator<T> it = this.h.iterator();
        while (it.hasNext()) {
            removeOnScrollListener((C5189bu) it.next());
        }
        this.h.clear();
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            return;
        }
        Iterator<T> it2 = this.i.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            if (adapter instanceof AbstractC2596aj) {
                drO d2 = bVar.d();
                drX<Context, RuntimeException, dpR> c2 = bVar.c();
                int e3 = bVar.e();
                e2 = C8566dqi.e(bVar.a());
                c5189bu = C5189bu.e.a((AbstractC2596aj) adapter, d2, c2, e3, e2);
            } else {
                AbstractC2914ap abstractC2914ap = this.e;
                if (abstractC2914ap != null) {
                    C5189bu.b bVar2 = C5189bu.e;
                    drO d3 = bVar.d();
                    drX<Context, RuntimeException, dpR> c3 = bVar.c();
                    int e4 = bVar.e();
                    e = C8566dqi.e(bVar.a());
                    c5189bu = bVar2.a(abstractC2914ap, d3, c3, e4, e);
                } else {
                    c5189bu = null;
                }
            }
            if (c5189bu != null) {
                this.h.add(c5189bu);
                addOnScrollListener(c5189bu);
            }
        }
    }
}
