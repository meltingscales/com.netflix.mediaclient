package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.dj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8368dj {
    public static final C8368dj c = new C8368dj("COMPOSITION");
    private InterfaceC8395dk a;
    private final List<String> d;

    public InterfaceC8395dk b() {
        return this.a;
    }

    public C8368dj(String... strArr) {
        this.d = Arrays.asList(strArr);
    }

    private C8368dj(C8368dj c8368dj) {
        this.d = new ArrayList(c8368dj.d);
        this.a = c8368dj.a;
    }

    public C8368dj d(String str) {
        C8368dj c8368dj = new C8368dj(this);
        c8368dj.d.add(str);
        return c8368dj;
    }

    public C8368dj e(InterfaceC8395dk interfaceC8395dk) {
        C8368dj c8368dj = new C8368dj(this);
        c8368dj.a = interfaceC8395dk;
        return c8368dj;
    }

    public boolean e(String str, int i) {
        if (b(str)) {
            return true;
        }
        if (i >= this.d.size()) {
            return false;
        }
        return this.d.get(i).equals(str) || this.d.get(i).equals("**") || this.d.get(i).equals("*");
    }

    public int d(String str, int i) {
        if (b(str)) {
            return 0;
        }
        if (this.d.get(i).equals("**")) {
            return (i != this.d.size() - 1 && this.d.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean a(String str, int i) {
        if (i >= this.d.size()) {
            return false;
        }
        boolean z = i == this.d.size() - 1;
        String str2 = this.d.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.d.size() + (-2) && e())) && (str2.equals(str) || str2.equals("*"));
        } else if (!z && this.d.get(i + 1).equals(str)) {
            return i == this.d.size() + (-2) || (i == this.d.size() + (-3) && e());
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.d.size() - 1) {
                return false;
            }
            return this.d.get(i2).equals(str);
        }
    }

    public boolean c(String str, int i) {
        return "__container".equals(str) || i < this.d.size() - 1 || this.d.get(i).equals("**");
    }

    private boolean b(String str) {
        return "__container".equals(str);
    }

    private boolean e() {
        List<String> list = this.d;
        return list.get(list.size() - 1).equals("**");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8368dj c8368dj = (C8368dj) obj;
        if (this.d.equals(c8368dj.d)) {
            InterfaceC8395dk interfaceC8395dk = this.a;
            InterfaceC8395dk interfaceC8395dk2 = c8368dj.a;
            return interfaceC8395dk != null ? interfaceC8395dk.equals(interfaceC8395dk2) : interfaceC8395dk2 == null;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        InterfaceC8395dk interfaceC8395dk = this.a;
        return (hashCode * 31) + (interfaceC8395dk != null ? interfaceC8395dk.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.d);
        sb.append(",resolved=");
        sb.append(this.a != null);
        sb.append('}');
        return sb.toString();
    }
}
