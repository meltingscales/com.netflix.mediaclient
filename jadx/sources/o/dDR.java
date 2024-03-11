package o;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public final class dDR {
    private static final InterfaceC7707dCj[] c = new InterfaceC7707dCj[0];

    public static final Set<String> a(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (interfaceC7707dCj instanceof dCL) {
            return ((dCL) interfaceC7707dCj).j();
        }
        HashSet hashSet = new HashSet(interfaceC7707dCj.e());
        int e = interfaceC7707dCj.e();
        for (int i = 0; i < e; i++) {
            hashSet.add(interfaceC7707dCj.a(i));
        }
        return hashSet;
    }

    public static final InterfaceC7707dCj[] d(List<? extends InterfaceC7707dCj> list) {
        InterfaceC7707dCj[] interfaceC7707dCjArr;
        list = (list == null || list.isEmpty()) ? null : null;
        return (list == null || (interfaceC7707dCjArr = (InterfaceC7707dCj[]) list.toArray(new InterfaceC7707dCj[0])) == null) ? c : interfaceC7707dCjArr;
    }

    public static final Void c(InterfaceC8660dtv<?> interfaceC8660dtv) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        throw new SerializationException(a(interfaceC8660dtv));
    }

    public static final String a(InterfaceC8660dtv<?> interfaceC8660dtv) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        String b = interfaceC8660dtv.b();
        if (b == null) {
            b = "<local class name not available>";
        }
        return e(b);
    }

    public static final String e(String str) {
        C8632dsu.c((Object) str, "");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final InterfaceC8660dtv<Object> a(dtH dth) {
        C8632dsu.c((Object) dth, "");
        InterfaceC8662dtx a = dth.a();
        if (a instanceof InterfaceC8660dtv) {
            return (InterfaceC8660dtv) a;
        }
        if (a instanceof dtG) {
            throw new IllegalStateException(("Captured type parameter " + a + " from generic non-reified function. Such functionality cannot be supported as " + a + " is erased, either specify serializer explicitly or make calling function inline with reified " + a).toString());
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + a).toString());
    }
}
