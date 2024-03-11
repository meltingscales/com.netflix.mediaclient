package o;

import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;

/* loaded from: classes4.dex */
public abstract class bAB {
    public /* synthetic */ bAB(C8627dsp c8627dsp) {
        this();
    }

    /* loaded from: classes4.dex */
    public static final class b extends bAB {
        public static final b d = new b();

        private b() {
            super(null);
        }
    }

    private bAB() {
    }

    /* loaded from: classes4.dex */
    public static final class a extends bAB {
        private final CollectTaste.MessageType c;

        public final CollectTaste.MessageType a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.c == ((a) obj).c;
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            CollectTaste.MessageType messageType = this.c;
            return "CollectTasteRowStateChanged(messageType=" + messageType + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CollectTaste.MessageType messageType) {
            super(null);
            C8632dsu.c((Object) messageType, "");
            this.c = messageType;
        }
    }
}
