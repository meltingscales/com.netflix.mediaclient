package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.lottie.drawables.LiveNowDrawable;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.BillboardInteractionType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.lomo.BillboardView;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.model.leafs.originals.BillboardAsset;
import com.netflix.model.leafs.originals.BillboardCTA;
import com.netflix.model.leafs.originals.BillboardSummary;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC5164btb;
import o.AbstractC6430cdE;
import o.C1044Mm;
import o.C1189Sc;
import o.C1203Sq;
import o.C1206St;
import o.C1215Tc;
import o.C1596aHd;
import o.C5087bsD;
import o.C6437cdL;
import o.C6463cdl;
import o.C6469cdr;
import o.C6473cdv;
import o.C6906cmD;
import o.C6950cmv;
import o.C8054ddD;
import o.C8141del;
import o.C8150deu;
import o.C8151dev;
import o.C8168dfL;
import o.C8171dfO;
import o.C9834xU;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC3643bFl;
import o.InterfaceC3656bFy;
import o.InterfaceC3661bGc;
import o.InterfaceC5125bsp;
import o.InterfaceC5149btM;
import o.InterfaceC5160btX;
import o.InterfaceC5180btr;
import o.InterfaceC5194buE;
import o.InterfaceC5198buI;
import o.InterfaceC5227bul;
import o.InterfaceC5238buw;
import o.InterfaceC6434cdI;
import o.View$OnClickListenerC1217Te;
import o.aIB;
import o.aRL;
import o.bDC;
import o.dpR;
import org.chromium.net.NetError;
import org.json.JSONObject;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class BillboardView extends AbstractC6430cdE implements InterfaceC6434cdI.c<InterfaceC5180btr> {

    /* renamed from: J  reason: collision with root package name */
    private static int f13284J = 1;
    private static int N = 0;
    private static byte e$ss2$6741 = 24;
    public static String g;
    protected final Observable<dpR> A;
    private bDC B;
    protected String C;
    public InterfaceC5180btr D;
    private TextView E;
    private View F;
    private TextureView G;
    private boolean H;
    private NetflixImageView I;
    private final PublishSubject<dpR> L;
    private String a;
    private LiveState b;
    private C1189Sc c;
    private int d;
    @Inject
    public Lazy<InterfaceC3643bFl> detailsActivityApi;
    @Inject
    public Lazy<InterfaceC3661bGc> detailsPage;
    @Inject
    public InterfaceC3656bFy detailsUtil;
    private Disposable e;
    private final b f;
    public C1203Sq h;
    public C1203Sq i;
    protected View$OnClickListenerC1217Te j;
    public TextView k;
    public Map<String, String> l;
    protected Button m;
    public TextView n;

    /* renamed from: o  reason: collision with root package name */
    protected TextView f13285o;
    public String p;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;
    public String q;
    public String r;
    public View.OnClickListener s;
    protected boolean t;
    protected C1215Tc u;
    protected FrameLayout v;
    public C6950cmv w;
    protected String x;
    public C1206St y;
    public TrackingInfoHolder z;

    public String d(InterfaceC5180btr interfaceC5180btr, InterfaceC5149btM interfaceC5149btM) {
        return this.x;
    }

    protected int i() {
        return R.i.k;
    }

    /* loaded from: classes4.dex */
    public enum BillboardType {
        VERTICAL("vertical"),
        AWARDS("awards"),
        EPISODIC("episodic");
        
        private final String b;

        @Override // java.lang.Enum
        public String toString() {
            return this.b;
        }

        BillboardType(String str) {
            this.b = str;
        }

        public static boolean c(BillboardSummary billboardSummary) {
            return d(billboardSummary, AWARDS.b);
        }

        public static boolean a(BillboardSummary billboardSummary) {
            return d(billboardSummary, EPISODIC.b);
        }

        private static boolean d(BillboardSummary billboardSummary, String str) {
            return billboardSummary != null && str.equalsIgnoreCase(billboardSummary.getBillboardType());
        }
    }

    /* loaded from: classes4.dex */
    public enum BackgroundArtworkType {
        BillBoard("BILLBOARD"),
        VerticalBillboard("VERTICAL_BILLBOARD"),
        VerticalStoryArt("VERTICAL_STORY_ART"),
        BoxShot("boxshot"),
        StoryArt("StoryArt");
        
        private final String j;

        BackgroundArtworkType(String str) {
            this.j = str;
        }

        public static boolean a(BillboardSummary billboardSummary) {
            return d(billboardSummary, BoxShot);
        }

        public static boolean e(BillboardSummary billboardSummary) {
            return d(billboardSummary, BillBoard);
        }

        public static boolean b(BillboardSummary billboardSummary) {
            return d(billboardSummary, VerticalBillboard) || d(billboardSummary, VerticalStoryArt);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean d(BillboardSummary billboardSummary, BackgroundArtworkType backgroundArtworkType) {
            return (billboardSummary == null || billboardSummary.getBackground() == null || !backgroundArtworkType.j.equalsIgnoreCase(billboardSummary.getBackground().getArtWorkType())) ? false : true;
        }
    }

    public BillboardView(Context context) {
        super(context);
        PublishSubject<dpR> create = PublishSubject.create();
        this.L = create;
        this.A = create.hide();
        this.t = true;
        this.a = g;
        this.H = false;
        this.f = new b();
        this.e = null;
        this.b = LiveState.e;
        this.s = new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.lomo.BillboardView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ServiceManager serviceManager = BillboardView.this.o().getServiceManager();
                BillboardView billboardView = BillboardView.this;
                BillboardInteractionType billboardInteractionType = BillboardInteractionType.ACTION;
                billboardView.c(billboardInteractionType);
                if (serviceManager.c()) {
                    InterfaceC5125bsp j = serviceManager.j();
                    BillboardView billboardView2 = BillboardView.this;
                    j.e(billboardView2.D, billboardInteractionType, billboardView2.l);
                }
                CLv2Utils.INSTANCE.e(new Focus(AppView.billboard, BillboardView.this.z.c((JSONObject) null)), new ViewDetailsCommand());
                if (C8171dfO.c()) {
                    QuickDrawDialogFrag.a(BillboardView.this.o(), BillboardView.this.D.getId(), BillboardView.this.z, true);
                } else if (BillboardView.this.D.getType() == VideoType.EPISODE) {
                    BillboardView.this.detailsActivityApi.get().c(BillboardView.this.o(), BillboardView.this.D.aO_(), BillboardView.this.D.getId(), BillboardView.this.z, null, "BbView");
                } else if (C8168dfL.g(BillboardView.this.D.aO_())) {
                    InterfaceC1593aHa.b("videoId=" + BillboardView.this.D.getId() + ", type=" + BillboardView.this.D.getType() + ", ipe=" + BillboardView.this.D.aY_());
                    InterfaceC1597aHe.e("SPY-38467: null topLevelId in billboard.onClick");
                } else {
                    InterfaceC3643bFl interfaceC3643bFl = BillboardView.this.detailsActivityApi.get();
                    NetflixActivity o2 = BillboardView.this.o();
                    InterfaceC5180btr interfaceC5180btr = BillboardView.this.D;
                    interfaceC3643bFl.e(o2, interfaceC5180btr, interfaceC5180btr.aO_(), BillboardView.this.D.aC_(), BillboardView.this.z, "BbView");
                }
            }
        };
        f();
    }

    public BillboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        PublishSubject<dpR> create = PublishSubject.create();
        this.L = create;
        this.A = create.hide();
        this.t = true;
        this.a = g;
        this.H = false;
        this.f = new b();
        this.e = null;
        this.b = LiveState.e;
        this.s = new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.lomo.BillboardView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ServiceManager serviceManager = BillboardView.this.o().getServiceManager();
                BillboardView billboardView = BillboardView.this;
                BillboardInteractionType billboardInteractionType = BillboardInteractionType.ACTION;
                billboardView.c(billboardInteractionType);
                if (serviceManager.c()) {
                    InterfaceC5125bsp j = serviceManager.j();
                    BillboardView billboardView2 = BillboardView.this;
                    j.e(billboardView2.D, billboardInteractionType, billboardView2.l);
                }
                CLv2Utils.INSTANCE.e(new Focus(AppView.billboard, BillboardView.this.z.c((JSONObject) null)), new ViewDetailsCommand());
                if (C8171dfO.c()) {
                    QuickDrawDialogFrag.a(BillboardView.this.o(), BillboardView.this.D.getId(), BillboardView.this.z, true);
                } else if (BillboardView.this.D.getType() == VideoType.EPISODE) {
                    BillboardView.this.detailsActivityApi.get().c(BillboardView.this.o(), BillboardView.this.D.aO_(), BillboardView.this.D.getId(), BillboardView.this.z, null, "BbView");
                } else if (C8168dfL.g(BillboardView.this.D.aO_())) {
                    InterfaceC1593aHa.b("videoId=" + BillboardView.this.D.getId() + ", type=" + BillboardView.this.D.getType() + ", ipe=" + BillboardView.this.D.aY_());
                    InterfaceC1597aHe.e("SPY-38467: null topLevelId in billboard.onClick");
                } else {
                    InterfaceC3643bFl interfaceC3643bFl = BillboardView.this.detailsActivityApi.get();
                    NetflixActivity o2 = BillboardView.this.o();
                    InterfaceC5180btr interfaceC5180btr = BillboardView.this.D;
                    interfaceC3643bFl.e(o2, interfaceC5180btr, interfaceC5180btr.aO_(), BillboardView.this.D.aC_(), BillboardView.this.z, "BbView");
                }
            }
        };
        f();
    }

    public BillboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PublishSubject<dpR> create = PublishSubject.create();
        this.L = create;
        this.A = create.hide();
        this.t = true;
        this.a = g;
        this.H = false;
        this.f = new b();
        this.e = null;
        this.b = LiveState.e;
        this.s = new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.lomo.BillboardView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ServiceManager serviceManager = BillboardView.this.o().getServiceManager();
                BillboardView billboardView = BillboardView.this;
                BillboardInteractionType billboardInteractionType = BillboardInteractionType.ACTION;
                billboardView.c(billboardInteractionType);
                if (serviceManager.c()) {
                    InterfaceC5125bsp j = serviceManager.j();
                    BillboardView billboardView2 = BillboardView.this;
                    j.e(billboardView2.D, billboardInteractionType, billboardView2.l);
                }
                CLv2Utils.INSTANCE.e(new Focus(AppView.billboard, BillboardView.this.z.c((JSONObject) null)), new ViewDetailsCommand());
                if (C8171dfO.c()) {
                    QuickDrawDialogFrag.a(BillboardView.this.o(), BillboardView.this.D.getId(), BillboardView.this.z, true);
                } else if (BillboardView.this.D.getType() == VideoType.EPISODE) {
                    BillboardView.this.detailsActivityApi.get().c(BillboardView.this.o(), BillboardView.this.D.aO_(), BillboardView.this.D.getId(), BillboardView.this.z, null, "BbView");
                } else if (C8168dfL.g(BillboardView.this.D.aO_())) {
                    InterfaceC1593aHa.b("videoId=" + BillboardView.this.D.getId() + ", type=" + BillboardView.this.D.getType() + ", ipe=" + BillboardView.this.D.aY_());
                    InterfaceC1597aHe.e("SPY-38467: null topLevelId in billboard.onClick");
                } else {
                    InterfaceC3643bFl interfaceC3643bFl = BillboardView.this.detailsActivityApi.get();
                    NetflixActivity o2 = BillboardView.this.o();
                    InterfaceC5180btr interfaceC5180btr = BillboardView.this.D;
                    interfaceC3643bFl.e(o2, interfaceC5180btr, interfaceC5180btr.aO_(), BillboardView.this.D.aC_(), BillboardView.this.z, "BbView");
                }
            }
        };
        f();
    }

    private void f() {
        setFocusable(true);
        NetflixActivity o2 = o();
        this.j = new View$OnClickListenerC1217Te(o2, this);
        o2.getLayoutInflater().inflate(i(), this);
        b();
        x();
        s();
        this.c = this.h.b();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        x();
    }

    protected boolean j() {
        return C8151dev.j(getContext());
    }

    protected void x() {
        this.d = C8150deu.p(getContext());
        this.t = j();
        g();
    }

    protected void s() {
        if (this.y != null) {
            this.w = new C6950cmv(o(), C6906cmD.b((CompoundButton) this.y), this.A);
        }
    }

    public int d() {
        return C6469cdr.c(getContext(), false);
    }

    protected void b() {
        this.f13285o = (TextView) findViewById(R.g.y);
        this.k = (TextView) findViewById(R.g.H);
        this.n = (TextView) findViewById(R.g.D);
        this.E = (TextView) findViewById(R.g.P);
        this.I = (NetflixImageView) findViewById(R.g.S);
        this.v = (FrameLayout) findViewById(R.g.O);
        this.u = (C1215Tc) findViewById(R.g.f13245J);
        this.G = (TextureView) findViewById(R.g.dP);
        this.F = findViewById(R.g.N);
        this.h = (C1203Sq) findViewById(R.g.v);
        this.i = (C1203Sq) findViewById(R.g.A);
        this.y = (C1206St) findViewById(R.g.x);
        this.m = (Button) findViewById(R.g.G);
    }

    protected void g() {
        if (this.t) {
            this.F.getLayoutParams().width = (this.d * 2) / 3;
        }
        requestLayout();
    }

    protected void m() {
        if (this.t) {
            this.F.setVisibility(0);
        }
        this.u.setVisibility(0);
        this.v.setVisibility(0);
        this.E.setVisibility(this.t ? 0 : 8);
    }

    @Override // o.bDG
    public PlayContext y_() {
        TrackingInfoHolder trackingInfoHolder = this.z;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder.d(false);
        }
        InterfaceC1598aHf.a("BillboardView.getPlayContext has null trackingInfo");
        return new EmptyPlayContext("BillboardView", NetError.ERR_INVALID_URL);
    }

    public void k() {
        NetflixImageView netflixImageView = this.I;
        if (netflixImageView != null) {
            netflixImageView.onViewRecycled();
        }
        C1215Tc c1215Tc = this.u;
        if (c1215Tc != null) {
            c1215Tc.onViewRecycled();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, q());
    }

    protected int q() {
        return View.MeasureSpec.makeMeasureSpec(d(), 1073741824);
    }

    protected void l() {
        int i = 2 % 2;
        int i2 = N + 113;
        f13284J = i2 % 128;
        int i3 = i2 % 2;
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.y.setVisibility(8);
        this.f13285o.setVisibility(8);
        this.n.setVisibility(8);
        this.I.setVisibility(8);
        TextView textView = this.k;
        int i4 = R.o.am;
        Context context = textView.getContext();
        String string = context.getString(i4);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            K(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i4);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                int i5 = f13284J + 39;
                N = i5 % 128;
                int i6 = i5 % 2;
                string = spannableString;
            }
        }
        textView.setText(string);
        TextView textView2 = this.E;
        int i7 = R.o.am;
        Context context2 = textView2.getContext();
        String string2 = context2.getString(i7);
        if (string2.startsWith("'!#+")) {
            Object[] objArr2 = new Object[1];
            K(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
            CharSequence text2 = context2.getText(i7);
            if (text2 instanceof Spanned) {
                SpannableString spannableString2 = new SpannableString(string2);
                TextUtils.copySpansFrom((SpannedString) text2, 0, string2.length(), Object.class, spannableString2, 0);
                string2 = spannableString2;
            }
        }
        textView2.setText(string2);
        ViewUtils.d((View) this.k, false);
        ViewUtils.d((View) this.E, true);
        this.C = null;
        int i8 = f13284J + 99;
        N = i8 % 128;
        int i9 = i8 % 2;
    }

    public void e(InterfaceC5180btr interfaceC5180btr, InterfaceC5149btM interfaceC5149btM, TrackingInfoHolder trackingInfoHolder, int i, boolean z, LiveState liveState) {
        this.b = liveState;
        c(interfaceC5180btr, interfaceC5149btM, trackingInfoHolder, i, z);
    }

    @Override // o.InterfaceC6434cdI.c
    /* renamed from: a */
    public void c(InterfaceC5180btr interfaceC5180btr, InterfaceC5149btM interfaceC5149btM, TrackingInfoHolder trackingInfoHolder, int i, boolean z) {
        BillboardSummary f;
        String str;
        if (a() == null || interfaceC5180btr == null || (f = interfaceC5180btr.f()) == null) {
            l();
            return;
        }
        BillboardAsset logo = f.getLogo();
        this.z = trackingInfoHolder;
        this.D = interfaceC5180btr;
        setVisibility(0);
        String title = interfaceC5180btr.getTitle();
        setContentDescription(title);
        g(f);
        this.q = f.getActionToken();
        this.r = f.getImpressionToken();
        BillboardAsset background = f.getBackground();
        if (background == null || (!BackgroundArtworkType.d(f, BackgroundArtworkType.BillBoard) && !BackgroundArtworkType.d(f, BackgroundArtworkType.StoryArt))) {
            background = f.getHorizontalBackground();
        }
        this.x = background != null ? background.getUrl() : null;
        ContextualText contextualSynopsis = f.getContextualSynopsis();
        if (contextualSynopsis != null && !C8168dfL.g(contextualSynopsis.text())) {
            str = contextualSynopsis.text();
            this.C = contextualSynopsis.evidenceKey();
        } else {
            String synopsis = f.getSynopsis();
            this.C = null;
            str = synopsis;
        }
        this.p = h(f);
        if (this.H && f.getVideoAssets() != null && f.getVideoAssets().horizontalBackground() != null) {
            c(f.getVideoAssets().horizontalBackground().motionUrl(), f.getVideoAssets().horizontalBackground().motionShouldLoop());
        }
        this.j.d(this.u, interfaceC5180btr, trackingInfoHolder);
        this.k.setOnClickListener(n());
        this.k.setVisibility(8);
        this.u.setPadding(0, 0, 0, 0);
        b(background);
        if (logo != null) {
            b(f);
            this.I.showImage(new ShowImageRequest().a(logo.getUrl()).e(true).a(true).c(ShowImageRequest.Priority.a));
            e(this.I, this.p, title, f);
        }
        c(this.D, f, this.f13285o);
        this.f13285o.setText(this.p);
        this.E.setText(str);
        d(interfaceC5180btr);
        String d = d(interfaceC5180btr, interfaceC5149btM);
        if (C8168dfL.g(d)) {
            if (C8171dfO.e()) {
                InterfaceC1598aHf.a(new C1596aHd("image url is empty, BillboardView, lite").b(false).e(true));
            } else {
                InterfaceC1598aHf.a("image url is empty, BillboardView");
            }
        } else {
            this.u.showImage(new ShowImageRequest().a(d).e(true).c(ShowImageRequest.Priority.a));
        }
        this.u.setContentDescription(title);
        c(BillboardInteractionType.IMPRESSION);
        a(interfaceC5180btr, this.l);
        m();
        o(f);
    }

    public void a(final InterfaceC5180btr interfaceC5180btr, final Map<String, String> map) {
        if (aRL.a().e()) {
            this.e = NetflixApplication.getInstance().j().subscribe(new Action() { // from class: o.cdo
                @Override // io.reactivex.functions.Action
                public final void run() {
                    BillboardView.this.d(interfaceC5180btr, map);
                }
            }, new Consumer() { // from class: o.cdq
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    C1044Mm.d("BillboardView", "Error occurred in getHomeTtrCompleteRx()");
                }
            });
        } else {
            d(interfaceC5180btr, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void d(final InterfaceC5180btr interfaceC5180btr, final Map<String, String> map) {
        aIB.b(o(), new aIB.e() { // from class: o.cdw
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                BillboardView.d(InterfaceC5180btr.this, map, serviceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(InterfaceC5180btr interfaceC5180btr, Map map, ServiceManager serviceManager) {
        C1044Mm.b("BillboardView", "Logging billboard impression for video: " + interfaceC5180btr.getId());
        serviceManager.j().e(interfaceC5180btr, BillboardInteractionType.IMPRESSION, map);
    }

    public void e(NetflixImageView netflixImageView, String str, String str2, BillboardSummary billboardSummary) {
        if (BillboardType.c(billboardSummary) && !TextUtils.isEmpty(str)) {
            netflixImageView.setContentDescription(str);
        } else {
            netflixImageView.setContentDescription(str2);
        }
    }

    public void c(InterfaceC5180btr interfaceC5180btr, BillboardSummary billboardSummary, TextView textView) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a(interfaceC5180btr, billboardSummary) ? c(interfaceC5180btr) : 0, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
    }

    int c(InterfaceC5180btr interfaceC5180btr) {
        Integer b2 = this.detailsUtil.b(interfaceC5180btr.A_());
        if (b2 != null) {
            return b2.intValue();
        }
        return 0;
    }

    public final boolean a(InterfaceC5180btr interfaceC5180btr, BillboardSummary billboardSummary) {
        if (TextUtils.isEmpty(billboardSummary.getSupplementalMessage())) {
            return false;
        }
        return interfaceC5180btr.A_() == SupplementalMessageType.j || interfaceC5180btr.A_() == SupplementalMessageType.d || interfaceC5180btr.A_() == SupplementalMessageType.a;
    }

    public void p() {
        Disposable disposable;
        if (aRL.a().e() && (disposable = this.e) != null) {
            disposable.dispose();
        }
        this.L.onNext(dpR.c);
        C6950cmv c6950cmv = this.w;
        if (c6950cmv != null) {
            c6950cmv.b();
            this.w = null;
        }
    }

    public void c(BillboardInteractionType billboardInteractionType) {
        Map<String, String> map = this.l;
        if (map != null) {
            if (billboardInteractionType == BillboardInteractionType.ACTION) {
                map.put("token", this.q);
            } else {
                map.put("token", this.r);
            }
        }
    }

    public void g(BillboardSummary billboardSummary) {
        HashMap hashMap = new HashMap();
        this.l = hashMap;
        hashMap.put("billboardTheme", billboardSummary.getBillboardTheme());
        this.l.put("billboardType", billboardSummary.getBillboardType());
    }

    protected void o(BillboardSummary billboardSummary) {
        if (BackgroundArtworkType.e(billboardSummary)) {
            this.v.setPadding(0, 0, 0, 0);
        } else {
            this.F.setVisibility(0);
        }
        this.u.setCutomCroppingEnabled(true);
        this.u.setCenterHorizontally(true);
        this.E.setVisibility(0);
    }

    protected String h(BillboardSummary billboardSummary) {
        TextView textView;
        this.p = billboardSummary.getSupplementalMessage();
        if (BillboardType.a(billboardSummary)) {
            this.p = !TextUtils.isEmpty(billboardSummary.getTitle()) ? getResources().getString(R.o.du, billboardSummary.getTitle()) : this.p;
        }
        LoMoUtils.c(billboardSummary.getBadgeKeys(), this.n);
        if (!TextUtils.isEmpty(this.p) && (textView = this.f13285o) != null) {
            textView.setTypeface(textView.getTypeface(), 1);
        }
        return this.p;
    }

    public void d(final InterfaceC5180btr interfaceC5180btr) {
        aIB.b(o(), new aIB.e() { // from class: com.netflix.mediaclient.ui.lomo.BillboardView.5
            @Override // o.aIB.e
            public void run(ServiceManager serviceManager) {
                List<BillboardCTA> arrayList;
                InterfaceC5180btr interfaceC5180btr2 = interfaceC5180btr;
                if (interfaceC5180btr2 == null || interfaceC5180btr2.f() == null || interfaceC5180btr.f().getActions() == null) {
                    arrayList = new ArrayList<>();
                } else {
                    arrayList = interfaceC5180btr.f().getActions();
                }
                BillboardView.this.m.setVisibility(8);
                boolean i = BillboardView.this.i(interfaceC5180btr.f());
                boolean a2 = BillboardType.a(interfaceC5180btr.f());
                if (arrayList.size() >= 2) {
                    BillboardView.this.b(arrayList.get(1), BillboardView.this.i, i, a2);
                    BillboardView.this.y.setVisibility(8);
                } else {
                    BillboardView billboardView = BillboardView.this;
                    billboardView.d(billboardView.D.getId(), BillboardView.this.D.getType());
                    BillboardView.this.t();
                    BillboardView.this.i.setVisibility(8);
                }
                if (arrayList.size() >= 1) {
                    BillboardView.this.b(arrayList.get(0), BillboardView.this.h, i, a2);
                } else {
                    BillboardView.this.h.setVisibility(8);
                }
            }
        });
    }

    protected void d(String str, VideoType videoType) {
        TrackingInfoHolder trackingInfoHolder = this.z;
        if (trackingInfoHolder == null) {
            throw new IllegalStateException();
        }
        this.w.e(str, videoType, trackingInfoHolder, !this.D.isAvailableToPlay());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.lomo.BillboardView$6  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[VideoType.values().length];
            b = iArr;
            try {
                iArr[VideoType.MOVIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[VideoType.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void t() {
        ServiceManager serviceManager = o().getServiceManager();
        int i = AnonymousClass6.b[this.D.getType().ordinal()];
        if (i == 1) {
            serviceManager.j().e(this.D.getId(), null, false, TaskMode.FROM_CACHE_OR_NETWORK, this.f, "Billboard", Boolean.FALSE);
        } else if (i == 2) {
            serviceManager.j().b(this.D.getId(), (String) null, this.f, "Billboard");
        } else {
            C1044Mm.d("BillboardView", "unable to handle or update the my list button as the videotype is not handled.");
            C1206St c1206St = this.y;
            if (c1206St == null || c1206St.getVisibility() != 0) {
                return;
            }
            this.y.setVisibility(8);
        }
    }

    private void y() {
        this.m.setVisibility(0);
        this.m.setOnClickListener(n());
    }

    protected View.OnClickListener n() {
        final ServiceManager serviceManager = o().getServiceManager();
        return new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.lomo.BillboardView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BillboardView billboardView = BillboardView.this;
                BillboardInteractionType billboardInteractionType = BillboardInteractionType.ACTION;
                billboardView.c(billboardInteractionType);
                if (serviceManager.c()) {
                    InterfaceC5125bsp j = serviceManager.j();
                    BillboardView billboardView2 = BillboardView.this;
                    j.e(billboardView2.D, billboardInteractionType, billboardView2.l);
                }
                CLv2Utils.INSTANCE.e(new Focus(AppView.billboard, BillboardView.this.z.c((JSONObject) null)), new ViewDetailsCommand());
                InterfaceC3643bFl interfaceC3643bFl = BillboardView.this.detailsActivityApi.get();
                NetflixActivity o2 = BillboardView.this.o();
                InterfaceC5180btr interfaceC5180btr = BillboardView.this.D;
                interfaceC3643bFl.e(o2, interfaceC5180btr, interfaceC5180btr.aO_(), BillboardView.this.D.aC_(), BillboardView.this.z, "BbView");
            }
        };
    }

    private void b(BillboardCTA billboardCTA) {
        y();
        this.m.setCompoundDrawablesRelativeWithIntrinsicBounds(R.e.F, 0, 0, 0);
        this.m.setText(C6463cdl.d(getContext(), billboardCTA.name(), billboardCTA.sequenceNumber()));
    }

    public boolean i(BillboardSummary billboardSummary) {
        return billboardSummary.getBadgeKeys() != null && billboardSummary.getBadgeKeys().size() > 0 && billboardSummary.getBadgeKeys().get(0).equalsIgnoreCase(LoMoUtils.SupportedBadge.NEW_EPISODE.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void b(BillboardCTA billboardCTA, C1203Sq c1203Sq, boolean z, boolean z2) {
        boolean z3;
        ColorStateList g2;
        ColorStateList colorStateList;
        String str;
        ColorStateList colorStateList2;
        if (c1203Sq == null || billboardCTA == null || billboardCTA.type() == null) {
            return;
        }
        String type = billboardCTA.type();
        type.hashCode();
        switch (type.hashCode()) {
            case 107961:
                if (type.equals("mdp")) {
                    z3 = false;
                    break;
                }
                z3 = true;
                break;
            case 3443508:
                if (type.equals("play")) {
                    z3 = true;
                    break;
                }
                z3 = true;
                break;
            case 1557721666:
                if (type.equals("details")) {
                    z3 = true;
                    break;
                }
                z3 = true;
                break;
            case 1879443694:
                if (type.equals("addToPlaylist")) {
                    z3 = true;
                    break;
                }
                z3 = true;
                break;
            default:
                z3 = true;
                break;
        }
        if (!z3) {
            c1203Sq.setVisibility(8);
            y();
        } else if (!z3) {
            if (z3) {
                c1203Sq.setVisibility(8);
                b(billboardCTA);
            } else if (z3) {
                c1203Sq.setVisibility(8);
                d(this.D.getId(), this.D.getType());
            } else {
                c1203Sq.setVisibility(8);
            }
        } else {
            c1203Sq.setVisibility(0);
            if (LiveState.e != this.b) {
                CLv2Utils.d(AppView.billboard.name(), this.D.aO_(), this.D.aH_(), this.b == LiveState.a);
            }
            if (LiveState.a == this.b) {
                colorStateList2 = ColorStateList.valueOf(getResources().getColor(C9834xU.c.e, getContext().getTheme()));
                colorStateList = ColorStateList.valueOf(-1);
                str = C8168dfL.d(R.o.ai);
                c1203Sq.setCompoundDrawables(new LiveNowDrawable(), null, null, null);
                g2 = colorStateList;
            } else {
                ColorStateList c = this.c.c();
                ColorStateList m = this.c.m();
                g2 = this.c.g();
                String a2 = C6463cdl.a(getContext(), billboardCTA.name(), billboardCTA.sequenceNumber(), z, z2);
                c1203Sq.setCompoundDrawables(AppCompatResources.getDrawable(getContext(), R.e.aJ), null, null, null);
                colorStateList = m;
                str = a2;
                colorStateList2 = c;
            }
            C6473cdv.e(c1203Sq, colorStateList2, colorStateList, g2);
            c1203Sq.setText(str);
            String bookmarkPosition = billboardCTA.ignoreBookmark() ? "0" : billboardCTA.bookmarkPosition();
            if (TextUtils.equals(this.D.getId(), billboardCTA.videoId())) {
                InterfaceC5180btr interfaceC5180btr = this.D;
                d(interfaceC5180btr, interfaceC5180btr.getType(), c1203Sq, bookmarkPosition);
                return;
            }
            C6463cdl.c(o().getServiceManager(), this.D, billboardCTA, new a(c1203Sq, bookmarkPosition, billboardCTA.name().toLowerCase().contains("continue")));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public class b extends C5087bsD {
        public b() {
            super("BillboardView");
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void d(InterfaceC5238buw interfaceC5238buw, Status status) {
            super.d(interfaceC5238buw, status);
            d(interfaceC5238buw);
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void e(InterfaceC5194buE interfaceC5194buE, Status status) {
            super.e(interfaceC5194buE, status);
            d(interfaceC5194buE);
        }

        private void d(InterfaceC5198buI interfaceC5198buI) {
            NetflixActivity a = BillboardView.this.a();
            if (interfaceC5198buI == null || C8054ddD.l(a)) {
                return;
            }
            a.getServiceManager().d(interfaceC5198buI.getId(), interfaceC5198buI.ap());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends C5087bsD {
        private final Button a;
        private final String b;
        private boolean e;

        public a(Button button, String str) {
            super("BillboardView");
            this.e = false;
            this.b = str;
            this.a = button;
        }

        public a(Button button, String str, boolean z) {
            super("BillboardView");
            this.e = z;
            this.b = str;
            this.a = button;
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void d(InterfaceC5238buw interfaceC5238buw, Status status) {
            super.d(interfaceC5238buw, status);
            if (interfaceC5238buw != null) {
                BillboardView.this.e(interfaceC5238buw, this.a, this.b);
            }
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void e(InterfaceC5227bul interfaceC5227bul, Status status) {
            super.e(interfaceC5227bul, status);
            if (interfaceC5227bul != null) {
                BillboardView.this.e(interfaceC5227bul, this.a, this.b);
            }
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void h(List<InterfaceC5227bul> list, Status status) {
            super.h(list, status);
            if (list.isEmpty()) {
                return;
            }
            BillboardView.this.d(list.get(0).aE_(), list.get(0).getType(), this.a, this.b);
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void e(InterfaceC5194buE interfaceC5194buE, Status status) {
            super.e(interfaceC5194buE, status);
            if (interfaceC5194buE != null) {
                if (this.e) {
                    BillboardView.this.o().getServiceManager().j().e(interfaceC5194buE.bU_(), null, false, new a(this.a, this.b), "BBView.CW");
                } else {
                    BillboardView.this.e(interfaceC5194buE, this.a, this.b);
                }
            }
        }
    }

    void e(InterfaceC5198buI interfaceC5198buI, Button button, String str) {
        d(interfaceC5198buI.aE_(), interfaceC5198buI.getType(), button, str);
    }

    void d(final InterfaceC5160btX interfaceC5160btX, final VideoType videoType, Button button, final String str) {
        final ServiceManager serviceManager = o().getServiceManager();
        button.requestFocus();
        button.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.lomo.BillboardView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CLv2Utils.INSTANCE.e(new Focus(AppView.playButton, BillboardView.this.z.c((JSONObject) null)), new PlayCommand(null));
                BillboardView billboardView = BillboardView.this;
                BillboardInteractionType billboardInteractionType = BillboardInteractionType.ACTION;
                billboardView.c(billboardInteractionType);
                if (serviceManager.c()) {
                    InterfaceC5125bsp j = serviceManager.j();
                    BillboardView billboardView2 = BillboardView.this;
                    j.e(billboardView2.D, billboardInteractionType, billboardView2.l);
                }
                PlayerExtras playerExtras = new PlayerExtras(TextUtils.isEmpty(str) ? -1L : Long.parseLong(str) * 1000);
                playerExtras.b(BillboardView.this.b);
                PlaybackLauncher playbackLauncher = BillboardView.this.playbackLauncher.get();
                InterfaceC5160btX interfaceC5160btX2 = interfaceC5160btX;
                VideoType videoType2 = videoType;
                playbackLauncher.d(interfaceC5160btX2, videoType2, BillboardView.this.z.d(videoType2 == VideoType.SUPPLEMENTAL), playerExtras, PlaybackLauncher.c);
            }
        });
    }

    private void b(BillboardSummary billboardSummary) {
        if (billboardSummary.getLogo() == null || billboardSummary.getLogo().getWidth() == null || billboardSummary.getLogo().getHeight() == null) {
            return;
        }
        int intValue = billboardSummary.getLogo().getWidth().intValue();
        int intValue2 = billboardSummary.getLogo().getHeight().intValue();
        int d = d() / 2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.b.f);
        int i = this.d;
        if (billboardSummary.isOriginal()) {
            dimensionPixelSize = Math.min(i / 3, getResources().getDimensionPixelSize(R.b.e));
        }
        int i2 = (intValue2 * dimensionPixelSize) / intValue;
        if (i2 > d) {
            dimensionPixelSize = (dimensionPixelSize * d) / i2;
        } else {
            d = i2;
        }
        ViewGroup.LayoutParams layoutParams = this.I.getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = d;
        this.I.setLayoutParams(layoutParams);
    }

    private void b(BillboardAsset billboardAsset) {
        if (billboardAsset != null) {
            this.x = billboardAsset.getUrl();
            this.E.setTextColor(getResources().getColor(R.c.c));
            this.E.setShadowLayer(2.0f, 0.0f, -1.0f, getResources().getColor(C9834xU.c.x));
            this.f13285o.setTextColor(getResources().getColor(C9834xU.c.I));
            this.f13285o.setShadowLayer(2.0f, 0.0f, -1.0f, getResources().getColor(C9834xU.c.x));
        }
    }

    private void c(String str, boolean z) {
        bDC bdc;
        if (this.t && !TextUtils.isEmpty(str) && ((bdc = this.B) == null || !bdc.d())) {
            this.u.setVisibility(0);
            if (this.B == null) {
                this.B = new C6437cdL(this.G, z, 3, 0.0f, AssetType.motionBillboard, new bDC.c() { // from class: com.netflix.mediaclient.ui.lomo.BillboardView.2
                    @Override // o.bDC.c
                    public void b() {
                    }

                    @Override // o.bDC.c
                    public void c() {
                    }

                    @Override // o.bDC.c
                    public void e(int i, int i2) {
                    }

                    @Override // o.bDC.c
                    public void d() {
                        BillboardView.this.h();
                    }
                });
                b(Uri.parse(str).buildUpon().clearQuery().build().toString());
                return;
            }
            B();
            return;
        }
        h();
    }

    private void b(String str) {
        o().getServiceManager().c(str, AssetType.motionBillboard, new AbstractC5164btb() { // from class: com.netflix.mediaclient.ui.lomo.BillboardView.7
            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void a(String str2, String str3, long j, long j2, Status status) {
                if (status.i() || BillboardView.this.B == null || TextUtils.isEmpty(str3)) {
                    return;
                }
                BillboardView.this.B.d(str3, j, j2);
                BillboardView.this.B();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        C1044Mm.b("BillboardView", "Showing motion BB");
        this.u.setVisibility(8);
        this.G.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        C1044Mm.b("BillboardView", "Hiding motion BB");
        this.u.setVisibility(0);
        this.G.setVisibility(8);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (z && this.D != null) {
            C1044Mm.b("BillboardView", "Playback ready, updating myList state");
            t();
        }
        bDC bdc = this.B;
        if (bdc == null || !this.H) {
            C1044Mm.b("BillboardView", "null mediaPlayerWrapper - bailing");
        } else if (z) {
            if (bdc.d()) {
                C1044Mm.b("BillboardView", "Received focus but media playback complete - skipping resume");
                h();
            } else if (this.B.j()) {
            } else {
                C1044Mm.b("BillboardView", "Playback not ready yet, but showing motion BB");
                B();
            }
        } else {
            C1044Mm.b("BillboardView", "Losing window focus - pausing playback");
            this.B.b();
        }
    }

    @Override // o.InterfaceC6434cdI.c
    public boolean c() {
        C1215Tc c1215Tc;
        NetflixImageView netflixImageView = this.I;
        return (netflixImageView != null && netflixImageView.isImageContentMissingForPresentationTracking()) || ((c1215Tc = this.u) != null && c1215Tc.isImageContentMissingForPresentationTracking());
    }

    public void r() {
        TrackingInfoHolder trackingInfoHolder = this.z;
        String str = this.C;
        if (trackingInfoHolder == null || str == null) {
            return;
        }
        CLv2Utils.b(false, AppView.synopsisEvidence, trackingInfoHolder.c((String) null, str, (String) null), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NetflixActivity o() {
        return NetflixActivity.requireNetflixActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NetflixActivity a() {
        return (NetflixActivity) C8141del.d(getContext(), NetflixActivity.class);
    }

    private void K(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$6741);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
