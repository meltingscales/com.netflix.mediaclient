package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4504bfk extends AbstractC4531bgK {
    private final List<List<Long>> a;
    private final String b;
    private final Map<String, AbstractC4565bgs> c;
    private final long d;
    private final long e;
    private final PlaylistMap.TransitionHintType f;
    private final Long h;
    private final AbstractC4539bgS i;
    private final long j;

    @Override // o.AbstractC4531bgK
    @SerializedName("defaultNext")
    public String a() {
        return this.b;
    }

    @Override // o.AbstractC4531bgK
    @SerializedName("exitZones")
    public List<List<Long>> b() {
        return this.a;
    }

    @Override // o.AbstractC4531bgK
    @SerializedName("endTimeMs")
    public long c() {
        return this.e;
    }

    @Override // o.AbstractC4531bgK
    @SerializedName("earliestSkipRequestOffset")
    public long d() {
        return this.d;
    }

    @Override // o.AbstractC4531bgK
    @SerializedName("next")
    public Map<String, AbstractC4565bgs> e() {
        return this.c;
    }

    @Override // o.AbstractC4531bgK
    @SerializedName("startTimeMs")
    public long f() {
        return this.j;
    }

    @Override // o.AbstractC4531bgK
    @SerializedName("ui")
    public AbstractC4539bgS g() {
        return this.i;
    }

    @Override // o.AbstractC4531bgK
    @SerializedName("viewableId")
    public Long h() {
        return this.h;
    }

    @Override // o.AbstractC4531bgK
    @SerializedName("transitionHint")
    public PlaylistMap.TransitionHintType i() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4504bfk(Long l, long j, long j2, String str, List<List<Long>> list, Map<String, AbstractC4565bgs> map, long j3, PlaylistMap.TransitionHintType transitionHintType, AbstractC4539bgS abstractC4539bgS) {
        this.h = l;
        this.j = j;
        this.e = j2;
        this.b = str;
        if (list == null) {
            throw new NullPointerException("Null exitZones");
        }
        this.a = list;
        if (map == null) {
            throw new NullPointerException("Null next");
        }
        this.c = map;
        this.d = j3;
        if (transitionHintType == null) {
            throw new NullPointerException("Null transitionHint");
        }
        this.f = transitionHintType;
        this.i = abstractC4539bgS;
    }

    public String toString() {
        return "Segment{viewableId=" + this.h + ", startTimeMs=" + this.j + ", endTimeMs=" + this.e + ", defaultNext=" + this.b + ", exitZones=" + this.a + ", next=" + this.c + ", earliestSkipRequestOffset=" + this.d + ", transitionHint=" + this.f + ", uiInfo=" + this.i + "}";
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4531bgK) {
            AbstractC4531bgK abstractC4531bgK = (AbstractC4531bgK) obj;
            Long l = this.h;
            if (l != null ? l.equals(abstractC4531bgK.h()) : abstractC4531bgK.h() == null) {
                if (this.j == abstractC4531bgK.f() && this.e == abstractC4531bgK.c() && ((str = this.b) != null ? str.equals(abstractC4531bgK.a()) : abstractC4531bgK.a() == null) && this.a.equals(abstractC4531bgK.b()) && this.c.equals(abstractC4531bgK.e()) && this.d == abstractC4531bgK.d() && this.f.equals(abstractC4531bgK.i())) {
                    AbstractC4539bgS abstractC4539bgS = this.i;
                    if (abstractC4539bgS == null) {
                        if (abstractC4531bgK.g() == null) {
                            return true;
                        }
                    } else if (abstractC4539bgS.equals(abstractC4531bgK.g())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Long l = this.h;
        int hashCode = l == null ? 0 : l.hashCode();
        long j = this.j;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.e;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.a.hashCode();
        int hashCode4 = this.c.hashCode();
        long j3 = this.d;
        int i3 = (int) (j3 ^ (j3 >>> 32));
        int hashCode5 = this.f.hashCode();
        AbstractC4539bgS abstractC4539bgS = this.i;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i3) * 1000003) ^ hashCode5) * 1000003) ^ (abstractC4539bgS != null ? abstractC4539bgS.hashCode() : 0);
    }
}
