package com.netflix.ale;

import com.netflix.ale.gson.AleGson;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class KeyProvisionResponseKt {
    public static final int PROV_RESP_VER = 1;

    public static final KeyProvisionResponse parseKeyProvisionResponse(String str) {
        C8632dsu.c((Object) str, "");
        try {
            Object fromJson = AleGson.Companion.create().fromJson(str, (Class<Object>) KeyProvisionResponse.class);
            C8632dsu.a(fromJson, "");
            KeyProvisionResponse keyProvisionResponse = (KeyProvisionResponse) fromJson;
            if (keyProvisionResponse.isValid()) {
                return keyProvisionResponse;
            }
            throw new Exception("unexpected key provision response contents - " + keyProvisionResponse.enumerateProblems());
        } catch (Throwable th) {
            throw new Exception("malformed JSON", th);
        }
    }
}
