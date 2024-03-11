package o;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes5.dex */
public final class dIw {
    public static final dIH a() {
        return dIy.d();
    }

    public static final dIH a(Socket socket) {
        return dIx.d(socket);
    }

    public static final dIJ a(InputStream inputStream) {
        return dIx.a(inputStream);
    }

    public static final dIH b(File file, boolean z) {
        return dIx.c(file, z);
    }

    public static final dIq b(dIH dih) {
        return dIy.b(dih);
    }

    public static final dIH c(OutputStream outputStream) {
        return dIx.e(outputStream);
    }

    public static final dIJ c(File file) {
        return dIx.c(file);
    }

    public static final dIJ c(Socket socket) {
        return dIx.a(socket);
    }

    public static final boolean c(AssertionError assertionError) {
        return dIx.b(assertionError);
    }

    public static final dIH e(File file) {
        return dIx.b(file);
    }

    public static final InterfaceC7871dIn e(dIJ dij) {
        return dIy.e(dij);
    }
}
