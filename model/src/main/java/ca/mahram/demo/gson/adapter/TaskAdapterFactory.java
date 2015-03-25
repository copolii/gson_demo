package ca.mahram.demo.gson.adapter;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

import ca.mahram.demo.gson.model.shape.AbstractShape;
import ca.mahram.demo.gson.model.task.AbstractTask;

/**
 Created by mahramf on 24/03/15.
 */
public class TaskAdapterFactory
  implements TypeAdapterFactory {

    @Override public <T> TypeAdapter<T> create (final Gson gson, final TypeToken<T> type) {
        if (AbstractTask.class.isAssignableFrom (type.getRawType ()))
            return createTasksTypeAdapter (gson);

        if (AbstractShape.class.isAssignableFrom (type.getRawType ()))
            return createShpaesTypeAdapter (gson);

        return null;
    }

    private <T> TypeAdapter<T> createTasksTypeAdapter (final Gson gson) {
        return new TypeAdapter<T> () {

            @Override public void write (final JsonWriter out, final T value) throws IOException {
                gson.getDelegateAdapter (TaskAdapterFactory.this, TypeToken.get (AbstractTask.class))
                    .write (out, (AbstractTask) value);
            }

            @Override public T read (final JsonReader in) throws IOException {
                final JsonElement tree = Streams.parse (in);

                // TODO: determine type

                return null;
            }
        };
    }

    private <T> TypeAdapter<T> createShpaesTypeAdapter (final Gson gson) {
        return new TypeAdapter<T> () {

            @Override public void write (final JsonWriter out, final T value) throws IOException {
                gson.getDelegateAdapter (TaskAdapterFactory.this, TypeToken.get (AbstractShape.class))
                    .write (out, (AbstractShape) value);
            }

            @Override public T read (final JsonReader in) throws IOException {
                final JsonElement tree = Streams.parse (in);

                // TODO: determine type

                return null;
            }
        };
    }
}
