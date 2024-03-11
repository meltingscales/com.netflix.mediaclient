package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;

/* loaded from: classes5.dex */
public class TokenFilter {
    public static final TokenFilter e = new TokenFilter();

    /* loaded from: classes5.dex */
    public enum Inclusion {
        ONLY_INCLUDE_ALL,
        INCLUDE_ALL_AND_PATH,
        INCLUDE_NON_NULL
    }

    public TokenFilter a() {
        return this;
    }

    public boolean a(boolean z) {
        return false;
    }

    public TokenFilter b() {
        return this;
    }

    public TokenFilter c(int i) {
        return this;
    }

    protected boolean c() {
        return true;
    }

    public TokenFilter d(int i) {
        return this;
    }

    public void d() {
    }

    public boolean d(boolean z) {
        return false;
    }

    public TokenFilter e(String str) {
        return this;
    }

    public void e() {
    }

    protected TokenFilter() {
    }

    public boolean d(JsonParser jsonParser) {
        return c();
    }

    public String toString() {
        return this == e ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }
}
