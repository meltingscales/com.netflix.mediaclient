package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Lifecycle;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.details.DetailsActivityAction;
import java.util.List;
import java.util.Map;
import o.C9834xU;

/* renamed from: o.aLe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1705aLe implements aKP {
    private final Map<String, String> a;

    protected String c() {
        return null;
    }

    protected DetailsActivityAction e() {
        return null;
    }

    public C1705aLe(Map<String, String> map) {
        this.a = map;
    }

    @Override // o.aKP
    public boolean c(List<String> list) {
        return list.size() > 1;
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        if (DeepLinkUtils.a(netflixActivity, intent, this.a)) {
            return NflxHandler.Response.HANDLING;
        }
        C1044Mm.b("NetflixComVideoDetailsHandler", "Starting Details activity");
        return e(netflixActivity, intent, list, str);
    }

    protected NflxHandler.Response e(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        a(list.get(1), netflixActivity, intent, str);
        return NflxHandler.Response.HANDLING_WITH_DELAY;
    }

    @Override // o.aKP
    public Command d() {
        return new ViewDetailsCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final String str, final NetflixActivity netflixActivity, final Intent intent, final String str2) {
        netflixActivity.getServiceManager().j().d(str, new AbstractC5164btb() { // from class: o.aLe.2
            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void e(InterfaceC8366diy interfaceC8366diy, Status status) {
                if (status.j() && interfaceC8366diy != null) {
                    if (interfaceC8366diy.getType() == VideoType.SEASON || interfaceC8366diy.getType() == VideoType.EPISODE) {
                        String aO_ = interfaceC8366diy.aO_();
                        if (!TextUtils.isEmpty(aO_) && !aO_.equals(str)) {
                            C1705aLe.this.d(aO_, netflixActivity, intent, str2);
                            return;
                        }
                        InterfaceC1598aHf.a(new C1596aHd("Ancestor is null for: " + str).b(false));
                    } else {
                        c(interfaceC8366diy, null, netflixActivity, str2);
                    }
                } else {
                    InterfaceC1598aHf.a(new C1596aHd("SPY-7518 - got error trying to fetch video summary for: " + str).b(false));
                }
                C8194dfl.c(netflixActivity);
                Intent intent2 = intent;
                if (intent2 == null || bEX.b.d(intent2)) {
                    return;
                }
                netflixActivity.finish();
            }

            private void c(InterfaceC8366diy interfaceC8366diy, Bundle bundle, NetflixActivity netflixActivity2, String str3) {
                InterfaceC3643bFl.a((Context) netflixActivity2).a(netflixActivity2, interfaceC8366diy, C8194dfl.a(str, str3), C1705aLe.this.e(), C1705aLe.this.c(), "DeepLink", bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NflxHandler.Response a(String str, NetflixActivity netflixActivity, Intent intent, String str2) {
        UserAgent u = netflixActivity.getServiceManager().u();
        if ((u == null ? null : u.j()) != null && (!u.j().isMaturityHighest() || u.j().hasTitleRestrictions())) {
            b(str, netflixActivity, intent, str2);
        } else {
            d(str, netflixActivity, intent, str2);
        }
        return NflxHandler.Response.HANDLING_WITH_DELAY;
    }

    private void b(final String str, final NetflixActivity netflixActivity, final Intent intent, final String str2) {
        aLN.a.a(C9694vI.a(netflixActivity)).b(new C0978Jx(str), new drM() { // from class: o.aLf
            @Override // o.drM
            public final Object invoke(Object obj) {
                dpR b;
                b = C1705aLe.this.b(netflixActivity, str, intent, str2, (aLO) obj);
                return b;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR b(final NetflixActivity netflixActivity, final String str, Intent intent, final String str2, aLO alo) {
        if (alo == null) {
            InterfaceC1598aHf.a(String.format("%s: onVideoMaturityChecked response is null", "NetflixComVideoDetailsHandler"));
            e(netflixActivity);
        } else if (alo instanceof aLL) {
            InterfaceC1598aHf.a(String.format("%s: status error - %s", "NetflixComVideoDetailsHandler", ((aLL) alo).b()));
            e(netflixActivity);
        } else if ((alo instanceof aLZ) && ((aLZ) alo).e() == Boolean.FALSE) {
            d(str, netflixActivity, intent, str2);
        } else if (netflixActivity.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            AlertDialog.Builder negativeButton = new AlertDialog.Builder(netflixActivity, C9834xU.o.c).setMessage(com.netflix.mediaclient.ui.R.o.lL).setNegativeButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.aLd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C1705aLe.d(NetflixActivity.this, dialogInterface, i);
                }
            });
            negativeButton.setPositiveButton(com.netflix.mediaclient.ui.R.o.lE, new DialogInterface.OnClickListener() { // from class: o.aLc
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C1705aLe.c(str, str2, netflixActivity, dialogInterface, i);
                }
            });
            negativeButton.create().show();
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(NetflixActivity netflixActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        netflixActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(String str, String str2, NetflixActivity netflixActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Uri parse = Uri.parse("https://www.netflix.com/title/" + str);
        if (str2 != null) {
            parse = parse.buildUpon().appendQueryParameter("trkid", str2).build();
        }
        NetflixApplication.getInstance().c(new Intent("android.intent.action.VIEW").setData(parse));
        netflixActivity.startActivity(cNT.a(netflixActivity).d(netflixActivity, AppView.webLink));
        C8194dfl.c(netflixActivity);
        netflixActivity.finish();
    }

    private void e(NetflixActivity netflixActivity) {
        if (netflixActivity.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            DeepLinkUtils.INSTANCE.d(netflixActivity);
        }
    }
}
