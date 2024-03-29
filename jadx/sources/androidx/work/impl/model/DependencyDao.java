package androidx.work.impl.model;

import java.util.List;

/* loaded from: classes2.dex */
public interface DependencyDao {
    List<String> getDependentWorkIds(String str);

    boolean hasCompletedAllPrerequisites(String str);

    boolean hasDependents(String str);

    void insertDependency(Dependency dependency);
}
