package o;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.netflix.cl.model.PlanUpgradeType;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipProductChoice;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cwk  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7467cwk extends AbstractC7480cwx {
    private final PlanUpgradeType b = PlanUpgradeType.downloadLimit;

    @Override // o.AbstractC7480cwx
    public int a() {
        return com.netflix.mediaclient.ui.R.o.ka;
    }

    @Override // o.AbstractC7480cwx
    public String d() {
        return "DownloadLimitUpgrade";
    }

    @Override // o.AbstractC7480cwx
    public PlanUpgradeType e() {
        return this.b;
    }

    @Override // o.AbstractC7480cwx
    public boolean j() {
        return false;
    }

    @Override // o.AbstractC7480cwx, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        return layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.bx, viewGroup, false);
    }

    @Override // o.AbstractC7480cwx, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        r();
    }

    @Override // o.AbstractC7480cwx, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    private final void r() {
        String string = getString(com.netflix.mediaclient.ui.R.o.jU);
        C8632dsu.a(string, "");
        C1333Xq d = C1333Xq.d(com.netflix.mediaclient.ui.R.o.ke);
        MembershipProductChoice o2 = o();
        String c = d.a(o2 != null ? o2.getMaxStreams() : 0).c();
        String string2 = getString(com.netflix.mediaclient.ui.R.o.jP);
        C8632dsu.a(string2, "");
        C8632dsu.d((Object) c);
        a(string, c, string2);
    }

    @Override // o.AbstractC7480cwx
    public void f() {
        Map d;
        Map k;
        Throwable th;
        InterfaceC4208baF m;
        InterfaceC4208baF m2;
        if (k() != null) {
            InterfaceC7281ctJ s = s();
            if (s != null) {
                int c = s.c();
                for (int i = 0; i < c; i++) {
                    OfflineAdapterData c2 = s.c(i);
                    if (c2.a().b == OfflineAdapterData.ViewType.MOVIE) {
                        String id = c2.a().a.getId();
                        C8632dsu.a(id, "");
                        InterfaceC5206buQ c3 = s.c(id);
                        if (a(c3 != null ? c3.aA_() : null) && (m2 = m()) != null) {
                            VideoType videoType = VideoType.MOVIE;
                            PlayContext k2 = k();
                            C8632dsu.d(k2);
                            m2.e(id, videoType, k2);
                        }
                    } else {
                        C7460cwd[] b = c2.b();
                        C8632dsu.a(b, "");
                        for (C7460cwd c7460cwd : b) {
                            InterfaceC5206buQ c4 = s.c(c7460cwd.getId());
                            if (a(c4 != null ? c4.aA_() : null) && (m = m()) != null) {
                                String id2 = c7460cwd.getId();
                                VideoType videoType2 = VideoType.EPISODE;
                                PlayContext k3 = k();
                                C8632dsu.d(k3);
                                m.e(id2, videoType2, k3);
                            }
                        }
                    }
                }
            }
        } else {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("This dialog in offline mode should not receive any null param as part of SPY-11993.", null, null, true, k, false, false, 96, null);
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
        }
        dismiss();
    }

    @Override // o.AbstractC7480cwx
    public void b() {
        dismiss();
    }

    private final InterfaceC4208baF m() {
        ServiceManager c = ServiceManager.c(getNetflixActivity());
        if (c != null) {
            return c.t();
        }
        return null;
    }

    private final InterfaceC7281ctJ s() {
        ServiceManager c = ServiceManager.c(getNetflixActivity());
        if (c == null || c.t() == null) {
            return null;
        }
        return C7353cuc.a();
    }

    private final boolean a(Status status) {
        return (status != null ? status.c() : null) == StatusCode.DL_LIMIT_TOO_MANY_DEVICES_PLAN_OPTION;
    }
}
