package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import o.C9537rU;
import o.InterfaceC9327nW;

/* loaded from: classes5.dex */
public class PropertyName implements Serializable {
    private static final long serialVersionUID = 1;
    protected InterfaceC9327nW b;
    protected final String c;
    protected final String d;
    public static final PropertyName e = new PropertyName("", null);
    public static final PropertyName a = new PropertyName(new String(""), null);

    public String c() {
        return this.d;
    }

    public boolean d() {
        return this.c != null;
    }

    public PropertyName(String str) {
        this(str, null);
    }

    public PropertyName(String str, String str2) {
        this.d = C9537rU.a(str);
        this.c = str2;
    }

    protected Object readResolve() {
        String str;
        return (this.c == null && ((str = this.d) == null || "".equals(str))) ? e : this;
    }

    public static PropertyName b(String str) {
        return (str == null || str.length() == 0) ? e : new PropertyName(InternCache.e.b(str), null);
    }

    public static PropertyName a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.length() == 0) ? e : new PropertyName(InternCache.e.b(str), str2);
    }

    public PropertyName a() {
        String b;
        return (this.d.length() == 0 || (b = InternCache.e.b(this.d)) == this.d) ? this : new PropertyName(b, this.c);
    }

    public PropertyName c(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this.d) ? this : new PropertyName(str, this.c);
    }

    public InterfaceC9327nW a(MapperConfig<?> mapperConfig) {
        InterfaceC9327nW a2;
        InterfaceC9327nW interfaceC9327nW = this.b;
        if (interfaceC9327nW == null) {
            if (mapperConfig == null) {
                a2 = new SerializedString(this.d);
            } else {
                a2 = mapperConfig.a(this.d);
            }
            InterfaceC9327nW interfaceC9327nW2 = a2;
            this.b = interfaceC9327nW2;
            return interfaceC9327nW2;
        }
        return interfaceC9327nW;
    }

    public boolean b() {
        return this.d.length() > 0;
    }

    public boolean e(String str) {
        return this.d.equals(str);
    }

    public boolean e() {
        return this.c == null && this.d.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            PropertyName propertyName = (PropertyName) obj;
            String str = this.d;
            if (str == null) {
                if (propertyName.d != null) {
                    return false;
                }
            } else if (!str.equals(propertyName.d)) {
                return false;
            }
            String str2 = this.c;
            if (str2 == null) {
                return propertyName.c == null;
            }
            return str2.equals(propertyName.c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.c;
        if (str == null) {
            return this.d.hashCode();
        }
        return str.hashCode() ^ this.d.hashCode();
    }

    public String toString() {
        if (this.c == null) {
            return this.d;
        }
        return "{" + this.c + "}" + this.d;
    }
}
