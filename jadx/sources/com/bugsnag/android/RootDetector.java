package com.bugsnag.android;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import kotlin.Result;
import kotlin.text.Regex;
import o.C8556dpz;
import o.C8569dql;
import o.C8608drx;
import o.C8627dsp;
import o.C8632dsu;
import o.C8670due;
import o.C8672dug;
import o.C8674dui;
import o.C8691duz;
import o.C9159kN;
import o.InterfaceC9200lB;
import o.dpR;
import o.drJ;
import o.drM;
import o.dtQ;
import o.duD;

/* loaded from: classes2.dex */
public final class RootDetector {
    private static final List<String> a;
    public static final c b = new c(null);
    private static final File d = new File("/system/build.prop");
    private final File c;
    private final C9159kN e;
    private volatile boolean f;
    private final List<String> h;
    private final InterfaceC9200lB i;

    private final native boolean performNativeRootChecks();

    public RootDetector(C9159kN c9159kN, List<String> list, File file, InterfaceC9200lB interfaceC9200lB) {
        this.e = c9159kN;
        this.h = list;
        this.c = file;
        this.i = interfaceC9200lB;
        try {
            System.loadLibrary("bugsnag-root-detection");
            this.f = true;
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public /* synthetic */ RootDetector(C9159kN c9159kN, List list, File file, InterfaceC9200lB interfaceC9200lB, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? C9159kN.a.d() : c9159kN, (i & 2) != 0 ? a : list, (i & 4) != 0 ? d : file, interfaceC9200lB);
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    static {
        List<String> j;
        j = C8569dql.j("/system/xbin/su", "/system/bin/su", "/system/app/Superuser.apk", "/system/app/SuperSU.apk", "/system/app/Superuser", "/system/app/SuperSU", "/system/xbin/daemonsu", "/su/bin");
        a = j;
    }

    public final boolean d() {
        try {
        } catch (Throwable th) {
            this.i.e("Root detection failed", th);
        }
        if (!a() && !c() && !b() && !e()) {
            if (!f()) {
                return false;
            }
        }
        return true;
    }

    private final boolean c() {
        return d(new ProcessBuilder(new String[0]));
    }

    public final boolean a() {
        boolean d2;
        String g = this.e.g();
        Boolean bool = null;
        if (g != null) {
            d2 = duD.d((CharSequence) g, (CharSequence) "test-keys", false, 2, (Object) null);
            bool = Boolean.valueOf(d2);
        }
        return C8632dsu.c(bool, Boolean.TRUE);
    }

    public final boolean e() {
        try {
            Result.c cVar = Result.e;
            for (String str : this.h) {
                if (new File(str).exists()) {
                    return true;
                }
            }
            Result.e(dpR.c);
            return false;
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            Result.e(C8556dpz.a(th));
            return false;
        }
    }

    public final boolean b() {
        dtQ k;
        dtQ f;
        boolean m;
        try {
            Result.c cVar = Result.e;
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(this.c), C8674dui.i);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            k = C8670due.k(drJ.e(bufferedReader), new drM<String, String>() { // from class: com.bugsnag.android.RootDetector$checkBuildProps$1$1$1
                @Override // o.drM
                /* renamed from: d */
                public final String invoke(String str) {
                    return new Regex("\\s").a(str, "");
                }
            });
            f = C8670due.f(k, new drM<String, Boolean>() { // from class: com.bugsnag.android.RootDetector$checkBuildProps$1$1$2
                @Override // o.drM
                public /* synthetic */ Boolean invoke(String str) {
                    return Boolean.valueOf(a(str));
                }

                public final boolean a(String str) {
                    boolean i;
                    boolean i2;
                    i = C8691duz.i(str, "ro.debuggable=[1]", false, 2, null);
                    if (!i) {
                        i2 = C8691duz.i(str, "ro.secure=[0]", false, 2, null);
                        if (!i2) {
                            return false;
                        }
                    }
                    return true;
                }
            });
            m = C8670due.m(f);
            C8608drx.a(bufferedReader, null);
            return m;
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            Result.e(C8556dpz.a(th));
            return false;
        }
    }

    public final boolean d(ProcessBuilder processBuilder) {
        List<String> j;
        Process start;
        j = C8569dql.j("which", "su");
        processBuilder.command(j);
        Process process = null;
        try {
            start = processBuilder.start();
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(start.getInputStream(), C8674dui.i);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            boolean e = e(bufferedReader);
            C8608drx.a(bufferedReader, null);
            start.destroy();
            return e;
        } catch (IOException unused2) {
            process = start;
            if (process != null) {
                process.destroy();
            }
            return false;
        } catch (Throwable th2) {
            process = start;
            th = th2;
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    private final boolean e(Reader reader) {
        boolean c2;
        do {
            int read = reader.read();
            if (read == -1) {
                return false;
            }
            c2 = C8672dug.c((char) read);
        } while (c2);
        return true;
    }

    private final boolean f() {
        if (this.f) {
            return performNativeRootChecks();
        }
        return false;
    }
}
