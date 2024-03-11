package com.fasterxml.jackson.core.util;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class Separators implements Serializable {
    private static final long serialVersionUID = 1;
    private final char a;
    private final char c;
    private final char d;

    public char a() {
        return this.c;
    }

    public char b() {
        return this.d;
    }

    public char d() {
        return this.a;
    }

    public static Separators c() {
        return new Separators();
    }

    public Separators() {
        this(':', ',', ',');
    }

    public Separators(char c, char c2, char c3) {
        this.d = c;
        this.c = c2;
        this.a = c3;
    }
}
