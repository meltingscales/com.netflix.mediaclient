package o;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_VideoMerchAutoPlayProfileLevelSetting;
import com.netflix.mediaclient.service.user.UserAgent;

/* renamed from: o.ciB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6692ciB extends C1045Mp {
    public static final C6692ciB a = new C6692ciB();
    private static b c = new b(false, false, 3, null);

    private C6692ciB() {
        super("VMAutoPlayRepo");
    }

    /* renamed from: o.ciB$b */
    /* loaded from: classes4.dex */
    static final class b {
        private final boolean b;
        private final boolean e;

        public b() {
            this(false, false, 3, null);
        }

        public static /* synthetic */ b d(b bVar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.b;
            }
            if ((i & 2) != 0) {
                z2 = bVar.e;
            }
            return bVar.e(z, z2);
        }

        public final boolean d() {
            return this.b;
        }

        public final b e(boolean z, boolean z2) {
            return new b(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b == bVar.b && this.e == bVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.b) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            boolean z = this.b;
            boolean z2 = this.e;
            return "VideoMerchAutoPlaySettingOverride(extras=" + z + ", homeTrailersFeedAutoPlaySuppressed=" + z2 + ")";
        }

        public b(boolean z, boolean z2) {
            this.b = z;
            this.e = z2;
        }

        public /* synthetic */ b(boolean z, boolean z2, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }

    public final boolean a() {
        boolean j = j();
        if (j && c.d()) {
            return true;
        }
        return !j;
    }

    public final boolean d() {
        return !j();
    }

    public final boolean e() {
        return !j();
    }

    public final boolean b() {
        return !j();
    }

    public final void c() {
        if (!j() || c.d()) {
            return;
        }
        c = b.d(c, true, false, 2, null);
    }

    private final boolean j() {
        if (Config_FastProperty_VideoMerchAutoPlayProfileLevelSetting.Companion.a()) {
            UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
            InterfaceC5283bvo j = k != null ? k.j() : null;
            if (j != null) {
                return j.disableVideoMerchAutoPlay();
            }
            return false;
        }
        return false;
    }

    public final void g() {
        c = new b(false, false, 3, null);
    }
}
