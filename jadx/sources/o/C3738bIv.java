package o;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Slide;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.PersonGenreItem;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.dpcredits.DpCreditsEpoxyController;
import com.netflix.mediaclient.ui.home.HomeActivity;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC8918fl;
import o.C1204Sr;
import o.C3738bIv;
import o.C8054ddD;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8927fu;
import o.C8931fy;
import o.C8932fz;
import o.C8971gl;
import o.C8974go;
import o.C9935zP;
import o.InterfaceC8366diy;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.bIC;
import o.bIH;
import o.bIJ;
import o.dpR;
import o.drI;

/* renamed from: o.bIv */
/* loaded from: classes4.dex */
public final class C3738bIv extends bMW {
    private final CompositeDisposable f;
    private boolean g;
    private String h;
    private boolean i;
    private DpCreditsEpoxyController j;
    private C1204Sr k;
    private C1619aI l;
    private final InterfaceC8554dpx n;
    static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(C3738bIv.class, "viewModel", "getViewModel()Lcom/netflix/mediaclient/ui/dpcredits/DpCreditsViewModel;", 0))};
    public static final e e = new e(null);
    public static final int b = 8;

    /* renamed from: o.bIv$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC8882fB<C3738bIv, bIH> {
        final /* synthetic */ drM b;
        final /* synthetic */ InterfaceC8660dtv c;
        final /* synthetic */ InterfaceC8660dtv d;
        final /* synthetic */ boolean e;

        public a(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.d = interfaceC8660dtv;
            this.e = z;
            this.b = drm;
            this.c = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: d */
        public InterfaceC8554dpx<bIH> c(C3738bIv c3738bIv, dtC<?> dtc) {
            C8632dsu.c((Object) c3738bIv, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.d;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.c;
            return d.d(c3738bIv, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.dpcredits.DpCreditsDialogFrag$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: e */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(bIJ.class), this.e, this.b);
        }
    }

    public C3738bIv() {
        final InterfaceC8660dtv a2 = dsA.a(bIH.class);
        this.n = new a(a2, false, new drM<InterfaceC8890fJ<bIH, bIJ>, bIH>() { // from class: com.netflix.mediaclient.ui.dpcredits.DpCreditsDialogFrag$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bIH, o.fS] */
            @Override // o.drM
            /* renamed from: c */
            public final bIH invoke(InterfaceC8890fJ<bIH, bIJ> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, bIJ.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, d[0]);
        this.f = new CompositeDisposable();
        Slide slide = new Slide(80);
        setEnterTransition(slide);
        setExitTransition(slide);
    }

    private final bIH b() {
        return (bIH) this.n.getValue();
    }

    /* renamed from: o.bIv$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("DpCreditsDialogFrag");
        }

        public static /* synthetic */ C3738bIv d(e eVar, NetflixActivity netflixActivity, String str, VideoType videoType, TrackingInfoHolder trackingInfoHolder, boolean z, boolean z2, String str2, int i, Object obj) {
            return eVar.d(netflixActivity, str, videoType, trackingInfoHolder, z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str2);
        }

        public final C3738bIv d(NetflixActivity netflixActivity, String str, VideoType videoType, TrackingInfoHolder trackingInfoHolder, boolean z, boolean z2, String str2) {
            C8632dsu.c((Object) netflixActivity, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            C3738bIv c3738bIv = new C3738bIv();
            Bundle bundle = new Bundle();
            bundle.putParcelable("tracking_info_holder", trackingInfoHolder);
            Bundle bundle2 = new Bundle();
            bundle2.putString(NetflixActivity.EXTRA_VIDEO_ID, str);
            bundle2.putString("video_type_string", videoType.getValue());
            bundle.putBundle("mavericks:arg", bundle2);
            c3738bIv.setArguments(bundle);
            c3738bIv.i = z;
            if (aQW.c.d()) {
                c3738bIv.g = z2;
                c3738bIv.h = str2;
            }
            c3738bIv.setStyle(2, com.netflix.mediaclient.ui.R.l.m);
            c3738bIv.setWindowFlags(netflixActivity.getWindow().getDecorView().getSystemUiVisibility());
            if (netflixActivity.showDialog(c3738bIv)) {
                return c3738bIv;
            }
            return null;
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public AppView getAppView() {
        return AppView.movieCreditsAndRatings;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        C9935zP d2 = bVar.d(viewLifecycleOwner);
        c(d2.d(bIC.class));
        View inflate = layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.X, viewGroup, false);
        View findViewById = inflate.findViewById(com.netflix.mediaclient.ui.R.g.az);
        C8632dsu.d(findViewById);
        ((AppCompatImageButton) findViewById).setOnClickListener(new View.OnClickListener() { // from class: o.bIy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3738bIv.a(C3738bIv.this, view);
            }
        });
        View findViewById2 = inflate.findViewById(com.netflix.mediaclient.ui.R.g.gY);
        C8632dsu.a(findViewById2, "");
        this.k = (C1204Sr) findViewById2;
        NetflixActivity requireNetflixActivity = requireNetflixActivity();
        C8632dsu.a(requireNetflixActivity, "");
        this.j = new DpCreditsEpoxyController(requireNetflixActivity, d2, h(), this.i, this.g);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.netflix.mediaclient.ui.R.g.fm);
        recyclerView.setHasFixedSize(true);
        C1619aI c1619aI = new C1619aI();
        this.l = c1619aI;
        C8632dsu.d(recyclerView);
        c1619aI.d(recyclerView);
        Context context = recyclerView.getContext();
        C8632dsu.a(context, "");
        recyclerView.setLayoutManager(new FillerGridLayoutManager(context, 0, 0, false, false, 30, null));
        DpCreditsEpoxyController dpCreditsEpoxyController = this.j;
        recyclerView.setAdapter(dpCreditsEpoxyController != null ? dpCreditsEpoxyController.getAdapter() : null);
        recyclerView.setItemAnimator(null);
        return inflate;
    }

    public static final void a(C3738bIv c3738bIv, View view) {
        C8632dsu.c((Object) c3738bIv, "");
        c3738bIv.d();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        b().j();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f.dispose();
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

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        this.f.dispose();
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(b(), new drM<bIJ, dpR>() { // from class: com.netflix.mediaclient.ui.dpcredits.DpCreditsDialogFrag$invalidate$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final dpR invoke(bIJ bij) {
                DpCreditsEpoxyController dpCreditsEpoxyController;
                DpCreditsEpoxyController dpCreditsEpoxyController2;
                String title;
                C1204Sr c1204Sr;
                String str;
                C1204Sr c1204Sr2;
                C8632dsu.c((Object) bij, "");
                C3738bIv.e.getLogTag();
                AbstractC8918fl<InterfaceC8366diy> d2 = bij.d();
                if (d2 instanceof C8927fu) {
                    C8054ddD.c(C3738bIv.this.getContext(), R.o.dc, 0);
                    C3738bIv.this.dismiss();
                    return dpR.c;
                }
                if (!(d2 instanceof C8971gl)) {
                    dpCreditsEpoxyController = C3738bIv.this.j;
                    if (dpCreditsEpoxyController != null) {
                        dpCreditsEpoxyController.setData(bij);
                        return dpR.c;
                    }
                } else {
                    InterfaceC8366diy c = bij.d().c();
                    if (c != null && (title = c.getTitle()) != null) {
                        C3738bIv c3738bIv = C3738bIv.this;
                        c1204Sr = c3738bIv.k;
                        if (c1204Sr == null) {
                            C8632dsu.d("");
                            c1204Sr = null;
                        }
                        str = c3738bIv.h;
                        if (str == null) {
                            str = title;
                        }
                        c1204Sr.setText(str);
                        if (Build.VERSION.SDK_INT >= 28) {
                            c1204Sr2 = c3738bIv.k;
                            if (c1204Sr2 == null) {
                                C8632dsu.d("");
                                c1204Sr2 = null;
                            }
                            c1204Sr2.setAccessibilityPaneTitle(title);
                        }
                    }
                    dpCreditsEpoxyController2 = C3738bIv.this.j;
                    if (dpCreditsEpoxyController2 != null) {
                        dpCreditsEpoxyController2.setData(bij);
                        return dpR.c;
                    }
                }
                return null;
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        dismiss();
        return true;
    }

    private final void c(Observable<bIC> observable) {
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        Observable<bIC> takeUntil = observable.takeUntil(bVar.d(viewLifecycleOwner).d());
        final drM<bIC, dpR> drm = new drM<bIC, dpR>() { // from class: com.netflix.mediaclient.ui.dpcredits.DpCreditsDialogFrag$subscribeToEvents$disposable$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(bIC bic) {
                e(bic);
                return dpR.c;
            }

            public final void e(bIC bic) {
                if (bic instanceof bIC.b) {
                    C3738bIv.this.d(((bIC.b) bic).b());
                } else if (bic instanceof bIC.a) {
                    bIC.a aVar = (bIC.a) bic;
                    String personName = aVar.a().getPersonName();
                    int personId = aVar.a().getPersonId();
                    C3738bIv.this.d(new PersonGenreItem(personName, "person-" + personId, GenreItem.GenreType.GALLERY, 256155170, aVar.a().getUnifiedEntityId()));
                }
            }
        };
        this.f.add(takeUntil.subscribe(new Consumer() { // from class: o.bIE
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C3738bIv.b(drM.this, obj);
            }
        }));
    }

    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final void d() {
        C3739bIw.e.d(getAppView(), h());
        dismiss();
    }

    public final void d(GenreItem genreItem) {
        C3739bIw.e.b(AppView.menu, h());
        dismiss();
        HomeActivity.e(requireNetflixActivity(), genreItem);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.c(b(), new drM<bIJ, Boolean>() { // from class: com.netflix.mediaclient.ui.dpcredits.DpCreditsDialogFrag$isLoadingData$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(bIJ bij) {
                C8632dsu.c((Object) bij, "");
                boolean z = (bij.d() instanceof C8974go) || (bij.d() instanceof C8932fz);
                C3738bIv.e.getLogTag();
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }
}
