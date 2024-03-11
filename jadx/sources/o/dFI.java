package o;

import com.fasterxml.jackson.core.JsonFactory;
import kotlin.KotlinNothingValueException;

/* loaded from: classes5.dex */
public final class dFI extends dEU {
    private final String e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dEU
    /* renamed from: p */
    public String l() {
        return this.e;
    }

    public dFI(String str) {
        C8632dsu.c((Object) str, "");
        this.e = str;
    }

    @Override // o.dEU
    public int c(int i) {
        if (i < l().length()) {
            return i;
        }
        return -1;
    }

    @Override // o.dEU
    public byte c() {
        byte e;
        String l = l();
        do {
            int i = this.d;
            if (i == -1 || i >= l.length()) {
                return (byte) 10;
            }
            int i2 = this.d;
            this.d = i2 + 1;
            e = dEZ.e(l.charAt(i2));
        } while (e == 3);
        return e;
    }

    @Override // o.dEU
    public boolean q() {
        int k = k();
        if (k == l().length() || k == -1 || l().charAt(k) != ',') {
            return false;
        }
        this.d++;
        return true;
    }

    @Override // o.dEU
    public boolean b() {
        int i = this.d;
        if (i == -1) {
            return false;
        }
        while (i < l().length()) {
            char charAt = l().charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.d = i;
                return e(charAt);
            }
            i++;
        }
        this.d = i;
        return false;
    }

    @Override // o.dEU
    public int k() {
        char charAt;
        int i = this.d;
        if (i == -1) {
            return i;
        }
        while (i < l().length() && ((charAt = l().charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.d = i;
        return i;
    }

    @Override // o.dEU
    public void c(char c) {
        if (this.d == -1) {
            d(c);
        }
        String l = l();
        while (this.d < l.length()) {
            int i = this.d;
            this.d = i + 1;
            char charAt = l.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c) {
                    return;
                }
                d(c);
            }
        }
        this.d = -1;
        d(c);
    }

    @Override // o.dEU
    public String a() {
        int b;
        c(JsonFactory.DEFAULT_QUOTE_CHAR);
        int i = this.d;
        b = duD.b((CharSequence) l(), (char) JsonFactory.DEFAULT_QUOTE_CHAR, i, false, 4, (Object) null);
        if (b == -1) {
            j();
            b((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i2 = i; i2 < b; i2++) {
            if (l().charAt(i2) == '\\') {
                return e(l(), this.d, i2);
            }
        }
        this.d = b + 1;
        String substring = l().substring(i, b);
        C8632dsu.a(substring, "");
        return substring;
    }

    @Override // o.dEU
    public String d(String str, boolean z) {
        C8632dsu.c((Object) str, "");
        int i = this.d;
        try {
            if (c() == 6 && C8632dsu.c((Object) a(z), (Object) str)) {
                i();
                if (c() == 5) {
                    return a(z);
                }
            }
            this.d = i;
            i();
            return null;
        } finally {
            this.d = i;
            i();
        }
    }
}
