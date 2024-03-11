package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.AbstractC4537bgQ;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4514bfu extends AbstractC4537bgQ {
    private final List<String> a;
    private final Map<String, String> b;
    private final boolean c;
    private final List<AbstractC4534bgN> d;
    private final Map<String, AbstractC4536bgP> e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final int m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13588o;

    @Override // o.AbstractC4537bgQ
    @SerializedName("cdnlist")
    public List<AbstractC4534bgN> a() {
        return this.d;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("encodingProfileNames")
    public List<String> b() {
        return this.a;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("downloadableIds")
    public Map<String, String> c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC4537bgQ
    @SerializedName("ttDownloadables")
    public Map<String, AbstractC4536bgP> d() {
        return this.e;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("canDeviceRender")
    public boolean e() {
        return this.c;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName(SignupConstants.Field.LANG_ID)
    public String f() {
        return this.i;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("hydrated")
    public boolean g() {
        return this.g;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("language")
    public String h() {
        return this.j;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("isForcedNarrative")
    public boolean i() {
        return this.h;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("isNoneTrack")
    public boolean j() {
        return this.f;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("rank")
    public int k() {
        return this.m;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("new_track_id")
    public String m() {
        return this.n;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("trackType")
    public String n() {
        return this.l;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("languageDescription")
    public String o() {
        return this.f13588o;
    }

    @Override // o.AbstractC4537bgQ
    @SerializedName("type")
    public String p() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4514bfu(List<String> list, Map<String, AbstractC4536bgP> map, List<AbstractC4534bgN> list2, String str, boolean z, String str2, String str3, boolean z2, Map<String, String> map2, String str4, String str5, String str6, boolean z3, boolean z4, int i) {
        if (list == null) {
            throw new NullPointerException("Null encodingProfileNames");
        }
        this.a = list;
        if (map == null) {
            throw new NullPointerException("Null _ttDownloadables");
        }
        this.e = map;
        if (list2 == null) {
            throw new NullPointerException("Null cdnlist");
        }
        this.d = list2;
        if (str == null) {
            throw new NullPointerException("Null trackType");
        }
        this.l = str;
        this.h = z;
        this.f13588o = str2;
        this.j = str3;
        this.f = z2;
        if (map2 == null) {
            throw new NullPointerException("Null _downloadableIds");
        }
        this.b = map2;
        if (str4 == null) {
            throw new NullPointerException("Null id");
        }
        this.i = str4;
        if (str5 == null) {
            throw new NullPointerException("Null type");
        }
        this.k = str5;
        if (str6 == null) {
            throw new NullPointerException("Null newTrackId");
        }
        this.n = str6;
        this.c = z3;
        this.g = z4;
        this.m = i;
    }

    public String toString() {
        return "TimedTextTrack{encodingProfileNames=" + this.a + ", _ttDownloadables=" + this.e + ", cdnlist=" + this.d + ", trackType=" + this.l + ", isForcedNarrative=" + this.h + ", languageDescription=" + this.f13588o + ", language=" + this.j + ", isNoneTrack=" + this.f + ", _downloadableIds=" + this.b + ", id=" + this.i + ", type=" + this.k + ", newTrackId=" + this.n + ", canDeviceRender=" + this.c + ", isHydrated=" + this.g + ", rank=" + this.m + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4537bgQ) {
            AbstractC4537bgQ abstractC4537bgQ = (AbstractC4537bgQ) obj;
            return this.a.equals(abstractC4537bgQ.b()) && this.e.equals(abstractC4537bgQ.d()) && this.d.equals(abstractC4537bgQ.a()) && this.l.equals(abstractC4537bgQ.n()) && this.h == abstractC4537bgQ.i() && ((str = this.f13588o) != null ? str.equals(abstractC4537bgQ.o()) : abstractC4537bgQ.o() == null) && ((str2 = this.j) != null ? str2.equals(abstractC4537bgQ.h()) : abstractC4537bgQ.h() == null) && this.f == abstractC4537bgQ.j() && this.b.equals(abstractC4537bgQ.c()) && this.i.equals(abstractC4537bgQ.f()) && this.k.equals(abstractC4537bgQ.p()) && this.n.equals(abstractC4537bgQ.m()) && this.c == abstractC4537bgQ.e() && this.g == abstractC4537bgQ.g() && this.m == abstractC4537bgQ.k();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.e.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.l.hashCode();
        int i = this.h ? 1231 : 1237;
        String str = this.f13588o;
        int hashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.j;
        int hashCode6 = str2 != null ? str2.hashCode() : 0;
        int i2 = this.f ? 1231 : 1237;
        int hashCode7 = this.b.hashCode();
        int hashCode8 = this.i.hashCode();
        int hashCode9 = this.k.hashCode();
        int hashCode10 = this.n.hashCode();
        return ((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ i2) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ this.m;
    }

    @Override // o.AbstractC4537bgQ
    public AbstractC4537bgQ.e l() {
        return new d(this);
    }

    /* renamed from: o.bfu$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC4537bgQ.e {
        private Map<String, String> a;
        private Boolean b;
        private Map<String, AbstractC4536bgP> c;
        private List<AbstractC4534bgN> d;
        private List<String> e;
        private Boolean f;
        private String g;
        private Boolean h;
        private String i;
        private Boolean j;
        private String k;
        private Integer l;
        private String m;
        private String n;

        /* renamed from: o  reason: collision with root package name */
        private String f13589o;

        d() {
        }

        private d(AbstractC4537bgQ abstractC4537bgQ) {
            this.e = abstractC4537bgQ.b();
            this.c = abstractC4537bgQ.d();
            this.d = abstractC4537bgQ.a();
            this.f13589o = abstractC4537bgQ.n();
            this.j = Boolean.valueOf(abstractC4537bgQ.i());
            this.k = abstractC4537bgQ.o();
            this.i = abstractC4537bgQ.h();
            this.h = Boolean.valueOf(abstractC4537bgQ.j());
            this.a = abstractC4537bgQ.c();
            this.g = abstractC4537bgQ.f();
            this.n = abstractC4537bgQ.p();
            this.m = abstractC4537bgQ.m();
            this.b = Boolean.valueOf(abstractC4537bgQ.e());
            this.f = Boolean.valueOf(abstractC4537bgQ.g());
            this.l = Integer.valueOf(abstractC4537bgQ.k());
        }

        @Override // o.AbstractC4537bgQ.e
        public AbstractC4537bgQ.e a(Map<String, AbstractC4536bgP> map) {
            if (map != null) {
                this.c = map;
                return this;
            }
            throw new NullPointerException("Null _ttDownloadables");
        }

        @Override // o.AbstractC4537bgQ.e
        public AbstractC4537bgQ.e e(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        @Override // o.AbstractC4537bgQ.e
        public AbstractC4537bgQ.e d(Map<String, String> map) {
            if (map != null) {
                this.a = map;
                return this;
            }
            throw new NullPointerException("Null _downloadableIds");
        }

        @Override // o.AbstractC4537bgQ.e
        public AbstractC4537bgQ d() {
            String str = "";
            if (this.e == null) {
                str = " encodingProfileNames";
            }
            if (this.c == null) {
                str = str + " _ttDownloadables";
            }
            if (this.d == null) {
                str = str + " cdnlist";
            }
            if (this.f13589o == null) {
                str = str + " trackType";
            }
            if (this.j == null) {
                str = str + " isForcedNarrative";
            }
            if (this.h == null) {
                str = str + " isNoneTrack";
            }
            if (this.a == null) {
                str = str + " _downloadableIds";
            }
            if (this.g == null) {
                str = str + " id";
            }
            if (this.n == null) {
                str = str + " type";
            }
            if (this.m == null) {
                str = str + " newTrackId";
            }
            if (this.b == null) {
                str = str + " canDeviceRender";
            }
            if (this.f == null) {
                str = str + " isHydrated";
            }
            if (this.l == null) {
                str = str + " rank";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new C4551bge(this.e, this.c, this.d, this.f13589o, this.j.booleanValue(), this.k, this.i, this.h.booleanValue(), this.a, this.g, this.n, this.m, this.b.booleanValue(), this.f.booleanValue(), this.l.intValue());
        }
    }
}
