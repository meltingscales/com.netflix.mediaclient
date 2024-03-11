package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_StoryLines  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls_StoryLines extends PlayerControls.StoryLines {
    private final List<PlayerControls.StoryLines.StoryLine> list;

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.StoryLines
    public List<PlayerControls.StoryLines.StoryLine> list() {
        return this.list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_StoryLines(List<PlayerControls.StoryLines.StoryLine> list) {
        if (list == null) {
            throw new NullPointerException("Null list");
        }
        this.list = list;
    }

    public String toString() {
        return "StoryLines{list=" + this.list + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.StoryLines) {
            return this.list.equals(((PlayerControls.StoryLines) obj).list());
        }
        return false;
    }

    public int hashCode() {
        return this.list.hashCode() ^ 1000003;
    }
}
