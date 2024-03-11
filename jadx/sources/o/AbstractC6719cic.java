package o;

/* renamed from: o.cic  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6719cic extends C9941zV {
    public /* synthetic */ AbstractC6719cic(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC6719cic() {
    }

    /* renamed from: o.cic$e */
    /* loaded from: classes4.dex */
    public static abstract class e extends AbstractC6719cic {

        /* renamed from: o.cic$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends e {
            private final int a;
            private final int e;

            public int a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return this.a == aVar.a && this.e == aVar.e;
                }
                return false;
            }

            public int hashCode() {
                return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.e);
            }

            public String toString() {
                int i = this.a;
                int i2 = this.e;
                return "Highlight(itemPosition=" + i + ", selectedImagesIndex=" + i2 + ")";
            }
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super(null);
        }

        /* renamed from: o.cic$e$d */
        /* loaded from: classes4.dex */
        public static final class d extends e {
            private final int b;
            private final boolean c;

            public final boolean b() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return this.c == dVar.c && this.b == dVar.b;
                }
                return false;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.c) * 31) + Integer.hashCode(this.b);
            }

            public String toString() {
                boolean z = this.c;
                int i = this.b;
                return "FullscreenToggle(fullscreen=" + z + ", itemPosition=" + i + ")";
            }

            public d(boolean z, int i) {
                super(null);
                this.c = z;
                this.b = i;
            }
        }

        /* renamed from: o.cic$e$b */
        /* loaded from: classes4.dex */
        public static final class b extends e {
            private final int d;
            private final boolean e;

            public int b() {
                return this.d;
            }

            public final boolean c() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return this.e == bVar.e && this.d == bVar.d;
                }
                return false;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.e) * 31) + Integer.hashCode(this.d);
            }

            public String toString() {
                boolean z = this.e;
                int i = this.d;
                return "OrientationChanged(portrait=" + z + ", itemPosition=" + i + ")";
            }

            public b(boolean z, int i) {
                super(null);
                this.e = z;
                this.d = i;
            }
        }

        /* renamed from: o.cic$e$c */
        /* loaded from: classes4.dex */
        public static final class c extends e {
            private final int c;
            private final int e;

            public int d() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return this.e == cVar.e && this.c == cVar.c;
                }
                return false;
            }

            public int hashCode() {
                return (Integer.hashCode(this.e) * 31) + Integer.hashCode(this.c);
            }

            public String toString() {
                int i = this.e;
                int i2 = this.c;
                return "Focus(itemPosition=" + i + ", selectedImagesIndex=" + i2 + ")";
            }

            public c(int i, int i2) {
                super(null);
                this.e = i;
                this.c = i2;
            }
        }

        /* renamed from: o.cic$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0117e extends e {
            private final int b;
            private final int c;

            public final int c() {
                return this.b;
            }

            public int d() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0117e) {
                    C0117e c0117e = (C0117e) obj;
                    return this.c == c0117e.c && this.b == c0117e.b;
                }
                return false;
            }

            public int hashCode() {
                return (Integer.hashCode(this.c) * 31) + Integer.hashCode(this.b);
            }

            public String toString() {
                int i = this.c;
                int i2 = this.b;
                return "WindowFocusChanged(itemPosition=" + i + ", playPauseRequest=" + i2 + ")";
            }

            public C0117e(int i, int i2) {
                super(null);
                this.c = i;
                this.b = i2;
            }
        }
    }

    /* renamed from: o.cic$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC6719cic {
        private final boolean a;
        private final boolean b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return this.b == hVar.b && this.a == hVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.b) * 31) + Boolean.hashCode(this.a);
        }

        public String toString() {
            boolean z = this.b;
            boolean z2 = this.a;
            return "ToggleOrientationManager(enableSensor=" + z + ", lockOrientation=" + z2 + ")";
        }

        public h(boolean z, boolean z2) {
            super(null);
            this.b = z;
            this.a = z2;
        }
    }

    /* renamed from: o.cic$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC6719cic {
        public static final b b = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o.cic$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC6719cic {
        public static final d d = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: o.cic$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC6719cic {
        private final int a;
        private final String d;

        public final String c() {
            return this.d;
        }

        public final int d() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.a = i;
            this.d = str;
        }
    }

    /* renamed from: o.cic$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC6719cic {
        private final boolean b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public String toString() {
            boolean z = this.b;
            return "ChromeVisibilityChanged(visible=" + z + ")";
        }

        public c(boolean z) {
            super(null);
            this.b = z;
        }
    }
}
