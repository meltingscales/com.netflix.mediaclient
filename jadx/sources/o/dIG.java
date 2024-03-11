package o;

import com.netflix.model.leafs.originals.interactive.Audio;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dIG extends C7869dIj {
    private final Socket a;

    public dIG(Socket socket) {
        C8632dsu.c((Object) socket, "");
        this.a = socket;
    }

    @Override // o.C7869dIj
    protected IOException b(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(Audio.TYPE.timeout);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // o.C7869dIj
    protected void c() {
        Logger logger;
        Logger logger2;
        try {
            this.a.close();
        } catch (AssertionError e) {
            if (dIw.c(e)) {
                logger2 = dIx.b;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.a, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = dIx.b;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.a, (Throwable) e2);
        }
    }
}
