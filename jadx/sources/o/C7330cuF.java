package o;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.widget.PopupMenu;
import com.netflix.cl.model.event.session.command.PauseDownloadCommand;
import com.netflix.cl.model.event.session.command.RemoveCachedVideoCommand;
import com.netflix.cl.model.event.session.command.ResumeDownloadCommand;
import com.netflix.cl.model.event.session.command.ViewCachedVideosCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cuF  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7330cuF extends C1045Mp {
    public static final C7330cuF d = new C7330cuF();

    /* renamed from: o.cuF$e */
    /* loaded from: classes6.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[DownloadButton.ButtonState.values().length];
            try {
                iArr[DownloadButton.ButtonState.DOWNLOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadButton.ButtonState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadButton.ButtonState.SAVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            e = iArr;
        }
    }

    private C7330cuF() {
        super("SeasonDownloadDialogHelper");
    }

    public final void a(NetflixActivity netflixActivity, List<? extends InterfaceC5227bul> list, boolean z) {
        Map d2;
        Map k;
        Throwable th;
        PlayContext emptyPlayContext;
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) list, "");
        InterfaceC7281ctJ a = C7353cuc.a();
        C8632dsu.a(a, "");
        InterfaceC4208baF t = netflixActivity.getServiceManager().t();
        if (t == null) {
            return;
        }
        bDG bdg = (bDG) C9737vz.b(netflixActivity, bDG.class);
        if (bdg == null || (emptyPlayContext = bdg.y_()) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = "Activity " + netflixActivity.getLocalClassName() + " is not a PlayContextProvider";
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
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
            emptyPlayContext = new EmptyPlayContext(getLogTag(), -240);
        }
        ArrayList<InterfaceC5227bul> arrayList = new ArrayList();
        for (Object obj : list) {
            InterfaceC5227bul interfaceC5227bul = (InterfaceC5227bul) obj;
            if (interfaceC5227bul.aE_().aH_() != null && a.c(interfaceC5227bul.aE_().aH_()) == null) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC5227bul interfaceC5227bul2 : arrayList) {
            String aH_ = interfaceC5227bul2.aE_().aH_();
            C8632dsu.d((Object) aH_);
            CreateRequest b2 = C7353cuc.b(aH_, interfaceC5227bul2.getType(), emptyPlayContext, z);
            C8632dsu.a(b2, "");
            b2.e(true);
            t.b(b2);
        }
    }

    public final PopupMenu c(final Context context, DownloadButton downloadButton, final List<? extends InterfaceC5227bul> list) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) downloadButton, "");
        C8632dsu.c((Object) list, "");
        PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(context, BrowseExperience.e() ? androidx.appcompat.R.style.Theme_AppCompat_Light : androidx.appcompat.R.style.Theme_AppCompat), downloadButton);
        popupMenu.inflate(com.netflix.mediaclient.ui.R.j.a);
        popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.gX).setVisible(true);
        DownloadButton.ButtonState buttonState = downloadButton.a;
        int i = buttonState == null ? -1 : e.e[buttonState.ordinal()];
        if (i == 1) {
            popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.eh).setVisible(true);
            popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.ae).setVisible(true);
        } else if (i == 2) {
            popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.f13246fi).setVisible(true);
            popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.ae).setVisible(true);
        } else if (i == 3) {
            popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.aO).setVisible(true);
        } else {
            popupMenu.getMenu().findItem(com.netflix.mediaclient.ui.R.g.ae).setVisible(true);
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: o.cuC
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean a;
                a = C7330cuF.a(context, list, menuItem);
                return a;
            }
        });
        return popupMenu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Context context, List list, MenuItem menuItem) {
        ServiceManager serviceManager;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) list, "");
        NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
        InterfaceC4208baF t = (netflixActivity == null || (serviceManager = netflixActivity.getServiceManager()) == null) ? null : serviceManager.t();
        if (netflixActivity == null || t == null) {
            return true;
        }
        int itemId = menuItem.getItemId();
        if (itemId == com.netflix.mediaclient.ui.R.g.f13246fi) {
            d.e(netflixActivity, t, list);
            return true;
        } else if (itemId == com.netflix.mediaclient.ui.R.g.eh) {
            d.e(t, list);
            return true;
        } else if (itemId == com.netflix.mediaclient.ui.R.g.ae) {
            d.a(t, list);
            return true;
        } else if (itemId == com.netflix.mediaclient.ui.R.g.aO) {
            d.c(t, list);
            return true;
        } else if (itemId == com.netflix.mediaclient.ui.R.g.gX) {
            d.b(netflixActivity);
            return true;
        } else {
            return true;
        }
    }

    private final void e(NetflixActivity netflixActivity, InterfaceC4208baF interfaceC4208baF, List<? extends InterfaceC5227bul> list) {
        InterfaceC7281ctJ a = C7353cuc.a();
        C8632dsu.a(a, "");
        ArrayList<InterfaceC5227bul> arrayList = new ArrayList();
        for (Object obj : list) {
            InterfaceC5206buQ c = a.c(((InterfaceC5227bul) obj).aE_().aH_());
            if ((c != null ? c.au_() : null) != DownloadState.Complete) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC5227bul interfaceC5227bul : arrayList) {
            String aH_ = interfaceC5227bul.aE_().aH_();
            C7460cwd e2 = C7353cuc.e(aH_);
            if (e2 != null && d.d(interfaceC4208baF, netflixActivity)) {
                C7178crM.d((Context) netflixActivity, aH_, e2.getType(), true).show();
            } else {
                CLv2Utils.d(new ResumeDownloadCommand());
                interfaceC4208baF.h(aH_);
            }
        }
    }

    private final void e(InterfaceC4208baF interfaceC4208baF, List<? extends InterfaceC5227bul> list) {
        InterfaceC7281ctJ a = C7353cuc.a();
        C8632dsu.a(a, "");
        ArrayList<InterfaceC5227bul> arrayList = new ArrayList();
        for (Object obj : list) {
            InterfaceC5206buQ c = a.c(((InterfaceC5227bul) obj).aE_().aH_());
            if ((c != null ? c.au_() : null) == DownloadState.InProgress) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC5227bul interfaceC5227bul : arrayList) {
            CLv2Utils.d(new PauseDownloadCommand());
            interfaceC4208baF.e(interfaceC5227bul.aE_().aH_());
        }
    }

    private final void a(InterfaceC4208baF interfaceC4208baF, List<? extends InterfaceC5227bul> list) {
        InterfaceC7281ctJ a = C7353cuc.a();
        C8632dsu.a(a, "");
        ArrayList<InterfaceC5227bul> arrayList = new ArrayList();
        for (Object obj : list) {
            InterfaceC5206buQ c = a.c(((InterfaceC5227bul) obj).aE_().aH_());
            if ((c != null ? c.au_() : null) != DownloadState.Complete) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC5227bul interfaceC5227bul : arrayList) {
            CLv2Utils.d(new RemoveCachedVideoCommand());
            interfaceC4208baF.d(interfaceC5227bul.aE_().aH_());
        }
    }

    private final void b(NetflixActivity netflixActivity) {
        CLv2Utils.d(new ViewCachedVideosCommand());
        netflixActivity.startActivity(OfflineActivityV2.b.d(netflixActivity));
    }

    private final boolean d(InterfaceC4208baF interfaceC4208baF, NetflixActivity netflixActivity) {
        return interfaceC4208baF.o() && (ConnectivityUtils.p(netflixActivity) && ConnectivityUtils.k(netflixActivity) && !ConnectivityUtils.m(netflixActivity));
    }

    private final void c(InterfaceC4208baF interfaceC4208baF, List<? extends InterfaceC5227bul> list) {
        for (InterfaceC5227bul interfaceC5227bul : list) {
            CLv2Utils.d(new RemoveCachedVideoCommand());
            interfaceC4208baF.d(interfaceC5227bul.aE_().aH_());
        }
    }
}
