package o;

import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation;
import java.util.List;

/* renamed from: o.ciT  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6710ciT extends C9941zV {
    public /* synthetic */ AbstractC6710ciT(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.ciT$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC6710ciT {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    private AbstractC6710ciT() {
    }

    /* renamed from: o.ciT$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC6710ciT {
        public static final a e = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: o.ciT$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC6710ciT {
        private final List<NGPBeaconControllerOrientation> c;

        public final List<NGPBeaconControllerOrientation> c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.c, ((e) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            List<NGPBeaconControllerOrientation> list = this.c;
            return "OverrideOrientations(orientations=" + list + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends NGPBeaconControllerOrientation> list) {
            super(null);
            C8632dsu.c((Object) list, "");
            this.c = list;
        }
    }

    /* renamed from: o.ciT$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC6710ciT {
        public static final d d = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: o.ciT$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC6710ciT {
        public static final b d = new b();

        private b() {
            super(null);
        }
    }
}
