package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.BillboardInteractionType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.GameTagRecipe;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.games.api.GameBillboardCanvas;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.RecommendedTrailer;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.RatingDetails;
import com.netflix.model.leafs.originals.TagSummary;
import dagger.Lazy;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import o.AbstractC3073as;
import o.AbstractC3893bOo;
import o.AbstractC3961bRb;
import o.C1026Lt;
import o.C3796bKz;
import o.C3895bOq;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC3825bMa;
import o.aIB;
import o.bNK;
import o.bNN;
import o.bOL;
import o.dpR;

/* loaded from: classes4.dex */
public final class bNW implements bNN {
    private static int b = 0;
    private static int d = 1;
    public static final d e;
    private static byte e$ss2$574;
    private final bNS a;
    private final Lazy<PlaybackLauncher> c;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[GameBillboardCanvas.values().length];
            try {
                iArr[GameBillboardCanvas.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GameBillboardCanvas.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GameBillboardCanvas.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr;
        }
    }

    static {
        a();
        e = new d(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(int i, int i2, int i3) {
        return i;
    }

    static void a() {
        e$ss2$574 = (byte) 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i, int i2, int i3) {
        return i;
    }

    @Inject
    public bNW(bNS bns, Lazy<PlaybackLauncher> lazy) {
        C8632dsu.c((Object) bns, "");
        C8632dsu.c((Object) lazy, "");
        this.a = bns;
        this.c = lazy;
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // o.bNN
    public AbstractC3073as<?> a(String str, Context context, InterfaceC4467bf<AbstractC3073as<?>, AbstractC3179au> interfaceC4467bf) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) context, "");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C3796bKz.d.d);
        boolean e2 = BrowseExperience.e();
        C3780bKj c3780bKj = new C3780bKj();
        c3780bKj.e((CharSequence) str);
        c3780bKj.e(C3895bOq.c.m);
        c3780bKj.e(true);
        if (interfaceC4467bf != null) {
            c3780bKj.d((InterfaceC4467bf) C9726vo.d(interfaceC4467bf, InterfaceC4467bf.class));
        }
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.b((CharSequence) (str + "-image"));
        c3787bKq.d(true);
        c3787bKq.d(Integer.valueOf(dimensionPixelSize));
        c3787bKq.c(400L);
        c3787bKq.a(e2);
        c3780bKj.add(c3787bKq);
        C3787bKq c3787bKq2 = new C3787bKq();
        c3787bKq2.b((CharSequence) (str + "-title"));
        float f = (float) 4;
        C1332Xp c1332Xp = C1332Xp.b;
        float f2 = (float) 0;
        c3787bKq2.d(new Rect((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        c3787bKq2.d(true);
        c3787bKq2.c(400L);
        c3787bKq2.a(e2);
        c3780bKj.add(c3787bKq2);
        return c3780bKj;
    }

    @Override // o.bNN
    public void c(InterfaceC2023aX interfaceC2023aX, String str, Context context, int i, InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) context, "");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C9834xU.a.t);
        boolean e2 = BrowseExperience.e();
        C3780bKj c3780bKj = new C3780bKj();
        c3780bKj.e(C3895bOq.c.ae);
        c3780bKj.e((CharSequence) str);
        c3780bKj.c(new Pair<>(Integer.valueOf(i), -1));
        if (interfaceC4467bf != null) {
            c3780bKj.b((InterfaceC4467bf) C9726vo.d(interfaceC4467bf, InterfaceC4467bf.class));
        }
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.b((CharSequence) (str + "-ip-based-game-banner"));
        c3787bKq.d(true);
        c3787bKq.d(Integer.valueOf(dimensionPixelSize));
        c3787bKq.c(400L);
        c3787bKq.a(e2);
        c3780bKj.add(c3787bKq);
        C3787bKq c3787bKq2 = new C3787bKq();
        c3787bKq2.b((CharSequence) (str + "-ip-based-game-trailer"));
        c3787bKq2.d(true);
        c3787bKq2.d(Integer.valueOf(dimensionPixelSize));
        c3787bKq2.c(400L);
        c3787bKq2.a(e2);
        c3780bKj.add(c3787bKq2);
        C3787bKq c3787bKq3 = new C3787bKq();
        c3787bKq3.b((CharSequence) (str + "-ip-based-game-info"));
        c3787bKq3.d(true);
        c3787bKq3.d(Integer.valueOf(dimensionPixelSize));
        c3787bKq3.c(400L);
        c3787bKq3.a(e2);
        c3780bKj.add(c3787bKq3);
        interfaceC2023aX.add(c3780bKj);
    }

    @Override // o.bNN
    public void c(InterfaceC2023aX interfaceC2023aX, InterfaceC5185btw interfaceC5185btw, Integer num, int i, Integer num2, Integer num3, AppView appView, InterfaceC3825bMa.a aVar, View.OnClickListener onClickListener, TrackingInfoHolder trackingInfoHolder, bLU blu, InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5185btw, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) blu, "");
        interfaceC2023aX.add(bNN.b.d(this, interfaceC5185btw, num, i, num3, appView, aVar, onClickListener, trackingInfoHolder, blu.c(), interfaceC4467bf, false, num2, 1024, null));
    }

    @Override // o.bNN
    public void a(InterfaceC2023aX interfaceC2023aX, String str, String str2, String str3, String str4, Integer num, int i, Integer num2, Integer num3, AppView appView, InterfaceC3825bMa.a aVar, View.OnClickListener onClickListener, TrackingInfoHolder trackingInfoHolder, bLU blu, InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) blu, "");
        interfaceC2023aX.add(c(this, str, str2, str4, str3, num, i, num3, appView, aVar, onClickListener, trackingInfoHolder, blu.c(), interfaceC4467bf, false, num2, 8192, null));
    }

    @Override // o.bNN
    public AbstractC3073as<?> b(InterfaceC5185btw interfaceC5185btw, Integer num, int i, Integer num2, AppView appView, InterfaceC3825bMa.a aVar, View.OnClickListener onClickListener, TrackingInfoHolder trackingInfoHolder, InterfaceC4732bk<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4732bk, InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf, boolean z, Integer num3) {
        C8632dsu.c((Object) interfaceC5185btw, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        String id = interfaceC5185btw.getId();
        C8632dsu.a(id, "");
        return d(id, interfaceC5185btw.getTitle(), interfaceC5185btw.a(), interfaceC5185btw.getBoxshotUrl(), num, i, num2, appView, aVar, onClickListener, trackingInfoHolder, interfaceC4732bk, interfaceC4467bf, z, num3);
    }

    static /* synthetic */ AbstractC3073as c(bNW bnw, String str, String str2, String str3, String str4, Integer num, int i, Integer num2, AppView appView, InterfaceC3825bMa.a aVar, View.OnClickListener onClickListener, TrackingInfoHolder trackingInfoHolder, InterfaceC4732bk interfaceC4732bk, InterfaceC4467bf interfaceC4467bf, boolean z, Integer num3, int i2, Object obj) {
        return bnw.d(str, str2, str3, str4, num, i, num2, appView, aVar, onClickListener, trackingInfoHolder, interfaceC4732bk, interfaceC4467bf, (i2 & 8192) != 0 ? false : z, (i2 & 16384) != 0 ? null : num3);
    }

    private final AbstractC3073as<?> d(String str, String str2, String str3, String str4, Integer num, int i, Integer num2, AppView appView, InterfaceC3825bMa.a aVar, View.OnClickListener onClickListener, final TrackingInfoHolder trackingInfoHolder, final InterfaceC4732bk<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4732bk, final InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf, boolean z, Integer num3) {
        C3962bRc c3962bRc = new C3962bRc();
        c3962bRc.a((CharSequence) ("game-icon-" + i + "-" + str));
        if (num != null) {
            c3962bRc.a(num.intValue());
        }
        c3962bRc.g(str2);
        c3962bRc.a(str4);
        c3962bRc.c(str3);
        if (num2 != null) {
            c3962bRc.d(num2);
        }
        if (z) {
            c3962bRc.a((Integer) null);
        }
        c3962bRc.e(trackingInfoHolder);
        c3962bRc.d((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.GameModelsImpl$getGameIconModel$1$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        c3962bRc.b(appView);
        c3962bRc.b(onClickListener);
        c3962bRc.e(aVar);
        if (num3 != null) {
            c3962bRc.b(num3.intValue());
        }
        c3962bRc.c(new InterfaceC4732bk() { // from class: o.bOj
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj, int i2) {
                bNW.d(InterfaceC4732bk.this, (C3962bRc) abstractC3073as, (AbstractC3961bRb.d) obj, i2);
            }
        });
        c3962bRc.e(new InterfaceC4467bf() { // from class: o.bOm
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i2) {
                bNW.b(InterfaceC4467bf.this, (C3962bRc) abstractC3073as, (AbstractC3961bRb.d) obj, i2);
            }
        });
        return c3962bRc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC4732bk interfaceC4732bk, C3962bRc c3962bRc, AbstractC3961bRb.d dVar, int i) {
        if (interfaceC4732bk != null) {
            if (!(c3962bRc instanceof AbstractC3073as)) {
                c3962bRc = null;
            }
            if (!(dVar instanceof AbstractC3179au)) {
                dVar = null;
            }
            interfaceC4732bk.b(c3962bRc, dVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4467bf interfaceC4467bf, C3962bRc c3962bRc, AbstractC3961bRb.d dVar, int i) {
        if (interfaceC4467bf != null) {
            if (!(c3962bRc instanceof AbstractC3073as)) {
                c3962bRc = null;
            }
            interfaceC4467bf.c(c3962bRc, dVar, i);
        }
    }

    @Override // o.bNN
    public void d(InterfaceC2023aX interfaceC2023aX, int i, InterfaceC5141btE interfaceC5141btE, AbstractC5100bsQ abstractC5100bsQ, TrackingInfoHolder trackingInfoHolder, Context context, bLW blw, C9935zP c9935zP, AppView appView, String str, GameBillboardCanvas gameBillboardCanvas, Integer num, drO<dpR> dro, bLU blu) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5141btE, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) gameBillboardCanvas, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) blu, "");
        int i2 = c.b[gameBillboardCanvas.ordinal()];
        if (i2 == 1) {
            a(interfaceC2023aX, i, interfaceC5141btE, abstractC5100bsQ, trackingInfoHolder, context, blw, c9935zP, appView, str, GameBillboardCanvas.c, num, dro, blu);
        } else if (i2 == 2) {
            a(interfaceC2023aX, i, interfaceC5141btE, abstractC5100bsQ, trackingInfoHolder, context, blw, c9935zP, appView, str, GameBillboardCanvas.b, dro, blu);
        } else if (i2 != 3) {
        } else {
            b(interfaceC2023aX, i, interfaceC5141btE, abstractC5100bsQ, trackingInfoHolder, context, blw, appView, str, GameBillboardCanvas.a, dro, blu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC4467bf interfaceC4467bf, bOJ boj, bOL.a aVar, int i) {
        if (interfaceC4467bf != null) {
            if (!(boj instanceof AbstractC3073as)) {
                boj = null;
            }
            interfaceC4467bf.c(boj, aVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC4732bk interfaceC4732bk, bOJ boj, bOL.a aVar, int i) {
        C8632dsu.c((Object) interfaceC4732bk, "");
        if (!(boj instanceof AbstractC3073as)) {
            boj = null;
        }
        interfaceC4732bk.b(boj, aVar, i);
    }

    @Override // o.bNN
    public void a(InterfaceC2023aX interfaceC2023aX, Context context, InterfaceC5145btI interfaceC5145btI, int i, AppView appView, final TrackingInfoHolder trackingInfoHolder, InterfaceC3825bMa.a aVar, C9935zP c9935zP, boolean z, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i2, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, String str, InterfaceC6718cib interfaceC6718cib, bLW blw, String str2, bLU blu, final InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf) {
        AppView appView2;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC5145btI, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC6718cib, "");
        C8632dsu.c((Object) blu, "");
        RecommendedTrailer l = interfaceC5145btI.l();
        C3966bRg c3966bRg = new C3966bRg();
        String id = interfaceC5145btI.getId();
        c3966bRg.b("ip-based-game-" + id + "-group");
        c3966bRg.d(C3895bOq.c.ab);
        c3966bRg.b(Integer.valueOf(i));
        c3966bRg.e(true);
        c3966bRg.a(appView);
        c3966bRg.e(new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.GameModelsImpl$addIpBasedGameItem$1$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        c3966bRg.c(onClickListener);
        c3966bRg.c(aVar);
        c3966bRg.a(new C9686vA(context.getResources().getDimensionPixelSize(C9834xU.a.t), false, false, 6, null));
        c3966bRg.b(blu.c());
        c3966bRg.c(new InterfaceC4467bf() { // from class: o.bOk
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                bNW.c(InterfaceC4467bf.this, (C3966bRg) abstractC3073as, (C2077aZ) obj, i3);
            }
        });
        C3976bRq c3976bRq = new C3976bRq();
        String id2 = interfaceC5145btI.getId();
        c3976bRq.e((CharSequence) ("ip-based-game-" + id2));
        c3976bRq.d(interfaceC5145btI.n());
        c3976bRq.e(interfaceC5145btI.j());
        c3976bRq.b(interfaceC5145btI.getTitle());
        c3966bRg.add(c3976bRq);
        C3964bRe c3964bRe = new C3964bRe();
        String id3 = interfaceC5145btI.getId();
        c3964bRe.c((CharSequence) ("game-trailer-" + id3));
        c3964bRe.b(i2);
        c3964bRe.d(C3895bOq.c.D);
        c3964bRe.a(new C9686vA(context.getResources().getDimensionPixelSize(C9834xU.a.s), false, false, 6, null));
        c3964bRe.c(i2);
        c3964bRe.e(i2);
        c3964bRe.d(l != null ? l.getSupplementalVideoInterestingUrl() : null);
        c3964bRe.e(l != null ? l.getSupplementalVideoId() : null);
        c3964bRe.b((PlayContext) trackingInfoHolder.d(true));
        c3964bRe.e(true);
        c3964bRe.c(str2);
        if (l != null) {
            c3964bRe.f(l.getSupplementalVideoRuntime());
        }
        c3964bRe.b(false);
        c3964bRe.d(Float.valueOf(1.778f));
        c3964bRe.e(interfaceC6718cib);
        c3964bRe.d(false);
        c3964bRe.e(appView);
        c3964bRe.a(miniPlayerVideoGroupViewModel);
        c3964bRe.a(str);
        c3964bRe.j(interfaceC5145btI.getTitle());
        c3964bRe.b(appView.name());
        c3964bRe.e(c9935zP);
        if (blw != null) {
            c3964bRe.b(blw.c());
        }
        c3966bRg.add(c3964bRe);
        C3793bKw c3793bKw = new C3793bKw();
        String id4 = interfaceC5145btI.getId();
        c3793bKw.e((CharSequence) ("ip-based-game-bottom-row-" + id4));
        c3793bKw.c(C3895bOq.c.ac);
        c3793bKw.c(appView);
        c3793bKw.d(aVar);
        c3793bKw.b((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.GameModelsImpl$addIpBasedGameItem$1$5$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        C3968bRi c3968bRi = new C3968bRi();
        c3968bRi.b(interfaceC5145btI.getId());
        c3968bRi.c(interfaceC5145btI.getBoxshotUrl());
        c3968bRi.e(interfaceC5145btI.getTitle());
        c3968bRi.d(interfaceC5145btI.a());
        c3793bKw.add(c3968bRi);
        C6952cmx c6952cmx = new C6952cmx();
        String id5 = interfaceC5145btI.getId();
        c6952cmx.e((CharSequence) ("my-list-game-" + id5));
        c6952cmx.d(C3895bOq.c.ah);
        c6952cmx.b(interfaceC5145btI.getId());
        c6952cmx.c(interfaceC5145btI.getType());
        c6952cmx.c(c9935zP.d());
        c6952cmx.c(trackingInfoHolder);
        c6952cmx.e(interfaceC5145btI.m());
        c3793bKw.add(c6952cmx);
        C3945bQm c3945bQm = new C3945bQm();
        String id6 = interfaceC5145btI.getId();
        c3945bQm.e((CharSequence) ("ip-based-game-bottom-row-get-game-" + id6));
        c3945bQm.e(C3895bOq.c.Y);
        c3945bQm.e(z);
        c3945bQm.a(this.a.e(interfaceC5145btI));
        c3945bQm.c(onClickListener2);
        if (z) {
            appView2 = AppView.gameLaunchButton;
        } else {
            appView2 = AppView.gameInstallButton;
        }
        c3945bQm.b(appView2);
        c3945bQm.e((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.GameModelsImpl$addIpBasedGameItem$1$5$4$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        c3793bKw.add(c3945bQm);
        c3966bRg.add(c3793bKw);
        interfaceC2023aX.add(c3966bRg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC4467bf interfaceC4467bf, C3966bRg c3966bRg, C2077aZ c2077aZ, int i) {
        if (interfaceC4467bf != null) {
            if (!(c3966bRg instanceof AbstractC3073as)) {
                c3966bRg = null;
            }
            interfaceC4467bf.c(c3966bRg, c2077aZ, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC5141btE interfaceC5141btE, NetflixActivity netflixActivity, TrackingInfoHolder trackingInfoHolder, AppView appView, bNW bnw, View view) {
        C8632dsu.c((Object) interfaceC5141btE, "");
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) bnw, "");
        C3980bRu.b(interfaceC5141btE, netflixActivity, TrackingInfoHolder.b(trackingInfoHolder, false, 1, null), appView, trackingInfoHolder, bnw.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z, TrackingInfoHolder trackingInfoHolder, InterfaceC5141btE interfaceC5141btE, bNW bnw, NetflixActivity netflixActivity, View view) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) interfaceC5141btE, "");
        C8632dsu.c((Object) bnw, "");
        C8632dsu.c((Object) netflixActivity, "");
        if (z) {
            String a2 = AbstractC8266dhD.a();
            TrackingInfo e2 = TrackingInfoHolder.e(trackingInfoHolder, null, 1, null);
            C8632dsu.d((Object) a2);
            bOK.e(e2, a2);
            String k = interfaceC5141btE.k();
            if (k == null || k.length() == 0) {
                return;
            }
            bNS bns = bnw.a;
            bNK.e eVar = bNK.c;
            String title = interfaceC5141btE.getTitle();
            C8632dsu.a(title, "");
            bns.d(eVar.e(netflixActivity, k, a2, title, true, interfaceC5141btE.h()));
            return;
        }
        C3980bRu.a(netflixActivity, trackingInfoHolder, interfaceC5141btE, bnw.a);
    }

    private final void a(InterfaceC2023aX interfaceC2023aX, final InterfaceC5141btE interfaceC5141btE, final TrackingInfoHolder trackingInfoHolder, final NetflixActivity netflixActivity, final AppView appView, final boolean z, bLU blu) {
        AppView appView2;
        AppView appView3;
        int i = 2 % 2;
        C3793bKw c3793bKw = new C3793bKw();
        String id = interfaceC5141btE.getId();
        c3793bKw.e((CharSequence) ("games-billboard-buttons" + id));
        c3793bKw.c(C3895bOq.c.t);
        if (!(!z)) {
            appView2 = AppView.gameLaunchButton;
        } else {
            appView2 = AppView.gameInstallButton;
            int i2 = b + 87;
            d = i2 % 128;
            int i3 = i2 % 2;
        }
        c3793bKw.c(appView2);
        c3793bKw.b((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.GameModelsImpl$addBillboardCTAs$1$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        c3793bKw.d(blu.c());
        C3805bLh c3805bLh = new C3805bLh();
        c3805bLh.e((CharSequence) "left_button");
        c3805bLh.c(C3895bOq.c.z);
        c3805bLh.a(Integer.valueOf(C1026Lt.a.Bw));
        String string = netflixActivity.getString(com.netflix.mediaclient.ui.R.o.aj);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        c3805bLh.b((CharSequence) string);
        c3805bLh.b(new View.OnClickListener() { // from class: o.bNZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bNW.b(InterfaceC5141btE.this, netflixActivity, trackingInfoHolder, appView, this, view);
            }
        });
        c3793bKw.add(c3805bLh);
        C3945bQm c3945bQm = new C3945bQm();
        c3945bQm.e((CharSequence) "play-install-button");
        c3945bQm.e(C3895bOq.c.af);
        c3945bQm.e(z);
        c3945bQm.a(this.a.e(interfaceC5141btE));
        c3945bQm.c(new View.OnClickListener() { // from class: o.bOc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bNW.e(z, trackingInfoHolder, interfaceC5141btE, this, netflixActivity, view);
            }
        });
        c3945bQm.d(new AbstractC3073as.b() { // from class: o.bOb
            @Override // o.AbstractC3073as.b
            public final int b(int i4, int i5, int i6) {
                int c2;
                c2 = bNW.c(i4, i5, i6);
                return c2;
            }
        });
        if (z) {
            int i4 = d + 111;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                AppView appView4 = AppView.gameLaunchButton;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            appView3 = AppView.gameLaunchButton;
        } else {
            appView3 = AppView.gameInstallButton;
        }
        c3945bQm.b(appView3);
        c3945bQm.e((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.GameModelsImpl$addBillboardCTAs$1$3$3
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        c3793bKw.add(c3945bQm);
        C3805bLh c3805bLh2 = new C3805bLh();
        c3805bLh2.e((CharSequence) "right-button");
        c3805bLh2.c(C3895bOq.c.z);
        c3805bLh2.a(Integer.valueOf(C1026Lt.a.hn));
        String string2 = netflixActivity.getString(com.netflix.mediaclient.ui.R.o.dS);
        if (string2.startsWith("'!#+")) {
            Object[] objArr2 = new Object[1];
            f(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
        }
        c3805bLh2.b((CharSequence) string2);
        c3805bLh2.b(new View.OnClickListener() { // from class: o.bOe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bNW.e(NetflixActivity.this, interfaceC5141btE, trackingInfoHolder, appView, view);
            }
        });
        c3793bKw.add(c3805bLh2);
        interfaceC2023aX.add(c3793bKw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NetflixActivity netflixActivity, InterfaceC5141btE interfaceC5141btE, TrackingInfoHolder trackingInfoHolder, AppView appView, View view) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5141btE, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) appView, "");
        C3980bRu.a(netflixActivity, interfaceC5141btE, trackingInfoHolder, appView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z, TrackingInfoHolder trackingInfoHolder, InterfaceC5141btE interfaceC5141btE, bNW bnw, NetflixActivity netflixActivity, View view) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) interfaceC5141btE, "");
        C8632dsu.c((Object) bnw, "");
        C8632dsu.c((Object) netflixActivity, "");
        if (z) {
            String a2 = AbstractC8266dhD.a();
            TrackingInfo e2 = TrackingInfoHolder.e(trackingInfoHolder, null, 1, null);
            C8632dsu.d((Object) a2);
            bOK.e(e2, a2);
            String k = interfaceC5141btE.k();
            if (k == null || k.length() == 0) {
                return;
            }
            bNS bns = bnw.a;
            bNK.e eVar = bNK.c;
            String title = interfaceC5141btE.getTitle();
            C8632dsu.a(title, "");
            bns.d(eVar.e(netflixActivity, k, a2, title, true, interfaceC5141btE.h()));
            return;
        }
        C3980bRu.a(netflixActivity, trackingInfoHolder, interfaceC5141btE, bnw.a);
    }

    private final void b(InterfaceC2023aX interfaceC2023aX, int i, final InterfaceC5141btE interfaceC5141btE, AbstractC5100bsQ abstractC5100bsQ, TrackingInfoHolder trackingInfoHolder, Context context, bLW blw, AppView appView, String str, GameBillboardCanvas gameBillboardCanvas, drO<dpR> dro, bLU blu) {
        Object obj;
        String k = interfaceC5141btE.k();
        if (k == null) {
            k = "";
        }
        boolean e2 = this.a.e(k);
        final NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(context, NetflixActivity.class);
        String n = interfaceC5141btE.n();
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) ("game-billboard-" + i));
        c1781aO.e(C3895bOq.c.h);
        b(this, c1781aO, null, interfaceC5141btE, n, null, false, trackingInfoHolder, abstractC5100bsQ, appView, netflixActivity, context, blw, str, gameBillboardCanvas, dro, blu, 25, null);
        C3899bOu c3899bOu = new C3899bOu();
        c3899bOu.b(interfaceC5141btE.getId());
        c3899bOu.a(interfaceC5141btE.getTitle());
        c3899bOu.d(interfaceC5141btE.getBoxshotUrl());
        c1781aO.add(c3899bOu);
        bOA boa = new bOA();
        boa.a(interfaceC5141btE.getId());
        boa.e(interfaceC5141btE.a());
        Iterator<T> it = interfaceC5141btE.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Advisory) obj) instanceof ContentAdvisory) {
                break;
            }
        }
        Advisory advisory = (Advisory) obj;
        if (advisory != null) {
            C8632dsu.d(advisory);
            ContentAdvisory contentAdvisory = (ContentAdvisory) advisory;
            C1332Xp c1332Xp = C1332Xp.b;
            boa.e(((InterfaceC1610aHr) C1332Xp.b(InterfaceC1610aHr.class)).b((RatingDetails) advisory, true));
            boa.c(contentAdvisory.getI18nRating());
            boa.d(interfaceC5141btE.b());
            boa.b(contentAdvisory.getRatingShortDescription());
        }
        boa.b(e2);
        boa.e(new View.OnClickListener() { // from class: o.bOs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bNW.a(NetflixActivity.this, interfaceC5141btE, view);
            }
        });
        c1781aO.add(boa);
        interfaceC2023aX.add(c1781aO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(NetflixActivity netflixActivity, InterfaceC5141btE interfaceC5141btE, View view) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5141btE, "");
        if (ConfigFastPropertyFeatureControlConfig.Companion.q()) {
            C3912bPg.e.c(netflixActivity, interfaceC5141btE);
        }
    }

    private final boolean a(Context context) {
        return (C8067ddQ.c() || AccessibilityUtils.a(context)) ? false : true;
    }

    private final void d(InterfaceC2023aX interfaceC2023aX, int i, InterfaceC5141btE interfaceC5141btE, AbstractC5100bsQ abstractC5100bsQ, TrackingInfoHolder trackingInfoHolder, Context context, bLW blw, AppView appView, String str, GameBillboardCanvas gameBillboardCanvas, C9935zP c9935zP, drO<dpR> dro, bLU blu) {
        ArrayList arrayList;
        int d2;
        RecommendedTrailer l = interfaceC5141btE.l();
        String supplementalVideoId = l != null ? l.getSupplementalVideoId() : null;
        RecommendedTrailer l2 = interfaceC5141btE.l();
        String supplementalVideoInterestingUrl = l2 != null ? l2.getSupplementalVideoInterestingUrl() : null;
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(context, NetflixActivity.class);
        String k = interfaceC5141btE.k();
        if (k == null) {
            k = "";
        }
        boolean e2 = this.a.e(k);
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) ("game-billboard-" + i));
        c1781aO.e(C3895bOq.c.u);
        b(c1781aO, Integer.valueOf(C3895bOq.c.C), interfaceC5141btE, supplementalVideoId, supplementalVideoInterestingUrl, true, trackingInfoHolder, abstractC5100bsQ, appView, netflixActivity, context, blw, str, gameBillboardCanvas, dro, blu);
        List<TagSummary> e3 = interfaceC5141btE.e(GameTagRecipe.a);
        if (e3 != null) {
            d2 = C8572dqo.d(e3, 10);
            arrayList = new ArrayList(d2);
            for (TagSummary tagSummary : e3) {
                arrayList.add(tagSummary.getTitle());
            }
        } else {
            arrayList = null;
        }
        bOE boe = new bOE();
        String id = interfaceC5141btE.getId();
        boe.c((CharSequence) ("game-tablet-and-fold-billboard-content-" + id));
        boe.e(interfaceC5141btE.getTitle());
        boe.d(interfaceC5141btE.getBoxshotUrl());
        boe.b((List<String>) arrayList);
        c1781aO.add(boe);
        if (GameBillboardCanvas.c == gameBillboardCanvas && C1871aRi.e.e().d()) {
            d(c1781aO, C3895bOq.c.B, interfaceC5141btE, trackingInfoHolder, netflixActivity, c9935zP, appView, e2, blu);
        } else {
            bJN bjn = new bJN();
            bjn.e((CharSequence) "game-tablet-and-fold-billboard-content-empty-ctas");
            c1781aO.add(bjn);
        }
        interfaceC2023aX.add(c1781aO);
    }

    static /* synthetic */ void b(bNW bnw, InterfaceC2023aX interfaceC2023aX, Integer num, InterfaceC5141btE interfaceC5141btE, String str, String str2, boolean z, TrackingInfoHolder trackingInfoHolder, AbstractC5100bsQ abstractC5100bsQ, AppView appView, NetflixActivity netflixActivity, Context context, bLW blw, String str3, GameBillboardCanvas gameBillboardCanvas, drO dro, bLU blu, int i, Object obj) {
        bnw.b(interfaceC2023aX, (i & 1) != 0 ? null : num, interfaceC5141btE, str, (i & 8) != 0 ? interfaceC5141btE.j() : str2, (i & 16) != 0 ? false : z, trackingInfoHolder, abstractC5100bsQ, appView, netflixActivity, context, blw, str3, gameBillboardCanvas, dro, blu);
    }

    private final void b(InterfaceC2023aX interfaceC2023aX, Integer num, final InterfaceC5141btE interfaceC5141btE, String str, String str2, boolean z, final TrackingInfoHolder trackingInfoHolder, AbstractC5100bsQ abstractC5100bsQ, AppView appView, final NetflixActivity netflixActivity, Context context, bLW blw, final String str3, GameBillboardCanvas gameBillboardCanvas, final drO<dpR> dro, bLU blu) {
        GameBillboardCanvas gameBillboardCanvas2 = GameBillboardCanvas.c;
        boolean z2 = true;
        boolean z3 = (gameBillboardCanvas2 != gameBillboardCanvas || C8153dex.v() || z) ? false : true;
        boolean z4 = gameBillboardCanvas2 == gameBillboardCanvas && C8153dex.v() && !z;
        bOD bod = new bOD();
        bod.b((CharSequence) ("game-motion-billboard-background-" + interfaceC5141btE.getId()));
        if (num != null) {
            num.intValue();
            bod.d(num.intValue());
        }
        bod.e(interfaceC5141btE.getId());
        bod.b(str2);
        if (str != null && str.length() != 0) {
            bod.d(Long.valueOf(Long.parseLong(str)));
        }
        bod.c(trackingInfoHolder);
        bod.a(abstractC5100bsQ);
        bod.d(new InterfaceC3825bMa.a(null, null, Integer.valueOf(trackingInfoHolder.a()), 3, null));
        bod.a((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.GameModelsImpl$buildBackground$1$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        bod.a(appView);
        if (C8151dev.j(context) && GameBillboardCanvas.a == gameBillboardCanvas) {
            bod.a(Integer.valueOf(netflixActivity.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.X)));
        }
        if (a(context)) {
            bod.e(d(blu.c(), blw != null ? blw.c() : null));
        } else {
            bod.e(blu.c());
        }
        bod.d(interfaceC5141btE.getTitle());
        bod.c(z3);
        if (z4) {
            bod.b(new C9686vA(context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.a), false, false, 6, null));
            bod.e(true);
        }
        if (!z4 && !z) {
            z2 = false;
        }
        bod.d(z2);
        bod.a((dwU) LifecycleOwnerKt.getLifecycleScope(netflixActivity));
        bod.b(new InterfaceC4467bf() { // from class: o.bOa
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i) {
                bNW.c(str3, netflixActivity, interfaceC5141btE, (bOD) abstractC3073as, (AbstractC3893bOo.b) obj, i);
            }
        });
        if (gameBillboardCanvas != GameBillboardCanvas.a) {
            bod.b(new View.OnClickListener() { // from class: o.bOd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bNW.a(drO.this, view);
                }
            });
        }
        interfaceC2023aX.add(bod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, NetflixActivity netflixActivity, InterfaceC5141btE interfaceC5141btE, bOD bod, AbstractC3893bOo.b bVar, int i) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5141btE, "");
        if (str != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("token", str);
            aIB.e.c(netflixActivity, new a(interfaceC5141btE, hashMap));
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements aIB.e {
        final /* synthetic */ InterfaceC5141btE b;
        final /* synthetic */ HashMap<String, String> c;

        a(InterfaceC5141btE interfaceC5141btE, HashMap<String, String> hashMap) {
            this.b = interfaceC5141btE;
            this.c = hashMap;
        }

        @Override // o.aIB.e
        public void run(ServiceManager serviceManager) {
            C8632dsu.c((Object) serviceManager, "");
            serviceManager.j().e(this.b, BillboardInteractionType.IMPRESSION, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drO dro, View view) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    private final <T extends AbstractC3073as<V>, V> InterfaceC4732bk<T, V> d(final InterfaceC4732bk<T, V> interfaceC4732bk, final InterfaceC4732bk<T, V> interfaceC4732bk2) {
        return new InterfaceC4732bk() { // from class: o.bOi
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj, int i) {
                bNW.e(InterfaceC4732bk.this, interfaceC4732bk, abstractC3073as, obj, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC4732bk interfaceC4732bk, InterfaceC4732bk interfaceC4732bk2, AbstractC3073as abstractC3073as, Object obj, int i) {
        C8632dsu.c((Object) interfaceC4732bk2, "");
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(abstractC3073as, obj, i);
        }
        interfaceC4732bk2.b(abstractC3073as, obj, i);
    }

    private final void a(InterfaceC2023aX interfaceC2023aX, int i, InterfaceC5141btE interfaceC5141btE, AbstractC5100bsQ abstractC5100bsQ, TrackingInfoHolder trackingInfoHolder, Context context, bLW blw, C9935zP c9935zP, AppView appView, String str, GameBillboardCanvas gameBillboardCanvas, Integer num, drO<dpR> dro, bLU blu) {
        ArrayList arrayList;
        int d2;
        String k = interfaceC5141btE.k();
        if (k == null) {
            k = "";
        }
        boolean e2 = this.a.e(k);
        String n = interfaceC5141btE.n();
        List<TagSummary> e3 = interfaceC5141btE.e(GameTagRecipe.a);
        if (e3 != null) {
            d2 = C8572dqo.d(e3, 10);
            arrayList = new ArrayList(d2);
            for (TagSummary tagSummary : e3) {
                arrayList.add(tagSummary.getTitle());
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(context, NetflixActivity.class);
        if (C8151dev.j((Context) C9737vz.e(context, Context.class))) {
            d(interfaceC2023aX, i, interfaceC5141btE, abstractC5100bsQ, trackingInfoHolder, context, blw, appView, str, gameBillboardCanvas, c9935zP, dro, blu);
        } else if (C8153dex.v()) {
            C1781aO c1781aO = new C1781aO();
            c1781aO.b((CharSequence) ("game-billboard-" + i));
            c1781aO.e(C3895bOq.c.y);
            bKU bku = new bKU();
            bku.a(num);
            c1781aO.add(bku);
            c1781aO.b(new AbstractC3073as.b() { // from class: o.bOg
                @Override // o.AbstractC3073as.b
                public final int b(int i2, int i3, int i4) {
                    int h;
                    h = bNW.h(i2, i3, i4);
                    return h;
                }
            });
            b(this, c1781aO, null, interfaceC5141btE, n, null, false, trackingInfoHolder, abstractC5100bsQ, appView, netflixActivity, context, blw, str, gameBillboardCanvas, dro, blu, 25, null);
            C3899bOu c3899bOu = new C3899bOu();
            c3899bOu.d(C3895bOq.c.b);
            c3899bOu.b(interfaceC5141btE.getId());
            c3899bOu.a(interfaceC5141btE.getTitle());
            c3899bOu.d(interfaceC5141btE.getBoxshotUrl());
            c1781aO.add(c3899bOu);
            C3904bOz c3904bOz = new C3904bOz();
            c3904bOz.a((List<String>) arrayList2);
            c1781aO.add(c3904bOz);
            d(c1781aO, C3895bOq.c.p, interfaceC5141btE, trackingInfoHolder, netflixActivity, c9935zP, appView, e2, blu);
            interfaceC2023aX.add(c1781aO);
        } else {
            C1781aO c1781aO2 = new C1781aO();
            c1781aO2.b((CharSequence) ("game-billboard-" + i));
            c1781aO2.e(C3895bOq.c.v);
            b(this, c1781aO2, null, interfaceC5141btE, n, null, false, trackingInfoHolder, abstractC5100bsQ, appView, netflixActivity, context, blw, str, gameBillboardCanvas, dro, blu, 25, null);
            C3899bOu c3899bOu2 = new C3899bOu();
            c3899bOu2.b(interfaceC5141btE.getId());
            c3899bOu2.a(interfaceC5141btE.getTitle());
            c3899bOu2.d(interfaceC5141btE.getBoxshotUrl());
            c1781aO2.add(c3899bOu2);
            C3904bOz c3904bOz2 = new C3904bOz();
            c3904bOz2.a((List<String>) arrayList2);
            c1781aO2.add(c3904bOz2);
            a(c1781aO2, interfaceC5141btE, trackingInfoHolder, netflixActivity, appView, e2, blu);
            interfaceC2023aX.add(c1781aO2);
        }
    }

    @Override // o.bNN
    public void a(InterfaceC2023aX interfaceC2023aX, InterfaceC3825bMa.a aVar, final TrackingInfoHolder trackingInfoHolder, AppView appView, drM<? super drM<? super String, dpR>, dpR> drm, final InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf, final InterfaceC4732bk<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4732bk) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) interfaceC4732bk, "");
        bOJ boj = new bOJ();
        boj.e((CharSequence) "game-feature-education-billboard");
        boj.a(aVar);
        boj.c((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.GameModelsImpl$addGameFeatureEducationBillboard$1$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        boj.b(appView);
        boj.c(drm);
        boj.c(new InterfaceC4467bf() { // from class: o.bOf
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i) {
                bNW.d(InterfaceC4467bf.this, (bOJ) abstractC3073as, (bOL.a) obj, i);
            }
        });
        boj.b(new InterfaceC4732bk() { // from class: o.bOh
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj, int i) {
                bNW.c(InterfaceC4732bk.this, (bOJ) abstractC3073as, (bOL.a) obj, i);
            }
        });
        interfaceC2023aX.add(boj);
    }

    @Override // o.bNN
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, String str, String str2, int i, RecommendedTrailer recommendedTrailer, TrackingInfoHolder trackingInfoHolder, String str3, InterfaceC6718cib interfaceC6718cib, AppView appView, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, String str4, C9935zP c9935zP, bLW blw, drX<? super View, ? super Boolean, dpR> drx) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) recommendedTrailer, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) interfaceC6718cib, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) drx, "");
        C3964bRe c3964bRe = new C3964bRe();
        c3964bRe.c((CharSequence) ("game-trailer-" + str));
        c3964bRe.b(i);
        c3964bRe.d(C3895bOq.c.D);
        c3964bRe.a(new C9686vA(context.getResources().getDimensionPixelSize(C9834xU.a.s), false, false, 6, null));
        c3964bRe.c(i);
        c3964bRe.e(i);
        c3964bRe.d(recommendedTrailer.getSupplementalVideoInterestingUrl());
        c3964bRe.e(recommendedTrailer.getSupplementalVideoId());
        c3964bRe.b((PlayContext) trackingInfoHolder.d(true));
        c3964bRe.c(str3);
        c3964bRe.f(recommendedTrailer.getSupplementalVideoRuntime());
        c3964bRe.b(false);
        c3964bRe.d(Float.valueOf(1.778f));
        c3964bRe.e(interfaceC6718cib);
        c3964bRe.d(false);
        c3964bRe.e(appView);
        c3964bRe.a(miniPlayerVideoGroupViewModel);
        c3964bRe.a(str4);
        c3964bRe.j(str2);
        c3964bRe.b(appView.name());
        c3964bRe.e(c9935zP);
        if (blw != null) {
            c3964bRe.b(blw.c());
        }
        c3964bRe.e(C8151dev.j((Context) C9737vz.e(context, Context.class)));
        c3964bRe.e((drX<? super View, ? super Boolean, dpR>) new drX<View, Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.GameModelsImpl$addGameTrailer$1$2
            @Override // o.drX
            public /* synthetic */ dpR invoke(View view, Boolean bool) {
                c(view, bool);
                return dpR.c;
            }

            public final void c(View view, Boolean bool) {
                NetflixImageView netflixImageView = (NetflixImageView) view.findViewById(C3895bOq.b.z);
                if (netflixImageView != null) {
                    ViewGroup.LayoutParams layoutParams = netflixImageView.getLayoutParams();
                    if (layoutParams != null) {
                        C8632dsu.d(bool);
                        layoutParams.height = bool.booleanValue() ? -1 : -2;
                        netflixImageView.setLayoutParams(layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        });
        interfaceC2023aX.add(c3964bRe);
    }

    private final void d(InterfaceC2023aX interfaceC2023aX, int i, final InterfaceC5141btE interfaceC5141btE, final TrackingInfoHolder trackingInfoHolder, final NetflixActivity netflixActivity, C9935zP c9935zP, AppView appView, final boolean z, bLU blu) {
        AppView appView2;
        AppView appView3;
        C3793bKw c3793bKw = new C3793bKw();
        String id = interfaceC5141btE.getId();
        c3793bKw.e((CharSequence) ("games-billboard-buttons-" + id));
        c3793bKw.c(i);
        if (z) {
            appView2 = AppView.gameLaunchButton;
        } else {
            appView2 = AppView.gameInstallButton;
        }
        c3793bKw.c(appView2);
        c3793bKw.b((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.GameModelsImpl$addBaselineBillboardCTAs$1$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        c3793bKw.d(blu.c());
        C3945bQm c3945bQm = new C3945bQm();
        c3945bQm.e((CharSequence) "play_install_button");
        c3945bQm.e(C3895bOq.c.w);
        c3945bQm.e(z);
        c3945bQm.a(this.a.e(interfaceC5141btE));
        c3945bQm.c(new View.OnClickListener() { // from class: o.bOl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bNW.b(z, trackingInfoHolder, interfaceC5141btE, this, netflixActivity, view);
            }
        });
        c3945bQm.d(new AbstractC3073as.b() { // from class: o.bOn
            @Override // o.AbstractC3073as.b
            public final int b(int i2, int i3, int i4) {
                int a2;
                a2 = bNW.a(i2, i3, i4);
                return a2;
            }
        });
        if (z) {
            appView3 = AppView.gameLaunchButton;
        } else {
            appView3 = AppView.gameInstallButton;
        }
        c3945bQm.b(appView3);
        c3945bQm.e((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.GameModelsImpl$addBaselineBillboardCTAs$1$2$3
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        c3793bKw.add(c3945bQm);
        C6952cmx c6952cmx = new C6952cmx();
        String id2 = interfaceC5141btE.getId();
        c6952cmx.e((CharSequence) ("my-list-game-" + id2));
        c6952cmx.d(C3895bOq.c.q);
        c6952cmx.b(interfaceC5141btE.getId());
        c6952cmx.c(interfaceC5141btE.getType());
        c6952cmx.c(c9935zP.d());
        c6952cmx.c(trackingInfoHolder);
        c6952cmx.e(interfaceC5141btE.m());
        c3793bKw.add(c6952cmx);
        interfaceC2023aX.add(c3793bKw);
    }

    private final void a(InterfaceC2023aX interfaceC2023aX, int i, InterfaceC5141btE interfaceC5141btE, AbstractC5100bsQ abstractC5100bsQ, TrackingInfoHolder trackingInfoHolder, Context context, bLW blw, C9935zP c9935zP, AppView appView, String str, GameBillboardCanvas gameBillboardCanvas, drO<dpR> dro, bLU blu) {
        if (C8151dev.j((Context) C9737vz.e(context, Context.class))) {
            d(interfaceC2023aX, i, interfaceC5141btE, abstractC5100bsQ, trackingInfoHolder, context, blw, appView, str, gameBillboardCanvas, c9935zP, dro, blu);
        } else {
            a(interfaceC2023aX, i, interfaceC5141btE, abstractC5100bsQ, trackingInfoHolder, context, blw, appView, str, gameBillboardCanvas, dro, blu);
        }
    }

    private final void a(InterfaceC2023aX interfaceC2023aX, int i, InterfaceC5141btE interfaceC5141btE, AbstractC5100bsQ abstractC5100bsQ, TrackingInfoHolder trackingInfoHolder, Context context, bLW blw, AppView appView, String str, GameBillboardCanvas gameBillboardCanvas, drO<dpR> dro, bLU blu) {
        ArrayList arrayList;
        int d2;
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(context, NetflixActivity.class);
        String n = interfaceC5141btE.n();
        List<TagSummary> e2 = interfaceC5141btE.e(GameTagRecipe.a);
        if (e2 != null) {
            d2 = C8572dqo.d(e2, 10);
            arrayList = new ArrayList(d2);
            for (TagSummary tagSummary : e2) {
                arrayList.add(tagSummary.getTitle());
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) ("game-billboard-" + i));
        c1781aO.e(C3895bOq.c.i);
        b(this, c1781aO, null, interfaceC5141btE, n, null, false, trackingInfoHolder, abstractC5100bsQ, appView, netflixActivity, context, blw, str, gameBillboardCanvas, dro, blu, 25, null);
        C3899bOu c3899bOu = new C3899bOu();
        c3899bOu.b(interfaceC5141btE.getId());
        c3899bOu.a(interfaceC5141btE.getTitle());
        c3899bOu.d(interfaceC5141btE.getBoxshotUrl());
        c1781aO.add(c3899bOu);
        C3904bOz c3904bOz = new C3904bOz();
        c3904bOz.a((List<String>) arrayList2);
        c1781aO.add(c3904bOz);
        interfaceC2023aX.add(c1781aO);
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$574);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
