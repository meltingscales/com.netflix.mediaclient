package o;

import com.bugsnag.android.ErrorType;
import com.bugsnag.android.NativeStackframe;
import java.util.Map;
import o.C9246lv;

/* renamed from: o.mb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9279mb implements C9246lv.a {
    private Long a;
    private Number b;
    private String c;
    private Map<String, String> d;
    private String e;
    private Long f;
    private String g;
    private Number h;
    private Boolean i;
    private Boolean j;
    private Long m;

    /* renamed from: o  reason: collision with root package name */
    private ErrorType f13882o;

    public final Long a() {
        return this.a;
    }

    public final ErrorType b() {
        return this.f13882o;
    }

    public final Long c() {
        return this.m;
    }

    public final void c(ErrorType errorType) {
        this.f13882o = errorType;
    }

    public final Long e() {
        return this.f;
    }

    public /* synthetic */ C9279mb(String str, String str2, Number number, Boolean bool, Map map, Number number2, int i, C8627dsp c8627dsp) {
        this(str, str2, number, bool, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : number2);
    }

    public C9279mb(String str, String str2, Number number, Boolean bool, Map<String, String> map, Number number2) {
        this.g = str;
        this.c = str2;
        this.h = number;
        this.j = bool;
        this.d = map;
        this.b = number2;
    }

    public C9279mb(NativeStackframe nativeStackframe) {
        this(nativeStackframe.getMethod(), nativeStackframe.getFile(), nativeStackframe.getLineNumber(), null, null, null, 32, null);
        this.a = nativeStackframe.getFrameAddress();
        this.m = nativeStackframe.getSymbolAddress();
        this.f = nativeStackframe.getLoadAddress();
        this.e = nativeStackframe.getCodeIdentifier();
        this.i = nativeStackframe.isPC();
        this.f13882o = nativeStackframe.getType();
    }

    public C9279mb(Map<String, ? extends Object> map) {
        Object obj = map.get("method");
        this.g = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("file");
        this.c = obj2 instanceof String ? (String) obj2 : null;
        C9264mM c9264mM = C9264mM.b;
        this.h = c9264mM.b(map.get("lineNumber"));
        Object obj3 = map.get("inProject");
        this.j = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Object obj4 = map.get("columnNumber");
        this.b = obj4 instanceof Number ? (Number) obj4 : null;
        this.a = c9264mM.b(map.get("frameAddress"));
        this.m = c9264mM.b(map.get("symbolAddress"));
        this.f = c9264mM.b(map.get("loadAddress"));
        Object obj5 = map.get("codeIdentifier");
        this.e = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get("isPC");
        this.i = obj6 instanceof Boolean ? (Boolean) obj6 : null;
        Object obj7 = map.get("code");
        this.d = obj7 instanceof Map ? (Map) obj7 : null;
        Object obj8 = map.get("type");
        String str = obj8 instanceof String ? (String) obj8 : null;
        this.f13882o = str != null ? ErrorType.Companion.c(str) : null;
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e();
        c9246lv.c("method").e(this.g);
        c9246lv.c("file").e(this.c);
        c9246lv.c("lineNumber").a(this.h);
        Boolean bool = this.j;
        if (bool != null) {
            c9246lv.c("inProject").b(bool.booleanValue());
        }
        c9246lv.c("columnNumber").a(this.b);
        Long l = this.a;
        if (l != null) {
            l.longValue();
            c9246lv.c("frameAddress").e(C9264mM.b.c(a()));
        }
        Long l2 = this.m;
        if (l2 != null) {
            l2.longValue();
            c9246lv.c("symbolAddress").e(C9264mM.b.c(c()));
        }
        Long l3 = this.f;
        if (l3 != null) {
            l3.longValue();
            c9246lv.c("loadAddress").e(C9264mM.b.c(e()));
        }
        String str = this.e;
        if (str != null) {
            c9246lv.c("codeIdentifier").e(str);
        }
        Boolean bool2 = this.i;
        if (bool2 != null) {
            c9246lv.c("isPC").b(bool2.booleanValue());
        }
        ErrorType errorType = this.f13882o;
        if (errorType != null) {
            c9246lv.c("type").e(errorType.getDesc$bugsnag_android_core_release());
        }
        Map<String, String> map = this.d;
        if (map != null) {
            c9246lv.c("code");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c9246lv.e();
                c9246lv.c(entry.getKey());
                c9246lv.e(entry.getValue());
                c9246lv.d();
            }
        }
        c9246lv.d();
    }
}
