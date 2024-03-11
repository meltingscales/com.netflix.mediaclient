package com.netflix.mediaclient.service.player.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import o.AbstractC4529bgI;
import o.C4488bfU;

/* loaded from: classes.dex */
public abstract class LiveMetadata {

    /* loaded from: classes.dex */
    public enum StreamingType {
        LIVE,
        VOD
    }

    @SerializedName("eventStartTime")
    public abstract String a();

    @SerializedName("disableLiveUi")
    public abstract boolean b();

    @SerializedName("eventAvailabilityOffsetMs")
    public abstract long c();

    @SerializedName("eventEndTime")
    public abstract String d();

    @SerializedName("downloadableIdToSegmentTemplateId")
    public abstract Map<String, String> e();

    @SerializedName("ocLiveWindowDurationSeconds")
    public abstract int g();

    @SerializedName("segmentTemplateIdToSegmentTemplate")
    public abstract Map<String, AbstractC4529bgI> h();

    @SerializedName("streamingType")
    public abstract StreamingType i();

    public static TypeAdapter<LiveMetadata> a(Gson gson) {
        return new C4488bfU.a(gson).a(StreamingType.LIVE);
    }

    public AbstractC4529bgI a(String str) {
        return h().get(e().get(str));
    }

    public boolean o() {
        return f() && j();
    }

    public boolean f() {
        return (a() == null || a().isEmpty()) ? false : true;
    }

    public boolean j() {
        return (d() == null || d().isEmpty()) ? false : true;
    }
}
