package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class dIx {
    private static final Logger b = Logger.getLogger("okio.Okio");

    public static final dIH e(OutputStream outputStream) {
        C8632dsu.c((Object) outputStream, "");
        return new dIz(outputStream, new dIK());
    }

    public static final dIJ a(InputStream inputStream) {
        C8632dsu.c((Object) inputStream, "");
        return new dIv(inputStream, new dIK());
    }

    public static final dIH d(Socket socket) {
        C8632dsu.c((Object) socket, "");
        dIG dig = new dIG(socket);
        OutputStream outputStream = socket.getOutputStream();
        C8632dsu.a(outputStream, "");
        return dig.d(new dIz(outputStream, dig));
    }

    public static final dIJ a(Socket socket) {
        C8632dsu.c((Object) socket, "");
        dIG dig = new dIG(socket);
        InputStream inputStream = socket.getInputStream();
        C8632dsu.a(inputStream, "");
        return dig.c(new dIv(inputStream, dig));
    }

    public static final dIH c(File file, boolean z) {
        C8632dsu.c((Object) file, "");
        return dIw.c(new FileOutputStream(file, z));
    }

    public static /* synthetic */ dIH c(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return dIw.b(file, z);
    }

    public static final dIH b(File file) {
        C8632dsu.c((Object) file, "");
        return dIw.c(new FileOutputStream(file, true));
    }

    public static final dIJ c(File file) {
        C8632dsu.c((Object) file, "");
        return dIw.a(new FileInputStream(file));
    }

    public static final boolean b(AssertionError assertionError) {
        String message;
        boolean d;
        C8632dsu.c((Object) assertionError, "");
        if (assertionError.getCause() == null || (message = assertionError.getMessage()) == null) {
            return false;
        }
        d = duD.d((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null);
        return d;
    }
}
