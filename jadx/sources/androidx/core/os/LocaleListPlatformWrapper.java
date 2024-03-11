package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes2.dex */
final class LocaleListPlatformWrapper implements LocaleListInterface {
    private final LocaleList mLocaleList;

    @Override // androidx.core.os.LocaleListInterface
    public Object getLocaleList() {
        return this.mLocaleList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocaleListPlatformWrapper(Object obj) {
        this.mLocaleList = (LocaleList) obj;
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int i) {
        return this.mLocaleList.get(i);
    }

    public boolean equals(Object obj) {
        return this.mLocaleList.equals(((LocaleListInterface) obj).getLocaleList());
    }

    public int hashCode() {
        return this.mLocaleList.hashCode();
    }

    public String toString() {
        return this.mLocaleList.toString();
    }
}
