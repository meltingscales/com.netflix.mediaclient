package com.bugsnag.android;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import o.C9160kO;
import o.C9170kY;
import o.C9171kZ;
import o.C9184km;
import o.C9186ko;
import o.C9187kp;
import o.C9191kt;
import o.C9220lV;
import o.C9225la;
import o.C9227lc;
import o.C9229le;
import o.C9232lh;
import o.C9247lw;
import o.C9258mG;
import o.C9264mM;
import o.C9278ma;
import o.C9279mb;
import o.C9280mc;
import o.C9294mq;
import o.InterfaceC9200lB;
import o.InterfaceC9218lT;

/* loaded from: classes2.dex */
public class NativeInterface {
    private static Charset UTF8Charset = Charset.defaultCharset();
    @SuppressLint({"StaticFieldLeak"})
    private static C9191kt client;

    public static void setClient(C9191kt c9191kt) {
        client = c9191kt;
    }

    private static C9191kt getClient() {
        C9191kt c9191kt = client;
        return c9191kt != null ? c9191kt : C9187kp.a();
    }

    private static C9229le createEmptyEvent() {
        C9191kt client2 = getClient();
        return new C9229le(new C9227lc(null, client2.e(), C9280mc.a("handledException"), client2.l().a().a()), client2.m());
    }

    public static String getContext() {
        return getClient().d();
    }

    public static File getNativeReportPath() {
        return getNativeReportPath(getPersistenceDirectory());
    }

    private static File getNativeReportPath(File file) {
        return new File(file, "bugsnag/native");
    }

    private static File getPersistenceDirectory() {
        return getClient().e().x().getValue();
    }

    public static Map<String, String> getUser() {
        HashMap hashMap = new HashMap();
        C9294mq q = getClient().q();
        hashMap.put(SignupConstants.Field.LANG_ID, q.c());
        hashMap.put("name", q.d());
        hashMap.put(SignupConstants.Field.EMAIL, q.b());
        return hashMap;
    }

    public static Map<String, Object> getApp() {
        HashMap hashMap = new HashMap();
        C9184km c = getClient().c();
        C9186ko a = c.a();
        hashMap.put("version", a.i());
        hashMap.put("releaseStage", a.c());
        hashMap.put(SignupConstants.Field.LANG_ID, a.e());
        hashMap.put("type", a.b());
        hashMap.put("buildUUID", a.d());
        hashMap.put("duration", a.g());
        hashMap.put("durationInForeground", a.f());
        hashMap.put("versionCode", a.j());
        hashMap.put("inForeground", a.h());
        hashMap.put("isLaunching", a.n());
        hashMap.put("binaryArch", a.a());
        hashMap.putAll(c.d());
        return hashMap;
    }

    public static Map<String, Object> getDevice() {
        C9160kO j = getClient().j();
        HashMap hashMap = new HashMap(j.c());
        C9171kZ a = j.a(new Date().getTime());
        hashMap.put("freeDisk", a.n());
        hashMap.put("freeMemory", a.k());
        hashMap.put("orientation", a.m());
        hashMap.put("time", a.o());
        hashMap.put("cpuAbi", a.c());
        hashMap.put("jailbroken", a.a());
        hashMap.put(SignupConstants.Field.LANG_ID, a.d());
        hashMap.put("locale", a.e());
        hashMap.put("manufacturer", a.b());
        hashMap.put("model", a.f());
        hashMap.put("osName", a.g());
        hashMap.put("osVersion", a.j());
        hashMap.put("runtimeVersions", a.i());
        hashMap.put("totalMemory", a.h());
        return hashMap;
    }

    public static String[] getCpuAbi() {
        return getClient().j().e();
    }

    public static Map<String, Object> getMetadata() {
        return getClient().n();
    }

    public static List<Breadcrumb> getBreadcrumbs() {
        return getClient().a();
    }

    public static void setUser(String str, String str2, String str3) {
        getClient().d(str, str2, str3);
    }

    public static void setUser(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        setUser(bArr == null ? null : new String(bArr, UTF8Charset), bArr2 == null ? null : new String(bArr2, UTF8Charset), bArr3 != null ? new String(bArr3, UTF8Charset) : null);
    }

    public static void leaveBreadcrumb(String str, BreadcrumbType breadcrumbType) {
        if (str == null) {
            return;
        }
        getClient().d(str, new HashMap(), breadcrumbType);
    }

    public static void leaveBreadcrumb(byte[] bArr, BreadcrumbType breadcrumbType) {
        if (bArr == null) {
            return;
        }
        getClient().d(new String(bArr, UTF8Charset), new HashMap(), breadcrumbType);
    }

    public static void leaveBreadcrumb(String str, String str2, Map<String, Object> map) {
        getClient().d(str, map, BreadcrumbType.valueOf(str2.toUpperCase(Locale.US)));
    }

    public static void clearMetadata(String str, String str2) {
        if (str2 == null) {
            getClient().d(str);
        } else {
            getClient().b(str, str2);
        }
    }

    public static void addMetadata(String str, String str2, Object obj) {
        getClient().c(str, str2, obj);
    }

    public static void addMetadata(String str, Map<String, ?> map) {
        getClient().c(str, map);
    }

    public static String getReleaseStage() {
        return getClient().e().w();
    }

