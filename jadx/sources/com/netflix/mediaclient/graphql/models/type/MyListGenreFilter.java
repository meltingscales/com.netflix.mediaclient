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
public final class MyListGenreFilter {
    private static final /* synthetic */ InterfaceC8598drn c;
    public static final b e;
    private static final C9033hu f;
    private static final /* synthetic */ MyListGenreFilter[] h;
    private final String i;
    public static final MyListGenreFilter b = new MyListGenreFilter("SERIES", 0, "SERIES");
    public static final MyListGenreFilter d = new MyListGenreFilter("MOVIE", 1, "MOVIE");
    public static final MyListGenreFilter a = new MyListGenreFilter("UNKNOWN__", 2, "UNKNOWN__");

    public static InterfaceC8598drn<MyListGenreFilter> a() {
        return c;
    }

    private static final /* synthetic */ MyListGenreFilter[] e() {
        return new MyListGenreFilter[]{b, d, a};
    }

    public static MyListGenreFilter valueOf(String str) {
        return (MyListGenreFilter) Enum.valueOf(MyListGenreFilter.class, str);
    }

    public static MyListGenreFilter[] values() {
        return (MyListGenreFilter[]) h.clone();
    }

    public final String c() {
        return this.i;
    }

    private MyListGenreFilter(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        List j;
        MyListGenreFilter[] e2 = e();
        h = e2;
        c = C8600drp.e(e2);
        e = new b(null);
        j = C8569dql.j("SERIES", "MOVIE");
        f = new C9033hu("MyListGenreFilter", j);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final MyListGenreFilter b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = MyListGenreFilter.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((MyListGenreFilter) obj).c(), (Object) str)) {
                    break;
                }
            }
            MyListGenreFilter myListGenreFilter = (MyListGenreFilter) obj;
            return myListGenreFilter == null ? MyListGenreFilter.a : myListGenreFilter;
        }
    }
}
