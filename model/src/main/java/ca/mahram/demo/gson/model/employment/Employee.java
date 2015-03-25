package ca.mahram.demo.gson.model.employment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;

import static ca.mahram.demo.gson.model.JsonConstants.KEYS.EMPLOYMENT;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.ID;
import static ca.mahram.demo.gson.model.JsonConstants.KEYS.NAME;

/**
 Created by mahramf on 24/03/15.
 */
@Getter @Setter @NoArgsConstructor @Builder
public class Employee {
    @Expose @SerializedName (NAME) private                 String          name;
    @Expose @SerializedName (ID) private                   String          id;
    @Expose @SerializedName (EMPLOYMENT) @Singular private Set<Employment> jobs;
}
