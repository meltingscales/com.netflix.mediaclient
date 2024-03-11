package androidx.work.impl.constraints;

import java.util.List;

/* loaded from: classes2.dex */
public interface WorkConstraintsCallback {
    void onAllConstraintsMet(List<String> list);

    void onAllConstraintsNotMet(List<String> list);
}
