package o;

import android.content.Context;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedEpoxyController;
import com.netflix.model.leafs.UpNextFeedVideoEvidence;
import com.netflix.model.leafs.originals.TagSummary;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.AbstractC7907daP;
import o.AbstractC7938dau;
import o.C7939dav;
import o.bLL;

/* renamed from: o.cZr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6257cZr implements InterfaceC6244cZe {
    public static final a a;
    private static final int d;
    private static byte e$ss2$3121 = 0;
    private static int v = 0;
    private static int x = 1;
    private final InterfaceC5303bwH b;
    private final NetflixActivity c;
    private final boolean e;
    private final C9935zP f;
    private final UpNextFeedEpoxyController g;
    private final bLU h;
    private final Calendar i;
    private final bLW j;
    private final InterfaceC7020coL k;
    private final boolean l;
    private int m;
    private final String[] n;

    /* renamed from: o  reason: collision with root package name */
    private final Set<String> f13712o;
    private final SimpleDateFormat p;
    private final SimpleDateFormat q;
    private final C6232cYt r;
    private final C7915daX s;
    private final MiniPlayerVideoGroupViewModel t;

    /* renamed from: o.cZr$b */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class b {
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
                iArr[UpNextFeedVideoEvidence.Action.JOIN_NOW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            d = iArr;
        }
    }

    static void b() {
        e$ss2$3121 = (byte) 24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x007e, code lost:
        if (r3.b() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6257cZr(com.netflix.mediaclient.android.activity.NetflixActivity r2, com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedEpoxyController r3, o.C9935zP r4, com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel r5, o.C6232cYt r6, o.bLW r7, o.bLU r8, boolean r9, o.C7915daX r10, o.InterfaceC5303bwH r11, o.InterfaceC7020coL r12) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r2, r0)
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            o.C8632dsu.c(r6, r0)
            o.C8632dsu.c(r7, r0)
            o.C8632dsu.c(r8, r0)
            o.C8632dsu.c(r10, r0)
            o.C8632dsu.c(r11, r0)
            o.C8632dsu.c(r12, r0)
            r1.<init>()
            r1.c = r2
            r1.g = r3
            r1.f = r4
            r1.t = r5
            r1.r = r6
            r1.j = r7
            r1.h = r8
            r1.e = r9
            r1.s = r10
            r1.b = r11
            r1.k = r12
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd'T'HH:mm:ssX"
            java.util.Locale r5 = java.util.Locale.getDefault()
            r3.<init>(r4, r5)
            r1.p = r3
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "MMMM d"
            java.util.Locale r5 = java.util.Locale.getDefault()
            r3.<init>(r4, r5)
            r1.q = r3
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.util.Calendar r3 = java.util.Calendar.getInstance(r3, r4)
            r1.i = r3
            o.deq r3 = o.C8146deq.c
            r4 = 1
            java.lang.String[] r3 = r3.b(r4)
            r1.n = r3
            o.aQT$c r3 = o.aQT.c
            boolean r3 = r3.e()
            if (r3 != 0) goto L81
            o.aRh$b r3 = o.C1870aRh.a
            boolean r5 = r3.c()
            if (r5 != 0) goto L81
            boolean r3 = r3.b()
            if (r3 != 0) goto L81
            goto L82
        L81:
            r4 = 0
        L82:
            r1.l = r4
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r1.f13712o = r3
            o.daK r3 = o.C7902daK.c
            int r2 = r3.d(r2)
            r1.m = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6257cZr.<init>(com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedEpoxyController, o.zP, com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel, o.cYt, o.bLW, o.bLU, boolean, o.daX, o.bwH, o.coL):void");
    }

    /* renamed from: o.cZr$a */
    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ItemBuilderControl");
        }
    }

    @Override // o.InterfaceC6244cZe
    public void a() {
        this.f13712o.clear();
    }

    /* renamed from: o.cZr$c */
    /* loaded from: classes5.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            C7902daK c7902daK = C7902daK.c;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(c7902daK.a().get((UpNextFeedVideoEvidence.Action) t), c7902daK.a().get((UpNextFeedVideoEvidence.Action) t2));
            return compareValues;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x06e7, code lost:
        if (r0 == null) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x068b A[LOOP:1: B:129:0x0689->B:130:0x068b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x053c  */
    @Override // o.InterfaceC6244cZe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r37, java.lang.String r38, int r39, final int r40, final o.C7909daR r41, boolean r42, java.lang.Integer r43, final com.netflix.mediaclient.clutils.TrackingInfoHolder r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 1968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6257cZr.a(int, java.lang.String, int, int, o.daR, boolean, java.lang.Integer, com.netflix.mediaclient.clutils.TrackingInfoHolder, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.titleLogo, "upNextTitleTreatmentTap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.synopsisEvidence, "upNextContextualSynopsisTap");
    }

    private final void c(InterfaceC2023aX interfaceC2023aX, String str, List<? extends TagSummary> list) {
        int d2;
        if (this.l && list != null && (!list.isEmpty())) {
            C3806bLi c3806bLi = new C3806bLi();
            c3806bLi.e((CharSequence) (str + "-tags"));
            c3806bLi.b(C7939dav.a.Q);
            d2 = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (TagSummary tagSummary : list) {
                arrayList.add(tagSummary.getTitle());
            }
            c3806bLi.c((List<String>) arrayList);
            c3806bLi.b((Integer) (-1));
            interfaceC2023aX.add(c3806bLi);
            return;
        }
        bJN bjn = new bJN();
        bjn.e((CharSequence) (str + "-tags"));
        interfaceC2023aX.add(bjn);
    }

    private final void d(InterfaceC2023aX interfaceC2023aX, String str, List<String> list) {
        String d2;
        if (!list.isEmpty()) {
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) (str + "-modes"));
            c3814bLq.d(C7939dav.a.n);
            C1333Xq d3 = C1333Xq.d(C7939dav.i.k);
            String string = this.c.getResources().getString(C7939dav.i.g);
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
    public static final void g(C6257cZr c6257cZr, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c6257cZr, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c6257cZr.f.b(AbstractC7938dau.class, new AbstractC7938dau.h(((AbstractC7907daP.a) c7909daR.j()).i(), trackingInfoHolder, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C6257cZr c6257cZr, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c6257cZr, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c6257cZr.f.b(AbstractC7938dau.class, new AbstractC7938dau.h(((AbstractC7907daP.a) c7909daR.j()).i(), trackingInfoHolder, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C6257cZr c6257cZr, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c6257cZr, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c6257cZr.f.b(AbstractC7938dau.class, new AbstractC7938dau.c(c7909daR.j().c(), c7909daR.j().b(), c7909daR.j().e(), trackingInfoHolder, AppView.moreInfoButton, "upNextMoreInfoButtonTap"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x018a, code lost:
        if (o.C8153dex.h() == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a(o.InterfaceC2023aX r20, java.lang.String r21, final int r22, final o.C7909daR r23, com.netflix.mediaclient.clutils.TrackingInfoHolder r24, com.netflix.model.leafs.UpNextFeedVideoEvidence.Action r25) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6257cZr.a(o.aX, java.lang.String, int, o.daR, com.netflix.mediaclient.clutils.TrackingInfoHolder, com.netflix.model.leafs.UpNextFeedVideoEvidence$Action):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C6257cZr c6257cZr, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c6257cZr, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c6257cZr.f.b(AbstractC7938dau.class, new AbstractC7938dau.j(c7909daR.c(), trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C6257cZr c6257cZr, TrackingInfoHolder trackingInfoHolder, GameDetails gameDetails, int i, View view) {
        C8632dsu.c((Object) c6257cZr, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) gameDetails, "");
        c6257cZr.f.b(AbstractC7938dau.class, new AbstractC7938dau.a(trackingInfoHolder.e(gameDetails, i), gameDetails, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6257cZr c6257cZr, TrackingInfoHolder trackingInfoHolder, GameDetails gameDetails, int i, View view) {
        C8632dsu.c((Object) c6257cZr, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) gameDetails, "");
        c6257cZr.f.b(AbstractC7938dau.class, new AbstractC7938dau.a(trackingInfoHolder.e(gameDetails, i), gameDetails, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C6257cZr c6257cZr, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c6257cZr, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c6257cZr.f.b(AbstractC7938dau.class, new AbstractC7938dau.b(c7909daR.j().c(), trackingInfoHolder, AppView.newsFeed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C6257cZr c6257cZr, C6257cZr c6257cZr2, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) c6257cZr, "");
        C8632dsu.c((Object) c6257cZr2, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        a.getLogTag();
        c6257cZr.f.b(AbstractC7938dau.class, new AbstractC7938dau.g(c6257cZr2.s.a(c7909daR.j().c(), new bLL.d(z)), c7909daR.j().c(), c7909daR.j().b(), z, trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6257cZr c6257cZr, C6257cZr c6257cZr2, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) c6257cZr, "");
        C8632dsu.c((Object) c6257cZr2, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        a.getLogTag();
        c6257cZr.f.b(AbstractC7938dau.class, new AbstractC7938dau.i(c6257cZr2.s.a(c7909daR.j().c(), new bLL.b(z)), c7909daR.j().c(), c7909daR.j().b(), z, c7909daR.j().e(), trackingInfoHolder));
    }

    static {
        b();
        a = new a(null);
        C1332Xp c1332Xp = C1332Xp.b;
        d = (int) TypedValue.applyDimension(1, 7, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$3121);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
