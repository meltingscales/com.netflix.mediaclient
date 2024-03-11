package o;

import com.netflix.clcs.models.ItemAlignment;
import com.netflix.clcs.models.StackContentJustification;
import java.util.List;

/* renamed from: o.Gc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0879Gc implements FD {
    private final Integer a;
    private final String b;
    private final StackContentJustification c;
    private final List<FD> d;
    private final ItemAlignment e;
    private final boolean h;
    private final FC j;

    public final Integer a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public final StackContentJustification c() {
        return this.c;
    }

    public final List<FD> d() {
        return this.d;
    }

    public final ItemAlignment e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0879Gc) {
            C0879Gc c0879Gc = (C0879Gc) obj;
            return C8632dsu.c((Object) this.b, (Object) c0879Gc.b) && C8632dsu.c(this.j, c0879Gc.j) && C8632dsu.c(this.a, c0879Gc.a) && this.c == c0879Gc.c && this.h == c0879Gc.h && this.e == c0879Gc.e && C8632dsu.c(this.d, c0879Gc.d);
        }
        return false;
    }

    public final FC h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        FC fc = this.j;
        int hashCode2 = fc == null ? 0 : fc.hashCode();
        Integer num = this.a;
        int hashCode3 = num == null ? 0 : num.hashCode();
        StackContentJustification stackContentJustification = this.c;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (stackContentJustification != null ? stackContentJustification.hashCode() : 0)) * 31) + Boolean.hashCode(this.h)) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }

    public final boolean j() {
        return this.h;
    }

    public String toString() {
        String str = this.b;
        FC fc = this.j;
        Integer num = this.a;
        StackContentJustification stackContentJustification = this.c;
        boolean z = this.h;
        ItemAlignment itemAlignment = this.e;
        List<FD> list = this.d;
        return "VerticalStack(key=" + str + ", style=" + fc + ", contentSpacing=" + num + ", contentJustification=" + stackContentJustification + ", shouldStretchContent=" + z + ", itemAlignment=" + itemAlignment + ", children=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0879Gc(String str, FC fc, Integer num, StackContentJustification stackContentJustification, boolean z, ItemAlignment itemAlignment, List<? extends FD> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) itemAlignment, "");
        C8632dsu.c((Object) list, "");
        this.b = str;
        this.j = fc;
        this.a = num;
        this.c = stackContentJustification;
        this.h = z;
        this.e = itemAlignment;
        this.d = list;
    }
}
