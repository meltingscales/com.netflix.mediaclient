package o;

import com.netflix.hawkins.consumer.tokens.Token;

/* loaded from: classes2.dex */
public final class FF implements FD {
    private final Token.Color a;
    private final String b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FF) {
            FF ff = (FF) obj;
            return C8632dsu.c((Object) this.b, (Object) ff.b) && C8632dsu.c(this.a, ff.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        Token.Color color = this.a;
        return (hashCode * 31) + (color == null ? 0 : color.hashCode());
    }

    public String toString() {
        String str = this.b;
        Token.Color color = this.a;
        return "HorizontalDivider(key=" + str + ", color=" + color + ")";
    }

    public FF(String str, Token.Color color) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.a = color;
    }
}
