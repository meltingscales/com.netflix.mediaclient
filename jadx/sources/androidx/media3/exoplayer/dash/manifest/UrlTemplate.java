package androidx.media3.exoplayer.dash.manifest;

import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class UrlTemplate {
    private final List<String> identifierFormatTags;
    private final List<Integer> identifiers;
    private final List<String> urlPieces;

    public static UrlTemplate compile(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        parseTemplate(str, arrayList, arrayList2, arrayList3);
        return new UrlTemplate(arrayList, arrayList2, arrayList3);
    }

    private UrlTemplate(List<String> list, List<Integer> list2, List<String> list3) {
        this.urlPieces = list;
        this.identifiers = list2;
        this.identifierFormatTags = list3;
    }

    public String buildUri(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.identifiers.size(); i2++) {
            sb.append(this.urlPieces.get(i2));
            if (this.identifiers.get(i2).intValue() == 1) {
                sb.append(str);
            } else if (this.identifiers.get(i2).intValue() == 2) {
                sb.append(String.format(Locale.US, this.identifierFormatTags.get(i2), Long.valueOf(j)));
            } else if (this.identifiers.get(i2).intValue() == 3) {
                sb.append(String.format(Locale.US, this.identifierFormatTags.get(i2), Integer.valueOf(i)));
            } else if (this.identifiers.get(i2).intValue() == 4) {
                sb.append(String.format(Locale.US, this.identifierFormatTags.get(i2), Long.valueOf(j2)));
            }
        }
        sb.append(this.urlPieces.get(this.identifiers.size()));
        return sb.toString();
    }

    private static void parseTemplate(String str, List<String> list, List<Integer> list2, List<String> list3) {
        String str2;
        list.add("");
        int i = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            char c = 65535;
            if (indexOf == -1) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(i));
                i = str.length();
            } else if (indexOf != i) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(i, indexOf));
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                list.set(list2.size(), list.get(list2.size()) + "$");
                i += 2;
            } else {
                list3.add("");
                int i2 = i + 1;
                int indexOf2 = str.indexOf("$", i2);
                String substring = str.substring(i2, indexOf2);
                if (substring.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith(InteractiveAnimation.ANIMATION_TYPE.X) && !str2.endsWith("X")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    int hashCode = substring.hashCode();
                    if (hashCode != -1950496919) {
                        if (hashCode != 2606829) {
                            if (hashCode == 38199441 && substring.equals("Bandwidth")) {
                                c = 2;
                            }
                        } else if (substring.equals("Time")) {
                            c = 1;
                        }
                    } else if (substring.equals("Number")) {
                        c = 0;
                    }
                    if (c == 0) {
                        list2.add(2);
                    } else if (c == 1) {
                        list2.add(4);
                    } else if (c == 2) {
                        list2.add(3);
                    } else {
                        throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    list3.set(list2.size() - 1, str2);
                }
                list.add("");
                i = indexOf2 + 1;
            }
        }
    }
}
