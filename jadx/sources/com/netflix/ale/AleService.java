package com.netflix.ale;

import com.netflix.ale.gson.AleGson;
import java.util.Date;
import java.util.GregorianCalendar;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class AleService {
    public static final Companion Companion = new Companion(null);
    private final AleConfig config;
    private final KeyExchange keyExchange;

    /* loaded from: classes5.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AleKeyxScheme.values().length];
            iArr[AleKeyxScheme.CLEAR.ordinal()] = 1;
            iArr[AleKeyxScheme.RSA_OAEP_256.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AleService(AleConfig aleConfig, C8627dsp c8627dsp) {
        this(aleConfig);
    }

    private AleService(AleConfig aleConfig) {
        this.config = aleConfig;
        int i = WhenMappings.$EnumSwitchMapping$0[aleConfig.getKeyx().ordinal()];
        if (i == 1) {
            this.keyExchange = new KeyExchangeClear(aleConfig.getCrypto(), aleConfig.getUtil(), aleConfig.getScheme());
        } else if (i == 2) {
            this.keyExchange = new KeyExchangeRsaOaep(aleConfig.getCrypto(), aleConfig.getUtil(), aleConfig.getScheme(), null, null, 24, null);
        } else {
            throw new Exception("unsupported key exchange scheme");
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final AleService create(AleConfig aleConfig) {
            C8632dsu.c((Object) aleConfig, "");
            return new AleService(aleConfig, null);
        }
    }

    public final String getProvisioningRequest() {
        String json = AleGson.Companion.create().toJson(new KeyProvisionRequest(1, this.config.getScheme(), this.config.getType(), this.keyExchange.getKeyxRequestData()), KeyProvisionRequest.class);
        C8632dsu.a(json, "");
        return json;
    }

    public final AleSession createSession(String str) {
        C8632dsu.c((Object) str, "");
        try {
            KeyProvisionResponse parseKeyProvisionResponse = KeyProvisionResponseKt.parseKeyProvisionResponse(str);
            if (parseKeyProvisionResponse.getVer().intValue() != 1) {
                throw new Exception("incompatible provisioning response version");
            }
            if (parseKeyProvisionResponse.getScheme() != this.config.getScheme()) {
                throw new Exception("inconsistent scheme in provisioning response");
            }
            if (parseKeyProvisionResponse.getKeyx().getScheme() != this.config.getKeyx()) {
                throw new Exception("inconsistent keyx scheme in provisioning response");
            }
            Jwe processKeyxResponse = this.keyExchange.processKeyxResponse(parseKeyProvisionResponse.getKeyx());
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(new Date());
            gregorianCalendar.add(13, parseKeyProvisionResponse.getTtl().intValue());
            Date time = gregorianCalendar.getTime();
            Number rw = parseKeyProvisionResponse.getRw();
            if (rw == null) {
                rw = Integer.valueOf(parseKeyProvisionResponse.getTtl().intValue() / 2);
                if (rw.intValue() > 86400) {
                    rw = 86400;
                }
            }
            gregorianCalendar.setTime(time);
            gregorianCalendar.add(13, rw.intValue() * (-1));
            Date time2 = gregorianCalendar.getTime();
            C8632dsu.a(time2, "");
            String token = parseKeyProvisionResponse.getToken();
            C8632dsu.a(time, "");
            return new AleSession(token, time, time2, processKeyxResponse, new AleUtilImpl());
        } catch (Throwable th) {
            throw new Exception("failed to parse response - " + th.getMessage(), th);
        }
    }
}
