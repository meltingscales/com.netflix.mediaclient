package com.bugsnag.android.ndk;

import android.os.Build;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.internal.TaskType;
import com.bugsnag.android.ndk.NativeBridge;
import java.io.File;
import java.io.FileFilter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.text.Regex;
import o.AbstractC9286mi;
import o.C8632dsu;
import o.C8674dui;
import o.C9301mx;
import o.InterfaceC9200lB;
import o.InterfaceC9263mL;
import o.dpR;
import o.dsK;
import o.duD;

/* loaded from: classes5.dex */
public final class NativeBridge implements InterfaceC9263mL {
    private final C9301mx bgTaskService;
    private final ReentrantLock lock = new ReentrantLock();
    private final AtomicBoolean installed = new AtomicBoolean(false);
    private final File reportDirectory = NativeInterface.getNativeReportPath();
    private final InterfaceC9200lB logger = NativeInterface.getLogger();

    public final native void addBreadcrumb(String str, String str2, String str3, Object obj);

    public final native void addFeatureFlag(String str, String str2);

    public final native void addHandledEvent();

    public final native void addMetadataBoolean(String str, String str2, boolean z);

    public final native void addMetadataDouble(String str, String str2, double d);

    public final native void addMetadataOpaque(String str, String str2, String str3);

    public final native void addMetadataString(String str, String str2, String str3);

    public final native void addUnhandledEvent();

    public final native void clearFeatureFlag(String str);

    public final native void clearFeatureFlags();

    public final native void clearMetadataTab(String str);

    public final native void deliverReportAtPath(String str);

    public final native Map<String, Integer> getCurrentCallbackSetCounts();

    public final native Map<String, Boolean> getCurrentNativeApiCallUsage();

    public final native long getSignalUnwindStackFunction();

    public final native void initCallbackCounts(Map<String, Integer> map);

    public final native void install(String str, String str2, String str3, int i, boolean z, int i2, boolean z2, int i3);

    public final native void notifyAddCallback(String str);

    public final native void notifyRemoveCallback(String str);

    public final native void pausedSession();

    public final native void refreshSymbolTable();

    public final native void removeMetadata(String str, String str2);

    public final native void setInternalMetricsEnabled(boolean z);

    public final native void setStaticJsonData(String str);

    public final native void startedSession(String str, String str2, int i, int i2);

    public final native void updateContext(String str);

    public final native void updateInForeground(boolean z, String str);

    public final native void updateIsLaunching(boolean z);

    public final native void updateLastRunInfo(int i);

    public final native void updateLowMemory(boolean z, String str);

    public final native void updateOrientation(String str);

    public final native void updateUserEmail(String str);

    public final native void updateUserId(String str);

    public final native void updateUserName(String str);

    public NativeBridge(C9301mx c9301mx) {
        this.bgTaskService = c9301mx;
    }

