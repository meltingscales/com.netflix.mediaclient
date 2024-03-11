package com.netflix.clcs.models;

import com.netflix.hawkins.consumer.tokens.Token;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.FD;
import o.FR;
import o.InterfaceC8598drn;

/* loaded from: classes2.dex */
public final class Text implements FD {
    private final Token.Color a;
    private final Alignment b;
    private final c c;
    private final String d;
    private final FR<Alignment> e;
    private final String f;
    private final FR<Token.Typography> g;
    private final Token.Typography i;

    public final FR<Alignment> a() {
        return this.e;
    }

    public final Token.Typography b() {
        return this.i;
    }

    public final c c() {
        return this.c;
    }

    public final Token.Color d() {
        return this.a;
    }

    public final Alignment e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Text) {
            Text text = (Text) obj;
            return C8632dsu.c((Object) this.f, (Object) text.f) && C8632dsu.c((Object) this.d, (Object) text.d) && C8632dsu.c(this.i, text.i) && C8632dsu.c(this.g, text.g) && C8632dsu.c(this.a, text.a) && this.b == text.b && C8632dsu.c(this.e, text.e) && C8632dsu.c(this.c, text.c);
        }
        return false;
    }

    public final FR<Token.Typography> g() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = this.f.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Token.Typography typography = this.i;
        int hashCode3 = typography == null ? 0 : typography.hashCode();
        FR<Token.Typography> fr = this.g;
        int hashCode4 = fr == null ? 0 : fr.hashCode();
        Token.Color color = this.a;
        int hashCode5 = color == null ? 0 : color.hashCode();
        Alignment alignment = this.b;
        int hashCode6 = alignment == null ? 0 : alignment.hashCode();
        FR<Alignment> fr2 = this.e;
        int hashCode7 = fr2 == null ? 0 : fr2.hashCode();
        c cVar = this.c;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.f;
        String str2 = this.d;
        Token.Typography typography = this.i;
        FR<Token.Typography> fr = this.g;
        Token.Color color = this.a;
        Alignment alignment = this.b;
        FR<Alignment> fr2 = this.e;
        c cVar = this.c;
        return "Text(key=" + str + ", accessibilityDescription=" + str2 + ", typography=" + typography + ", typographyResponsive=" + fr + ", color=" + color + ", alignment=" + alignment + ", alignmentResponsive=" + fr2 + ", content=" + cVar + ")";
    }

    public Text(String str, String str2, Token.Typography typography, FR<Token.Typography> fr, Token.Color color, Alignment alignment, FR<Alignment> fr2, c cVar) {
        C8632dsu.c((Object) str, "");
        this.f = str;
        this.d = str2;
        this.i = typography;
        this.g = fr;
        this.a = color;
        this.b = alignment;
        this.e = fr2;
        this.c = cVar;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Alignment {
        private static final /* synthetic */ Alignment[] d;
        private static final /* synthetic */ InterfaceC8598drn e;
        public static final Alignment b = new Alignment("START", 0);
        public static final Alignment a = new Alignment("CENTER", 1);
        public static final Alignment c = new Alignment("END", 2);

        private static final /* synthetic */ Alignment[] b() {
            return new Alignment[]{b, a, c};
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) d.clone();
        }

        private Alignment(String str, int i) {
        }

        static {
            Alignment[] b2 = b();
            d = b2;
            e = C8600drp.e(b2);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        /* loaded from: classes2.dex */
        public static final class d extends c {
            private final String c;

            public final String c() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C8632dsu.c((Object) this.c, (Object) ((d) obj).c);
            }

            public int hashCode() {
                return this.c.hashCode();
            }

            public String toString() {
                String str = this.c;
                return "PlainString(string=" + str + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(null);
                C8632dsu.c((Object) str, "");
                this.c = str;
            }
        }

        private c() {
        }

        /* loaded from: classes2.dex */
        public static final class b extends c {
            private final String e;

            public final String a() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C8632dsu.c((Object) this.e, (Object) ((b) obj).e);
            }

            public int hashCode() {
                return this.e.hashCode();
            }

            public String toString() {
                String str = this.e;
                return "FormattedString(string=" + str + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(null);
                C8632dsu.c((Object) str, "");
                this.e = str;
            }
        }
    }
}
