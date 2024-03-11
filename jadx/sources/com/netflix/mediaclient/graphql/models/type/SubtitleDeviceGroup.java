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
public final class SubtitleDeviceGroup {
    public static final d a;
    public static final SubtitleDeviceGroup b = new SubtitleDeviceGroup("WEB", 0, "WEB");
    public static final SubtitleDeviceGroup c = new SubtitleDeviceGroup("TVUI", 1, "TVUI");
    public static final SubtitleDeviceGroup d = new SubtitleDeviceGroup("MOBILE", 2, "MOBILE");
    public static final SubtitleDeviceGroup e = new SubtitleDeviceGroup("UNKNOWN__", 3, "UNKNOWN__");
    private static final C9033hu g;
    private static final /* synthetic */ SubtitleDeviceGroup[] h;
    private static final /* synthetic */ InterfaceC8598drn i;
    private final String j;

    private static final /* synthetic */ SubtitleDeviceGroup[] a() {
        return new SubtitleDeviceGroup[]{b, c, d, e};
    }

    public static InterfaceC8598drn<SubtitleDeviceGroup> b() {
        return i;
    }

    public static SubtitleDeviceGroup valueOf(String str) {
        return (SubtitleDeviceGroup) Enum.valueOf(SubtitleDeviceGroup.class, str);
    }

    public static SubtitleDeviceGroup[] values() {
        return (SubtitleDeviceGroup[]) h.clone();
    }

    public final String e() {
        return this.j;
    }

    private SubtitleDeviceGroup(String str, int i2, String str2) {
        this.j = str2;
    }

    static {
        List j;
        SubtitleDeviceGroup[] a2 = a();
        h = a2;
        i = C8600drp.e(a2);
        a = new d(null);
        j = C8569dql.j("WEB", "TVUI", "MOBILE");
        g = new C9033hu("SubtitleDeviceGroup", j);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final SubtitleDeviceGroup a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = SubtitleDeviceGroup.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((SubtitleDeviceGroup) obj).e(), (Object) str)) {
                    break;
                }
            }
            SubtitleDeviceGroup subtitleDeviceGroup = (SubtitleDeviceGroup) obj;
            return subtitleDeviceGroup == null ? SubtitleDeviceGroup.e : subtitleDeviceGroup;
        }
    }
}
