package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1044Mm;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class BookmarkImpl extends AbstractC0941Im implements InterfaceC0952Ix, Bookmark {
    private static final String TAG = "Bookmark";
    private long bookmarkPositionMs = -1;
    private Integer interactiveProgress;
    private long lastModified;

    @Override // com.netflix.model.leafs.Bookmark
    public long getBookmarkPositionMs() {
        return this.bookmarkPositionMs;
    }

    @Override // com.netflix.model.leafs.Bookmark
    public Integer getInteractiveProgress() {
        return this.interactiveProgress;
    }

    @Override // com.netflix.model.leafs.Bookmark
    public long getLastModified() {
        return this.lastModified;
    }

    @Override // com.netflix.model.leafs.Bookmark
    public void setBookmarkPositionMs(long j) {
        if (j < 0) {
            j = -1;
        }
        this.bookmarkPositionMs = j;
    }

    @Override // com.netflix.model.leafs.Bookmark
    public void setLastModified(long j) {
        this.lastModified = j;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        long j = this.bookmarkPositionMs;
        long j2 = this.lastModified;
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            int hashCode = key.hashCode();
            if (hashCode == -1829827457) {
                if (key.equals("bookmarkPosition")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != -1579814097) {
                if (hashCode == 1959003007 && key.equals("lastModified")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (key.equals("interactiveProgress")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                this.bookmarkPositionMs = value.getAsFloat() != -1.0f ? value.getAsFloat() * 1000.0f : -1.0f;
            } else if (c == 1) {
                this.interactiveProgress = Integer.valueOf(value.getAsInt());
            } else if (c == 2) {
                this.lastModified = value.getAsLong();
            }
        }
        long j3 = this.lastModified;
        if (j2 > j3) {
            C1044Mm.a(TAG, "restoring bookmark and time (%d - %d) to older values (%d - %d)", Long.valueOf(this.bookmarkPositionMs), Long.valueOf(j3), Long.valueOf(j), Long.valueOf(j2));
            this.bookmarkPositionMs = j;
            this.lastModified = j2;
        }
    }

    public String toString() {
        return "Bookmark [bookmarkPosition=" + this.bookmarkPositionMs + ", lastModified=" + this.lastModified + "]";
    }
}
