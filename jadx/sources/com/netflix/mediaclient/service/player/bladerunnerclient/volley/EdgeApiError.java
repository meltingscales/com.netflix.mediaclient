package com.netflix.mediaclient.service.player.bladerunnerclient.volley;

/* loaded from: classes3.dex */
public enum EdgeApiError {
    HystrixTimeout(4000),
    NOT_KNOWN_TO_CLIENT(-7778);
    
    private final int e;

    private int d() {
        return this.e;
    }

    EdgeApiError(int i) {
        this.e = i;
    }

    public static EdgeApiError c(int i) {
        EdgeApiError[] values;
        for (EdgeApiError edgeApiError : values()) {
            if (edgeApiError.d() == i) {
                return edgeApiError;
            }
        }
        return NOT_KNOWN_TO_CLIENT;
    }
}
