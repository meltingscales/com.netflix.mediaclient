package o;

import java.util.List;

/* renamed from: o.cfn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6571cfn {
    public /* synthetic */ AbstractC6571cfn(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC6571cfn() {
    }

    /* renamed from: o.cfn$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC6571cfn {
        public static final b d = new b();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1634534646;
        }

        public String toString() {
            return "NoDevices";
        }

        private b() {
            super(null);
        }
    }

    /* renamed from: o.cfn$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC6571cfn {
        private final List<String> a;

        public final List<String> d() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<String> list) {
            super(null);
            C8632dsu.c((Object) list, "");
            this.a = list;
        }
    }

    /* renamed from: o.cfn$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC6571cfn {
        private final String a;
        private final String b;
        private final String c;

        public final String a() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            this.b = str;
            this.a = str2;
            this.c = str3;
        }
    }
}
