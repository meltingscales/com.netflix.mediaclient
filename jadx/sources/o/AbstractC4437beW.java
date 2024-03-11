package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.media.manifest.Stream;
import java.util.List;
import o.AbstractC4472bfE;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.beW  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4437beW extends AbstractC4472bfE {
    private final List<Stream> a;
    private final String b;
    private final String c;
    private final String d;
    private final List<Integer> e;
    private final String f;
    private final String g;
    private final List<String> h;
    private final boolean i;
    private final boolean j;
    private final String k;
    private final int l;
    private final boolean m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13577o;
    private final String r;
    private final String s;

    @Override // o.AbstractC4472bfE
    @SerializedName("bitrates")
    public List<Integer> a() {
        return this.e;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("codecName")
    public String b() {
        return this.b;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("defaultTimedText")
    public String c() {
        return this.d;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("streams")
    public List<Stream> d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC4472bfE
    @SerializedName("channels")
    public String e() {
        return this.c;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName(SignupConstants.Field.LANG_ID)
    public String f() {
        return this.g;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("hydrated")
    public boolean g() {
        return this.i;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("language")
    public String h() {
        return this.f;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("isNative")
    public boolean i() {
        return this.j;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("disallowedSubtitleTracks")
    public List<String> j() {
        return this.h;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("rank")
    public int k() {
        return this.l;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("profile")
    public String l() {
        return this.n;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("offTrackDisallowed")
    public boolean m() {
        return this.m;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("new_track_id")
    public String n() {
        return this.k;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("languageDescription")
    public String o() {
        return this.f13577o;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("trackType")
    public String p() {
        return this.r;
    }

    @Override // o.AbstractC4472bfE
    @SerializedName("track_id")
    public String r() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4437beW(List<String> list, String str, boolean z, String str2, String str3, String str4, List<Stream> list2, String str5, String str6, String str7, boolean z2, boolean z3, int i, String str8, List<Integer> list3, String str9, String str10) {
        if (list == null) {
            throw new NullPointerException("Null disallowedSubtitleTracks");
        }
        this.h = list;
        if (str == null) {
            throw new NullPointerException("Null language");
        }
        this.f = str;
        this.j = z;
        if (str2 == null) {
            throw new NullPointerException("Null languageDescription");
        }
        this.f13577o = str2;
        if (str3 == null) {
            throw new NullPointerException("Null id");
        }
        this.g = str3;
        this.d = str4;
        if (list2 == null) {
            throw new NullPointerException("Null _streams");
        }
        this.a = list2;
        if (str5 == null) {
            throw new NullPointerException("Null trackType");
        }
        this.r = str5;
        if (str6 == null) {
            throw new NullPointerException("Null trackId");
        }
        this.s = str6;
        if (str7 == null) {
            throw new NullPointerException("Null newTrackId");
        }
        this.k = str7;
        this.m = z2;
        this.i = z3;
        this.l = i;
        if (str8 == null) {
            throw new NullPointerException("Null _channels");
        }
        this.c = str8;
        this.e = list3;
        this.b = str9;
        this.n = str10;
    }

    public String toString() {
        return "AudioTrack{disallowedSubtitleTracks=" + this.h + ", language=" + this.f + ", isNative=" + this.j + ", languageDescription=" + this.f13577o + ", id=" + this.g + ", defaultTimedText=" + this.d + ", _streams=" + this.a + ", trackType=" + this.r + ", trackId=" + this.s + ", newTrackId=" + this.k + ", offTrackDisallowed=" + this.m + ", isHydrated=" + this.i + ", rank=" + this.l + ", _channels=" + this.c + ", bitrates=" + this.e + ", codecName=" + this.b + ", profile=" + this.n + "}";
    }

    public boolean equals(Object obj) {
        String str;
        List<Integer> list;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4472bfE) {
            AbstractC4472bfE abstractC4472bfE = (AbstractC4472bfE) obj;
            if (this.h.equals(abstractC4472bfE.j()) && this.f.equals(abstractC4472bfE.h()) && this.j == abstractC4472bfE.i() && this.f13577o.equals(abstractC4472bfE.o()) && this.g.equals(abstractC4472bfE.f()) && ((str = this.d) != null ? str.equals(abstractC4472bfE.c()) : abstractC4472bfE.c() == null) && this.a.equals(abstractC4472bfE.d()) && this.r.equals(abstractC4472bfE.p()) && this.s.equals(abstractC4472bfE.r()) && this.k.equals(abstractC4472bfE.n()) && this.m == abstractC4472bfE.m() && this.i == abstractC4472bfE.g() && this.l == abstractC4472bfE.k() && this.c.equals(abstractC4472bfE.e()) && ((list = this.e) != null ? list.equals(abstractC4472bfE.a()) : abstractC4472bfE.a() == null) && ((str2 = this.b) != null ? str2.equals(abstractC4472bfE.b()) : abstractC4472bfE.b() == null)) {
                String str3 = this.n;
                if (str3 == null) {
                    if (abstractC4472bfE.l() == null) {
                        return true;
                    }
                } else if (str3.equals(abstractC4472bfE.l())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.h.hashCode();
        int hashCode2 = this.f.hashCode();
        int i = this.j ? 1231 : 1237;
        int hashCode3 = this.f13577o.hashCode();
        int hashCode4 = this.g.hashCode();
        String str = this.d;
        int hashCode5 = str == null ? 0 : str.hashCode();
        int hashCode6 = this.a.hashCode();
        int hashCode7 = this.r.hashCode();
        int hashCode8 = this.s.hashCode();
        int hashCode9 = this.k.hashCode();
        int i2 = this.m ? 1231 : 1237;
        int i3 = this.i ? 1231 : 1237;
        int i4 = this.l;
        int hashCode10 = this.c.hashCode();
        List<Integer> list = this.e;
        int hashCode11 = list == null ? 0 : list.hashCode();
        String str2 = this.b;
        int hashCode12 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.n;
        return ((((((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ (str3 == null ? 0 : str3.hashCode());
    }

    @Override // o.AbstractC4472bfE
    public AbstractC4472bfE.d t() {
        return new d(this);
    }

    /* renamed from: o.beW$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC4472bfE.d {
        private String a;
        private List<Integer> b;
        private String c;
        private List<Stream> d;
        private String e;
        private Boolean f;
        private String g;
        private Boolean h;
        private List<String> i;
        private String j;
        private Boolean k;
        private String l;
        private String m;
        private String n;

        /* renamed from: o  reason: collision with root package name */
        private Integer f13578o;
        private String p;
        private String q;

        d() {
        }

        private d(AbstractC4472bfE abstractC4472bfE) {
            this.i = abstractC4472bfE.j();
            this.j = abstractC4472bfE.h();
            this.f = Boolean.valueOf(abstractC4472bfE.i());
            this.l = abstractC4472bfE.o();
            this.g = abstractC4472bfE.f();
            this.a = abstractC4472bfE.c();
            this.d = abstractC4472bfE.d();
            this.q = abstractC4472bfE.p();
            this.p = abstractC4472bfE.r();
            this.n = abstractC4472bfE.n();
            this.k = Boolean.valueOf(abstractC4472bfE.m());
            this.h = Boolean.valueOf(abstractC4472bfE.g());
            this.f13578o = Integer.valueOf(abstractC4472bfE.k());
            this.e = abstractC4472bfE.e();
            this.b = abstractC4472bfE.a();
            this.c = abstractC4472bfE.b();
            this.m = abstractC4472bfE.l();
        }

        @Override // o.AbstractC4472bfE.d
        public AbstractC4472bfE.d c(List<Stream> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null _streams");
        }

        @Override // o.AbstractC4472bfE.d
        public AbstractC4472bfE e() {
            String str = "";
            if (this.i == null) {
                str = " disallowedSubtitleTracks";
            }
            if (this.j == null) {
                str = str + " language";
            }
            if (this.f == null) {
                str = str + " isNative";
            }
            if (this.l == null) {
                str = str + " languageDescription";
            }
            if (this.g == null) {
                str = str + " id";
            }
            if (this.d == null) {
                str = str + " _streams";
            }
            if (this.q == null) {
                str = str + " trackType";
            }
            if (this.p == null) {
                str = str + " trackId";
            }
            if (this.n == null) {
                str = str + " newTrackId";
            }
            if (this.k == null) {
                str = str + " offTrackDisallowed";
            }
            if (this.h == null) {
                str = str + " isHydrated";
            }
            if (this.f13578o == null) {
                str = str + " rank";
            }
            if (this.e == null) {
                str = str + " _channels";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new C4478bfK(this.i, this.j, this.f.booleanValue(), this.l, this.g, this.a, this.d, this.q, this.p, this.n, this.k.booleanValue(), this.h.booleanValue(), this.f13578o.intValue(), this.e, this.b, this.c, this.m);
        }
    }
}
