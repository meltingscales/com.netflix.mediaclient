package o;

import android.content.Context;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import o.AbstractC6233cYu;
import o.AbstractC6729cim;
import o.C7939dav;
import o.bKQ;
import o.bLL;

/* loaded from: classes5.dex */
public final class cZH implements InterfaceC6234cYv {
    public static final b d;
    private static final int e;
    private static byte e$ss2$3519 = 0;
    private static int r = 0;
    private static int t = 1;
    private final NetflixActivity a;
    private final InterfaceC5303bwH b;
    private final boolean c;
    private final Calendar f;
    private final bLW g;
    private final boolean h;
    private final bLU i;
    private final C9935zP j;
    private final String[] k;
    private int l;
    private int m;
    private final Set<String> n;

    /* renamed from: o  reason: collision with root package name */
    private final cYA f13709o;
    private final C6652chO p;
    private final MiniPlayerVideoGroupViewModel q;
    private final SimpleDateFormat s;

    /* loaded from: classes5.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TrailerItem.Action.values().length];
            try {
                iArr[TrailerItem.Action.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrailerItem.Action.h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrailerItem.Action.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrailerItem.Action.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TrailerItem.Action.c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TrailerItem.Action.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TrailerItem.Action.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TrailerItem.Action.e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TrailerItem.Action.a.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr;
        }
    }

    static void d() {
        e$ss2$3519 = (byte) 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i, int i2, int i3) {
        return i;
    }

    public cZH(NetflixActivity netflixActivity, C9935zP c9935zP, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, C6652chO c6652chO, bLW blw, bLU blu, boolean z, cYA cya, InterfaceC5303bwH interfaceC5303bwH) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) c6652chO, "");
        C8632dsu.c((Object) blw, "");
        C8632dsu.c((Object) blu, "");
        C8632dsu.c((Object) cya, "");
        C8632dsu.c((Object) interfaceC5303bwH, "");
        this.a = netflixActivity;
        this.j = c9935zP;
        this.q = miniPlayerVideoGroupViewModel;
        this.p = c6652chO;
        this.g = blw;
        this.i = blu;
        this.c = z;
        this.f13709o = cya;
        this.b = interfaceC5303bwH;
        this.s = new SimpleDateFormat("MMMM d", Locale.getDefault());
        this.f = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        boolean z2 = true;
        this.k = C8146deq.c.b(true);
        this.h = (aQT.c.e() || C1870aRh.a.c()) ? false : false;
        this.n = new LinkedHashSet();
        C7902daK c7902daK = C7902daK.c;
        this.l = c7902daK.d(netflixActivity);
        this.m = c7902daK.b(netflixActivity);
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

    @Override // o.InterfaceC6234cYv
    public void a() {
        this.n.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0664, code lost:
        if (r0 == null) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x060f A[LOOP:1: B:128:0x060d->B:129:0x060f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04ff  */
    @Override // o.InterfaceC6234cYv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.InterfaceC2023aX r32, int r33, java.lang.String r34, int r35, int r36, final com.netflix.mediaclient.servicemgr.interface_.TrailerItem r37, boolean r38, java.lang.Integer r39, final com.netflix.mediaclient.clutils.TrackingInfoHolder r40, boolean r41, final o.drO<o.dpR> r42) {
        /*
            Method dump skipped, instructions count: 1803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cZH.e(o.aX, int, java.lang.String, int, int, com.netflix.mediaclient.servicemgr.interface_.TrailerItem, boolean, java.lang.Integer, com.netflix.mediaclient.clutils.TrackingInfoHolder, boolean, o.drO):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drO dro, C6736cit c6736cit, AbstractC6729cim.b bVar, int i) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drO dro, bKW bkw, bKQ.d dVar, int i) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC8612dsa interfaceC8612dsa, TrailerItem trailerItem, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) trailerItem, "");
        interfaceC8612dsa.invoke(trailerItem, AppView.titleLogo, "upNextTitleTreatmentTap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC8612dsa interfaceC8612dsa, TrailerItem trailerItem, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) trailerItem, "");
        interfaceC8612dsa.invoke(trailerItem, AppView.synopsisEvidence, "upNextContextualSynopsisTap");
    }

    private final void d(InterfaceC2023aX interfaceC2023aX, String str, List<String> list) {
        if (this.h && list != null && (!list.isEmpty())) {
            C3806bLi c3806bLi = new C3806bLi();
            c3806bLi.e((CharSequence) (str + "-tags"));
            c3806bLi.b(C7939dav.a.Q);
            c3806bLi.c(list);
            c3806bLi.b((Integer) (-1));
            interfaceC2023aX.add(c3806bLi);
            return;
        }
        bJN bjn = new bJN();
        bjn.e((CharSequence) (str + "-tags"));
        interfaceC2023aX.add(bjn);
    }

    private final void b(InterfaceC2023aX interfaceC2023aX, String str, List<String> list) {
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
    public static final void d(cZH czh, TrailerItem trailerItem, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) czh, "");
        C8632dsu.c((Object) trailerItem, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        czh.j.b(AbstractC6233cYu.class, new AbstractC6233cYu.e(trailerItem, trackingInfoHolder, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(cZH czh, TrailerItem trailerItem, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) czh, "");
        C8632dsu.c((Object) trailerItem, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        czh.j.b(AbstractC6233cYu.class, new AbstractC6233cYu.e(trailerItem, trackingInfoHolder, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(cZH czh, TrailerItem trailerItem, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) czh, "");
        C8632dsu.c((Object) trailerItem, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C9935zP c9935zP = czh.j;
        int u = trailerItem.u();
        String v = trailerItem.v();
        c9935zP.b(AbstractC6233cYu.class, new AbstractC6233cYu.a(String.valueOf(u), trailerItem.y(), v == null ? "" : v, trackingInfoHolder, AppView.moreInfoButton, "upNextMoreInfoButtonTap"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0100, code lost:
        if (r20.isPlayable() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x034c, code lost:
        if (o.C8153dex.h() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0353, code lost:
        if (o.C8153dex.h() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0355, code lost:
        r6 = new o.C3805bLh();
        r6.e((java.lang.CharSequence) (r18 + "-action-" + r19 + "-LOCK"));
        r6.c(o.C7939dav.a.S);
        r6.a(java.lang.Integer.valueOf(com.netflix.mediaclient.ui.R.e.ar));
        r6.b(r16.b.e());
        r6.b(new o.cZT(r16, r20, r21));
        r17.add(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean c(o.InterfaceC2023aX r17, java.lang.String r18, int r19, final com.netflix.mediaclient.servicemgr.interface_.TrailerItem r20, final com.netflix.mediaclient.clutils.TrackingInfoHolder r21, com.netflix.mediaclient.servicemgr.interface_.TrailerItem.Action r22) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cZH.c(o.aX, java.lang.String, int, com.netflix.mediaclient.servicemgr.interface_.TrailerItem, com.netflix.mediaclient.clutils.TrackingInfoHolder, com.netflix.mediaclient.servicemgr.interface_.TrailerItem$Action):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(cZH czh, TrailerItem trailerItem, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) czh, "");
        C8632dsu.c((Object) trailerItem, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        czh.j.b(AbstractC6233cYu.class, new AbstractC6233cYu.c(trailerItem, trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(cZH czh, TrackingInfoHolder trackingInfoHolder, TrailerItem trailerItem, View view) {
        C8632dsu.c((Object) czh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) trailerItem, "");
        czh.j.b(AbstractC6233cYu.class, new AbstractC6233cYu.b(trackingInfoHolder, trailerItem.v(), trailerItem.e(), false, trailerItem.j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cZH czh, TrackingInfoHolder trackingInfoHolder, TrailerItem trailerItem, View view) {
        C8632dsu.c((Object) czh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) trailerItem, "");
        czh.j.b(AbstractC6233cYu.class, new AbstractC6233cYu.b(trackingInfoHolder, trailerItem.v(), trailerItem.e(), false, trailerItem.j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(cZH czh, cZH czh2, TrailerItem trailerItem, TrackingInfoHolder trackingInfoHolder, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) czh, "");
        C8632dsu.c((Object) czh2, "");
        C8632dsu.c((Object) trailerItem, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        d.getLogTag();
        C9935zP c9935zP = czh.j;
        cYA cya = czh2.f13709o;
        int u = trailerItem.u();
        int a = cya.a(String.valueOf(u), new bLL.d(z));
        int u2 = trailerItem.u();
        c9935zP.b(AbstractC6233cYu.class, new AbstractC6233cYu.i(a, String.valueOf(u2), trailerItem.y(), z, trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cZH czh, cZH czh2, TrailerItem trailerItem, TrackingInfoHolder trackingInfoHolder, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) czh, "");
        C8632dsu.c((Object) czh2, "");
        C8632dsu.c((Object) trailerItem, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        d.getLogTag();
        C9935zP c9935zP = czh.j;
        int a = czh2.f13709o.a(String.valueOf(trailerItem.u()), new bLL.b(z));
        int u = trailerItem.u();
        VideoType y = trailerItem.y();
        String v = trailerItem.v();
        c9935zP.b(AbstractC6233cYu.class, new AbstractC6233cYu.g(a, String.valueOf(u), y, z, v == null ? "" : v, trackingInfoHolder));
    }

    static {
        d();
        d = new b(null);
        C1332Xp c1332Xp = C1332Xp.b;
        e = (int) TypedValue.applyDimension(1, 7, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$3519);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
