package androidx.compose.ui.input.key;

import o.C8632dsu;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class KeyEvent {
    private final android.view.KeyEvent nativeKeyEvent;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyEvent m1644boximpl(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static android.view.KeyEvent m1645constructorimpl(android.view.KeyEvent keyEvent) {
        return keyEvent;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1646equalsimpl(android.view.KeyEvent keyEvent, Object obj) {
        return (obj instanceof KeyEvent) && C8632dsu.c(keyEvent, ((KeyEvent) obj).m1649unboximpl());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1647hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1648toStringimpl(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m1646equalsimpl(this.nativeKeyEvent, obj);
    }

    public int hashCode() {
        return m1647hashCodeimpl(this.nativeKeyEvent);
    }

    public String toString() {
        return m1648toStringimpl(this.nativeKeyEvent);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m1649unboximpl() {
        return this.nativeKeyEvent;
    }

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }
}
