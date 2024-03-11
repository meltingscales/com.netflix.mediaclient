package androidx.compose.runtime;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
final class GroupKind {
    public static final Companion Companion = new Companion(null);
    private static final int Group = m995constructorimpl(0);
    private static final int Node = m995constructorimpl(1);
    private static final int ReusableNode = m995constructorimpl(2);
    private final int value;

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m995constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m996equalsimpl(int i, Object obj) {
        return (obj instanceof GroupKind) && i == ((GroupKind) obj).m999unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m997hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m998toStringimpl(int i) {
        return "GroupKind(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m996equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m997hashCodeimpl(this.value);
    }

    public String toString() {
        return m998toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m999unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getGroup-ULZAiWs  reason: not valid java name */
        public final int m1000getGroupULZAiWs() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-ULZAiWs  reason: not valid java name */
        public final int m1001getNodeULZAiWs() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-ULZAiWs  reason: not valid java name */
        public final int m1002getReusableNodeULZAiWs() {
            return GroupKind.ReusableNode;
        }
    }
}
