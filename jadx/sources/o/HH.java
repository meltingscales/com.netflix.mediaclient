package o;

import com.google.gson.JsonElement;

/* loaded from: classes.dex */
public final class HH extends HO {
    private final Long a;
    private final JsonElement b;
    private final Long c;
    private final boolean d;
    private final Integer e;
    private final Long j;

    @Override // o.HO
    public Long a() {
        return this.a;
    }

    @Override // o.HO
    public Integer c() {
        return this.e;
    }

    public final JsonElement d() {
        return this.b;
    }

    @Override // o.HO
    public Long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HH) {
            HH hh = (HH) obj;
            return C8632dsu.c(this.b, hh.b) && C8632dsu.c(this.a, hh.a) && C8632dsu.c(this.c, hh.c) && C8632dsu.c(this.e, hh.e) && C8632dsu.c(this.j, hh.j) && this.d == hh.d;
        }
        return false;
    }

    @Override // o.HZ
    public boolean g() {
        return true;
    }

    public final Long h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        Long l = this.a;
        int hashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.c;
        int hashCode3 = l2 == null ? 0 : l2.hashCode();
        Integer num = this.e;
        int hashCode4 = num == null ? 0 : num.hashCode();
        Long l3 = this.j;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (l3 != null ? l3.hashCode() : 0)) * 31) + Boolean.hashCode(this.d);
    }

    public final boolean j() {
        return this.d;
    }

    public String toString() {
        JsonElement jsonElement = this.b;
        Long l = this.a;
        Long l2 = this.c;
        Integer num = this.e;
        Long l3 = this.j;
        boolean z = this.d;
        return "JsonGraphAtom(value=" + jsonElement + ", expires=" + l + ", timestamp=" + l2 + ", size=" + num + ", writeTime=" + l3 + ", isSentinel=" + z + ")";
    }

    public /* synthetic */ HH(JsonElement jsonElement, Long l, Long l2, Integer num, Long l3, boolean z, int i, C8627dsp c8627dsp) {
        this(jsonElement, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : num, (i & 16) == 0 ? l3 : null, (i & 32) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HH(JsonElement jsonElement, Long l, Long l2, Integer num, Long l3, boolean z) {
        super(null);
        C8632dsu.c((Object) jsonElement, "");
        this.b = jsonElement;
        this.a = l;
        this.c = l2;
        this.e = num;
        this.j = l3;
        this.d = z;
    }
}
