package com.google.protobuf;

import java.nio.Buffer;

/* loaded from: classes5.dex */
final class Java8Compatibility {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void limit(Buffer buffer, int i) {
        buffer.limit(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void position(Buffer buffer, int i) {
        buffer.position(i);
    }
}
