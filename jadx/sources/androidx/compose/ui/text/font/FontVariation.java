package androidx.compose.ui.text.font;

import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C8571dqn;
import o.C8576dqs;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class FontVariation {
    public static final FontVariation INSTANCE = new FontVariation();

    /* loaded from: classes.dex */
    public interface Setting {
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(Density density);
    }

    private FontVariation() {
    }

    /* loaded from: classes.dex */
    public static final class Settings {
        private final boolean needsDensity;
        private final List<Setting> settings;

        public final List<Setting> getSettings() {
            return this.settings;
        }

        public Settings(Setting... settingArr) {
            String d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                Object obj = linkedHashMap.get(axisName);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(axisName, obj);
                }
                ((List) obj).add(setting);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('\'');
                    sb.append(str);
                    sb.append("' must be unique. Actual [ [");
                    d = C8576dqs.d(list, null, null, null, 0, null, null, 63, null);
                    sb.append(d);
                    sb.append(']');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                C8571dqn.b(arrayList, list);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.settings = arrayList2;
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((Setting) arrayList2.get(i)).getNeedsDensity()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            this.needsDensity = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Settings) && C8632dsu.c(this.settings, ((Settings) obj).settings);
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }
}
