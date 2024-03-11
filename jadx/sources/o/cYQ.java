package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.ui.upnextfeed.impl.GameRowBuilder$renderLoadingRow$1;
import com.netflix.mediaclient.ui.upnextfeed.impl.GameRowBuilder$renderRow$1;
import com.netflix.model.leafs.RecommendedTrailer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import o.AbstractC3073as;
import o.AbstractC7938dau;
import o.C7939dav;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6419ccu;
import o.dpR;
import o.drO;

/* loaded from: classes5.dex */
public final class cYQ {
    public static final e b = new e(null);
    private static final Rect d;
    private final bLU a;
    private final Map<LoMoType, C1729aMb> c;
    private final Context e;
    private final bNN f;
    private final bLW g;
    private final bNV h;
    private final bNS i;
    private final C9935zP j;

    /* renamed from: o  reason: collision with root package name */
    private final MiniPlayerVideoGroupViewModel f13707o;

    /* loaded from: classes5.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] d;

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
                iArr[LoMoType.READY_TO_PLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoMoType.POPULAR_GAMES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoMoType.RECENTLY_RELEASED_GAMES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LoMoType.MY_GAMES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LoMoType.DEFAULT_GAMES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            d = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e() {
        return C7939dav.a.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i, int i2, int i3) {
        return i;
    }

    public cYQ(Context context, C9935zP c9935zP, bLW blw, bLU blu, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, bNN bnn, bNS bns, bNV bnv) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) blu, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) bnn, "");
        C8632dsu.c((Object) bns, "");
        C8632dsu.c((Object) bnv, "");
        this.e = context;
        this.j = c9935zP;
        this.g = blw;
        this.a = blu;
        this.f13707o = miniPlayerVideoGroupViewModel;
        this.f = bnn;
        this.i = bns;
        this.h = bnv;
        this.c = new LinkedHashMap();
    }

    /* loaded from: classes5.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    private final C1729aMb e(LoMoType loMoType) {
        switch (d.d[loMoType.ordinal()]) {
            case 1:
                return InterfaceC6419ccu.d.j(this.e, 33);
            case 2:
                return InterfaceC6419ccu.d.b(this.e, 17);
            case 3:
                Context context = this.e;
                return InterfaceC6419ccu.d.e(context, 20, C8151dev.j(context) ? 2 : 1);
            case 4:
            case 5:
            case 6:
            case 7:
                return InterfaceC6419ccu.d.l(this.e, 16);
            default:
                return InterfaceC6419ccu.d.i(this.e, 1);
        }
    }

    public final void b(InterfaceC2023aX interfaceC2023aX, C7978dbh c7978dbh, TrackingInfoHolder trackingInfoHolder, C9935zP c9935zP) {
        LoMoType loMoType;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c7978dbh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) c9935zP, "");
        C4003bSq c = c7978dbh.e().c();
        LoMo b2 = c != null ? c.b() : null;
        if (c != null && b2 != null && b2.getLength() > 0) {
            d(interfaceC2023aX, b2);
            List<C4002bSp> e2 = c.e();
            if (e2 != null) {
                b(interfaceC2023aX, b2, e2, TrackingInfoHolder.b(trackingInfoHolder, null, null, new ListSummaryCLTrackingInfo(b2, PlayContextImp.u), null, 11, null), c9935zP);
            }
        } else if ((c7978dbh.e() instanceof C8932fz) || (c7978dbh.e() instanceof C8974go)) {
            d(interfaceC2023aX);
            if (b2 == null || (loMoType = b2.getType()) == null) {
                loMoType = LoMoType.POPULAR_GAMES;
            }
            a(interfaceC2023aX, b2 != null ? b2.getListPos() : 0, loMoType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(InterfaceC2023aX interfaceC2023aX, LoMo loMo, int i, int i2, int i3, int i4, C1729aMb c1729aMb, drO<dpR> dro) {
        int i5;
        i5 = C8657dts.i(i4 + i3, i2);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = dro;
        while (i3 < i5) {
            d(interfaceC2023aX, loMo.getType(), i, i3, c1729aMb, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.GameRowBuilder$loadingShimmers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    Ref.ObjectRef<drO<dpR>> objectRef2 = objectRef;
                    drO<dpR> dro2 = objectRef2.d;
                    if (dro2 != null) {
                        dro2.invoke();
                        objectRef2.d = null;
                    }
                }
            });
            i3++;
        }
        int o2 = c1729aMb.o();
        for (int i6 = 0; i6 < o2; i6++) {
            bKU bku = new bKU();
            bku.d((CharSequence) ("loading-peek-row-upnext-games-" + i + "-" + (i5 + i6)));
            C1332Xp c1332Xp = C1332Xp.b;
            bku.d(Integer.valueOf((int) TypedValue.applyDimension(1, (float) 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            interfaceC2023aX.add(bku);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(InterfaceC2023aX interfaceC2023aX, LoMoType loMoType, int i, int i2, C1729aMb c1729aMb, final drO<dpR> dro) {
        String c;
        String c2;
        String c3;
        LoMoType loMoType2;
        String c4;
        if (loMoType != LoMoType.POPULAR_GAMES && loMoType != LoMoType.EDITORIAL_GAMES && loMoType != LoMoType.RECENTLY_RELEASED_GAMES && loMoType != LoMoType.MY_GAMES && loMoType != LoMoType.DEFAULT_GAMES && (loMoType != (loMoType2 = LoMoType.IP_BASED_GAMES) || C1864aRb.b.a().b())) {
            if (loMoType == loMoType2) {
                bNN bnn = this.f;
                c4 = cYY.c(i, i2);
                bnn.c(interfaceC2023aX, c4, this.e, this.h.b(c1729aMb), new InterfaceC4467bf() { // from class: o.cYT
                    @Override // o.InterfaceC4467bf
                    public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                        cYQ.c(drO.this, abstractC3073as, (AbstractC3179au) obj, i3);
                    }
                });
                return;
            }
            return;
        }
        C3780bKj c3780bKj = new C3780bKj();
        c = cYY.c(i, i2);
        c3780bKj.e((CharSequence) c);
        c3780bKj.e(C7939dav.a.d);
        c3780bKj.c(new Pair<>(Integer.valueOf(this.h.b(c1729aMb)), -2));
        C3787bKq c3787bKq = new C3787bKq();
        c2 = cYY.c(i, i2);
        c3787bKq.b((CharSequence) (c2 + "-icon"));
        c3787bKq.d(true);
        c3787bKq.d(Integer.valueOf(this.e.getResources().getDimensionPixelSize(C9834xU.a.r)));
        c3787bKq.c(400L);
        c3787bKq.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq);
        C3787bKq c3787bKq2 = new C3787bKq();
        c3 = cYY.c(i, i2);
        c3787bKq2.b((CharSequence) (c3 + "-actual-shimmer"));
        c3787bKq2.c(C7939dav.a.c);
        c3787bKq2.d(true);
        c3787bKq2.c(400L);
        c3787bKq2.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq2);
        c3780bKj.b(new InterfaceC4467bf() { // from class: o.cYW
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                cYQ.e(drO.this, (C3780bKj) abstractC3073as, (C2077aZ) obj, i3);
            }
        });
        interfaceC2023aX.add(c3780bKj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drO dro, C3780bKj c3780bKj, C2077aZ c2077aZ, int i) {
        if (dro != null) {
            dro.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drO dro, AbstractC3073as abstractC3073as, AbstractC3179au abstractC3179au, int i) {
        if (dro != null) {
            dro.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingInfoHolder a(LoMo loMo, TrackingInfoHolder trackingInfoHolder, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, int i) {
        boolean g;
        boolean g2;
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        String id = interfaceC5222bug.getVideo().getId();
        C8632dsu.a(id, "");
        g = C8691duz.g(id);
        if (g) {
            String a = loMo.getType().a();
            C8632dsu.a(a, "");
            g2 = C8691duz.g(a);
            String a2 = g2 ? "genre" : loMo.getType().a();
            int listPos = loMo.getListPos();
            String id2 = video.getId();
            String value = video.getType().getValue();
            String title = video.getTitle();
            InterfaceC1593aHa.c.a("Lolomo row=" + listPos + ", rank=" + i + ", type=" + a2 + ", video [id=" + id2 + ", type=" + value + ", title=" + title + "]");
        }
        return trackingInfoHolder.e(video, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0340  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(o.InterfaceC2023aX r24, com.netflix.mediaclient.servicemgr.interface_.LoMo r25, final o.InterfaceC5222bug<? extends o.InterfaceC5223buh> r26, int r27, o.C1729aMb r28, final com.netflix.mediaclient.clutils.TrackingInfoHolder r29, java.util.List<java.lang.Long> r30) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cYQ.b(o.aX, com.netflix.mediaclient.servicemgr.interface_.LoMo, o.bug, int, o.aMb, com.netflix.mediaclient.clutils.TrackingInfoHolder, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(cYQ cyq, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) cyq, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C9935zP c9935zP = cyq.j;
        String id = interfaceC5222bug.getVideo().getId();
        C8632dsu.a(id, "");
        VideoType type = interfaceC5222bug.getVideo().getType();
        C8632dsu.a(type, "");
        String title = interfaceC5222bug.getVideo().getTitle();
        C8632dsu.a(title, "");
        c9935zP.b(AbstractC7938dau.class, new AbstractC7938dau.c(id, type, title, trackingInfoHolder, AppView.boxArt, "upNextTitleTextTap"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(cYQ cyq, TrackingInfoHolder trackingInfoHolder, C1527aEp c1527aEp, boolean z, View view) {
        C8632dsu.c((Object) cyq, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) c1527aEp, "");
        bNS bns = cyq.i;
        String k = c1527aEp.k();
        String title = c1527aEp.getTitle();
        String a = AbstractC8266dhD.a();
        String h = c1527aEp.h();
        C8632dsu.d((Object) a);
        bns.c(trackingInfoHolder, bNK.c.e((Activity) C9737vz.e(cyq.e, Activity.class), k, a, title, z, h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cYQ cyq, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) cyq, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C9935zP c9935zP = cyq.j;
        String id = interfaceC5222bug.getVideo().getId();
        C8632dsu.a(id, "");
        VideoType type = interfaceC5222bug.getVideo().getType();
        C8632dsu.a(type, "");
        String title = interfaceC5222bug.getVideo().getTitle();
        C8632dsu.a(title, "");
        c9935zP.b(AbstractC7938dau.class, new AbstractC7938dau.c(id, type, title, trackingInfoHolder, AppView.boxArt, "upNextTitleTextTap"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(cYQ cyq, InterfaceC5222bug interfaceC5222bug, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) cyq, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C9935zP c9935zP = cyq.j;
        String id = interfaceC5222bug.getVideo().getId();
        C8632dsu.a(id, "");
        VideoType type = interfaceC5222bug.getVideo().getType();
        C8632dsu.a(type, "");
        String title = interfaceC5222bug.getVideo().getTitle();
        C8632dsu.a(title, "");
        c9935zP.b(AbstractC7938dau.class, new AbstractC7938dau.c(id, type, title, trackingInfoHolder, AppView.boxArt, "upNextTitleTextTap"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(cYQ cyq, TrackingInfoHolder trackingInfoHolder, InterfaceC5140btD interfaceC5140btD, boolean z, View view) {
        C8632dsu.c((Object) cyq, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) interfaceC5140btD, "");
        bNS bns = cyq.i;
        String k = interfaceC5140btD.k();
        String title = interfaceC5140btD.getTitle();
        String a = AbstractC8266dhD.a();
        String h = interfaceC5140btD.h();
        C8632dsu.d((Object) a);
        C8632dsu.d((Object) title);
        bns.c(trackingInfoHolder, bNK.c.e((Activity) C9737vz.e(cyq.e, Activity.class), k, a, title, z, h));
    }

    private final void a(InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, TrackingInfoHolder trackingInfoHolder) {
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
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    private final void b(InterfaceC2023aX interfaceC2023aX, LoMo loMo, List<C4002bSp> list, TrackingInfoHolder trackingInfoHolder, C9935zP c9935zP) {
        int d2;
        int d3;
        boolean g;
        d2 = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (C4002bSp c4002bSp : list) {
            arrayList.add(c4002bSp.a());
        }
        ArrayList<InterfaceC5222bug> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            InterfaceC5222bug interfaceC5222bug = (InterfaceC5222bug) obj;
            if (interfaceC5222bug.getVideo() instanceof InterfaceC5139btC) {
                InterfaceC5223buh video = interfaceC5222bug.getVideo();
                C8632dsu.d(video);
                if (((InterfaceC5139btC) video).l() != null) {
                    arrayList2.add(obj);
                }
            }
        }
        d3 = C8572dqo.d(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(d3);
        for (InterfaceC5222bug interfaceC5222bug2 : arrayList2) {
            InterfaceC5223buh video2 = interfaceC5222bug2.getVideo();
            C8632dsu.d(video2);
            RecommendedTrailer l = ((InterfaceC5139btC) video2).l();
            C8632dsu.d(l);
            String supplementalVideoId = l.getSupplementalVideoId();
            g = C8691duz.g(supplementalVideoId);
            arrayList3.add(Long.valueOf(g ? 0L : Long.parseLong(supplementalVideoId)));
        }
        Map<LoMoType, C1729aMb> map = this.c;
        LoMoType type = loMo.getType();
        C1729aMb c1729aMb = map.get(type);
        if (c1729aMb == null) {
            c1729aMb = e(loMo.getType());
            map.put(type, c1729aMb);
        }
        bKB.d(interfaceC2023aX, new GameRowBuilder$renderRow$1(this, loMo, c1729aMb, list, this, trackingInfoHolder, arrayList3, c9935zP));
    }

    private final void a(InterfaceC2023aX interfaceC2023aX, int i, LoMoType loMoType) {
        Map<LoMoType, C1729aMb> map = this.c;
        C1729aMb c1729aMb = map.get(loMoType);
        if (c1729aMb == null) {
            c1729aMb = e(loMoType);
            map.put(loMoType, c1729aMb);
        }
        bKB.d(interfaceC2023aX, new GameRowBuilder$renderLoadingRow$1(this, c1729aMb, this, loMoType, i));
    }

    private final void d(InterfaceC2023aX interfaceC2023aX) {
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.b((CharSequence) "row-upnext-games-title");
        c3787bKq.c(C7939dav.a.g);
        c3787bKq.c(400L);
        c3787bKq.d(true);
        c3787bKq.a(BrowseExperience.e());
        c3787bKq.d(d);
        c3787bKq.e(new AbstractC3073as.b() { // from class: o.cYP
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int a;
                a = cYQ.a(i, i2, i3);
                return a;
            }
        });
        interfaceC2023aX.add(c3787bKq);
    }

    private final void d(InterfaceC2023aX interfaceC2023aX, LoMo loMo) {
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) "row-upnext-games-title");
        c3814bLq.d(C7939dav.a.k);
        c3814bLq.d((CharSequence) (loMo != null ? loMo.getTitle() : null));
        c3814bLq.d(new AbstractC3073as.b() { // from class: o.cYN
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int e2;
                e2 = cYQ.e(i, i2, i3);
                return e2;
            }
        });
        interfaceC2023aX.add(c3814bLq);
    }

    static {
        float f = 4;
        C1332Xp c1332Xp = C1332Xp.b;
        d = new Rect(0, (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), 0, (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
    }
}
