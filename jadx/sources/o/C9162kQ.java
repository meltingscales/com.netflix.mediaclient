package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C9246lv;

/* renamed from: o.kQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9162kQ implements C9246lv.a {
    private String a;
    private Boolean b;
    private String c;
    private String d;
    private String[] e;
    private String f;
    private String g = "android";
    private Long h;
    private String i;
    private Map<String, Object> j;

    public final Boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String[] c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public final String f() {
        return this.i;
    }

    public final String g() {
        return this.g;
    }

    public final Long h() {
        return this.h;
    }

    public final Map<String, Object> i() {
        return this.j;
    }

    public final String j() {
        return this.f;
    }

    public C9162kQ(C9159kN c9159kN, String[] strArr, Boolean bool, String str, String str2, Long l, Map<String, Object> map) {
        this.e = strArr;
        this.b = bool;
        this.d = str;
        this.c = str2;
        this.h = l;
        this.a = c9159kN.b();
        this.i = c9159kN.j();
        this.f = c9159kN.h();
        this.j = e(map);
    }

    public void d(C9246lv c9246lv) {
        c9246lv.c("cpuAbi").c(this.e);
        c9246lv.c("jailbroken").b(this.b);
        c9246lv.c(SignupConstants.Field.LANG_ID).e(this.d);
        c9246lv.c("locale").e(this.c);
        c9246lv.c("manufacturer").e(this.a);
        c9246lv.c("model").e(this.i);
        c9246lv.c("osName").e(this.g);
        c9246lv.c("osVersion").e(this.f);
        c9246lv.c("runtimeVersions").c(this.j);
        c9246lv.c("totalMemory").a(this.h);
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e();
        d(c9246lv);
        c9246lv.d();
    }

    private final Map<String, Object> e(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }
}
