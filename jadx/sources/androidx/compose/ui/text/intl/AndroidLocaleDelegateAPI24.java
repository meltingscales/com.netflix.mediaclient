package androidx.compose.ui.text.intl;

import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {
    private LocaleList lastLocaleList;
    private android.os.LocaleList lastPlatformLocaleList;
    private final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public LocaleList getCurrent() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (this.lock) {
            LocaleList localeList2 = this.lastLocaleList;
            if (localeList2 == null || localeList != this.lastPlatformLocaleList) {
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new Locale(new AndroidLocale(localeList.get(i))));
                }
                LocaleList localeList3 = new LocaleList(arrayList);
                this.lastPlatformLocaleList = localeList;
                this.lastLocaleList = localeList3;
                return localeList3;
            }
            return localeList2;
        }
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public PlatformLocale parseLanguageTag(String str) {
        return new AndroidLocale(java.util.Locale.forLanguageTag(str));
    }
}
