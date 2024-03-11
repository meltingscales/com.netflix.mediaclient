package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_TriviaThemeContainer;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TriviaThemeContainer extends Element {
    public abstract TriviaThemeContainerChildren children();

    public static TypeAdapter<TriviaThemeContainer> typeAdapter(Gson gson) {
        return new C$AutoValue_TriviaThemeContainer.GsonTypeAdapter(gson);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        ArrayList arrayList = new ArrayList(8);
        TriviaThemeContainerChildren children = children();
        if (children == null) {
            return null;
        }
        Collections.addAll(arrayList, children);
        return arrayList;
    }

    public TriviaThemeContainer merge(TriviaThemeContainer triviaThemeContainer) {
        if (triviaThemeContainer == null) {
            return this;
        }
        return new AutoValue_TriviaThemeContainer(id() == null ? triviaThemeContainer.id() : id(), type() == null ? triviaThemeContainer.type() : type(), styleId() == null ? triviaThemeContainer.styleId() : styleId(), mergeVisualStateTransition(triviaThemeContainer.visualStateTransitions()), mergeVisualStates(triviaThemeContainer.visualStates()), children() == null ? triviaThemeContainer.children() : children().merge(triviaThemeContainer.children()));
    }

    /* loaded from: classes.dex */
    public static abstract class TriviaThemeContainerChildren extends Element {
        public abstract ImageElement backgroundImage();

        public abstract SimpleElement label();

        @Override // com.netflix.model.leafs.originals.interactive.template.Element
        public List<Element> elementChildList() {
            ArrayList arrayList = new ArrayList(8);
            Collections.addAll(arrayList, backgroundImage(), label());
            return arrayList;
        }

        public static TypeAdapter<TriviaThemeContainerChildren> typeAdapter(Gson gson) {
            return new C$AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren.GsonTypeAdapter(gson);
        }

        public TriviaThemeContainerChildren merge(TriviaThemeContainerChildren triviaThemeContainerChildren) {
            if (triviaThemeContainerChildren == null) {
                return this;
            }
            return new AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren(id() == null ? triviaThemeContainerChildren.id() : id(), type() == null ? triviaThemeContainerChildren.type() : type(), styleId() == null ? triviaThemeContainerChildren.styleId() : styleId(), mergeVisualStateTransition(triviaThemeContainerChildren.visualStateTransitions()), mergeVisualStates(triviaThemeContainerChildren.visualStates()), backgroundImage() == null ? triviaThemeContainerChildren.backgroundImage() : backgroundImage().merge(triviaThemeContainerChildren.backgroundImage()), label() == null ? triviaThemeContainerChildren.label() : label().merge(triviaThemeContainerChildren.label()));
        }
    }
}
