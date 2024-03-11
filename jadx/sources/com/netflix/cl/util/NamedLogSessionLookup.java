package com.netflix.cl.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public enum NamedLogSessionLookup {
    INSTANCE;
    
    private Map<String, Long> sessionIdMap = new ConcurrentHashMap();

    NamedLogSessionLookup() {
    }

    public void addSession(String str, Long l) {
        if (l == null || str == null) {
            return;
        }
        this.sessionIdMap.put(str, l);
    }

    public Long removeSessionId(String str) {
        if (str == null) {
            return null;
        }
        return this.sessionIdMap.remove(str);
    }
}
