package com.netflix.mediaclient.ui.mdx2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.netflix.android.mdxpanel.MdxPanelController;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.mdx.CastSheetDialogFrag;
import com.netflix.mediaclient.ui.mdx2.NetflixMdxController;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.AbstractApplicationC1040Mh;
import o.AbstractC9766wb;
import o.AbstractC9791we;
import o.C1045Mp;
import o.C1226Tn;
import o.C1332Xp;
import o.C1596aHd;
import o.C1645aIz;
import o.C4332bcX;
import o.C6498ceT;
import o.C6540cfI;
import o.C6545cfN;
import o.C6575cfr;
import o.C6621cgk;
import o.C7477cwu;
import o.C8005dcH;
import o.C8309dhu;
import o.C8627dsp;
import o.C8632dsu;
import o.C9726vo;
import o.C9737vz;
import o.C9870yD;
import o.C9935zP;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3612bEh;
import o.InterfaceC4942bpR;
import o.InterfaceC5131bsv;
import o.InterfaceC5198buI;
import o.InterfaceC6580cfw;
import o.InterfaceC6616cgf;
import o.InterfaceC8554dpx;
import o.InterfaceC8612dsa;
import o.bDB;
import o.bDY;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;

@SuppressLint({"CheckResult"})
/* loaded from: classes.dex */
public final class NetflixMdxController extends MdxPanelController {
    public static final e a = new e(null);
    public static final int e = 8;
    private final C9935zP f;
    private C6545cfN g;
    private PublishSubject<Language> h;
    private final bDB i;
    private final d j;
    private C7477cwu k;
    private final MdxEventProducer l;
    private final InterfaceC8554dpx m;
    private C6621cgk n;

    /* renamed from: o  reason: collision with root package name */
    private C6540cfI f13286o;
    private ObservableEmitter<MdxPanelController.d> p;
    private bDY q;
    private MdxPanelController.c r;
    private String s;

    public final void b(String str) {
        this.s = str;
    }

    public final C9935zP n() {
        return this.f;
    }

    public final String p() {
        return this.s;
    }

