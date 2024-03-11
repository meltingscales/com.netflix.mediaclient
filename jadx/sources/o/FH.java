package o;

import com.netflix.clcs.models.ItemAlignment;
import com.netflix.clcs.models.StackContentJustification;
import java.util.List;

/* loaded from: classes2.dex */
public final class FH implements FD {
    private final List<FD> a;
    private final ItemAlignment b;
    private final String c;
    private final StackContentJustification d;
    private final Integer e;
    private final boolean h;
    private final FC j;

    public final Integer a() {
        return this.e;
    }

    public String b() {
        return this.c;
    }

    public final List<FD> c() {
        return this.a;
    }

    public final StackContentJustification d() {
        return this.d;
    }

    public final ItemAlignment e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FH) {
            FH fh = (FH) obj;
            return C8632dsu.c((Object) this.c, (Object) fh.c) && C8632dsu.c(this.j, fh.j) && C8632dsu.c(this.e, fh.e) && this.d == fh.d && this.h == fh.h && this.b == fh.b && C8632dsu.c(this.a, fh.a);
        }
        return false;
    }

    public final boolean f() {
        return this.h;
    }

    public final FC h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        FC fc = this.j;
        int hashCode2 = fc == null ? 0 : fc.hashCode();
        Integer num = this.e;
        int hashCode3 = num == null ? 0 : num.hashCode();
        StackContentJustification stackContentJustification = this.d;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (stackContentJustification != null ? stackContentJustification.hashCode() : 0)) * 31) + Boolean.hashCode(this.h)) * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.c;
        FC fc = this.j;
        Integer num = this.e;
        StackContentJustification stackContentJustification = this.d;
        boolean z = this.h;
        ItemAlignment itemAlignment = this.b;
        List<FD> list = this.a;
        return "HorizontalStack(key=" + str + ", style=" + fc + ", contentSpacing=" + num + ", contentJustification=" + stackContentJustification + ", shouldStretchContent=" + z + ", itemAlignment=" + itemAlignment + ", children=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FH(String str, FC fc, Integer num, StackContentJustification stackContentJustification, boolean z, ItemAlignment itemAlignment, List<? extends FD> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) itemAlignment, "");
        C8632dsu.c((Object) list, "");
        this.c = str;
        this.j = fc;
        this.e = num;
        this.d = stackContentJustification;
        this.h = z;
        this.b = itemAlignment;
        this.a = list;
    }
}
