package o;

import com.bugsnag.android.Breadcrumb;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.ErrorType;
import com.bugsnag.android.Severity;
import com.bugsnag.android.Thread;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: o.kq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9188kq {
    private final InterfaceC9200lB a;
    private final e d = new e();

    public C9188kq(InterfaceC9200lB interfaceC9200lB) {
        this.a = interfaceC9200lB;
    }

    public final C9227lc d(Map<? super String, ? extends Object> map, String str) {
        C9227lc c9227lc = new C9227lc(str, this.a, null, null, null, null, null, null, null, null, null, null, null, 8188, null);
        Object obj = map.get("exceptions");
        List<Map<? super String, ? extends Object>> list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            List<C9170kY> j = c9227lc.j();
            for (Map<? super String, ? extends Object> map2 : list) {
                j.add(new C9170kY(b(map2), this.a));
            }
        }
        Object obj2 = map.get("user");
        if (!(obj2 instanceof Map)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'user'");
            }
            throw new IllegalArgumentException("json property 'user' not of expected type, found " + ((Object) obj2.getClass().getName()));
        }
        c9227lc.d(g((Map) obj2));
        Object obj3 = map.get("metaData");
        if (!(obj3 instanceof Map)) {
            if (obj3 == null) {
                throw new IllegalStateException("cannot find json property 'metaData'");
            }
            throw new IllegalArgumentException("json property 'metaData' not of expected type, found " + ((Object) obj3.getClass().getName()));
        }
        for (Map.Entry entry : ((Map) obj3).entrySet()) {
            c9227lc.e((String) entry.getKey(), (Map) entry.getValue());
        }
        Object obj4 = map.get("featureFlags");
        if (!(obj4 instanceof List)) {
            if (obj4 == null) {
                throw new IllegalStateException("cannot find json property 'featureFlags'");
            }
            throw new IllegalArgumentException("json property 'featureFlags' not of expected type, found " + ((Object) obj4.getClass().getName()));
        }
        for (Map map3 : (List) obj4) {
            Object obj5 = map3.get("featureFlag");
            if (!(obj5 instanceof String)) {
                if (obj5 == null) {
                    throw new IllegalStateException("cannot find json property 'featureFlag'");
                }
                throw new IllegalArgumentException("json property 'featureFlag' not of expected type, found " + ((Object) obj5.getClass().getName()));
            }
            String str2 = (String) obj5;
            Object obj6 = map3.get("variant");
            c9227lc.a(str2, obj6 instanceof String ? (String) obj6 : null);
        }
        Object obj7 = map.get("breadcrumbs");
        if (!(obj7 instanceof List)) {
            if (obj7 == null) {
                throw new IllegalStateException("cannot find json property 'breadcrumbs'");
            }
            throw new IllegalArgumentException("json property 'breadcrumbs' not of expected type, found " + ((Object) obj7.getClass().getName()));
        }
        List<Breadcrumb> c = c9227lc.c();
        for (Map<String, ? extends Object> map4 : (List) obj7) {
            c.add(new Breadcrumb(d(map4), this.a));
        }
        Object obj8 = map.get("context");
        c9227lc.a(obj8 instanceof String ? (String) obj8 : null);
        Object obj9 = map.get("groupingHash");
        c9227lc.e(obj9 instanceof String ? (String) obj9 : null);
        Object obj10 = map.get("app");
        if (!(obj10 instanceof Map)) {
            if (obj10 == null) {
                throw new IllegalStateException("cannot find json property 'app'");
            }
            throw new IllegalArgumentException("json property 'app' not of expected type, found " + ((Object) obj10.getClass().getName()));
        }
        c9227lc.b(c((Map) obj10));
        Object obj11 = map.get("device");
        if (!(obj11 instanceof Map)) {
            if (obj11 == null) {
                throw new IllegalStateException("cannot find json property 'device'");
            }
            throw new IllegalArgumentException("json property 'device' not of expected type, found " + ((Object) obj11.getClass().getName()));
        }
        c9227lc.b(e((Map) obj11));
        Object obj12 = map.get("session");
        Map map5 = obj12 instanceof Map ? (Map) obj12 : null;
        if (map5 != null) {
            c9227lc.c = new C9220lV(map5, this.a, str);
            dpR dpr = dpR.c;
        }
        Object obj13 = map.get("threads");
        List<Map<String, ? extends Object>> list2 = obj13 instanceof List ? (List) obj13 : null;
        if (list2 != null) {
            List<Thread> o2 = c9227lc.o();
            for (Map<String, ? extends Object> map6 : list2) {
                o2.add(new Thread(a(map6), this.a));
            }
        }
        Object obj14 = map.get("projectPackages");
        List list3 = obj14 instanceof List ? (List) obj14 : null;
        if (list3 != null) {
            c9227lc.a((Collection<String>) list3);
            dpR dpr2 = dpR.c;
        }
        Object obj15 = map.get("severity");
        if (!(obj15 instanceof String)) {
            if (obj15 == null) {
                throw new IllegalStateException("cannot find json property 'severity'");
            }
            throw new IllegalArgumentException("json property 'severity' not of expected type, found " + ((Object) obj15.getClass().getName()));
        }
        Severity d = Severity.Companion.d((String) obj15);
        Object obj16 = map.get("unhandled");
        if (!(obj16 instanceof Boolean)) {
            if (obj16 == null) {
                throw new IllegalStateException("cannot find json property 'unhandled'");
            } else {
                throw new IllegalArgumentException("json property 'unhandled' not of expected type, found " + ((Object) obj16.getClass().getName()));
            }
        }
        c9227lc.d(b(map, ((Boolean) obj16).booleanValue(), d));
        c9227lc.k();
        c9227lc.b(new C9259mH(dsH.d(map.get("usage"))));
        return c9227lc;
    }

    public final C9294mq g(Map<String, ? extends Object> map) {
        Object obj = map.get(SignupConstants.Field.LANG_ID);
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get(SignupConstants.Field.EMAIL);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("name");
        return new C9294mq(str, str2, obj3 instanceof String ? (String) obj3 : null);
    }

    public final C9186ko c(Map<String, ? extends Object> map) {
        Object obj = map.get("binaryArch");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get(SignupConstants.Field.LANG_ID);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("releaseStage");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("version");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("codeBundleId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get("buildUUID");
        String str6 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = map.get("type");
        String str7 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = map.get("versionCode");
        Number number = obj8 instanceof Number ? (Number) obj8 : null;
        Integer valueOf = number == null ? null : Integer.valueOf(number.intValue());
        Object obj9 = map.get("duration");
        Number number2 = obj9 instanceof Number ? (Number) obj9 : null;
        Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
        Object obj10 = map.get("durationInForeground");
        Number number3 = obj10 instanceof Number ? (Number) obj10 : null;
        Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
        Object obj11 = map.get("inForeground");
        Boolean bool = obj11 instanceof Boolean ? (Boolean) obj11 : null;
        Object obj12 = map.get("isLaunching");
        return new C9186ko(str, str2, str3, str4, str5, str6, str7, valueOf, valueOf2, valueOf3, bool, obj12 instanceof Boolean ? (Boolean) obj12 : null);
    }

    public final C9171kZ e(Map<String, ? extends Object> map) {
        String[] strArr;
        Object obj = map.get("manufacturer");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("model");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("osVersion");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("cpuAbi");
        List list = obj4 instanceof List ? (List) obj4 : null;
        if (list == null) {
            strArr = null;
        } else {
            Object[] array = list.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            strArr = (String[]) array;
        }
        C9159kN c9159kN = new C9159kN(str, str2, str3, null, null, null, null, null, strArr);
        Object obj5 = map.get("jailbroken");
        Boolean bool = obj5 instanceof Boolean ? (Boolean) obj5 : null;
        Object obj6 = map.get(SignupConstants.Field.LANG_ID);
        String str4 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = map.get("locale");
        String str5 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = map.get("totalMemory");
        Number number = obj8 instanceof Number ? (Number) obj8 : null;
        Long valueOf = number == null ? null : Long.valueOf(number.longValue());
        Object obj9 = map.get("runtimeVersions");
        Map map2 = obj9 instanceof Map ? (Map) obj9 : null;
        Map k = map2 == null ? null : dqE.k(map2);
        if (k == null) {
            k = new LinkedHashMap();
        }
        Map map3 = k;
        Object obj10 = map.get("freeDisk");
        Number number2 = obj10 instanceof Number ? (Number) obj10 : null;
        Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
        Object obj11 = map.get("freeMemory");
        Number number3 = obj11 instanceof Number ? (Number) obj11 : null;
        Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
        Object obj12 = map.get("orientation");
        String str6 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = map.get("time");
        String str7 = obj13 instanceof String ? (String) obj13 : null;
        return new C9171kZ(c9159kN, bool, str4, str5, valueOf, map3, valueOf2, valueOf3, str6, str7 != null ? a(str7) : null);
    }

    public final C9288mk a(Map<String, ? extends Object> map) {
        C9278ma c9278ma;
        List i;
        String valueOf = String.valueOf(map.get(SignupConstants.Field.LANG_ID));
        Object obj = map.get("name");
        if (!(obj instanceof String)) {
            if (obj == null) {
                throw new IllegalStateException("cannot find json property 'name'");
            }
            throw new IllegalArgumentException("json property 'name' not of expected type, found " + ((Object) obj.getClass().getName()));
        }
        String str = (String) obj;
        ErrorType.b bVar = ErrorType.Companion;
        Object obj2 = map.get("type");
        if (!(obj2 instanceof String)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + ((Object) obj2.getClass().getName()));
        }
        ErrorType c = bVar.c((String) obj2);
        if (c == null) {
            c = ErrorType.ANDROID;
        }
        boolean c2 = C8632dsu.c(map.get("errorReportingThread"), Boolean.TRUE);
        Object obj3 = map.get("state");
        if (obj3 instanceof String) {
            String str2 = (String) obj3;
            Object obj4 = map.get("stacktrace");
            List<? extends Map<String, ? extends Object>> list = obj4 instanceof List ? (List) obj4 : null;
            C9278ma a = list != null ? a(list) : null;
            if (a == null) {
                i = C8569dql.i();
                c9278ma = new C9278ma(i);
            } else {
                c9278ma = a;
            }
            return new C9288mk(valueOf, str, c, c2, str2, c9278ma);
        } else if (obj3 == null) {
            throw new IllegalStateException("cannot find json property 'state'");
        } else {
            throw new IllegalArgumentException("json property 'state' not of expected type, found " + ((Object) obj3.getClass().getName()));
        }
    }

    /* renamed from: o.kq$e */
    /* loaded from: classes2.dex */
    public static final class e extends ThreadLocal<DateFormat> {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: e */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
            simpleDateFormat.setTimeZone(C8543dpm.c("UTC"));
            return simpleDateFormat;
        }
    }

    private final Date a(String str) {
        try {
            C9302my c9302my = C9302my.d;
            return C9302my.c(str);
        } catch (IllegalArgumentException unused) {
            DateFormat dateFormat = this.d.get();
            C8632dsu.d(dateFormat);
            Date parse = dateFormat.parse(str);
            if (parse != null) {
                return parse;
            }
            throw new IllegalArgumentException(C8632dsu.d("cannot parse date ", (Object) str));
        }
    }

    public final C9225la b(Map<? super String, ? extends Object> map) {
        Object obj = map.get("errorClass");
        if (!(obj instanceof String)) {
            if (obj == null) {
                throw new IllegalStateException("cannot find json property 'errorClass'");
            }
            throw new IllegalArgumentException("json property 'errorClass' not of expected type, found " + ((Object) obj.getClass().getName()));
        }
        String str = (String) obj;
        Object obj2 = map.get("message");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("type");
        if (!(obj3 instanceof String)) {
            if (obj3 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + ((Object) obj3.getClass().getName()));
        }
        String str3 = (String) obj3;
        ErrorType c = ErrorType.Companion.c(str3);
        if (c == null) {
            throw new IllegalArgumentException("unknown ErrorType: '" + str3 + '\'');
        }
        Object obj4 = map.get("stacktrace");
        if (obj4 instanceof List) {
            return new C9225la(str, str2, a((List) obj4), c);
        }
        if (obj4 == null) {
            throw new IllegalStateException("cannot find json property 'stacktrace'");
        }
        throw new IllegalArgumentException("json property 'stacktrace' not of expected type, found " + ((Object) obj4.getClass().getName()));
    }

    public final C9189kr d(Map<String, ? extends Object> map) {
        Object obj = map.get("name");
        if (!(obj instanceof String)) {
            if (obj == null) {
                throw new IllegalStateException("cannot find json property 'name'");
            }
            throw new IllegalArgumentException("json property 'name' not of expected type, found " + ((Object) obj.getClass().getName()));
        }
        String str = (String) obj;
        Object obj2 = map.get("type");
        if (!(obj2 instanceof String)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + ((Object) obj2.getClass().getName()));
        }
        BreadcrumbType d = BreadcrumbType.Companion.d((String) obj2);
        if (d == null) {
            d = BreadcrumbType.MANUAL;
        }
        Object obj3 = map.get("metaData");
        Map map2 = dsH.f(obj3) ? (Map) obj3 : null;
        Object obj4 = map.get("timestamp");
        if (obj4 instanceof String) {
            return new C9189kr(str, d, map2, a((String) obj4));
        }
        if (obj4 == null) {
            throw new IllegalStateException("cannot find json property 'timestamp'");
        }
        throw new IllegalArgumentException("json property 'timestamp' not of expected type, found " + ((Object) obj4.getClass().getName()));
    }

    public final C9278ma a(List<? extends Map<String, ? extends Object>> list) {
        int d;
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9279mb((Map) it.next()));
        }
        return new C9278ma(arrayList);
    }

    public final C9280mc b(Map<? super String, ? extends Object> map, boolean z, Severity severity) {
        Map.Entry entry;
        Set entrySet;
        Object S;
        Object obj = map.get("severityReason");
        if (!(obj instanceof Map)) {
            if (obj == null) {
                throw new IllegalStateException("cannot find json property 'severityReason'");
            }
            throw new IllegalArgumentException("json property 'severityReason' not of expected type, found " + ((Object) obj.getClass().getName()));
        }
        Map map2 = (Map) obj;
        Object obj2 = map2.get("unhandledOverridden");
        if (!(obj2 instanceof Boolean)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'unhandledOverridden'");
            }
            throw new IllegalArgumentException("json property 'unhandledOverridden' not of expected type, found " + ((Object) obj2.getClass().getName()));
        }
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Object obj3 = map2.get("type");
        if (!(obj3 instanceof String)) {
            if (obj3 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + ((Object) obj3.getClass().getName()));
        }
        String str = (String) obj3;
        boolean z2 = booleanValue ? !z : z;
        Object obj4 = map2.get("attributes");
        if (obj4 == null || (obj4 instanceof Map)) {
            Map map3 = (Map) obj4;
            if (map3 == null || (entrySet = map3.entrySet()) == null) {
                entry = null;
            } else {
                S = C8576dqs.S(entrySet);
                entry = (Map.Entry) S;
            }
            return new C9280mc(str, severity, z, z2, entry == null ? null : (String) entry.getValue(), entry != null ? (String) entry.getKey() : null);
        } else if (obj4 == null) {
            throw new IllegalStateException("cannot find json property 'attributes'");
        } else {
            throw new IllegalArgumentException("json property 'attributes' not of expected type, found " + ((Object) obj4.getClass().getName()));
        }
    }
}
