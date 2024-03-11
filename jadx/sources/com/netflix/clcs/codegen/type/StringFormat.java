package com.netflix.clcs.codegen.type;

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
/* loaded from: classes2.dex */
public final class StringFormat {
    private static final /* synthetic */ InterfaceC8598drn a;
    public static final a d;
    private static final C9033hu f;
    private static final /* synthetic */ StringFormat[] i;
    private final String j;
    public static final StringFormat e = new StringFormat("HTML", 0, "HTML");
    public static final StringFormat b = new StringFormat("MARKDOWN", 1, "MARKDOWN");
    public static final StringFormat c = new StringFormat("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ StringFormat[] a() {
        return new StringFormat[]{e, b, c};
    }

    public static InterfaceC8598drn<StringFormat> b() {
        return a;
    }

    public static StringFormat valueOf(String str) {
        return (StringFormat) Enum.valueOf(StringFormat.class, str);
    }

    public static StringFormat[] values() {
        return (StringFormat[]) i.clone();
    }

    public final String c() {
        return this.j;
    }

    private StringFormat(String str, int i2, String str2) {
        this.j = str2;
    }

    static {
        List j;
        StringFormat[] a2 = a();
        i = a2;
        a = C8600drp.e(a2);
        d = new a(null);
        j = C8569dql.j("HTML", "MARKDOWN");
        f = new C9033hu("StringFormat", j);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final StringFormat e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = StringFormat.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((StringFormat) obj).c(), (Object) str)) {
                    break;
                }
            }
            StringFormat stringFormat = (StringFormat) obj;
            return stringFormat == null ? StringFormat.c : stringFormat;
        }
    }
}
