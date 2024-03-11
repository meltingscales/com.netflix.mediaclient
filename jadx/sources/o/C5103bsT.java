package o;

import android.content.Intent;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.Objects;

/* renamed from: o.bsT  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5103bsT {

    /* renamed from: o.bsT$c */
    /* loaded from: classes4.dex */
    public static class c {
        public final String a;
        public final String b;
        public final String c;
        public final IPlayer.PlaybackType d;
        public final long e;
        public final VideoType h;

        public c(String str, IPlayer.PlaybackType playbackType, long j, VideoType videoType, String str2, String str3) {
            this.b = str;
            this.d = playbackType;
            this.e = j;
            this.h = videoType;
            this.c = str2;
            this.a = str3;
        }
    }

    public static Intent e(String str, String str2, IPlayer.PlaybackType playbackType, VideoType videoType, long j, C5167bte c5167bte) {
        Objects.requireNonNull(str2);
        Intent intent = new Intent(str);
        intent.addCategory("com.netflix.mediaclient.intent.category.PLAYER");
        intent.putExtra(NetflixActivity.EXTRA_VIDEO_ID, str2);
        intent.putExtra("playbackType", playbackType.c());
        intent.putExtra("extra_bookmark_seconds_from_start_param", j);
        intent.putExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE, videoType.getValue());
        intent.putExtra("extra_ui_label_string_value", c5167bte.c());
        return intent;
    }

    public static c e(Intent intent) {
        return new c(intent.getAction(), IPlayer.PlaybackType.c(intent.getStringExtra("playbackType")), intent.getLongExtra("extra_bookmark_seconds_from_start_param", -1L), VideoType.create(intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE)), intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID), intent.getStringExtra("extra_ui_label_string_value"));
    }
}
