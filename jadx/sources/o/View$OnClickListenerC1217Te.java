package o;

import android.content.Context;
import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag;
import com.netflix.mediaclient.util.PlayContext;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: o.Te  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class View$OnClickListenerC1217Te implements View.OnClickListener {
    public TrackingInfoHolder a;
    private final bDG b;
    private final NetflixActivity c;

    public View$OnClickListenerC1217Te(NetflixActivity netflixActivity, bDG bdg) {
        this.c = netflixActivity;
        this.b = bdg;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag(com.netflix.mediaclient.ui.R.g.gS);
        if (tag == null) {
            C1044Mm.j("VideoDetailsClickListener", "No video details for click listener to use");
            return;
        }
        InterfaceC5223buh interfaceC5223buh = (InterfaceC5223buh) tag;
        TrackingInfoHolder trackingInfoHolder = this.a;
        if (trackingInfoHolder == null) {
            InterfaceC1598aHf.a(new C1596aHd("Using deprecated playContextProvider.getPlayContext()").b(false));
            PlayContext y_ = this.b.y_();
            trackingInfoHolder = new TrackingInfoHolder(y_.j()).d(Integer.parseInt(interfaceC5223buh.getId()), y_);
        }
        this.c.showDebugToast("DEBUG info: " + interfaceC5223buh.getTitle() + ", type: " + interfaceC5223buh.getType());
        a(this.c, interfaceC5223buh, trackingInfoHolder);
    }

    protected void a(NetflixActivity netflixActivity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder) {
        VideoType type = interfaceC5223buh.getType();
        VideoType videoType = VideoType.GAMES;
        if (type == videoType) {
            CLv2Utils.INSTANCE.b(AppView.boxArt, CommandValue.ViewGameDetailsCommand, (TrackingInfo) null);
        } else {
            CLv2Utils.INSTANCE.b(new Focus(AppView.boxArt, e()), new ViewDetailsCommand(), !C8171dfO.c());
        }
        if (C8171dfO.c() && interfaceC5223buh.getType() != videoType) {
            QuickDrawDialogFrag.c(netflixActivity, interfaceC5223buh.getId(), trackingInfoHolder);
        } else {
            InterfaceC3643bFl.a((Context) netflixActivity).d(netflixActivity, interfaceC5223buh, trackingInfoHolder, "DeetsClickListener");
        }
    }

    public void b(View view) {
        C1044Mm.b("VideoDetailsClickListener", "Removing click listeners");
        view.setOnClickListener(null);
        view.setOnLongClickListener(null);
        view.setTag(com.netflix.mediaclient.ui.R.g.gS, null);
    }

    public void d(View view, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder) {
        this.a = trackingInfoHolder;
        view.setOnClickListener(this);
        view.setTag(com.netflix.mediaclient.ui.R.g.gS, interfaceC5223buh);
    }

    public TrackingInfo e() {
        TrackingInfoHolder trackingInfoHolder = this.a;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder.c((JSONObject) null);
        }
        InterfaceC1598aHf.a("getBoxartTrackingInfo() with missing trackingInfoHolder");
        return CLv2Utils.a(new HashMap());
    }
}
