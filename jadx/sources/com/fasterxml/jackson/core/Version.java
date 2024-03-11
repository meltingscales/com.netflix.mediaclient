package com.fasterxml.jackson.core;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Version implements Comparable<Version>, Serializable {
    private static final Version i = new Version(0, 0, 0, null, null, null);
    private static final long serialVersionUID = 1;
    protected final int a;
    protected final String b;
    protected final String c;
    protected final int d;
    protected final int e;
    protected final String f;

    public static Version b() {
        return i;
    }

    public Version(int i2, int i3, int i4, String str, String str2, String str3) {
        this.e = i2;
        this.a = i3;
        this.d = i4;
        this.f = str;
        this.c = str2 == null ? "" : str2;
        this.b = str3 == null ? "" : str3;
    }

    public boolean d() {
        String str = this.f;
        return str != null && str.length() > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('.');
        sb.append(this.a);
        sb.append('.');
        sb.append(this.d);
        if (d()) {
            sb.append('-');
            sb.append(this.f);
        }
        return sb.toString();
    }

    public int hashCode() {
        return this.b.hashCode() ^ (((this.c.hashCode() + this.e) - this.a) + this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Version version = (Version) obj;
            return version.e == this.e && version.a == this.a && version.d == this.d && version.b.equals(this.b) && version.c.equals(this.c);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(Version version) {
        if (version == this) {
            return 0;
        }
        int compareTo = this.c.compareTo(version.c);
        if (compareTo == 0) {
            int compareTo2 = this.b.compareTo(version.b);
            if (compareTo2 == 0) {
                int i2 = this.e - version.e;
                if (i2 == 0) {
                    int i3 = this.a - version.a;
                    return i3 == 0 ? this.d - version.d : i3;
                }
                return i2;
            }
            return compareTo2;
        }
        return compareTo;
    }
}
