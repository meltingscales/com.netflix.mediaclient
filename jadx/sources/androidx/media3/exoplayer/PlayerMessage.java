package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class PlayerMessage {
    private final Clock clock;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Looper looper;
    private int mediaItemIndex;
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private long positionMs = -9223372036854775807L;
    private boolean deleteAfterDelivery = true;

    /* loaded from: classes2.dex */
    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    /* loaded from: classes2.dex */
    public interface Target {
        void handleMessage(int i, Object obj);
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public Looper getLooper() {
        return this.looper;
    }

    public int getMediaItemIndex() {
        return this.mediaItemIndex;
    }

    public Object getPayload() {
        return this.payload;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public Target getTarget() {
        return this.target;
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    public int getType() {
        return this.type;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i, Clock clock, Looper looper) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.looper = looper;
        this.clock = clock;
        this.mediaItemIndex = i;
    }

    public PlayerMessage setType(int i) {
        Assertions.checkState(!this.isSent);
        this.type = i;
        return this;
    }

    public PlayerMessage setPayload(Object obj) {
        Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    @Deprecated
    public PlayerMessage setHandler(Handler handler) {
        return setLooper(handler.getLooper());
    }

    public PlayerMessage setLooper(Looper looper) {
        Assertions.checkState(!this.isSent);
        this.looper = looper;
        return this;
    }

    public PlayerMessage setPosition(int i, long j) {
        Assertions.checkState(!this.isSent);
        Assertions.checkArgument(j != -9223372036854775807L);
        if (i < 0 || (!this.timeline.isEmpty() && i >= this.timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(this.timeline, i, j);
        }
        this.mediaItemIndex = i;
        this.positionMs = j;
        return this;
    }

    public PlayerMessage setDeleteAfterDelivery(boolean z) {
        Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z;
        return this;
    }

    public PlayerMessage send() {
        Assertions.checkState(!this.isSent);
        if (this.positionMs == -9223372036854775807L) {
            Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public PlayerMessage cancel() {
        synchronized (this) {
            Assertions.checkState(this.isSent);
            this.isCanceled = true;
            markAsProcessed(false);
        }
        return this;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this) {
            z = this.isCanceled;
        }
        return z;
    }

    public void markAsProcessed(boolean z) {
        synchronized (this) {
            this.isDelivered = z | this.isDelivered;
            this.isProcessed = true;
            notifyAll();
        }
    }

    public boolean blockUntilDelivered(long j) {
        boolean z;
        boolean z2;
        synchronized (this) {
            Assertions.checkState(this.isSent);
            Assertions.checkState(this.looper.getThread() != Thread.currentThread());
            long elapsedRealtime = this.clock.elapsedRealtime();
            long j2 = j;
            while (true) {
                z = this.isProcessed;
                if (z || j2 <= 0) {
                    break;
                }
                this.clock.onThreadBlocked();
                wait(j2);
                j2 = (elapsedRealtime + j) - this.clock.elapsedRealtime();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
            z2 = this.isDelivered;
        }
        return z2;
    }
}
