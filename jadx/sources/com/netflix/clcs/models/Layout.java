package com.netflix.clcs.models;

import java.util.List;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.FC;
import o.FD;
import o.FR;
import o.InterfaceC8598drn;

/* loaded from: classes2.dex */
public final class Layout implements FD {
    private final StackContentJustification a;
    private final FR<Integer> b;
    private final List<FD> c;
    private final int d;
    private final FR<StackContentJustification> e;
    private final Direction f;
    private final FR<Direction> g;
    private final FR<ItemAlignment> h;
    private final String i;
    private final ItemAlignment j;
    private final FR<List<Template>> k;
    private final FC l;
    private final List<Template> m;
    private final int n;

    /* renamed from: o  reason: collision with root package name */
    private final FR<Integer> f13130o;

    public final FR<StackContentJustification> a() {
        return this.e;
    }

    public final List<FD> b() {
        return this.c;
    }

    public final FR<Integer> c() {
        return this.b;
    }

    public final StackContentJustification d() {
        return this.a;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Layout) {
            Layout layout = (Layout) obj;
            return C8632dsu.c((Object) this.i, (Object) layout.i) && C8632dsu.c(this.l, layout.l) && this.f == layout.f && C8632dsu.c(this.g, layout.g) && this.a == layout.a && C8632dsu.c(this.e, layout.e) && this.j == layout.j && C8632dsu.c(this.h, layout.h) && C8632dsu.c(this.m, layout.m) && C8632dsu.c(this.k, layout.k) && this.d == layout.d && C8632dsu.c(this.b, layout.b) && this.n == layout.n && C8632dsu.c(this.f13130o, layout.f13130o) && C8632dsu.c(this.c, layout.c);
        }
        return false;
    }

    public final FR<ItemAlignment> f() {
        return this.h;
    }

    public final int g() {
        return this.n;
    }

    public final Direction h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = this.i.hashCode();
        FC fc = this.l;
        int hashCode2 = fc == null ? 0 : fc.hashCode();
        Direction direction = this.f;
        int hashCode3 = direction == null ? 0 : direction.hashCode();
        FR<Direction> fr = this.g;
        int hashCode4 = fr == null ? 0 : fr.hashCode();
        StackContentJustification stackContentJustification = this.a;
        int hashCode5 = stackContentJustification == null ? 0 : stackContentJustification.hashCode();
        FR<StackContentJustification> fr2 = this.e;
        int hashCode6 = fr2 == null ? 0 : fr2.hashCode();
        ItemAlignment itemAlignment = this.j;
        int hashCode7 = itemAlignment == null ? 0 : itemAlignment.hashCode();
        FR<ItemAlignment> fr3 = this.h;
        int hashCode8 = fr3 == null ? 0 : fr3.hashCode();
        int hashCode9 = this.m.hashCode();
        FR<List<Template>> fr4 = this.k;
        int hashCode10 = fr4 == null ? 0 : fr4.hashCode();
        int hashCode11 = Integer.hashCode(this.d);
        FR<Integer> fr5 = this.b;
        int hashCode12 = fr5 == null ? 0 : fr5.hashCode();
        int hashCode13 = Integer.hashCode(this.n);
        FR<Integer> fr6 = this.f13130o;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (fr6 != null ? fr6.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final ItemAlignment i() {
        return this.j;
    }

    public final FR<Direction> j() {
        return this.g;
    }

    public final FC k() {
        return this.l;
    }

    public final FR<List<Template>> m() {
        return this.k;
    }

    public final FR<Integer> n() {
        return this.f13130o;
    }

    public final List<Template> o() {
        return this.m;
    }

    public String toString() {
        String str = this.i;
        FC fc = this.l;
        Direction direction = this.f;
        FR<Direction> fr = this.g;
        StackContentJustification stackContentJustification = this.a;
        FR<StackContentJustification> fr2 = this.e;
        ItemAlignment itemAlignment = this.j;
        FR<ItemAlignment> fr3 = this.h;
        List<Template> list = this.m;
        FR<List<Template>> fr4 = this.k;
        int i = this.d;
        FR<Integer> fr5 = this.b;
        int i2 = this.n;
        FR<Integer> fr6 = this.f13130o;
        List<FD> list2 = this.c;
        return "Layout(key=" + str + ", style=" + fc + ", direction=" + direction + ", directionResponsive=" + fr + ", contentJustification=" + stackContentJustification + ", contentJustificationResponsive=" + fr2 + ", itemAlignment=" + itemAlignment + ", itemAlignmentResponsive=" + fr3 + ", template=" + list + ", templateResponsive=" + fr4 + ", columnSpacing=" + i + ", columnSpacingResponsive=" + fr5 + ", rowSpacing=" + i2 + ", rowSpacingResponsive=" + fr6 + ", children=" + list2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Layout(String str, FC fc, Direction direction, FR<Direction> fr, StackContentJustification stackContentJustification, FR<StackContentJustification> fr2, ItemAlignment itemAlignment, FR<ItemAlignment> fr3, List<? extends Template> list, FR<List<Template>> fr4, int i, FR<Integer> fr5, int i2, FR<Integer> fr6, List<? extends FD> list2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        this.i = str;
        this.l = fc;
        this.f = direction;
        this.g = fr;
        this.a = stackContentJustification;
        this.e = fr2;
        this.j = itemAlignment;
        this.h = fr3;
        this.m = list;
        this.k = fr4;
        this.d = i;
        this.b = fr5;
        this.n = i2;
        this.f13130o = fr6;
        this.c = list2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Direction {
        private static final /* synthetic */ InterfaceC8598drn b;
        private static final /* synthetic */ Direction[] e;
        public static final Direction d = new Direction("ROW", 0);
        public static final Direction a = new Direction("COLUMN", 1);

        private static final /* synthetic */ Direction[] d() {
            return new Direction[]{d, a};
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) e.clone();
        }

        private Direction(String str, int i) {
        }

        static {
            Direction[] d2 = d();
            e = d2;
            b = C8600drp.e(d2);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Template {
        public /* synthetic */ Template(C8627dsp c8627dsp) {
            this();
        }

        /* loaded from: classes2.dex */
        public static final class Flexible extends Template {
            private final Size a;
            private final int e;

            public Flexible() {
                this(0, null, 3, null);
            }

            public final int b() {
                return this.e;
            }

            public final Size d() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Flexible) {
                    Flexible flexible = (Flexible) obj;
                    return this.e == flexible.e && this.a == flexible.a;
                }
                return false;
            }

            public int hashCode() {
                return (Integer.hashCode(this.e) * 31) + this.a.hashCode();
            }

            public String toString() {
                int i = this.e;
                Size size = this.a;
                return "Flexible(order=" + i + ", size=" + size + ")";
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* loaded from: classes2.dex */
            public static final class Size {
                private static final /* synthetic */ Size[] a;
                public static final Size b = new Size("AUTO", 0);
                public static final Size c = new Size("GROW", 1);
                public static final Size d = new Size("NONE", 2);
                private static final /* synthetic */ InterfaceC8598drn e;

                private static final /* synthetic */ Size[] a() {
                    return new Size[]{b, c, d};
                }

                public static Size valueOf(String str) {
                    return (Size) Enum.valueOf(Size.class, str);
                }

                public static Size[] values() {
                    return (Size[]) a.clone();
                }

                private Size(String str, int i) {
                }

                static {
                    Size[] a2 = a();
                    a = a2;
                    e = C8600drp.e(a2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Flexible(int i, Size size) {
                super(null);
                C8632dsu.c((Object) size, "");
                this.e = i;
                this.a = size;
            }

            public /* synthetic */ Flexible(int i, Size size, int i2, C8627dsp c8627dsp) {
                this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? Size.b : size);
            }
        }

        private Template() {
        }

        /* loaded from: classes2.dex */
        public static final class a extends Template {
            private final int b;
            private final int d;

            public final int c() {
                return this.d;
            }

            public final int e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return this.d == aVar.d && this.b == aVar.b;
                }
                return false;
            }

            public int hashCode() {
                return (Integer.hashCode(this.d) * 31) + Integer.hashCode(this.b);
            }

            public String toString() {
                int i = this.d;
                int i2 = this.b;
                return "NumColumns(order=" + i + ", numColumns=" + i2 + ")";
            }

            public a(int i, int i2) {
                super(null);
                this.d = i;
                this.b = i2;
            }
        }
    }
}
