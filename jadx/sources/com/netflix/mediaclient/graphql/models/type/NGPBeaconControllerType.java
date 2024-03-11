package com.netflix.mediaclient.graphql.models.type;

import java.util.Iterator;
import java.util.List;
import o.C8566dqi;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NGPBeaconControllerType {
    private static final /* synthetic */ NGPBeaconControllerType[] b;
    public static final b c;
    private static final /* synthetic */ InterfaceC8598drn d;
    private static final C9033hu h;
    private final String j;
    public static final NGPBeaconControllerType a = new NGPBeaconControllerType("WEBVIEW", 0, "WEBVIEW");
    public static final NGPBeaconControllerType e = new NGPBeaconControllerType("UNKNOWN__", 1, "UNKNOWN__");

    private static final /* synthetic */ NGPBeaconControllerType[] a() {
        return new NGPBeaconControllerType[]{a, e};
    }

    public static InterfaceC8598drn<NGPBeaconControllerType> d() {
        return d;
    }

    public static NGPBeaconControllerType valueOf(String str) {
        return (NGPBeaconControllerType) Enum.valueOf(NGPBeaconControllerType.class, str);
    }

    public static NGPBeaconControllerType[] values() {
        return (NGPBeaconControllerType[]) b.clone();
    }

    public final String e() {
        return this.j;
    }

    private NGPBeaconControllerType(String str, int i, String str2) {
        this.j = str2;
    }

    static {
        List e2;
        NGPBeaconControllerType[] a2 = a();
        b = a2;
        d = C8600drp.e(a2);
        c = new b(null);
        e2 = C8566dqi.e("WEBVIEW");
        h = new C9033hu("NGPBeaconControllerType", e2);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C9033hu e() {
            return NGPBeaconControllerType.h;
        }

        public final NGPBeaconControllerType a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = NGPBeaconControllerType.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((NGPBeaconControllerType) obj).e(), (Object) str)) {
                    break;
                }
            }
            NGPBeaconControllerType nGPBeaconControllerType = (NGPBeaconControllerType) obj;
            return nGPBeaconControllerType == null ? NGPBeaconControllerType.e : nGPBeaconControllerType;
        }
    }
}
