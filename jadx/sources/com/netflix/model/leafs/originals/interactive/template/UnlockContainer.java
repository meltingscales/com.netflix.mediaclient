package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_UnlockContainer;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_UnlockContainer_UnlockContainerChildren;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class UnlockContainer extends Element {
    public abstract UnlockContainerChildren children();

    public static TypeAdapter<UnlockContainer> typeAdapter(Gson gson) {
        return new C$AutoValue_UnlockContainer.GsonTypeAdapter(gson);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        ArrayList arrayList = new ArrayList(8);
        Collections.addAll(arrayList, children());
        return arrayList;
    }

    public UnlockContainer merge(UnlockContainer unlockContainer) {
        if (unlockContainer == null) {
            return this;
        }
        return new AutoValue_UnlockContainer(id() == null ? unlockContainer.id() : id(), type() == null ? unlockContainer.type() : type(), styleId() == null ? unlockContainer.styleId() : styleId(), mergeVisualStateTransition(unlockContainer.visualStateTransitions()), mergeVisualStates(unlockContainer.visualStates()), children() != null ? children().merge(unlockContainer.children()) : unlockContainer.children());
    }

    /* loaded from: classes.dex */
    public static abstract class UnlockContainerChildren extends Element {
        public abstract ImageElement backgroundImage();

        public abstract SimpleElement label();

        @Override // com.netflix.model.leafs.originals.interactive.template.Element
        public List<Element> elementChildList() {
            ArrayList arrayList = new ArrayList(8);
            Collections.addAll(arrayList, backgroundImage(), label());
            return arrayList;
        }

        public static TypeAdapter<UnlockContainerChildren> typeAdapter(Gson gson) {
            return new C$AutoValue_UnlockContainer_UnlockContainerChildren.GsonTypeAdapter(gson);
        }

        public UnlockContainerChildren merge(UnlockContainerChildren unlockContainerChildren) {
            if (unlockContainerChildren == null) {
                return this;
            }
            return new AutoValue_UnlockContainer_UnlockContainerChildren(id() == null ? unlockContainerChildren.id() : id(), type() == null ? unlockContainerChildren.type() : type(), styleId() == null ? unlockContainerChildren.styleId() : styleId(), mergeVisualStateTransition(unlockContainerChildren.visualStateTransitions()), mergeVisualStates(unlockContainerChildren.visualStates()), backgroundImage() == null ? unlockContainerChildren.backgroundImage() : backgroundImage().merge(unlockContainerChildren.backgroundImage()), label() == null ? unlockContainerChildren.label() : label().merge(unlockContainerChildren.label()));
        }
    }
}
