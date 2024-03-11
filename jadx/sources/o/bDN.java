package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerActivity;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import javax.inject.Inject;

/* loaded from: classes4.dex */
public final class bDN implements bDI {
    private final Activity b;

    @Inject
    public bDN(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.b = activity;
    }

    @Override // o.bDI
    public Intent a(Context context, String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) playerExtras, "");
        return PlayerActivity.d.a(context, str, videoType, playContext, playerExtras);
    }

    @Override // o.bDI
    public Intent e(Context context, String str, VideoType videoType, PlayContext playContext) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        return ActivityC7512cxc.c.b(context, str, videoType, playContext);
    }

    @Override // o.bDI
    public InterfaceC5523cAo a() {
        return new C5522cAn(this.b);
    }
}
