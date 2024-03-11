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
public final class UXConfigDeviceLevel {
    public static final c c;
    private static final /* synthetic */ InterfaceC8598drn d;
    private static final C9033hu f;
    private static final /* synthetic */ UXConfigDeviceLevel[] g;
    private final String i;
    public static final UXConfigDeviceLevel a = new UXConfigDeviceLevel("LOW", 0, "LOW");
    public static final UXConfigDeviceLevel b = new UXConfigDeviceLevel("HIGH", 1, "HIGH");
    public static final UXConfigDeviceLevel e = new UXConfigDeviceLevel("UNKNOWN__", 2, "UNKNOWN__");

    public static InterfaceC8598drn<UXConfigDeviceLevel> b() {
        return d;
    }

    private static final /* synthetic */ UXConfigDeviceLevel[] d() {
        return new UXConfigDeviceLevel[]{a, b, e};
    }

    public static UXConfigDeviceLevel valueOf(String str) {
        return (UXConfigDeviceLevel) Enum.valueOf(UXConfigDeviceLevel.class, str);
    }

    public static UXConfigDeviceLevel[] values() {
        return (UXConfigDeviceLevel[]) g.clone();
    }

    public final String c() {
        return this.i;
    }

    private UXConfigDeviceLevel(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        List j;
        UXConfigDeviceLevel[] d2 = d();
        g = d2;
        d = C8600drp.e(d2);
        c = new c(null);
        j = C8569dql.j("LOW", "HIGH");
        f = new C9033hu("UXConfigDeviceLevel", j);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final UXConfigDeviceLevel d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = UXConfigDeviceLevel.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((UXConfigDeviceLevel) obj).c(), (Object) str)) {
                    break;
                }
            }
            UXConfigDeviceLevel uXConfigDeviceLevel = (UXConfigDeviceLevel) obj;
            return uXConfigDeviceLevel == null ? UXConfigDeviceLevel.e : uXConfigDeviceLevel;
        }
    }
}
