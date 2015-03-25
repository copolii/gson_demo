package ca.mahram.demo.gson.model.task;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import ca.mahram.demo.gson.model.content.PhotoContent;
import lombok.Getter;
import lombok.Setter;

import static ca.mahram.demo.gson.model.JsonConstants.KEYS.CONTENT;

/**
 Created by mahramf on 24/03/15.
 */
public class TimedPhotoTask
  extends BaseTimedTask {
    @Getter @Setter @Expose @SerializedName (CONTENT) protected PhotoContent content;

    public String getPhotoUrl () {
        return content.getPhotoUri ();
    }
}
