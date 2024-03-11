package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_MSLTransport extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("numberOfAppBootRetriesOnFailure")
    private int numberOfAppBootRetriesOnFailure;
    @SerializedName("refreshProxyEsnTimeInMs")
    private long refreshProxyEsnTimeInMs;
    @SerializedName("cborEnabled")
    private boolean cborEnabled = true;
    @SerializedName("eccAppBootKeyEnabled")
    private boolean eccAppBootKeyEnabled = true;
    @SerializedName("handleBadChallenge")
    private boolean handleBadChallenge = true;
    @SerializedName("handleKeyRequestInvalid")
    private boolean handleKeyRequestInvalid = true;
    @SerializedName("handleAllZerosSignatureBadChallenge")
    private boolean handleAllZerosSignatureBadChallenge = true;
    @SerializedName("retryAppbootWithBackupKey")
    private boolean retryAppbootWithBackupKey = true;
    @SerializedName("delayOnAppBootRetriesInMs")
    private int delayOnAppBootRetriesInMs = 1000;
    @SerializedName("allowHttpForAppboot")
    private boolean allowHttpForAppboot = true;

    public static final long getProxyEsnRefreshTimeInMs() {
        return Companion.e();
    }

    public static final boolean isCborEnabled() {
        return Companion.a();
    }

    public static final boolean isEccAppBootKeyEnabled() {
        return Companion.c();
    }

    public static final boolean shouldHandleAllZerosSigantureBadChallenge() {
        return Companion.j();
    }

    public static final boolean shouldHandleBadChallenge() {
        return Companion.g();
    }

    public static final boolean shouldHandleKeyRequestInvalid() {
        return Companion.f();
    }

    public final boolean getAllowHttpForAppboot() {
        return this.allowHttpForAppboot;
    }

    public final boolean getCborEnabled() {
        return this.cborEnabled;
    }

    public final int getDelayOnAppBootRetriesInMs() {
        return this.delayOnAppBootRetriesInMs;
    }

    public final boolean getEccAppBootKeyEnabled() {
        return this.eccAppBootKeyEnabled;
    }

    public final boolean getHandleAllZerosSignatureBadChallenge() {
        return this.handleAllZerosSignatureBadChallenge;
    }

    public final boolean getHandleBadChallenge() {
        return this.handleBadChallenge;
    }

    public final boolean getHandleKeyRequestInvalid() {
        return this.handleKeyRequestInvalid;
    }

    @Override // o.aRW
    public String getName() {
        return "mslTransportConfiguration";
    }

    public final int getNumberOfAppBootRetriesOnFailure() {
        return this.numberOfAppBootRetriesOnFailure;
    }

    public final long getRefreshProxyEsnTimeInMs() {
        return this.refreshProxyEsnTimeInMs;
    }

    public final boolean getRetryAppbootWithBackupKey() {
        return this.retryAppbootWithBackupKey;
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("Config_FastProperty_MSLTransport");
        }

        public final boolean a() {
            return k().getCborEnabled();
        }

        public final boolean c() {
            return k().getEccAppBootKeyEnabled();
        }

        public final long e() {
            return k().getRefreshProxyEsnTimeInMs();
        }

        public final boolean g() {
            return k().getHandleBadChallenge();
        }

        public final boolean f() {
            return k().getHandleKeyRequestInvalid();
        }

        public final boolean j() {
            return k().getHandleAllZerosSignatureBadChallenge();
        }

        public final int d() {
            return k().getNumberOfAppBootRetriesOnFailure();
        }

        public final int b() {
            return k().getDelayOnAppBootRetriesInMs();
        }

        public final boolean h() {
            return k().getRetryAppbootWithBackupKey();
        }

        public final boolean i() {
            return k().getAllowHttpForAppboot();
        }

        private final Config_FastProperty_MSLTransport k() {
            aRW b = C1822aPn.b("mslTransportConfiguration");
            C8632dsu.a(b, "");
            return (Config_FastProperty_MSLTransport) b;
        }
    }
}
