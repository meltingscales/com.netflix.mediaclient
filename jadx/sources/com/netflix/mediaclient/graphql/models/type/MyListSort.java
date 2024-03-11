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
public final class MyListSort {
    public static final e e;
    private static final /* synthetic */ MyListSort[] g;
    private static final C9033hu h;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String i;
    public static final MyListSort b = new MyListSort("SUGGESTED", 0, "SUGGESTED");
    public static final MyListSort d = new MyListSort("DATE_ADDED_DESC", 1, "DATE_ADDED_DESC");
    public static final MyListSort c = new MyListSort("ALPHABETICAL_ASC", 2, "ALPHABETICAL_ASC");
    public static final MyListSort a = new MyListSort("RELEASE_DATE_DESC", 3, "RELEASE_DATE_DESC");
    public static final MyListSort f = new MyListSort("UNKNOWN__", 4, "UNKNOWN__");

    private static final /* synthetic */ MyListSort[] b() {
        return new MyListSort[]{b, d, c, a, f};
    }

    public static InterfaceC8598drn<MyListSort> e() {
        return j;
    }

    public static MyListSort valueOf(String str) {
        return (MyListSort) Enum.valueOf(MyListSort.class, str);
    }

    public static MyListSort[] values() {
        return (MyListSort[]) g.clone();
    }

    public final String a() {
        return this.i;
    }

    private MyListSort(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        List j2;
        MyListSort[] b2 = b();
        g = b2;
        j = C8600drp.e(b2);
        e = new e(null);
        j2 = C8569dql.j("SUGGESTED", "DATE_ADDED_DESC", "ALPHABETICAL_ASC", "RELEASE_DATE_DESC");
        h = new C9033hu("MyListSort", j2);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final MyListSort b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = MyListSort.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((MyListSort) obj).a(), (Object) str)) {
                    break;
                }
            }
            MyListSort myListSort = (MyListSort) obj;
            return myListSort == null ? MyListSort.f : myListSort;
        }
    }
}
