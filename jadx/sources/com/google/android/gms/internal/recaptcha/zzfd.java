package com.google.android.gms.internal.recaptcha;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.gms.internal.recaptcha.zzds;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzey zzeyVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzeyVar, sb, 0);
        return sb.toString();
    }

    private static void zza(zzey zzeyVar, StringBuilder sb, int i) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzeyVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zza(sb, i, zza(concat), zzds.zza(method2, zzeyVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zza(sb, i, zza(concat2), zzds.zza(method3, zzeyVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object zza = zzds.zza(method4, zzeyVar, new Object[0]);
                    if (method5 == null) {
                        if (zza instanceof Boolean) {
                            if (((Boolean) zza).booleanValue()) {
                                zza(sb, i, zza(concat3), zza);
                            }
                        } else if (zza instanceof Integer) {
                            if (((Integer) zza).intValue() != 0) {
                                zza(sb, i, zza(concat3), zza);
                            }
                        } else if (zza instanceof Float) {
                            if (((Float) zza).floatValue() != 0.0f) {
                                zza(sb, i, zza(concat3), zza);
                            }
                        } else if (zza instanceof Double) {
                            if (((Double) zza).doubleValue() != 0.0d) {
                                zza(sb, i, zza(concat3), zza);
                            }
                        } else {
                            if (zza instanceof String) {
                                equals = zza.equals("");
                            } else if (zza instanceof zzch) {
                                equals = zza.equals(zzch.zza);
                            } else if (zza instanceof zzey) {
                                if (zza != ((zzey) zza).zzh()) {
                                    zza(sb, i, zza(concat3), zza);
                                }
                            } else {
                                if ((zza instanceof Enum) && ((Enum) zza).ordinal() == 0) {
                                }
                                zza(sb, i, zza(concat3), zza);
                            }
                            if (!equals) {
                                zza(sb, i, zza(concat3), zza);
                            }
                        }
                    } else if (((Boolean) zzds.zza(method5, zzeyVar, new Object[0])).booleanValue()) {
                        zza(sb, i, zza(concat3), zza);
                    }
                }
            }
        }
        if (zzeyVar instanceof zzds.zzb) {
            Iterator<Map.Entry<zzds.zze, Object>> zzd = ((zzds.zzb) zzeyVar).zzc.zzd();
            if (zzd.hasNext()) {
                zzd.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        zzgk zzgkVar = ((zzds) zzeyVar).zzb;
        if (zzgkVar != null) {
            zzgkVar.zza(sb, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zza(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zza(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzgd.zza(zzch.zza((String) obj)));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof zzch) {
                sb.append(": \"");
                sb.append(zzgd.zza((zzch) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof zzds) {
                sb.append(" {");
                zza((zzds) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                zza(sb, i4, SignupConstants.Error.DEBUG_FIELD_KEY, entry2.getKey());
                zza(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static final String zza(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