    private final boolean is32bit() {
        boolean d;
        String[] cpuAbi = NativeInterface.getCpuAbi();
        int length = cpuAbi.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            d = duD.d((CharSequence) cpuAbi[i], (CharSequence) "64", false, 2, (Object) null);
            if (d) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    @Override // o.InterfaceC9263mL
    public void onStateChange(AbstractC9286mi abstractC9286mi) {
        if (isInvalidMessage(abstractC9286mi)) {
            return;
        }
        if (abstractC9286mi instanceof AbstractC9286mi.i) {
            handleInstallMessage((AbstractC9286mi.i) abstractC9286mi);
        } else if (C8632dsu.c(abstractC9286mi, AbstractC9286mi.g.a)) {
            deliverPendingReports();
        } else if (abstractC9286mi instanceof AbstractC9286mi.d) {
            handleAddMetadata((AbstractC9286mi.d) abstractC9286mi);
        } else if (abstractC9286mi instanceof AbstractC9286mi.h) {
            clearMetadataTab(makeSafe(((AbstractC9286mi.h) abstractC9286mi).e));
        } else {
            if (abstractC9286mi instanceof AbstractC9286mi.j) {
                AbstractC9286mi.j jVar = (AbstractC9286mi.j) abstractC9286mi;
                String makeSafe = makeSafe(jVar.e);
                String str = jVar.b;
                removeMetadata(makeSafe, makeSafe(str != null ? str : ""));
            } else if (abstractC9286mi instanceof AbstractC9286mi.a) {
                AbstractC9286mi.a aVar = (AbstractC9286mi.a) abstractC9286mi;
                addBreadcrumb(makeSafe(aVar.a), makeSafe(aVar.d.toString()), makeSafe(aVar.e), makeSafeMetadata(aVar.b));
            } else if (C8632dsu.c(abstractC9286mi, AbstractC9286mi.f.e)) {
                addHandledEvent();
            } else if (C8632dsu.c(abstractC9286mi, AbstractC9286mi.o.b)) {
                addUnhandledEvent();
            } else if (C8632dsu.c(abstractC9286mi, AbstractC9286mi.k.b)) {
                pausedSession();
            } else if (abstractC9286mi instanceof AbstractC9286mi.n) {
                AbstractC9286mi.n nVar = (AbstractC9286mi.n) abstractC9286mi;
                startedSession(makeSafe(nVar.e), makeSafe(nVar.b), nVar.a, nVar.a());
            } else if (abstractC9286mi instanceof AbstractC9286mi.l) {
                String str2 = ((AbstractC9286mi.l) abstractC9286mi).c;
                updateContext(makeSafe(str2 != null ? str2 : ""));
            } else if (abstractC9286mi instanceof AbstractC9286mi.m) {
                AbstractC9286mi.m mVar = (AbstractC9286mi.m) abstractC9286mi;
                boolean z = mVar.b;
                String a = mVar.a();
                updateInForeground(z, makeSafe(a != null ? a : ""));
            } else if (abstractC9286mi instanceof AbstractC9286mi.s) {
                updateLastRunInfo(((AbstractC9286mi.s) abstractC9286mi).b);
            } else if (abstractC9286mi instanceof AbstractC9286mi.t) {
                AbstractC9286mi.t tVar = (AbstractC9286mi.t) abstractC9286mi;
                updateIsLaunching(tVar.d);
                if (tVar.d) {
                    return;
                }
                this.bgTaskService.e(TaskType.DEFAULT, new Runnable() { // from class: o.mV
                    @Override // java.lang.Runnable
                    public final void run() {
                        NativeBridge.this.refreshSymbolTable();
                    }
                });
            } else if (abstractC9286mi instanceof AbstractC9286mi.r) {
                String str3 = ((AbstractC9286mi.r) abstractC9286mi).d;
                updateOrientation(str3 != null ? str3 : "");
            } else if (abstractC9286mi instanceof AbstractC9286mi.q) {
                AbstractC9286mi.q qVar = (AbstractC9286mi.q) abstractC9286mi;
                String c = qVar.a.c();
                if (c == null) {
                    c = "";
                }
                updateUserId(makeSafe(c));
                String d = qVar.a.d();
                if (d == null) {
                    d = "";
                }
                updateUserName(makeSafe(d));
                String b = qVar.a.b();
                updateUserEmail(makeSafe(b != null ? b : ""));
            } else if (abstractC9286mi instanceof AbstractC9286mi.p) {
                AbstractC9286mi.p pVar = (AbstractC9286mi.p) abstractC9286mi;
                updateLowMemory(pVar.b, pVar.c);
            } else if (abstractC9286mi instanceof AbstractC9286mi.c) {
                AbstractC9286mi.c cVar = (AbstractC9286mi.c) abstractC9286mi;
                String makeSafe2 = makeSafe(cVar.b);
                String str4 = cVar.c;
                addFeatureFlag(makeSafe2, str4 == null ? null : makeSafe(str4));
            } else if (abstractC9286mi instanceof AbstractC9286mi.b) {
                clearFeatureFlag(makeSafe(((AbstractC9286mi.b) abstractC9286mi).e));
            } else if (abstractC9286mi instanceof AbstractC9286mi.e) {
                clearFeatureFlags();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements Map<String, Object>, dsK {
        final /* synthetic */ Map<String, Object> b;
        private final /* synthetic */ Map<String, Object> c;

        @Override // java.util.Map
        /* renamed from: a */
        public Object put(String str, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        /* renamed from: a */
        public Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        /* renamed from: a */
        public Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Set<String> a() {
            return this.c.keySet();
        }

        @Override // java.util.Map
        /* renamed from: b */
        public Object putIfAbsent(String str, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        /* renamed from: b */
        public Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        /* renamed from: b */
        public Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Collection<Object> b() {
            return this.c.values();
        }

        public boolean b(String str) {
            return this.c.containsKey(str);
        }

        public int c() {
            return this.c.size();
        }

        @Override // java.util.Map
        /* renamed from: c */
        public Object replace(String str, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        /* renamed from: c */
        public boolean replace(String str, Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.c.containsValue(obj);
        }

        public Set<Map.Entry<String, Object>> e() {
            return this.c.entrySet();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.c.isEmpty();
        }

        @Override // java.util.Map
        public void putAll(Map<? extends String, ? extends Object> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        e(Map<String, ? extends Object> map) {
            this.b = map;
            this.c = map;
        }

        @Override // java.util.Map
        public final boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return b((String) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final Set<Map.Entry<String, Object>> entrySet() {
            return e();
        }

        @Override // java.util.Map
        public final Object get(Object obj) {
            if (obj instanceof String) {
                return d((String) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final Set<String> keySet() {
            return a();
        }

        @Override // java.util.Map
        public final int size() {
            return c();
        }

        @Override // java.util.Map
        public final Collection<Object> values() {
            return b();
        }

        public Object d(String str) {
            return OpaqueValue.e.e(this.b.get(str));
        }
    }

    private final Map<String, Object> makeSafeMetadata(Map<String, ? extends Object> map) {
        return map.isEmpty() ? map : new e(map);
    }

    private final boolean isInvalidMessage(Object obj) {
        if (obj == null || !(obj instanceof AbstractC9286mi)) {
            return true;
        }
        if (this.installed.get() || (obj instanceof AbstractC9286mi.i)) {
            return false;
        }
        this.logger.d(C8632dsu.d("Received message before INSTALL: ", obj));
        return true;
    }

    private final void deliverPendingReports() {
        final Regex regex = new Regex(".*\\.crash$");
        this.lock.lock();
        try {
            try {
                File file = this.reportDirectory;
                if (file.exists()) {
                    File[] listFiles = file.listFiles(new FileFilter() { // from class: o.mU
                        @Override // java.io.FileFilter
                        public final boolean accept(File file2) {
                            boolean m2764deliverPendingReports$lambda2;
                            m2764deliverPendingReports$lambda2 = NativeBridge.m2764deliverPendingReports$lambda2(Regex.this, file2);
                            return m2764deliverPendingReports$lambda2;
                        }
                    });
                    if (listFiles != null) {
                        int length = listFiles.length;
                        int i = 0;
                        while (i < length) {
                            File file2 = listFiles[i];
                            i++;
                            deliverReportAtPath(file2.getAbsolutePath());
                        }
                    }
                } else {
                    this.logger.d("Payload directory does not exist, cannot read pending reports");
                }
            } catch (Exception e2) {
                this.logger.d(C8632dsu.d("Failed to parse/write pending reports: ", e2));
            }
        } finally {
            this.lock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: deliverPendingReports$lambda-2  reason: not valid java name */
    public static final boolean m2764deliverPendingReports$lambda2(Regex regex, File file) {
        return regex.d(file.getName());
    }

    private final void handleInstallMessage(AbstractC9286mi.i iVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.installed.get()) {
                this.logger.d(C8632dsu.d("Received duplicate setup message with arg: ", iVar));
            } else {
                File file = this.reportDirectory;
                install(makeSafe(iVar.b), new File(file, UUID.randomUUID() + ".crash").getAbsolutePath(), makeSafe(iVar.j), iVar.e, iVar.c, Build.VERSION.SDK_INT, is32bit(), iVar.g.ordinal());
                this.installed.set(true);
            }
            dpR dpr = dpR.c;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void handleAddMetadata(AbstractC9286mi.d dVar) {
        if (dVar.b != null) {
            Object e2 = OpaqueValue.e.e(dVar.c);
            if (e2 instanceof String) {
                String str = dVar.a;
                String str2 = dVar.b;
                C8632dsu.d((Object) str2);
                addMetadataString(str, str2, makeSafe((String) e2));
            } else if (e2 instanceof Boolean) {
                String str3 = dVar.a;
                String str4 = dVar.b;
                C8632dsu.d((Object) str4);
                addMetadataBoolean(str3, str4, ((Boolean) e2).booleanValue());
            } else if (e2 instanceof Number) {
                String str5 = dVar.a;
                String str6 = dVar.b;
                C8632dsu.d((Object) str6);
                addMetadataDouble(str5, str6, ((Number) e2).doubleValue());
            } else if (e2 instanceof OpaqueValue) {
                String str7 = dVar.a;
                String str8 = dVar.b;
                C8632dsu.d((Object) str8);
                addMetadataOpaque(str7, str8, ((OpaqueValue) e2).getJson());
            }
        }
    }

    private final String makeSafe(String str) {
        Charset defaultCharset = Charset.defaultCharset();
        if (str != null) {
            byte[] bytes = str.getBytes(defaultCharset);
            C8632dsu.a(bytes, "");
            return new String(bytes, C8674dui.i);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
