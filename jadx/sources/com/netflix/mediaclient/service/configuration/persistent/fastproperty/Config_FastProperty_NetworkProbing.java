package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import o.C1822aPn;
import o.C8566dqi;
import o.C8569dql;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_NetworkProbing extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("d6")
    private boolean dnsEnableIpv6;
    @SerializedName("dH")
    private List<String> dnsHostnames;
    @SerializedName("dR")
    private List<? extends List<String>> dnsResolvers;
    @SerializedName("dE")
    private boolean isDnsProbingEnabled = true;
    @SerializedName("tE")
    private boolean isTracerouteProbingEnabled;
    @SerializedName("tC")
    private int tracerouteConcurrency;
    @SerializedName("tEt")
    private int tracerouteEndTtl;
    @SerializedName("tS")
    private int tracerouteStartTtl;
    @SerializedName("tT")
    private int tracerouteTimeout;
    @SerializedName("tU")
    private int tracerouteUrlCount;

    public final boolean getDnsEnableIpv6() {
        return this.dnsEnableIpv6;
    }

    public final List<String> getDnsHostnames() {
        return this.dnsHostnames;
    }

    public final List<List<String>> getDnsResolvers() {
        return this.dnsResolvers;
    }

    @Override // o.aRW
    public String getName() {
        return "netprobe";
    }

    public final int getTracerouteConcurrency() {
        return this.tracerouteConcurrency;
    }

    public final int getTracerouteEndTtl() {
        return this.tracerouteEndTtl;
    }

    public final int getTracerouteStartTtl() {
        return this.tracerouteStartTtl;
    }

    public final int getTracerouteTimeout() {
        return this.tracerouteTimeout;
    }

    public final int getTracerouteUrlCount() {
        return this.tracerouteUrlCount;
    }

    public final boolean isDnsProbingEnabled() {
        return this.isDnsProbingEnabled;
    }

    public final boolean isTracerouteProbingEnabled() {
        return this.isTracerouteProbingEnabled;
    }

    public Config_FastProperty_NetworkProbing() {
        List j;
        List e;
        List<? extends List<String>> j2;
        List<String> j3;
        j = C8569dql.j("8.8.8.8", "8.8.4.4");
        e = C8566dqi.e("2001:4860:4860::8888");
        j2 = C8569dql.j(j, e);
        this.dnsResolvers = j2;
        j3 = C8569dql.j("www.netflix.com", "android.prod.cloud.netflix.com");
        this.dnsHostnames = j3;
        this.dnsEnableIpv6 = true;
        this.isTracerouteProbingEnabled = true;
        this.tracerouteTimeout = 30000;
        this.tracerouteStartTtl = 2;
        this.tracerouteEndTtl = 2;
        this.tracerouteConcurrency = 1;
        this.tracerouteUrlCount = 1;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final boolean a() {
            return k().isDnsProbingEnabled();
        }

        public final List<List<String>> b() {
            return k().getDnsResolvers();
        }

        public final List<String> e() {
            return k().getDnsHostnames();
        }

        public final boolean d() {
            return k().getDnsEnableIpv6();
        }

        public final boolean c() {
            return k().isTracerouteProbingEnabled();
        }

        public final int j() {
            return k().getTracerouteTimeout();
        }

        public final int g() {
            return k().getTracerouteStartTtl();
        }

        public final int h() {
            return k().getTracerouteEndTtl();
        }

        public final int f() {
            return k().getTracerouteConcurrency();
        }

        public final int i() {
            return k().getTracerouteUrlCount();
        }

        private final Config_FastProperty_NetworkProbing k() {
            return (Config_FastProperty_NetworkProbing) C1822aPn.b("netprobe");
        }
    }
}
