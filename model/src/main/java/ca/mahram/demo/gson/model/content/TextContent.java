package ca.mahram.demo.gson.model.content;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static ca.mahram.demo.gson.model.JsonConstants.KEYS.TEXT;

/**
 Created by mahramf on 24/03/15.
 */
@Getter @Setter @NoArgsConstructor
public class TextContent
  extends BaseContent {
    @Expose @SerializedName (TEXT) private String text;
}
