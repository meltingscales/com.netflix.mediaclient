package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.dCf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7703dCf {
    private final List<List<Annotation>> a;
    private final List<String> b;
    private List<? extends Annotation> c;
    private final List<Boolean> d;
    private final List<InterfaceC7707dCj> e;
    private final String i;
    private final Set<String> j;

    public final List<String> a() {
        return this.b;
    }

    public final void a(List<? extends Annotation> list) {
        C8632dsu.c((Object) list, "");
        this.c = list;
    }

    public final List<List<Annotation>> b() {
        return this.a;
    }

    public final List<Annotation> c() {
        return this.c;
    }

    public final List<Boolean> d() {
        return this.d;
    }

    public final List<InterfaceC7707dCj> e() {
        return this.e;
    }

    public C7703dCf(String str) {
        List<? extends Annotation> i;
        C8632dsu.c((Object) str, "");
        this.i = str;
        i = C8569dql.i();
        this.c = i;
        this.b = new ArrayList();
        this.j = new HashSet();
        this.e = new ArrayList();
        this.a = new ArrayList();
        this.d = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(C7703dCf c7703dCf, String str, InterfaceC7707dCj interfaceC7707dCj, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = C8569dql.i();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c7703dCf.e(str, interfaceC7707dCj, list, z);
    }

    public final void e(String str, InterfaceC7707dCj interfaceC7707dCj, List<? extends Annotation> list, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) list, "");
        if (!this.j.add(str)) {
            throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.i).toString());
        }
        this.b.add(str);
        this.e.add(interfaceC7707dCj);
        this.a.add(list);
        this.d.add(Boolean.valueOf(z));
    }
}
