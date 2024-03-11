package o;

import com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsPage;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class cPM implements InterfaceC8888fH {
    private final Integer a;
    private final boolean b;
    private final ProfileViewingRestrictionsPage c;
    private final List<Pair<Integer, String>> d;
    private final boolean e;
    private final boolean g;

    public static /* synthetic */ cPM copy$default(cPM cpm, ProfileViewingRestrictionsPage profileViewingRestrictionsPage, List list, Integer num, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            profileViewingRestrictionsPage = cpm.c;
        }
        List<Pair<Integer, String>> list2 = list;
        if ((i & 2) != 0) {
            list2 = cpm.d;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            num = cpm.a;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            z = cpm.b;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = cpm.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = cpm.g;
        }
        return cpm.c(profileViewingRestrictionsPage, list3, num2, z4, z5, z3);
    }

    public final boolean a() {
        return this.g;
    }

    public final ProfileViewingRestrictionsPage b() {
        return this.c;
    }

    public final cPM c(ProfileViewingRestrictionsPage profileViewingRestrictionsPage, List<Pair<Integer, String>> list, Integer num, boolean z, boolean z2, boolean z3) {
        C8632dsu.c((Object) profileViewingRestrictionsPage, "");
        C8632dsu.c((Object) list, "");
        return new cPM(profileViewingRestrictionsPage, list, num, z, z2, z3);
    }

    public final boolean c() {
        return this.e;
    }

    public final ProfileViewingRestrictionsPage component1() {
        return this.c;
    }

    public final List<Pair<Integer, String>> component2() {
        return this.d;
    }

    public final Integer component3() {
        return this.a;
    }

    public final boolean component4() {
        return this.b;
    }

    public final boolean component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.g;
    }

    public final List<Pair<Integer, String>> d() {
        return this.d;
    }

    public final Integer e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cPM) {
            cPM cpm = (cPM) obj;
            return this.c == cpm.c && C8632dsu.c(this.d, cpm.d) && C8632dsu.c(this.a, cpm.a) && this.b == cpm.b && this.e == cpm.e && this.g == cpm.g;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.d.hashCode();
        Integer num = this.a;
        return (((((((((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.g);
    }

    public String toString() {
        ProfileViewingRestrictionsPage profileViewingRestrictionsPage = this.c;
        List<Pair<Integer, String>> list = this.d;
        Integer num = this.a;
        boolean z = this.b;
        boolean z2 = this.e;
        boolean z3 = this.g;
        return "ViewingRestrictionsState(currentPage=" + profileViewingRestrictionsPage + ", maturityRatings=" + list + ", maturityLevel=" + num + ", isKidsProfile=" + z + ", isPrimaryProfile=" + z2 + ", userOptedInForKids=" + z3 + ")";
    }

    public cPM(ProfileViewingRestrictionsPage profileViewingRestrictionsPage, List<Pair<Integer, String>> list, Integer num, boolean z, boolean z2, boolean z3) {
        C8632dsu.c((Object) profileViewingRestrictionsPage, "");
        C8632dsu.c((Object) list, "");
        this.c = profileViewingRestrictionsPage;
        this.d = list;
        this.a = num;
        this.b = z;
        this.e = z2;
        this.g = z3;
    }
}
