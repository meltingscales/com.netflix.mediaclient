package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.chromium.net.impl.NetworkExceptionImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aIj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class ExecutorC1629aIj implements Executor {
    private RuntimeException c;
    private IOException d;
    private boolean a = false;
    private boolean b = false;
    private long f = -1;
    private final BlockingQueue<Runnable> e = new LinkedBlockingQueue();

    public void d() {
        this.a = false;
    }

    private Runnable d(boolean z, long j) {
        Runnable poll;
        try {
            if (!z) {
                poll = this.e.take();
            } else {
                poll = this.e.poll(j, TimeUnit.NANOSECONDS);
            }
            if (poll != null) {
                return poll;
            }
            throw new SocketTimeoutException();
        } catch (InterruptedException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }

    public void c() {
        b(0);
    }

    public void b(int i) {
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.MILLISECONDS);
        if (this.b) {
            IOException iOException = this.d;
            if (iOException != null) {
                throw iOException;
            }
            throw this.c;
        } else if (this.a) {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        } else {
            this.a = true;
            while (this.a) {
                if (i == 0) {
                    try {
                        d(false, 0L).run();
                    } catch (InterruptedIOException e) {
                        this.a = false;
                        this.b = true;
                        if (C1865aRc.m() && (e instanceof SocketTimeoutException)) {
                            NetworkExceptionImpl networkExceptionImpl = new NetworkExceptionImpl("message loop timeout", 4, -1);
                            this.d = networkExceptionImpl;
                            throw networkExceptionImpl;
                        }
                        this.d = e;
                        throw e;
                    } catch (RuntimeException e2) {
                        this.a = false;
                        this.b = true;
                        this.c = e2;
                        throw e2;
                    }
                } else {
                    d(true, (convert - System.nanoTime()) + nanoTime).run();
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.e.put(runnable);
        } catch (InterruptedException e) {
            throw new RejectedExecutionException(e);
        }
    }
}
