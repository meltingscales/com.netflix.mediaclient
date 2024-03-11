package com.netflix.model.leafs;

import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5149btM;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;

/* loaded from: classes5.dex */
public final class VideoEntityModelImpl<T extends InterfaceC5223buh> implements InterfaceC5222bug<T> {
    private final InterfaceC5149btM evidence;
    private final int position;
    private final T video;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoEntityModelImpl copy$default(VideoEntityModelImpl videoEntityModelImpl, InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC5223buh = videoEntityModelImpl.video;
        }
        if ((i2 & 2) != 0) {
            interfaceC5149btM = videoEntityModelImpl.evidence;
        }
        if ((i2 & 4) != 0) {
            i = videoEntityModelImpl.position;
        }
        return videoEntityModelImpl.copy(interfaceC5223buh, interfaceC5149btM, i);
    }

    public final T component1() {
        return this.video;
    }

    public final InterfaceC5149btM component2() {
        return this.evidence;
    }

    public final int component3() {
        return this.position;
    }

    public final VideoEntityModelImpl<T> copy(T t, InterfaceC5149btM interfaceC5149btM, int i) {
        C8632dsu.c((Object) t, "");
        return new VideoEntityModelImpl<>(t, interfaceC5149btM, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoEntityModelImpl) {
            VideoEntityModelImpl videoEntityModelImpl = (VideoEntityModelImpl) obj;
            return C8632dsu.c(this.video, videoEntityModelImpl.video) && C8632dsu.c(this.evidence, videoEntityModelImpl.evidence) && this.position == videoEntityModelImpl.position;
        }
        return false;
    }

    @Override // o.InterfaceC5222bug
    public InterfaceC5149btM getEvidence() {
        return this.evidence;
    }

    @Override // o.InterfaceC5222bug
    public int getPosition() {
        return this.position;
    }

    @Override // o.InterfaceC5222bug
    public T getVideo() {
        return this.video;
    }

    public int hashCode() {
        int hashCode = this.video.hashCode();
        InterfaceC5149btM interfaceC5149btM = this.evidence;
        return (((hashCode * 31) + (interfaceC5149btM == null ? 0 : interfaceC5149btM.hashCode())) * 31) + Integer.hashCode(this.position);
    }

    public String toString() {
        T t = this.video;
        InterfaceC5149btM interfaceC5149btM = this.evidence;
        int i = this.position;
        return "VideoEntityModelImpl(video=" + t + ", evidence=" + interfaceC5149btM + ", position=" + i + ")";
    }

    public VideoEntityModelImpl(T t, InterfaceC5149btM interfaceC5149btM, int i) {
        C8632dsu.c((Object) t, "");
        this.video = t;
        this.evidence = interfaceC5149btM;
        this.position = i;
    }

    public /* synthetic */ VideoEntityModelImpl(InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM, int i, int i2, C8627dsp c8627dsp) {
        this(interfaceC5223buh, (i2 & 2) != 0 ? null : interfaceC5149btM, i);
    }

    @Override // o.InterfaceC5222bug
    public String getCursor() {
        return InterfaceC5222bug.a.b(this);
    }

    @Override // o.InterfaceC5222bug
    public T getEntity() {
        return (T) InterfaceC5222bug.a.d(this);
    }
}
