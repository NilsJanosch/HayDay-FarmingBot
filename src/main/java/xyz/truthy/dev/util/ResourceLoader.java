package xyz.truthy.dev.util;

import xyz.truthy.dev.Main;

import java.net.URL;

public class ResourceLoader {
    public static URL getResource(String resource){
        URL url ;

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if(classLoader != null){
            url = classLoader.getResource(resource);
            if(url != null){
                return url;
            }
        }

        classLoader = Main.class.getClassLoader();
        if(classLoader != null){
            url = classLoader.getResource(resource);
            if(url != null){
                return url;
            }
        }

        return ClassLoader.getSystemResource(resource);
    }
}
