package o;

import android.system.ErrnoException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class aFQ {
    public static final Integer c(IOException iOException) {
        C8632dsu.c((Object) iOException, "");
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if (iOException2 instanceof ErrnoException) {
                return Integer.valueOf(((ErrnoException) iOException2).errno);
            }
        }
        return null;
    }
}
