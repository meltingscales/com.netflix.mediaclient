package com.netflix.model.leafs.social.multititle;

import com.netflix.model.leafs.social.multititle.NotificationModuleList;
import java.util.List;

/* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationModuleList  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_NotificationModuleList extends NotificationModuleList {
    private final List<NotificationModule> modules;

    @Override // com.netflix.model.leafs.social.multititle.NotificationModuleList
    public List<NotificationModule> modules() {
        return this.modules;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_NotificationModuleList(List<NotificationModule> list) {
        if (list == null) {
            throw new NullPointerException("Null modules");
        }
        this.modules = list;
    }

    public String toString() {
        return "NotificationModuleList{modules=" + this.modules + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationModuleList) {
            return this.modules.equals(((NotificationModuleList) obj).modules());
        }
        return false;
    }

    public int hashCode() {
        return this.modules.hashCode() ^ 1000003;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationModuleList$Builder */
    /* loaded from: classes.dex */
    public static final class Builder extends NotificationModuleList.Builder {
        private List<NotificationModule> modules;

        @Override // com.netflix.model.leafs.social.multititle.NotificationModuleList.Builder
        public NotificationModuleList.Builder modules(List<NotificationModule> list) {
            if (list != null) {
                this.modules = list;
                return this;
            }
            throw new NullPointerException("Null modules");
        }

        @Override // com.netflix.model.leafs.social.multititle.NotificationModuleList.Builder
        public NotificationModuleList build() {
            String str = "";
            if (this.modules == null) {
                str = " modules";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_NotificationModuleList(this.modules);
        }
    }
}
