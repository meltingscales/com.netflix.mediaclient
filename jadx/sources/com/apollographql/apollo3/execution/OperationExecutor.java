package com.apollographql.apollo3.execution;

/* loaded from: classes5.dex */
public final class OperationExecutor {

    /* loaded from: classes5.dex */
    public static final class UnexpectedNull extends Exception {
        public static final UnexpectedNull b = new UnexpectedNull();

        private UnexpectedNull() {
            super("A resolver returned null in a non-null position");
        }
    }
}
