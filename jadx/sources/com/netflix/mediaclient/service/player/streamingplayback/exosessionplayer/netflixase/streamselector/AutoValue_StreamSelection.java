package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector;

/* loaded from: classes6.dex */
final class AutoValue_StreamSelection extends StreamSelection {
    private final Object adaptationPlan$728c57fe;
    private final int index;
    private final int paceRate;

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.StreamSelection
    public Object adaptationPlan$29f49be3() {
        return this.adaptationPlan$728c57fe;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.StreamSelection
    public int index() {
        return this.index;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.StreamSelection
    public int paceRate() {
        return this.paceRate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_StreamSelection(int i, int i2, Object obj) {
        this.index = i;
        this.paceRate = i2;
        this.adaptationPlan$728c57fe = obj;
    }

    public String toString() {
        return "StreamSelection{index=" + this.index + ", paceRate=" + this.paceRate + ", adaptationPlan=" + this.adaptationPlan$728c57fe + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StreamSelection) {
            StreamSelection streamSelection = (StreamSelection) obj;
            if (this.index == streamSelection.index() && this.paceRate == streamSelection.paceRate()) {
                Object obj2 = this.adaptationPlan$728c57fe;
                if (obj2 == null) {
                    if (streamSelection.adaptationPlan$29f49be3() == null) {
                        return true;
                    }
                } else if (obj2.equals(streamSelection.adaptationPlan$29f49be3())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.index;
        int i2 = this.paceRate;
        Object obj = this.adaptationPlan$728c57fe;
        return ((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (obj == null ? 0 : obj.hashCode());
    }
}
