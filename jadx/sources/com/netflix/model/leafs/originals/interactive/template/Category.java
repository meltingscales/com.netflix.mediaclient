package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_Category;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_Category_CategoryChildren;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Category extends Element {
    public abstract CategoryChildren children();

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        ArrayList arrayList = new ArrayList(4);
        CategoryChildren children = children();
        if (children == null) {
            return null;
        }
        Collections.addAll(arrayList, children, children.text(), children.subText());
        return arrayList;
    }

    public static TypeAdapter<Category> typeAdapter(Gson gson) {
        return new C$AutoValue_Category.GsonTypeAdapter(gson);
    }

    public Category merge(Category category) {
        if (category == null) {
            return this;
        }
        return new AutoValue_Category(id() == null ? category.id() : id(), type() == null ? category.type() : type(), styleId() == null ? category.styleId() : styleId(), mergeVisualStateTransition(category.visualStateTransitions()), mergeVisualStates(category.visualStates()), children() == null ? category.children() : children().merge(category.children()));
    }

    /* loaded from: classes.dex */
    public static abstract class CategoryChildren extends Element {
        public abstract SimpleElement subText();

        public abstract SimpleElement text();

        public static TypeAdapter<CategoryChildren> typeAdapter(Gson gson) {
            return new C$AutoValue_Category_CategoryChildren.GsonTypeAdapter(gson);
        }

        public CategoryChildren merge(CategoryChildren categoryChildren) {
            if (categoryChildren == null) {
                return this;
            }
            return new AutoValue_Category_CategoryChildren(id() == null ? categoryChildren.id() : id(), type() == null ? categoryChildren.type() : type(), styleId() == null ? categoryChildren.styleId() : styleId(), mergeVisualStateTransition(categoryChildren.visualStateTransitions()), mergeVisualStates(categoryChildren.visualStates()), text() == null ? categoryChildren.text() : text().merge(categoryChildren.text()), subText() == null ? categoryChildren.subText() : subText().merge(categoryChildren.subText()));
        }
    }
}
