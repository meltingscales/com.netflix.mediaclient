package o;

import com.bugsnag.android.BreadcrumbType;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C9246lv;

/* renamed from: o.kr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9189kr implements C9246lv.a {
    public Map<String, Object> a;
    public final Date c;
    public BreadcrumbType d;
    public String e;

    public C9189kr(String str, BreadcrumbType breadcrumbType, Map<String, Object> map, Date date) {
        this.e = str;
        this.d = breadcrumbType;
        this.a = map;
        this.c = date;
    }

    public C9189kr(String str) {
        this(str, BreadcrumbType.MANUAL, new LinkedHashMap(), new Date());
    }

    public final C9265mN b(int i) {
        Map<String, Object> map = this.a;
        if (map == null) {
            return new C9265mN(0, 0);
        }
        return C9262mK.b.a(i, map);
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e();
        c9246lv.c("timestamp").c(this.c);
        c9246lv.c("name").e(this.e);
        c9246lv.c("type").e(this.d.toString());
        c9246lv.c("metaData");
        c9246lv.c(this.a, true);
        c9246lv.d();
    }
}
