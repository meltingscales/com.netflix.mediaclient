package com.netflix.mediaclient.log.impl;

import android.content.Context;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1045Mp;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.InterfaceC1593aHa;

@Singleton
/* loaded from: classes3.dex */
public final class BreadcrumbLoggerImpl implements InterfaceC1593aHa {
    public static final b e = new b(null);
    private final Context a;
    private final Set<ExternalCrashReporter> b;
    private final List<String> d;
    private final LoggerConfig i;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface BreadcrumbLoggerModule {
        @Binds
        InterfaceC1593aHa b(BreadcrumbLoggerImpl breadcrumbLoggerImpl);
    }

    @Inject
    public BreadcrumbLoggerImpl(@ApplicationContext Context context, LoggerConfig loggerConfig, Set<ExternalCrashReporter> set) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loggerConfig, "");
        C8632dsu.c((Object) set, "");
        this.a = context;
        this.i = loggerConfig;
        this.b = set;
        this.d = Collections.synchronizedList(new LinkedList<String>() { // from class: com.netflix.mediaclient.log.impl.BreadcrumbLoggerImpl$breadcrumbs$1
            public boolean a(String str) {
                return super.remove(str);
            }

            public int b(String str) {
                return super.lastIndexOf(str);
            }

            public int c() {
                return super.size();
            }

            public int c(String str) {
                return super.indexOf(str);
            }

            @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
            public final boolean contains(Object obj) {
                if (obj instanceof String) {
                    return e((String) obj);
                }
                return false;
            }

            public boolean e(String str) {
                return super.contains(str);
            }

            @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
            public final int indexOf(Object obj) {
                if (obj instanceof String) {
                    return c((String) obj);
                }
                return -1;
            }

            @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
            public final int lastIndexOf(Object obj) {
                if (obj instanceof String) {
                    return b((String) obj);
                }
                return -1;
            }

            @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
            public final boolean remove(Object obj) {
                if (obj instanceof String) {
                    return a((String) obj);
                }
                return false;
            }

            @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
            public final int size() {
                return c();
            }

            @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
            /* renamed from: d */
            public boolean add(String str) {
                C8632dsu.c((Object) str, "");
                boolean add = super.add(str);
                while (add && size() > 50) {
                    super.remove();
                }
                return add;
            }
        });
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("BreadcrumbLoggerImpl");
        }
    }

    @Override // o.InterfaceC1593aHa
    public List<String> a() {
        List<String> U;
        List<String> list = this.d;
        C8632dsu.a(list, "");
        U = C8576dqs.U(list);
        return U;
    }

    @Override // o.InterfaceC1593aHa
    public void d(String str) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                this.d.add(str);
                if (this.i.d()) {
                    for (ExternalCrashReporter externalCrashReporter : this.b) {
                        externalCrashReporter.c(str);
                    }
                    return;
                }
                return;
            }
        }
        if (this.i.c()) {
            throw new IllegalArgumentException("leaveBreadcrumb: breadcrumb is null!");
        }
    }
}
