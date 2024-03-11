package com.netflix.mediaclient.service.webclient;

import java.util.Map;

/* loaded from: classes4.dex */
public interface AUIApiEndpointRegistry extends ApiEndpointRegistry {
    Map<String, String> d(ResponsePathFormat responsePathFormat);

    Map<String, String> f();

    /* loaded from: classes4.dex */
    public enum ResponsePathFormat {
        GRAPH("graph"),
        HIERARCHICAL("hierarchical");
        
        public final String e;

        ResponsePathFormat(String str) {
            this.e = str;
        }
    }
}
