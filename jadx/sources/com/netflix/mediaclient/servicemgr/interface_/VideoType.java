package com.netflix.mediaclient.servicemgr.interface_;

/* loaded from: classes.dex */
public enum VideoType {
    MOVIE("movies", 0),
    SHOW("shows", 1),
    SEASON("seasons", 2),
    EPISODE("episodes", 3),
    CHARACTERS("characters", 4),
    SUPPLEMENTAL("supplementals", 5),
    UNAVAILABLE("unavailable", 6),
    UNKNOWN("", 7),
    GAMES("games", 8),
    CATEGORY("category", 9);
    
    private final int key;
    private final String value;

    public static boolean isPresentationTrackingType(VideoType videoType) {
        return MOVIE == videoType || SHOW == videoType || SEASON == videoType || EPISODE == videoType || SUPPLEMENTAL == videoType || GAMES == videoType;
    }

    public int getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    VideoType(String str, int i) {
        this.value = str;
        this.key = i;
    }

    public static VideoType create(String str) {
        VideoType[] values;
        for (VideoType videoType : values()) {
            if (videoType.value.equalsIgnoreCase(str)) {
                return videoType;
            }
        }
        return UNKNOWN;
    }

    public static VideoType create(int i) {
        VideoType[] values;
        for (VideoType videoType : values()) {
            if (videoType.key == i) {
                return videoType;
            }
        }
        return UNKNOWN;
    }
}
