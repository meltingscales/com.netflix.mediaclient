package o;

import android.content.DialogInterface;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.mdx.logging.connection.ConnectLogblob;
import com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerFragmentV2;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Map;
import o.C9834xU;
import o.DialogC6583cfz;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONObject;

/* renamed from: o.cwS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7449cwS extends C1045Mp {
    private long a;
    private final aOV b;
    private final PlayerFragmentV2 c;
    private final InterfaceC5131bsv d;
    private final a e;
    private C6533cfB h;

    /* renamed from: o.cwS$a */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(boolean z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7449cwS(InterfaceC5131bsv interfaceC5131bsv, aOV aov, PlayerFragmentV2 playerFragmentV2, a aVar) {
        super("MdxFragmentHelper");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) playerFragmentV2, "");
        this.d = interfaceC5131bsv;
        this.b = aov;
        this.c = playerFragmentV2;
        this.e = aVar;
        this.a = -1L;
    }

    public final void a() {
        C6533cfB c6533cfB;
        C6581cfx[] a2;
        FragmentActivity activity = this.c.getActivity();
        if (activity != null && this.c.localDiscoveryConsentUiLazy.get().e()) {
            NetflixActivity netflixActivity = (NetflixActivity) activity;
            C9872yF c9872yF = netflixActivity.composeViewOverlayManager;
            C8632dsu.a(c9872yF, "");
            netflixActivity.displayDialog(this.c.localDiscoveryConsentUiLazy.get().c(c9872yF));
            return;
        }
        C6533cfB c6533cfB2 = this.h;
        if (c6533cfB2 != null) {
            if ((c6533cfB2 != null ? c6533cfB2.a() : null) != null && (c6533cfB = this.h) != null && (a2 = c6533cfB.a()) != null && a2.length >= 2) {
                getLogTag();
                FragmentActivity activity2 = this.c.getActivity();
                C8632dsu.d(activity2);
                ((NetflixActivity) activity2).displayDialog(e());
                return;
            }
        }
        getLogTag();
        if (this.c.localDiscoveryConsentUiLazy.get().b()) {
            FragmentActivity activity3 = this.c.getActivity();
            C8632dsu.d(activity3);
            ((NetflixActivity) activity3).displayDialog(d());
        }
    }

    public final void b() {
        InterfaceC5131bsv interfaceC5131bsv = this.d;
        if (interfaceC5131bsv == null || this.b == null) {
            d(null);
            return;
        }
        Pair<String, String>[] l = interfaceC5131bsv.l();
        if (l == null || l.length == 0) {
            d(null);
            return;
        }
        String i = this.d.i();
        C8632dsu.a(i, "");
        d(a(l, i, this.b));
    }

    private final C6533cfB a(Pair<String, String>[] pairArr, String str, aOV aov) {
        if (aov == null) {
            aov = this.b;
        }
        return new C6533cfB(pairArr, str, aov.J().b());
    }

    private final void d(C6533cfB c6533cfB) {
        FragmentActivity activity;
        a aVar;
        boolean z;
        synchronized (this) {
            this.h = c6533cfB;
            if (this.c.getActivity() != null && (aVar = this.e) != null) {
                if (c6533cfB == null && !this.c.localDiscoveryConsentUiLazy.get().b()) {
                    z = false;
                    aVar.a(z);
                }
                z = true;
                aVar.a(z);
            }
            if (c6533cfB != null && (activity = this.c.getActivity()) != null) {
                C6539cfH.a((NetflixActivity) C9737vz.e(activity, NetflixActivity.class), c6533cfB);
            }
        }
    }

    private final AlertDialog e() {
        final C6533cfB c6533cfB = this.h;
        if (c6533cfB != null) {
            final Long startSession = Logger.INSTANCE.startSession(new Presentation(AppView.castDeviceSelector, CLv2Utils.b(c6533cfB.c())));
            int b = c6533cfB.b();
            c6533cfB.c(b);
            FragmentActivity activity = this.c.getActivity();
            DialogC6583cfz.e eVar = new DialogC6583cfz.e(activity, this.d);
            eVar.setCancelable(false);
            eVar.setTitle(com.netflix.mediaclient.ui.R.o.dX);
            eVar.e(c6533cfB.a(activity));
            final InterfaceC5160btX aj = this.c.aj();
            String string = this.c.getString(com.netflix.mediaclient.ui.R.o.hJ, cBN.a.d(aj));
            C8632dsu.a(string, "");
            eVar.a(b, string);
            eVar.d(new AdapterView.OnItemClickListener() { // from class: o.cwW
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    C7449cwS.c(C7449cwS.this, c6533cfB, aj, adapterView, view, i, j);
                }
            });
            eVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o.cwY
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C7449cwS.c(startSession, this, dialogInterface);
                }
            });
            eVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.cwZ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C7449cwS.e(startSession, dialogInterface);
                }
            });
            return eVar.create();
        }
        return d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C7449cwS c7449cwS, C6533cfB c6533cfB, InterfaceC5160btX interfaceC5160btX, AdapterView adapterView, View view, int i, long j) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) c7449cwS, "");
        C8632dsu.c((Object) c6533cfB, "");
        NetflixActivity bj_ = c7449cwS.c.bj_();
        if (bj_ == null || c7449cwS.d == null) {
            return;
        }
        c7449cwS.getLogTag();
        c7449cwS.c.d(bj_);
        c6533cfB.c(i);
        C6581cfx d2 = c6533cfB.d();
        if (d2 == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.d;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("selectedTarget is NULL, this should NOT happen!", null, errorType, false, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType2.c();
                    c1596aHd.a(c + " " + b);
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
            a aVar = c7449cwS.e;
            if (aVar != null) {
                aVar.a();
            }
        } else if (d2.e()) {
            c7449cwS.getLogTag();
            a aVar2 = c7449cwS.e;
            if (aVar2 != null) {
                aVar2.a();
            }
        } else {
            c7449cwS.getLogTag();
            if (C6539cfH.e(c7449cwS.d, d2.d())) {
                c7449cwS.getLogTag();
                MdxConnectionLogblobLogger.e(ConnectLogblob.LaunchOrigin.Playback);
                c7449cwS.d.c(d2.d());
                aJY ak = c7449cwS.c.ak();
                long o2 = ak != null ? ak.o() : -1L;
                c7449cwS.a = o2;
                if (o2 == -1 && interfaceC5160btX != null) {
                    c7449cwS.a = interfaceC5160btX.aF_();
                }
                PlayContext y_ = c7449cwS.c.y_();
                C8632dsu.a(y_, "");
                if (interfaceC5160btX != null) {
                    VideoType an = c7449cwS.c.an();
                    C8632dsu.a(an, "");
                    c7449cwS.c.playbackLauncher.get().b(interfaceC5160btX, an, y_, c7449cwS.a);
                }
                c7449cwS.d.A();
                bj_.finish();
                return;
            }
            c7449cwS.getLogTag();
            a aVar3 = c7449cwS.e;
            if (aVar3 != null) {
                aVar3.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Long l, C7449cwS c7449cwS, DialogInterface dialogInterface) {
        C8632dsu.c((Object) c7449cwS, "");
        Logger.INSTANCE.cancelSession(l);
        a aVar = c7449cwS.e;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Long l, DialogInterface dialogInterface) {
        Logger.INSTANCE.endSession(l);
    }

    private final AlertDialog d() {
        FragmentActivity activity = this.c.getActivity();
        if (activity != null) {
            final Long startSession = Logger.INSTANCE.startSession(new Presentation(AppView.castDeviceSelector, CLv2Utils.b((JSONObject) null)));
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, C9834xU.o.c);
            builder.setCancelable(false);
            builder.setTitle(com.netflix.mediaclient.ui.R.o.hc);
            builder.setMessage(com.netflix.mediaclient.ui.R.o.gU);
            builder.setPositiveButton(com.netflix.mediaclient.ui.R.o.ha, new DialogInterface.OnClickListener() { // from class: o.cwX
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C7449cwS.c(C7449cwS.this, dialogInterface, i);
                }
            });
            builder.setNegativeButton(com.netflix.mediaclient.ui.R.o.cL, new DialogInterface.OnClickListener() { // from class: o.cxa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C7449cwS.b(dialogInterface, i);
                }
            });
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o.cxe
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C7449cwS.d(startSession, this, dialogInterface);
                }
            });
            builder.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.cxb
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C7449cwS.c(startSession, dialogInterface);
                }
            });
            return builder.create();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C7449cwS c7449cwS, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c7449cwS, "");
        dialogInterface.dismiss();
        c7449cwS.c.localDiscoveryConsentUiLazy.get().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Long l, C7449cwS c7449cwS, DialogInterface dialogInterface) {
        C8632dsu.c((Object) c7449cwS, "");
        Logger.INSTANCE.cancelSession(l);
        a aVar = c7449cwS.e;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Long l, DialogInterface dialogInterface) {
        Logger.INSTANCE.endSession(l);
    }
}
