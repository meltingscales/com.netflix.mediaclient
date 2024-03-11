package o;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: o.bjz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4731bjz {
    private static List<String> c(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("webvtt-lssdh-ios8");
        arrayList.add("dfxp-ls-sdh");
        if ("ja".equals(str)) {
            arrayList.add("nflx-cmisc");
            if (C1854aQs.c() && !C8120deQ.a() && Build.VERSION.SDK_INT >= 29) {
                arrayList.add("imsc1.1");
            }
        } else {
            arrayList.remove("imsc1.1");
            arrayList.add("imsc1.1");
        }
        return arrayList;
    }

    public static String b(Set<String> set, Set<String> set2, String str, boolean z) {
        List<String> c = c(str, z);
        String str2 = null;
        for (String str3 : set) {
            if (set2.contains(str3) && (str2 == null || c.indexOf(str3) > c.indexOf(str2))) {
                str2 = str3;
            }
        }
        return str2;
    }
}
