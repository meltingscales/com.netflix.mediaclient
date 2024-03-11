package o;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Lifecycle;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.BaseNflxHandler;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.Iterator;
import java.util.Map;
import o.C9834xU;

/* renamed from: o.aLt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1720aLt extends BaseNflxHandler {
    @Override // com.netflix.mediaclient.protocol.nflx.BaseNflxHandler, com.netflix.mediaclient.protocol.nflx.NflxHandler
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    public AbstractC1720aLt(NetflixActivity netflixActivity, Map<String, String> map) {
        super(netflixActivity, map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NflxHandler.Response b(String str, final Runnable runnable) {
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if ((k == null ? null : k.j()) != null && (!k.j().isMaturityHighest() || k.j().hasTitleRestrictions())) {
            aLN.a.a(C9694vI.a(this.b)).b(new C0978Jx(str), new drM() { // from class: o.aLA
                @Override // o.drM
                public final Object invoke(Object obj) {
                    dpR c;
                    c = AbstractC1720aLt.this.c(runnable, (aLO) obj);
                    return c;
                }
            });
            return NflxHandler.Response.HANDLING_WITH_DELAY;
        }
        runnable.run();
        return NflxHandler.Response.HANDLING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR c(Runnable runnable, aLO alo) {
        if (alo == null) {
            InterfaceC1598aHf.a(String.format("%s: onVideoMaturityChecked response is null", "NflxHandler"));
            DeepLinkUtils.INSTANCE.d(this.b);
        } else if (alo instanceof aLL) {
            InterfaceC1598aHf.a(String.format("%s: status error - %s", "NflxHandler", ((aLL) alo).b()));
            DeepLinkUtils.INSTANCE.d(this.b);
        } else if ((alo instanceof aLZ) && ((aLZ) alo).e() == Boolean.FALSE) {
            runnable.run();
            C8194dfl.c(this.b);
        } else if (this.b.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            AlertDialog.Builder negativeButton = new AlertDialog.Builder(this.b, C9834xU.o.c).setMessage(com.netflix.mediaclient.ui.R.o.lL).setNegativeButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.aLw
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AbstractC1720aLt.this.a(dialogInterface, i);
                }
            });
            negativeButton.setPositiveButton(com.netflix.mediaclient.ui.R.o.lE, new DialogInterface.OnClickListener() { // from class: o.aLy
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AbstractC1720aLt.this.e(dialogInterface, i);
                }
            });
            negativeButton.create().show();
        } else {
            C8194dfl.c(this.b);
            this.b.finish();
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        C8194dfl.c(this.b);
        this.b.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        NetflixApplication.getInstance().c(b());
        NetflixActivity netflixActivity = this.b;
        netflixActivity.startActivity(cNT.a(netflixActivity).d(this.b, AppView.webLink));
        C8194dfl.c(this.b);
        this.b.finish();
    }

    private Intent b() {
        Uri.Builder buildUpon = Uri.parse("nflx://www.netflix.com/browse").buildUpon();
        if (this.d != null) {
            StringBuilder sb = new StringBuilder();
            Iterator<Map.Entry<String, String>> it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                sb.append(next.getKey());
                sb.append("=");
                sb.append(next.getValue());
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
            buildUpon.appendQueryParameter("q", sb.toString());
        }
        buildUpon.build();
        return new Intent("android.intent.action.VIEW").setData(buildUpon.build());
    }
}
