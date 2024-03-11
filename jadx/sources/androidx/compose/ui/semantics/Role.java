package androidx.compose.ui.semantics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class Role {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Button = m2030constructorimpl(0);
    private static final int Checkbox = m2030constructorimpl(1);
    private static final int Switch = m2030constructorimpl(2);
    private static final int RadioButton = m2030constructorimpl(3);
    private static final int Tab = m2030constructorimpl(4);
    private static final int Image = m2030constructorimpl(5);
    private static final int DropdownList = m2030constructorimpl(6);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Role m2029boximpl(int i) {
        return new Role(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m2030constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2031equalsimpl(int i, Object obj) {
        return (obj instanceof Role) && i == ((Role) obj).m2035unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2032equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2033hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2031equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2033hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2035unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getButton-o7Vup1c  reason: not valid java name */
        public final int m2036getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCheckbox-o7Vup1c  reason: not valid java name */
        public final int m2037getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getSwitch-o7Vup1c  reason: not valid java name */
        public final int m2041getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getRadioButton-o7Vup1c  reason: not valid java name */
        public final int m2040getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getTab-o7Vup1c  reason: not valid java name */
        public final int m2042getTabo7Vup1c() {
            return Role.Tab;
        }

        /* renamed from: getImage-o7Vup1c  reason: not valid java name */
        public final int m2039getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getDropdownList-o7Vup1c  reason: not valid java name */
        public final int m2038getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }
    }

    private /* synthetic */ Role(int i) {
        this.value = i;
    }

    public String toString() {
        return m2034toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2034toStringimpl(int i) {
        return m2032equalsimpl0(i, Button) ? "Button" : m2032equalsimpl0(i, Checkbox) ? "Checkbox" : m2032equalsimpl0(i, Switch) ? "Switch" : m2032equalsimpl0(i, RadioButton) ? "RadioButton" : m2032equalsimpl0(i, Tab) ? "Tab" : m2032equalsimpl0(i, Image) ? "Image" : m2032equalsimpl0(i, DropdownList) ? "DropdownList" : "Unknown";
    }
}
