package com.netflix.mediaclient.ui.bulkrater.impl.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.PopupMenu;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView;
import java.nio.charset.StandardCharsets;
import java.util.List;
import o.C1045Mp;
import o.C1204Sr;
import o.C1332Xp;
import o.C1333Xq;
import o.C5410byI;
import o.C5437byj;
import o.C5444byq;
import o.C5445byr;
import o.C5447byt;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9702vQ;
import o.C9834xU;
import o.InterfaceC5367bxS;
import o.InterfaceC5405byD;
import o.InterfaceC8598drn;
import o.dsT;

/* loaded from: classes4.dex */
public final class RaterRowView extends LinearLayout {
    public static final b e;
    private static byte e$ss2$4510 = 0;
    private static int i = 0;
    private static int m = 1;
    private final C5444byq a;
    private boolean b;
    private final C5447byt c;
    private Animator d;
    private final C1333Xq f;
    private InterfaceC5405byD g;
    private boolean h;
    private State j;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[State.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    static {
        d();
        e = new b(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RaterRowView(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RaterRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    static void d() {
        e$ss2$4510 = (byte) 24;
    }

    public final State b() {
        return this.j;
    }

    public /* synthetic */ RaterRowView(Context context, AttributeSet attributeSet, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RaterRowView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C8632dsu.c((Object) context, "");
        this.f = C1333Xq.d(C5437byj.d.c);
        this.h = true;
        setOrientation(1);
        setId(C9834xU.g.D);
        View.inflate(context, C5437byj.b.b, this);
        C5444byq a2 = C5444byq.a(this);
        C8632dsu.a(a2, "");
        this.a = a2;
        C5447byt e2 = C5447byt.e(this);
        C8632dsu.a(e2, "");
        this.c = e2;
        C1332Xp c1332Xp = C1332Xp.b;
        setPadding(getPaddingLeft(), (int) TypedValue.applyDimension(1, 10, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), getPaddingRight(), getPaddingBottom());
        a2.b.e(new ViewPager2.OnPageChangeCallback() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.4
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i3, float f2, int i4) {
                int b2;
                RaterRowView raterRowView = RaterRowView.this;
                b2 = dsT.b(i3 + f2 + 0.2d);
                raterRowView.d(b2 + 1);
            }
        });
        a2.b.setPayoffListener(new C5410byI.d() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.3
            /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
            @Override // o.C5410byI.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void b(long r7, java.util.Map<java.lang.Integer, java.lang.Integer> r9) {
                /*
                    r6 = this;
                    java.lang.String r7 = ""
                    o.C8632dsu.c(r9, r7)
                    boolean r7 = r9.isEmpty()
                    if (r7 == 0) goto L18
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView r0 = com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.this
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView$State r1 = com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.State.a
                    r2 = 0
                    r4 = 2
                    r5 = 0
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.c(r0, r1, r2, r4, r5)
                    goto L8e
                L18:
                    boolean r7 = r9.isEmpty()
                    r0 = 300(0x12c, double:1.48E-321)
                    if (r7 == 0) goto L21
                    goto L87
                L21:
                    java.util.Set r7 = r9.entrySet()
                    java.util.Iterator r7 = r7.iterator()
                L29:
                    boolean r8 = r7.hasNext()
                    if (r8 == 0) goto L87
                    java.lang.Object r8 = r7.next()
                    java.util.Map$Entry r8 = (java.util.Map.Entry) r8
                    java.lang.Object r2 = r8.getValue()
                    if (r2 == 0) goto L29
                    java.lang.Object r8 = r8.getValue()
                    java.lang.Integer r8 = (java.lang.Integer) r8
                    if (r8 != 0) goto L44
                    goto L4b
                L44:
                    int r8 = r8.intValue()
                    if (r8 != 0) goto L4b
                    goto L29
                L4b:
                    boolean r7 = r9.isEmpty()
                    if (r7 == 0) goto L52
                    goto L7f
                L52:
                    java.util.Set r7 = r9.entrySet()
                    java.util.Iterator r7 = r7.iterator()
                L5a:
                    boolean r8 = r7.hasNext()
                    if (r8 == 0) goto L7f
                    java.lang.Object r8 = r7.next()
                    java.util.Map$Entry r8 = (java.util.Map.Entry) r8
                    java.lang.Object r8 = r8.getValue()
                    java.lang.Integer r8 = (java.lang.Integer) r8
                    if (r8 != 0) goto L6f
                    goto L77
                L6f:
                    int r8 = r8.intValue()
                    r9 = 1
                    if (r8 != r9) goto L77
                    goto L5a
                L77:
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView r7 = com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.this
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView$State r8 = com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.State.a
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.b(r7, r8, r0)
                    goto L8e
                L7f:
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView r7 = com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.this
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView$State r8 = com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.State.d
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.b(r7, r8, r0)
                    goto L8e
                L87:
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView r7 = com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.this
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView$State r8 = com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.State.c
                    com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.b(r7, r8, r0)
                L8e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.AnonymousClass3.b(long, java.util.Map):void");
            }
        });
        a2.i.setOnClickListener(new View.OnClickListener() { // from class: o.byG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RaterRowView.b(RaterRowView.this, view);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("RaterRowView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final RaterRowView raterRowView, View view) {
        C8632dsu.c((Object) raterRowView, "");
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        popupMenu.getMenu().add(C5437byj.d.a);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: o.byC
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean c2;
                c2 = RaterRowView.c(RaterRowView.this, menuItem);
                return c2;
            }
        });
        popupMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(RaterRowView raterRowView, MenuItem menuItem) {
        C8632dsu.c((Object) raterRowView, "");
        raterRowView.e(State.e, 300L);
        InterfaceC5405byD interfaceC5405byD = raterRowView.g;
        if (interfaceC5405byD != null) {
            interfaceC5405byD.c(true);
        }
        return true;
    }

    public final int c() {
        return this.c.c.getId();
    }

    public final void setTitles(List<? extends InterfaceC5367bxS> list) {
        C8632dsu.c((Object) list, "");
        boolean z = this.a.b.c() == 0;
        this.a.b.setTitles(list);
        if (z) {
            d(0);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RaterRowView.this.d = null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Animator.AnimatorListener {
        final /* synthetic */ C5445byr a;
        final /* synthetic */ State b;
        final /* synthetic */ RaterRowView c;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public g(C5445byr c5445byr, RaterRowView raterRowView, State state) {
            this.a = c5445byr;
            this.c = raterRowView;
            this.b = state;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b.setOnClickListener(new j(this.b));
            this.c.d = null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements Animator.AnimatorListener {
        final /* synthetic */ State a;
        final /* synthetic */ View d;
        final /* synthetic */ long e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public h(View view, long j, State state) {
            this.d = view;
            this.e = j;
            this.a = state;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5410byI c5410byI = RaterRowView.this.a.b;
            C8632dsu.a(c5410byI, "");
            c5410byI.setVisibility(8);
            ConstraintLayout constraintLayout = RaterRowView.this.a.j;
            C8632dsu.a(constraintLayout, "");
            constraintLayout.setVisibility(8);
            View view = this.d;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            View view2 = this.d;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View e = RaterRowView.this.e();
            C5445byr a = C5445byr.a(e);
            C8632dsu.a(a, "");
            e.setVisibility(0);
            e.setAlpha(0.0f);
            RaterRowView raterRowView = RaterRowView.this;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(this.e / 2);
            ofFloat.addUpdateListener(new e(e));
            C8632dsu.d(ofFloat);
            ofFloat.addListener(new g(a, RaterRowView.this, this.a));
            ofFloat.start();
            raterRowView.d = ofFloat;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements Animator.AnimatorListener {
        final /* synthetic */ boolean a;
        final /* synthetic */ State b;
        final /* synthetic */ long c;
        final /* synthetic */ View d;
        final /* synthetic */ boolean e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public i(View view, boolean z, boolean z2, State state, long j) {
            this.d = view;
            this.e = z;
            this.a = z2;
            this.b = state;
            this.c = j;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5410byI c5410byI = RaterRowView.this.a.b;
            C8632dsu.a(c5410byI, "");
            c5410byI.setVisibility(8);
            C1204Sr c1204Sr = RaterRowView.this.a.l;
            C8632dsu.a(c1204Sr, "");
            c1204Sr.setVisibility(8);
            View view = this.d;
            if (view != null) {
                view.setVisibility(8);
            }
            ConstraintLayout constraintLayout = RaterRowView.this.a.j;
            C8632dsu.a(constraintLayout, "");
            constraintLayout.setVisibility(0);
            if (this.e) {
                RaterRowView.this.a.j.setAlpha(0.0f);
            }
            NetflixImageView netflixImageView = RaterRowView.this.a.i;
            C8632dsu.a(netflixImageView, "");
            netflixImageView.setVisibility(0);
            if (this.a) {
                RaterRowView.this.a.i.setAlpha(0.0f);
            }
            View h = RaterRowView.this.h();
            RaterRowView.this.c(this.b);
            h.setVisibility(0);
            h.setAlpha(0.0f);
            RaterRowView raterRowView = RaterRowView.this;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(this.c / 2);
            ofFloat.addUpdateListener(new d(this.e, RaterRowView.this, this.a, h));
            C8632dsu.d(ofFloat);
            ofFloat.addListener(new f());
            ofFloat.start();
            raterRowView.d = ofFloat;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n implements Animator.AnimatorListener {
        final /* synthetic */ long a;
        final /* synthetic */ View b;
        final /* synthetic */ boolean c;
        final /* synthetic */ boolean d;
        final /* synthetic */ View e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public n(View view, View view2, boolean z, boolean z2, long j) {
            this.b = view;
            this.e = view2;
            this.c = z;
            this.d = z2;
            this.a = j;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1204Sr c1204Sr = RaterRowView.this.a.l;
            C8632dsu.a(c1204Sr, "");
            c1204Sr.setVisibility(8);
            NetflixImageView netflixImageView = RaterRowView.this.a.i;
            C8632dsu.a(netflixImageView, "");
            netflixImageView.setVisibility(8);
            View view = this.b;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.e;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (this.c) {
                C5410byI c5410byI = RaterRowView.this.a.b;
                C8632dsu.a(c5410byI, "");
                c5410byI.setVisibility(0);
                RaterRowView.this.a.b.setAlpha(0.0f);
            }
            if (this.d) {
                ConstraintLayout constraintLayout = RaterRowView.this.a.j;
                C8632dsu.a(constraintLayout, "");
                constraintLayout.setVisibility(0);
                RaterRowView.this.a.j.setAlpha(0.0f);
            }
            if (this.c || this.d) {
                RaterRowView raterRowView = RaterRowView.this;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(this.a / 2);
                ofFloat.addUpdateListener(new c(this.c, RaterRowView.this, this.d));
                C8632dsu.d(ofFloat);
                ofFloat.addListener(new o());
                ofFloat.start();
                raterRowView.d = ofFloat;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public o() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RaterRowView.this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i2) {
        this.a.l.setText(this.f.d("current", Integer.valueOf(i2)).d("total", Integer.valueOf(this.a.b.c())).c());
    }

    static /* synthetic */ void c(RaterRowView raterRowView, State state, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        raterRowView.e(state, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(RaterRowView raterRowView, View view, View view2, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) raterRowView, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        raterRowView.a.l.setAlpha(floatValue);
        raterRowView.a.i.setAlpha(floatValue);
        if (view != null) {
            view.setAlpha(floatValue);
        }
        if (view2 == null) {
            return;
        }
        view2.setAlpha(floatValue);
    }

    /* loaded from: classes4.dex */
    static final class c implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ RaterRowView a;
        final /* synthetic */ boolean d;
        final /* synthetic */ boolean e;

        c(boolean z, RaterRowView raterRowView, boolean z2) {
            this.d = z;
            this.a = raterRowView;
            this.e = z2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8632dsu.c((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.d) {
                this.a.a.b.setAlpha(floatValue);
            }
            if (this.e) {
                this.a.a.j.setAlpha(floatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(RaterRowView raterRowView, View view, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) raterRowView, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        raterRowView.a.b.setAlpha(floatValue);
        if (view == null) {
            return;
        }
        view.setAlpha(floatValue);
    }

    /* loaded from: classes4.dex */
    static final class d implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ boolean a;
        final /* synthetic */ View b;
        final /* synthetic */ RaterRowView d;
        final /* synthetic */ boolean e;

        d(boolean z, RaterRowView raterRowView, boolean z2, View view) {
            this.a = z;
            this.d = raterRowView;
            this.e = z2;
            this.b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8632dsu.c((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.a) {
                this.d.a.j.setAlpha(floatValue);
            }
            if (this.e) {
                this.d.a.i.setAlpha(floatValue);
            }
            this.b.setAlpha(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(RaterRowView raterRowView, View view, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) raterRowView, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        raterRowView.a.b.setAlpha(floatValue);
        raterRowView.a.j.setAlpha(floatValue);
        if (view == null) {
            return;
        }
        view.setAlpha(floatValue);
    }

    /* loaded from: classes4.dex */
    static final class e implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View c;

        e(View view) {
            this.c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8632dsu.c((Object) valueAnimator, "");
            View view = this.c;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            view.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class j implements View.OnClickListener {
        final /* synthetic */ State d;

        j(State state) {
            this.d = state;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RaterRowView raterRowView = RaterRowView.this;
            State state = this.d;
            if (state == null) {
                state = State.b;
            }
            raterRowView.e(state, 200L);
            InterfaceC5405byD interfaceC5405byD = RaterRowView.this.g;
            if (interfaceC5405byD != null) {
                interfaceC5405byD.c(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(RaterRowView raterRowView, State state, View view) {
        C8632dsu.c((Object) raterRowView, "");
        if (state == null) {
            state = State.b;
        }
        raterRowView.e(state, 200L);
        InterfaceC5405byD interfaceC5405byD = raterRowView.g;
        if (interfaceC5405byD != null) {
            interfaceC5405byD.c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(State state) {
        int i2;
        int i3 = 2 % 2;
        int i4 = i + 13;
        m = i4 % 128;
        int i5 = i4 % 2;
        TextView textView = (TextView) h().findViewById(C5437byj.c.A);
        State state2 = State.c;
        int i6 = state == state2 ? C5437byj.d.e : C5437byj.d.f;
        Context context = textView.getContext();
        String string = context.getString(i6);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            k(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i6);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                string = spannableString;
            }
        }
        textView.setText(string);
        TextView textView2 = (TextView) h().findViewById(C5437byj.c.m);
        if (state == state2) {
            int i7 = m + 125;
            i = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = C5437byj.d.b;
                int i8 = 68 / 0;
            } else {
                i2 = C5437byj.d.b;
            }
        } else {
            i2 = C5437byj.d.d;
        }
        Context context2 = textView2.getContext();
        String string2 = context2.getString(i2);
        if (string2.startsWith("'!#+")) {
            Object[] objArr2 = new Object[1];
            k(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
            CharSequence text2 = context2.getText(i2);
            if (text2 instanceof Spanned) {
                SpannableString spannableString2 = new SpannableString(string2);
                TextUtils.copySpansFrom((SpannedString) text2, 0, string2.length(), Object.class, spannableString2, 0);
                int i9 = m + 81;
                i = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 2;
                }
                string2 = spannableString2;
            }
        }
        textView2.setText(string2);
    }

    private final View b(int i2) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof ViewStub) {
            return null;
        }
        return findViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View e() {
        View b2 = b(C5437byj.c.h);
        if (b2 == null) {
            View inflate = ((ViewStub) findViewById(C5437byj.c.h)).inflate();
            C8632dsu.a(inflate, "");
            return inflate;
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View h() {
        View b2 = b(C5437byj.c.j);
        if (b2 == null) {
            View inflate = ((ViewStub) findViewById(C5437byj.c.j)).inflate();
            C8632dsu.a(inflate, "");
            return inflate;
        }
        return b2;
    }

    public final void setDismissState() {
        c(this, State.e, 0L, 2, null);
    }

    public final void b(boolean z) {
        this.b = z;
        if (this.j == State.b) {
            this.a.b.c(z);
        }
    }

    public final void setRaterRowListener(InterfaceC5405byD interfaceC5405byD) {
        C8632dsu.c((Object) interfaceC5405byD, "");
        this.g = interfaceC5405byD;
        this.a.b.setRatingListener(interfaceC5405byD);
    }

    public final void a() {
        c(this, State.b, 0L, 2, null);
    }

    public static /* synthetic */ void b(RaterRowView raterRowView, boolean z, boolean z2, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            j2 = -1;
        }
        raterRowView.a(z, z2, j2);
    }

    public final void a(boolean z, boolean z2, long j2) {
        if (j2 == -1) {
            State state = this.j;
            j2 = (state == null || (!(z && state == State.a) && (z || state == State.a))) ? 0L : 300L;
        }
        if (z && z2) {
            e(State.c, j2);
        } else if (z) {
            e(State.d, j2);
        } else {
            e(State.a, j2);
            this.a.b.e(true);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = (this.a.j.getMeasuredWidth() - this.a.j.getPaddingLeft()) - this.a.j.getPaddingRight();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C5437byj.a.d);
        if (measuredWidth > 0) {
            C1204Sr c1204Sr = this.a.c;
            C8632dsu.a(c1204Sr, "");
            int c2 = c(c1204Sr);
            C1204Sr c1204Sr2 = this.a.l;
            C8632dsu.a(c1204Sr2, "");
            this.h = (c2 + c(c1204Sr2)) + dimensionPixelSize < measuredWidth;
            if (this.j == State.b) {
                C1204Sr c1204Sr3 = this.a.l;
                C8632dsu.a(c1204Sr3, "");
                if ((c1204Sr3.getVisibility() == 0) != this.h) {
                    C1204Sr c1204Sr4 = this.a.l;
                    C8632dsu.a(c1204Sr4, "");
                    c1204Sr4.setVisibility(this.h ? 0 : 8);
                    C9702vQ.e(this);
                }
            }
        }
    }

    private final int c(View view) {
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return measuredWidth + i2 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class State {
        private static final /* synthetic */ InterfaceC8598drn f;
        private static final /* synthetic */ State[] i;
        public static final State b = new State("Rating", 0);
        public static final State a = new State("Payoff", 1);
        public static final State d = new State("EmptyPayoff", 2);
        public static final State c = new State("EmptyPayoffSkipped", 3);
        public static final State e = new State("Dismissed", 4);

        private static final /* synthetic */ State[] c() {
            return new State[]{b, a, d, c, e};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) i.clone();
        }

        private State(String str, int i2) {
        }

        static {
            State[] c2 = c();
            i = c2;
            f = C8600drp.e(c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b4, code lost:
        if (r1.getVisibility() == 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.State r17, long r18) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView.e(com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView$State, long):void");
    }

    private final void f() {
        if (this.b) {
            return;
        }
        setVisibility(8);
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$4510);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
