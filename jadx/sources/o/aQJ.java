package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;

/* loaded from: classes.dex */
public final class aQJ extends aRM {
    private static final c b;
    private static final Map<Integer, c> c;
    public static final a e = new a(null);
    private final String f = "49548";
    private final int d = c.size();
    private final String a = "Netflix Marks";

    public static final c j() {
        return e.a();
    }

    @Override // o.aRM
    public String d() {
        return this.f;
    }

    @Override // o.aRM
    /* renamed from: i */
    public String a() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final boolean a;
        private final boolean b;
        private final String c;
        private final boolean d;
        private final boolean e;

        public final boolean a() {
            return this.e;
        }

        public final boolean b() {
            return this.b;
        }

        public final boolean c() {
            return this.a;
        }

        public final boolean e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && this.d == cVar.d && this.e == cVar.e && this.b == cVar.b && this.a == cVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.c.hashCode() * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.a);
        }

        public String toString() {
            String str = this.c;
            boolean z = this.d;
            boolean z2 = this.e;
            boolean z3 = this.b;
            boolean z4 = this.a;
            return "Features(friendlyName=" + str + ", canBookmark=" + z + ", canShare=" + z2 + ", hasPreviewPlayer=" + z3 + ", hasCreationTooltip=" + z4 + ")";
        }

        public c(String str, boolean z, boolean z2, boolean z3, boolean z4) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = z;
            this.e = z2;
            this.b = z3;
            this.a = z4;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final boolean d() {
            return e() != ABTestConfig.Cell.CELL_1;
        }

        public final c a() {
            Object e;
            e = dqE.e(aQJ.c, Integer.valueOf(e().getCellId()));
            return (c) e;
        }

        private final ABTestConfig.Cell e() {
            return C1818aPj.e(aQJ.class);
        }
    }

    static {
        Map<Integer, c> c2;
        c cVar = new c("Control", false, false, false, false);
        b = cVar;
        c2 = dqE.c(dpD.a(1, cVar), dpD.a(2, new c("Bookmark + Preview Player", true, false, true, true)), dpD.a(3, new c("Bookmark + Preview Player (No Tooltip)", true, false, true, false)), dpD.a(4, new c("Bookmark + Share + Preview Player", true, true, true, true)), dpD.a(5, new c("Bookmark + Share", true, true, false, true)));
        c = c2;
    }
}
