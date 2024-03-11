package o;

import com.netflix.mediaclient.cdx.api.NavigationCommand;
import com.netflix.mediaclient.cdx.api.Route;
import com.netflix.mediaclient.commanderinfra.api.util.BrowseKey;
import com.netflix.mediaclient.commanderinfra.api.util.DpadKey;
import com.netflix.mediaclient.commanderinfra.api.util.NavigationKey;
import com.netflix.mediaclient.commanderinfra.api.util.PlaybackControlKey;
import com.netflix.mediaclient.commanderinfra.api.util.PlaybackKey;
import com.netflix.mediaclient.commanderinfra.api.util.TitleActionKey;
import com.netflix.mediaclient.commanderinfra.impl.logging.CommanderFlexEventType;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;

@ActivityScoped
/* renamed from: o.Wp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1306Wp implements InterfaceC1289Vy {
    public static final c d = new c(null);
    private final InterfaceC1284Vt b;

    /* renamed from: o.Wp$e */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[BrowseKey.values().length];
            try {
                iArr[BrowseKey.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrowseKey.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrowseKey.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrowseKey.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrowseKey.d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr;
            int[] iArr2 = new int[DpadKey.values().length];
            try {
                iArr2[DpadKey.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DpadKey.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DpadKey.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DpadKey.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DpadKey.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            c = iArr2;
            int[] iArr3 = new int[NavigationKey.values().length];
            try {
                iArr3[NavigationKey.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NavigationKey.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NavigationKey.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            d = iArr3;
            int[] iArr4 = new int[TitleActionKey.values().length];
            try {
                iArr4[TitleActionKey.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            e = iArr4;
        }
    }

    @Inject
    public C1306Wp(InterfaceC1284Vt interfaceC1284Vt) {
        C8632dsu.c((Object) interfaceC1284Vt, "");
        this.b = interfaceC1284Vt;
    }

    /* renamed from: o.Wp$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("KeyHandlerInfraImpl");
        }
    }

    @Override // o.InterfaceC1289Vy
    public void a(Enum<?> r2) {
        C8632dsu.c((Object) r2, "");
        if (r2 instanceof BrowseKey) {
            e((BrowseKey) r2);
        } else if (r2 instanceof DpadKey) {
            e((DpadKey) r2);
        } else if (r2 instanceof NavigationKey) {
            d((NavigationKey) r2);
        } else if (r2 instanceof TitleActionKey) {
            c((TitleActionKey) r2);
        } else if (r2 instanceof PlaybackKey) {
            C1328Xl.b.a((PlaybackKey) r2);
        } else if (r2 instanceof PlaybackControlKey) {
            C1328Xl.b.b((PlaybackControlKey) r2);
        }
    }

    private final void e(BrowseKey browseKey) {
        Route route;
        d.getLogTag();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = e.b[browseKey.ordinal()];
        if (i == 1) {
            linkedHashMap.put("item", "New & Popular");
            route = Route.e;
        } else if (i == 2) {
            linkedHashMap.put("item", "TV Shows");
            route = Route.i;
        } else if (i == 3) {
            linkedHashMap.put("item", "Movies");
            route = Route.c;
        } else if (i == 4) {
            linkedHashMap.put("item", "Categories");
            route = Route.b;
        } else if (i != 5) {
            throw new NoWhenBranchMatchedException();
        } else {
            linkedHashMap.put("item", "My List");
            route = Route.a;
        }
        WL.d.e(this.b.g(), CommanderFlexEventType.c, linkedHashMap);
        C1329Xm.c.d(route);
    }

    private final void e(DpadKey dpadKey) {
        NavigationCommand navigationCommand;
        d.getLogTag();
        int i = e.c[dpadKey.ordinal()];
        if (i == 1) {
            navigationCommand = NavigationCommand.l;
        } else if (i == 2) {
            navigationCommand = NavigationCommand.a;
        } else if (i == 3) {
            navigationCommand = NavigationCommand.b;
        } else if (i == 4) {
            navigationCommand = NavigationCommand.i;
        } else if (i != 5) {
            throw new NoWhenBranchMatchedException();
        } else {
            navigationCommand = NavigationCommand.d;
        }
        C1329Xm.c.c(navigationCommand);
    }

    private final void d(NavigationKey navigationKey) {
        d.getLogTag();
        int i = e.d[navigationKey.ordinal()];
        if (i == 1) {
            C1329Xm.c.c(NavigationCommand.e);
        } else if (i == 2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("item", "Stop");
            WL.d.e(this.b.g(), CommanderFlexEventType.c, linkedHashMap);
            C1329Xm.c.c(NavigationCommand.e);
        } else if (i != 3) {
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("item", "Home");
            WL.d.e(this.b.g(), CommanderFlexEventType.c, linkedHashMap2);
            C1329Xm.c.d(Route.d);
        }
    }

    private final void c(TitleActionKey titleActionKey) {
        d.getLogTag();
        if (e.e[titleActionKey.ordinal()] == 1) {
            C1329Xm.c.d(new UE());
        }
    }
}
