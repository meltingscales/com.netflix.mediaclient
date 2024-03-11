package o;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortEpoxyController;
import com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import o.AbstractC7036coc;
import o.C7039cof;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cof  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7039cof extends AbstractC1091Oi {
    public static final b a = new b(null);
    public static final int c = 8;
    public C6979cnX b;
    public MyListSortOrder f;
    private e g;
    private int h = -1;

    /* renamed from: o.cof$e */
    /* loaded from: classes4.dex */
    public interface e {
        void d(int i, String str);
    }

    @Override // o.AbstractC1091Oi
    public void a(InterfaceC2023aX interfaceC2023aX) {
        C8632dsu.c((Object) interfaceC2023aX, "");
    }

    public final void a(C6979cnX c6979cnX) {
        C8632dsu.c((Object) c6979cnX, "");
        this.b = c6979cnX;
    }

    public final void b(MyListSortOrder myListSortOrder) {
        C8632dsu.c((Object) myListSortOrder, "");
        this.f = myListSortOrder;
    }

    @Override // o.AbstractC1091Oi
    public void c(InterfaceC2023aX interfaceC2023aX) {
        C8632dsu.c((Object) interfaceC2023aX, "");
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* renamed from: o.cof$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MyListFrag");
        }

        public final C7039cof e(MyListSortOrder myListSortOrder, int i, e eVar) {
            C8632dsu.c((Object) myListSortOrder, "");
            C8632dsu.c((Object) eVar, "");
            C7039cof c7039cof = new C7039cof();
            Bundle bundle = new Bundle();
            bundle.putParcelable("sort_order_arg", myListSortOrder);
            bundle.putInt("selected_sort_order_arg", i);
            c7039cof.setArguments(bundle);
            c7039cof.g = eVar;
            return c7039cof;
        }
    }

    public final C6979cnX d() {
        C6979cnX c6979cnX = this.b;
        if (c6979cnX != null) {
            return c6979cnX;
        }
        C8632dsu.d("");
        return null;
    }

    public final MyListSortOrder b() {
        MyListSortOrder myListSortOrder = this.f;
        if (myListSortOrder != null) {
            return myListSortOrder;
        }
        C8632dsu.d("");
        return null;
    }

    private final C9935zP a() {
        return C9935zP.b.d(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r4 == null) goto L19;
     */
    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L29
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            java.lang.String r2 = "sort_order_arg"
            if (r0 < r1) goto L1a
            java.lang.Class<com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder> r0 = com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder.class
            java.lang.Object r4 = o.C9736vy.e(r4, r2, r0)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            goto L25
        L1a:
            android.os.Parcelable r4 = r4.getParcelable(r2)
            boolean r0 = r4 instanceof com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder
            if (r0 != 0) goto L23
            r4 = 0
        L23:
            com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder r4 = (com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder) r4
        L25:
            com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder r4 = (com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder) r4
            if (r4 != 0) goto L2b
        L29:
            com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder$Default r4 = com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder.Default.b
        L2b:
            r3.b(r4)
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L3b
            java.lang.String r0 = "selected_sort_order_arg"
            int r4 = r4.getInt(r0)
            goto L3c
        L3b:
            r4 = -1
        L3c:
            r3.h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7039cof.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        a(new C6979cnX(requireContext, new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderFragment$onCreateView$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                a(view);
                return dpR.c;
            }

            public final void a(View view) {
                C8632dsu.c((Object) view, "");
                super/*com.netflix.mediaclient.android.fragment.NetflixDialogFrag*/.dismiss();
            }
        }, new MyListSortEpoxyController(a())));
        return d();
    }

    @Override // o.AbstractC1091Oi, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        d().d().setData(new MyListSortEpoxyController.d(b(), this.h));
        j();
        e();
        d().open();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public void applyActivityPadding(View view) {
        C8632dsu.c((Object) view, "");
        NetflixActivity netflixActivity = getNetflixActivity();
        if (netflixActivity != null) {
            int statusBarHeight = netflixActivity.getStatusBarHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                marginLayoutParams.topMargin = statusBarHeight;
                marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
                marginLayoutParams.setMarginEnd(C9687vB.b(marginLayoutParams));
                view.requestLayout();
            }
        }
    }

    private final void j() {
        CompositeDisposable compositeDisposable = this.onDestroyDisposable;
        C8632dsu.a(compositeDisposable, "");
        DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy$default(a().d(AbstractC7036coc.class), (drM) null, (drO) null, new drM<AbstractC7036coc, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderFragment$subscribeEvents$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC7036coc abstractC7036coc) {
                a(abstractC7036coc);
                return dpR.c;
            }

            public final void a(AbstractC7036coc abstractC7036coc) {
                int i;
                int i2;
                C7039cof.e eVar;
                C8632dsu.c((Object) abstractC7036coc, "");
                if (abstractC7036coc instanceof AbstractC7036coc.c) {
                    int d = ((AbstractC7036coc.c) abstractC7036coc).d();
                    i = C7039cof.this.h;
                    if (d != i) {
                        MyListSortEpoxyController d2 = C7039cof.this.d().d();
                        MyListSortOrder b2 = C7039cof.this.b();
                        i2 = C7039cof.this.h;
                        d2.setData(new MyListSortEpoxyController.d(b2, i2));
                        eVar = C7039cof.this.g;
                        if (eVar != null) {
                            eVar.d(d, C7039cof.this.b().b().get(d).e().a());
                        }
                    }
                    C7039cof.this.f();
                }
            }
        }, 3, (Object) null));
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        f();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        d().close();
    }
}
