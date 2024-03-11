package org.chromium.net.urlconnection;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class MessageLoop implements Executor {
    private boolean mLoopFailed;
    private boolean mLoopRunning;
    private InterruptedIOException mPriorInterruptedIOException;
    private RuntimeException mPriorRuntimeException;
    private long mThreadId = -1;
    private final BlockingQueue<Runnable> mQueue = new LinkedBlockingQueue();

    public void quit() {
        this.mLoopRunning = false;
    }

    private Runnable take(boolean z, long j) {
        Runnable poll;
        try {
            if (!z) {
                poll = this.mQueue.take();
            } else {
                poll = this.mQueue.poll(j, TimeUnit.NANOSECONDS);
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

    public void loop() {
        loop(0);
    }

    public void loop(int i) {
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.MILLISECONDS);
        if (this.mLoopFailed) {
            InterruptedIOException interruptedIOException = this.mPriorInterruptedIOException;
            if (interruptedIOException != null) {
                throw interruptedIOException;
            }
            throw this.mPriorRuntimeException;
        } else if (this.mLoopRunning) {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        } else {
            this.mLoopRunning = true;
            while (this.mLoopRunning) {
                if (i == 0) {
                    try {
                        take(false, 0L).run();
                    } catch (InterruptedIOException e) {
                        this.mLoopRunning = false;
                        this.mLoopFailed = true;
                        this.mPriorInterruptedIOException = e;
                        throw e;
                    } catch (RuntimeException e2) {
                        this.mLoopRunning = false;
                        this.mLoopFailed = true;
                        this.mPriorRuntimeException = e2;
                        throw e2;
                    }
                } else {
                    take(true, (convert - System.nanoTime()) + nanoTime).run();
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
            this.mQueue.put(runnable);
        } catch (InterruptedException e) {
            throw new RejectedExecutionException(e);
        }
    }
}
