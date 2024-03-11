package o;

/* renamed from: o.coc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7036coc extends C9941zV {
    public /* synthetic */ AbstractC7036coc(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC7036coc() {
    }

    /* renamed from: o.coc$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC7036coc {
        private final int d;

        public final int d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.d == ((c) obj).d;
        }

        public int hashCode() {
            return Integer.hashCode(this.d);
        }

        public String toString() {
            int i = this.d;
            return "SortOptionSelected(indexSelected=" + i + ")";
        }

        public c(int i) {
            super(null);
            this.d = i;
        }
    }
}
