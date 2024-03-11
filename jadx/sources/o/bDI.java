package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;

/* loaded from: classes4.dex */
public interface bDI {
    Intent a(Context context, String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras);

    InterfaceC5523cAo a();

    Intent e(Context context, String str, VideoType videoType, PlayContext playContext);
}
