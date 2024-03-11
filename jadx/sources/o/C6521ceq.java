package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment;

/* renamed from: o.ceq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6521ceq extends View$OnClickListenerC1217Te {
    private final NetflixActivity e;
    public static final a d = new a(null);
    public static final int c = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6521ceq(NetflixActivity netflixActivity, bDG bdg) {
        super(netflixActivity, bdg);
        C8632dsu.c((Object) bdg, "");
        this.e = netflixActivity;
    }

    /* renamed from: o.ceq$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("CwVideoMoreOptionsClickListener");
        }
    }

    @Override // o.View$OnClickListenerC1217Te, android.view.View.OnClickListener
    @SuppressLint({"CheckResult"})
    public void onClick(View view) {
        C8632dsu.c((Object) view, "");
        Object tag = view.getTag(com.netflix.mediaclient.ui.R.g.gS);
        if (tag == null) {
            return;
        }
        InterfaceC5177bto interfaceC5177bto = (InterfaceC5177bto) tag;
        NetflixActivity netflixActivity = this.e;
        if (netflixActivity == null || !netflixActivity.isDialogFragmentVisible()) {
            CLv2Utils.INSTANCE.b(new Focus(AppView.moreInfoButton, e()), (Command) new ViewDetailsCommand(), false);
            ContinueWatchingMenuDialogFragment continueWatchingMenuDialogFragment = new ContinueWatchingMenuDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("DismissOnSelection", false);
            bundle.putString("extra_cw_item_video_id", interfaceC5177bto.getId());
            bundle.putParcelable("extra_tracking_info_holder", this.a);
            continueWatchingMenuDialogFragment.setArguments(bundle);
            NetflixActivity netflixActivity2 = this.e;
            if (netflixActivity2 != null) {
                netflixActivity2.showFullScreenDialog(continueWatchingMenuDialogFragment);
            }
        }
    }
}
