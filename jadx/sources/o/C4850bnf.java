package o;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.servicemgr.Logblob;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* renamed from: o.bnf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4850bnf extends BaseEventJson {
    @SerializedName("cachehit")
    protected boolean a;
    @SerializedName(UmaAlert.ICON_ERROR)
    protected String c;
    @SerializedName("updated")
    protected boolean e;

    public C4850bnf a(boolean z) {
        this.e = z;
        return this;
    }

    public C4850bnf d(boolean z) {
        this.a = z;
        return this;
    }

    protected C4850bnf() {
    }

    public C4850bnf(String str, String str2, String str3, String str4, String str5) {
        super("manifestupdated", str, str2, str3, str4, str5);
    }

    public C4850bnf e(long j) {
        super.c(j);
        return this;
    }

    public C4850bnf e(long j, PlaylistTimestamp playlistTimestamp) {
        super.c(j, playlistTimestamp);
        return this;
    }

    public C4850bnf b(String str) {
        if (!TextUtils.isEmpty(str)) {
            a(Logblob.Severity.error);
            this.c = str;
        }
        return this;
    }
}
