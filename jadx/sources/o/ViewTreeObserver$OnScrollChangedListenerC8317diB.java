package o;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: o.diB  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserver$OnScrollChangedListenerC8317diB implements ViewTreeObserver.OnScrollChangedListener, View.OnAttachStateChangeListener {
    public static final a e = new a(null);
    private final drO<dpR> a;
    private ViewTreeObserver c;
    private final View d;

    public /* synthetic */ ViewTreeObserver$OnScrollChangedListenerC8317diB(View view, drO dro, C8627dsp c8627dsp) {
        this(view, dro);
    }

    private ViewTreeObserver$OnScrollChangedListenerC8317diB(View view, drO<dpR> dro) {
        this.d = view;
        this.a = dro;
        this.c = view.getViewTreeObserver();
    }

    /* renamed from: o.diB$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final ViewTreeObserver$OnScrollChangedListenerC8317diB b(View view, drO<dpR> dro) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) dro, "");
            ViewTreeObserver$OnScrollChangedListenerC8317diB viewTreeObserver$OnScrollChangedListenerC8317diB = new ViewTreeObserver$OnScrollChangedListenerC8317diB(view, dro, null);
            view.getViewTreeObserver().addOnScrollChangedListener(viewTreeObserver$OnScrollChangedListenerC8317diB);
            view.addOnAttachStateChangeListener(viewTreeObserver$OnScrollChangedListenerC8317diB);
            return viewTreeObserver$OnScrollChangedListenerC8317diB;
        }
    }

    public final void d() {
        if (this.c.isAlive()) {
            this.c.removeOnScrollChangedListener(this);
        } else {
            this.d.getViewTreeObserver().removeOnScrollChangedListener(this);
        }
        this.d.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        this.a.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        C8632dsu.c((Object) view, "");
        this.c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        C8632dsu.c((Object) view, "");
        d();
    }
}
