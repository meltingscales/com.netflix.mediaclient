package o;

import java.util.Date;
import java.util.Map;

/* renamed from: o.kZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9171kZ extends C9162kQ {
    private Long a;
    private Long b;
    private Date c;
    private String d;

    public final Long k() {
        return this.a;
    }

    public final String m() {
        return this.d;
    }

    public final Long n() {
        return this.b;
    }

    public final Date o() {
        return this.c;
    }

    public C9171kZ(C9159kN c9159kN, Boolean bool, String str, String str2, Long l, Map<String, Object> map, Long l2, Long l3, String str3, Date date) {
        super(c9159kN, c9159kN.c(), bool, str, str2, l, map);
        this.b = l2;
        this.a = l3;
        this.d = str3;
        this.c = date;
    }

    @Override // o.C9162kQ
    public void d(C9246lv c9246lv) {
        super.d(c9246lv);
        c9246lv.c("freeDisk").a(this.b);
        c9246lv.c("freeMemory").a(this.a);
        c9246lv.c("orientation").e(this.d);
        if (this.c != null) {
            c9246lv.c("time").c(this.c);
        }
    }
}
