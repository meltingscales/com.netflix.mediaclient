package com.netflix.mediaclient.service.configuration;

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
public abstract class ConfigurationState {
    private static final /* synthetic */ InterfaceC8598drn i;
    private static final /* synthetic */ ConfigurationState[] l;
    public static final ConfigurationState j = new ConfigurationState("INIT", 0) { // from class: com.netflix.mediaclient.service.configuration.ConfigurationState.INIT
        @Override // com.netflix.mediaclient.service.configuration.ConfigurationState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.F;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final ConfigurationState a = new ConfigurationState("FETCH_CONFIG", 1) { // from class: com.netflix.mediaclient.service.configuration.ConfigurationState.FETCH_CONFIG
        @Override // com.netflix.mediaclient.service.configuration.ConfigurationState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.z;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final ConfigurationState b = new ConfigurationState("CREATE_CRYPTO_PROVIDER", 2) { // from class: com.netflix.mediaclient.service.configuration.ConfigurationState.CREATE_CRYPTO_PROVIDER
        @Override // com.netflix.mediaclient.service.configuration.ConfigurationState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.B;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final ConfigurationState g = new ConfigurationState("FIND_DEVICE_ID", 3) { // from class: com.netflix.mediaclient.service.configuration.ConfigurationState.FIND_DEVICE_ID
        @Override // com.netflix.mediaclient.service.configuration.ConfigurationState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.H;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final ConfigurationState e = new ConfigurationState("CREATE_ESN", 4) { // from class: com.netflix.mediaclient.service.configuration.ConfigurationState.CREATE_ESN
        @Override // com.netflix.mediaclient.service.configuration.ConfigurationState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.D;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final ConfigurationState f = new ConfigurationState("INIT_CRYPTO", 5) { // from class: com.netflix.mediaclient.service.configuration.ConfigurationState.INIT_CRYPTO
        @Override // com.netflix.mediaclient.service.configuration.ConfigurationState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.E;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final ConfigurationState d = new ConfigurationState("FETCH_ESN_CONFIG", 6) { // from class: com.netflix.mediaclient.service.configuration.ConfigurationState.FETCH_ESN_CONFIG
        @Override // com.netflix.mediaclient.service.configuration.ConfigurationState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.L;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final ConfigurationState h = new ConfigurationState("READY", 7) { // from class: com.netflix.mediaclient.service.configuration.ConfigurationState.READY
        @Override // com.netflix.mediaclient.service.configuration.ConfigurationState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.A;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };
    public static final ConfigurationState c = new ConfigurationState("FAILED", 8) { // from class: com.netflix.mediaclient.service.configuration.ConfigurationState.FAILED
        @Override // com.netflix.mediaclient.service.configuration.ConfigurationState
        public Status c() {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.A;
            C8632dsu.a(netflixImmutableStatus, "");
            return netflixImmutableStatus;
        }
    };

    public /* synthetic */ ConfigurationState(String str, int i2, C8627dsp c8627dsp) {
        this(str, i2);
    }

    private static final /* synthetic */ ConfigurationState[] b() {
        return new ConfigurationState[]{j, a, b, g, e, f, d, h, c};
    }

    public static ConfigurationState valueOf(String str) {
        return (ConfigurationState) Enum.valueOf(ConfigurationState.class, str);
    }

    public static ConfigurationState[] values() {
        return (ConfigurationState[]) l.clone();
    }

    public abstract Status c();

    private ConfigurationState(String str, int i2) {
    }

    static {
        ConfigurationState[] b2 = b();
        l = b2;
        i = C8600drp.e(b2);
    }
}
