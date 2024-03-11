package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HI extends HL implements Map<String, HZ> {
    private final Map<String, HZ> a;

    @Override // o.HL
    public Set<Map.Entry<String, HZ>> a() {
        return this.a.entrySet();
    }

    public final Map<String, HZ> b() {
        return this.a;
    }

    @Override // o.HL
    public int c() {
        return this.a.size();
    }

    @Override // o.HL
    public boolean c(HZ hz) {
        C8632dsu.c((Object) hz, "");
        return this.a.containsValue(hz);
    }

    @Override // o.HL
    public Collection<HZ> d() {
        return this.a.values();
    }

    @Override // o.HL
    public HZ d(String str) {
        C8632dsu.c((Object) str, "");
        return this.a.get(str);
    }

    @Override // o.HL
    public Set<String> e() {
        return this.a.keySet();
    }

    @Override // o.HL
    public boolean e(String str) {
        C8632dsu.c((Object) str, "");
        return this.a.containsKey(str);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HI(Map<String, ? extends HZ> map) {
        super(null);
        C8632dsu.c((Object) map, "");
        this.a = map;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof C0930Ib) {
            return C8632dsu.c(this.a, ((C0930Ib) obj).h());
        }
        if (obj instanceof HI) {
            return C8632dsu.c(this.a, ((HI) obj).a);
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.a.hashCode();
    }
}
