package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.Ib  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0930Ib extends HL implements Map<String, HZ> {
    private final Map<String, HZ> b;

    @Override // o.HL
    public Set<Map.Entry<String, HZ>> a() {
        return this.b.entrySet();
    }

    @Override // o.HL
    public int c() {
        return this.b.size();
    }

    @Override // o.HL
    public boolean c(HZ hz) {
        C8632dsu.c((Object) hz, "");
        return this.b.containsValue(hz);
    }

    @Override // o.HL
    public Collection<HZ> d() {
        return this.b.values();
    }

    @Override // o.HL
    public HZ d(String str) {
        C8632dsu.c((Object) str, "");
        return this.b.get(str);
    }

    @Override // o.HL
    public Set<String> e() {
        return this.b.keySet();
    }

    @Override // o.HL
    public boolean e(String str) {
        C8632dsu.c((Object) str, "");
        return this.b.containsKey(str);
    }

    public final Map<String, HZ> h() {
        return this.b;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0930Ib(Map<String, HZ> map) {
        super(null);
        C8632dsu.c((Object) map, "");
        this.b = map;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof C0930Ib) {
            return C8632dsu.c(this.b, ((C0930Ib) obj).b);
        }
        if (obj instanceof HI) {
            return C8632dsu.c(this.b, ((HI) obj).b());
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.b.hashCode();
    }
}