    public static String getSessionEndpoint() {
        return getClient().e().l().a();
    }

    public static String getEndpoint() {
        return getClient().e().l().e();
    }

    public static void setContext(String str) {
        getClient().a(str);
    }

    public static void setBinaryArch(String str) {
        getClient().c(str);
    }

    public static String getAppVersion() {
        return getClient().e().a();
    }

    public static Collection<String> getEnabledReleaseStages() {
        return getClient().e().n();
    }

    public static void registerSession(long j, String str, int i, int i2) {
        C9191kt client2 = getClient();
        client2.k().d(j > 0 ? new Date(j) : null, str, client2.q(), i, i2);
    }

    public static boolean isDiscardErrorClass(String str) {
        Collection<Pattern> j = getClient().e().j();
        if (j.isEmpty()) {
            return false;
        }
        for (Pattern pattern : j) {
            if (pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private static void deepMerge(Map<String, Object> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Object obj = map2.get(key);
            if ((value instanceof Map) && (obj instanceof Map)) {
                deepMerge((Map) value, (Map) obj);
            } else if ((value instanceof Collection) && (obj instanceof Collection)) {
                ((Collection) obj).addAll((Collection) value);
            } else {
                map2.put(key, value);
            }
        }
    }

    public static void deliverReport(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, boolean z) {
        if (bArr3 != null) {
            C9264mM c9264mM = C9264mM.b;
            Map<? super String, ? extends Object> a = c9264mM.a(new ByteArrayInputStream(bArr2));
            deepMerge(c9264mM.a(new ByteArrayInputStream(bArr3)), a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            c9264mM.e(a, byteArrayOutputStream);
            bArr2 = byteArrayOutputStream.toByteArray();
        }
        String str2 = new String(bArr2, UTF8Charset);
        String str3 = bArr == null ? null : new String(bArr, UTF8Charset);
        C9191kt client2 = getClient();
        C9258mG e = client2.e();
        if (str3 == null || str3.length() == 0 || !e.C()) {
            C9232lh h = client2.h();
            String c = h.c(str2, str);
            if (z) {
                c = c.replace(".json", "startupcrash.json");
            }
            h.d(str2, c);
        }
    }

    public static void notify(byte[] bArr, byte[] bArr2, Severity severity, StackTraceElement[] stackTraceElementArr) {
        if (bArr == null || bArr2 == null || stackTraceElementArr == null) {
            return;
        }
        notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, stackTraceElementArr);
    }

    public static void notify(final String str, final String str2, final Severity severity, StackTraceElement[] stackTraceElementArr) {
        if (getClient().e().a(str)) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException();
        runtimeException.setStackTrace(stackTraceElementArr);
        getClient().a(runtimeException, new InterfaceC9218lT() { // from class: com.bugsnag.android.NativeInterface.1
            @Override // o.InterfaceC9218lT
            public boolean c(C9229le c9229le) {
                c9229le.d(Severity.this);
                List<C9170kY> c = c9229le.c();
                C9170kY c9170kY = c9229le.c().get(0);
                if (c.isEmpty()) {
                    return true;
                }
                c9170kY.e(str);
                c9170kY.d(str2);
                for (C9170kY c9170kY2 : c) {
                    c9170kY2.a(ErrorType.C);
                }
                return true;
            }
        });
    }

    public static void notify(byte[] bArr, byte[] bArr2, Severity severity, NativeStackframe[] nativeStackframeArr) {
        if (bArr == null || bArr2 == null || nativeStackframeArr == null) {
            return;
        }
        notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, nativeStackframeArr);
    }

    public static void notify(String str, String str2, Severity severity, NativeStackframe[] nativeStackframeArr) {
        C9191kt client2 = getClient();
        if (client2.e().a(str)) {
            return;
        }
        C9229le createEmptyEvent = createEmptyEvent();
        createEmptyEvent.d(severity);
        ArrayList arrayList = new ArrayList(nativeStackframeArr.length);
        for (NativeStackframe nativeStackframe : nativeStackframeArr) {
            arrayList.add(new C9279mb(nativeStackframe));
        }
        createEmptyEvent.c().add(new C9170kY(new C9225la(str, str2, new C9278ma(arrayList), ErrorType.C), client2.m()));
        getClient().c(createEmptyEvent, (InterfaceC9218lT) null);
    }

    public static C9229le createEvent(Throwable th, C9191kt c9191kt, C9280mc c9280mc) {
        return new C9229le(th, c9191kt.e(), c9280mc, c9191kt.l().a(), c9191kt.i().c(), c9191kt.m);
    }

    public static InterfaceC9200lB getLogger() {
        return getClient().e().m();
    }

    public static void setAutoNotify(boolean z) {
        getClient().a(z);
    }

    public static void setAutoDetectAnrs(boolean z) {
        getClient().d(z);
    }

    public static void startSession() {
        getClient().y();
    }

    public static void pauseSession() {
        getClient().s();
    }

    public static boolean resumeSession() {
        return getClient().x();
    }

    public static C9220lV getCurrentSession() {
        return getClient().p.c();
    }

    public static void markLaunchCompleted() {
        getClient().p();
    }

    public static C9247lw getLastRunInfo() {
        return getClient().g();
    }
}
