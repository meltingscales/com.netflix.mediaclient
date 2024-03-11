package o;

import java.io.File;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import o.AbstractC9245lu;
import o.C9222lX;

/* renamed from: o.lY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9223lY extends AbstractC9245lu {
    private final C9258mG c;
    public static final b e = new b(null);
    private static final Comparator<? super File> b = new Comparator() { // from class: o.lW
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int b2;
            b2 = C9223lY.b((File) obj, (File) obj2);
            return b2;
        }
    };

    public C9223lY(C9258mG c9258mG, InterfaceC9200lB interfaceC9200lB, AbstractC9245lu.d dVar) {
        super(new File(c9258mG.x().getValue(), "bugsnag/sessions"), c9258mG.t(), b, interfaceC9200lB, dVar);
        this.c = c9258mG;
    }

    public final boolean d(File file) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -60);
        C9222lX.e eVar = C9222lX.d;
        C8632dsu.d(file);
        return eVar.d(file) < calendar.getTimeInMillis();
    }

    public final Date b(File file) {
        C9222lX.e eVar = C9222lX.d;
        C8632dsu.d(file);
        return new Date(eVar.d(file));
    }

    /* renamed from: o.lY$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(File file, File file2) {
        if (file == null && file2 == null) {
            return 0;
        }
        if (file == null) {
            return 1;
        }
        if (file2 == null) {
            return -1;
        }
        return file.getName().compareTo(file2.getName());
    }

    @Override // o.AbstractC9245lu
    public String c(Object obj) {
        return C9222lX.d.d(obj, this.c).e();
    }
}
