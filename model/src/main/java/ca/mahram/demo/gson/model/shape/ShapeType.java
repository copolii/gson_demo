package ca.mahram.demo.gson.model.shape;

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
public enum ShapeType {
    CIRCLE,
    RECTANGLE,
    TRIANGLE;

    public static final ShapeTypeTypeAdapter adapter = new ShapeTypeTypeAdapter ();

    private static final class ShapeTypeTypeAdapter
      implements com.google.gson.JsonSerializer<ShapeType>,
                 JsonDeserializer<ShapeType> {

        @Override
        public ShapeType deserialize (final JsonElement json,
                                      final Type typeOfT,
                                      final JsonDeserializationContext context)
          throws JsonParseException {
            return ShapeType.values ()[json.getAsInt ()];
        }

        @Override
        public JsonElement serialize (final ShapeType src,
                                      final Type typeOfSrc,
                                      final JsonSerializationContext context) {
            return new JsonPrimitive (src.ordinal ());
        }
    }
}
