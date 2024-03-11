package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8689dux;
import o.InterfaceC0952Ix;
import o.InterfaceC5205buP;

/* loaded from: classes5.dex */
public final class VolatileBitmaskedDetailsFalkorLeaf extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC5205buP {
    public static final Companion Companion = new Companion(null);
    private static final long IS_AGE_PROTECTED_MASK = 4294967296L;
    private static final long IS_AVAILABLE_FOR_DOWNLOAD_MASK = 34359738368L;
    private static final long IS_PIN_PROTECTED_MASK = 17179869184L;
    private static final long IS_PREVIEW_PROTECTED_MASK = 8589934592L;
    private static final long PLAYABLE_ID_MASK = 2147483647L;
    private Integer bookmarkPositionSeconds;
    private boolean isAgeProtected;
    private boolean isAvailableForDownload;
    private boolean isPinProtected;
    private boolean isPreviewProtected;
    private String playableId;

    public Integer getBookmarkPositionSeconds() {
        return this.bookmarkPositionSeconds;
    }

    @Override // o.InterfaceC5205buP
    public String getPlayableId() {
        return this.playableId;
    }

    public boolean isAgeProtected() {
        return this.isAgeProtected;
    }

    public boolean isAvailableForDownload() {
        return this.isAvailableForDownload;
    }

    public boolean isPinProtected() {
        return this.isPinProtected;
    }

    public boolean isPreviewProtected() {
        return this.isPreviewProtected;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("VolatileBitmaskedDetailsFalkorLeaf");
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        Long m;
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (C8632dsu.c((Object) key, (Object) "bookmark")) {
                this.bookmarkPositionSeconds = Integer.valueOf(value.getAsInt());
            } else if (C8632dsu.c((Object) key, (Object) "cd")) {
                String asString = value.getAsString();
                C8632dsu.a(asString, "");
                m = C8689dux.m(asString);
                if (m != null) {
                    long longValue = m.longValue();
                    this.isAvailableForDownload = (longValue & IS_AVAILABLE_FOR_DOWNLOAD_MASK) == IS_AVAILABLE_FOR_DOWNLOAD_MASK;
                    this.isPinProtected = (longValue & IS_PIN_PROTECTED_MASK) == IS_PIN_PROTECTED_MASK;
                    this.isPreviewProtected = (longValue & IS_PREVIEW_PROTECTED_MASK) == IS_PREVIEW_PROTECTED_MASK;
                    this.isAgeProtected = (longValue & IS_AGE_PROTECTED_MASK) == IS_AGE_PROTECTED_MASK;
                    this.playableId = String.valueOf(longValue & PLAYABLE_ID_MASK);
                }
            }
        }
    }

    public String toString() {
        String logTag = Companion.getLogTag();
        String str = this.playableId;
        boolean z = this.isAvailableForDownload;
        Integer num = this.bookmarkPositionSeconds;
        boolean z2 = this.isPinProtected;
        boolean z3 = this.isPreviewProtected;
        boolean z4 = this.isAgeProtected;
        return logTag + " [ playableId = " + str + ", isAvailableForDownload = " + z + ", bookmarkPositionSeconds = " + num + ", isPinProtected = " + z2 + ", isPreviewProtected = " + z3 + ", isAgeProtected = " + z4 + "]";
    }
}
