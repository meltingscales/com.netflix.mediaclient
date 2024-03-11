package o;

import java.util.List;

/* renamed from: o.bar  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4246bar {
    C4246bar() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str, String str2, List<InterfaceC4290bbi> list) {
        for (InterfaceC4290bbi interfaceC4290bbi : list) {
            if (interfaceC4290bbi.i().P()) {
                return true;
            }
        }
        return (str2 == null || str2.equals(str)) ? false : true;
    }
}
