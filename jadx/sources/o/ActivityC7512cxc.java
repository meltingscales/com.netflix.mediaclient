package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerActivity;
import com.netflix.mediaclient.util.PlayContext;

@InterfaceC1639aIt
/* renamed from: o.cxc  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ActivityC7512cxc extends PlayerActivity {
    public static final d c = new d(null);

    /* renamed from: o.cxc$d */
    /* loaded from: classes6.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("NonMemberPlayerActivity");
        }

        public final Intent b(Context context, String str, VideoType videoType, PlayContext playContext) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) playContext, "");
            getLogTag();
            Intent intent = new Intent(context, ActivityC7512cxc.class);
            intent.addFlags(131072);
            intent.putExtra(NetflixActivity.EXTRA_VIDEO_ID, str);
            intent.putExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE, videoType.getValue());
            intent.putExtra(NetflixActivity.EXTRA_PLAY_CONTEXT, playContext);
            return intent;
        }
    }
}