    public final C6621cgk t() {
        return this.n;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NetflixMdxController(final com.netflix.mediaclient.android.activity.NetflixActivity r18, androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mdx2.NetflixMdxController.<init>(com.netflix.mediaclient.android.activity.NetflixActivity, androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View):void");
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public final boolean a() {
            return false;
        }

        private e() {
            super("NetflixMdxController");
        }
    }

    public final InterfaceC6580cfw q() {
        return (InterfaceC6580cfw) this.m.getValue();
    }

    public final InterfaceC5198buI s() {
        return this.n.e();
    }

    /* loaded from: classes.dex */
    public static final class d implements C1226Tn.c {
        final /* synthetic */ NetflixActivity b;

        @Override // o.C1226Tn.c
        public void e() {
        }

        d(NetflixActivity netflixActivity) {
            this.b = netflixActivity;
        }

        @Override // o.C1226Tn.c
        public void a(Language language) {
            C8632dsu.c((Object) language, "");
            NetflixMdxController.this.c(this.b, language);
        }
    }

    /* renamed from: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends Lambda implements drM<AbstractC9791we, dpR> {
        final /* synthetic */ NetflixActivity d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(NetflixActivity netflixActivity) {
            super(1);
            this.d = netflixActivity;
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(AbstractC9791we abstractC9791we) {
            a(abstractC9791we);
            return dpR.c;
        }

        public final void a(AbstractC9791we abstractC9791we) {
            Map d;
            Map k;
            Throwable th;
            final String p = NetflixMdxController.this.p();
            if (p != null) {
                final NetflixMdxController netflixMdxController = NetflixMdxController.this;
                NetflixActivity netflixActivity = this.d;
                if (abstractC9791we instanceof AbstractC9791we.i) {
                    Context context = netflixMdxController.l().getContext();
                    C8632dsu.a(context, "");
                    NetflixMdxController.c(netflixMdxController, context, p, "com.netflix.mediaclient.intent.action.MDX_ACTION_RESUME", null, null, null, null, null, null, null, null, null, 4088, null);
                    netflixMdxController.d(AbstractC9766wb.C9786u.a);
                } else if (abstractC9791we instanceof AbstractC9791we.j) {
                    Context context2 = netflixMdxController.l().getContext();
                    C8632dsu.a(context2, "");
                    NetflixMdxController.c(netflixMdxController, context2, p, "com.netflix.mediaclient.intent.action.MDX_ACTION_PAUSE", null, null, null, null, null, null, null, null, null, 4088, null);
                    netflixMdxController.d(AbstractC9766wb.C9786u.a);
                } else if (abstractC9791we instanceof AbstractC9791we.s) {
                    Context context3 = netflixMdxController.l().getContext();
                    C8632dsu.a(context3, "");
                    NetflixMdxController.c(netflixMdxController, context3, p, "com.netflix.mediaclient.intent.action.MDX_ACTION_STOP", null, null, null, null, MdxNotificationIntentRetriever.InvocSource.PlayerCard.a(), null, null, null, null, 3960, null);
                    netflixMdxController.d(AbstractC9766wb.C9786u.a);
                } else if (abstractC9791we instanceof AbstractC9791we.f) {
                    Context context4 = netflixMdxController.l().getContext();
                    C8632dsu.a(context4, "");
                    NetflixMdxController.c(netflixMdxController, context4, p, "com.netflix.mediaclient.intent.action.MDX_ACTION_STOP", null, null, null, null, MdxNotificationIntentRetriever.InvocSource.PostPlay.a(), null, null, null, null, 3960, null);
                    netflixMdxController.d(new AbstractC9766wb.z(p));
                    netflixMdxController.d(AbstractC9766wb.C9786u.a);
                } else if (abstractC9791we instanceof AbstractC9791we.m) {
                    Context context5 = netflixMdxController.l().getContext();
                    C8632dsu.a(context5, "");
                    NetflixMdxController.c(netflixMdxController, context5, p, "com.netflix.mediaclient.intent.action.MDX_ACTION_SEEK", Integer.valueOf(((AbstractC9791we.m) abstractC9791we).e()), null, null, null, null, null, null, null, null, 4080, null);
                    netflixMdxController.d(AbstractC9766wb.C9786u.a);
                } else if (abstractC9791we instanceof AbstractC9791we.k) {
                    Context context6 = netflixMdxController.l().getContext();
                    C8632dsu.a(context6, "");
                    AbstractC9791we.k kVar = (AbstractC9791we.k) abstractC9791we;
                    NetflixMdxController.c(netflixMdxController, context6, p, "com.netflix.mediaclient.intent.action.MDX_ACTION_SKIP", Integer.valueOf(kVar.e() * kVar.a()), null, null, null, null, null, null, null, null, 4080, null);
                    netflixMdxController.d(AbstractC9766wb.C9786u.a);
                } else if (abstractC9791we instanceof AbstractC9791we.b) {
                    C8632dsu.d(abstractC9791we);
                    netflixMdxController.d(netflixActivity, (AbstractC9791we.b) abstractC9791we);
                } else if (abstractC9791we instanceof AbstractC9791we.p) {
                    Object d2 = ((AbstractC9791we.p) abstractC9791we).d();
                    if (d2 instanceof Language) {
                        netflixMdxController.e(netflixActivity, (Language) d2, netflixMdxController.j);
                        return;
                    }
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str = "It is expected to be a Language, got " + d2.getClass();
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType.c() + " " + b);
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
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                } else if (abstractC9791we instanceof AbstractC9791we.a) {
                    bDY e = bDY.e();
                    e.setCancelable(true);
                    e.a(new bDY.c() { // from class: o.cgt
                        @Override // o.bDY.c
                        public final void d(int i) {
                            NetflixMdxController.AnonymousClass6.d(NetflixMdxController.this, p, i);
                        }
                    });
                    netflixActivity.showDialog(e);
                    netflixMdxController.q = e;
                } else if (abstractC9791we instanceof AbstractC9791we.o) {
                    MdxNotificationIntentRetriever.InvocSource invocSource = netflixMdxController.e() ? MdxNotificationIntentRetriever.InvocSource.PlayerCard : MdxNotificationIntentRetriever.InvocSource.MiniPlayer;
                    MdxNotificationIntentRetriever.SegmentType d3 = MdxNotificationIntentRetriever.SegmentType.d(((AbstractC9791we.o) abstractC9791we).d());
                    Context context7 = netflixMdxController.l().getContext();
                    String a2 = invocSource.a();
                    String b2 = d3.b();
                    C8632dsu.d(context7);
                    NetflixMdxController.c(netflixMdxController, context7, p, "com.netflix.mediaclient.intent.action.MDX_ACTION_SKIP_INTRO", null, null, null, b2, a2, null, null, null, null, 3896, null);
                    netflixMdxController.d(AbstractC9766wb.C9786u.a);
                } else if (abstractC9791we instanceof AbstractC9791we.g) {
                    AbstractC9791we.g gVar = (AbstractC9791we.g) abstractC9791we;
                    C6575cfr.e(netflixActivity, gVar.c(), VideoType.EPISODE, gVar.e(), PlayContextImp.d, -1L, true);
                } else if (abstractC9791we instanceof AbstractC9791we.c) {
                    C6498ceT.c();
                    netflixActivity.showFullScreenDialog(new CastSheetDialogFrag());
                } else {
                    NetflixMdxController.a.getLogTag();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(NetflixMdxController netflixMdxController, String str, int i) {
            C8632dsu.c((Object) netflixMdxController, "");
            C8632dsu.c((Object) str, "");
            Context context = netflixMdxController.l().getContext();
            C8632dsu.a(context, "");
            NetflixMdxController.c(netflixMdxController, context, str, "com.netflix.mediaclient.intent.action.MDX_ACTION_SETVOLUME", null, Integer.valueOf(i), null, null, null, null, null, null, null, 4072, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    private final void a(final NetflixActivity netflixActivity) {
        if (netflixActivity.shouldShowKidsTheme() && netflixActivity.hasBottomNavBar()) {
            Observable<AbstractC9766wb> takeUntil = h().takeUntil(o());
            final NetflixMdxController$enableKidsStatusNavBarFlipping$1 netflixMdxController$enableKidsStatusNavBarFlipping$1 = new drM<AbstractC9766wb, Boolean>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$enableKidsStatusNavBarFlipping$1
                @Override // o.drM
                /* renamed from: e */
                public final Boolean invoke(AbstractC9766wb abstractC9766wb) {
                    C8632dsu.c((Object) abstractC9766wb, "");
                    return Boolean.valueOf(abstractC9766wb instanceof AbstractC9766wb.M);
                }
            };
            Observable<AbstractC9766wb> filter = takeUntil.filter(new Predicate() { // from class: o.cgi
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean b2;
                    b2 = NetflixMdxController.b(drM.this, obj);
                    return b2;
                }
            });
            final NetflixMdxController$enableKidsStatusNavBarFlipping$2 netflixMdxController$enableKidsStatusNavBarFlipping$2 = new drM<AbstractC9766wb, Boolean>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$enableKidsStatusNavBarFlipping$2
                @Override // o.drM
                /* renamed from: c */
                public final Boolean invoke(AbstractC9766wb abstractC9766wb) {
                    C8632dsu.c((Object) abstractC9766wb, "");
                    return Boolean.valueOf(((AbstractC9766wb.M) abstractC9766wb).c() >= 0.95f);
                }
            };
            Observable distinctUntilChanged = filter.map(new Function() { // from class: o.cgj
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Boolean g;
                    g = NetflixMdxController.g(drM.this, obj);
                    return g;
                }
            }).distinctUntilChanged();
            C8632dsu.a(distinctUntilChanged, "");
            SubscribersKt.subscribeBy$default(distinctUntilChanged, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$enableKidsStatusNavBarFlipping$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    NetflixMdxController.this.d(th);
                }
            }, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$enableKidsStatusNavBarFlipping$4
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    c(bool);
                    return dpR.c;
                }

                public final void c(Boolean bool) {
                    C8632dsu.d(bool);
                    if (bool.booleanValue()) {
                        NetflixActionBar netflixActionBar = NetflixActivity.this.getNetflixActionBar();
                        if (netflixActionBar != null) {
                            netflixActionBar.e(true);
                        }
                        C9870yD.b(NetflixActivity.this.getWindow().getDecorView());
                        return;
                    }
                    NetflixActionBar netflixActionBar2 = NetflixActivity.this.getNetflixActionBar();
                    if (netflixActionBar2 != null) {
                        netflixActionBar2.a();
                    }
                    C9870yD.e(NetflixActivity.this.getWindow().getDecorView());
                }
            }, 2, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Boolean) drm.invoke(obj);
    }

    /* loaded from: classes.dex */
    public static final class c implements MdxPanelController.c {
        final /* synthetic */ NetflixActivity c;

        c(NetflixActivity netflixActivity) {
            this.c = netflixActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(NetflixMdxController netflixMdxController, ObservableEmitter observableEmitter) {
            C8632dsu.c((Object) netflixMdxController, "");
            C8632dsu.c((Object) observableEmitter, "");
            netflixMdxController.p = observableEmitter;
        }

        @Override // com.netflix.android.mdxpanel.MdxPanelController.c
        public Observable<MdxPanelController.d> e() {
            final NetflixMdxController netflixMdxController = NetflixMdxController.this;
            Observable<MdxPanelController.d> create = Observable.create(new ObservableOnSubscribe() { // from class: o.cgw
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    NetflixMdxController.c.d(NetflixMdxController.this, observableEmitter);
                }
            });
            C8632dsu.a(create, "");
            return create;
        }

        public CharSequence b() {
            String e = C8005dcH.e(this.c.getServiceManager());
            C8632dsu.a(e, "");
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(NetflixActivity netflixActivity) {
        if (this.r == null) {
            c cVar = new c(netflixActivity);
            b((NetflixMdxController) cVar);
            c(cVar.b());
            this.r = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        InterfaceC5131bsv i = AbstractApplicationC1040Mh.getInstance().i().i();
        if (i == null || !i.p()) {
            this.s = null;
            MdxPanelController.c cVar = this.r;
            if (cVar != null) {
                e((NetflixMdxController) cVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(CharSequence charSequence) {
        d(new AbstractC9766wb.C9778l(charSequence));
        a(false);
    }

    /* loaded from: classes.dex */
    public static final class b implements MdxPanelController.a {
        final /* synthetic */ C4332bcX b;
        final /* synthetic */ NetflixMdxController d;
        final /* synthetic */ BitmapFactory.Options e;

        b(C4332bcX c4332bcX, BitmapFactory.Options options, NetflixMdxController netflixMdxController) {
            this.b = c4332bcX;
            this.e = options;
            this.d = netflixMdxController;
        }

        @Override // com.netflix.android.mdxpanel.MdxPanelController.a
        public Drawable b(int i) {
            ByteBuffer b = this.b.b(i);
            if (b != null) {
                try {
                    this.e.inBitmap = BitmapFactory.decodeByteArray(b.array(), b.position(), b.limit(), this.e);
                    if (this.e.inBitmap != null) {
                        return new BitmapDrawable(this.d.b(), this.e.inBitmap);
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Context context, Language language) {
        String str = this.s;
        if (str != null) {
            C8309dhu.c(context, language);
            Context context2 = l().getContext();
            C8632dsu.a(context2, "");
            c(this, context2, str, "com.netflix.mediaclient.intent.action.MDX_ACTION_GETAUDIOSUB", null, null, null, null, null, null, null, null, null, 4088, null);
            Context context3 = l().getContext();
            C8632dsu.a(context3, "");
            c(this, context3, str, "com.netflix.mediaclient.intent.action.MDX_ACTION_SETAUDIOSUB", null, null, language, null, null, null, null, null, null, 4056, null);
        }
    }

    static /* synthetic */ void c(NetflixMdxController netflixMdxController, Context context, String str, String str2, Integer num, Integer num2, Language language, String str3, String str4, String str5, String str6, Integer num3, Boolean bool, int i, Object obj) {
        netflixMdxController.b(context, str, str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : language, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & JSONzip.end) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : bool);
    }

    private final void b(Context context, String str, String str2, Integer num, Integer num2, Language language, String str3, String str4, String str5, final String str6, Integer num3, Boolean bool) {
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.b(context, NetflixActivity.class);
        if (netflixActivity != null) {
            final Intent putExtra = new Intent(str2).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", str);
            C8632dsu.a(putExtra, "");
            if (num != null) {
                num.intValue();
                putExtra.putExtra("time", num.intValue());
            }
            if (num2 != null) {
                num2.intValue();
                putExtra.putExtra("volume", num2.intValue());
            }
            if (language != null) {
                putExtra.putExtra("audioTrackId", language.getSelectedAudio().getId());
                putExtra.putExtra("subtitleTrackId", language.getSelectedSubtitle().getId());
            }
            if (str4 != null) {
                putExtra.putExtra("invocSource", str4);
            }
            if (str3 != null) {
                putExtra.putExtra("segmentType", str3);
            }
            C9726vo.d(str5, num3, bool, new InterfaceC8612dsa<String, Integer, Boolean, Intent>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$sendMdxAction$1$6
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // o.InterfaceC8612dsa
                public /* synthetic */ Intent invoke(String str7, Integer num4, Boolean bool2) {
                    return a(str7, num4.intValue(), bool2.booleanValue());
                }

                /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
                    if (r1.putExtra("segmentType", r0) == null) goto L8;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final android.content.Intent a(java.lang.String r4, int r5, boolean r6) {
                    /*
                        r3 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r4, r0)
                        java.lang.String r0 = r1
                        if (r0 == 0) goto L18
                        android.content.Intent r1 = r3
                        java.lang.String r2 = "episodeId"
                        r1.putExtra(r2, r4)
                        java.lang.String r2 = "segmentType"
                        android.content.Intent r0 = r1.putExtra(r2, r0)
                        if (r0 != 0) goto L1f
                    L18:
                        android.content.Intent r0 = r3
                        java.lang.String r1 = "catalogId"
                        r0.putExtra(r1, r4)
                    L1f:
                        android.content.Intent r4 = r3
                        java.lang.String r0 = "trackId"
                        r4.putExtra(r0, r5)
                        android.content.Intent r4 = r3
                        java.lang.String r5 = "previewPinProtected"
                        android.content.Intent r4 = r4.putExtra(r5, r6)
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$sendMdxAction$1$6.a(java.lang.String, int, boolean):android.content.Intent");
                }
            });
            a.getLogTag();
            netflixActivity.getServiceManager().a(putExtra);
        }
    }

    @Override // com.netflix.android.mdxpanel.MdxPanelController
    public void d(AbstractC9766wb abstractC9766wb) {
        C8632dsu.c((Object) abstractC9766wb, "");
        if (!(abstractC9766wb instanceof AbstractC9766wb.M)) {
            C1332Xp c1332Xp = C1332Xp.b;
            String a2 = abstractC9766wb.a();
            ((InterfaceC6616cgf) C1332Xp.b(InterfaceC6616cgf.class)).b("-- " + a2);
        }
        super.d(abstractC9766wb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Throwable th) {
        Map d2;
        Map k;
        Throwable th2;
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                String c2 = errorType.c();
                c1596aHd.a(c2 + " " + b2);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th2 = new Throwable(c1596aHd.b());
        } else {
            th2 = c1596aHd.i;
            if (th2 == null) {
                th2 = new Throwable("Handled exception with no message");
            } else if (th2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th2);
        } else {
            dVar.e().b(c1596aHd, th2);
        }
    }

    public final void r() {
        String str = this.s;
        if (str != null) {
            Context context = l().getContext();
            C8632dsu.a(context, "");
            c(this, context, str, "com.netflix.mediaclient.intent.action.MDX_ACTION_STOP", null, null, null, null, MdxNotificationIntentRetriever.InvocSource.Disconnect.a(), null, null, null, null, 3960, null);
        }
    }

    @Override // com.netflix.android.mdxpanel.MdxPanelController
    public boolean g() {
        bDY bdy = this.q;
        if (bdy != null && bdy.isVisible()) {
            bdy.dismiss();
            return true;
        }
        return super.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final NetflixActivity netflixActivity, final AbstractC9791we.b bVar) {
        C1645aIz.a(netflixActivity, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$showEpisodeSelector$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                a(serviceManager);
                return dpR.c;
            }

            public final void a(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                NetflixActivity.this.showDialog(InterfaceC3612bEh.b.a(NetflixActivity.this, bVar.d(), bVar.c(), 0L, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(final NetflixActivity netflixActivity, final Language language, final C1226Tn.c cVar) {
        C1645aIz.a(netflixActivity, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$showLanguageSelector$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                c(serviceManager);
                return dpR.c;
            }

            public final void c(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                netflixActivity.showDialog(C1226Tn.e.e(Language.this, true, cVar));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String str) {
        if (str != null) {
            a.getLogTag();
            C1332Xp c1332Xp = C1332Xp.b;
            C4332bcX c4332bcX = new C4332bcX((InterfaceC4942bpR) C1332Xp.b(InterfaceC4942bpR.class), str);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            a(new b(c4332bcX, options, this));
            return;
        }
        a.getLogTag();
    }
}
