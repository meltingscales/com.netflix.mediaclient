package androidx.work.impl.model;

import java.util.List;

/* loaded from: classes2.dex */
public interface WorkNameDao {
    List<String> getNamesForWorkSpecId(String str);

    void insert(WorkName workName);
}
