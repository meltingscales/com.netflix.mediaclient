package o;

import com.netflix.mediaclient.media.subtitles.BaseSubtitle;
import java.lang.reflect.Field;
import java.net.Socket;

/* loaded from: classes3.dex */
public final class aVD extends C1992aVw {
    public static final e d = new e(null);
    private final int e;

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    public aVD(int i) {
        this.e = i;
    }

    @Override // o.C1992aVw, javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        C8632dsu.c((Object) socket, "");
        C8632dsu.c((Object) str, "");
        c(socket);
        return super.createSocket(socket, str, i, z);
    }

    private final void c(Socket socket) {
        socket.setTcpNoDelay(false);
        Field declaredField = socket.getClass().getDeclaredField(BaseSubtitle.IMPL);
        declaredField.setAccessible(true);
        Object obj = declaredField.get(socket);
        obj.getClass().getMethod("setOption", Integer.TYPE, Object.class).invoke(obj, 25, Integer.valueOf(this.e));
    }
}
