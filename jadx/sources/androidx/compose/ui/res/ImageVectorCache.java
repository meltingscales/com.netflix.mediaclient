package androidx.compose.ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ImageVectorCache {
    private final HashMap<Key, WeakReference<ImageVectorEntry>> map = new HashMap<>();

    /* loaded from: classes.dex */
    public static final class Key {
        private final int id;
        private final Resources.Theme theme;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                return C8632dsu.c(this.theme, key.theme) && this.id == key.id;
            }
            return false;
        }

        public int hashCode() {
            return (this.theme.hashCode() * 31) + Integer.hashCode(this.id);
        }

        public String toString() {
            return "Key(theme=" + this.theme + ", id=" + this.id + ')';
        }

        public Key(Resources.Theme theme, int i) {
            this.theme = theme;
            this.id = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class ImageVectorEntry {
        private final int configFlags;
        private final ImageVector imageVector;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ImageVectorEntry) {
                ImageVectorEntry imageVectorEntry = (ImageVectorEntry) obj;
                return C8632dsu.c(this.imageVector, imageVectorEntry.imageVector) && this.configFlags == imageVectorEntry.configFlags;
            }
            return false;
        }

        public final int getConfigFlags() {
            return this.configFlags;
        }

        public final ImageVector getImageVector() {
            return this.imageVector;
        }

        public int hashCode() {
            return (this.imageVector.hashCode() * 31) + Integer.hashCode(this.configFlags);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.imageVector + ", configFlags=" + this.configFlags + ')';
        }

        public ImageVectorEntry(ImageVector imageVector, int i) {
            this.imageVector = imageVector;
            this.configFlags = i;
        }
    }

    public final ImageVectorEntry get(Key key) {
        WeakReference<ImageVectorEntry> weakReference = this.map.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void prune(int i) {
        Iterator<Map.Entry<Key, WeakReference<ImageVectorEntry>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            ImageVectorEntry imageVectorEntry = it.next().getValue().get();
            if (imageVectorEntry == null || Configuration.needNewResources(i, imageVectorEntry.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(Key key, ImageVectorEntry imageVectorEntry) {
        this.map.put(key, new WeakReference<>(imageVectorEntry));
    }

    public final void clear() {
        this.map.clear();
    }
}
