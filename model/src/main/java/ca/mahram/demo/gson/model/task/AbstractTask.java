package ca.mahram.demo.gson.model.task;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import ca.mahram.demo.gson.model.content.BaseContent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static ca.mahram.demo.gson.model.JsonConstants.KEYS.CREATED_TIME;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.DUE;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.ID;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.STATE;

/**
 Created by mahramf on 24/03/15.
 */
@Getter @NoArgsConstructor
public abstract class AbstractTask {

    @Expose @SerializedName (ID) private            String    id;
    @Expose @SerializedName (CREATED_TIME) private  long      createdTime;
    @Setter @Expose @SerializedName (DUE) private   long      dueTime;
    @Setter @Expose @SerializedName (STATE) private TaskState state;

    public abstract BaseContent getContent ();
}
