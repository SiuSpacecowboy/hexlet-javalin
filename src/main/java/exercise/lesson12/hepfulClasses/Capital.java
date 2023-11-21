package exercise.lesson12.hepfulClasses;

import org.apache.commons.lang3.StringUtils;

public class Capital {

    public static String capitalNames(String name) {
        var s = String.valueOf(name.charAt(0));
        return StringUtils.replaceOnce(name, s, s.toUpperCase());
    }
}
