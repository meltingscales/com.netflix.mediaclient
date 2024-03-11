package o;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.profiles.MyNetflixMenuSheetFragment;
import com.netflix.model.leafs.social.NotificationsListSummary;
import dagger.Lazy;
import javax.inject.Inject;
import o.AbstractC3073as;
import o.C1026Lt;
import o.C1030Lx;
import o.C5855cKw;
import o.C5895cMi;
import o.C5948cOh;
import o.C5949cOi;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1126Pr;
import o.InterfaceC1570aGe;
import o.InterfaceC1571aGf;
import o.InterfaceC5223buh;
import o.cMR;
import o.dpR;
import o.drO;

/* renamed from: o.cMi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5895cMi implements InterfaceC5840cKh {
    private final Activity d;
    private final Lazy<cLW> e;
    private final InterfaceC8554dpx f;
    private final Lazy<C5889cMc> g;
    private final Lazy<C5900cMn> h;
    private final Lazy<InterfaceC6068cSu> i;
    private final Lazy<C5907cMu> j;
    private final Lazy<InterfaceC1126Pr> k;
    public static final a c = new a(null);
    public static final int a = 8;
    private static final float b = androidx.compose.ui.unit.Dp.m2492constructorimpl(40);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i, int i2, int i3) {
        return i;
    }

    @Inject
    public C5895cMi(Activity activity, final InterfaceC1570aGe interfaceC1570aGe, Lazy<InterfaceC1126Pr> lazy, Lazy<C5907cMu> lazy2, Lazy<C5900cMn> lazy3, Lazy<C5889cMc> lazy4, Lazy<InterfaceC6068cSu> lazy5, Lazy<cLW> lazy6) {
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC1570aGe, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) lazy2, "");
        C8632dsu.c((Object) lazy3, "");
        C8632dsu.c((Object) lazy4, "");
        C8632dsu.c((Object) lazy5, "");
        C8632dsu.c((Object) lazy6, "");
        this.d = activity;
        this.k = lazy;
        this.j = lazy2;
        this.h = lazy3;
        this.g = lazy4;
        this.i = lazy5;
        this.e = lazy6;
        b2 = dpB.b(new drO<InterfaceC1571aGf>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixLolomoImpl$imageRepository$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final InterfaceC1571aGf invoke() {
                return InterfaceC1570aGe.this.a();
            }
        });
        this.f = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1571aGf e() {
        return (InterfaceC1571aGf) this.f.getValue();
    }

    @Override // o.InterfaceC5840cKh
    public void a(InterfaceC2023aX interfaceC2023aX) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        final InterfaceC5283bvo b2 = C8126deW.b();
        Object[] objArr = new Object[3];
        objArr[0] = (b2 == null || (r3 = b2.getProfileGuid()) == null) ? "" : "";
        objArr[1] = (b2 == null || (r3 = b2.getProfileName()) == null) ? "" : "";
        objArr[2] = (b2 == null || (r3 = b2.getAvatarUrl()) == null) ? "" : "";
        C2322ae c2 = C2437ag.c("my-profile-row", objArr, ComposableLambdaKt.composableLambdaInstance(755084191, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixLolomoImpl$addProfilesRow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return dpR.c;
            }

            public final void a(Composer composer, int i) {
                InterfaceC1571aGf e;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(755084191, i, -1, "com.netflix.mediaclient.ui.profiles.MyNetflixLolomoImpl.addProfilesRow.<anonymous> (MyNetflixLolomoImpl.kt:61)");
                    }
                    e = C5895cMi.this.e();
                    C5949cOi c5949cOi = new C5949cOi(b2);
                    final C5895cMi c5895cMi = C5895cMi.this;
                    cMR.c(e, c5949cOi, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixLolomoImpl$addProfilesRow$1.1
                        {
                            super(0);
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            c();
                            return dpR.c;
                        }

                        public final void c() {
                            Activity activity;
                            activity = C5895cMi.this.d;
                            C8632dsu.d(activity);
                            ((NetflixActivity) activity).showFullScreenDialog(new SwitchProfileSheetFragment());
                        }
                    }, composer, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
        c2.a((CharSequence) "my-profile-row");
        AbstractC3073as<?> a2 = c2.a(new AbstractC3073as.b() { // from class: o.cMp
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int c3;
                c3 = C5895cMi.c(i, i2, i3);
                return c3;
            }
        });
        C8632dsu.a(a2, "");
        interfaceC2023aX.add(a2);
    }

    @Override // o.InterfaceC5840cKh
    public void b(InterfaceC2023aX interfaceC2023aX, String str) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) str, "");
        this.e.get().a(interfaceC2023aX, str);
    }

    @Override // o.InterfaceC5840cKh
    public void c(InterfaceC2023aX interfaceC2023aX, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        this.e.get().e(interfaceC2023aX, interfaceC5222bug);
    }

    @Override // o.InterfaceC5840cKh
    public void e(InterfaceC5198buI interfaceC5198buI, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) interfaceC5198buI, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        this.e.get().c(interfaceC5198buI, trackingInfoHolder);
    }

    @Override // o.InterfaceC5840cKh
    public void d(InterfaceC2023aX interfaceC2023aX, NotificationsListSummary notificationsListSummary, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        this.j.get().e(interfaceC2023aX, notificationsListSummary, trackingInfoHolder);
    }

    @Override // o.InterfaceC5840cKh
    public void d(InterfaceC2023aX interfaceC2023aX, final InterfaceC5223buh interfaceC5223buh) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        final String string = this.d.getResources().getString(C9834xU.h.t);
        C8632dsu.a(string, "");
        final String c2 = C1333Xq.d(C5855cKw.i.d).d(SignupConstants.Field.VIDEO_TITLE, interfaceC5223buh.getTitle()).c();
        String id = interfaceC5223buh.getId();
        C2437ag.b(interfaceC2023aX, "share-button-" + id, new Object[]{interfaceC5223buh.getId()}, ComposableLambdaKt.composableLambdaInstance(-446238133, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixLolomoImpl$addShareContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return dpR.c;
            }

            public final void a(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-446238133, i, -1, "com.netflix.mediaclient.ui.profiles.MyNetflixLolomoImpl.addShareContainer.<anonymous> (MyNetflixLolomoImpl.kt:105)");
                    }
                    String str = string;
                    String str2 = c2;
                    C8632dsu.a(str2, "");
                    final C5895cMi c5895cMi = this;
                    final InterfaceC5223buh interfaceC5223buh2 = interfaceC5223buh;
                    C5948cOh.d(str, str2, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixLolomoImpl$addShareContainer$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            d();
                            return dpR.c;
                        }

                        public final void d() {
                            Lazy lazy;
                            lazy = C5895cMi.this.k;
                            Object obj = lazy.get();
                            C8632dsu.a(obj, "");
                            InterfaceC1126Pr.c.b((InterfaceC1126Pr) obj, interfaceC5223buh2, null, null, 6, null);
                        }
                    }, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }

    @Override // o.InterfaceC5840cKh
    public void a(InterfaceC2023aX interfaceC2023aX, InterfaceC5162btZ interfaceC5162btZ, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5162btZ, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        Lazy<InterfaceC1126Pr> lazy = this.k;
        Activity activity = this.d;
        C8632dsu.d(activity);
        cLG.e(interfaceC2023aX, interfaceC5162btZ, lazy, (NetflixActivity) activity, trackingInfoHolder);
    }

    @Override // o.InterfaceC5840cKh
    public void e(InterfaceC2023aX interfaceC2023aX, InterfaceC5181bts interfaceC5181bts) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5181bts, "");
        C5885cLz.d(interfaceC2023aX, interfaceC5181bts, this.d);
    }

    @Override // o.InterfaceC5840cKh
    public void c(InterfaceC5181bts interfaceC5181bts) {
        C8632dsu.c((Object) interfaceC5181bts, "");
        C5885cLz.d(interfaceC5181bts, this.d);
    }

    @Override // o.InterfaceC5840cKh
    public void b(InterfaceC2023aX interfaceC2023aX, LoMoType loMoType) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMoType, "");
        this.g.get().d(interfaceC2023aX, loMoType);
    }

    @Override // o.InterfaceC5840cKh
    public void d(Menu menu) {
        C8632dsu.c((Object) menu, "");
        if (!BrowseExperience.a()) {
            a(menu);
        }
        this.i.get().a(menu).setVisible(true);
    }

    @Override // o.InterfaceC5840cKh
    public boolean d(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        if (menuItem.getItemId() == C5855cKw.d.t) {
            Activity activity = this.d;
            C8632dsu.d(activity);
            return ((NetflixActivity) activity).showFullScreenDialog(new MyNetflixMenuSheetFragment());
        }
        return false;
    }

    @Override // o.InterfaceC5840cKh
    public Object e(InterfaceC8585dra<? super C5843cKk> interfaceC8585dra) {
        return this.h.get().b(interfaceC8585dra);
    }

    private final void a(Menu menu) {
        Drawable d = C9737vz.d(this.d, C1026Lt.a.AF, C1030Lx.d.c);
        if (d != null) {
            menu.add(0, C5855cKw.d.t, 6, this.d.getResources().getString(com.netflix.mediaclient.ui.R.o.lH)).setIcon(d).setShowAsActionFlags(2);
        }
    }

    /* renamed from: o.cMi$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final float e() {
            return C5895cMi.b;
        }
    }
}
