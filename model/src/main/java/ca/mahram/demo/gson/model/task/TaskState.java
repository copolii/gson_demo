package ca.mahram.demo.gson.model.task;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;

import java.lang.reflect.Type;

/**
 Created by mahramf on 24/03/15.
 */
public enum TaskState {
    NEW,
    IN_PROGRESS,
    CANCELLED,
    COMPLETE;

    public static final TaskStateTypeAdapter adapter = new TaskStateTypeAdapter ();

    private static final class TaskStateTypeAdapter
      implements com.google.gson.JsonSerializer<TaskState>,
                 JsonDeserializer<TaskState> {

        @Override
        public TaskState deserialize (final JsonElement json,
                                      final Type typeOfT,
                                      final JsonDeserializationContext context)
          throws JsonParseException {
            return TaskState.values ()[json.getAsInt ()];
        }

        @Override
        public JsonElement serialize (final TaskState src,
                                      final Type typeOfSrc,
                                      final JsonSerializationContext context) {
            return new JsonPrimitive (src.ordinal ());
        }
    }
}
