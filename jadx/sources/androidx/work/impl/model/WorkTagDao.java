package androidx.work.impl.model;

import java.util.List;

/* loaded from: classes2.dex */
public interface WorkTagDao {
    List<String> getTagsForWorkSpecId(String str);

    void insert(WorkTag workTag);
}
