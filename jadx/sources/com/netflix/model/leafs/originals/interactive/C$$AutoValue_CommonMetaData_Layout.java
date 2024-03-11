package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_CommonMetaData_Layout  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_CommonMetaData_Layout extends CommonMetaData.Layout {
    private final AssetManifest assetManifest;
    private final Size canvasSize;
    private final List<CommonMetaData.Layout.ChoiceLayout> choices;
    private final Button endButton;
    private final StringsObject interactiveStrings;
    private final Double subTitleY;
    private final CommonMetaData.Layout.Timer timer;

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout, com.netflix.model.leafs.originals.interactive.BaseLayout
    public AssetManifest assetManifest() {
        return this.assetManifest;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout
    public Size canvasSize() {
        return this.canvasSize;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout
    public List<CommonMetaData.Layout.ChoiceLayout> choices() {
        return this.choices;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout
    public Button endButton() {
        return this.endButton;
    }

    @Override // com.netflix.model.leafs.originals.interactive.BaseLayout
    @SerializedName("strings")
    public StringsObject interactiveStrings() {
        return this.interactiveStrings;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout
    public Double subTitleY() {
        return this.subTitleY;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData.Layout
    public CommonMetaData.Layout.Timer timer() {
        return this.timer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_CommonMetaData_Layout(StringsObject stringsObject, Size size, Double d, List<CommonMetaData.Layout.ChoiceLayout> list, CommonMetaData.Layout.Timer timer, Button button, AssetManifest assetManifest) {
        this.interactiveStrings = stringsObject;
        if (size == null) {
            throw new NullPointerException("Null canvasSize");
        }
        this.canvasSize = size;
        if (d == null) {
            throw new NullPointerException("Null subTitleY");
        }
        this.subTitleY = d;
        if (list == null) {
            throw new NullPointerException("Null choices");
        }
        this.choices = list;
        this.timer = timer;
        this.endButton = button;
        this.assetManifest = assetManifest;
    }

    public String toString() {
        return "Layout{interactiveStrings=" + this.interactiveStrings + ", canvasSize=" + this.canvasSize + ", subTitleY=" + this.subTitleY + ", choices=" + this.choices + ", timer=" + this.timer + ", endButton=" + this.endButton + ", assetManifest=" + this.assetManifest + "}";
    }

    public boolean equals(Object obj) {
        CommonMetaData.Layout.Timer timer;
        Button button;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommonMetaData.Layout) {
            CommonMetaData.Layout layout = (CommonMetaData.Layout) obj;
            StringsObject stringsObject = this.interactiveStrings;
            if (stringsObject != null ? stringsObject.equals(layout.interactiveStrings()) : layout.interactiveStrings() == null) {
                if (this.canvasSize.equals(layout.canvasSize()) && this.subTitleY.equals(layout.subTitleY()) && this.choices.equals(layout.choices()) && ((timer = this.timer) != null ? timer.equals(layout.timer()) : layout.timer() == null) && ((button = this.endButton) != null ? button.equals(layout.endButton()) : layout.endButton() == null)) {
                    AssetManifest assetManifest = this.assetManifest;
                    if (assetManifest == null) {
                        if (layout.assetManifest() == null) {
                            return true;
                        }
                    } else if (assetManifest.equals(layout.assetManifest())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        StringsObject stringsObject = this.interactiveStrings;
        int hashCode = stringsObject == null ? 0 : stringsObject.hashCode();
        int hashCode2 = this.canvasSize.hashCode();
        int hashCode3 = this.subTitleY.hashCode();
        int hashCode4 = this.choices.hashCode();
        CommonMetaData.Layout.Timer timer = this.timer;
        int hashCode5 = timer == null ? 0 : timer.hashCode();
        Button button = this.endButton;
        int hashCode6 = button == null ? 0 : button.hashCode();
        AssetManifest assetManifest = this.assetManifest;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ (assetManifest != null ? assetManifest.hashCode() : 0);
    }
}
