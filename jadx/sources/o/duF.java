package o;

/* loaded from: classes6.dex */
public final class duF {
    public static final C8671duf a(InterfaceC8676duk interfaceC8676duk, String str) {
        C8632dsu.c((Object) interfaceC8676duk, "");
        C8632dsu.c((Object) str, "");
        InterfaceC8677dul interfaceC8677dul = interfaceC8676duk instanceof InterfaceC8677dul ? (InterfaceC8677dul) interfaceC8676duk : null;
        if (interfaceC8677dul == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        return interfaceC8677dul.e(str);
    }
}
