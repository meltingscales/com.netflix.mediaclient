package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.details.DetailsActivityAction;
import java.util.Map;

/* renamed from: o.aLq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1717aLq extends aLG {
    public C1717aLq(NetflixActivity netflixActivity, Map<String, String> map) {
        super(netflixActivity, map);
    }

    @Override // o.aLG
    protected DetailsActivityAction b() {
        return DetailsActivityAction.a;
    }

    @Override // o.aLG
    protected String d() {
        return this.d.get("msg_token");
    }
}
