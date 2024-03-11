package com.apollographql.apollo3.ast.internal;

/* loaded from: classes5.dex */
public final class LexerException extends Exception {
    private final String e;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.e;
    }
}
