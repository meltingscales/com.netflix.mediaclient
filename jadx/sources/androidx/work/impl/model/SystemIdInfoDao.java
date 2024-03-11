package androidx.work.impl.model;

import java.util.List;

/* loaded from: classes2.dex */
public interface SystemIdInfoDao {
    SystemIdInfo getSystemIdInfo(String str);

    List<String> getWorkSpecIds();

    void insertSystemIdInfo(SystemIdInfo systemIdInfo);

    void removeSystemIdInfo(String str);
}
