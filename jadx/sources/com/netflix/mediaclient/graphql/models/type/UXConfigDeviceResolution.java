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
public final class UXConfigDeviceResolution {
    public static final c d;
    private static final /* synthetic */ UXConfigDeviceResolution[] g;
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final C9033hu i;
    private final String j;
    public static final UXConfigDeviceResolution b = new UXConfigDeviceResolution("LOW", 0, "LOW");
    public static final UXConfigDeviceResolution c = new UXConfigDeviceResolution("MEDIUM", 1, "MEDIUM");
    public static final UXConfigDeviceResolution e = new UXConfigDeviceResolution("HIGH", 2, "HIGH");
    public static final UXConfigDeviceResolution a = new UXConfigDeviceResolution("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<UXConfigDeviceResolution> a() {
        return h;
    }

    private static final /* synthetic */ UXConfigDeviceResolution[] b() {
        return new UXConfigDeviceResolution[]{b, c, e, a};
    }

    public static UXConfigDeviceResolution valueOf(String str) {
        return (UXConfigDeviceResolution) Enum.valueOf(UXConfigDeviceResolution.class, str);
    }

    public static UXConfigDeviceResolution[] values() {
        return (UXConfigDeviceResolution[]) g.clone();
    }

    public final String e() {
        return this.j;
    }

    private UXConfigDeviceResolution(String str, int i2, String str2) {
        this.j = str2;
    }

    static {
        List j;
        UXConfigDeviceResolution[] b2 = b();
        g = b2;
        h = C8600drp.e(b2);
        d = new c(null);
        j = C8569dql.j("LOW", "MEDIUM", "HIGH");
        i = new C9033hu("UXConfigDeviceResolution", j);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final UXConfigDeviceResolution e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = UXConfigDeviceResolution.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((UXConfigDeviceResolution) obj).e(), (Object) str)) {
                    break;
                }
            }
            UXConfigDeviceResolution uXConfigDeviceResolution = (UXConfigDeviceResolution) obj;
            return uXConfigDeviceResolution == null ? UXConfigDeviceResolution.a : uXConfigDeviceResolution;
        }
    }
}
