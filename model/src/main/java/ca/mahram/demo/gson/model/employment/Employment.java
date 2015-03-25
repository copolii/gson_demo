package ca.mahram.demo.gson.model.employment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static ca.mahram.demo.gson.model.JsonConstants.KEYS.EMPLOYEE_ID;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.EMPLOYER;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.FINISH_TIME;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.SALARY;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.START_TIME;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.TITLE;
import static ca.mahram.demo.gson.model.JsonConstants.VALUES.NOT_SET;

/**
 Created by mahramf on 24/03/15.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Employment {

    @Expose @SerializedName (EMPLOYER) private    String employer;
    @Expose @SerializedName (SALARY) private      int    salary;
    @Expose @SerializedName (TITLE) private       String title;
    @Expose @SerializedName (EMPLOYEE_ID) private String employeeId;

    @Expose @SerializedName (START_TIME) private long startTime;
    @Expose @SerializedName (FINISH_TIME) private long endTime = -1L;

    public boolean isCurrent () {
        return endTime == NOT_SET;
    }
}
