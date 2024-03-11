package com.netflix.mediaclient.servicemgr;

/* loaded from: classes4.dex */
public interface IPlayer {

    /* loaded from: classes4.dex */
    public interface c {
        String a();

        String b();

        int d();

        boolean h();
    }

    /* loaded from: classes4.dex */
    public enum PlaybackType {
        LivePlayback("LivePlayback"),
        StreamingPlayback("StreamingPlayback"),
        OfflinePlayback("OfflinePlayback"),
        Unknown("Unknown");
        
        private final String i;

        public String c() {
            return this.i;
        }

        PlaybackType(String str) {
            this.i = str;
        }

        public static PlaybackType c(String str) {
            PlaybackType[] values;
            for (PlaybackType playbackType : values()) {
                if (playbackType.i.equalsIgnoreCase(str)) {
                    return playbackType;
                }
            }
            return Unknown;
        }
    }
}
