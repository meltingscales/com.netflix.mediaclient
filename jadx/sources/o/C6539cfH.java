package o;

import android.app.Dialog;
import android.content.Intent;
import android.util.Pair;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.mdx.logging.connection.ConnectLogblob;
import com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger;
import com.netflix.mediaclient.servicemgr.ServiceManager;

/* renamed from: o.cfH  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6539cfH {
    public static boolean d(ServiceManager serviceManager) {
        if (serviceManager == null || !serviceManager.c() || serviceManager.q() == null || !serviceManager.q().isReady()) {
            C1044Mm.e("MdxUiUtils", "MDX service is NOT ready");
            return false;
        }
        return e(serviceManager.q(), serviceManager.q().i());
    }

    public static boolean a(ServiceManager serviceManager) {
        C1044Mm.e("MdxUiUtils", "isTargetReadyToControl");
        if (d(serviceManager)) {
            C1044Mm.e("MdxUiUtils", "isTargetReadyToControl check is connected (i.e., launched and paired)");
            return serviceManager.q().t();
        }
        return false;
    }

    public static boolean e(InterfaceC5131bsv interfaceC5131bsv, String str) {
        if (C8168dfL.g(str)) {
            C1044Mm.e("MdxUiUtils", "uuid is empty");
            return false;
        } else if (interfaceC5131bsv == null || !interfaceC5131bsv.isReady()) {
            C1044Mm.e("MdxUiUtils", "MDX service is NOT ready");
            return false;
        } else {
            Pair<String, String>[] l = interfaceC5131bsv.l();
            if (l == null || l.length < 1) {
                C1044Mm.j("MdxUiUtils", "No MDX remote targets found");
                return false;
            }
            for (Pair<String, String> pair : l) {
                if (str.equals(pair.first)) {
                    C1044Mm.e("MdxUiUtils", "Target found");
                    return true;
                }
            }
            C1044Mm.j("MdxUiUtils", "Target NOT found!");
            return false;
        }
    }

    public static void a(NetflixActivity netflixActivity, C6533cfB c6533cfB) {
        C1044Mm.a("MdxUiUtils", "Updating MDX target selection dialog");
        Dialog visibleDialog = netflixActivity.getVisibleDialog();
        if (visibleDialog != null && visibleDialog.isShowing() && (visibleDialog instanceof DialogC6583cfz)) {
            ((DialogC6583cfz) visibleDialog).a(c6533cfB.a(netflixActivity));
        }
    }

    public static void d(int i, long j, NetflixActivity netflixActivity, ServiceManager serviceManager, InterfaceC6580cfw interfaceC6580cfw) {
        C1044Mm.e("MdxUiUtils", "Mdx target clicked: item with id " + j + ", on position " + i);
        netflixActivity.removeVisibleDialog();
        if (!serviceManager.c()) {
            C1044Mm.j("MdxUiUtils", "Service not ready - bailing early");
            return;
        }
        InterfaceC5131bsv q = serviceManager.q();
        if (q == null) {
            InterfaceC1597aHe.b(new C1596aHd("SPY-35546: Mdx agent was null"));
            return;
        }
        C6533cfB c = interfaceC6580cfw.c(q);
        c.c(i);
        C6581cfx d = c.d();
        int i2 = 0;
        if (d == null) {
            C1044Mm.d("MdxUiUtils", "Target is NULL, this should NOT happen!");
            netflixActivity.setConnectingToTarget(false);
        } else {
            InterfaceC5131bsv q2 = serviceManager.q();
            if (q2 != null) {
                if (d.e()) {
                    if (interfaceC6580cfw.f()) {
                        C1044Mm.e("MdxUiUtils", "We were playing remotely - switching to playback locally");
                        q2.d("", 0);
                        aGH.a(netflixActivity).c(interfaceC6580cfw.b(), interfaceC6580cfw.e(), interfaceC6580cfw.d(), interfaceC6580cfw.a());
                        interfaceC6580cfw.j();
                    } else {
                        C1044Mm.e("MdxUiUtils", "Target is local. Remove current target from MDX agent.");
                        q2.c("");
                    }
                } else if (e(q2, d.d())) {
                    if (interfaceC6580cfw.i() || interfaceC6580cfw.f()) {
                        C6536cfE c2 = interfaceC6580cfw.c();
                        if (c2 != null) {
                            i2 = c2.a();
                        } else {
                            C1044Mm.d("MdxUiUtils", "Remote player is null. This should not happen!");
                        }
                        q2.d(d.d(), i2);
                        interfaceC6580cfw.m();
                    } else {
                        String d2 = d.d();
                        MdxConnectionLogblobLogger.e(ConnectLogblob.LaunchOrigin.Launch);
                        q2.c(d2);
                    }
                } else {
                    C1044Mm.j("MdxUiUtils", "Remote target is NOT available, stay and dismiss dialog");
                }
                netflixActivity.setConnectingToTarget(true);
            }
        }
        netflixActivity.mdxTargetListChanged();
    }

    public static void a(NetflixActivity netflixActivity, InterfaceC6580cfw interfaceC6580cfw) {
        InterfaceC5131bsv q = netflixActivity.getServiceManager().q();
        if (q != null) {
            if (interfaceC6580cfw.c() != null && interfaceC6580cfw.c().i()) {
                interfaceC6580cfw.c().d(false);
                q.d("", 0);
                interfaceC6580cfw.j();
            } else if (interfaceC6580cfw.c() == null) {
                interfaceC6580cfw.o();
                q.d("", 0);
            }
            q.c("");
            if (q instanceof InterfaceC2015aWs) {
                ((InterfaceC2015aWs) q).c();
            }
            LocalBroadcastManager.getInstance(netflixActivity).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.UPDATE_CAPABILITIES_BADGES"));
            netflixActivity.mdxTargetListChanged();
        }
    }

    public static int b(NetflixActivity netflixActivity, boolean z) {
        return netflixActivity.isConnectingToTarget() ? z ? androidx.mediarouter.R.drawable.mr_button_connecting_dark : androidx.mediarouter.R.drawable.mr_button_connecting_light : a(netflixActivity.getServiceManager()) ? netflixActivity.wasMdxStatusUpdatedByMdxReceiver() ? z ? androidx.mediarouter.R.drawable.mr_button_connected_dark : androidx.mediarouter.R.drawable.mr_button_connected_light : z ? androidx.mediarouter.R.drawable.ic_mr_button_connected_22_dark : androidx.mediarouter.R.drawable.ic_mr_button_connected_22_light : z ? androidx.mediarouter.R.drawable.mr_button_dark : androidx.mediarouter.R.drawable.mr_button_light;
    }

    public static boolean c(NetflixActivity netflixActivity) {
        return netflixActivity.isConnectingToTarget() || a(netflixActivity.getServiceManager());
    }
}
