package org.chromium.net;

import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
public class NetworkTrafficAnnotationTag {
    private final int mHashCode;
    public static final NetworkTrafficAnnotationTag NO_TRAFFIC_ANNOTATION_YET = createComplete("undefined", "Nothing here yet.");
    public static final NetworkTrafficAnnotationTag MISSING_TRAFFIC_ANNOTATION = createComplete("undefined", "Function called without traffic annotation.");
    public static final NetworkTrafficAnnotationTag TRAFFIC_ANNOTATION_FOR_TESTS = createComplete("test", "Traffic annotation for unit, browser and other tests");

    public int getHashCode() {
        return this.mHashCode;
    }

    public static NetworkTrafficAnnotationTag createComplete(String str, String str2) {
        return new NetworkTrafficAnnotationTag(str);
    }

    private NetworkTrafficAnnotationTag(String str) {
        this.mHashCode = iterativeHash(str);
    }

    static int iterativeHash(String str) {
        long j = 0;
        for (byte b : str.getBytes(StandardCharsets.UTF_8)) {
            j = ((j * 31) + b) % 138003713;
        }
        return (int) j;
    }
}
