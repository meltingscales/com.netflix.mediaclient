package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import o.AbstractC4536bgP;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4511bfr extends AbstractC4536bgP {
    private final int b;
    private final int c;
    private final Map<String, List<String>> d;
    private final Map<String, String> e;
    private final String i;
    private final int j;

    @Override // o.AbstractC4536bgP
    @SerializedName("midxSize")
    public int a() {
        return this.c;
    }

    @Override // o.AbstractC4536bgP
    @SerializedName("liveOcaCapabilities")
    public Map<String, List<String>> b() {
        return this.d;
    }

    @Override // o.AbstractC4536bgP
    @SerializedName("downloadUrls")
    public Map<String, String> c() {
        return this.e;
    }

    @Override // o.AbstractC4536bgP
    @SerializedName("representationId")
    public String d() {
        return this.i;
    }

    @Override // o.AbstractC4536bgP
    @SerializedName("midxOffset")
    public int e() {
        return this.b;
    }

    @Override // o.AbstractC4536bgP
    @SerializedName("size")
    public int g() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4511bfr(int i, Map<String, String> map, int i2, int i3, String str, Map<String, List<String>> map2) {
        this.j = i;
        if (map == null) {
            throw new NullPointerException("Null downloadUrls");
        }
        this.e = map;
        this.b = i2;
        this.c = i3;
        this.i = str;
        this.d = map2;
    }

    public String toString() {
        return "SubtitleDownloadable{size=" + this.j + ", downloadUrls=" + this.e + ", midxOffset=" + this.b + ", midxSize=" + this.c + ", representationId=" + this.i + ", liveOcaCapabilities=" + this.d + "}";
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4536bgP) {
            AbstractC4536bgP abstractC4536bgP = (AbstractC4536bgP) obj;
            if (this.j == abstractC4536bgP.g() && this.e.equals(abstractC4536bgP.c()) && this.b == abstractC4536bgP.e() && this.c == abstractC4536bgP.a() && ((str = this.i) != null ? str.equals(abstractC4536bgP.d()) : abstractC4536bgP.d() == null)) {
                Map<String, List<String>> map = this.d;
                if (map == null) {
                    if (abstractC4536bgP.b() == null) {
                        return true;
                    }
                } else if (map.equals(abstractC4536bgP.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.j;
        int hashCode = this.e.hashCode();
        int i2 = this.b;
        int i3 = this.c;
        String str = this.i;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Map<String, List<String>> map = this.d;
        return ((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ hashCode2) * 1000003) ^ (map != null ? map.hashCode() : 0);
    }

    @Override // o.AbstractC4536bgP
    public AbstractC4536bgP.a j() {
        return new c(this);
    }

    /* renamed from: o.bfr$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC4536bgP.a {
        private String a;
        private Map<String, List<String>> b;
        private Map<String, String> c;
        private Integer d;
        private Integer e;
        private Integer j;

        c() {
        }

        private c(AbstractC4536bgP abstractC4536bgP) {
            this.j = Integer.valueOf(abstractC4536bgP.g());
            this.c = abstractC4536bgP.c();
            this.d = Integer.valueOf(abstractC4536bgP.e());
            this.e = Integer.valueOf(abstractC4536bgP.a());
            this.a = abstractC4536bgP.d();
            this.b = abstractC4536bgP.b();
        }

        @Override // o.AbstractC4536bgP.a
        public AbstractC4536bgP.a c(Map<String, String> map) {
            if (map != null) {
                this.c = map;
                return this;
            }
            throw new NullPointerException("Null downloadUrls");
        }

        @Override // o.AbstractC4536bgP.a
        public AbstractC4536bgP c() {
            String str = "";
            if (this.j == null) {
                str = " size";
            }
            if (this.c == null) {
                str = str + " downloadUrls";
            }
            if (this.d == null) {
                str = str + " midxOffset";
            }
            if (this.e == null) {
                str = str + " midxSize";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new C4550bgd(this.j.intValue(), this.c, this.d.intValue(), this.e.intValue(), this.a, this.b);
        }
    }
}
