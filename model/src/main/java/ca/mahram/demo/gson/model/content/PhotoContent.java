package ca.mahram.demo.gson.model.content;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static ca.mahram.demo.gson.model.JsonConstants.KEYS.PHOTO_URL;

/**
 Created by mahramf on 24/03/15.
 */
@Getter @Setter @NoArgsConstructor
public class PhotoContent
  extends BaseContent {
    @Expose @SerializedName (PHOTO_URL) private String photoUri;
}
