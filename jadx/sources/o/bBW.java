package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.commanderinfra.api.util.BrowseKey;
import com.netflix.mediaclient.commanderinfra.api.util.CommanderState;
import com.netflix.mediaclient.commanderinfra.api.util.DpadKey;
import com.netflix.mediaclient.commanderinfra.api.util.NavigationKey;
import com.netflix.mediaclient.commanderinfra.api.util.PlaybackControlKey;
import com.netflix.mediaclient.commanderinfra.api.util.PlaybackKey;
import com.netflix.mediaclient.commanderinfra.api.util.TitleActionKey;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.MenuAction;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.NavigationMenuAction;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.PadKey;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.PlaybackControlMenuAction;
import kotlin.NoWhenBranchMatchedException;
import o.C1294Wd;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class bBW {
    public static final bBW a = new bBW();

    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[PlaybackControlMenuAction.values().length];
            try {
                iArr[PlaybackControlMenuAction.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaybackControlMenuAction.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlaybackControlMenuAction.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlaybackControlMenuAction.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr;
            int[] iArr2 = new int[PadKey.values().length];
            try {
                iArr2[PadKey.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PadKey.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PadKey.j.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PadKey.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PadKey.d.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            e = iArr2;
            int[] iArr3 = new int[NavigationMenuAction.values().length];
            try {
                iArr3[NavigationMenuAction.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NavigationMenuAction.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NavigationMenuAction.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr3;
            int[] iArr4 = new int[MenuAction.values().length];
            try {
                iArr4[MenuAction.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[MenuAction.q.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[MenuAction.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[MenuAction.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[MenuAction.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[MenuAction.i.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[MenuAction.j.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[MenuAction.g.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[MenuAction.f13263o.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[MenuAction.m.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[MenuAction.l.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[MenuAction.n.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[MenuAction.k.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            d = iArr4;
        }
    }

    private bBW() {
    }

    public final void a(bBR bbr, InterfaceC8499dnw interfaceC8499dnw) {
        C8632dsu.c((Object) bbr, "");
        C8632dsu.c((Object) interfaceC8499dnw, "");
        bbr.b().c(false);
        b(bbr.j());
        bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.util.ClickEventHandler$handleDisconnectTv$1
            @Override // o.drM
            /* renamed from: d */
            public final C1294Wd invoke(C1294Wd c1294Wd) {
                C1294Wd c;
                C8632dsu.c((Object) c1294Wd, "");
                c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                return c;
            }
        });
        bbr.f().c();
        bbr.j().a(CommanderState.d);
        interfaceC8499dnw.c(DeviceSheetScreen.e);
    }

    public final void a(ControllerScreen.e eVar, InterfaceC1289Vy interfaceC1289Vy, InterfaceC1288Vx interfaceC1288Vx, VC vc) {
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) interfaceC1289Vy, "");
        C8632dsu.c((Object) interfaceC1288Vx, "");
        C8632dsu.c((Object) vc, "");
        if (eVar instanceof ControllerScreen.e.m) {
            e((ControllerScreen.e.m) eVar, interfaceC1289Vy, interfaceC1288Vx);
        } else if (eVar instanceof ControllerScreen.e.r) {
            a((ControllerScreen.e.r) eVar, interfaceC1289Vy);
        } else if (C8632dsu.c(eVar, ControllerScreen.e.g.a)) {
            vc.a();
        } else if (eVar instanceof ControllerScreen.e.p) {
            d((ControllerScreen.e.p) eVar, interfaceC1289Vy);
        } else if (eVar instanceof ControllerScreen.e.s) {
            e((ControllerScreen.e.s) eVar, interfaceC1289Vy);
        }
    }

    private final void e(ControllerScreen.e.s sVar, InterfaceC1289Vy interfaceC1289Vy) {
        Enum<?> r2;
        int i = d.b[sVar.b().ordinal()];
        if (i == 1) {
            r2 = PlaybackKey.f;
        } else if (i == 2) {
            r2 = PlaybackControlKey.a;
        } else if (i == 3) {
            r2 = PlaybackKey.c;
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            r2 = PlaybackControlKey.b;
        }
        interfaceC1289Vy.a(r2);
    }

    private final void d(ControllerScreen.e.p pVar, InterfaceC1289Vy interfaceC1289Vy) {
        int i = d.e[pVar.d().ordinal()];
        if (i == 1) {
            interfaceC1289Vy.a(DpadKey.d);
        } else if (i == 2) {
            interfaceC1289Vy.a(DpadKey.c);
        } else if (i == 3) {
            interfaceC1289Vy.a(DpadKey.a);
        } else if (i == 4) {
            interfaceC1289Vy.a(DpadKey.b);
        } else if (i == 5) {
            interfaceC1289Vy.a(DpadKey.e);
        } else {
            throw new IllegalStateException("None shouldn't receive tap");
        }
    }

    private final void a(ControllerScreen.e.r rVar, InterfaceC1289Vy interfaceC1289Vy) {
        int i = d.a[rVar.b().ordinal()];
        if (i == 1) {
            interfaceC1289Vy.a(NavigationKey.d);
        } else if (i == 2) {
            interfaceC1289Vy.a(NavigationKey.a);
        } else if (i != 3) {
        } else {
            interfaceC1289Vy.a(NavigationKey.b);
        }
    }

    private final void e(ControllerScreen.e.m mVar, InterfaceC1289Vy interfaceC1289Vy, InterfaceC1288Vx interfaceC1288Vx) {
        switch (d.d[mVar.c().ordinal()]) {
            case 1:
                interfaceC1289Vy.a(BrowseKey.a);
                return;
            case 2:
                interfaceC1289Vy.a(BrowseKey.e);
                return;
            case 3:
                interfaceC1289Vy.a(BrowseKey.c);
                return;
            case 4:
                interfaceC1289Vy.a(BrowseKey.d);
                return;
            case 5:
                interfaceC1289Vy.a(TitleActionKey.c);
                return;
            case 6:
                interfaceC1289Vy.a(PlaybackKey.a);
                return;
            case 7:
            case 8:
                interfaceC1289Vy.a(PlaybackKey.b);
                return;
            case 9:
            case 10:
                interfaceC1288Vx.a(false);
                return;
            case 11:
            case 12:
                interfaceC1288Vx.a(true);
                return;
            case 13:
                interfaceC1289Vy.a(PlaybackKey.g);
                return;
            default:
                return;
        }
    }

    public final void b(VD vd) {
        C8632dsu.c((Object) vd, "");
        vd.d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.util.ClickEventHandler$resetOverlayStates$1
            @Override // o.drM
            /* renamed from: d */
            public final C1294Wd invoke(C1294Wd c1294Wd) {
                C1294Wd c2;
                C8632dsu.c((Object) c1294Wd, "");
                c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                return c2;
            }
        });
        e(vd);
    }

    public final void e(VD vd) {
        C8632dsu.c((Object) vd, "");
        vd.d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.util.ClickEventHandler$resetPlaybackOverlayStates$1
            @Override // o.drM
            /* renamed from: e */
            public final C1294Wd invoke(C1294Wd c1294Wd) {
                C1294Wd c;
                C8632dsu.c((Object) c1294Wd, "");
                c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                return c;
            }
        });
        vd.d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.util.ClickEventHandler$resetPlaybackOverlayStates$2
            @Override // o.drM
            /* renamed from: e */
            public final C1294Wd invoke(C1294Wd c1294Wd) {
                C1294Wd c;
                C8632dsu.c((Object) c1294Wd, "");
                c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                return c;
            }
        });
        vd.d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.util.ClickEventHandler$resetPlaybackOverlayStates$3
            @Override // o.drM
            /* renamed from: b */
            public final C1294Wd invoke(C1294Wd c1294Wd) {
                C1294Wd c;
                C8632dsu.c((Object) c1294Wd, "");
                c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                return c;
            }
        });
    }
}
