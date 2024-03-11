package o;

import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class dGG {
    public static final /* synthetic */ void a(dGH dgh, dGK dgk, String str) {
        b(dgh, dgk, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(dGH dgh, dGK dgk, String str) {
        Logger a = dGL.c.a();
        StringBuilder sb = new StringBuilder();
        sb.append(dgk.i());
        sb.append(' ');
        dsE dse = dsE.b;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C8632dsu.b(format, "");
        sb.append(format);
        sb.append(": ");
        sb.append(dgh.b());
        a.fine(sb.toString());
    }

    public static final String e(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / ((long) Prefetch.NANOSECONDS_PER_SECOND)) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / ((long) Prefetch.NANOSECONDS_PER_MILLISECOND)) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / ((long) Prefetch.NANOSECONDS_PER_MILLISECOND)) + " ms";
        } else {
            str = ((j + 500000000) / ((long) Prefetch.NANOSECONDS_PER_SECOND)) + " s ";
        }
        dsE dse = dsE.b;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C8632dsu.b(format, "");
        return format;
    }
}
