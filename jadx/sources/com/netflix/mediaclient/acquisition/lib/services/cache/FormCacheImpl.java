package com.netflix.mediaclient.acquisition.lib.services.cache;

import com.netflix.mediaclient.acquisition.lib.FormCache;
import java.util.HashMap;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FormCacheImpl implements FormCache {
    private final Map<String, Object> valueCache = new HashMap();
    private final Map<String, Boolean> validationStateCache = new HashMap();

    @Override // com.netflix.mediaclient.acquisition.lib.FormCache
    public void writeValue(String str, String str2, Object obj) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.valueCache.put(generateKey(str, str2), obj);
    }

    @Override // com.netflix.mediaclient.acquisition.lib.FormCache
    public Object readValue(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return this.valueCache.get(generateKey(str, str2));
    }

    @Override // com.netflix.mediaclient.acquisition.lib.FormCache
    public void writeValidationState(String str, int i, boolean z) {
        C8632dsu.c((Object) str, "");
        this.validationStateCache.put(generateKey(str, Integer.valueOf(i)), Boolean.valueOf(z));
    }

    @Override // com.netflix.mediaclient.acquisition.lib.FormCache
    public boolean readShowValidationState(String str, int i) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c(this.validationStateCache.get(generateKey(str, Integer.valueOf(i))), Boolean.TRUE);
    }

    private final String generateKey(String str, Object obj) {
        return str + "." + obj;
    }
}
