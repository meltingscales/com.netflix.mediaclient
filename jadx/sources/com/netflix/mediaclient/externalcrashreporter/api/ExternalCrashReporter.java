package com.netflix.mediaclient.externalcrashreporter.api;

import android.content.Context;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.Multibinds;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C8632dsu;
import o.XC;

/* loaded from: classes.dex */
public interface ExternalCrashReporter {
    public static final e c = e.d;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes.dex */
    public interface ReporterModule {
        @Multibinds
        Set<ExternalCrashReporter> b();
    }

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes.dex */
    public interface b {
        Set<ExternalCrashReporter> K();
    }

    static Set<ExternalCrashReporter> a(Context context) {
        return c.b(context);
    }

    void a(List<XC> list);

    void b(a aVar);

    void c(String str);

    void c(List<XC> list);

    void d(Context context, boolean z);

    void d(String str, String str2);

    void e(String str, boolean z);

    /* loaded from: classes.dex */
    public static final class e {
        static final /* synthetic */ e d = new e();

        private e() {
        }

        public final Set<ExternalCrashReporter> b(Context context) {
            C8632dsu.c((Object) context, "");
            return ((b) EntryPointAccessors.fromApplication(context, b.class)).K();
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        private final Throwable b;
        private final Map<String, String> c;

        public final Throwable b() {
            return this.b;
        }

        public final Map<String, String> c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.b, aVar.b) && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            Throwable th = this.b;
            Map<String, String> map = this.c;
            return "ExternalHandledException(throwable=" + th + ", additionalData=" + map + ")";
        }

        public a(Throwable th, Map<String, String> map) {
            C8632dsu.c((Object) th, "");
            C8632dsu.c((Object) map, "");
            this.b = th;
            this.c = map;
        }
    }
}
