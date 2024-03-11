package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import o.C4486bfS;

/* renamed from: o.bgs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4565bgs {
    @SerializedName("transitionHint")
    public abstract PlaylistMap.TransitionHintType a();

    @SerializedName("earliestSkipRequestOffset")
    public abstract long b();

    @SerializedName("weight")
    public abstract int e();

    public static TypeAdapter<AbstractC4565bgs> a(Gson gson) {
        return new C4486bfS.c(gson).e(-1L).e(PlaylistMap.TransitionHintType.unknownTransitionHint);
    }
}
