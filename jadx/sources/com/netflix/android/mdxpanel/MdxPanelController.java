package com.netflix.android.mdxpanel;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.netflix.android.mdxpanel.MdxPanelController;
import com.netflix.mediaclient.common.ui.LifecycleController;
import com.netflix.model.leafs.ArtworkColors;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import o.AbstractC9766wb;
import o.AbstractC9791we;
import o.C1045Mp;
import o.C1184Rx;
import o.C1203Sq;
import o.C1204Sr;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9618tM;
import o.C9737vz;
import o.C9743wE;
import o.C9749wK;
import o.C9750wL;
import o.C9753wO;
import o.C9754wP;
import o.C9793wg;
import o.C9795wi;
import o.C9797wk;
import o.C9798wl;
import o.C9805ws;
import o.C9806wt;
import o.C9809ww;
import o.C9811wy;
import o.C9812wz;
import o.C9834xU;
import o.C9913yu;
import o.InterfaceC8554dpx;
import o.InterfaceC8598drn;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public class MdxPanelController extends LifecycleController<c> {
    public static final e b = new e(null);
    private final C9754wP A;
    private final InterfaceC8554dpx B;
    private final PublishSubject<Integer> C;
    private final Subject<AbstractC9791we> D;
    private final C1203Sq E;
    private final Subject<AbstractC9766wb> H;
    private final Observable<AbstractC9791we> I;
    private final C9812wz a;
    private final View e;
    private final C1204Sr f;
    private final View g;
    private final b h;
    private final View i;
    private final View j;
    private d k;
    private boolean l;
    private final Space m;
    private final C9798wl n;

    /* renamed from: o  reason: collision with root package name */
    private final C9793wg f13122o;
    private final C9811wy p;
    private final C9797wk q;
    private final C9809ww r;
    private final C9806wt s;
    private final C9805ws t;
    private final C9749wK u;
    private final C9753wO v;
    private final ConstraintLayout w;
    private final C9743wE x;
    private final C9750wL y;
    private final drM<Throwable, dpR> z;

    /* loaded from: classes2.dex */
    public interface a {
        Drawable b(int i);
    }

    /* loaded from: classes2.dex */
    public interface c {
        Observable<d> e();
    }

    /* loaded from: classes2.dex */
    public interface d {

        /* loaded from: classes2.dex */
        public static final class e {
            public static Integer a(d dVar) {
                return null;
            }

            public static String d(d dVar) {
                return null;
            }
        }

        String a();

        String b();

        Uri c();

        Integer d();

        int e();

        CharSequence g();

        String h();

        CharSequence j();
    }

    public final d c() {
        return this.k;
    }

    public final Observable<AbstractC9791we> f() {
        return this.I;
    }

    public final Observable<AbstractC9766wb> h() {
        return this.H;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MdxPanelController(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, androidx.lifecycle.LifecycleOwner r14, com.netflix.android.mdxpanel.MdxPanelController.Experience r15) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.android.mdxpanel.MdxPanelController.<init>(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, androidx.lifecycle.LifecycleOwner, com.netflix.android.mdxpanel.MdxPanelController$Experience):void");
    }

    /* loaded from: classes2.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("MdxPanelController");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Experience {
        private static final /* synthetic */ Experience[] a;
        private static final /* synthetic */ InterfaceC8598drn b;
        private final int e;
        public static final Experience d = new Experience("CLASSIC", 0, C9795wi.e.e);
        public static final Experience c = new Experience("BACKWARD_FORWARD_DEBOUNCE", 1, C9795wi.e.a);

        private static final /* synthetic */ Experience[] d() {
            return new Experience[]{d, c};
        }

        public static Experience valueOf(String str) {
            return (Experience) Enum.valueOf(Experience.class, str);
        }

        public static Experience[] values() {
            return (Experience[]) a.clone();
        }

        public final int a() {
            return this.e;
        }

        private Experience(String str, int i, int i2) {
            this.e = i2;
        }

        static {
            Experience[] d2 = d();
            a = d2;
            b = C8600drp.e(d2);
        }
    }

    public final Context d() {
        Context context = l().getContext();
        C8632dsu.a(context, "");
        return context;
    }

    public final Resources b() {
        Resources resources = l().getResources();
        C8632dsu.a(resources, "");
        return resources;
    }

    public final void a(a aVar) {
        this.f13122o.e(aVar);
    }

    public final boolean e() {
        return this.h.c();
    }

    public final void a(boolean z) {
        this.h.a(z);
    }

    public final int a() {
        if (this.w.getVisibility() == 0) {
            return b().getDimensionPixelSize(C9795wi.c.f);
        }
        return 0;
    }

    public void d(AbstractC9766wb abstractC9766wb) {
        C8632dsu.c((Object) abstractC9766wb, "");
        this.H.onNext(abstractC9766wb);
    }

    static /* synthetic */ void b(MdxPanelController mdxPanelController, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setVisible");
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        mdxPanelController.b(z, z2);
    }

    private final void b(boolean z, boolean z2) {
        int i = z ? 0 : 8;
        if (this.w.getVisibility() != i) {
            this.w.setVisibility(i);
            if (z2) {
                this.H.onNext(new AbstractC9766wb.V(z));
            }
        }
    }

    private final void b(boolean z) {
        b(!z, false);
        this.l = z;
    }

    public boolean g() {
        return this.h.e();
    }

    public final void j() {
        this.h.g();
    }

    /* loaded from: classes2.dex */
    public final class b {
        private final MdxBottomSheetBehavior<ConstraintLayout> a;
        private int b;
        private int c;
        final /* synthetic */ MdxPanelController d;
        private final float[] e;
        private final CoordinatorLayout f;
        private final float[] g;
        private final ColorDrawable h;
        private final float[] i;
        private float j;
        private final C1184Rx k;
        private final float[] l;
        private boolean m;
        private boolean n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f13123o;
        private Integer s;
        private final float[] t;

        public b(MdxPanelController mdxPanelController, CoordinatorLayout coordinatorLayout) {
            C8632dsu.c((Object) coordinatorLayout, "");
            this.d = mdxPanelController;
            this.f = coordinatorLayout;
            this.a = MdxBottomSheetBehavior.c.c(mdxPanelController.w);
            this.n = true;
            this.t = new float[]{mdxPanelController.b().getDimension(C9795wi.c.j), 0.0f};
            this.i = new float[]{0.0f, 0.0f};
            this.e = new float[]{0.0f, 0.0f};
            this.l = new float[]{0.0f, 0.0f};
            this.g = new float[]{0.0f, 178.5f};
            Context context = coordinatorLayout.getContext();
            C8632dsu.a(context, "");
            C1184Rx c1184Rx = new C1184Rx(context, null, 0, 6, null);
            c1184Rx.setId(C9795wi.a.p);
            this.k = c1184Rx;
            this.h = new ColorDrawable(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
        }

        public final boolean c() {
            return this.a.getState() == 3;
        }

        public final void a(boolean z) {
            this.m = z;
            if (this.a.getState() != 4) {
                this.a.setState(4);
            }
        }

        public final void e(boolean z) {
            this.n = z;
            this.a.c(z);
            this.d.d(z ? AbstractC9766wb.w.d : AbstractC9766wb.C9788x.a);
        }

        private final float e(float[] fArr, float f) {
            float f2 = fArr[0];
            return f2 + (f * (fArr[1] - f2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Rect f() {
            return this.a.c();
        }

        public final void d() {
            MdxPanelController.b(this.d, true, false, 2, null);
            if (this.f13123o) {
                return;
            }
            this.f13123o = true;
            g();
            this.k.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -1));
            this.k.setBackground(this.h);
            Observable<dpR> takeUntil = C9618tM.c(this.k).takeUntil(this.d.o());
            drM drm = this.d.z;
            C8632dsu.d(takeUntil);
            SubscribersKt.subscribeBy$default(takeUntil, drm, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.android.mdxpanel.MdxPanelController$BottomSheetBehaviorHelper$activate$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(dpR dpr) {
                    a(dpr);
                    return dpR.c;
                }

                public final void a(dpR dpr) {
                    MdxPanelController.b.this.e();
                }
            }, 2, (Object) null);
            Observable<dpR> takeUntil2 = C9618tM.c(this.d.i).takeUntil(this.d.o());
            C8632dsu.a(takeUntil2, "");
            SubscribersKt.subscribeBy$default(takeUntil2, this.d.z, (drO) null, (drM) null, 6, (Object) null);
            CoordinatorLayout coordinatorLayout = this.f;
            MdxPanelController mdxPanelController = this.d;
            coordinatorLayout.addView(this.k, coordinatorLayout.getChildCount());
            coordinatorLayout.addView(mdxPanelController.w, coordinatorLayout.indexOfChild(this.k) + 1);
            this.d.w.setClipToOutline(true);
            this.d.w.setOutlineProvider(new C0045b(this.d, this));
            ConstraintLayout constraintLayout = this.d.w;
            final MdxPanelController mdxPanelController2 = this.d;
            constraintLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o.wa
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets a;
                    a = MdxPanelController.b.a(MdxPanelController.b.this, mdxPanelController2, view, windowInsets);
                    return a;
                }
            });
            this.d.w.requestApplyInsets();
            this.a.setBottomSheetCallback(new c(this.d, this));
            final Runnable runnable = new Runnable() { // from class: o.vZ
                @Override // java.lang.Runnable
                public final void run() {
                    MdxPanelController.b.b(MdxPanelController.b.this);
                }
            };
            ConstraintLayout constraintLayout2 = this.d.w;
            final MdxPanelController mdxPanelController3 = this.d;
            constraintLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.wd
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    MdxPanelController.b.c(MdxPanelController.this, runnable, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }

        /* renamed from: com.netflix.android.mdxpanel.MdxPanelController$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0045b extends ViewOutlineProvider {
            final /* synthetic */ MdxPanelController a;
            final /* synthetic */ b b;

            C0045b(MdxPanelController mdxPanelController, b bVar) {
                this.a = mdxPanelController;
                this.b = bVar;
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                C8632dsu.c((Object) view, "");
                C8632dsu.c((Object) outline, "");
                Rect f = this.a.h.f();
                MdxPanelController mdxPanelController = this.a;
                b bVar = this.b;
                f.right = mdxPanelController.w.getMeasuredWidth();
                f.bottom = (mdxPanelController.w.getMeasuredHeight() - mdxPanelController.m.getMeasuredHeight()) + bVar.b;
                outline.setRect(f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WindowInsets a(b bVar, MdxPanelController mdxPanelController, View view, WindowInsets windowInsets) {
            C8632dsu.c((Object) bVar, "");
            C8632dsu.c((Object) mdxPanelController, "");
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) windowInsets, "");
            bVar.t[1] = mdxPanelController.b().getDimension(C9795wi.c.g) + windowInsets.getSystemWindowInsetTop();
            bVar.c = windowInsets.getSystemWindowInsetBottom();
            bVar.g();
            return windowInsets;
        }

        /* loaded from: classes2.dex */
        public static final class c extends BottomSheetBehavior.BottomSheetCallback {
            final /* synthetic */ MdxPanelController b;
            final /* synthetic */ b e;

            c(MdxPanelController mdxPanelController, b bVar) {
                this.b = mdxPanelController;
                this.e = bVar;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i) {
                C8632dsu.c((Object) view, "");
                if (i == 3) {
                    this.b.D.onNext(AbstractC9791we.d.a);
                } else if (i == 4) {
                    this.b.D.onNext(AbstractC9791we.e.c);
                }
                this.b.C.onNext(Integer.valueOf(i));
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view, float f) {
                C8632dsu.c((Object) view, "");
                this.e.j = f;
                this.e.i();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(b bVar) {
            C8632dsu.c((Object) bVar, "");
            bVar.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(MdxPanelController mdxPanelController, Runnable runnable, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C8632dsu.c((Object) mdxPanelController, "");
            C8632dsu.c((Object) runnable, "");
            if (i4 - i2 == i8 - i6 && i3 - i == i7 - i5) {
                return;
            }
            mdxPanelController.w.post(runnable);
        }

        public final void a() {
            MdxPanelController.b(this.d, false, false, 2, null);
            this.a.setState(4);
        }

        public final void g() {
            int dimensionPixelSize = this.d.g != null ? this.d.b().getDimensionPixelSize(C9834xU.a.a) : 0;
            this.a.setPeekHeight(this.d.E.getMeasuredHeight() + dimensionPixelSize + this.d.b().getDimensionPixelSize(C9795wi.c.f) + this.c);
            ViewGroup.LayoutParams layoutParams = this.d.f.getLayoutParams();
            C8632dsu.d(layoutParams);
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.d.E.getMeasuredHeight() + this.c + this.d.b().getDimensionPixelSize(C9795wi.c.i);
            i();
        }

        public final boolean e() {
            if (this.a.getState() == 4 || this.a.getState() == 5) {
                return false;
            }
            this.a.setState(4);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i() {
            Activity activity = (Activity) C9737vz.b(this.d.d(), Activity.class);
            dpR dpr = null;
            if (activity != null) {
                if (C9913yu.a(this.j, 0.0f)) {
                    Integer num = this.s;
                    if (num != null) {
                        int intValue = num.intValue();
                        MdxPanelController.b.getLogTag();
                        activity.setRequestedOrientation(intValue);
                        this.s = null;
                    }
                } else if (this.s == null) {
                    e eVar = MdxPanelController.b;
                    eVar.getLogTag();
                    this.s = Integer.valueOf(activity.getRequestedOrientation());
                    activity.setRequestedOrientation(14);
                    eVar.getLogTag();
                }
            }
            MdxPanelController mdxPanelController = this.d;
            float e = e(this.t, this.j);
            ConstraintLayout constraintLayout = mdxPanelController.w;
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) e, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
            mdxPanelController.e.setTranslationY(-e);
            this.h.setAlpha((int) e(this.g, this.j));
            this.k.setVisibility(this.h.getAlpha() <= 1 ? 8 : 0);
            if (this.d.g != null) {
                MdxPanelController mdxPanelController2 = this.d;
                this.i[1] = mdxPanelController2.g.getMeasuredHeight();
                this.b = (int) e(this.i, this.j);
                mdxPanelController2.w.invalidateOutline();
                this.e[0] = mdxPanelController2.g.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = mdxPanelController2.i.getLayoutParams();
                C8632dsu.d(layoutParams);
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) e(this.e, this.j);
                mdxPanelController2.i.requestLayout();
                dpr = dpR.c;
            }
            if (dpr == null) {
                this.d.i.setVisibility(8);
            }
            MdxPanelController mdxPanelController3 = this.d;
            this.l[0] = mdxPanelController3.w.getMeasuredHeight() - this.a.getPeekHeight();
            ViewGroup.LayoutParams layoutParams2 = mdxPanelController3.m.getLayoutParams();
            float e2 = e(this.l, this.j);
            View view = mdxPanelController3.g;
            layoutParams2.height = (int) (((e2 + (view != null ? view.getMeasuredHeight() : 0)) + this.c) - this.b);
            if (mdxPanelController3.m.getLayoutParams().height == 0) {
                mdxPanelController3.m.setVisibility(8);
            } else {
                mdxPanelController3.m.setVisibility(0);
                mdxPanelController3.m.requestLayout();
            }
            MdxPanelController mdxPanelController4 = this.d;
            mdxPanelController4.d(new AbstractC9766wb.M(this.j, mdxPanelController4.j.getMeasuredWidth()));
        }

        public final void b() {
            if (this.n) {
                int state = this.a.getState();
                if (state == 3) {
                    this.a.setState(4);
                } else if (state != 4) {
                } else {
                    this.a.setState(3);
                }
            }
        }
    }

    public final void d(boolean z) {
        if (this.k != null) {
            boolean z2 = (this.w.getWindowSystemUiVisibility() & 4096) == 4096 || z;
            if (this.w.getVisibility() == 0 && z2) {
                b(true);
            } else if (this.w.getVisibility() == 0 || !this.l || z2) {
            } else {
                b(false);
            }
        }
    }
}
