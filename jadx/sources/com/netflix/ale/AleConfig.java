package com.netflix.ale;

import java.security.SecureRandom;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class AleConfig {
    public static final Companion Companion = new Companion(null);
    private AleCrypto crypto;
    private AleKeyxScheme keyx;
    private AleScheme scheme;
    private AleUseCase type;
    private AleUtil util;

    public final AleCrypto getCrypto() {
        return this.crypto;
    }

    public final AleKeyxScheme getKeyx() {
        return this.keyx;
    }

    public final AleScheme getScheme() {
        return this.scheme;
    }

    public final AleUseCase getType() {
        return this.type;
    }

    public final AleUtil getUtil() {
        return this.util;
    }

    public final void setCrypto(AleCrypto aleCrypto) {
        C8632dsu.c((Object) aleCrypto, "");
        this.crypto = aleCrypto;
    }

    public final void setKeyx(AleKeyxScheme aleKeyxScheme) {
        C8632dsu.c((Object) aleKeyxScheme, "");
        this.keyx = aleKeyxScheme;
    }

    public final void setScheme(AleScheme aleScheme) {
        C8632dsu.c((Object) aleScheme, "");
        this.scheme = aleScheme;
    }

    public final void setType(AleUseCase aleUseCase) {
        C8632dsu.c((Object) aleUseCase, "");
        this.type = aleUseCase;
    }

    public final void setUtil(AleUtil aleUtil) {
        C8632dsu.c((Object) aleUtil, "");
        this.util = aleUtil;
    }

    public AleConfig(AleScheme aleScheme, AleKeyxScheme aleKeyxScheme, AleUseCase aleUseCase, AleCrypto aleCrypto, AleUtil aleUtil) {
        C8632dsu.c((Object) aleScheme, "");
        C8632dsu.c((Object) aleKeyxScheme, "");
        C8632dsu.c((Object) aleUseCase, "");
        C8632dsu.c((Object) aleCrypto, "");
        C8632dsu.c((Object) aleUtil, "");
        this.scheme = aleScheme;
        this.keyx = aleKeyxScheme;
        this.type = aleUseCase;
        this.crypto = aleCrypto;
        this.util = aleUtil;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Builder newBuilder() {
            return new Builder(null, null, null, null, null, 31, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Builder {
        private AleCrypto crypto;
        private AleKeyxScheme keyx;
        private AleScheme scheme;
        private AleUseCase type;
        private AleUtil util;

        public Builder() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, AleScheme aleScheme, AleKeyxScheme aleKeyxScheme, AleUseCase aleUseCase, AleCrypto aleCrypto, AleUtil aleUtil, int i, Object obj) {
            if ((i & 1) != 0) {
                aleScheme = builder.scheme;
            }
            if ((i & 2) != 0) {
                aleKeyxScheme = builder.keyx;
            }
            AleKeyxScheme aleKeyxScheme2 = aleKeyxScheme;
            if ((i & 4) != 0) {
                aleUseCase = builder.type;
            }
            AleUseCase aleUseCase2 = aleUseCase;
            if ((i & 8) != 0) {
                aleCrypto = builder.crypto;
            }
            AleCrypto aleCrypto2 = aleCrypto;
            if ((i & 16) != 0) {
                aleUtil = builder.util;
            }
            return builder.copy(aleScheme, aleKeyxScheme2, aleUseCase2, aleCrypto2, aleUtil);
        }

        public final AleScheme component1() {
            return this.scheme;
        }

        public final AleKeyxScheme component2() {
            return this.keyx;
        }

        public final AleUseCase component3() {
            return this.type;
        }

        public final AleCrypto component4() {
            return this.crypto;
        }

        public final AleUtil component5() {
            return this.util;
        }

        public final Builder copy(AleScheme aleScheme, AleKeyxScheme aleKeyxScheme, AleUseCase aleUseCase, AleCrypto aleCrypto, AleUtil aleUtil) {
            C8632dsu.c((Object) aleScheme, "");
            C8632dsu.c((Object) aleKeyxScheme, "");
            C8632dsu.c((Object) aleUseCase, "");
            C8632dsu.c((Object) aleCrypto, "");
            C8632dsu.c((Object) aleUtil, "");
            return new Builder(aleScheme, aleKeyxScheme, aleUseCase, aleCrypto, aleUtil);
        }

        public final Builder crypto(AleCrypto aleCrypto) {
            C8632dsu.c((Object) aleCrypto, "");
            this.crypto = aleCrypto;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Builder) {
                Builder builder = (Builder) obj;
                return this.scheme == builder.scheme && this.keyx == builder.keyx && this.type == builder.type && C8632dsu.c(this.crypto, builder.crypto) && C8632dsu.c(this.util, builder.util);
            }
            return false;
        }

        public final AleCrypto getCrypto() {
            return this.crypto;
        }

        public final AleKeyxScheme getKeyx() {
            return this.keyx;
        }

        public final AleScheme getScheme() {
            return this.scheme;
        }

        public final AleUseCase getType() {
            return this.type;
        }

        public final AleUtil getUtil() {
            return this.util;
        }

        public int hashCode() {
            return (((((((this.scheme.hashCode() * 31) + this.keyx.hashCode()) * 31) + this.type.hashCode()) * 31) + this.crypto.hashCode()) * 31) + this.util.hashCode();
        }

        public final Builder keyx(AleKeyxScheme aleKeyxScheme) {
            C8632dsu.c((Object) aleKeyxScheme, "");
            this.keyx = aleKeyxScheme;
            return this;
        }

        public final Builder scheme(AleScheme aleScheme) {
            C8632dsu.c((Object) aleScheme, "");
            this.scheme = aleScheme;
            return this;
        }

        public final void setCrypto(AleCrypto aleCrypto) {
            C8632dsu.c((Object) aleCrypto, "");
            this.crypto = aleCrypto;
        }

        public final void setKeyx(AleKeyxScheme aleKeyxScheme) {
            C8632dsu.c((Object) aleKeyxScheme, "");
            this.keyx = aleKeyxScheme;
        }

        public final void setScheme(AleScheme aleScheme) {
            C8632dsu.c((Object) aleScheme, "");
            this.scheme = aleScheme;
        }

        public final void setType(AleUseCase aleUseCase) {
            C8632dsu.c((Object) aleUseCase, "");
            this.type = aleUseCase;
        }

        public final void setUtil(AleUtil aleUtil) {
            C8632dsu.c((Object) aleUtil, "");
            this.util = aleUtil;
        }

        public String toString() {
            return "Builder(scheme=" + this.scheme + ", keyx=" + this.keyx + ", type=" + this.type + ", crypto=" + this.crypto + ", util=" + this.util + ')';
        }

        public final Builder type(AleUseCase aleUseCase) {
            C8632dsu.c((Object) aleUseCase, "");
            this.type = aleUseCase;
            return this;
        }

        public final Builder util(AleUtil aleUtil) {
            C8632dsu.c((Object) aleUtil, "");
            this.util = aleUtil;
            return this;
        }

        public Builder(AleScheme aleScheme, AleKeyxScheme aleKeyxScheme, AleUseCase aleUseCase, AleCrypto aleCrypto, AleUtil aleUtil) {
            C8632dsu.c((Object) aleScheme, "");
            C8632dsu.c((Object) aleKeyxScheme, "");
            C8632dsu.c((Object) aleUseCase, "");
            C8632dsu.c((Object) aleCrypto, "");
            C8632dsu.c((Object) aleUtil, "");
            this.scheme = aleScheme;
            this.keyx = aleKeyxScheme;
            this.type = aleUseCase;
            this.crypto = aleCrypto;
            this.util = aleUtil;
        }

        public /* synthetic */ Builder(AleScheme aleScheme, AleKeyxScheme aleKeyxScheme, AleUseCase aleUseCase, AleCrypto aleCrypto, AleUtil aleUtil, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? AleScheme.A128GCM : aleScheme, (i & 2) != 0 ? AleKeyxScheme.CLEAR : aleKeyxScheme, (i & 4) != 0 ? AleUseCase.TEST : aleUseCase, (i & 8) != 0 ? new AleCryptoBouncyCastle(new SecureRandom(), new AleUtilImpl()) : aleCrypto, (i & 16) != 0 ? new AleUtilImpl() : aleUtil);
        }

        public final AleConfig build() {
            return new AleConfig(this.scheme, this.keyx, this.type, this.crypto, this.util);
        }
    }
}
