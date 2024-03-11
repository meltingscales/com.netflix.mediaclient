package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_ToolTipElement;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_ToolTipElement_ToolTipChildren;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ToolTipElement extends Element {
    public abstract ToolTipChildren children();

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        ArrayList arrayList = new ArrayList(4);
        ToolTipChildren children = children();
        if (children == null) {
            return null;
        }
        Collections.addAll(arrayList, children, children.titleLabel(), children.subtitleLabel(), children.previewImage(), children.tooltip());
        return arrayList;
    }

    public ToolTipElement merge(ToolTipElement toolTipElement) {
        if (toolTipElement == null) {
            return this;
        }
        return new AutoValue_ToolTipElement(id() == null ? toolTipElement.id() : id(), type() == null ? toolTipElement.type() : type(), styleId() == null ? toolTipElement.styleId() : styleId(), mergeVisualStateTransition(toolTipElement.visualStateTransitions()), mergeVisualStates(toolTipElement.visualStates()), children() == null ? toolTipElement.children() : children().merge(toolTipElement.children()));
    }

    public static TypeAdapter<ToolTipElement> typeAdapter(Gson gson) {
        return new C$AutoValue_ToolTipElement.GsonTypeAdapter(gson);
    }

    /* loaded from: classes.dex */
    public static abstract class ToolTipChildren extends Element {
        public abstract ImageElement previewImage();

        public abstract SimpleElement subtitleLabel();

        public abstract SimpleElement titleLabel();

        public abstract ImageElement tooltip();

        public static TypeAdapter<ToolTipChildren> typeAdapter(Gson gson) {
            return new C$AutoValue_ToolTipElement_ToolTipChildren.GsonTypeAdapter(gson);
        }

        public ToolTipChildren merge(ToolTipChildren toolTipChildren) {
            if (toolTipChildren == null) {
                return this;
            }
            return new AutoValue_ToolTipElement_ToolTipChildren(id() == null ? toolTipChildren.id() : id(), type() == null ? toolTipChildren.type() : type(), styleId() == null ? toolTipChildren.styleId() : styleId(), mergeVisualStateTransition(toolTipChildren.visualStateTransitions()), mergeVisualStates(toolTipChildren.visualStates()), titleLabel() == null ? toolTipChildren.titleLabel() : titleLabel().merge(toolTipChildren.titleLabel()), subtitleLabel() == null ? toolTipChildren.subtitleLabel() : subtitleLabel().merge(toolTipChildren.subtitleLabel()), previewImage() == null ? toolTipChildren.previewImage() : previewImage().merge(toolTipChildren.previewImage()), tooltip() == null ? toolTipChildren.tooltip() : tooltip().merge(toolTipChildren.tooltip()));
        }
    }
}
