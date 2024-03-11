package o;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.util.TypedValue;
import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedEpoxyController;
import com.netflix.model.leafs.originals.TagSummary;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import o.AbstractC3813bLp;
import o.C7939dav;

/* loaded from: classes5.dex */
public final class cZZ implements InterfaceC6244cZe {
    private static final int c;
    public static final b d = new b(null);
    private InterfaceC6246cZg a;
    private final NetflixActivity b;
    private final InterfaceC5303bwH e;
    private final boolean f;
    private final bLW g;
    private final UpNextFeedEpoxyController h;
    private final bLU i;
    private final Calendar j;
    private final boolean k;
    private int l;
    private final Set<String> m;
    private final C9935zP n;

    /* renamed from: o  reason: collision with root package name */
    private final String[] f13710o;
    private final C6232cYt p;
    private final SimpleDateFormat q;
    private final SimpleDateFormat r;
    private final MiniPlayerVideoGroupViewModel s;
    private final C7915daX t;
    private final Map<String, Set<String>> v;
    private final C7965dbU y;

    public cZZ(NetflixActivity netflixActivity, UpNextFeedEpoxyController upNextFeedEpoxyController, C9935zP c9935zP, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, C6232cYt c6232cYt, bLW blw, bLU blu, boolean z, C7915daX c7915daX, InterfaceC5303bwH interfaceC5303bwH) {
        InterfaceC6246cZg c7928dak;
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) upNextFeedEpoxyController, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) c6232cYt, "");
        C8632dsu.c((Object) blw, "");
        C8632dsu.c((Object) blu, "");
        C8632dsu.c((Object) c7915daX, "");
        C8632dsu.c((Object) interfaceC5303bwH, "");
        this.b = netflixActivity;
        this.h = upNextFeedEpoxyController;
        this.n = c9935zP;
        this.s = miniPlayerVideoGroupViewModel;
        this.p = c6232cYt;
        this.g = blw;
        this.i = blu;
        this.f = z;
        this.t = c7915daX;
        this.e = interfaceC5303bwH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", Locale.getDefault());
        this.q = simpleDateFormat;
        this.r = new SimpleDateFormat("MMMM d", Locale.getDefault());
        this.j = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        this.f13710o = C8146deq.c.b(true);
        this.m = new LinkedHashSet();
        this.y = new C7965dbU(netflixActivity, 0, 2, null);
        this.v = new LinkedHashMap();
        this.l = C7902daK.c.d(netflixActivity);
        if (C1870aRh.a.a().c()) {
            c7928dak = new C7918daa(netflixActivity, c9935zP, c7915daX, simpleDateFormat, interfaceC5303bwH);
        } else {
            c7928dak = new C7928dak(netflixActivity, c9935zP, c7915daX, interfaceC5303bwH);
        }
        this.a = c7928dak;
    }

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
        this.m.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x07a3, code lost:
        if (r2 == null) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x033b  */
    @Override // o.InterfaceC6244cZe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r32, java.lang.String r33, int r34, final int r35, o.C7909daR r36, boolean r37, java.lang.Integer r38, final com.netflix.mediaclient.clutils.TrackingInfoHolder r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 2309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cZZ.a(int, java.lang.String, int, int, o.daR, boolean, java.lang.Integer, com.netflix.mediaclient.clutils.TrackingInfoHolder, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Set set, cZZ czz, bJS bjs, C2077aZ c2077aZ, int i) {
        List<String> n;
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) czz, "");
        n = C8576dqs.n(set);
        for (String str : n) {
            AbstractC7960dbP.b.b(czz.b, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.titleLogo, "upNextTitleTreatmentTap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, C3814bLq c3814bLq, AbstractC3813bLp.c cVar, View view, int i) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.titleEvidence, "upNextTitleTextTap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.synopsisEvidence, "upNextContextualSynopsisTap");
    }

    private final void c(InterfaceC2023aX interfaceC2023aX, String str, List<? extends TagSummary> list) {
        int d2;
        if (this.k && list != null && (!list.isEmpty())) {
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

    private final void e(InterfaceC2023aX interfaceC2023aX, String str, List<String> list) {
        String d2;
        if (!list.isEmpty()) {
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) (str + "-modes"));
            c3814bLq.d(C7939dav.a.n);
            C1333Xq d3 = C1333Xq.d(C7939dav.i.k);
            String string = this.b.getResources().getString(C7939dav.i.g);
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

    static {
        C1332Xp c1332Xp = C1332Xp.b;
        c = (int) TypedValue.applyDimension(1, 7, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
    }
}
