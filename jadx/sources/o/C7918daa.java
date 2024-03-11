package o;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.util.Base64;
import android.view.View;
import android.widget.CompoundButton;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.model.leafs.UpNextFeedVideoEvidence;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC7907daP;
import o.AbstractC7938dau;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.bLL;

/* renamed from: o.daa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7918daa implements InterfaceC6246cZg {
    private static byte e$ss2$227 = 24;
    private static int h = 1;
    private static int i;
    private final Set<String> a;
    private final Context b;
    private final C9935zP c;
    private final InterfaceC5303bwH d;
    private final C7915daX e;
    private final SimpleDateFormat g;

    /* renamed from: o.daa$d */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] e;

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
            e = iArr;
        }
    }

    public C7918daa(Context context, C9935zP c9935zP, C7915daX c7915daX, SimpleDateFormat simpleDateFormat, InterfaceC5303bwH interfaceC5303bwH) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) c7915daX, "");
        C8632dsu.c((Object) simpleDateFormat, "");
        C8632dsu.c((Object) interfaceC5303bwH, "");
        this.b = context;
        this.c = c9935zP;
        this.e = c7915daX;
        this.g = simpleDateFormat;
        this.d = interfaceC5303bwH;
        this.a = new LinkedHashSet();
    }

    @Override // o.InterfaceC6246cZg
    public void e(InterfaceC2023aX interfaceC2023aX, String str, List<? extends UpNextFeedVideoEvidence.Action> list, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, boolean z, InterfaceC8612dsa<? super C7909daR, ? super AppView, ? super String, dpR> interfaceC8612dsa) {
        int b;
        Map d2;
        Map k;
        Throwable th;
        List<? extends UpNextFeedVideoEvidence.Action> list2 = list;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        if (list.size() > 2) {
            InterfaceC1593aHa.c.a("UpNextFeed too many actions: " + c7909daR.d().getActions());
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("UpNextFeed - too many actions", null, null, true, k, false, false, 96, null);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            list2 = list2.subList(0, 2);
        }
        if (z) {
            list2 = C8576dqs.n(list2);
            list2.remove(UpNextFeedVideoEvidence.Action.REMIND_ME);
            list2.remove(UpNextFeedVideoEvidence.Action.ADD_TO_MY_LIST);
        }
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list2) {
            if (i3 < 0) {
                C8569dql.h();
            }
            if (d(interfaceC2023aX, str, i3, c7909daR, trackingInfoHolder, (UpNextFeedVideoEvidence.Action) obj, interfaceC8612dsa)) {
                i2++;
            }
            i3++;
        }
        b = C8657dts.b(2 - i2, 0);
        for (int i4 = 0; i4 < b; i4++) {
            bJN bjn = new bJN();
            bjn.e((CharSequence) (str + "-gone-cta-" + i4));
            interfaceC2023aX.add(bjn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C7918daa c7918daa, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c7918daa, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c7918daa.c.b(AbstractC7938dau.class, new AbstractC7938dau.h(((AbstractC7907daP.a) c7909daR.j()).i(), trackingInfoHolder, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C7918daa c7918daa, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c7918daa, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c7918daa.c.b(AbstractC7938dau.class, new AbstractC7938dau.h(((AbstractC7907daP.a) c7909daR.j()).i(), trackingInfoHolder, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.moreInfoButton, "upNextMoreInfoButtonTap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C7918daa c7918daa, C7918daa c7918daa2, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) c7918daa, "");
        C8632dsu.c((Object) c7918daa2, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C6245cZf.b.getLogTag();
        c7918daa.c.b(AbstractC7938dau.class, new AbstractC7938dau.g(c7918daa2.e.a(c7909daR.j().c(), new bLL.d(z)), c7909daR.j().c(), c7909daR.j().b(), z, trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC8612dsa interfaceC8612dsa, C7909daR c7909daR, View view) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) c7909daR, "");
        interfaceC8612dsa.invoke(c7909daR, AppView.remindMeButton, "upNextReminderCountdownButtonTap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C7918daa c7918daa, C7909daR c7909daR, C7918daa c7918daa2, TrackingInfoHolder trackingInfoHolder, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) c7918daa, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) c7918daa2, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C6245cZf.b.getLogTag();
        if (z) {
            Set<String> set = c7918daa.a;
            String id = c7909daR.g().getId();
            C8632dsu.a(id, "");
            set.add(id);
        } else {
            c7918daa.a.remove(c7909daR.g().getId());
        }
        c7918daa.c.b(AbstractC7938dau.class, new AbstractC7938dau.i(c7918daa2.e.a(c7909daR.j().c(), new bLL.b(z)), c7909daR.j().c(), c7909daR.j().b(), z, c7909daR.j().e(), trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C7918daa c7918daa, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c7918daa, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c7918daa.c.b(AbstractC7938dau.class, new AbstractC7938dau.j(c7909daR.c(), trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C7918daa c7918daa, TrackingInfoHolder trackingInfoHolder, GameDetails gameDetails, int i2, View view) {
        C8632dsu.c((Object) c7918daa, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) gameDetails, "");
        c7918daa.c.b(AbstractC7938dau.class, new AbstractC7938dau.a(trackingInfoHolder.e(gameDetails, i2), gameDetails, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0194, code lost:
        if (o.C8153dex.h() == false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean d(o.InterfaceC2023aX r25, java.lang.String r26, final int r27, final o.C7909daR r28, com.netflix.mediaclient.clutils.TrackingInfoHolder r29, com.netflix.model.leafs.UpNextFeedVideoEvidence.Action r30, final o.InterfaceC8612dsa<? super o.C7909daR, ? super com.netflix.cl.model.AppView, ? super java.lang.String, o.dpR> r31) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7918daa.d(o.aX, java.lang.String, int, o.daR, com.netflix.mediaclient.clutils.TrackingInfoHolder, com.netflix.model.leafs.UpNextFeedVideoEvidence$Action, o.dsa):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C7918daa c7918daa, TrackingInfoHolder trackingInfoHolder, GameDetails gameDetails, int i2, View view) {
        C8632dsu.c((Object) c7918daa, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) gameDetails, "");
        c7918daa.c.b(AbstractC7938dau.class, new AbstractC7938dau.a(trackingInfoHolder.e(gameDetails, i2), gameDetails, true));
    }

    private void j(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$227);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
