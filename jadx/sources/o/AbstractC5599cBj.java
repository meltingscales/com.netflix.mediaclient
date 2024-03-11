package o;

/* renamed from: o.cBj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5599cBj extends cBA {
    public /* synthetic */ AbstractC5599cBj(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC5599cBj() {
        super(null);
    }

    /* renamed from: o.cBj$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC5599cBj {
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
            return -906252112;
        }

        public String toString() {
            return "ShowPrePlayUIExperience";
        }

        private b() {
            super(null);
        }
    }

    /* renamed from: o.cBj$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5599cBj {
        public static final a a = new a();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1282160203;
        }

        public String toString() {
            return "HidePrePlayUIExperience";
        }

        private a() {
            super(null);
        }
    }
}
