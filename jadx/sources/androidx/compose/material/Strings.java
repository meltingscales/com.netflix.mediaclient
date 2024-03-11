package androidx.compose.material;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes5.dex */
public final class Strings {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NavigationMenu = m644constructorimpl(0);
    private static final int CloseDrawer = m644constructorimpl(1);
    private static final int CloseSheet = m644constructorimpl(2);
    private static final int DefaultErrorMessage = m644constructorimpl(3);
    private static final int ExposedDropdownMenu = m644constructorimpl(4);
    private static final int SliderRangeStart = m644constructorimpl(5);
    private static final int SliderRangeEnd = m644constructorimpl(6);

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m644constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m645equalsimpl(int i, Object obj) {
        return (obj instanceof Strings) && i == ((Strings) obj).m649unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m646equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m647hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m648toStringimpl(int i) {
        return "Strings(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m645equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m647hashCodeimpl(this.value);
    }

    public String toString() {
        return m648toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m649unboximpl() {
        return this.value;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNavigationMenu-UdPEhr4  reason: not valid java name */
        public final int m654getNavigationMenuUdPEhr4() {
            return Strings.NavigationMenu;
        }

        /* renamed from: getCloseDrawer-UdPEhr4  reason: not valid java name */
        public final int m650getCloseDrawerUdPEhr4() {
            return Strings.CloseDrawer;
        }

        /* renamed from: getCloseSheet-UdPEhr4  reason: not valid java name */
        public final int m651getCloseSheetUdPEhr4() {
            return Strings.CloseSheet;
        }

        /* renamed from: getDefaultErrorMessage-UdPEhr4  reason: not valid java name */
        public final int m652getDefaultErrorMessageUdPEhr4() {
            return Strings.DefaultErrorMessage;
        }

        /* renamed from: getExposedDropdownMenu-UdPEhr4  reason: not valid java name */
        public final int m653getExposedDropdownMenuUdPEhr4() {
            return Strings.ExposedDropdownMenu;
        }

        /* renamed from: getSliderRangeStart-UdPEhr4  reason: not valid java name */
        public final int m656getSliderRangeStartUdPEhr4() {
            return Strings.SliderRangeStart;
        }

        /* renamed from: getSliderRangeEnd-UdPEhr4  reason: not valid java name */
        public final int m655getSliderRangeEndUdPEhr4() {
            return Strings.SliderRangeEnd;
        }
    }
}
