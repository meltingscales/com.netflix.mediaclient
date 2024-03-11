package com.apollographql.apollo3.api.json;

import java.io.Closeable;
import java.util.List;
import o.C8600drp;
import o.C9071if;
import o.InterfaceC8598drn;

/* loaded from: classes2.dex */
public interface JsonReader extends Closeable {
    int a(List<String> list);

    JsonReader a();

    JsonReader b();

    JsonReader c();

    List<Object> d();

    JsonReader e();

    int f();

    boolean g();

    long h();

    double i();

    boolean j();

    String k();

    Token l();

    C9071if m();

    String n();

    Void o();

    void q();

    void s();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Token {
        private static final /* synthetic */ InterfaceC8598drn n;

        /* renamed from: o  reason: collision with root package name */
        private static final /* synthetic */ Token[] f13091o;
        public static final Token d = new Token("BEGIN_ARRAY", 0);
        public static final Token e = new Token("END_ARRAY", 1);
        public static final Token c = new Token("BEGIN_OBJECT", 2);
        public static final Token h = new Token("END_OBJECT", 3);
        public static final Token g = new Token("NAME", 4);
        public static final Token l = new Token("STRING", 5);
        public static final Token k = new Token("NUMBER", 6);
        public static final Token i = new Token("LONG", 7);
        public static final Token a = new Token("BOOLEAN", 8);
        public static final Token f = new Token("NULL", 9);
        public static final Token j = new Token("END_DOCUMENT", 10);
        public static final Token b = new Token("ANY", 11);

        private static final /* synthetic */ Token[] b() {
            return new Token[]{d, e, c, h, g, l, k, i, a, f, j, b};
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) f13091o.clone();
        }

        private Token(String str, int i2) {
        }

        static {
            Token[] b2 = b();
            f13091o = b2;
            n = C8600drp.e(b2);
        }
    }
}
