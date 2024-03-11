package o;

import java.util.Formatter;
import java.util.Locale;

/* renamed from: o.dfR  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8174dfR {
    private final StringBuilder c;
    private final Formatter d;
    private final String e;

    public C8174dfR() {
        this("%02d:%02d");
    }

    public C8174dfR(String str) {
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.d = new Formatter(sb, Locale.getDefault());
        this.e = str;
    }

    public String d(int i) {
        this.c.setLength(0);
        if (i < 0) {
            C1044Mm.j("TimeFormatterHelper", "Received negative time: " + i);
            return this.d.format(this.e, 0, 0).toString();
        }
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / 3600;
        if (i4 > 0) {
            return this.d.format("%d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)).toString();
        }
        return this.d.format(this.e, Integer.valueOf(i3), Integer.valueOf(i2)).toString();
    }

    public String b(int i) {
        return d(i / 1000);
    }
}
