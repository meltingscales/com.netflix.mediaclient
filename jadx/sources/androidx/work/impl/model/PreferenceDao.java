package androidx.work.impl.model;

/* loaded from: classes2.dex */
public interface PreferenceDao {
    Long getLongValue(String str);

    void insertPreference(Preference preference);
}
