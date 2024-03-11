package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.util.AccessibilityUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C9834xU;

/* loaded from: classes3.dex */
public final class SA extends LinearLayout {
    private LinearLayout a;
    private a c;
    private View.OnClickListener d;
    private int f;
    private final View.OnClickListener g;
    private LayoutInflater h;
    private int i;
    private InterfaceC5283bvo j;
    private int k;
    private final ArrayList<a> l;
    private LinearLayout m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private c f13394o;
    private a t;
    public static final e e = new e(null);
    public static final int b = 8;

    /* loaded from: classes3.dex */
    public interface c {
        void c(InterfaceC5283bvo interfaceC5283bvo, View view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SA(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    private final void e() {
        this.n = (int) (this.k * 1.15f);
    }

    public final void setProfileSelectedListener(c cVar) {
        C8632dsu.c((Object) cVar, "");
        this.f13394o = cVar;
    }

    public /* synthetic */ SA(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.f = 5;
        this.i = -1;
        this.l = new ArrayList<>();
        this.g = new View.OnClickListener() { // from class: o.SD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SA.b(SA.this, view);
            }
        };
        b(attributeSet, i);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SA sa, View view) {
        C8632dsu.c((Object) sa, "");
        Object tag = view.getTag(com.netflix.mediaclient.ui.R.g.eO);
        InterfaceC5283bvo interfaceC5283bvo = tag instanceof InterfaceC5283bvo ? (InterfaceC5283bvo) tag : null;
        if (interfaceC5283bvo != null) {
            String profileGuid = interfaceC5283bvo.getProfileGuid();
            C8632dsu.a(profileGuid, "");
            sa.setSelected(profileGuid);
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    private final void b(AttributeSet attributeSet, int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        C8632dsu.a(from, "");
        this.h = from;
        setOrientation(1);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(com.netflix.mediaclient.ui.R.g.eL);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        this.a = linearLayout;
        addView(linearLayout, -1, -2);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(com.netflix.mediaclient.ui.R.g.eR);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(1);
        linearLayout2.setImportantForAccessibility(4);
        this.m = linearLayout2;
        addView(linearLayout2, -1, -2);
        LinearLayout linearLayout3 = this.m;
        if (linearLayout3 == null) {
            C8632dsu.d("");
            linearLayout3 = null;
        }
        C9870yD.d(linearLayout3, 1, getContext().getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.Q));
        if (C8150deu.h()) {
            C9870yD.b((View) this, 5, getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.S));
            C9870yD.b((View) this, 4, getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.P));
        } else {
            C9870yD.b((View) this, 5, getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.L));
            C9870yD.b((View) this, 4, getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.O));
        }
        this.k = getContext().getResources().getDimensionPixelSize(C8150deu.h() ? com.netflix.mediaclient.ui.R.b.f13240J : com.netflix.mediaclient.ui.R.b.M);
        e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.netflix.mediaclient.ui.R.k.g, i, 0);
            C8632dsu.a(obtainStyledAttributes, "");
            if (obtainStyledAttributes.hasValue(com.netflix.mediaclient.ui.R.k.h)) {
                int i2 = obtainStyledAttributes.getInt(com.netflix.mediaclient.ui.R.k.h, 5);
                this.f = i2;
                if (i2 > 5) {
                    throw new IllegalStateException("ProfileSelector_ps_max_profiles only supports up to 5");
                }
            }
            if (obtainStyledAttributes.hasValue(com.netflix.mediaclient.ui.R.k.j)) {
                this.i = obtainStyledAttributes.getDimensionPixelSize(com.netflix.mediaclient.ui.R.k.j, -1);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.i > 0) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.i;
            if (size > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i));
            }
        }
        int size2 = View.MeasureSpec.getSize(i);
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int i4 = this.l.size() > 3 ? this.f : 4;
        int size3 = (((size2 - paddingStart) - paddingEnd) - (((this.k * 2) * this.l.size()) - 1)) - (this.n * 2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.K);
        int min = Math.min((int) ((size3 * 1.15f) / i4), (int) (dimensionPixelSize * 1.15f));
        int min2 = Math.min((size3 - min) / (i4 - 1), dimensionPixelSize);
        Iterator<a> it = this.l.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (C8632dsu.c(next, this.t)) {
                next.b(min);
            } else {
                next.b(min2);
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setProfiles(List<? extends InterfaceC5283bvo> list, InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        int size = list.size();
        int i = this.f;
        if (size > i) {
            throw new IllegalArgumentException("Max of " + i + " profiles supported, set with app:ps_max_profiles");
        }
        this.j = interfaceC5283bvo;
        a();
        for (InterfaceC5283bvo interfaceC5283bvo2 : list) {
            e(this, interfaceC5283bvo2, C8632dsu.c((Object) interfaceC5283bvo2.getProfileGuid(), (Object) interfaceC5283bvo.getProfileGuid()), 0, 4, null);
        }
        if (!C5062brf.d() || list.size() >= this.f) {
            return;
        }
        b(this, b(), 0, 2, null);
    }

    private final a b() {
        a aVar = this.c;
        if (aVar == null) {
            LayoutInflater layoutInflater = this.h;
            LinearLayout linearLayout = null;
            if (layoutInflater == null) {
                C8632dsu.d("");
                layoutInflater = null;
            }
            int i = com.netflix.mediaclient.ui.R.i.bd;
            LinearLayout linearLayout2 = this.a;
            if (linearLayout2 == null) {
                C8632dsu.d("");
                linearLayout2 = null;
            }
            View inflate = layoutInflater.inflate(i, (ViewGroup) linearLayout2, false);
            C8632dsu.d(inflate);
            ImageView imageView = (ImageView) inflate;
            LayoutInflater layoutInflater2 = this.h;
            if (layoutInflater2 == null) {
                C8632dsu.d("");
                layoutInflater2 = null;
            }
            int i2 = com.netflix.mediaclient.ui.R.i.bj;
            LinearLayout linearLayout3 = this.m;
            if (linearLayout3 == null) {
                C8632dsu.d("");
            } else {
                linearLayout = linearLayout3;
            }
            View inflate2 = layoutInflater2.inflate(i2, (ViewGroup) linearLayout, false);
            C8632dsu.d(inflate2);
            aVar = new a(this, null, imageView, (TextView) inflate2, false);
            this.c = aVar;
            View.OnClickListener onClickListener = this.d;
            if (onClickListener != null) {
                aVar.d(onClickListener);
            }
        }
        return aVar;
    }

    private final void a() {
        LinearLayout linearLayout = this.a;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            C8632dsu.d("");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout3 = this.m;
        if (linearLayout3 == null) {
            C8632dsu.d("");
        } else {
            linearLayout2 = linearLayout3;
        }
        linearLayout2.removeAllViews();
        this.l.clear();
    }

    static /* synthetic */ void b(SA sa, a aVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        sa.e(aVar, i);
    }

    private final void e(a aVar, int i) {
        LinearLayout linearLayout = this.a;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            C8632dsu.d("");
            linearLayout = null;
        }
        linearLayout.addView(aVar.e(), i);
        LinearLayout linearLayout3 = this.m;
        if (linearLayout3 == null) {
            C8632dsu.d("");
        } else {
            linearLayout2 = linearLayout3;
        }
        linearLayout2.addView(aVar.b(), i);
        if (i >= 0 && i < this.l.size()) {
            this.l.add(i, aVar);
        } else {
            this.l.add(aVar);
        }
    }

    private final void d(a aVar) {
        LinearLayout linearLayout = this.a;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            C8632dsu.d("");
            linearLayout = null;
        }
        linearLayout.removeView(aVar.e());
        LinearLayout linearLayout3 = this.m;
        if (linearLayout3 == null) {
            C8632dsu.d("");
        } else {
            linearLayout2 = linearLayout3;
        }
        linearLayout2.removeView(aVar.b());
        this.l.remove(aVar);
    }

    public static /* synthetic */ void e(SA sa, InterfaceC5283bvo interfaceC5283bvo, boolean z, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        sa.d(interfaceC5283bvo, z, i);
    }

    public final void d(InterfaceC5283bvo interfaceC5283bvo, boolean z, int i) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        LayoutInflater layoutInflater = this.h;
        if (layoutInflater == null) {
            C8632dsu.d("");
            layoutInflater = null;
        }
        int i2 = z ? com.netflix.mediaclient.ui.R.i.bg : com.netflix.mediaclient.ui.R.i.bh;
        LinearLayout linearLayout = this.a;
        if (linearLayout == null) {
            C8632dsu.d("");
            linearLayout = null;
        }
        View inflate = layoutInflater.inflate(i2, (ViewGroup) linearLayout, false);
        C8632dsu.d(inflate);
        NetflixImageView netflixImageView = (NetflixImageView) inflate;
        netflixImageView.showImage(interfaceC5283bvo.getAvatarUrl());
        netflixImageView.setContentDescription(C1333Xq.d(interfaceC5283bvo.isProfileLocked() ? com.netflix.mediaclient.ui.R.o.M : com.netflix.mediaclient.ui.R.o.N).d("profile", interfaceC5283bvo.getProfileName()).toString());
        AccessibilityUtils.e(netflixImageView, AccessibilityUtils.RoleDescription.e, null, null, 6, null);
        if (!z) {
            netflixImageView.setBackgroundResource(C9834xU.j.M);
        }
        LayoutInflater layoutInflater2 = this.h;
        if (layoutInflater2 == null) {
            C8632dsu.d("");
            layoutInflater2 = null;
        }
        int i3 = z ? com.netflix.mediaclient.ui.R.i.bi : com.netflix.mediaclient.ui.R.i.bk;
        LinearLayout linearLayout2 = this.m;
        if (linearLayout2 == null) {
            C8632dsu.d("");
            linearLayout2 = null;
        }
        View inflate2 = layoutInflater2.inflate(i3, (ViewGroup) linearLayout2, false);
        C8632dsu.d(inflate2);
        TextView textView = (TextView) inflate2;
        textView.setText(interfaceC5283bvo.getProfileName());
        if (interfaceC5283bvo.isProfileLocked()) {
            Drawable drawable = getContext().getDrawable(com.netflix.mediaclient.ui.R.e.N);
            if (drawable != null) {
                float f = 16;
                C1332Xp c1332Xp = C1332Xp.b;
                drawable.setBounds(new Rect(0, 0, (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            } else {
                drawable = null;
            }
            C1332Xp c1332Xp2 = C1332Xp.b;
            textView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
            textView.setCompoundDrawables(null, null, null, drawable);
        }
        a aVar = new a(this, interfaceC5283bvo, netflixImageView, textView, z);
        e(aVar, i);
        aVar.d(this.g);
        if (z) {
            this.t = aVar;
        }
    }

    public final void setSelected(String str) {
        InterfaceC5283bvo interfaceC5283bvo;
        c cVar;
        C8654dtp g;
        C8632dsu.c((Object) str, "");
        InterfaceC5283bvo interfaceC5283bvo2 = this.j;
        if (C8632dsu.c((Object) (interfaceC5283bvo2 != null ? interfaceC5283bvo2.getProfileGuid() : null), (Object) str)) {
            interfaceC5283bvo = this.j;
        } else {
            String profileGuid = interfaceC5283bvo2 != null ? interfaceC5283bvo2.getProfileGuid() : null;
            g = C8657dts.g(0, this.l.size());
            Iterator<Integer> it = g.iterator();
            interfaceC5283bvo = null;
            while (it.hasNext()) {
                int nextInt = ((dqB) it).nextInt();
                a aVar = this.l.get(nextInt);
                C8632dsu.a(aVar, "");
                a aVar2 = aVar;
                InterfaceC5283bvo d = aVar2.d();
                if (d != null) {
                    if (C8632dsu.c((Object) aVar2.c(), (Object) str)) {
                        d(aVar2);
                        d(d, true, nextInt);
                        interfaceC5283bvo = aVar2.d();
                    } else if (profileGuid != null && C8632dsu.c((Object) aVar2.c(), (Object) profileGuid)) {
                        d(aVar2);
                        d(d, false, nextInt);
                    }
                }
            }
            this.j = interfaceC5283bvo;
        }
        if (interfaceC5283bvo == null || (cVar = this.f13394o) == null) {
            return;
        }
        a aVar3 = this.t;
        cVar.c(interfaceC5283bvo, aVar3 != null ? aVar3.e() : null);
    }

    public final void setAddProfileListener(View.OnClickListener onClickListener) {
        C8632dsu.c((Object) onClickListener, "");
        this.d = onClickListener;
        a aVar = this.c;
        if (aVar != null) {
            aVar.d(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a {
        final /* synthetic */ SA a;
        private TextView b;
        private ImageView c;
        private final int d;
        private final int e;
        private String f;
        private InterfaceC5283bvo j;

        public final TextView b() {
            return this.b;
        }

        public final String c() {
            return this.f;
        }

        public final InterfaceC5283bvo d() {
            return this.j;
        }

        public final ImageView e() {
            return this.c;
        }

        public a(SA sa, InterfaceC5283bvo interfaceC5283bvo, ImageView imageView, TextView textView, boolean z) {
            C8632dsu.c((Object) imageView, "");
            C8632dsu.c((Object) textView, "");
            this.a = sa;
            this.j = interfaceC5283bvo;
            this.c = imageView;
            this.b = textView;
            int i = (!z || sa.n <= 0) ? sa.k : sa.n;
            this.e = i;
            C1332Xp c1332Xp = C1332Xp.b;
            int applyDimension = (int) TypedValue.applyDimension(1, 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            this.d = applyDimension;
            InterfaceC5283bvo interfaceC5283bvo2 = this.j;
            this.f = interfaceC5283bvo2 != null ? interfaceC5283bvo2.getProfileGuid() : null;
            this.c.setTag(com.netflix.mediaclient.ui.R.g.eO, this.j);
            this.b.setTag(com.netflix.mediaclient.ui.R.g.eO, this.j);
            this.c.setSelected(z);
            C9870yD.d(this.c, 5, i);
            C9870yD.d(this.b, 5, applyDimension);
        }

        public final void b(int i) {
            this.c.getLayoutParams().width = i;
            this.b.getLayoutParams().width = (i + (this.e * 2)) - (this.d * 2);
        }

        public final void d(View.OnClickListener onClickListener) {
            C8632dsu.c((Object) onClickListener, "");
            ImageView imageView = this.c;
            imageView.setOnClickListener(onClickListener);
            imageView.setClickable(true);
            TextView textView = this.b;
            textView.setOnClickListener(onClickListener);
            textView.setClickable(true);
        }
    }
}
