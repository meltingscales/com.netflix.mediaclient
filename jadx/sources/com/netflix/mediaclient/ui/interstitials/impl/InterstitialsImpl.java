package com.netflix.mediaclient.ui.interstitials.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import com.google.gson.Gson;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.Navigate;
import com.netflix.clcs.client.InterstitialClient;
import com.netflix.clcs.models.FieldValueProvider;
import com.netflix.clcs.models.InterstitialLoggingHandler;
import com.netflix.clcs.ui.InterstitialCoordinator;
import com.netflix.mediaclient.acquisition.api.sms.SMSRetriever;
import com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.features.api.FeatureExperience;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RecordRdid;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.EmptyCoroutineContext;
import o.ActivityC6188cXc;
import o.C1045Mp;
import o.C1281Vq;
import o.C1332Xp;
import o.C1588aGw;
import o.C1596aHd;
import o.C4363bdB;
import o.C8051ddA;
import o.C8054ddD;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.C8740dwu;
import o.C8954gU;
import o.FE;
import o.FK;
import o.FL;
import o.FM;
import o.FN;
import o.FX;
import o.InterfaceC0721Ad;
import o.InterfaceC1246Uh;
import o.InterfaceC1571aGf;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.InterfaceC8598drn;
import o.InterfaceC8812dzl;
import o.InterfaceC8822dzv;
import o.InterfaceC8990hD;
import o.InterfaceC8999hM;
import o.XH;
import o.aCE;
import o.aCG;
import o.aFU;
import o.aGE;
import o.aIL;
import o.bEX;
import o.bXD;
import o.cQQ;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;
import o.dyR;
import o.dzB;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class InterstitialsImpl implements bXD, FN, FK, InterstitialLoggingHandler, FL, dwU {
    public static final e b = new e(null);
    public static final int d = 8;
    private Activity a;
    private final Map<String, Long> c;
    private final EmptyCoroutineContext e;
    private TrackingInfo f;
    private Long g;
    private final XH h;
    private final InterstitialCoordinator i;
    private AppView j;
    private boolean k;
    private final LoginApi l;
    private InterfaceC8822dzv<? extends drX<? super Composer, ? super Integer, dpR>> m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private drO<dpR> f13276o;
    private Long p;
    private Long q;
    private FX r;
    private PresentationLocation s;
    private final InterfaceC8812dzl<drX<Composer, Integer, dpR>> t;
    private Long w;
    private AppView x;
    private final RdidConsentStateRepo y;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface InterstitialsModule {
        @Singleton
        @Binds
        bXD b(InterstitialsImpl interstitialsImpl);
    }

    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[PresentationLocation.values().length];
            try {
                iArr[PresentationLocation.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            b = iArr;
            int[] iArr2 = new int[InterstitialLoggingHandler.LoggingSessionType.values().length];
            try {
                iArr2[InterstitialLoggingHandler.LoggingSessionType.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[InterstitialLoggingHandler.LoggingSessionType.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InterstitialLoggingHandler.LoggingSessionType.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InterstitialLoggingHandler.LoggingSessionType.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            d = iArr2;
            int[] iArr3 = new int[FieldValueProvider.values().length];
            try {
                iArr3[FieldValueProvider.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            e = iArr3;
        }
    }

    @EntryPoint
    @InstallIn({aFU.class})
    /* loaded from: classes4.dex */
    public interface d {
        InterstitialClient m();
    }

    public void a(boolean z) {
        this.k = z;
    }

    @Override // o.bXD
    public boolean a() {
        return this.r != null;
    }

    @Override // o.bXD
    public InterfaceC8822dzv<drX<Composer, Integer, dpR>> d() {
        return this.m;
    }

    @Override // o.bXD
    public InterstitialCoordinator e() {
        return this.i;
    }

    @Override // o.bXD
    public boolean h() {
        return this.k;
    }

    @Override // o.dwU
    /* renamed from: j */
    public EmptyCoroutineContext getCoroutineContext() {
        return this.e;
    }

    @Inject
    public InterstitialsImpl(LoginApi loginApi, RdidConsentStateRepo rdidConsentStateRepo, XH xh) {
        C8632dsu.c((Object) loginApi, "");
        C8632dsu.c((Object) rdidConsentStateRepo, "");
        C8632dsu.c((Object) xh, "");
        this.l = loginApi;
        this.y = rdidConsentStateRepo;
        this.h = xh;
        this.i = new InterstitialCoordinator(this, this, new c(), this, this);
        InterfaceC8812dzl<drX<Composer, Integer, dpR>> d2 = dzB.d(null);
        this.t = d2;
        this.m = dyR.b((InterfaceC8812dzl) d2);
        this.e = EmptyCoroutineContext.e;
        this.c = new LinkedHashMap();
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("InterstitialsImpl");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class PresentationLocation {
        private static final /* synthetic */ PresentationLocation[] c;
        private static final /* synthetic */ InterfaceC8598drn d;
        public static final PresentationLocation a = new PresentationLocation("LOLOMO", 0);
        public static final PresentationLocation e = new PresentationLocation("HOOK", 1);

        private static final /* synthetic */ PresentationLocation[] b() {
            return new PresentationLocation[]{a, e};
        }

        public static PresentationLocation valueOf(String str) {
            return (PresentationLocation) Enum.valueOf(PresentationLocation.class, str);
        }

        public static PresentationLocation[] values() {
            return (PresentationLocation[]) c.clone();
        }

        private PresentationLocation(String str, int i) {
        }

        static {
            PresentationLocation[] b = b();
            c = b;
            d = C8600drp.e(b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC1571aGf.d {
        c() {
        }

        @Override // o.InterfaceC1571aGf.d
        public InterfaceC1571aGf b(Context context) {
            C8632dsu.c((Object) context, "");
            return aGE.c(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0 != false) goto L12;
     */
    @Override // o.bXD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r13, o.InterfaceC5283bvo r14, o.drM<? super o.bXD.b, o.dpR> r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.a(android.content.Context, o.bvo, o.drM):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r1 != false) goto L10;
     */
    @Override // o.bXD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.app.Activity r13, o.InterfaceC5283bvo r14, androidx.fragment.app.FragmentManager r15) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r13, r0)
            o.C8632dsu.c(r14, r0)
            o.C8632dsu.c(r15, r0)
            r12.a = r13
            o.FX r0 = r12.r
            if (r0 == 0) goto Le5
            com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl$PresentationLocation r1 = com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.PresentationLocation.a
            r12.s = r1
            java.lang.String r1 = r14.getProfileGuid()
            if (r1 == 0) goto L21
            boolean r1 = o.C8684dus.a(r1)
            if (r1 == 0) goto Lbf
        L21:
            o.aHe$d r1 = o.InterfaceC1597aHe.b
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r7 = o.dqF.d(r1)
            o.aHd r1 = new o.aHd
            java.lang.String r3 = "SPY-35060 - User profile has a null or blank profile GUID"
            r4 = 0
            r5 = 0
            r6 = 1
            r8 = 0
            r9 = 0
            r10 = 96
            r11 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.netflix.mediaclient.api.logging.error.ErrorType r2 = r1.a
            if (r2 == 0) goto L6c
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.e
            java.lang.String r4 = "errorType"
            java.lang.String r5 = r2.c()
            r3.put(r4, r5)
            java.lang.String r3 = r1.b()
            if (r3 == 0) goto L6c
            java.lang.String r2 = r2.c()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = " "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.a(r2)
        L6c:
            java.lang.String r2 = r1.b()
            if (r2 == 0) goto L82
            java.lang.Throwable r2 = r1.i
            if (r2 == 0) goto L82
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r3 = r1.b()
            java.lang.Throwable r4 = r1.i
            r2.<init>(r3, r4)
            goto Lac
        L82:
            java.lang.String r2 = r1.b()
            if (r2 == 0) goto L92
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r3 = r1.b()
            r2.<init>(r3)
            goto Lac
        L92:
            java.lang.Throwable r2 = r1.i
            if (r2 == 0) goto La5
            if (r2 == 0) goto L99
            goto Lac
        L99:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Required value was null."
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        La5:
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r3 = "Handled exception with no message"
            r2.<init>(r3)
        Lac:
            o.aHi$d r3 = o.InterfaceC1601aHi.c
            o.aHe r4 = r3.c()
            if (r4 == 0) goto Lb8
            r4.d(r1, r2)
            goto Lbf
        Lb8:
            o.aHb r3 = r3.e()
            r3.b(r1, r2)
        Lbf:
            o.aGb$e r1 = o.C1567aGb.a
            o.aGb r14 = r1.e(r14)
            o.aFY$b r1 = o.aFY.b
            o.aFY r13 = r1.e(r13)
            o.aFU r13 = r13.e(r14)
            java.lang.Class<com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl$d> r14 = com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.d.class
            java.lang.Object r13 = dagger.hilt.EntryPoints.get(r13, r14)
            com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl$d r13 = (com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.d) r13
            com.netflix.clcs.client.InterstitialClient r13 = r13.m()
            com.netflix.clcs.ui.InterstitialCoordinator r14 = r12.e()
            r14.a(r0, r13, r12, r15)
            r13 = 0
            r12.r = r13
        Le5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.a(android.app.Activity, o.bvo, androidx.fragment.app.FragmentManager):void");
    }

    @Override // o.FN
    public void b(drX<? super Composer, ? super Integer, dpR> drx) {
        C8632dsu.c((Object) drx, "");
        PresentationLocation presentationLocation = this.s;
        if (presentationLocation != null && b.b[presentationLocation.ordinal()] == 1) {
            this.t.d(drx);
        }
    }

    @Override // o.FN
    public void c() {
        PresentationLocation presentationLocation = this.s;
        if (presentationLocation != null && b.b[presentationLocation.ordinal()] == 1) {
            this.t.d(null);
        }
    }

    @Override // o.FK
    @SuppressLint({"CheckResult"})
    public void e(final FE fe) {
        Activity activity;
        InterfaceC1246Uh r;
        String d2;
        C8632dsu.c((Object) fe, "");
        if (fe instanceof FE.h) {
            Activity activity2 = this.a;
            if (activity2 == null) {
                return;
            }
            activity2.startActivity(this.l.e(activity2));
            return;
        }
        if (fe instanceof FE.g) {
            Activity activity3 = this.a;
            final NetflixActivity netflixActivity = activity3 instanceof NetflixActivity ? (NetflixActivity) activity3 : null;
            if (netflixActivity == null) {
                return;
            }
            FE.g gVar = (FE.g) fe;
            if (gVar.c()) {
                if (gVar.a()) {
                    ActivityC6188cXc.d.e(gVar.d().toString());
                }
                netflixActivity.startActivity(ActivityC6188cXc.d.a(netflixActivity, gVar.d().toString(), null, null, gVar.a()));
                return;
            }
            final drM<Uri, Object> drm = new drM<Uri, Object>() { // from class: com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl$handleClientEffect$openUrl$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final Object invoke(Uri uri) {
                    C8632dsu.c((Object) uri, "");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(uri);
                    intent.addFlags(268435456);
                    if (intent.resolveActivity(NetflixActivity.this.getPackageManager()) != null) {
                        NetflixActivity.this.startActivity(intent);
                        return dpR.c;
                    }
                    return C8054ddD.c(NetflixActivity.this, R.o.an, 0);
                }
            };
            if (gVar.a()) {
                Observable<cQQ.d> takeUntil = new cQQ().c(3600000L).takeUntil(netflixActivity.getActivityDestroy());
                C8632dsu.a(takeUntil, "");
                SubscribersKt.subscribeBy$default(takeUntil, (drM) null, (drO) null, new drM<cQQ.d, dpR>() { // from class: com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl$handleClientEffect$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(cQQ.d dVar) {
                        b(dVar);
                        return dpR.c;
                    }

                    public final void b(cQQ.d dVar) {
                        Map d3;
                        Map k;
                        Throwable th;
                        String b2 = dVar.b();
                        if (b2 == null || b2.length() == 0) {
                            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                            d3 = dqE.d();
                            k = dqE.k(d3);
                            C1596aHd c1596aHd = new C1596aHd("valid auto login token was not created", null, null, false, k, false, false, 96, null);
                            ErrorType errorType = c1596aHd.a;
                            if (errorType != null) {
                                c1596aHd.e.put("errorType", errorType.c());
                                String b3 = c1596aHd.b();
                                if (b3 != null) {
                                    String c2 = errorType.c();
                                    c1596aHd.a(c2 + " " + b3);
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
                            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                            InterfaceC1598aHf a2 = dVar2.a();
                            if (a2 != null) {
                                a2.e(c1596aHd, th);
                            } else {
                                dVar2.e().b(c1596aHd, th);
                            }
                            drm.invoke(((FE.g) fe).d());
                            return;
                        }
                        String uri = ((FE.g) fe).d().toString();
                        C8632dsu.a(uri, "");
                        drm.invoke(Uri.parse(C8051ddA.c(uri, b2)));
                    }
                }, 3, (Object) null);
                return;
            }
            drm.invoke(gVar.d());
        } else if (fe instanceof FE.i) {
            C8737dwr.c(this, null, null, new InterstitialsImpl$handleClientEffect$2(this, fe, null), 3, null);
        } else if (!(fe instanceof FE.e) || (activity = this.a) == null || (r = ((aIL) EntryPointAccessors.fromApplication(activity, aIL.class)).r()) == null || (d2 = r.d()) == null) {
        } else {
            String a2 = ((FE.e) fe).a();
            C1588aGw.e(activity).c(bEX.b.e(new Intent("android.intent.action.VIEW", Uri.parse(d2 + "/" + a2))));
        }
    }

    @Override // com.netflix.clcs.models.InterstitialLoggingHandler
    public void c(boolean z) {
        a(z);
    }

    @Override // com.netflix.clcs.models.InterstitialLoggingHandler
    public void b() {
        a(false);
        drO<dpR> dro = this.f13276o;
        if (dro != null) {
            dro.invoke();
        }
        this.f13276o = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
        if (r6 != null) goto L5;
     */
    @Override // com.netflix.clcs.models.InterstitialLoggingHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(boolean r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r3.n = r4
            r0 = 0
            if (r6 == 0) goto Ld
            com.netflix.cl.model.AppView r6 = com.netflix.cl.model.AppView.valueOf(r6)     // Catch: java.lang.IllegalArgumentException -> La
            goto Lb
        La:
            r6 = r0
        Lb:
            if (r6 != 0) goto L14
        Ld:
            if (r4 == 0) goto L12
            com.netflix.cl.model.AppView r6 = com.netflix.cl.model.AppView.clcsInitialInterstitialView
            goto L14
        L12:
            com.netflix.cl.model.AppView r6 = com.netflix.cl.model.AppView.clcsSubsequentInterstitialView
        L14:
            r3.x = r6
            if (r5 == 0) goto L22
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r5)
            com.netflix.cl.model.TrackingInfo r4 = o.C1281Vq.d(r4)
            goto L23
        L22:
            r4 = r0
        L23:
            com.netflix.cl.Logger r5 = com.netflix.cl.Logger.INSTANCE
            com.netflix.cl.model.event.session.NavigationLevel r1 = new com.netflix.cl.model.event.session.NavigationLevel
            r1.<init>(r6, r4)
            java.lang.Long r1 = r5.startSession(r1)
            r3.q = r1
            com.netflix.cl.model.event.session.Presentation r1 = new com.netflix.cl.model.event.session.Presentation
            r1.<init>(r6, r4)
            java.lang.Long r4 = r5.startSession(r1)
            r3.w = r4
            java.lang.Long r4 = r3.p
            if (r4 == 0) goto L4a
            long r1 = r4.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            r5.endSession(r4)
        L4a:
            r3.p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.b(boolean, java.lang.String, java.lang.String):void");
    }

    @Override // com.netflix.clcs.models.InterstitialLoggingHandler
    public void a(boolean z, String str, String str2) {
        Logger.INSTANCE.endSession(this.g);
        this.g = null;
        for (Map.Entry<String, Long> entry : this.c.entrySet()) {
            Logger.INSTANCE.removeContext(Long.valueOf(entry.getValue().longValue()));
        }
        this.c.clear();
        Logger logger = Logger.INSTANCE;
        logger.endSession(this.q);
        logger.endSession(this.w);
        if (!z) {
            logger.endSession(this.p);
            this.p = null;
        }
        this.q = null;
        this.w = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0009, code lost:
        if (r4 != null) goto L6;
     */
    @Override // com.netflix.clcs.models.InterstitialLoggingHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = 0
            if (r4 == 0) goto Lb
            com.netflix.cl.model.AppView r4 = com.netflix.cl.model.AppView.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> L8
            goto L9
        L8:
            r4 = r0
        L9:
            if (r4 != 0) goto L14
        Lb:
            boolean r4 = r2.n
            if (r4 == 0) goto L12
            com.netflix.cl.model.AppView r4 = com.netflix.cl.model.AppView.clcsInitialInterstitialViewButton
            goto L14
        L12:
            com.netflix.cl.model.AppView r4 = com.netflix.cl.model.AppView.clcsSubsequentInterstitialViewButton
        L14:
            r2.j = r4
            if (r3 == 0) goto L21
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r3)
            com.netflix.cl.model.TrackingInfo r0 = o.C1281Vq.d(r0)
        L21:
            r2.f = r0
            com.netflix.cl.Logger r3 = com.netflix.cl.Logger.INSTANCE
            com.netflix.cl.model.event.session.Focus r1 = new com.netflix.cl.model.event.session.Focus
            r1.<init>(r4, r0)
            java.lang.Long r4 = r3.startSession(r1)
            r3.endSession(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.c(java.lang.String, java.lang.String):void");
    }

    @Override // com.netflix.clcs.models.InterstitialLoggingHandler
    public void b(InterstitialLoggingHandler.LoggingSessionType loggingSessionType, String str, String str2, String str3) {
        AppView appView;
        Long l;
        C8632dsu.c((Object) loggingSessionType, "");
        int i = b.d[loggingSessionType.ordinal()];
        if (i == 1) {
            Long l2 = this.g;
            if (l2 != null) {
                Logger.INSTANCE.endSession(Long.valueOf(l2.longValue()));
                this.g = null;
            }
        } else if (i != 2) {
            if (i == 3) {
                if (str2 == null) {
                    return;
                }
                this.c.put(str2, Long.valueOf(Logger.INSTANCE.addContext(new a(str2, str3))));
            } else if (i != 4 || str2 == null || (l = this.c.get(str2)) == null) {
            } else {
                Logger.INSTANCE.removeContext(Long.valueOf(l.longValue()));
                this.c.remove(str2);
            }
        } else if (str != null) {
            try {
                try {
                    appView = AppView.valueOf(str);
                } catch (JSONException e2) {
                    b("InterstitialClientLogError", "InvalidTrackingInfo", (String) null, e2);
                    return;
                }
            } catch (IllegalArgumentException unused) {
                appView = null;
            }
            if (appView == null) {
                return;
            }
            try {
                Logger.INSTANCE.startSession(new Presentation(appView, str3 != null ? C1281Vq.d(new JSONObject(str3)) : null));
            } catch (IllegalArgumentException e3) {
                b("InterstitialClientLogError", "InvalidAppView", (String) null, e3);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends CLContext {
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.b = str2;
            addContextType(str);
        }

        @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
        public JSONObject toJSONObject() {
            JSONObject jSONObject;
            String str = this.b;
            if (str != null) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    JSONObject jSONObject2 = super.toJSONObject();
                    if (jSONObject2 == null) {
                        return jSONObject;
                    }
                    C8632dsu.d(jSONObject2);
                    Iterator keys = jSONObject2.keys();
                    C8632dsu.a(keys, "");
                    while (keys.hasNext()) {
                        String str2 = (String) keys.next();
                        jSONObject.put(str2, jSONObject2.get(str2));
                    }
                    return jSONObject;
                }
            }
            JSONObject jSONObject3 = super.toJSONObject();
            C8632dsu.a(jSONObject3, "");
            return jSONObject3;
        }
    }

    @Override // com.netflix.clcs.models.InterstitialLoggingHandler
    public void d(String str) {
        CommandValue valueOf;
        Logger logger = Logger.INSTANCE;
        AppView appView = this.j;
        AppView appView2 = this.x;
        if (str != null) {
            try {
                valueOf = CommandValue.valueOf(str);
            } catch (IllegalArgumentException unused) {
            }
            this.p = logger.startSession(new Navigate(appView, appView2, valueOf, this.f));
        }
        valueOf = null;
        this.p = logger.startSession(new Navigate(appView, appView2, valueOf, this.f));
    }

    @Override // com.netflix.clcs.models.InterstitialLoggingHandler
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        try {
            Logger.INSTANCE.logEvent(new DebugEvent(new JSONObject(str)));
        } catch (JSONException unused) {
            Logger logger = Logger.INSTANCE;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("debugData", str);
            logger.logEvent(new DebugEvent(jSONObject));
        }
    }

    @Override // com.netflix.clcs.models.InterstitialLoggingHandler
    public void b(String str, String str2, String str3, Exception exc) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        Logger logger = Logger.INSTANCE;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str2);
        if (str3 != null) {
            jSONObject2.put(Payload.PARAM_RENO_CAUSE, str3);
        }
        if (exc != null) {
            jSONObject2.put("nativeError", exc.toString());
        }
        dpR dpr = dpR.c;
        jSONObject.put(NotificationFactory.DATA, jSONObject2);
        logger.logEvent(new DebugEvent(jSONObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FM e(InterfaceC5283bvo interfaceC5283bvo) {
        Object b2;
        boolean z = false;
        boolean z2 = this.h.d().d() == FeatureExperience.e;
        if (!interfaceC5283bvo.isKidsProfile() && z2 && Config_FastProperty_RecordRdid.Companion.c()) {
            z = true;
        }
        b2 = C8740dwu.b(null, new InterstitialsImpl$createInterstitialCommonParameters$1(z, this, null), 1, null);
        return (FM) b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UmaAlert e(String str) {
        try {
            JSONObject b2 = new C4363bdB(new JSONObject(str)).b();
            if (b2 != null) {
                return (UmaAlert) ((Gson) C1332Xp.b(Gson.class)).fromJson(b2.getJSONObject("uma").toString(), (Class<Object>) UmaAlert.class);
            }
        } catch (Exception e2) {
            Throwable cause = e2.getCause();
            b("InterstitialFetchError", "InvalidPayloadError", cause != null ? cause.toString() : null, e2);
        }
        return null;
    }

    @Override // o.FL
    /* renamed from: b */
    public String d(FieldValueProvider fieldValueProvider) {
        C8632dsu.c((Object) fieldValueProvider, "");
        if (b.e[fieldValueProvider.ordinal()] == 1) {
            return SMSRetriever.Companion.getAPP_HASH();
        }
        return null;
    }

    @Module
    @InstallIn({aFU.class})
    /* loaded from: classes4.dex */
    public static final class InterstitialClientModule {

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC0721Ad {
            final /* synthetic */ aCG d;

            a(aCG acg) {
                this.d = acg;
            }

            @Override // o.InterfaceC0721Ad
            public <Q extends InterfaceC8999hM.c> Object d(InterfaceC8999hM<Q> interfaceC8999hM, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra) {
                return aCE.d.d((aCE) this.d, (InterfaceC8999hM) interfaceC8999hM, QueryMode.d, (RequestPriority) null, true, (InterfaceC8585dra) interfaceC8585dra, 4, (Object) null);
            }

            @Override // o.InterfaceC0721Ad
            public <M extends InterfaceC8990hD.b> Object b(InterfaceC8990hD<M> interfaceC8990hD, InterfaceC8585dra<? super C8954gU<M>> interfaceC8585dra) {
                return aCE.d.c(this.d, interfaceC8990hD, null, false, null, true, interfaceC8585dra, 14, null);
            }
        }

        @Provides
        public final InterstitialClient c(aCG acg) {
            C8632dsu.c((Object) acg, "");
            return InterstitialClient.c.e(InterstitialClient.d, new a(acg), null, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r1 != false) goto L8;
     */
    @Override // o.bXD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.String r21, android.app.Activity r22, o.InterfaceC5283bvo r23, androidx.fragment.app.FragmentManager r24, o.drM<? super o.bXD.b, o.dpR> r25, o.drO<o.dpR> r26) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.b(java.lang.String, android.app.Activity, o.bvo, androidx.fragment.app.FragmentManager, o.drM, o.drO):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r3 != false) goto L8;
     */
    @Override // o.bXD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r20, java.util.Map<java.lang.String, ? extends java.lang.Object> r21, android.app.Activity r22, o.InterfaceC5283bvo r23, androidx.fragment.app.FragmentManager r24) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.a(java.lang.String, java.util.Map, android.app.Activity, o.bvo, androidx.fragment.app.FragmentManager):void");
    }
}
