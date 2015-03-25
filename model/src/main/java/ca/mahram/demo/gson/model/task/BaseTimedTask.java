package ca.mahram.demo.gson.model.task;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;

import static ca.mahram.demo.gson.model.JsonConstants.KEYS.FINISH_TIME;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.START_BY;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.START_TIME;
import static ca.mahram.demo.gson.model.JsonConstants.VALUES.NOT_SET;

/**
 Created by mahramf on 24/03/15.
 */
@Getter @NoArgsConstructor
public abstract class BaseTimedTask
  extends AbstractTask {
    @Expose @SerializedName (START_BY)    long startByTime = NOT_SET;
    @Expose @SerializedName (START_TIME)  long startTime   = NOT_SET;
    @Expose @SerializedName (FINISH_TIME) long finishTime  = NOT_SET;
}
