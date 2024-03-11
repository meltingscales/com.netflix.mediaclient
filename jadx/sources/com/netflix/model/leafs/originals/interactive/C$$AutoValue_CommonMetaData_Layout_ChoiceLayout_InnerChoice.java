package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.CommonMetaData;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice extends CommonMetaData.Layout.ChoiceLayout.InnerChoice {
    private final SourceRect rect;

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout.ChoiceLayout.InnerChoice
    public SourceRect rect() {
        return this.rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice(SourceRect sourceRect) {
        this.rect = sourceRect;
    }

    public String toString() {
        return "InnerChoice{rect=" + this.rect + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommonMetaData.Layout.ChoiceLayout.InnerChoice) {
            SourceRect sourceRect = this.rect;
            SourceRect rect = ((CommonMetaData.Layout.ChoiceLayout.InnerChoice) obj).rect();
            return sourceRect == null ? rect == null : sourceRect.equals(rect);
        }
        return false;
    }

    public int hashCode() {
        SourceRect sourceRect = this.rect;
        return (sourceRect == null ? 0 : sourceRect.hashCode()) ^ 1000003;
    }
}
