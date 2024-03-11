package com.netflix.mediaclient.service.msl;

import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class MslServiceState {
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final /* synthetic */ MslServiceState[] k;
    public static final MslServiceState j = new MslServiceState("INIT", 0) { // from class: com.netflix.mediaclient.service.msl.MslServiceState.INIT
        @Override // com.netflix.mediaclient.service.msl.MslServiceState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.W;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final MslServiceState d = new MslServiceState("CREATE_MSL_CLIENT", 1) { // from class: com.netflix.mediaclient.service.msl.MslServiceState.CREATE_MSL_CLIENT
        @Override // com.netflix.mediaclient.service.msl.MslServiceState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.P;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final MslServiceState e = new MslServiceState("CREATE_MSL_CONTEXT", 2) { // from class: com.netflix.mediaclient.service.msl.MslServiceState.CREATE_MSL_CONTEXT
        @Override // com.netflix.mediaclient.service.msl.MslServiceState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.O;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final MslServiceState i = new MslServiceState("LOAD_MSL_STORE", 3) { // from class: com.netflix.mediaclient.service.msl.MslServiceState.LOAD_MSL_STORE
        @Override // com.netflix.mediaclient.service.msl.MslServiceState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.T;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final MslServiceState b = new MslServiceState("ESN_MIGRATION", 4) { // from class: com.netflix.mediaclient.service.msl.MslServiceState.ESN_MIGRATION
        @Override // com.netflix.mediaclient.service.msl.MslServiceState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.R;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final MslServiceState a = new MslServiceState("ESN_MIGRATION_PING", 5) { // from class: com.netflix.mediaclient.service.msl.MslServiceState.ESN_MIGRATION_PING
        @Override // com.netflix.mediaclient.service.msl.MslServiceState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.S;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final MslServiceState c = new MslServiceState("APPBOOT", 6) { // from class: com.netflix.mediaclient.service.msl.MslServiceState.APPBOOT
        @Override // com.netflix.mediaclient.service.msl.MslServiceState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.Q;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final MslServiceState h = new MslServiceState("READY", 7) { // from class: com.netflix.mediaclient.service.msl.MslServiceState.READY
        @Override // com.netflix.mediaclient.service.msl.MslServiceState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.A;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final MslServiceState f = new MslServiceState("FAILED", 8) { // from class: com.netflix.mediaclient.service.msl.MslServiceState.FAILED
        @Override // com.netflix.mediaclient.service.msl.MslServiceState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.A;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };

    public /* synthetic */ MslServiceState(String str, int i2, C8627dsp c8627dsp) {
        this(str, i2);
    }

    private static final /* synthetic */ MslServiceState[] b() {
        return new MslServiceState[]{j, d, e, i, b, a, c, h, f};
    }

    public static MslServiceState valueOf(String str) {
        return (MslServiceState) Enum.valueOf(MslServiceState.class, str);
    }

    public static MslServiceState[] values() {
        return (MslServiceState[]) k.clone();
    }

    public abstract Status c();

    private MslServiceState(String str, int i2) {
    }

    static {
        MslServiceState[] b2 = b();
        k = b2;
        g = C8600drp.e(b2);
    }
}
