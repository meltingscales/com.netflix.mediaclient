package o;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C4551bge;

/* renamed from: o.bgQ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4537bgQ {

    /* renamed from: o.bgQ$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract e a(Map<String, AbstractC4536bgP> map);

        public abstract e d(Map<String, String> map);

        public abstract AbstractC4537bgQ d();

        public abstract e e(boolean z);
    }

    @SerializedName("cdnlist")
    public abstract List<AbstractC4534bgN> a();

    @SerializedName("encodingProfileNames")
    public abstract List<String> b();

    @SerializedName("downloadableIds")
    public abstract Map<String, String> c();

    /* JADX INFO: Access modifiers changed from: protected */
    @SerializedName("ttDownloadables")
    public abstract Map<String, AbstractC4536bgP> d();

    @SerializedName("canDeviceRender")
    public abstract boolean e();

    @SerializedName(SignupConstants.Field.LANG_ID)
    public abstract String f();

    @SerializedName("hydrated")
    public abstract boolean g();

    @SerializedName("language")
    public abstract String h();

    @SerializedName("isForcedNarrative")
    public abstract boolean i();

    @SerializedName("isNoneTrack")
    public abstract boolean j();

    @SerializedName("rank")
    public abstract int k();

    public abstract e l();

    @SerializedName("new_track_id")
    public abstract String m();

    @SerializedName("trackType")
    public abstract String n();

    @SerializedName("languageDescription")
    public abstract String o();

    @SerializedName("type")
    public abstract String p();

    public static TypeAdapter<AbstractC4537bgQ> c(Gson gson) {
        return new C4551bge.d(gson).d(true).c(Collections.emptyList());
    }

    public Map<String, AbstractC4536bgP> t() {
        return g() ? d() : q();
    }

    public Map<String, String> s() {
        return g() ? c() : r();
    }

    private Map<String, String> r() {
        HashMap newHashMap = Maps.newHashMap();
        for (String str : b()) {
            newHashMap.put(str, "dummy");
        }
        return newHashMap;
    }

    public Map<String, AbstractC4536bgP> q() {
        HashMap newHashMap = Maps.newHashMap();
        for (String str : b()) {
            newHashMap.put(str, AbstractC4536bgP.a);
        }
        return newHashMap;
    }
}
