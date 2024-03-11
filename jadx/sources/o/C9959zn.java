package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.zn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9959zn extends ViewGroup {
    private int a;
    private int b;
    private final View.OnClickListener c;
    private final List<Integer> f;
    private e g;
    private int h;
    private int i;
    private Drawable j;
    private final List<Integer> k;
    private d l;
    private final SparseIntArray m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private final List<Integer> f13935o;
    private int q;
    private final List<Integer> r;
    private final LinkedList<View> s;
    public static final c e = new c(null);
    public static final int d = 8;

    /* renamed from: o.zn$d */
    /* loaded from: classes2.dex */
    public interface d {

        /* renamed from: o.zn$d$e */
        /* loaded from: classes2.dex */
        public static final class e {
            public static void c(d dVar, int i) {
            }
        }

        CharSequence a(int i);

        int c();

        void d(int i);

        void e(List<Integer> list);

        boolean e(int i);
    }

    /* renamed from: o.zn$e */
    /* loaded from: classes2.dex */
    public interface e {
        void c(View view, int i, int i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9959zn(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9959zn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final d b() {
        return this.l;
    }

    public final void setHorizontalSpacing(int i) {
        this.b = i;
    }

    public final void setMaxLines(int i) {
        this.h = i;
    }

    public final void setOnTagClickListener(e eVar) {
        this.g = eVar;
    }

    public final void setSeparatorPadding(int i) {
        this.i = i;
    }

    public final void setTagLayoutRes(int i) {
        this.n = i;
    }

    public final void setVerticalSpacing(int i) {
        this.q = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9959zn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.n = -1;
        this.i = getResources().getDimensionPixelOffset(C9834xU.a.X);
        this.f = new ArrayList();
        this.f13935o = new ArrayList();
        this.k = new ArrayList();
        this.s = new LinkedList<>();
        this.m = new SparseIntArray();
        this.h = Integer.MAX_VALUE;
        this.a = 8388611;
        this.c = new View.OnClickListener() { // from class: o.zv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9959zn.d(C9959zn.this, view);
            }
        };
        this.r = new ArrayList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9834xU.n.av);
            C8632dsu.a(obtainStyledAttributes, "");
            try {
                this.h = obtainStyledAttributes.getInt(C9834xU.n.as, this.h);
                this.b = obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.au, 0);
                this.q = obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.az, 0);
                this.n = obtainStyledAttributes.getResourceId(C9834xU.n.aw, this.n);
                setGravity(obtainStyledAttributes.getLayoutDimension(C9834xU.n.at, 8388611));
                this.i = obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.ay, this.i);
                if (obtainStyledAttributes.hasValue(C9834xU.n.ax)) {
                    setSeparatorDrawable(obtainStyledAttributes.getDrawable(C9834xU.n.ax));
                }
                if (this.n != -1) {
                    return;
                }
                throw new IllegalArgumentException("Attribute tl_layoutRes is mandatory and should be a layout res id");
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public /* synthetic */ C9959zn(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: o.zn$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i, int i2, int i3, int i4) {
            int i5 = i4 - i3;
            if (i == 1) {
                i5 /= 2;
            } else if (i != 5) {
                if (i == 17) {
                    i5 /= 2;
                } else if (i != 8388613) {
                    i5 = 0;
                }
            }
            return i2 == 1 ? -i5 : i5;
        }
    }

    public final void setSeparatorDrawable(Drawable drawable) {
        this.j = drawable;
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public final void setGravity(int i) {
        this.a = i;
        requestLayout();
    }

    public final void setAdapter(d dVar) {
        for (View view : C9703vR.e(this)) {
            view.setVisibility(8);
        }
        this.l = dVar;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C9959zn c9959zn, View view) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) c9959zn, "");
        int indexOfChild = c9959zn.indexOfChild(view);
        int i = c9959zn.m.get(indexOfChild);
        e eVar = c9959zn.g;
        if (eVar != null) {
            d b = c9959zn.b();
            int c2 = b != null ? b.c() : 0;
            if (i < 0 || i >= c2) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String str = "Tag click out of bounds (p=" + i + ", s=" + c2 + ")";
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        c1596aHd.a(errorType.c() + " " + b2);
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
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                    return;
                } else {
                    dVar.e().b(c1596aHd, th);
                    return;
                }
            }
            C8632dsu.d(view);
            eVar.c(view, i, indexOfChild);
        }
    }

    private final View b(int i) {
        if (i < e()) {
            d b = b();
            boolean z = b != null && b.e(i);
            View childAt = getChildAt(i);
            if (childAt == null) {
                childAt = LayoutInflater.from(getContext()).inflate(this.n, (ViewGroup) this, false);
                addViewInLayout(childAt, -1, new a(-2, -2), true);
            }
            childAt.setVisibility(0);
            TextView textView = (TextView) childAt.findViewById(C9834xU.g.ac);
            d b2 = b();
            textView.setText(b2 != null ? b2.a(i) : null);
            C8632dsu.d(childAt);
            View.OnClickListener onClickListener = z ? this.c : null;
            childAt.setOnClickListener(onClickListener);
            childAt.setClickable(onClickListener != null);
            return childAt;
        }
        return null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        Drawable drawable = this.j;
        if (drawable == null || this.f.size() != this.f13935o.size()) {
            return;
        }
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            int intValue = this.f.get(i).intValue();
            int intValue2 = this.f13935o.get(i).intValue();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            canvas.save();
            drawable.setBounds(intValue, intValue2, intrinsicWidth + intValue, intrinsicHeight + intValue2);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    private final int e() {
        d b = b();
        if (b != null) {
            return b.c();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01e6 A[LOOP:1: B:72:0x01e0->B:74:0x01e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0261 A[LOOP:4: B:91:0x0259->B:93:0x0261, LOOP_END] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r20, int r21) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9959zn.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Iterable<View> e2 = C9703vR.e(this);
        ArrayList<View> arrayList = new ArrayList();
        for (View view : e2) {
            if (view.getVisibility() != 8) {
                arrayList.add(view);
            }
        }
        for (View view2 : arrayList) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            C8632dsu.d(layoutParams);
            a aVar = (a) layoutParams;
            view2.layout(aVar.e(), aVar.b(), aVar.e() + view2.getMeasuredWidth(), aVar.b() + view2.getMeasuredHeight());
        }
        d b = b();
        if (b != null) {
            b.e(this.r);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C8632dsu.c((Object) layoutParams, "");
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e */
    public a generateLayoutParams(AttributeSet attributeSet) {
        C8632dsu.c((Object) attributeSet, "");
        Context context = getContext();
        C8632dsu.a(context, "");
        return new a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C8632dsu.c((Object) layoutParams, "");
        return new a(layoutParams.width, layoutParams.height);
    }

    /* renamed from: o.zn$a */
    /* loaded from: classes2.dex */
    public static final class a extends ViewGroup.LayoutParams {
        private int b;
        private int c;

        public final void a(int i) {
            this.c = i;
        }

        public final int b() {
            return this.c;
        }

        public final int e() {
            return this.b;
        }

        public final void e(int i) {
            this.b = i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) attributeSet, "");
        }

        public a(int i, int i2) {
            super(i, i2);
        }
    }
}
