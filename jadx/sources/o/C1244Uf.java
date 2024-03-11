package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.Uf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244Uf {
    public final Collection<InterfaceC1242Ud> e;
    public final Set<InterfaceC1242Ud> d = new HashSet();
    public final List<InterfaceC1242Ud> b = new ArrayList();
    public final List<InterfaceC1242Ud> a = new ArrayList();

    public C1244Uf(Collection<InterfaceC1242Ud> collection) {
        this.e = collection;
    }

    public boolean e() {
        return this.b.size() > 0;
    }

    public boolean b() {
        return this.d.size() > 0;
    }
}
