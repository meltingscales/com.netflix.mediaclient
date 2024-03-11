package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4500bfg extends LiveMetadata {
    private final Map<String, String> a;
    private final String b;
    private final boolean c;
    private final long d;
    private final String e;
    private final Map<String, AbstractC4529bgI> f;
    private final int g;
    private final LiveMetadata.StreamingType i;

    @Override // com.netflix.mediaclient.service.player.manifest.LiveMetadata
    @SerializedName("eventStartTime")
    public String a() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.service.player.manifest.LiveMetadata
    @SerializedName("disableLiveUi")
    public boolean b() {
        return this.c;
    }

    @Override // com.netflix.mediaclient.service.player.manifest.LiveMetadata
    @SerializedName("eventAvailabilityOffsetMs")
    public long c() {
        return this.d;
    }

    @Override // com.netflix.mediaclient.service.player.manifest.LiveMetadata
    @SerializedName("eventEndTime")
    public String d() {
        return this.e;
    }

    @Override // com.netflix.mediaclient.service.player.manifest.LiveMetadata
    @SerializedName("downloadableIdToSegmentTemplateId")
    public Map<String, String> e() {
        return this.a;
    }

    @Override // com.netflix.mediaclient.service.player.manifest.LiveMetadata
    @SerializedName("ocLiveWindowDurationSeconds")
    public int g() {
        return this.g;
    }

    @Override // com.netflix.mediaclient.service.player.manifest.LiveMetadata
    @SerializedName("segmentTemplateIdToSegmentTemplate")
    public Map<String, AbstractC4529bgI> h() {
        return this.f;
    }

    @Override // com.netflix.mediaclient.service.player.manifest.LiveMetadata
    @SerializedName("streamingType")
    public LiveMetadata.StreamingType i() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4500bfg(Map<String, AbstractC4529bgI> map, Map<String, String> map2, int i, String str, String str2, LiveMetadata.StreamingType streamingType, long j, boolean z) {
        if (map == null) {
            throw new NullPointerException("Null segmentTemplateIdToSegmentTemplate");
        }
        this.f = map;
        if (map2 == null) {
            throw new NullPointerException("Null downloadableIdToSegmentTemplateId");
        }
        this.a = map2;
        this.g = i;
        this.b = str;
        this.e = str2;
        if (streamingType == null) {
            throw new NullPointerException("Null streamingType");
        }
        this.i = streamingType;
        this.d = j;
        this.c = z;
    }

    public String toString() {
        return "LiveMetadata{segmentTemplateIdToSegmentTemplate=" + this.f + ", downloadableIdToSegmentTemplateId=" + this.a + ", ocLiveWindowDurationSeconds=" + this.g + ", eventStartTime=" + this.b + ", eventEndTime=" + this.e + ", streamingType=" + this.i + ", eventAvailabilityOffsetMs=" + this.d + ", disableLiveUi=" + this.c + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LiveMetadata) {
            LiveMetadata liveMetadata = (LiveMetadata) obj;
            return this.f.equals(liveMetadata.h()) && this.a.equals(liveMetadata.e()) && this.g == liveMetadata.g() && ((str = this.b) != null ? str.equals(liveMetadata.a()) : liveMetadata.a() == null) && ((str2 = this.e) != null ? str2.equals(liveMetadata.d()) : liveMetadata.d() == null) && this.i.equals(liveMetadata.i()) && this.d == liveMetadata.c() && this.c == liveMetadata.b();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f.hashCode();
        int hashCode2 = this.a.hashCode();
        int i = this.g;
        String str = this.b;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.e;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        int hashCode5 = this.i.hashCode();
        long j = this.d;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (this.c ? 1231 : 1237);
    }
}
