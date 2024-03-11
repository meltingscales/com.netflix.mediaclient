package org.linphone.core;

import org.linphone.core.LinphonePlayer;

/* loaded from: classes6.dex */
public class LinphonePlayerImpl implements LinphonePlayer {
    private long nativePtr;

    private native void close(long j);

    private native void destroy(long j);

    private native int getCurrentPosition(long j);

    private native int getDuration(long j);

    private native int getState(long j);

    private native void init(long j);

    private native int open(long j, String str);

    private native int pause(long j);

    private native int seek(long j, int i);

    private native int start(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinphonePlayerImpl(long j) {
        this.nativePtr = j;
        init(j);
    }

    @Override // org.linphone.core.LinphonePlayer
    public int open(String str) {
        int open;
        synchronized (this) {
            open = open(this.nativePtr, str);
        }
        return open;
    }

    @Override // org.linphone.core.LinphonePlayer
    public int start() {
        int start;
        synchronized (this) {
            start = start(this.nativePtr);
        }
        return start;
    }

    @Override // org.linphone.core.LinphonePlayer
    public int pause() {
        int pause;
        synchronized (this) {
            pause = pause(this.nativePtr);
        }
        return pause;
    }

    @Override // org.linphone.core.LinphonePlayer
    public int seek(int i) {
        int seek;
        synchronized (this) {
            seek = seek(this.nativePtr, i);
        }
        return seek;
    }

    @Override // org.linphone.core.LinphonePlayer
    public LinphonePlayer.State getState() {
        LinphonePlayer.State fromValue;
        synchronized (this) {
            fromValue = LinphonePlayer.State.fromValue(getState(this.nativePtr));
        }
        return fromValue;
    }

    @Override // org.linphone.core.LinphonePlayer
    public int getDuration() {
        int duration;
        synchronized (this) {
            duration = getDuration(this.nativePtr);
        }
        return duration;
    }

    @Override // org.linphone.core.LinphonePlayer
    public int getCurrentPosition() {
        int currentPosition;
        synchronized (this) {
            currentPosition = getCurrentPosition(this.nativePtr);
        }
        return currentPosition;
    }

    @Override // org.linphone.core.LinphonePlayer
    public void close() {
        synchronized (this) {
            close(this.nativePtr);
        }
    }

    protected void finalize() {
        destroy(this.nativePtr);
    }
}
