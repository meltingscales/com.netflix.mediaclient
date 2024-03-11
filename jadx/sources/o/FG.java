package o;

import com.netflix.hawkins.consumer.component.icon.HawkinsIconSize;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Token;

/* loaded from: classes2.dex */
public final class FG implements FD {
    private final HawkinsIcon a;
    private final HawkinsIconSize b;
    private final Token.Color c;
    private final String d;
    private final String e;

    public final String a() {
        return this.d;
    }

    public final HawkinsIcon b() {
        return this.a;
    }

    public final Token.Color c() {
        return this.c;
    }

    public final HawkinsIconSize e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FG) {
            FG fg = (FG) obj;
            return C8632dsu.c((Object) this.e, (Object) fg.e) && C8632dsu.c((Object) this.d, (Object) fg.d) && C8632dsu.c(this.c, fg.c) && C8632dsu.c(this.a, fg.a) && this.b == fg.b;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Token.Color color = this.c;
        return (((((((hashCode * 31) + hashCode2) * 31) + (color != null ? color.hashCode() : 0)) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.e;
        String str2 = this.d;
        Token.Color color = this.c;
        HawkinsIcon hawkinsIcon = this.a;
        HawkinsIconSize hawkinsIconSize = this.b;
        return "Icon(key=" + str + ", accessibilityDescription=" + str2 + ", color=" + color + ", icon=" + hawkinsIcon + ", size=" + hawkinsIconSize + ")";
    }

    public FG(String str, String str2, Token.Color color, HawkinsIcon hawkinsIcon, HawkinsIconSize hawkinsIconSize) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) hawkinsIcon, "");
        C8632dsu.c((Object) hawkinsIconSize, "");
        this.e = str;
        this.d = str2;
        this.c = color;
        this.a = hawkinsIcon;
        this.b = hawkinsIconSize;
    }
}
