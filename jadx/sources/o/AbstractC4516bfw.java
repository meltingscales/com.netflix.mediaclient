package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import o.AbstractC4541bgU;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4516bfw extends AbstractC4541bgU {
    private final String a;
    private final String b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final List<String> j;

    @Override // o.AbstractC4541bgU
    @SerializedName(SignupConstants.Field.LANG_ID)
    public String a() {
        return this.a;
    }

    @Override // o.AbstractC4541bgU
    @SerializedName("interval")
    public int b() {
        return this.c;
    }

    @Override // o.AbstractC4541bgU
    @SerializedName("pixelsAspectX")
    public int c() {
        return this.e;
    }

    @Override // o.AbstractC4541bgU
    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)
    public int d() {
        return this.d;
    }

    @Override // o.AbstractC4541bgU
    @SerializedName("downloadable_id")
    public String e() {
        return this.b;
    }

    @Override // o.AbstractC4541bgU
    @SerializedName("size")
    public int g() {
        return this.h;
    }

    @Override // o.AbstractC4541bgU
    @SerializedName("pixelsAspectY")
    public int h() {
        return this.g;
    }

    @Override // o.AbstractC4541bgU
    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.WIDTH)
    public int i() {
        return this.f;
    }

    @Override // o.AbstractC4541bgU
    @SerializedName("urls")
    public List<String> j() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4516bfw(List<String> list, int i, String str, int i2, int i3, int i4, String str2, int i5, int i6) {
        if (list == null) {
            throw new NullPointerException("Null urls");
        }
        this.j = list;
        this.h = i;
        if (str == null) {
            throw new NullPointerException("Null downloadableId");
        }
        this.b = str;
        this.f = i2;
        this.c = i3;
        this.g = i4;
        if (str2 == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str2;
        this.e = i5;
        this.d = i6;
    }

    public String toString() {
        return "Trickplay{urls=" + this.j + ", size=" + this.h + ", downloadableId=" + this.b + ", width=" + this.f + ", interval=" + this.c + ", pixelsAspectY=" + this.g + ", id=" + this.a + ", pixelsAspectX=" + this.e + ", height=" + this.d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4541bgU) {
            AbstractC4541bgU abstractC4541bgU = (AbstractC4541bgU) obj;
            return this.j.equals(abstractC4541bgU.j()) && this.h == abstractC4541bgU.g() && this.b.equals(abstractC4541bgU.e()) && this.f == abstractC4541bgU.i() && this.c == abstractC4541bgU.b() && this.g == abstractC4541bgU.h() && this.a.equals(abstractC4541bgU.a()) && this.e == abstractC4541bgU.c() && this.d == abstractC4541bgU.d();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.j.hashCode();
        int i = this.h;
        int hashCode2 = this.b.hashCode();
        int i2 = this.f;
        int i3 = this.c;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ this.g) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.d;
    }

    @Override // o.AbstractC4541bgU
    public AbstractC4541bgU.c f() {
        return new c(this);
    }

    /* renamed from: o.bfw$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC4541bgU.c {
        private String a;
        private Integer b;
        private Integer c;
        private String d;
        private Integer e;
        private Integer f;
        private Integer g;
        private Integer h;
        private List<String> i;

        c() {
        }

        private c(AbstractC4541bgU abstractC4541bgU) {
            this.i = abstractC4541bgU.j();
            this.h = Integer.valueOf(abstractC4541bgU.g());
            this.d = abstractC4541bgU.e();
            this.f = Integer.valueOf(abstractC4541bgU.i());
            this.c = Integer.valueOf(abstractC4541bgU.b());
            this.g = Integer.valueOf(abstractC4541bgU.h());
            this.a = abstractC4541bgU.a();
            this.e = Integer.valueOf(abstractC4541bgU.c());
            this.b = Integer.valueOf(abstractC4541bgU.d());
        }

        @Override // o.AbstractC4541bgU.c
        public AbstractC4541bgU.c c(List<String> list) {
            if (list != null) {
                this.i = list;
                return this;
            }
            throw new NullPointerException("Null urls");
        }

        @Override // o.AbstractC4541bgU.c
        public AbstractC4541bgU c() {
            String str = "";
            if (this.i == null) {
                str = " urls";
            }
            if (this.h == null) {
                str = str + " size";
            }
            if (this.d == null) {
                str = str + " downloadableId";
            }
            if (this.f == null) {
                str = str + " width";
            }
            if (this.c == null) {
                str = str + " interval";
            }
            if (this.g == null) {
                str = str + " pixelsAspectY";
            }
            if (this.a == null) {
                str = str + " id";
            }
            if (this.e == null) {
                str = str + " pixelsAspectX";
            }
            if (this.b == null) {
                str = str + " height";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new C4555bgi(this.i, this.h.intValue(), this.d, this.f.intValue(), this.c.intValue(), this.g.intValue(), this.a, this.e.intValue(), this.b.intValue());
        }
    }
}
