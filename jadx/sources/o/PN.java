package o;

import android.os.Parcelable;

/* loaded from: classes3.dex */
public abstract class PN extends C9941zV {
    public /* synthetic */ PN(C8627dsp c8627dsp) {
        this();
    }

    private PN() {
    }

    /* loaded from: classes3.dex */
    public static final class b extends PN {
        private final QI<Parcelable> e;

        public final QI<Parcelable> b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.e, ((b) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            QI<Parcelable> qi = this.e;
            return "Share(shareTarget=" + qi + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(QI<Parcelable> qi) {
            super(null);
            C8632dsu.c((Object) qi, "");
            this.e = qi;
        }
    }
}
