package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.UiDefinition;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_UiDefinition_Layout_Config_SubtitleRect  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_UiDefinition_Layout_Config_SubtitleRect extends UiDefinition.Layout.Config.SubtitleRect {
    private final int height;
    private final int y;

    public int hashCode() {
        return ((this.y ^ 1000003) * 1000003) ^ this.height;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config.SubtitleRect
    public int height() {
        return this.height;
    }

    @Override // com.netflix.model.leafs.originals.interactive.UiDefinition.Layout.Config.SubtitleRect
    public int y() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_UiDefinition_Layout_Config_SubtitleRect(int i, int i2) {
        this.y = i;
        this.height = i2;
    }

    public String toString() {
        return "SubtitleRect{y=" + this.y + ", height=" + this.height + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UiDefinition.Layout.Config.SubtitleRect) {
            UiDefinition.Layout.Config.SubtitleRect subtitleRect = (UiDefinition.Layout.Config.SubtitleRect) obj;
            return this.y == subtitleRect.y() && this.height == subtitleRect.height();
        }
        return false;
    }
}
