package com.netflix.mediaclient.graphql.models.type;

import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MyListProgressFilter {
    private static final /* synthetic */ InterfaceC8598drn b;
    public static final a c;
    private static final C9033hu g;
    private static final /* synthetic */ MyListProgressFilter[] j;
    private final String i;
    public static final MyListProgressFilter d = new MyListProgressFilter("STARTED", 0, "STARTED");
    public static final MyListProgressFilter a = new MyListProgressFilter("NOT_STARTED", 1, "NOT_STARTED");
    public static final MyListProgressFilter e = new MyListProgressFilter("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ MyListProgressFilter[] b() {
        return new MyListProgressFilter[]{d, a, e};
    }

    public static InterfaceC8598drn<MyListProgressFilter> c() {
        return b;
    }

    public static MyListProgressFilter valueOf(String str) {
        return (MyListProgressFilter) Enum.valueOf(MyListProgressFilter.class, str);
    }

    public static MyListProgressFilter[] values() {
        return (MyListProgressFilter[]) j.clone();
    }

    public final String e() {
        return this.i;
    }

    private MyListProgressFilter(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        List j2;
        MyListProgressFilter[] b2 = b();
        j = b2;
        b = C8600drp.e(b2);
        c = new a(null);
        j2 = C8569dql.j("STARTED", "NOT_STARTED");
        g = new C9033hu("MyListProgressFilter", j2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final MyListProgressFilter b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = MyListProgressFilter.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((MyListProgressFilter) obj).e(), (Object) str)) {
                    break;
                }
            }
            MyListProgressFilter myListProgressFilter = (MyListProgressFilter) obj;
            return myListProgressFilter == null ? MyListProgressFilter.e : myListProgressFilter;
        }
    }
}
