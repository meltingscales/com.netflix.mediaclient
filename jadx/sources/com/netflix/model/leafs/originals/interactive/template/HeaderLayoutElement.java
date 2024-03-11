package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_HeaderLayoutElement;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_HeaderLayoutElement_HeaderChildren;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HeaderLayoutElement extends Element {
    public abstract HeaderChildren children();

    public HeaderLayoutElement merge(HeaderLayoutElement headerLayoutElement) {
        if (headerLayoutElement == null) {
            return this;
        }
        return new AutoValue_HeaderLayoutElement(id() == null ? headerLayoutElement.id() : id(), type() == null ? headerLayoutElement.type() : type(), styleId() == null ? headerLayoutElement.styleId() : styleId(), mergeVisualStateTransition(headerLayoutElement.visualStateTransitions()), mergeVisualStates(headerLayoutElement.visualStates()), children() == null ? headerLayoutElement.children() : children().merge(headerLayoutElement.children()));
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        ArrayList arrayList = new ArrayList(4);
        HeaderChildren children = children();
        if (children != null) {
            Collections.addAll(arrayList, children);
        }
        return arrayList;
    }

    /* loaded from: classes.dex */
    public static abstract class HeaderChildren extends Element {
        public abstract ImageElement image();

        public HeaderChildren merge(HeaderChildren headerChildren) {
            if (headerChildren == null) {
                return this;
            }
            return new AutoValue_HeaderLayoutElement_HeaderChildren(id() == null ? headerChildren.id() : id(), type() == null ? headerChildren.type() : type(), styleId() == null ? headerChildren.styleId() : styleId(), mergeVisualStateTransition(headerChildren.visualStateTransitions()), mergeVisualStates(headerChildren.visualStates()), image() == null ? headerChildren.image() : image().merge(headerChildren.image()));
        }

        public static TypeAdapter<HeaderChildren> typeAdapter(Gson gson) {
            return new C$AutoValue_HeaderLayoutElement_HeaderChildren.GsonTypeAdapter(gson);
        }
    }

    public static TypeAdapter<HeaderLayoutElement> typeAdapter(Gson gson) {
        return new C$AutoValue_HeaderLayoutElement.GsonTypeAdapter(gson);
    }
}
