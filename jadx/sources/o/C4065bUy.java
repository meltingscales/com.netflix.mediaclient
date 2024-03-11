package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.games.api.GameBillboardCanvas;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.model.leafs.RecommendedTrailer;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.AbstractC1608aHp;
import o.AbstractC3073as;
import o.C4022bTi;
import o.C4065bUy;
import o.C8632dsu;
import o.C8737dwr;
import o.C9935zP;
import o.GF;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3825bMa;
import o.InterfaceC5141btE;
import o.InterfaceC8585dra;
import o.bNN;
import o.bSJ;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* renamed from: o.bUy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4065bUy {
    public static final b a = new b(null);
    private final Context b;
    private final drM<bSJ, dpR> c;
    private boolean d;
    private final bLW e;
    private final bNN f;
    private final bNS g;
    private final bNV h;
    private final C9935zP i;
    private final bNL j;
    private final bSY l;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(int i, int i2, int i3) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4065bUy(Context context, bSY bsy, C9935zP c9935zP, bLW blw, bNN bnn, bNS bns, bNV bnv, bNL bnl, drM<? super bSJ, dpR> drm) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) bnn, "");
        C8632dsu.c((Object) bns, "");
        C8632dsu.c((Object) bnv, "");
        C8632dsu.c((Object) bnl, "");
        C8632dsu.c((Object) drm, "");
        this.b = context;
        this.l = bsy;
        this.i = c9935zP;
        this.e = blw;
        this.f = bnn;
        this.g = bns;
        this.h = bnv;
        this.j = bnl;
        this.c = drm;
    }

    /* renamed from: o.bUy$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: o.bUy$b$e */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class e {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[LoMoType.values().length];
                try {
                    iArr[LoMoType.IP_BASED_GAMES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoMoType.EDITORIAL_GAMES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LoMoType.POPULAR_GAMES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LoMoType.RECENTLY_RELEASED_GAMES.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[LoMoType.DEFAULT_GAMES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[LoMoType.MY_GAMES.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[LoMoType.READY_TO_PLAY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean e(LoMo loMo) {
            C8632dsu.c((Object) loMo, "");
            switch (e.a[loMo.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
                default:
                    return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(o.InterfaceC2023aX r24, com.netflix.mediaclient.servicemgr.interface_.LoMo r25, final o.InterfaceC5222bug<? extends o.InterfaceC5223buh> r26, int r27, o.C1729aMb r28, final com.netflix.mediaclient.clutils.TrackingInfoHolder r29, com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel r30, java.util.List<java.lang.Long> r31) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4065bUy.c(o.aX, com.netflix.mediaclient.servicemgr.interface_.LoMo, o.bug, int, o.aMb, com.netflix.mediaclient.clutils.TrackingInfoHolder, com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4065bUy c4065bUy, C1527aEp c1527aEp, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c4065bUy, "");
        C8632dsu.c((Object) c1527aEp, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(c4065bUy, c1527aEp, trackingInfoHolder, context, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4065bUy c4065bUy, TrackingInfoHolder trackingInfoHolder, C1527aEp c1527aEp, boolean z, View view) {
        C8632dsu.c((Object) c4065bUy, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) c1527aEp, "");
        bNS bns = c4065bUy.g;
        String k = c1527aEp.k();
        String title = c1527aEp.getTitle();
        String a2 = AbstractC8266dhD.a();
        String h = c1527aEp.h();
        C8632dsu.d((Object) a2);
        bns.c(trackingInfoHolder, bNK.c.e((Activity) C9737vz.e(c4065bUy.b, Activity.class), k, a2, title, z, h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4065bUy c4065bUy, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c4065bUy, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(c4065bUy, video, trackingInfoHolder, context, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4065bUy c4065bUy, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c4065bUy, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(c4065bUy, video, trackingInfoHolder, context, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4065bUy c4065bUy, TrackingInfoHolder trackingInfoHolder, InterfaceC5140btD interfaceC5140btD, boolean z, View view) {
        C8632dsu.c((Object) c4065bUy, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) interfaceC5140btD, "");
        bNS bns = c4065bUy.g;
        String k = interfaceC5140btD.k();
        String title = interfaceC5140btD.getTitle();
        String a2 = AbstractC8266dhD.a();
        String h = interfaceC5140btD.h();
        C8632dsu.d((Object) a2);
        C8632dsu.d((Object) title);
        bns.c(trackingInfoHolder, bNK.c.e((Activity) C9737vz.e(c4065bUy.b, Activity.class), k, a2, title, z, h));
    }

    public final void b(InterfaceC2023aX interfaceC2023aX, final InterfaceC5139btC interfaceC5139btC, int i, InterfaceC3825bMa.a aVar, final TrackingInfoHolder trackingInfoHolder, InterfaceC6718cib interfaceC6718cib, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, String str, final drO<dpR> dro) {
        long parseLong;
        C4082bVo c4082bVo;
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5139btC, "");
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) interfaceC6718cib, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        RecommendedTrailer l = interfaceC5139btC.l();
        if (l == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str2 = "recommendedTrailer is null for game " + interfaceC5139btC.getId();
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str2, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        if (l.getSupplementalVideoId().length() > 0) {
            parseLong = Long.parseLong(l.getSupplementalVideoId());
        } else {
            String id = interfaceC5139btC.getId();
            C8632dsu.a(id, "");
            parseLong = Long.parseLong(id);
        }
        C4082bVo c4082bVo2 = new C4082bVo();
        c4082bVo2.b(parseLong);
        c4082bVo2.b(C4022bTi.a.k);
        c4082bVo2.e(new AbstractC3073as.b() { // from class: o.bUE
            @Override // o.AbstractC3073as.b
            public final int b(int i2, int i3, int i4) {
                int b3;
                b3 = C4065bUy.b(i2, i3, i4);
                return b3;
            }
        });
        c4082bVo2.e(new InterfaceC4467bf() { // from class: o.bUF
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i2) {
                C4065bUy.a(Ref.BooleanRef.this, dro, (C4082bVo) abstractC3073as, (C2077aZ) obj, i2);
            }
        });
        if (l.getSupplementalVideoId().length() != 0) {
            String c = C1333Xq.d(C4022bTi.g.d).d("gameTitle", interfaceC5139btC.getTitle()).c();
            bNN bnn = this.f;
            Context context = this.b;
            String id2 = interfaceC5139btC.getId();
            C8632dsu.a(id2, "");
            String title = interfaceC5139btC.getTitle();
            C8632dsu.a(title, "");
            C8632dsu.d((Object) c);
            c4082bVo = c4082bVo2;
            bnn.d(c4082bVo2, context, id2, title, i, l, trackingInfoHolder, c, interfaceC6718cib, LolomoEpoxyController.Companion.b(), miniPlayerVideoGroupViewModel, str, this.i, this.e, new drX<View, Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.GameCreator$buildGameTrailerModel$1$4$1
                @Override // o.drX
                public /* synthetic */ dpR invoke(View view, Boolean bool) {
                    b(view, bool.booleanValue());
                    return dpR.c;
                }

                public final void b(View view, boolean z) {
                    C8632dsu.c((Object) view, "");
                    NetflixImageView netflixImageView = (NetflixImageView) view.findViewById(C4022bTi.e.k);
                    if (netflixImageView != null) {
                        ViewGroup.LayoutParams layoutParams = netflixImageView.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = z ? -1 : -2;
                            netflixImageView.setLayoutParams(layoutParams);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
            });
        } else {
            bKW bkw = new bKW();
            bkw.b((CharSequence) ("game-trailer-group-fallback-" + interfaceC5139btC.getId()));
            bkw.c(Float.valueOf(1.778f));
            bkw.b(new C9686vA(LolomoEpoxyController.Companion.a(), false, false, 6, null));
            bkw.b(l.getSupplementalVideoInterestingUrl());
            c4082bVo2.add(bkw);
            c4082bVo = c4082bVo2;
        }
        C4082bVo c4082bVo3 = c4082bVo;
        bNN.b.a(this.f, c4082bVo3, interfaceC5139btC, Integer.valueOf(C4022bTi.a.n), i, null, null, LolomoEpoxyController.Companion.b(), aVar, new View.OnClickListener() { // from class: o.bUD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4065bUy.b(C4065bUy.this, interfaceC5139btC, trackingInfoHolder, view);
            }
        }, trackingInfoHolder, this.l.d(), bSY.b(this.l, (InterfaceC5223buh) null, (LoMoType) null, 3, (Object) null), 24, null);
        interfaceC2023aX.add(c4082bVo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ref.BooleanRef booleanRef, drO dro, C4082bVo c4082bVo, C2077aZ c2077aZ, int i) {
        C8632dsu.c((Object) booleanRef, "");
        C8632dsu.c((Object) dro, "");
        if (booleanRef.a) {
            return;
        }
        dro.invoke();
        booleanRef.a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4065bUy c4065bUy, InterfaceC5139btC interfaceC5139btC, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c4065bUy, "");
        C8632dsu.c((Object) interfaceC5139btC, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        Context context = view.getContext();
        C8632dsu.a(context, "");
        c(c4065bUy, interfaceC5139btC, trackingInfoHolder, context, null, 8, null);
    }

    public final void d(InterfaceC2023aX interfaceC2023aX, LoMo loMo, TrackingInfoHolder trackingInfoHolder, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list, String str, Integer num, AbstractC5100bsQ abstractC5100bsQ) {
        GameBillboardCanvas gameBillboardCanvas;
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) list, "");
        if (list.isEmpty()) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("video entity models of games billboard is empty ", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        Object c2 = C9726vo.c(list.get(0).getVideo(), InterfaceC5141btE.class);
        if (c2 == null) {
            a(list.get(0), trackingInfoHolder, loMo.getListPos());
            return;
        }
        final InterfaceC5141btE interfaceC5141btE = (InterfaceC5141btE) c2;
        final TrackingInfoHolder e = trackingInfoHolder.e(interfaceC5141btE, 0);
        boolean c3 = C8632dsu.c((Object) str, (Object) "games");
        if (c3) {
            gameBillboardCanvas = GameBillboardCanvas.b;
        } else if (!c3) {
            gameBillboardCanvas = GameBillboardCanvas.c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        GameBillboardCanvas gameBillboardCanvas2 = gameBillboardCanvas;
        this.f.d(interfaceC2023aX, loMo.getListPos(), interfaceC5141btE, abstractC5100bsQ, e, this.b, this.e, this.i, LolomoEpoxyController.Companion.b(), loMo.getImpressionToken(), gameBillboardCanvas2, num, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.GameCreator$buildGameBillboard$1$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }

            public final void a() {
                Context context;
                C4065bUy c4065bUy = C4065bUy.this;
                InterfaceC5141btE interfaceC5141btE2 = interfaceC5141btE;
                TrackingInfoHolder trackingInfoHolder2 = e;
                context = c4065bUy.b;
                C4065bUy.c(c4065bUy, interfaceC5141btE2, trackingInfoHolder2, context, null, 8, null);
            }
        }, this.l.d());
    }

    public final void a(InterfaceC2023aX interfaceC2023aX, LoMo loMo, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        this.f.a(interfaceC2023aX, bSI.c(loMo), trackingInfoHolder.a(loMo), AppView.boxArt, new drM<drM<? super String, ? extends dpR>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.items.GameCreator$buildGameFeatureEducationBillboard$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(drM<? super String, ? extends dpR> drm) {
                c(drm);
                return dpR.c;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.home.impl.lolomo.items.GameCreator$buildGameFeatureEducationBillboard$1$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                private /* synthetic */ Object a;
                final /* synthetic */ C4065bUy b;
                int d;
                final /* synthetic */ drM<String, dpR> e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(C4065bUy c4065bUy, drM<? super String, dpR> drm, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.b = c4065bUy;
                    this.e = drm;
                }

                @Override // o.drX
                /* renamed from: c */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.e, interfaceC8585dra);
                    anonymousClass1.a = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.Object r0 = o.C8588drd.c()
                        int r1 = r7.d
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L20
                        if (r1 == r3) goto L1c
                        if (r1 != r2) goto L14
                        java.lang.Object r0 = r7.a
                        o.C8556dpz.d(r8)
                        goto L73
                    L14:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1c:
                        o.C8556dpz.d(r8)     // Catch: java.lang.Throwable -> L3f
                        goto L38
                    L20:
                        o.C8556dpz.d(r8)
                        java.lang.Object r8 = r7.a
                        o.dwU r8 = (o.dwU) r8
                        o.bUy r8 = r7.b
                        kotlin.Result$c r1 = kotlin.Result.e     // Catch: java.lang.Throwable -> L3f
                        o.bNL r8 = o.C4065bUy.b(r8)     // Catch: java.lang.Throwable -> L3f
                        r7.d = r3     // Catch: java.lang.Throwable -> L3f
                        java.lang.Object r8 = r8.e(r7)     // Catch: java.lang.Throwable -> L3f
                        if (r8 != r0) goto L38
                        return r0
                    L38:
                        java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L3f
                        java.lang.Object r8 = kotlin.Result.e(r8)     // Catch: java.lang.Throwable -> L3f
                        goto L4a
                    L3f:
                        r8 = move-exception
                        kotlin.Result$c r1 = kotlin.Result.e
                        java.lang.Object r8 = o.C8556dpz.a(r8)
                        java.lang.Object r8 = kotlin.Result.e(r8)
                    L4a:
                        o.bUy r1 = r7.b
                        o.drM<java.lang.String, o.dpR> r3 = r7.e
                        boolean r4 = kotlin.Result.h(r8)
                        if (r4 == 0) goto L74
                        r4 = r8
                        java.lang.String r4 = (java.lang.String) r4
                        o.GF r5 = o.GF.e
                        android.content.Context r1 = o.C4065bUy.a(r1)
                        o.dxN r1 = r5.d(r1)
                        com.netflix.mediaclient.ui.home.impl.lolomo.items.GameCreator$buildGameFeatureEducationBillboard$1$1$1$2$1 r5 = new com.netflix.mediaclient.ui.home.impl.lolomo.items.GameCreator$buildGameFeatureEducationBillboard$1$1$1$2$1
                        r6 = 0
                        r5.<init>(r3, r4, r6)
                        r7.a = r8
                        r7.d = r2
                        java.lang.Object r1 = o.C8738dws.c(r1, r5, r7)
                        if (r1 != r0) goto L72
                        return r0
                    L72:
                        r0 = r8
                    L73:
                        r8 = r0
                    L74:
                        java.lang.Throwable r8 = kotlin.Result.d(r8)
                        if (r8 == 0) goto L7c
                        com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$a r8 = com.netflix.mediaclient.ui.home.impl.HomeEpoxyController.Companion
                    L7c:
                        o.dpR r8 = o.dpR.c
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.lolomo.items.GameCreator$buildGameFeatureEducationBillboard$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            public final void c(drM<? super String, dpR> drm) {
                C9935zP c9935zP;
                Context context;
                C8632dsu.c((Object) drm, "");
                c9935zP = C4065bUy.this.i;
                dwU a2 = c9935zP.a();
                GF gf = GF.e;
                context = C4065bUy.this.b;
                C8737dwr.c(a2, gf.a(context), null, new AnonymousClass1(C4065bUy.this, drm, null), 2, null);
            }
        }, new InterfaceC4467bf() { // from class: o.bUI
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i) {
                C4065bUy.d(C4065bUy.this, abstractC3073as, (AbstractC3179au) obj, i);
            }
        }, bSY.a(this.l, false, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4065bUy c4065bUy, AbstractC3073as abstractC3073as, AbstractC3179au abstractC3179au, int i) {
        C8632dsu.c((Object) c4065bUy, "");
        if (c4065bUy.d) {
            return;
        }
        c4065bUy.c.invoke(bSJ.c.a);
        c4065bUy.d = true;
    }

    private final void a(InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, int i) {
        Map b2;
        Map k;
        Throwable th;
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        String str = "SPY-34830 - Game expected, got " + interfaceC5222bug.getVideo().getClass().getName();
        b2 = dqD.b(dpD.a("trackingInfo", TrackingInfoHolder.a(trackingInfoHolder, null, null, null, 7, null).toJSONObject().toString()));
        k = dqE.k(b2);
        C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b3 = c1596aHd.b();
            if (b3 != null) {
                c1596aHd.a(errorType.c() + " " + b3);
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
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    public static /* synthetic */ void c(C4065bUy c4065bUy, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, Context context, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        c4065bUy.c(interfaceC5223buh, trackingInfoHolder, context, str);
    }

    private final void c(InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, Context context, String str) {
        C7017coI.c.e().d(AbstractC1608aHp.d.b).d(new AbstractC1608aHp.d.b(interfaceC5223buh, trackingInfoHolder, "lolomo.controller", str)).b(C9737vz.e(context, NetflixActivity.class));
    }
}
