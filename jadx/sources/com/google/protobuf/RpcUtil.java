package com.google.protobuf;

/* loaded from: classes5.dex */
public final class RpcUtil {

    /* loaded from: classes5.dex */
    public static final class AlreadyCalledException extends RuntimeException {
        private static final long serialVersionUID = 5469741279507848266L;

        public AlreadyCalledException() {
            super("This RpcCallback was already called and cannot be called multiple times.");
        }
    }
}
