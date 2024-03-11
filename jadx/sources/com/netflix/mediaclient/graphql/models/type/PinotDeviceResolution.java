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
public final class PinotDeviceResolution {
    public static final e d;
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final C9033hu h;
    private static final /* synthetic */ PinotDeviceResolution[] j;
    private final String f;
    public static final PinotDeviceResolution b = new PinotDeviceResolution("LOW", 0, "LOW");
    public static final PinotDeviceResolution e = new PinotDeviceResolution("MEDIUM", 1, "MEDIUM");
    public static final PinotDeviceResolution a = new PinotDeviceResolution("HIGH", 2, "HIGH");
    public static final PinotDeviceResolution c = new PinotDeviceResolution("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ PinotDeviceResolution[] b() {
        return new PinotDeviceResolution[]{b, e, a, c};
    }

    public static InterfaceC8598drn<PinotDeviceResolution> d() {
        return g;
    }

    public static PinotDeviceResolution valueOf(String str) {
        return (PinotDeviceResolution) Enum.valueOf(PinotDeviceResolution.class, str);
    }

    public static PinotDeviceResolution[] values() {
        return (PinotDeviceResolution[]) j.clone();
    }

    public final String c() {
        return this.f;
    }

    private PinotDeviceResolution(String str, int i, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        PinotDeviceResolution[] b2 = b();
        j = b2;
        g = C8600drp.e(b2);
        d = new e(null);
        j2 = C8569dql.j("LOW", "MEDIUM", "HIGH");
        h = new C9033hu("PinotDeviceResolution", j2);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final PinotDeviceResolution d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = PinotDeviceResolution.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((PinotDeviceResolution) obj).c(), (Object) str)) {
                    break;
                }
            }
            PinotDeviceResolution pinotDeviceResolution = (PinotDeviceResolution) obj;
            return pinotDeviceResolution == null ? PinotDeviceResolution.c : pinotDeviceResolution;
        }
    }
}
