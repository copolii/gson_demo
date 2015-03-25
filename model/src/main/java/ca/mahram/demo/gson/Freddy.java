package ca.mahram.demo.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ca.mahram.demo.gson.model.shape.ShapeType;
import ca.mahram.demo.gson.model.task.TaskState;

/**
 Created by mahramf on 24/03/15.
 */
public class Freddy {
    private static Gson gson;

    static {
        final GsonBuilder builder = new GsonBuilder ();
        builder
          .excludeFieldsWithoutExposeAnnotation ()
             // register type adapters
          .registerTypeAdapter (ShapeType.class, ShapeType.adapter)
          .registerTypeAdapter (TaskState.class, TaskState.adapter)
        // register type adapter factories
        ;
        gson = builder.create ();
    }

    public static <T> T fromJson (final String json, final Class<T> type) {
        return gson.fromJson (json, type);
    }

    public static String toJson (final Object object) {
        return gson.toJson (object);
    }

    public static <T> String toJson (final Object object, final Class<T> type) {
        return gson.toJson (object, type);
    }
}
