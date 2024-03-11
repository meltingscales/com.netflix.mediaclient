package o;

import android.graphics.PointF;
import com.netflix.mediaclient.ui.nux.impl.NewUserExperienceCtaType;
import kotlin.Pair;

/* renamed from: o.crj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7201crj {
    private final boolean a;
    private final String b;
    private final Pair<NewUserExperienceCtaType, String> c;
    private final String d;
    private final Pair<NewUserExperienceCtaType, String> e;
    private final PointF g;
    private final String h;
    private final Integer j;

    public final boolean a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final Pair<NewUserExperienceCtaType, String> c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final Pair<NewUserExperienceCtaType, String> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7201crj) {
            C7201crj c7201crj = (C7201crj) obj;
            return C8632dsu.c((Object) this.h, (Object) c7201crj.h) && C8632dsu.c((Object) this.d, (Object) c7201crj.d) && C8632dsu.c(this.e, c7201crj.e) && C8632dsu.c(this.c, c7201crj.c) && C8632dsu.c(this.j, c7201crj.j) && C8632dsu.c(this.g, c7201crj.g) && this.a == c7201crj.a && C8632dsu.c((Object) this.b, (Object) c7201crj.b);
        }
        return false;
    }

    public final String f() {
        return this.h;
    }

    public final PointF h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.h;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.c.hashCode();
        Integer num = this.j;
        int hashCode5 = num == null ? 0 : num.hashCode();
        int hashCode6 = this.g.hashCode();
        int hashCode7 = Boolean.hashCode(this.a);
        String str3 = this.b;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final Integer j() {
        return this.j;
    }

    public String toString() {
        String str = this.h;
        String str2 = this.d;
        Pair<NewUserExperienceCtaType, String> pair = this.e;
        Pair<NewUserExperienceCtaType, String> pair2 = this.c;
        Integer num = this.j;
        PointF pointF = this.g;
        boolean z = this.a;
        String str3 = this.b;
        return "NewUserExperienceItem(title=" + str + ", description=" + str2 + ", primaryCtaPair=" + pair + ", secondaryCtaPair=" + pair2 + ", viewLocation=" + num + ", viewOffset=" + pointF + ", hasIcon=" + z + ", iconAssetName=" + str3 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7201crj(String str, String str2, Pair<? extends NewUserExperienceCtaType, String> pair, Pair<? extends NewUserExperienceCtaType, String> pair2, Integer num, PointF pointF, boolean z, String str3) {
        C8632dsu.c((Object) pair, "");
        C8632dsu.c((Object) pair2, "");
        C8632dsu.c((Object) pointF, "");
        this.h = str;
        this.d = str2;
        this.e = pair;
        this.c = pair2;
        this.j = num;
        this.g = pointF;
        this.a = z;
        this.b = str3;
    }

    public /* synthetic */ C7201crj(String str, String str2, Pair pair, Pair pair2, Integer num, PointF pointF, boolean z, String str3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, pair, pair2, num, pointF, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str3);
    }
}
