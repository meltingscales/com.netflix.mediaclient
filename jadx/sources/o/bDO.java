package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerActivity;
import com.netflix.mediaclient.util.PlayContext;
import o.bDH;

/* loaded from: classes4.dex */
public final class bDO implements bDL {
    @Override // o.bDL
    public Class<?> b() {
        return PlayerActivity.class;
    }

    @Override // o.bDL
    public Intent c(Context context, String str, VideoType videoType, PlayContext playContext, long j) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        return PlayerActivity.d.c(context, str, videoType, playContext, j, false);
    }

    @Override // o.bDL
    public void e(Activity activity) {
        C8632dsu.c((Object) activity, "");
        if (activity instanceof PlayerActivity) {
            bDH.c cVar = bDH.b;
        } else {
            PlayerActivity.d.b(activity);
        }
    }
}
