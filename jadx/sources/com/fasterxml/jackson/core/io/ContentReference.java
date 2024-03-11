package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Objects;
import o.C9391oh;

/* loaded from: classes2.dex */
public class ContentReference implements Serializable {
    protected static final ContentReference e = new ContentReference(false, null);
    private static final long serialVersionUID = 1;
    protected final transient Object a;
    protected final boolean b;
    protected final int c;
    protected final int d;

    public static ContentReference b() {
        return e;
    }

    private void readObject(ObjectInputStream objectInputStream) {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
    }

    public Object a() {
        return this.a;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }

    protected int f() {
        return 500;
    }

    public boolean h() {
        return this.b;
    }

    protected Object readResolve() {
        return e;
    }

    protected ContentReference(boolean z, Object obj) {
        this(z, obj, -1, -1);
    }

    protected ContentReference(boolean z, Object obj, int i, int i2) {
        this.b = z;
        this.a = obj;
        this.c = i;
        this.d = i2;
    }

    public static ContentReference a(boolean z, Object obj) {
        return new ContentReference(z, obj);
    }

    public static ContentReference b(boolean z, Object obj, int i, int i2) {
        return new ContentReference(z, obj, i, i2);
    }

    public static ContentReference c(boolean z, Object obj) {
        if (obj instanceof ContentReference) {
            return (ContentReference) obj;
        }
        return new ContentReference(z, obj);
    }

    public static ContentReference d(Object obj) {
        return c(false, obj);
    }

    public String e() {
        return d(new StringBuilder(200)).toString();
    }

    public StringBuilder d(StringBuilder sb) {
        String str;
        Object a = a();
        if (a == null) {
            sb.append("UNKNOWN");
            return sb;
        }
        Class<?> cls = a instanceof Class ? (Class) a : a.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (a instanceof byte[]) {
            name = "byte[]";
        } else if (a instanceof char[]) {
            name = "char[]";
        }
        sb.append('(');
        sb.append(name);
        sb.append(')');
        if (h()) {
            int f = f();
            int[] iArr = {d(), c()};
            String str2 = " chars";
            if (a instanceof CharSequence) {
                str = d((CharSequence) a, iArr, f);
            } else if (a instanceof char[]) {
                str = b((char[]) a, iArr, f);
            } else if (a instanceof byte[]) {
                str = e((byte[]) a, iArr, f);
                str2 = " bytes";
            } else {
                str = null;
            }
            if (str != null) {
                a(sb, str);
                if (iArr[1] > f) {
                    sb.append("[truncated ");
                    sb.append(iArr[1] - f);
                    sb.append(str2);
                    sb.append(']');
                }
            }
        } else if (a instanceof byte[]) {
            int c = c();
            if (c < 0) {
                c = ((byte[]) a).length;
            }
            sb.append('[');
            sb.append(c);
            sb.append(" bytes]");
        }
        return sb;
    }

    protected String d(CharSequence charSequence, int[] iArr, int i) {
        e(iArr, charSequence.length());
        int i2 = iArr[0];
        return charSequence.subSequence(i2, Math.min(iArr[1], i) + i2).toString();
    }

    protected String b(char[] cArr, int[] iArr, int i) {
        e(iArr, cArr.length);
        return new String(cArr, iArr[0], Math.min(iArr[1], i));
    }

    protected String e(byte[] bArr, int[] iArr, int i) {
        e(iArr, bArr.length);
        return new String(bArr, iArr[0], Math.min(iArr[1], i), Charset.forName("UTF-8"));
    }

    protected void e(int[] iArr, int i) {
        int i2 = iArr[0];
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= i) {
            i2 = i;
        }
        iArr[0] = i2;
        int i3 = iArr[1];
        int i4 = i - i2;
        if (i3 < 0 || i3 > i4) {
            iArr[1] = i4;
        }
    }

    protected int a(StringBuilder sb, String str) {
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!Character.isISOControl(charAt) || !e(sb, charAt)) {
                sb.append(charAt);
            }
        }
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        return str.length();
    }

    protected boolean e(StringBuilder sb, int i) {
        if (i == 13 || i == 10) {
            return false;
        }
        sb.append('\\');
        sb.append('u');
        sb.append(C9391oh.d((i >> 12) & 15));
        sb.append(C9391oh.d((i >> 8) & 15));
        sb.append(C9391oh.d((i >> 4) & 15));
        sb.append(C9391oh.d(i & 15));
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ContentReference)) {
            ContentReference contentReference = (ContentReference) obj;
            if (this.c == contentReference.c && this.d == contentReference.d) {
                Object obj2 = contentReference.a;
                Object obj3 = this.a;
                if (obj3 == null) {
                    return obj2 == null;
                } else if (obj2 == null) {
                    return false;
                } else {
                    if ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) {
                        return obj3.equals(obj2);
                    }
                    return obj3 == obj2;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }
}
