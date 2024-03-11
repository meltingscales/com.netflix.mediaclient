package com.netflix.mediaclient.android.widget.sheet;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.netflix.cl.Logger;
import com.netflix.cl.model.GestureInputDirection;
import com.netflix.cl.model.GestureInputKind;
import com.netflix.cl.model.context.DirectedGestureInput;
import com.netflix.mediaclient.android.widget.NetflixBottomSheetBehavior;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class NetflixSwipeToDismissBehavior extends NetflixBottomSheetBehavior<View> {
    private CoordinatorLayout.LayoutParams a;
    private BottomSheetBehavior.BottomSheetCallback b;
    private boolean e;
    private final PublishSubject<Integer> f;
    private final PublishSubject<Float> h;
    public static final c d = new c(null);
    public static final int c = 8;

    public NetflixSwipeToDismissBehavior() {
        PublishSubject<Integer> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.f = create;
        PublishSubject<Float> create2 = PublishSubject.create();
        C8632dsu.a(create2, "");
        this.h = create2;
        setState(3);
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("NetflixSwipeToDismissBehavior");
        }
    }

    public final Observable<Integer> a() {
        Observable<Integer> hide = this.f.hide();
        C8632dsu.a(hide, "");
        return hide;
    }

    public final void a(CoordinatorLayout.LayoutParams layoutParams) {
        C8632dsu.c((Object) layoutParams, "");
        if (this.e) {
            return;
        }
        this.e = true;
        layoutParams.setBehavior(this);
        this.a = layoutParams;
        e eVar = new e();
        addBottomSheetCallback(eVar);
        this.b = eVar;
    }

    /* loaded from: classes3.dex */
    public static final class e extends BottomSheetBehavior.BottomSheetCallback {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            C8632dsu.c((Object) view, "");
            Long valueOf = i == 4 ? Long.valueOf(Logger.INSTANCE.addContext(new DirectedGestureInput(GestureInputDirection.down, GestureInputKind.swipe, Double.valueOf(1.0d)))) : null;
            NetflixSwipeToDismissBehavior.this.f.onNext(Integer.valueOf(i));
            Logger.INSTANCE.removeContext(valueOf);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
            C8632dsu.c((Object) view, "");
            NetflixSwipeToDismissBehavior.this.h.onNext(Float.valueOf(view.getY()));
        }
    }

    public final void c() {
        if (this.e) {
            this.e = false;
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.b;
            if (bottomSheetCallback != null) {
                removeBottomSheetCallback(bottomSheetCallback);
            }
            this.b = null;
            CoordinatorLayout.LayoutParams layoutParams = this.a;
            if (layoutParams != null) {
                layoutParams.setBehavior(null);
            }
            this.a = null;
        }
    }
}
