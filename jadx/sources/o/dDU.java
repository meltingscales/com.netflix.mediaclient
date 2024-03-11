package o;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class dDU {
    public static final int d(InterfaceC7707dCj interfaceC7707dCj, InterfaceC7707dCj[] interfaceC7707dCjArr) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) interfaceC7707dCjArr, "");
        int hashCode = interfaceC7707dCj.d().hashCode();
        int hashCode2 = Arrays.hashCode(interfaceC7707dCjArr);
        Iterable<InterfaceC7707dCj> d = C7708dCk.d(interfaceC7707dCj);
        Iterator<InterfaceC7707dCj> it = d.iterator();
        int i = 1;
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            String d2 = it.next().d();
            if (d2 != null) {
                i3 = d2.hashCode();
            }
            i2 = (i2 * 31) + i3;
        }
        for (InterfaceC7707dCj interfaceC7707dCj2 : d) {
            AbstractC7715dCr b = interfaceC7707dCj2.b();
            i = (i * 31) + (b != null ? b.hashCode() : 0);
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + i;
    }
}
