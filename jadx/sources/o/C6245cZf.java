package o;

import android.icu.text.SimpleDateFormat;
import android.util.Base64;
import android.view.View;
import android.widget.CompoundButton;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.model.leafs.UpNextFeedVideoEvidence;
import com.netflix.model.leafs.originals.TagSummary;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o.AbstractC7907daP;
import o.AbstractC7938dau;
import o.C7939dav;
import o.aQT;
import o.bLL;

/* renamed from: o.cZf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6245cZf implements InterfaceC6244cZe {
    public static final b b;
    private static byte e$ss2$3720 = 0;
    private static int q = 0;
    private static int x = 1;
    private final NetflixActivity a;
    private final boolean c;
    private final boolean d;
    private final InterfaceC5303bwH e;
    private final C9935zP f;
    private final boolean g;
    private final boolean h;
    private final bLW i;
    private final bLU j;
    private final MiniPlayerVideoGroupViewModel k;
    private final Set<String> l;
    private final C7915daX m;
    private final InterfaceC2023aX n;

    /* renamed from: o  reason: collision with root package name */
    private final C6232cYt f13711o;
    private final C7965dbU p;
    private final Set<String> r;
    private final Map<String, List<String>> s;
    private final SimpleDateFormat t;

    /* renamed from: o.cZf$d */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[UpNextFeedVideoEvidence.Action.values().length];
            try {
                iArr[UpNextFeedVideoEvidence.Action.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.PLAY_MOVIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.PLAY_EPISODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.MORE_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.ADD_TO_MY_LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.REMIND_ME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.SHARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.INSTALL_GAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.LAUNCH_GAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.GONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            d = iArr;
        }
    }

    static {
        d();
        b = new b(null);
    }

    static void d() {
        e$ss2$3720 = (byte) 24;
    }

    public C6245cZf(NetflixActivity netflixActivity, InterfaceC2023aX interfaceC2023aX, C9935zP c9935zP, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, C6232cYt c6232cYt, bLW blw, bLU blu, boolean z, C7915daX c7915daX, InterfaceC5303bwH interfaceC5303bwH) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) c6232cYt, "");
        C8632dsu.c((Object) blw, "");
        C8632dsu.c((Object) blu, "");
        C8632dsu.c((Object) c7915daX, "");
        C8632dsu.c((Object) interfaceC5303bwH, "");
        this.a = netflixActivity;
        this.n = interfaceC2023aX;
        this.f = c9935zP;
        this.k = miniPlayerVideoGroupViewModel;
        this.f13711o = c6232cYt;
        this.i = blw;
        this.j = blu;
        this.d = z;
        this.m = c7915daX;
        this.e = interfaceC5303bwH;
        this.t = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", Locale.getDefault());
        aQT.c cVar = aQT.c;
        this.g = cVar.c().e() || Config_Ab55851_MobileNav.a.a();
        this.h = cVar.c().i();
        this.c = cVar.c().c();
        this.l = new LinkedHashSet();
        this.p = new C7965dbU(netflixActivity, 0, 2, null);
        this.r = new LinkedHashSet();
        this.s = new LinkedHashMap();
    }

    /* renamed from: o.cZf$b */
    /* loaded from: classes5.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ItemBuilderControl");
        }
    }

    @Override // o.InterfaceC6244cZe
    public void a() {
        this.l.clear();
        this.s.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x04ed, code lost:
        if (r0 == null) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0753 A[LOOP:1: B:158:0x0751->B:159:0x0753, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0535  */
    @Override // o.InterfaceC6244cZe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r35, java.lang.String r36, int r37, final int r38, final o.C7909daR r39, boolean r40, java.lang.Integer r41, final com.netflix.mediaclient.clutils.TrackingInfoHolder r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 1917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6245cZf.a(int, java.lang.String, int, int, o.daR, boolean, java.lang.Integer, com.netflix.mediaclient.clutils.TrackingInfoHolder, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.titleEvidence, "upNextTitleTextTap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.titleEvidence, "upNextDescriptionTextTap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.synopsisEvidence, "upNextContextualSynopsisTap");
    }

    private final void a(InterfaceC2023aX interfaceC2023aX, String str, final C7909daR c7909daR, List<? extends TagSummary> list, final InterfaceC8612dsa<? super C7909daR, ? super AppView, ? super String, dpR> interfaceC8612dsa) {
        int d2;
        if (list != null && (!list.isEmpty())) {
            C7950dbF c7950dbF = new C7950dbF();
            c7950dbF.b((CharSequence) (str + "-tags"));
            c7950dbF.b(C7939dav.a.R);
            d2 = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (TagSummary tagSummary : list) {
                arrayList.add(tagSummary.getTitle());
            }
            c7950dbF.b((List<String>) arrayList);
            c7950dbF.d(new View.OnClickListener() { // from class: o.cZk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6245cZf.j(InterfaceC8612dsa.this, c7909daR, view);
                }
            });
            interfaceC2023aX.add(c7950dbF);
            return;
        }
        bJN bjn = new bJN();
        bjn.e((CharSequence) (str + "-tags"));
        interfaceC2023aX.add(bjn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.tagsEvidence, "upNextTagsTap");
    }

    private final void c(InterfaceC2023aX interfaceC2023aX, String str, List<String> list) {
        String d2;
        if (!list.isEmpty()) {
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) (str + "-modes"));
            c3814bLq.d(C7939dav.a.n);
            C1333Xq d3 = C1333Xq.d(C7939dav.i.k);
            String string = this.a.getResources().getString(C7939dav.i.g);
            C8632dsu.a(string, "");
            d2 = C8576dqs.d(list, string, null, null, 0, null, null, 62, null);
            c3814bLq.d((CharSequence) d3.d("modes", d2).c());
            interfaceC2023aX.add(c3814bLq);
            return;
        }
        bJN bjn = new bJN();
        bjn.e((CharSequence) (str + "-modes"));
        interfaceC2023aX.add(bjn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C6245cZf c6245cZf, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c6245cZf, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c6245cZf.f.b(AbstractC7938dau.class, new AbstractC7938dau.h(((AbstractC7907daP.a) c7909daR.j()).i(), trackingInfoHolder, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6245cZf c6245cZf, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c6245cZf, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c6245cZf.f.b(AbstractC7938dau.class, new AbstractC7938dau.h(((AbstractC7907daP.a) c7909daR.j()).i(), trackingInfoHolder, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.moreInfoButton, "upNextMoreInfoButtonTap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.remindMeButton, "upNextReminderCountdownButtonTap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C6245cZf c6245cZf, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c6245cZf, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c6245cZf.f.b(AbstractC7938dau.class, new AbstractC7938dau.j(c7909daR.c(), trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C6245cZf c6245cZf, TrackingInfoHolder trackingInfoHolder, GameDetails gameDetails, int i, View view) {
        C8632dsu.c((Object) c6245cZf, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) gameDetails, "");
        c6245cZf.f.b(AbstractC7938dau.class, new AbstractC7938dau.a(trackingInfoHolder.e(gameDetails, i), gameDetails, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C6245cZf c6245cZf, TrackingInfoHolder trackingInfoHolder, GameDetails gameDetails, int i, View view) {
        C8632dsu.c((Object) c6245cZf, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) gameDetails, "");
        c6245cZf.f.b(AbstractC7938dau.class, new AbstractC7938dau.a(trackingInfoHolder.e(gameDetails, i), gameDetails, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bf, code lost:
        if (r27.j().h() == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean d(o.InterfaceC2023aX r24, java.lang.String r25, final int r26, final o.C7909daR r27, com.netflix.mediaclient.clutils.TrackingInfoHolder r28, com.netflix.model.leafs.UpNextFeedVideoEvidence.Action r29, boolean r30, final o.InterfaceC8612dsa<? super o.C7909daR, ? super com.netflix.cl.model.AppView, ? super java.lang.String, o.dpR> r31) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6245cZf.d(o.aX, java.lang.String, int, o.daR, com.netflix.mediaclient.clutils.TrackingInfoHolder, com.netflix.model.leafs.UpNextFeedVideoEvidence$Action, boolean, o.dsa):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(List list, C6245cZf c6245cZf, bJS bjs, C2077aZ c2077aZ, int i) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c6245cZf, "");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7960dbP.b.b(c6245cZf.a, (String) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6245cZf c6245cZf, C6245cZf c6245cZf2, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) c6245cZf, "");
        C8632dsu.c((Object) c6245cZf2, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        b.getLogTag();
        c6245cZf.f.b(AbstractC7938dau.class, new AbstractC7938dau.g(c6245cZf2.m.a(c7909daR.j().c(), new bLL.d(z)), c7909daR.j().c(), c7909daR.j().b(), z, trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6245cZf c6245cZf, C7909daR c7909daR, C6245cZf c6245cZf2, TrackingInfoHolder trackingInfoHolder, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) c6245cZf, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) c6245cZf2, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        b.getLogTag();
        if (z) {
            Set<String> set = c6245cZf.r;
            String id = c7909daR.g().getId();
            C8632dsu.a(id, "");
            set.add(id);
        } else {
            c6245cZf.r.remove(c7909daR.g().getId());
        }
        c6245cZf.f.b(AbstractC7938dau.class, new AbstractC7938dau.i(c6245cZf2.m.a(c7909daR.j().c(), new bLL.b(z)), c7909daR.j().c(), c7909daR.j().b(), z, c7909daR.j().e(), trackingInfoHolder));
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$3720);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
