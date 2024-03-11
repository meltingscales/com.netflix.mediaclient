package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import o.C4831bnM;

/* loaded from: classes3.dex */
public class StartPlayEventJson extends BaseEventJson {
    @SerializedName("eventlist")
    public Map<String, Long> a;
    @SerializedName("reason")
    protected Reason c;
    @SerializedName("groupname")
    protected String e;

    /* loaded from: classes3.dex */
    public enum Reason {
        START,
        REPOS,
        REBUFFER,
        SKIP
    }

    public StartPlayEventJson a(Reason reason) {
        this.c = reason;
        return this;
    }

    protected StartPlayEventJson() {
    }

    public StartPlayEventJson(String str, String str2, String str3, String str4, String str5) {
        super("startplayevents", str, str2, str3, str4, str5);
    }

    public StartPlayEventJson a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "control";
        }
        this.e = str;
        return this;
    }

    public StartPlayEventJson e(long j) {
        c(j);
        return this;
    }

    public StartPlayEventJson b(Map<String, Event> map, C4831bnM c4831bnM) {
        this.a = new HashMap(map.size());
        for (Map.Entry<String, Event> entry : map.entrySet()) {
            this.a.put(entry.getKey(), Long.valueOf(entry.getValue().b(c4831bnM).f13224o));
        }
        return this;
    }
}
