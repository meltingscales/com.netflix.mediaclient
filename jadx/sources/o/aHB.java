package o;

import android.os.HandlerThread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.RequestFinishedInfo;

/* loaded from: classes3.dex */
class aHB extends RequestFinishedInfo.Listener {
    private static final BlockingQueue<Runnable> b = new LinkedBlockingQueue(64);
    private final HandlerThread c;
    private final aHC d;

    private aHB(Executor executor, aHC ahc) {
        super(executor);
        this.c = null;
        this.d = ahc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aHB d(aHC ahc) {
        return new aHB(new ThreadPoolExecutor(1, 4, 5L, TimeUnit.SECONDS, b), ahc);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        if (requestFinishedInfo == null) {
            return;
        }
        this.d.e(requestFinishedInfo);
    }
}
