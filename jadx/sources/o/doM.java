package o;

import j$.time.chrono.IsoChronology;
import j$.time.format.TextStyle;
import j$.time.temporal.ChronoField;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public class doM {
    private static final ConcurrentMap e = new ConcurrentHashMap(16, 0.75f, 2);
    private static final Comparator d = new Comparator() { // from class: o.doM.2
        @Override // java.util.Comparator
        /* renamed from: e */
        public int compare(Map.Entry entry, Map.Entry entry2) {
            return ((String) entry2.getKey()).length() - ((String) entry.getKey()).length();
        }
    };
    private static final doM b = new doM();

    /* loaded from: classes5.dex */
    public static final class e {
        private final Map b;
        private final Map d;

        public e(Map map) {
            this.b = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    hashMap2.put((String) entry2.getValue(), doM.d((String) entry2.getValue(), (Long) entry2.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, doM.d);
                hashMap.put((TextStyle) entry.getKey(), arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            Collections.sort(arrayList, doM.d);
            this.d = hashMap;
        }

        public Iterator b(TextStyle textStyle) {
            List list = (List) this.d.get(textStyle);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }

        public String c(long j, TextStyle textStyle) {
            Map map = (Map) this.b.get(textStyle);
            if (map != null) {
                return (String) map.get(Long.valueOf(j));
            }
            return null;
        }
    }

    private Object a(InterfaceC8535dpe interfaceC8535dpe, Locale locale) {
        HashMap hashMap = new HashMap();
        int i = 0;
        if (interfaceC8535dpe == ChronoField.m) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            while (i < eras.length) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    hashMap2.put(Long.valueOf(j), eras[i]);
                    hashMap3.put(Long.valueOf(j), c(eras[i]));
                }
                i++;
            }
            if (!hashMap2.isEmpty()) {
                hashMap.put(TextStyle.FULL, hashMap2);
                hashMap.put(TextStyle.SHORT, hashMap2);
                hashMap.put(TextStyle.NARROW, hashMap3);
            }
            return new e(hashMap);
        } else if (interfaceC8535dpe == ChronoField.y) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            doP.d(hashMap, dateFormatSymbols2, locale);
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            String[] months = dateFormatSymbols2.getMonths();
            for (int i2 = 0; i2 < months.length; i2++) {
                if (!months[i2].isEmpty()) {
                    long j2 = i2 + 1;
                    hashMap4.put(Long.valueOf(j2), months[i2]);
                    hashMap5.put(Long.valueOf(j2), c(months[i2]));
                }
            }
            if (!hashMap4.isEmpty()) {
                hashMap.put(TextStyle.FULL, hashMap4);
                hashMap.put(TextStyle.NARROW, hashMap5);
            }
            HashMap hashMap6 = new HashMap();
            String[] shortMonths = dateFormatSymbols2.getShortMonths();
            while (i < shortMonths.length) {
                if (!shortMonths[i].isEmpty()) {
                    hashMap6.put(Long.valueOf(i + 1), shortMonths[i]);
                }
                i++;
            }
            if (!hashMap6.isEmpty()) {
                hashMap.put(TextStyle.SHORT, hashMap6);
            }
            return new e(hashMap);
        } else if (interfaceC8535dpe != ChronoField.j) {
            if (interfaceC8535dpe == ChronoField.b) {
                DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap7 = new HashMap();
                HashMap hashMap8 = new HashMap();
                String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
                while (i < amPmStrings.length) {
                    if (!amPmStrings[i].isEmpty()) {
                        long j3 = i;
                        hashMap7.put(Long.valueOf(j3), amPmStrings[i]);
                        hashMap8.put(Long.valueOf(j3), c(amPmStrings[i]));
                    }
                    i++;
                }
                if (!hashMap7.isEmpty()) {
                    hashMap.put(TextStyle.FULL, hashMap7);
                    hashMap.put(TextStyle.SHORT, hashMap7);
                    hashMap.put(TextStyle.NARROW, hashMap8);
                }
                return new e(hashMap);
            }
            return "";
        } else {
            DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap9 = new HashMap();
            String[] weekdays = dateFormatSymbols4.getWeekdays();
            hashMap9.put(1L, weekdays[2]);
            hashMap9.put(2L, weekdays[3]);
            hashMap9.put(3L, weekdays[4]);
            hashMap9.put(4L, weekdays[5]);
            hashMap9.put(5L, weekdays[6]);
            hashMap9.put(6L, weekdays[7]);
            hashMap9.put(7L, weekdays[1]);
            hashMap.put(TextStyle.FULL, hashMap9);
            HashMap hashMap10 = new HashMap();
            hashMap10.put(1L, c(weekdays[2]));
            hashMap10.put(2L, c(weekdays[3]));
            hashMap10.put(3L, c(weekdays[4]));
            hashMap10.put(4L, c(weekdays[5]));
            hashMap10.put(5L, c(weekdays[6]));
            hashMap10.put(6L, c(weekdays[7]));
            hashMap10.put(7L, c(weekdays[1]));
            hashMap.put(TextStyle.NARROW, hashMap10);
            HashMap hashMap11 = new HashMap();
            String[] shortWeekdays = dateFormatSymbols4.getShortWeekdays();
            hashMap11.put(1L, shortWeekdays[2]);
            hashMap11.put(2L, shortWeekdays[3]);
            hashMap11.put(3L, shortWeekdays[4]);
            hashMap11.put(4L, shortWeekdays[5]);
            hashMap11.put(5L, shortWeekdays[6]);
            hashMap11.put(6L, shortWeekdays[7]);
            hashMap11.put(7L, shortWeekdays[1]);
            hashMap.put(TextStyle.SHORT, hashMap11);
            return new e(hashMap);
        }
    }

    private static String c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    public static doM c() {
        return b;
    }

    private Object d(InterfaceC8535dpe interfaceC8535dpe, Locale locale) {
        Map.Entry d2 = d((Object) interfaceC8535dpe, (Object) locale);
        ConcurrentMap concurrentMap = e;
        Object obj = concurrentMap.get(d2);
        if (obj == null) {
            concurrentMap.putIfAbsent(d2, a(interfaceC8535dpe, locale));
            return concurrentMap.get(d2);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map.Entry d(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public Iterator a(InterfaceC8535dpe interfaceC8535dpe, TextStyle textStyle, Locale locale) {
        Object d2 = d(interfaceC8535dpe, locale);
        if (d2 instanceof e) {
            return ((e) d2).b(textStyle);
        }
        return null;
    }

    public String b(InterfaceC8535dpe interfaceC8535dpe, long j, TextStyle textStyle, Locale locale) {
        Object d2 = d(interfaceC8535dpe, locale);
        if (d2 instanceof e) {
            return ((e) d2).c(j, textStyle);
        }
        return null;
    }

    public String c(InterfaceC8528doy interfaceC8528doy, InterfaceC8535dpe interfaceC8535dpe, long j, TextStyle textStyle, Locale locale) {
        if (interfaceC8528doy == IsoChronology.d || !(interfaceC8535dpe instanceof ChronoField)) {
            return b(interfaceC8535dpe, j, textStyle, locale);
        }
        return null;
    }

    public Iterator d(InterfaceC8528doy interfaceC8528doy, InterfaceC8535dpe interfaceC8535dpe, TextStyle textStyle, Locale locale) {
        if (interfaceC8528doy == IsoChronology.d || !(interfaceC8535dpe instanceof ChronoField)) {
            return a(interfaceC8535dpe, textStyle, locale);
        }
        return null;
    }
}
