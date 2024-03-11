package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: o.Jb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0956Jb {
    public static final InterfaceC1242Ud b;
    public static final InterfaceC1242Ud c;
    public static final InterfaceC1242Ud d;
    private static final InterfaceC1242Ud e;
    private static final List<InterfaceC1242Ud> a = IE.c("summary", "detail", "inRemindMeQueue", "bookmark", "offlineAvailable", "synopsisDP");
    private static final List<InterfaceC1242Ud> f = IE.c("summary", "detail", "inRemindMeQueue", "timeCodes", "bookmark", "offlineAvailable", "synopsisDP");

    public static List<InterfaceC1242Ud> a() {
        return a;
    }

    public static List<InterfaceC1242Ud> h() {
        return f;
    }

    static {
        InterfaceC1242Ud b2 = IE.b("episodes", "current", IE.c("summary", "detail", "bookmark", "offlineAvailable", "synopsisDP"));
        c = b2;
        b = IE.b("episodes", "current", IE.c("summary", "detail", "bookmark", "offlineAvailable", "synopsisDP"));
        d = b2;
        e = IE.b("tallPanelArt");
    }

    public static String c(String str) {
        if (C8168dfL.a(str, 10)) {
            return "genre-" + str;
        }
        return str;
    }

    public static void e(List<InterfaceC1242Ud> list, InterfaceC1242Ud interfaceC1242Ud, int i, int i2, boolean z, boolean z2) {
        InterfaceC1242Ud c2 = interfaceC1242Ud.c(IE.a(i, i2)).c("listItem");
        list.add(e(z, z2).b(c2));
        list.add(c.b(c2));
    }

    public static void e(List<InterfaceC1242Ud> list, InterfaceC1242Ud interfaceC1242Ud, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("summary");
        }
        arrayList.add("topTenBoxart");
        list.add(interfaceC1242Ud.c(IE.a(i, i2)).c("listItem").c(arrayList));
    }

    public static void e(List<InterfaceC1242Ud> list, InterfaceC1242Ud interfaceC1242Ud, int i, int i2) {
        InterfaceC1242Ud c2 = interfaceC1242Ud.c(IE.a(i, i2)).c("listItem");
        list.add(c2);
        list.add(e.b(c2));
    }

    public static InterfaceC1242Ud e(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("summary");
        }
        if (z2) {
            arrayList.add("volatileBitmaskedDetails");
        }
        arrayList.addAll(IE.c("detail", "rating", "inQueue", "bookmark", "offlineAvailable", "synopsisDP"));
        return IE.b(arrayList);
    }

    public static InterfaceC1242Ud d(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("summary");
        }
        arrayList.addAll(IE.c("detail", "rating", "inQueue", "bookmark", "offlineAvailable", "synopsisDP"));
        return IE.b(arrayList);
    }

    public static void d(List<InterfaceC1242Ud> list, InterfaceC1242Ud interfaceC1242Ud, int i, int i2, boolean z) {
        list.add(interfaceC1242Ud.d(a(IE.a(i, i2), d(z))));
        list.add(interfaceC1242Ud.d(a(IE.a(i, i2), d)));
        list.add(interfaceC1242Ud.d(c(IE.a(i, i2))));
    }

    public static InterfaceC1242Ud c(Map<?, ?> map) {
        return IE.b("billboardData", map, "billboardSummary");
    }

    public static InterfaceC1242Ud a(Map<?, ?> map, InterfaceC1242Ud interfaceC1242Ud) {
        return IE.b("videoEvidence", map).d(interfaceC1242Ud);
    }

    public static InterfaceC1242Ud b(String str, String str2, String str3, String str4) {
        if (C8168dfL.h(str2)) {
            return IE.b("lists", str2);
        }
        if (C8168dfL.h(str3)) {
            return IE.b("lolomos", str3, str);
        }
        if (C8168dfL.h(str4)) {
            return IE.b("topCategories", c(str4), str);
        }
        return IE.b("lolomo", str);
    }

    public static InterfaceC1242Ud c(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("summary");
        if (z) {
            arrayList.add("volatileBitmaskedDetails");
        }
        return IE.b(SignupConstants.Field.VIDEOS, str, "similars", IE.a(11), arrayList);
    }

    public static InterfaceC1242Ud a(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("summary");
        if (z) {
            arrayList.add("volatileBitmaskedDetails");
        }
        return IE.b(SignupConstants.Field.VIDEOS, list, "similars", IE.a(11), arrayList);
    }

    public static InterfaceC1242Ud a(List<String> list) {
        return IE.b(SignupConstants.Field.VIDEOS, list, "similars", "summary");
    }

    public static InterfaceC1242Ud d(String str) {
        return IE.b(SignupConstants.Field.VIDEOS, str, "trailers", IE.a(24), IE.c("summary", "detail"));
    }

    public static InterfaceC1242Ud c(List<String> list) {
        return IE.b(SignupConstants.Field.VIDEOS, list, "trailers", IE.a(24), IE.c("summary", "detail"));
    }

    public static InterfaceC1242Ud b(List<String> list) {
        return IE.b(SignupConstants.Field.VIDEOS, list, "trailers", "summary");
    }

    public static InterfaceC1242Ud e(String str, String str2, String str3) {
        return IE.b(str, str2, "scenes", str3, "summary");
    }

    public static InterfaceC1242Ud a(String str) {
        return IE.b("characters", str, "gallery", IE.a(100), "summary");
    }

    public static void a(List<InterfaceC1242Ud> list, List<String> list2, boolean z) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.addAll(Arrays.asList("summary", "detail", "timeCodes", "rating", "inQueue", "hasWatched", "bookmark", "offlineAvailable", "defaultTrailer", "advisories", "synopsisDP"));
        list.add(IE.b(SignupConstants.Field.VIDEOS, list2, arrayList));
        list.add(a(list2, z));
        list.add(a(list2));
        list.add(c(list2));
        list.add(b(list2));
        list.add(IE.b(SignupConstants.Field.VIDEOS, list2, "titleGroups", "summary"));
        list.add(c(list2, 0, 11));
        list.add(IE.b(SignupConstants.Field.VIDEOS, list2, "taglineMessages"));
    }

    public static InterfaceC1242Ud c(List<String> list, int i, int i2) {
        return IE.b(SignupConstants.Field.VIDEOS, list, "titleGroups", IE.a(i, i2), "summary");
    }

    public static InterfaceC1242Ud e(List<String> list) {
        return IE.b(SignupConstants.Field.VIDEOS, list, "seasons", IE.a(39), "detail");
    }

    public static void d(List<InterfaceC1242Ud> list, String str, boolean z) {
        if (z) {
            list.add(IE.b(SignupConstants.Field.VIDEOS, str, IE.c("detail", "inQueue", "rating", "bookmark", "maturityRatingInfo")));
        } else {
            list.add(IE.b(SignupConstants.Field.VIDEOS, str, IE.c("detail", "inQueue", "inRemindMeQueue", "rating", "maturityRatingInfo", "synopsisDP")));
            list.add(IE.b(SignupConstants.Field.VIDEOS, str, "seasons", "summary"));
            list.add(IE.b(SignupConstants.Field.VIDEOS, str, "episodes", "current", IE.c("summary", "detail", "bookmark", "synopsisDP")));
            list.add(IE.b(SignupConstants.Field.VIDEOS, str, "seasons", "current"));
            list.add(IE.b(SignupConstants.Field.VIDEOS, str, "seasons", "latest", "detail"));
            list.add(IE.b(SignupConstants.Field.VIDEOS, str, "seasons", "latest", "episodes", IE.a(99), a()));
        }
        list.add(IE.b(SignupConstants.Field.VIDEOS, str, "taglineMessages"));
    }

    public static void b(List<InterfaceC1242Ud> list, List<String> list2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.addAll(Arrays.asList("summary", "detail", "rating", "inQueue", "hasWatched", "defaultTrailer", "advisories", "synopsisDP"));
        if (z3) {
            arrayList.add("volatileBitmaskedDetails");
        }
        if (z7) {
            arrayList.add("offlineAvailable");
        }
        list.add(IE.b(SignupConstants.Field.VIDEOS, list2, arrayList));
        list.add(IE.b(SignupConstants.Field.VIDEOS, list2, "episodes", "current", IE.c(IE.c("summary", "detail", "bookmark", "offlineAvailable", "synopsisDP"))));
        if (C8168dfL.h(str)) {
            list.add(IE.b(SignupConstants.Field.VIDEOS, str, h()));
            list.add(IE.b(SignupConstants.Field.VIDEOS, str, "watchNext", h()));
        } else {
            list.add(IE.b(SignupConstants.Field.VIDEOS, list2, "episodes", "current", "watchNext", h()));
        }
        list.add(a(list2, z4));
        list.add(a(list2));
        list.add(c(list2));
        list.add(b(list2));
        if (z) {
            list.add(IE.b(SignupConstants.Field.VIDEOS, list2, "seasons", "summary"));
            list.add(IE.b(SignupConstants.Field.VIDEOS, list2, "seasons", "latest", "detail"));
            list.add(e(list2));
        }
        if (z2) {
            list.add(IE.b(SignupConstants.Field.VIDEOS, list2, "seasons", "current", "episodes", IE.a(0, 39), a()));
        }
        if (z5) {
            list.add(IE.b(SignupConstants.Field.VIDEOS, list2, "recommendedTrailer"));
        }
        if (z6) {
            list.add(IE.b(SignupConstants.Field.VIDEOS, list2, "brandAndGenreBadge"));
        }
        list.add(IE.b(SignupConstants.Field.VIDEOS, list2, "titleGroups", "summary"));
        list.add(IE.b(SignupConstants.Field.VIDEOS, list2, "taglineMessages"));
    }

    public static List<String> e() {
        return Arrays.asList("detail", "rating", "advisories", "inQueue");
    }

    public static List<String> f() {
        return Collections.singletonList("hasWatched");
    }

    public static List<String> b() {
        return Arrays.asList("summary", "detail", "bookmark", "offlineAvailable");
    }

    public static InterfaceC1242Ud d() {
        return IE.b("episodes", "current", IE.c("summary", "detail", "bookmark", "offlineAvailable"));
    }

    public static List<String> c() {
        return Arrays.asList("advisories", "detail", "genres", "moodTags", "people", "summary");
    }
}
