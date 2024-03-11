package o;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Singleton;

@Singleton
/* renamed from: o.vd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9715vd implements InterfaceC9643uK {
    private final Map<InterfaceC9635uC, Integer> b = new ConcurrentHashMap();

    @Override // o.InterfaceC9643uK
    public void d(InterfaceC9635uC interfaceC9635uC) {
        C8632dsu.c((Object) interfaceC9635uC, "");
        this.b.put(interfaceC9635uC, Integer.valueOf(interfaceC9635uC.hashCode()));
    }

    @Override // o.InterfaceC9643uK
    public void e(InterfaceC9635uC interfaceC9635uC) {
        C8632dsu.c((Object) interfaceC9635uC, "");
        this.b.remove(interfaceC9635uC);
    }

    @Override // o.InterfaceC9643uK
    public Set<InterfaceC9635uC> b() {
        return this.b.keySet();
    }
}
