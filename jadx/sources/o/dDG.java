package o;

/* loaded from: classes5.dex */
public abstract class dDG extends AbstractC7757dEf<String> {
    @Override // o.AbstractC7757dEf
    /* renamed from: k */
    public final String n(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return e(o(interfaceC7707dCj, i));
    }

    protected final String e(String str) {
        C8632dsu.c((Object) str, "");
        String cz_ = cz_();
        return d(cz_ != null ? cz_ : "", str);
    }

    protected String o(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return interfaceC7707dCj.a(i);
    }

    protected String d(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (str.length() == 0) {
            return str2;
        }
        return str + '.' + str2;
    }
}
