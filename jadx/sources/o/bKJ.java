package o;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.model.leafs.ArtworkColors;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import o.C3796bKz;
import o.C3798bLa;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class bKJ extends HorizontalScrollView {
    public static final d b = new d(null);
    public static final int c = 8;
    private static final Pair<Integer, Integer> d = new Pair<>(0, 0);
    private static final FastOutSlowInInterpolator e = new FastOutSlowInInterpolator();
    private MotionScene.Transition a;
    private int f;
    private List<e> g;
    private int h;
    private int i;
    private final View.OnClickListener j;
    private final List<TextView> k;
    private final View l;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private final MotionLayout f13514o;
    private drM<? super ViewGroup, ? extends TextView> r;
    private c t;

    /* loaded from: classes4.dex */
    public interface c {
        void a(View view, int i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bKJ(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bKJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final void setTabSelectedListener(c cVar) {
        this.t = cVar;
    }

    public /* synthetic */ bKJ(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bKJ(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        List<e> i2;
        C8632dsu.c((Object) context, "");
        this.f = -65536;
        this.n = -65536;
        this.m = -65536;
        this.k = new ArrayList();
        MotionLayout motionLayout = new MotionLayout(context);
        motionLayout.setId(C3796bKz.a.t);
        this.f13514o = motionLayout;
        View view = new View(context);
        view.setId(C3796bKz.a.v);
        view.setBackgroundResource(C3796bKz.e.e);
        this.l = view;
        i2 = C8569dql.i();
        this.g = i2;
        this.r = new drM<ViewGroup, C3798bLa>() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.ScrollableTabBar$textViewProvider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final C3798bLa invoke(ViewGroup viewGroup) {
                C8632dsu.c((Object) viewGroup, "");
                C3798bLa c3798bLa = new C3798bLa(context, null, 0, 6, null);
                c3798bLa.setPadding(70, 40, 70, 40);
                return c3798bLa;
            }
        };
        this.j = new View.OnClickListener() { // from class: o.bKG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bKJ.c(bKJ.this, view2);
            }
        };
        addView(motionLayout, -2, -2);
        motionLayout.addView(view, 0, 0);
        motionLayout.loadLayoutDescription(C3796bKz.f.d);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3796bKz.h.d, i, 0);
        C8632dsu.a(obtainStyledAttributes, "");
        setDefaultTextColor(obtainStyledAttributes.getColor(C3796bKz.h.b, -65536));
        setSelectedTextColor(obtainStyledAttributes.getColor(C3796bKz.h.a, -65536));
        setSelectorColor(obtainStyledAttributes.getColor(C3796bKz.h.c, ArtworkColors.DEFAULT_BACKGROUND_COLOR));
        setItemDividerWidth(obtainStyledAttributes.getDimensionPixelSize(C3796bKz.h.e, 0));
        obtainStyledAttributes.recycle();
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("ScrollableTabBar");
        }
    }

    public final void setDefaultTextColor(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        e();
    }

    public final void setSelectedTextColor(int i) {
        if (this.n == i) {
            return;
        }
        this.n = i;
        e();
    }

    public final void setSelectorColor(int i) {
        if (this.m == i) {
            return;
        }
        this.m = i;
        this.l.setBackgroundTintList(ColorStateList.valueOf(i));
    }

    public final void setItemDividerWidth(int i) {
        if (this.h == i) {
            return;
        }
        this.h = i;
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bKJ bkj, View view) {
        int a;
        C8632dsu.c((Object) bkj, "");
        a = C8576dqs.a(bkj.k, view);
        if (a != -1) {
            bkj.b(a);
            c cVar = bkj.t;
            if (cVar != null) {
                C8632dsu.d(view);
                cVar.a(view, a);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"MissingSuperCall"})
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        C8632dsu.c((Object) sparseArray, "");
        if (ConfigFastPropertyFeatureControlConfig.Companion.n().getScrollableTabBarRestoreSkip()) {
            return;
        }
        super.dispatchRestoreInstanceState(sparseArray);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        C8632dsu.c((Object) accessibilityNodeInfo, "");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.k.size(), false, 1));
    }

    public static /* synthetic */ void setSectionIconsAndTitles$default(bKJ bkj, List list, drM drm, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = bkj.i;
        }
        bkj.setSectionIconsAndTitles(list, drm, i);
    }

    public final void setSectionIconsAndTitles(List<e> list, drM<? super ViewGroup, ? extends TextView> drm, int i) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) drm, "");
        if (C8632dsu.c(list, this.g) && i == this.i) {
            return;
        }
        this.i = i;
        this.g = list;
        this.r = drm;
        e();
        b(i);
        if (getLayoutDirection() == 1) {
            OneShotPreDrawListener.add(this, new b(this, this));
        }
    }

    private final void e() {
        TextView invoke;
        Object r;
        this.i = Math.max(0, Math.min(this.i, this.g.size() - 1));
        MotionLayout motionLayout = this.f13514o;
        for (int childCount = motionLayout.getChildCount() - 1; -1 < childCount; childCount--) {
            if (motionLayout.getChildAt(childCount) instanceof TextView) {
                motionLayout.removeViewAt(childCount);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.k);
        this.k.clear();
        for (e eVar : this.g) {
            if (!arrayList.isEmpty()) {
                r = C8571dqn.r(arrayList);
                invoke = (TextView) r;
            } else {
                invoke = this.r.invoke(this.f13514o);
            }
            invoke.setId(View.generateViewId());
            invoke.setText(eVar.c());
            if (eVar.d()) {
                invoke.setCompoundDrawablesRelativeWithIntrinsicBounds(eVar.e(), (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                invoke.setCompoundDrawablesRelative(eVar.e(), null, null, null);
            }
            this.k.add(invoke);
            View.OnClickListener onClickListener = this.j;
            invoke.setOnClickListener(onClickListener);
            invoke.setClickable(onClickListener != null);
            invoke.setBackgroundResource(C3796bKz.e.a);
            motionLayout.addView(invoke);
        }
        c();
    }

    private final void c() {
        MotionLayout motionLayout = this.f13514o;
        MotionScene.Transition transition = motionLayout.getTransition(C3796bKz.a.e);
        C8632dsu.a(transition, "");
        this.a = transition;
        MotionScene.Transition transition2 = null;
        if (transition == null) {
            C8632dsu.d("");
            transition = null;
        }
        ConstraintSet constraintSet = motionLayout.getConstraintSet(transition.getStartConstraintSetId());
        constraintSet.clone(motionLayout);
        C8632dsu.d(constraintSet);
        e(constraintSet, this.i);
        MotionScene.Transition transition3 = this.a;
        if (transition3 == null) {
            C8632dsu.d("");
        } else {
            transition2 = transition3;
        }
        ConstraintSet constraintSet2 = motionLayout.getConstraintSet(transition2.getEndConstraintSetId());
        constraintSet2.clone(motionLayout);
        C8632dsu.d(constraintSet2);
        e(constraintSet2, this.i);
        constraintSet.applyTo(motionLayout);
        motionLayout.setTransition(C3796bKz.a.e);
    }

    public final boolean b(int i) {
        if (this.i != i && i >= 0 && i < this.k.size()) {
            MotionLayout motionLayout = this.f13514o;
            MotionScene.Transition transition = this.a;
            MotionScene.Transition transition2 = null;
            if (transition == null) {
                C8632dsu.d("");
                transition = null;
            }
            ConstraintSet constraintSet = motionLayout.getConstraintSet(transition.getStartConstraintSetId());
            C8632dsu.d(constraintSet);
            e(constraintSet, this.i);
            MotionScene.Transition transition3 = this.a;
            if (transition3 == null) {
                C8632dsu.d("");
                transition3 = null;
            }
            ConstraintSet constraintSet2 = motionLayout.getConstraintSet(transition3.getEndConstraintSetId());
            constraintSet2.clone(motionLayout);
            C8632dsu.d(constraintSet2);
            e(constraintSet2, i);
            MotionScene.Transition transition4 = this.a;
            if (transition4 == null) {
                C8632dsu.d("");
                transition4 = null;
            }
            int startConstraintSetId = transition4.getStartConstraintSetId();
            MotionScene.Transition transition5 = this.a;
            if (transition5 == null) {
                C8632dsu.d("");
            } else {
                transition2 = transition5;
            }
            motionLayout.setTransition(startConstraintSetId, transition2.getEndConstraintSetId());
            motionLayout.transitionToEnd();
            int d2 = d(i);
            if (d2 != getScrollX()) {
                ObjectAnimator duration = ObjectAnimator.ofInt(this, "scrollX", d2).setDuration(400L);
                C8632dsu.a(duration, "");
                duration.setInterpolator(e);
                duration.start();
            }
            this.i = i;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(int i) {
        int c2;
        int width = ((this.f13514o.getWidth() + getPaddingStart()) + getPaddingEnd()) - getWidth();
        if (width <= 0) {
            return 0;
        }
        Pair<Integer, Integer> e2 = e(i);
        c2 = C8657dts.c(((e2.c().intValue() + e2.b().intValue()) / 2) - (getWidth() / 2), 0, width);
        return c2;
    }

    private final Pair<Integer, Integer> e(int i) {
        if (i >= 0 || i < this.k.size()) {
            TextView textView = this.k.get(i);
            return new Pair<>(Integer.valueOf(((int) textView.getX()) + getPaddingStart()), Integer.valueOf(((int) textView.getX()) + textView.getWidth() + getPaddingStart()));
        }
        return d;
    }

    /* loaded from: classes4.dex */
    public static final class e {
        private final CharSequence a;
        private final boolean c;
        private final Drawable d;

        public final CharSequence c() {
            return this.a;
        }

        public final boolean d() {
            return this.c;
        }

        public final Drawable e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.a, eVar.a) && C8632dsu.c(this.d, eVar.d) && this.c == eVar.c;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            Drawable drawable = this.d;
            return (((hashCode * 31) + (drawable == null ? 0 : drawable.hashCode())) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            CharSequence charSequence = this.a;
            Drawable drawable = this.d;
            boolean z = this.c;
            return "Item(title=" + ((Object) charSequence) + ", icon=" + drawable + ", intrinsicIconSize=" + z + ")";
        }

        public e(CharSequence charSequence, Drawable drawable, boolean z) {
            C8632dsu.c((Object) charSequence, "");
            this.a = charSequence;
            this.d = drawable;
            this.c = z;
        }

        public /* synthetic */ e(CharSequence charSequence, Drawable drawable, boolean z, int i, C8627dsp c8627dsp) {
            this(charSequence, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? true : z);
        }
    }

    private final ConstraintSet e(ConstraintSet constraintSet, int i) {
        boolean z;
        int i2;
        boolean z2;
        int i3;
        int d2;
        int[] m;
        int i4 = 0;
        int i5 = 0;
        for (Object obj : this.k) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                C8569dql.h();
            }
            TextView textView = (TextView) obj;
            if (i5 == 0) {
                constraintSet.connect(textView.getId(), 3, i4, 3);
                z = true;
                constraintSet.connect(textView.getId(), 6, 0, 6, this.h);
                if (this.k.size() > 1) {
                    List<TextView> list = this.k;
                    d2 = C8572dqo.d(list, 10);
                    ArrayList arrayList = new ArrayList(d2);
                    for (TextView textView2 : list) {
                        arrayList.add(Integer.valueOf(textView2.getId()));
                    }
                    m = C8576dqs.m(arrayList);
                    constraintSet.createHorizontalChainRtl(0, 6, 0, 7, m, null, 2);
                    constraintSet.setHorizontalBias(textView.getId(), 0.0f);
                    constraintSet.connect(textView.getId(), 7, this.k.get(i6).getId(), 6, this.h);
                }
                i3 = i;
                i2 = 7;
                z2 = 0;
            } else {
                z = true;
                if (i5 == this.k.size() - 1) {
                    i2 = 7;
                    constraintSet.connect(textView.getId(), 6, this.k.get(i5 - 1).getId(), 7);
                    z2 = 0;
                    constraintSet.connect(textView.getId(), 7, 0, 7);
                } else {
                    i2 = 7;
                    z2 = 0;
                    constraintSet.connect(this.k.get(i5 - 1).getId(), 7, textView.getId(), 6, this.h);
                    constraintSet.connect(textView.getId(), 7, this.k.get(i6).getId(), 6, this.h);
                }
                i3 = i;
            }
            boolean z3 = i5 == i3 ? z : z2;
            textView.setSelected(z3);
            if (z3) {
                constraintSet.connect(C3796bKz.a.v, 6, textView.getId(), 6);
                constraintSet.connect(C3796bKz.a.v, 3, textView.getId(), 3);
                constraintSet.connect(C3796bKz.a.v, i2, textView.getId(), i2);
                constraintSet.connect(C3796bKz.a.v, 4, textView.getId(), 4);
                constraintSet.setColorValue(textView.getId(), "TextColor", this.n);
            } else {
                constraintSet.setColorValue(textView.getId(), "TextColor", this.f);
            }
            i4 = z2;
            i5 = i6;
        }
        return constraintSet;
    }

    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        final /* synthetic */ View b;
        final /* synthetic */ bKJ d;

        public b(View view, bKJ bkj) {
            this.b = view;
            this.d = bkj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            bKJ bkj = this.d;
            bkj.scrollTo(bkj.d(bkj.i), 0);
        }
    }
}
