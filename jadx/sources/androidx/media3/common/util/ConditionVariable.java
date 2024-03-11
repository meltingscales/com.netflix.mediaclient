package androidx.media3.common.util;

/* loaded from: classes2.dex */
public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public ConditionVariable(Clock clock) {
        this.clock = clock;
    }

    public boolean open() {
        synchronized (this) {
            if (this.isOpen) {
                return false;
            }
            this.isOpen = true;
            notifyAll();
            return true;
        }
    }

    public boolean close() {
        boolean z;
        synchronized (this) {
            z = this.isOpen;
            this.isOpen = false;
        }
        return z;
    }

    public void block() {
        synchronized (this) {
            while (!this.isOpen) {
                wait();
            }
        }
    }

    public void blockUninterruptible() {
        synchronized (this) {
            boolean z = false;
            while (!this.isOpen) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean isOpen() {
        boolean z;
        synchronized (this) {
            z = this.isOpen;
        }
        return z;
    }
}
