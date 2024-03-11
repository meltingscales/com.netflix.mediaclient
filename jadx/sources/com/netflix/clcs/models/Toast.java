package com.netflix.clcs.models;

import o.C8600drp;
import o.C8632dsu;
import o.FC;
import o.FD;
import o.FE;
import o.InterfaceC8598drn;

/* loaded from: classes2.dex */
public final class Toast implements FD {
    private final String a;
    private final FE b;
    private final FD c;
    private final String d;
    private final Position e;
    private final String f;
    private final Integer i;
    private final FC j;

    public final FD a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public final FC c() {
        return this.j;
    }

    public final Position d() {
        return this.e;
    }

    public final FE e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Toast) {
            Toast toast = (Toast) obj;
            return C8632dsu.c((Object) this.d, (Object) toast.d) && C8632dsu.c((Object) this.f, (Object) toast.f) && C8632dsu.c((Object) this.a, (Object) toast.a) && C8632dsu.c(this.j, toast.j) && this.e == toast.e && C8632dsu.c(this.i, toast.i) && C8632dsu.c(this.b, toast.b) && C8632dsu.c(this.c, toast.c);
        }
        return false;
    }

    public final Integer f() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        String str = this.f;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        FC fc = this.j;
        int hashCode4 = fc == null ? 0 : fc.hashCode();
        int hashCode5 = this.e.hashCode();
        Integer num = this.i;
        int hashCode6 = num == null ? 0 : num.hashCode();
        FE fe = this.b;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (fe != null ? fe.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.d;
        String str2 = this.f;
        String str3 = this.a;
        FC fc = this.j;
        Position position = this.e;
        Integer num = this.i;
        FE fe = this.b;
        FD fd = this.c;
        return "Toast(key=" + str + ", trackingInfo=" + str2 + ", loggingViewName=" + str3 + ", style=" + fc + ", position=" + position + ", timerMs=" + num + ", onTimerComplete=" + fe + ", content=" + fd + ")";
    }

    public Toast(String str, String str2, String str3, FC fc, Position position, Integer num, FE fe, FD fd) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) fd, "");
        this.d = str;
        this.f = str2;
        this.a = str3;
        this.j = fc;
        this.e = position;
        this.i = num;
        this.b = fe;
        this.c = fd;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Position {
        private static final /* synthetic */ InterfaceC8598drn b;
        public static final Position c = new Position("TOP", 0);
        public static final Position d = new Position("BOTTOM", 1);
        private static final /* synthetic */ Position[] e;

        private static final /* synthetic */ Position[] b() {
            return new Position[]{c, d};
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) e.clone();
        }

        private Position(String str, int i) {
        }

        static {
            Position[] b2 = b();
            e = b2;
            b = C8600drp.e(b2);
        }
    }
}
