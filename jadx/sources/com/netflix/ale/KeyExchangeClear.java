package com.netflix.ale;

import com.google.gson.Gson;
import com.netflix.ale.gson.AleGson;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class KeyExchangeClear extends KeyExchangeBase implements KeyExchange {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyExchangeClear(AleCrypto aleCrypto, AleUtil aleUtil, AleScheme aleScheme) {
        super(AleKeyxScheme.CLEAR, aleCrypto, aleUtil, aleScheme);
        C8632dsu.c((Object) aleCrypto, "");
        C8632dsu.c((Object) aleUtil, "");
        C8632dsu.c((Object) aleScheme, "");
    }

    @Override // com.netflix.ale.KeyExchange
    public KeyxRequestData getKeyxRequestData() {
        return new KeyxRequestData(AleKeyxScheme.CLEAR, null);
    }

    @Override // com.netflix.ale.KeyExchange
    public Jwe processKeyxResponse(KeyxResponseData keyxResponseData) {
        ClearKeyxResponseData clearKeyxResponseData;
        C8632dsu.c((Object) keyxResponseData, "");
        if (keyxResponseData.getScheme() != AleKeyxScheme.CLEAR) {
            throw new Exception("incompatible key response scheme");
        }
        String kid = keyxResponseData.getKid();
        if (keyxResponseData.getData() instanceof Map) {
            Object obj = ((Map) keyxResponseData.getData()).get(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8632dsu.d(obj);
            clearKeyxResponseData = new ClearKeyxResponseData((String) obj);
        } else {
            Gson create = AleGson.Companion.create();
            Object data = keyxResponseData.getData();
            C8632dsu.d(data);
            Object fromJson = create.fromJson((String) data, (Class<Object>) ClearKeyxResponseData.class);
            C8632dsu.a(fromJson, "");
            clearKeyxResponseData = (ClearKeyxResponseData) fromJson;
        }
        if (!clearKeyxResponseData.isValid()) {
            throw new Exception("incompatible key response data");
        }
        return createJweFromKey(getUtil().base64ToBytes(clearKeyxResponseData.getKey()), kid);
    }
}
