package o;

/* renamed from: o.diW  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8338diW implements InterfaceC0943Io {
    private IF a;
    private IF d;
    private IF e;

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        char c;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -873453285) {
            if (str.equals("titles")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 333666863) {
            if (hashCode == 443716983 && str.equals("titleSuggestions")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("queryCompletions")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return this.d;
                }
                throw new IllegalStateException("Can't get node for key: " + str);
            }
            return this.e;
        }
        return this.a;
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        char c;
        InterfaceC8322diG b = b(str);
        if (b != null) {
            return b;
        }
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -873453285) {
            if (str.equals("titles")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 333666863) {
            if (hashCode == 443716983 && str.equals("titleSuggestions")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("queryCompletions")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            IF r5 = new IF();
            this.a = r5;
            return r5;
        } else if (c == 1) {
            IF r52 = new IF();
            this.e = r52;
            return r52;
        } else if (c == 2) {
            IF r53 = new IF();
            this.d = r53;
            return r53;
        } else {
            throw new IllegalStateException("Can't create node for key: " + str);
        }
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        char c;
        if (interfaceC8322diG instanceof IJ) {
            return;
        }
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -873453285) {
            if (str.equals("titles")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 333666863) {
            if (hashCode == 443716983 && str.equals("titleSuggestions")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("queryCompletions")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.a = IF.b(interfaceC8322diG);
        } else if (c == 1) {
            this.e = IF.b(interfaceC8322diG);
        } else if (c == 2) {
            this.d = IF.b(interfaceC8322diG);
        } else {
            C1044Mm.e("NewSearchMap", "Don't know how to set key: " + str);
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        d(str, null);
    }
}
