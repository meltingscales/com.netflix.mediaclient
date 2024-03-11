package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C4547bga;

/* renamed from: o.bgK  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4531bgK {
    @SerializedName("defaultNext")
    public abstract String a();

    @SerializedName("exitZones")
    public abstract List<List<Long>> b();

    @SerializedName("endTimeMs")
    public abstract long c();

    @SerializedName("earliestSkipRequestOffset")
    public abstract long d();

    @SerializedName("next")
    public abstract Map<String, AbstractC4565bgs> e();

    @SerializedName("startTimeMs")
    public abstract long f();

    @SerializedName("ui")
    public abstract AbstractC4539bgS g();

    @SerializedName("viewableId")
    public abstract Long h();

    @SerializedName("transitionHint")
    public abstract PlaylistMap.TransitionHintType i();

    public static TypeAdapter<AbstractC4531bgK> b(Gson gson) {
        return new C4547bga.d(gson).a(Collections.emptyMap()).e(-1L).b(Collections.emptyList()).b(-1L).c(-1L).b(PlaylistMap.TransitionHintType.unknownTransitionHint);
    }

    public List<List<Long>> j() {
        if (g() != null) {
            return g().e();
        }
        return null;
    }
}
