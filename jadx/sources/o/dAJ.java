package o;

/* loaded from: classes5.dex */
final /* synthetic */ class dAJ {
    private static final int b = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return b;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
