package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.model.leafs.UpNextFeedListItem;
import com.netflix.model.leafs.UpNextFeedSection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import o.AbstractC7916daY;

/* renamed from: o.daZ */
/* loaded from: classes5.dex */
public final class C7917daZ {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public C7917daZ(int i, int i2, int i3, int i4, int i5) {
        this.b = i;
        this.d = i2;
        this.c = i3;
        this.e = i4;
        this.a = i5;
    }

    public final C7971dba c(C7978dbh c7978dbh) {
        int i;
        C8632dsu.c((Object) c7978dbh, "");
        if (c7978dbh.j().isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        for (Object obj : c7978dbh.j()) {
            if (i2 < 0) {
                C8569dql.h();
            }
            UpNextFeedSection upNextFeedSection = (UpNextFeedSection) obj;
            if (upNextFeedSection != null) {
                List<UpNextFeedListItem> items = upNextFeedSection.getItems();
                ListIterator<UpNextFeedListItem> listIterator = items.listIterator(items.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous() != null) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i != -1) {
                    linkedHashMap.put(Integer.valueOf(i2), new C8654dtp(0, i));
                }
            }
            i2++;
        }
        if (!linkedHashMap.isEmpty()) {
            return new C7971dba(linkedHashMap, TaskMode.FROM_CACHE_ONLY, false, 4, null);
        }
        return null;
    }

    public static /* synthetic */ C7971dba c(C7917daZ c7917daZ, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c7917daZ.d(z);
    }

    public final C7971dba d(boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = this.e;
        int i2 = 0;
        while (i2 < i) {
            linkedHashMap.put(Integer.valueOf(i2), new C8654dtp(0, (i2 == 0 ? this.d : this.b) - 1));
            i2++;
        }
        return new C7971dba(linkedHashMap, z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK, false, 4, null);
    }

    public final C7971dba a(C7978dbh c7978dbh, boolean z) {
        int i;
        C8632dsu.c((Object) c7978dbh, "");
        if (C8632dsu.c(c7978dbh.d(), AbstractC7916daY.e.b)) {
            return null;
        }
        if (c7978dbh.j().isEmpty()) {
            return c(this, false, 1, null);
        }
        TaskMode taskMode = z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<UpNextFeedSection> it = c7978dbh.j().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next() == null) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            int min = Math.min(this.a + i2, c7978dbh.j().size());
            while (i2 < min) {
                linkedHashMap.put(Integer.valueOf(i2), new C8654dtp(0, this.b));
                i2++;
            }
            return new C7971dba(linkedHashMap, taskMode, false, 4, null);
        }
        int i3 = 0;
        int i4 = 0;
        for (Object obj : c7978dbh.j()) {
            if (i4 < 0) {
                C8569dql.h();
            }
            UpNextFeedSection upNextFeedSection = (UpNextFeedSection) obj;
            if (upNextFeedSection != null) {
                Iterator<UpNextFeedListItem> it2 = upNextFeedSection.getItems().iterator();
                int i5 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (it2.next() == null) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1) {
                    List<UpNextFeedListItem> items = upNextFeedSection.getItems();
                    ListIterator<UpNextFeedListItem> listIterator = items.listIterator(items.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (listIterator.previous() == null) {
                                i = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    int min2 = Math.min(i, ((this.c - i3) + i5) - 1);
                    linkedHashMap.put(Integer.valueOf(i4), new C8654dtp(i5, min2));
                    i3 += (min2 - i5) + 1;
                    if (i3 >= this.c) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i4++;
        }
        if (i3 > 0) {
            return new C7971dba(linkedHashMap, taskMode, false, 4, null);
        }
        return null;
    }
}
