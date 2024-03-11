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
public final class NGPRedeemBeaconFailureReason {
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final /* synthetic */ NGPRedeemBeaconFailureReason[] h;
    private static final C9033hu i;
    public static final b j;

    /* renamed from: o  reason: collision with root package name */
    private final String f13179o;
    public static final NGPRedeemBeaconFailureReason e = new NGPRedeemBeaconFailureReason("BEACON_CODE_NOT_FOUND", 0, "BEACON_CODE_NOT_FOUND");
    public static final NGPRedeemBeaconFailureReason d = new NGPRedeemBeaconFailureReason("BEACON_CODE_INVALID", 1, "BEACON_CODE_INVALID");
    public static final NGPRedeemBeaconFailureReason b = new NGPRedeemBeaconFailureReason("BEACON_CODE_EXPIRED", 2, "BEACON_CODE_EXPIRED");
    public static final NGPRedeemBeaconFailureReason a = new NGPRedeemBeaconFailureReason("BEACON_CODE_CLOSED", 3, "BEACON_CODE_CLOSED");
    public static final NGPRedeemBeaconFailureReason c = new NGPRedeemBeaconFailureReason("BEACON_CODE_UNAUTHENTICATED", 4, "BEACON_CODE_UNAUTHENTICATED");
    public static final NGPRedeemBeaconFailureReason f = new NGPRedeemBeaconFailureReason("UNKNOWN__", 5, "UNKNOWN__");

    public static InterfaceC8598drn<NGPRedeemBeaconFailureReason> d() {
        return g;
    }

    private static final /* synthetic */ NGPRedeemBeaconFailureReason[] e() {
        return new NGPRedeemBeaconFailureReason[]{e, d, b, a, c, f};
    }

    public static NGPRedeemBeaconFailureReason valueOf(String str) {
        return (NGPRedeemBeaconFailureReason) Enum.valueOf(NGPRedeemBeaconFailureReason.class, str);
    }

    public static NGPRedeemBeaconFailureReason[] values() {
        return (NGPRedeemBeaconFailureReason[]) h.clone();
    }

    public final String c() {
        return this.f13179o;
    }

    private NGPRedeemBeaconFailureReason(String str, int i2, String str2) {
        this.f13179o = str2;
    }

    static {
        List j2;
        NGPRedeemBeaconFailureReason[] e2 = e();
        h = e2;
        g = C8600drp.e(e2);
        j = new b(null);
        j2 = C8569dql.j("BEACON_CODE_NOT_FOUND", "BEACON_CODE_INVALID", "BEACON_CODE_EXPIRED", "BEACON_CODE_CLOSED", "BEACON_CODE_UNAUTHENTICATED");
        i = new C9033hu("NGPRedeemBeaconFailureReason", j2);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C9033hu c() {
            return NGPRedeemBeaconFailureReason.i;
        }

        public final NGPRedeemBeaconFailureReason a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = NGPRedeemBeaconFailureReason.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((NGPRedeemBeaconFailureReason) obj).c(), (Object) str)) {
                    break;
                }
            }
            NGPRedeemBeaconFailureReason nGPRedeemBeaconFailureReason = (NGPRedeemBeaconFailureReason) obj;
            return nGPRedeemBeaconFailureReason == null ? NGPRedeemBeaconFailureReason.f : nGPRedeemBeaconFailureReason;
        }
    }
}
