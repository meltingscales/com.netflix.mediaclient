package o;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.secondscreen.SafeAreaSize;
import com.netflix.cl.model.secondscreen.ScreenResolution;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.model.leafs.ArtworkColors;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC6710ciT;
import o.C1333Xq;
import o.C4984bqG;
import o.C6716ciZ;
import o.C6783cjn;
import o.C6784cjo;
import o.C6792cjw;
import o.C6795cjz;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8931fy;
import o.C9935zP;
import o.InterfaceC1078Nw;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.InterfaceC8894fN;
import o.dpR;
import o.drI;

@AndroidEntryPoint
/* renamed from: o.ciZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6716ciZ extends AbstractC6794cjy implements InterfaceC8894fN {
    private final AppView j;
    private final boolean k;
    private DisplayManager.DisplayListener l;
    private DisplayManager m;
    private final InterfaceC8554dpx n;

    /* renamed from: o  reason: collision with root package name */
    private c f13732o;
    static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(C6716ciZ.class, "gameControllerViewModel", "getGameControllerViewModel()Lcom/netflix/mediaclient/ui/mssi/impl/GameControllerViewModel;", 0))};
    public static final b b = new b(null);

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.j;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.k;
    }

    /* renamed from: o.ciZ$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC8882fB<C6716ciZ, C6784cjo> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ drM b;
        final /* synthetic */ InterfaceC8660dtv d;
        final /* synthetic */ boolean e;

        public e(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.a = interfaceC8660dtv;
            this.e = z;
            this.b = drm;
            this.d = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: d */
        public InterfaceC8554dpx<C6784cjo> c(C6716ciZ c6716ciZ, dtC<?> dtc) {
            C8632dsu.c((Object) c6716ciZ, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.a;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.d;
            return d.d(c6716ciZ, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerFragment$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: a */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C6783cjn.class), this.e, this.b);
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

    public C6716ciZ() {
        super(C6792cjw.e.d);
        final InterfaceC8660dtv a2 = dsA.a(C6784cjo.class);
        this.n = new e(a2, false, new drM<InterfaceC8890fJ<C6784cjo, C6783cjn>, C6784cjo>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.cjo, o.fS] */
            @Override // o.drM
            /* renamed from: b */
            public final C6784cjo invoke(InterfaceC8890fJ<C6784cjo, C6783cjn> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C6783cjn.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, e[0]);
        this.j = AppView.secondScreenController;
    }

    /* renamed from: o.ciZ$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("GameControllerFragment");
        }

        public final C6716ciZ e(Bundle bundle) {
            C8632dsu.c((Object) bundle, "");
            C6716ciZ c6716ciZ = new C6716ciZ();
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("mavericks:arg", bundle);
            c6716ciZ.setArguments(bundle2);
            return c6716ciZ;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6784cjo F() {
        return (C6784cjo) this.n.getValue();
    }

    /* renamed from: o.ciZ$a */
    /* loaded from: classes4.dex */
    public static final class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            C6795cjz a;
            WebView webView;
            c cVar = C6716ciZ.this.f13732o;
            if (cVar == null || (a = cVar.a()) == null || (webView = a.g) == null) {
                return;
            }
            C6789cjt.e.c(webView);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.l = new a();
        Object systemService = requireContext().getSystemService(InteractiveAnimation.States.display);
        C8632dsu.d(systemService);
        DisplayManager displayManager = (DisplayManager) systemService;
        this.m = displayManager;
        if (displayManager == null) {
            C8632dsu.d("");
            displayManager = null;
        }
        DisplayManager.DisplayListener displayListener = this.l;
        if (displayListener == null) {
            C8632dsu.d("");
            displayListener = null;
        }
        displayManager.registerDisplayListener(displayListener, null);
        C6795cjz d2 = C6795cjz.d(layoutInflater, viewGroup, false);
        C8632dsu.a(d2, "");
        this.f13732o = new c(d2, false, false, 6, null);
        FrameLayout e2 = d2.e();
        FrameLayout e3 = d2.e();
        C8632dsu.a(e3, "");
        e2.setBackground(new C6712ciV(e3).e());
        FrameLayout e4 = d2.e();
        C8632dsu.a(e4, "");
        return e4;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C6795cjz a2;
        WebView webView;
        DisplayManager displayManager = this.m;
        if (displayManager == null) {
            C8632dsu.d("");
            displayManager = null;
        }
        DisplayManager.DisplayListener displayListener = this.l;
        if (displayListener == null) {
            C8632dsu.d("");
            displayListener = null;
        }
        displayManager.unregisterDisplayListener(displayListener);
        c cVar = this.f13732o;
        if (cVar != null && (a2 = cVar.a()) != null && (webView = a2.g) != null) {
            webView.destroy();
        }
        super.onDestroyView();
        this.f13732o = null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C6795cjz a2;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        final C9935zP d2 = bVar.d(viewLifecycleOwner);
        c cVar = this.f13732o;
        if (cVar != null && (a2 = cVar.a()) != null) {
            C1203Sq c1203Sq = a2.e;
            C8632dsu.a(c1203Sq, "");
            c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.cja
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C6716ciZ.d(C9935zP.this, view2);
                }
            });
            c1203Sq.setClickable(true);
            C1203Sq c1203Sq2 = a2.a;
            C8632dsu.a(c1203Sq2, "");
            c1203Sq2.setOnClickListener(new View.OnClickListener() { // from class: o.ciY
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C6716ciZ.b(C9935zP.this, view2);
                }
            });
            c1203Sq2.setClickable(true);
            WebView webView = a2.g;
            C8632dsu.a(webView, "");
            b(d2, webView);
        }
        b(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C9935zP c9935zP, View view) {
        C8632dsu.c((Object) c9935zP, "");
        c9935zP.b(AbstractC6710ciT.class, AbstractC6710ciT.a.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C9935zP c9935zP, View view) {
        C8632dsu.c((Object) c9935zP, "");
        c9935zP.b(AbstractC6710ciT.class, AbstractC6710ciT.c.a);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) status, "");
        b(serviceManager);
    }

    public final void b(ServiceManager serviceManager) {
        C8632dsu.c((Object) serviceManager, "");
        String m = serviceManager.k().m();
        C8632dsu.a(m, "");
        F().c(m);
        C6784cjo.c(F(), false, 1, (Object) null);
    }

    private final void b(C9935zP c9935zP, WebView webView) {
        CookieManager.getInstance().removeAllCookies(null);
        C6785cjp c6785cjp = new C6785cjp(F());
        WebSettings settings = webView.getSettings();
        C8632dsu.a(settings, "");
        C8240dge.d.a(settings);
        String userAgentString = settings.getUserAgentString();
        settings.setUserAgentString(userAgentString + " (DEVTYPE=games_controller)");
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        webView.setHapticFeedbackEnabled(false);
        webView.setWebViewClient(c6785cjp);
        webView.addJavascriptInterface(new C6774cje(this, c9935zP, F()), "nfandroid");
        webView.setWebChromeClient(new d());
    }

    /* renamed from: o.ciZ$d */
    /* loaded from: classes4.dex */
    public static final class d extends WebChromeClient {
        d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C8632dsu.c((Object) consoleMessage, "");
            C6716ciZ.b.getLogTag();
            return true;
        }
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.c(F(), new drM<C6783cjn, Boolean>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerFragment$isLoadingData$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(C6783cjn c6783cjn) {
                C8632dsu.c((Object) c6783cjn, "");
                return Boolean.valueOf(c6783cjn.o() == GameControllerLoadingState.b);
            }
        })).booleanValue();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        return ((Boolean) C8980gu.c(F(), new drM<C6783cjn, Boolean>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerFragment$handleBackPressed$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(C6783cjn c6783cjn) {
                C6716ciZ.c cVar;
                C8632dsu.c((Object) c6783cjn, "");
                return Boolean.valueOf((c6783cjn.o() != GameControllerLoadingState.e || (cVar = C6716ciZ.this.f13732o) == null || cVar.d()) ? false : true);
            }
        })).booleanValue();
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(F(), new drM<C6783cjn, dpR>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerFragment$invalidate$1

            /* loaded from: classes4.dex */
            public final /* synthetic */ class c {
                public static final /* synthetic */ int[] d;

                static {
                    int[] iArr = new int[GameControllerLoadingState.values().length];
                    try {
                        iArr[GameControllerLoadingState.b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GameControllerLoadingState.a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[GameControllerLoadingState.e.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    d = iArr;
                }
            }

            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6783cjn c6783cjn) {
                c(c6783cjn);
                return dpR.c;
            }

            public final void c(C6783cjn c6783cjn) {
                Window window;
                C6784cjo F;
                C8632dsu.c((Object) c6783cjn, "");
                C6716ciZ.b bVar = C6716ciZ.b;
                C6716ciZ.c cVar = C6716ciZ.this.f13732o;
                C8632dsu.d(cVar);
                C6716ciZ.this.requireActivity().setRequestedOrientation(c6783cjn.a());
                if (cVar.c() && c6783cjn.o() != GameControllerLoadingState.b) {
                    cVar.a(false);
                    C6716ciZ c6716ciZ = C6716ciZ.this;
                    NetflixImmutableStatus netflixImmutableStatus = c6783cjn.n() ? InterfaceC1078Nw.ad : InterfaceC1078Nw.aJ;
                    C8632dsu.d(netflixImmutableStatus);
                    c6716ciZ.d(netflixImmutableStatus);
                    C6716ciZ.this.I();
                }
                if (c6783cjn.m()) {
                    String languageTag = C4984bqG.b.e(C6716ciZ.this.getContext()).c().toLanguageTag();
                    C8632dsu.a(languageTag, "");
                    String a2 = c6783cjn.a(languageTag);
                    bVar.getLogTag();
                    F = C6716ciZ.this.F();
                    F.f();
                    cVar.a().g.loadUrl(a2);
                }
                int i = c.d[c6783cjn.o().ordinal()];
                if (i == 1) {
                    Window window2 = C6716ciZ.this.requireActivity().getWindow();
                    if (window2 != null) {
                        window2.addFlags(128);
                    }
                    C6716ciZ c6716ciZ2 = C6716ciZ.this;
                    ProgressBar progressBar = cVar.a().b;
                    C8632dsu.a(progressBar, "");
                    c6716ciZ2.a(progressBar);
                } else if (i == 2) {
                    Window window3 = C6716ciZ.this.requireActivity().getWindow();
                    if (window3 != null) {
                        window3.clearFlags(128);
                    }
                    cVar.a().c.setText(C1333Xq.d(C6792cjw.d.a).d("errorCode", String.valueOf(c6783cjn.e())).c());
                    C6716ciZ c6716ciZ3 = C6716ciZ.this;
                    LinearLayout linearLayout = cVar.a().d;
                    C8632dsu.a(linearLayout, "");
                    c6716ciZ3.a(linearLayout);
                    FrameLayout e2 = cVar.a().e();
                    PaintDrawable paintDrawable = new PaintDrawable(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
                    paintDrawable.setShape(new RectShape());
                    e2.setBackground(paintDrawable);
                } else if (i == 3) {
                    Window window4 = C6716ciZ.this.requireActivity().getWindow();
                    if (window4 != null) {
                        window4.addFlags(128);
                    }
                    C6716ciZ c6716ciZ4 = C6716ciZ.this;
                    WebView webView = cVar.a().g;
                    C8632dsu.a(webView, "");
                    c6716ciZ4.a(webView);
                }
                if (!c6783cjn.f() || (window = C6716ciZ.this.requireActivity().getWindow()) == null) {
                    return;
                }
                window.clearFlags(128);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        Rect g = C8150deu.g(requireContext());
        F().e(new SafeAreaSize(String.valueOf(g.top), String.valueOf(g.left), String.valueOf(g.bottom), String.valueOf(g.right)), new ScreenResolution(Double.valueOf(requireContext().getResources().getDisplayMetrics().density), Double.valueOf(g.width()), Double.valueOf(g.height())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(View view) {
        C6795cjz a2;
        c cVar = this.f13732o;
        if (cVar != null && (a2 = cVar.a()) != null) {
            a2.b.setVisibility(8);
            a2.g.setVisibility(8);
            a2.d.setVisibility(8);
        }
        view.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* renamed from: o.ciZ$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private final C6795cjz b;
        private boolean c;
        private boolean d;

        public final C6795cjz a() {
            return this.b;
        }

        public final void a(boolean z) {
            this.c = z;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        public final void e(boolean z) {
            this.d = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            C6795cjz c6795cjz = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            return "Holder(viewBinding=" + c6795cjz + ", shouldNotifyDataLoaded=" + z + ", allowBackPressDuringGame=" + z2 + ")";
        }

        public c(C6795cjz c6795cjz, boolean z, boolean z2) {
            C8632dsu.c((Object) c6795cjz, "");
            this.b = c6795cjz;
            this.c = z;
            this.d = z2;
        }

        public /* synthetic */ c(C6795cjz c6795cjz, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
            this(c6795cjz, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
        }
    }

    @SuppressLint({"AutoDispose"})
    private final void b(C9935zP c9935zP) {
        CompositeDisposable compositeDisposable = this.f;
        Observable observeOn = c9935zP.d(AbstractC6710ciT.class).observeOn(AndroidSchedulers.mainThread());
        final drM<AbstractC6710ciT, dpR> drm = new drM<AbstractC6710ciT, dpR>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerFragment$subscribeToEvents$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6710ciT abstractC6710ciT) {
                c(abstractC6710ciT);
                return dpR.c;
            }

            public final void c(AbstractC6710ciT abstractC6710ciT) {
                C6784cjo F;
                C6784cjo F2;
                C6784cjo F3;
                C6784cjo F4;
                C6795cjz a2;
                WebView webView;
                if (abstractC6710ciT instanceof AbstractC6710ciT.c) {
                    C6716ciZ.c cVar = C6716ciZ.this.f13732o;
                    if (cVar != null && (a2 = cVar.a()) != null && (webView = a2.g) != null) {
                        webView.stopLoading();
                    }
                    F4 = C6716ciZ.this.F();
                    F4.a(true);
                } else if (abstractC6710ciT instanceof AbstractC6710ciT.a) {
                    C6716ciZ.c cVar2 = C6716ciZ.this.f13732o;
                    if (cVar2 != null) {
                        cVar2.e(true);
                    }
                    FragmentActivity activity = C6716ciZ.this.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else if (abstractC6710ciT instanceof AbstractC6710ciT.e) {
                    F3 = C6716ciZ.this.F();
                    F3.b(((AbstractC6710ciT.e) abstractC6710ciT).c());
                } else if (C8632dsu.c(abstractC6710ciT, AbstractC6710ciT.b.d)) {
                    F2 = C6716ciZ.this.F();
                    F2.g();
                } else if (C8632dsu.c(abstractC6710ciT, AbstractC6710ciT.d.d)) {
                    F = C6716ciZ.this.F();
                    F.j();
                }
            }
        };
        Disposable subscribe = observeOn.subscribe(new Consumer() { // from class: o.ciX
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6716ciZ.c(drM.this, obj);
            }
        });
        C8632dsu.a(subscribe, "");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }
}
