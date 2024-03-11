package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_StoryLines_StoryLine  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls_StoryLines_StoryLine extends PlayerControls.StoryLines.StoryLine {
    private final List<String> choicePoints;
    private final String id;

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.StoryLines.StoryLine
    public List<String> choicePoints() {
        return this.choicePoints;
    }

    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.StoryLines.StoryLine
    public String id() {
        return this.id;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_StoryLines_StoryLine(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        this.choicePoints = list;
    }

    public String toString() {
        return "StoryLine{id=" + this.id + ", choicePoints=" + this.choicePoints + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.StoryLines.StoryLine) {
            PlayerControls.StoryLines.StoryLine storyLine = (PlayerControls.StoryLines.StoryLine) obj;
            if (this.id.equals(storyLine.id())) {
                List<String> list = this.choicePoints;
                if (list == null) {
                    if (storyLine.choicePoints() == null) {
                        return true;
                    }
                } else if (list.equals(storyLine.choicePoints())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode();
        List<String> list = this.choicePoints;
        return ((hashCode ^ 1000003) * 1000003) ^ (list == null ? 0 : list.hashCode());
    }
}
