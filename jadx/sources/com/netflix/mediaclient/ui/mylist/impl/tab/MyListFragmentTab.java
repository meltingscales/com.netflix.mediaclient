package com.netflix.mediaclient.ui.mylist.impl.tab;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab;
import dagger.hilt.android.AndroidEntryPoint;
import java.nio.charset.StandardCharsets;
import javax.inject.Inject;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC7045col;
import o.AbstractC8882fB;
import o.AbstractC8899fS;
import o.AbstractC8928fv;
import o.C1025Ls;
import o.C1045Mp;
import o.C6921cmS;
import o.C6923cmU;
import o.C6956cnA;
import o.C7010coB;
import o.C7044cok;
import o.C7046com;
import o.C7047coo;
import o.C7056cox;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8916fj;
import o.C8930fx;
import o.C8931fy;
import o.C8980gu;
import o.C9687vB;
import o.C9872yF;
import o.C9876yJ;
import o.InterfaceC6927cmY;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8660dtv;
import o.InterfaceC8888fH;
import o.InterfaceC8890fJ;
import o.InterfaceC8894fN;
import o.InterfaceC8976gq;
import o.dpR;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;
import o.dxD;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class MyListFragmentTab extends AbstractC7045col implements InterfaceC8894fN, InterfaceC6927cmY {
    static final /* synthetic */ dtC<Object>[] b;
    public static final int e;
    private static byte e$ss2$267 = 0;
    public static final d j;
    private static int n = 0;

    /* renamed from: o  reason: collision with root package name */
    private static int f13294o = 1;
    private MyListTabItems k;
    private final InterfaceC8554dpx m;
    @Inject
    public C6923cmU myListEditMenuProvider;

    static void I() {
        e$ss2$267 = (byte) 24;
    }

    @Override // o.InterfaceC8894fN
    public void e() {
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC8882fB<MyListFragmentTab, C7010coB> {
        final /* synthetic */ drO a;
        final /* synthetic */ InterfaceC8660dtv c;
        final /* synthetic */ boolean d;
        final /* synthetic */ drM e;

        public b(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, drO dro) {
            this.c = interfaceC8660dtv;
            this.d = z;
            this.e = drm;
            this.a = dro;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: a */
        public InterfaceC8554dpx<C7010coB> c(MyListFragmentTab myListFragmentTab, dtC<?> dtc) {
            C8632dsu.c((Object) myListFragmentTab, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.c;
            final drO dro = this.a;
            return d.d(myListFragmentTab, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab$special$$inlined$activityViewModel$default$3$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: a */
                public final String invoke() {
                    return (String) drO.this.invoke();
                }
            }, dsA.a(C7056cox.class), this.d, this.e);
        }
    }

    @Override // o.InterfaceC8894fN
    public LifecycleOwner X_() {
        return InterfaceC8894fN.b.d(this);
    }

    @Override // o.InterfaceC8894fN
    public <S extends InterfaceC8888fH> dxD c(AbstractC8899fS<S> abstractC8899fS, AbstractC8928fv abstractC8928fv, drX<? super S, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return InterfaceC8894fN.b.e(this, abstractC8899fS, abstractC8928fv, drx);
    }

    @Override // o.InterfaceC8894fN
    public void i_() {
        InterfaceC8894fN.b.e(this);
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MyListFragmentTab");
        }

        public final NetflixFrag c(MyListTabItems myListTabItems) {
            C8632dsu.c((Object) myListTabItems, "");
            MyListFragmentTab myListFragmentTab = new MyListFragmentTab();
            myListFragmentTab.setArguments(C7047coo.b(new Bundle(), myListTabItems));
            return myListFragmentTab;
        }
    }

    public MyListFragmentTab() {
        final InterfaceC8660dtv a2 = dsA.a(C7010coB.class);
        final drO<String> dro = new drO<String>() { // from class: com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab$special$$inlined$activityViewModel$default$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final String invoke() {
                String name = drI.e(InterfaceC8660dtv.this).getName();
                C8632dsu.a(name, "");
                return name;
            }
        };
        this.m = new b(a2, false, new drM<InterfaceC8890fJ<C7010coB, C7056cox>, C7010coB>() { // from class: com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab$special$$inlined$activityViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [o.coB, o.fS] */
            @Override // o.drM
            /* renamed from: e */
            public final C7010coB invoke(InterfaceC8890fJ<C7010coB, C7056cox> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                return C8903fW.e(c8903fW, e2, C7056cox.class, new C8916fj(requireActivity, C8931fy.a(this), null, null, 12, null), (String) dro.invoke(), false, interfaceC8890fJ, 16, null);
            }
        }, dro).c(this, b[0]);
    }

    static {
        I();
        b = new dtC[]{dsA.c(new PropertyReference1Impl(MyListFragmentTab.class, "myListActivityModel", "getMyListActivityModel()Lcom/netflix/mediaclient/ui/mylist/impl/viewmodel/MyListActivityModel;", 0))};
        j = new d(null);
        e = 8;
    }

    public final C7010coB F() {
        return (C7010coB) this.m.getValue();
    }

    public final C6923cmU G() {
        C6923cmU c6923cmU = this.myListEditMenuProvider;
        if (c6923cmU != null) {
            return c6923cmU;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C8632dsu.a(requireArguments, "");
        MyListTabItems c = C7047coo.c(requireArguments);
        if (c == null) {
            throw new IllegalArgumentException("MyListTabItems can't be null");
        }
        this.k = c;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(C6956cnA.b.e, viewGroup, false);
        C8632dsu.a(inflate, "");
        MyListTabItems myListTabItems = this.k;
        if (myListTabItems == null) {
            C8632dsu.d("");
            myListTabItems = null;
        }
        return e(inflate, myListTabItems);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C6921cmS.e.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C6921cmS.e.c();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean y() {
        return M();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        return M();
    }

    private final View e(View view, MyListTabItems myListTabItems) {
        final C7046com c7046com = new C7046com(this, myListTabItems);
        View findViewById = view.findViewById(C6956cnA.e.w);
        C8632dsu.a(findViewById, "");
        TabLayout tabLayout = (TabLayout) findViewById;
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(C6956cnA.e.z);
        viewPager2.setAdapter(c7046com);
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOffscreenPageLimit(1);
        C8980gu.c(F(), new MyListFragmentTab$setupTab$viewPager$1$1(viewPager2, this));
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.coh
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                MyListFragmentTab.e(MyListFragmentTab.this, c7046com, tab, i);
            }
        }).attach();
        return view;
    }

    /* loaded from: classes4.dex */
    public static final class a implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            C8632dsu.c((Object) tab, "");
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            C8632dsu.c((Object) tab, "");
        }

        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            C8632dsu.c((Object) tab, "");
            MyListFragmentTab.this.M();
            MyListFragmentTab.this.F().a(tab.getPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MyListFragmentTab myListFragmentTab, C7046com c7046com, TabLayout.Tab tab, int i) {
        int i2 = 2 % 2;
        int i3 = f13294o + 69;
        n = i3 % 128;
        int i4 = i3 % 2;
        C8632dsu.c((Object) myListFragmentTab, "");
        C8632dsu.c((Object) c7046com, "");
        C8632dsu.c((Object) tab, "");
        Context requireContext = myListFragmentTab.requireContext();
        int d2 = c7046com.d(i);
        String string = requireContext.getString(d2);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            p(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = requireContext.getText(d2);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                string = spannableString;
            } else {
                int i5 = f13294o + 61;
                n = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        tab.setText(string);
        tab.setId(c7046com.b(i));
        tab.setTag(Integer.valueOf(c7046com.b(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        C8980gu.c(F(), new drM<C7056cox, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab$updatePopover$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7056cox c7056cox) {
                b(c7056cox);
                return dpR.c;
            }

            public final void b(C7056cox c7056cox) {
                C8632dsu.c((Object) c7056cox, "");
                if (c7056cox.b()) {
                    C9872yF c9872yF = MyListFragmentTab.this.by_().composeViewOverlayManager;
                    C8632dsu.a(c9872yF, "");
                    View findViewById = MyListFragmentTab.this.requireView().findViewById(C6956cnA.e.r);
                    C8632dsu.a(findViewById, "");
                    float f = 26;
                    C1025Ls.c cVar = new C1025Ls.c(Theme.a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, C1025Ls.b.e.b, Dp.m2492constructorimpl(0), null, 0.0f, 0.0f, Dp.m2492constructorimpl(f), Dp.m2492constructorimpl(f), 1854, null);
                    final MyListFragmentTab myListFragmentTab = MyListFragmentTab.this;
                    C9876yJ.b(c9872yF, findViewById, null, cVar, null, false, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab$updatePopover$1.1
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(Boolean bool) {
                            c(bool.booleanValue());
                            return dpR.c;
                        }

                        public final void c(boolean z) {
                            MyListFragmentTab.this.F().i();
                        }
                    }, C7044cok.c.a(), 26, null);
                    MyListFragmentTab.this.F().j();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M() {
        return ((Boolean) C8980gu.c(F(), new drM<C7056cox, Boolean>() { // from class: com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab$clearIfInEditMode$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(C7056cox c7056cox) {
                C8632dsu.c((Object) c7056cox, "");
                Boolean valueOf = Boolean.valueOf(c7056cox.e());
                MyListFragmentTab myListFragmentTab = MyListFragmentTab.this;
                if (valueOf.booleanValue()) {
                    myListFragmentTab.F().f();
                }
                return valueOf;
            }
        })).booleanValue();
    }

    @Override // o.InterfaceC6927cmY
    public void c(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        C8980gu.c(F(), new drM<C7056cox, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab$onSelected$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7056cox c7056cox) {
                c(c7056cox);
                return dpR.c;
            }

            public final void c(C7056cox c7056cox) {
                C8632dsu.c((Object) c7056cox, "");
                MyListFragmentTab.this.F().f();
                C6921cmS.e.d(c7056cox.e());
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        return ((Boolean) C8980gu.c(F(), new drM<C7056cox, Boolean>() { // from class: com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab$updateActionBar$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(C7056cox c7056cox) {
                C8632dsu.c((Object) c7056cox, "");
                return Boolean.valueOf(MyListFragmentTab.this.G().a(c7056cox));
            }
        })).booleanValue();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        int i = this.i;
        int i2 = ((NetflixFrag) this).d;
        int i3 = this.g;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
            marginLayoutParams.topMargin = i + i2 + i3;
            marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
            marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
            marginLayoutParams.setMarginEnd(C9687vB.b(marginLayoutParams));
            view.requestLayout();
        }
        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), this.h);
    }

    private static void p(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$267);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
