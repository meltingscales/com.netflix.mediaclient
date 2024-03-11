package o;

import android.content.Context;
import android.util.Base64;
import android.view.View;
import android.widget.CompoundButton;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_EnableLottieRemindMeIcons;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.model.leafs.UpNextFeedVideoEvidence;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.AbstractC7907daP;
import o.AbstractC7938dau;
import o.C1026Lt;
import o.C7939dav;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.bLL;

/* renamed from: o.dak  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7928dak implements InterfaceC6246cZg {
    private static int a = 0;
    private static byte e$ss2$205 = 24;
    private static int i = 1;
    private final C9935zP b;
    private final Context c;
    private final InterfaceC5303bwH d;
    private final C7915daX e;

    /* renamed from: o.dak$a */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class a {
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
            d = iArr;
        }
    }

    public C7928dak(Context context, C9935zP c9935zP, C7915daX c7915daX, InterfaceC5303bwH interfaceC5303bwH) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) c7915daX, "");
        C8632dsu.c((Object) interfaceC5303bwH, "");
        this.c = context;
        this.b = c9935zP;
        this.e = c7915daX;
        this.d = interfaceC5303bwH;
    }

    @Override // o.InterfaceC6246cZg
    public void e(InterfaceC2023aX interfaceC2023aX, String str, List<? extends UpNextFeedVideoEvidence.Action> list, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, boolean z, InterfaceC8612dsa<? super C7909daR, ? super AppView, ? super String, dpR> interfaceC8612dsa) {
        List c;
        int b;
        Map d;
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
            d = dqE.d();
            k = dqE.k(d);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
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
        c = C8576dqs.c((Iterable) list2, (Comparator) new e());
        int i2 = 0;
        int i3 = 0;
        for (Object obj : c) {
            if (i3 < 0) {
                C8569dql.h();
            }
            if (c(interfaceC2023aX, str, i3, c7909daR, trackingInfoHolder, (UpNextFeedVideoEvidence.Action) obj)) {
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
    public static final void g(C7928dak c7928dak, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c7928dak, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c7928dak.b.b(AbstractC7938dau.class, new AbstractC7938dau.h(((AbstractC7907daP.a) c7909daR.j()).i(), trackingInfoHolder, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C7928dak c7928dak, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c7928dak, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c7928dak.b.b(AbstractC7938dau.class, new AbstractC7938dau.h(((AbstractC7907daP.a) c7909daR.j()).i(), trackingInfoHolder, null, 4, null));
    }

    /* renamed from: o.dak$e */
    /* loaded from: classes5.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            C7902daK c7902daK = C7902daK.c;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(c7902daK.a().get((UpNextFeedVideoEvidence.Action) t), c7902daK.a().get((UpNextFeedVideoEvidence.Action) t2));
            return compareValues;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C7928dak c7928dak, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c7928dak, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c7928dak.b.b(AbstractC7938dau.class, new AbstractC7938dau.c(c7909daR.j().c(), c7909daR.j().b(), c7909daR.j().e(), trackingInfoHolder, AppView.moreInfoButton, "upNextMoreInfoButtonTap"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C7928dak c7928dak, C7928dak c7928dak2, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) c7928dak, "");
        C8632dsu.c((Object) c7928dak2, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        cZZ.d.getLogTag();
        c7928dak.b.b(AbstractC7938dau.class, new AbstractC7938dau.g(c7928dak2.e.a(c7909daR.j().c(), new bLL.d(z)), c7909daR.j().c(), c7909daR.j().b(), z, trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C7928dak c7928dak, C7928dak c7928dak2, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) c7928dak, "");
        C8632dsu.c((Object) c7928dak2, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        cZZ.d.getLogTag();
        c7928dak.b.b(AbstractC7938dau.class, new AbstractC7938dau.i(c7928dak2.e.a(c7909daR.j().c(), new bLL.b(z)), c7909daR.j().c(), c7909daR.j().b(), z, c7909daR.j().e(), trackingInfoHolder));
    }

    private final boolean c(InterfaceC2023aX interfaceC2023aX, String str, final int i2, final C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, UpNextFeedVideoEvidence.Action action) {
        int i3;
        final GameDetails i4;
        final TrackingInfoHolder trackingInfoHolder2 = trackingInfoHolder;
        int i5 = 2 % 2;
        int i6 = a + 117;
        i = i6 % 128;
        int i7 = i6 % 2;
        switch (a.d[action.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (!(c7909daR.j() instanceof AbstractC7907daP.a) || !((AbstractC7907daP.a) c7909daR.j()).i().isPlayable()) {
                    if ((c7909daR.j() instanceof AbstractC7907daP.a) && (!((AbstractC7907daP.a) c7909daR.j()).i().isPlayable())) {
                        int i8 = a + 123;
                        i = i8 % 128;
                        if (i8 % 2 == 0) {
                            C8153dex.h();
                            throw null;
                        } else if (C8153dex.h()) {
                            C3805bLh c3805bLh = new C3805bLh();
                            c3805bLh.e((CharSequence) (str + "-action-" + i2 + "-LOCK"));
                            c3805bLh.c(C7939dav.a.S);
                            c3805bLh.a(Integer.valueOf(com.netflix.mediaclient.ui.R.e.ar));
                            c3805bLh.b(this.d.e());
                            c3805bLh.b(new View.OnClickListener() { // from class: o.dal
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7928dak.f(C7928dak.this, c7909daR, trackingInfoHolder2, view);
                                }
                            });
                            interfaceC2023aX.add(c3805bLh);
                            break;
                        }
                    }
                    return false;
                }
                C3805bLh c3805bLh2 = new C3805bLh();
                String name = action.name();
                c3805bLh2.e((CharSequence) (str + "-action-" + i2 + "-" + name));
                c3805bLh2.c(C7939dav.a.S);
                c3805bLh2.a(Integer.valueOf(com.netflix.mediaclient.ui.R.e.W));
                c3805bLh2.b(C7902daK.a(C7902daK.c, this.c, action, false, 4, null));
                c3805bLh2.b(new View.OnClickListener() { // from class: o.dao
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7928dak.g(C7928dak.this, c7909daR, trackingInfoHolder2, view);
                    }
                });
                interfaceC2023aX.add(c3805bLh2);
                break;
                break;
            case 4:
                if (c7909daR.j() instanceof AbstractC7907daP.d) {
                    int i9 = i + 37;
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    trackingInfoHolder2 = trackingInfoHolder2.e(((AbstractC7907daP.d) c7909daR.j()).i(), i2);
                }
                C3805bLh c3805bLh3 = new C3805bLh();
                String name2 = action.name();
                c3805bLh3.e((CharSequence) (str + "-action-" + i2 + "-" + name2));
                c3805bLh3.c(C7939dav.a.S);
                c3805bLh3.a(Integer.valueOf(com.netflix.mediaclient.ui.R.e.y));
                c3805bLh3.b(C7902daK.a(C7902daK.c, this.c, UpNextFeedVideoEvidence.Action.MORE_INFO, false, 4, null));
                c3805bLh3.b(new View.OnClickListener() { // from class: o.dam
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7928dak.d(C7928dak.this, c7909daR, trackingInfoHolder2, view);
                    }
                });
                interfaceC2023aX.add(c3805bLh3);
                break;
            case 5:
                C3822bLy c3822bLy = new C3822bLy();
                String name3 = action.name();
                c3822bLy.e((CharSequence) (str + "-action-" + i2 + "-" + name3));
                c3822bLy.c(C7939dav.a.Z);
                if (Config_FastProperty_EnableLottieRemindMeIcons.Companion.b()) {
                    c3822bLy.e(C9834xU.j.D);
                } else {
                    c3822bLy.e(com.netflix.mediaclient.ui.R.e.O);
                }
                c3822bLy.d(C7902daK.a(C7902daK.c, this.c, UpNextFeedVideoEvidence.Action.ADD_TO_MY_LIST, false, 4, null));
                String string = this.c.getString(com.netflix.mediaclient.ui.R.o.g);
                if (string.startsWith("'!#+")) {
                    Object[] objArr = new Object[1];
                    h(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                }
                c3822bLy.d(string);
                c3822bLy.b(c7909daR.a());
                c3822bLy.a(new CompoundButton.OnCheckedChangeListener() { // from class: o.daq
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C7928dak.a(C7928dak.this, this, c7909daR, trackingInfoHolder2, compoundButton, z);
                    }
                });
                interfaceC2023aX.add(c3822bLy);
                break;
            case 6:
                C7994dbx c7994dbx = new C7994dbx();
                String name4 = action.name();
                c7994dbx.b((CharSequence) (str + "-action-" + i2 + "-" + name4));
                c7994dbx.b(C7939dav.a.Z);
                if (Config_FastProperty_EnableLottieRemindMeIcons.Companion.b()) {
                    int i11 = a + 69;
                    i = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = C9834xU.j.E;
                        r9.hashCode();
                        throw null;
                    }
                    i3 = C9834xU.j.E;
                } else {
                    i3 = com.netflix.mediaclient.ui.R.e.aa;
                }
                c7994dbx.c(i3);
                C7902daK c7902daK = C7902daK.c;
                c7994dbx.e(c7902daK.c(this.c, UpNextFeedVideoEvidence.Action.REMIND_ME, c7909daR.b()));
                c7994dbx.e(C7902daK.b(c7902daK, this.c, C7939dav.a.Z, null, null, 12, null));
                c7994dbx.b(c7909daR.b());
                c7994dbx.e(new CompoundButton.OnCheckedChangeListener() { // from class: o.dar
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C7928dak.d(C7928dak.this, this, c7909daR, trackingInfoHolder2, compoundButton, z);
                    }
                });
                interfaceC2023aX.add(c7994dbx);
                break;
            case 7:
                if (((c7909daR.j() instanceof AbstractC7907daP.a) && c7909daR.j().h()) || (((c7909daR.j() instanceof AbstractC7907daP.a) && C8153dex.h()) || (c7909daR.j() instanceof AbstractC7907daP.d))) {
                    if (c7909daR.j() instanceof AbstractC7907daP.d) {
                        trackingInfoHolder2 = trackingInfoHolder2.e(((AbstractC7907daP.d) c7909daR.j()).i(), i2);
                    }
                    C3805bLh c3805bLh4 = new C3805bLh();
                    String name5 = action.name();
                    c3805bLh4.e((CharSequence) (str + "-action-" + i2 + "-" + name5));
                    c3805bLh4.c(C7939dav.a.S);
                    c3805bLh4.a(Integer.valueOf(C1026Lt.a.HH));
                    c3805bLh4.b(C7902daK.a(C7902daK.c, this.c, UpNextFeedVideoEvidence.Action.SHARE, false, 4, null));
                    c3805bLh4.b(new View.OnClickListener() { // from class: o.das
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C7928dak.j(C7928dak.this, c7909daR, trackingInfoHolder2, view);
                        }
                    });
                    interfaceC2023aX.add(c3805bLh4);
                    break;
                } else {
                    return false;
                }
                break;
            case 8:
                AbstractC7907daP j = c7909daR.j();
                r9 = j instanceof AbstractC7907daP.d ? (AbstractC7907daP.d) j : null;
                if (r9 != null) {
                    int i13 = a + 109;
                    i = i13 % 128;
                    int i14 = i13 % 2;
                    final GameDetails i15 = r9.i();
                    if (i15 != null) {
                        C3805bLh c3805bLh5 = new C3805bLh();
                        String name6 = action.name();
                        c3805bLh5.e((CharSequence) (str + "-action-" + i2 + "-" + name6));
                        c3805bLh5.c(C7939dav.a.S);
                        c3805bLh5.a(Integer.valueOf(C1026Lt.a.os));
                        c3805bLh5.b(C7902daK.a(C7902daK.c, this.c, UpNextFeedVideoEvidence.Action.INSTALL_GAME, false, 4, null));
                        c3805bLh5.b(new View.OnClickListener() { // from class: o.dat
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C7928dak.a(C7928dak.this, trackingInfoHolder2, i15, i2, view);
                            }
                        });
                        interfaceC2023aX.add(c3805bLh5);
                        break;
                    }
                }
                return false;
            case 9:
                AbstractC7907daP j2 = c7909daR.j();
                r9 = j2 instanceof AbstractC7907daP.d ? (AbstractC7907daP.d) j2 : null;
                if (r9 != null && (i4 = r9.i()) != null) {
                    C3805bLh c3805bLh6 = new C3805bLh();
                    String name7 = action.name();
                    c3805bLh6.e((CharSequence) (str + "-action-" + i2 + "-" + name7));
                    c3805bLh6.c(C7939dav.a.S);
                    c3805bLh6.a(Integer.valueOf(C1026Lt.a.rX));
                    c3805bLh6.b(C7902daK.a(C7902daK.c, this.c, UpNextFeedVideoEvidence.Action.LAUNCH_GAME, false, 4, null));
                    c3805bLh6.b(new View.OnClickListener() { // from class: o.dap
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C7928dak.c(C7928dak.this, trackingInfoHolder2, i4, i2, view);
                        }
                    });
                    interfaceC2023aX.add(c3805bLh6);
                    break;
                } else {
                    return false;
                }
                break;
            default:
                return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C7928dak c7928dak, C7909daR c7909daR, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c7928dak, "");
        C8632dsu.c((Object) c7909daR, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c7928dak.b.b(AbstractC7938dau.class, new AbstractC7938dau.j(c7909daR.c(), trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C7928dak c7928dak, TrackingInfoHolder trackingInfoHolder, GameDetails gameDetails, int i2, View view) {
        C8632dsu.c((Object) c7928dak, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) gameDetails, "");
        c7928dak.b.b(AbstractC7938dau.class, new AbstractC7938dau.a(trackingInfoHolder.e(gameDetails, i2), gameDetails, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C7928dak c7928dak, TrackingInfoHolder trackingInfoHolder, GameDetails gameDetails, int i2, View view) {
        C8632dsu.c((Object) c7928dak, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) gameDetails, "");
        c7928dak.b.b(AbstractC7938dau.class, new AbstractC7938dau.a(trackingInfoHolder.e(gameDetails, i2), gameDetails, true));
    }

    private void h(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$205);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
